package typings.oojsUi.OO.ui

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typings.jquery.JQuery
import typings.oojs.OO.ArgTuple
import typings.oojs.OO.EventConnectionMap
import typings.oojs.OO.EventEmitter
import typings.oojs.OO.EventHandler
import typings.oojsUi.OO.ui.Toolbar.Props
import typings.oojsUi.OO.ui.Toolbar.Prototype
import typings.oojsUi.anon.PartialRecordkeyofEventMaResize
import typings.oojsUi.oojsUiStrings.active
import typings.oojsUi.oojsUiStrings.add
import typings.oojsUi.oojsUiStrings.bottom
import typings.oojsUi.oojsUiStrings.change
import typings.oojsUi.oojsUiStrings.clear
import typings.oojsUi.oojsUiStrings.move
import typings.oojsUi.oojsUiStrings.remove
import typings.oojsUi.oojsUiStrings.resize
import typings.oojsUi.oojsUiStrings.top
import typings.oojsUi.oojsUiStrings.updateState
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Toolbars are complex interface components that permit users to easily access a variety
  * of {@link OO.ui.Tool tools} (e.g., formatting commands) and actions, which are additional
  * commands that are part of the toolbar, but not configured as tools.
  *
  * Individual tools are customized and then registered with a
  * {@link OO.ui.ToolFactory tool factory}, which creates the tools on demand. Each tool has a
  * symbolic name (used when registering the tool), a title (e.g., ‘Insert image’), and an icon.
  *
  * Individual tools are organized in {@link OO.ui.ToolGroup toolgroups}, which can be
  * {@link OO.ui.MenuToolGroup menus} of tools, {@link OO.ui.ListToolGroup lists} of tools, or a
  * single {@link OO.ui.BarToolGroup bar} of tools. The arrangement and order of the toolgroups is
  * customized when the toolbar is set up. Tools can be presented in any order, but each can only
  * appear once in the toolbar.
  *
  * The toolbar can be synchronized with the state of the external "application", like a text
  * editor's editing area, marking tools as active/inactive (e.g. a 'bold' tool would be shown as
  * active when the text cursor was inside bolded text) or enabled/disabled (e.g. a table caption
  * tool would be disabled while the user is not editing a table). A state change is signalled by
  * emitting the {@link Toolbar.EventMap.updateState 'updateState' event}, which calls Tools'
  * {@link OO.ui.Tool.onUpdateState onUpdateState method}.
  *
  * The following is an example of a basic toolbar.
  *
  *     // Example of a toolbar
  *     // Create the toolbar
  *     var toolFactory = new OO.ui.ToolFactory();
  *     var toolGroupFactory = new OO.ui.ToolGroupFactory();
  *     var toolbar = new OO.ui.Toolbar( toolFactory, toolGroupFactory );
  *
  *     // We will be placing status text in this element when tools are used
  *     var $area = $( '<p>' ).text( 'Toolbar example' );
  *
  *     // Define the tools that we're going to place in our toolbar
  *
  *     // Create a class inheriting from OO.ui.Tool
  *     function SearchTool() {
  *         SearchTool.super.apply( this, arguments );
  *     }
  *     OO.inheritClass( SearchTool, OO.ui.Tool );
  *     // Each tool must have a 'name' (used as an internal identifier, see later) and at least one
  *     // of 'icon' and 'title' (displayed icon and text).
  *     SearchTool.static.name = 'search';
  *     SearchTool.static.icon = 'search';
  *     SearchTool.static.title = 'Search...';
  *     // Defines the action that will happen when this tool is selected (clicked).
  *     SearchTool.prototype.onSelect = function () {
  *         $area.text( 'Search tool clicked!' );
  *         // Never display this tool as "active" (selected).
  *         this.setActive( false );
  *     };
  *     SearchTool.prototype.onUpdateState = function () {};
  *     // Make this tool available in our toolFactory and thus our toolbar
  *     toolFactory.register( SearchTool );
  *
  *     // Register two more tools, nothing interesting here
  *     function SettingsTool() {
  *         SettingsTool.super.apply( this, arguments );
  *     }
  *     OO.inheritClass( SettingsTool, OO.ui.Tool );
  *     SettingsTool.static.name = 'settings';
  *     SettingsTool.static.icon = 'settings';
  *     SettingsTool.static.title = 'Change settings';
  *     SettingsTool.prototype.onSelect = function () {
  *         $area.text( 'Settings tool clicked!' );
  *         this.setActive( false );
  *     };
  *     SettingsTool.prototype.onUpdateState = function () {};
  *     toolFactory.register( SettingsTool );
  *
  *     // Register two more tools, nothing interesting here
  *     function StuffTool() {
  *         StuffTool.super.apply( this, arguments );
  *     }
  *     OO.inheritClass( StuffTool, OO.ui.Tool );
  *     StuffTool.static.name = 'stuff';
  *     StuffTool.static.icon = 'ellipsis';
  *     StuffTool.static.title = 'More stuff';
  *     StuffTool.prototype.onSelect = function () {
  *         $area.text( 'More stuff tool clicked!' );
  *         this.setActive( false );
  *     };
  *     StuffTool.prototype.onUpdateState = function () {};
  *     toolFactory.register( StuffTool );
  *
  *     // This is a PopupTool. Rather than having a custom 'onSelect' action, it will display a
  *     // little popup window (a PopupWidget).
  *     function HelpTool( toolGroup, config ) {
  *         OO.ui.PopupTool.call( this, toolGroup, $.extend( { popup: {
  *             padded: true,
  *             label: 'Help',
  *             head: true
  *         } }, config ) );
  *         this.popup.$body.append( '<p>I am helpful!</p>' );
  *     }
  *     OO.inheritClass( HelpTool, OO.ui.PopupTool );
  *     HelpTool.static.name = 'help';
  *     HelpTool.static.icon = 'help';
  *     HelpTool.static.title = 'Help';
  *     toolFactory.register( HelpTool );
  *
  *     // Finally define which tools and in what order appear in the toolbar. Each tool may only be
  *     // used once (but not all defined tools must be used).
  *     toolbar.setup( [
  *         {
  *             // 'bar' tool groups display tools' icons only, side-by-side.
  *             type: 'bar',
  *             include: [ 'search', 'help' ]
  *         },
  *         {
  *             // 'list' tool groups display both the titles and icons, in a dropdown list.
  *             type: 'list',
  *             indicator: 'down',
  *             label: 'More',
  *             include: [ 'settings', 'stuff' ]
  *         }
  *         // Note how the tools themselves are toolgroup-agnostic - the same tool can be displayed
  *         // either in a 'list' or a 'bar'. There is a 'menu' tool group too, not showcased here,
  *         // since it's more complicated to use. (See the next example snippet on this page.)
  *     ] );
  *
  *     // Create some UI around the toolbar and place it in the document
  *     var frame = new OO.ui.PanelLayout( {
  *         expanded: false,
  *         framed: true
  *     } );
  *     var contentFrame = new OO.ui.PanelLayout( {
  *         expanded: false,
  *         padded: true
  *     } );
  *     frame.$element.append(
  *         toolbar.$element,
  *         contentFrame.$element.append( $area )
  *     );
  *     $( document.body ).append( frame.$element );
  *
  *     // Here is where the toolbar is actually built. This must be done after inserting it into the
  *     // document.
  *     toolbar.initialize();
  *     toolbar.emit( 'updateState' );
  *
  * The following example extends the previous one to illustrate 'menu' toolgroups and the usage of
  * {@link Toolbar.EventMap.updateState 'updateState' event}.
  *
  *     // Create the toolbar
  *     var toolFactory = new OO.ui.ToolFactory();
  *     var toolGroupFactory = new OO.ui.ToolGroupFactory();
  *     var toolbar = new OO.ui.Toolbar( toolFactory, toolGroupFactory );
  *
  *     // We will be placing status text in this element when tools are used
  *     var $area = $( '<p>' ).text( 'Toolbar example' );
  *
  *     // Define the tools that we're going to place in our toolbar
  *
  *     // Create a class inheriting from OO.ui.Tool
  *     function SearchTool() {
  *         SearchTool.super.apply( this, arguments );
  *     }
  *     OO.inheritClass( SearchTool, OO.ui.Tool );
  *     // Each tool must have a 'name' (used as an internal identifier, see later) and at least one
  *     // of 'icon' and 'title' (displayed icon and text).
  *     SearchTool.static.name = 'search';
  *     SearchTool.static.icon = 'search';
  *     SearchTool.static.title = 'Search...';
  *     // Defines the action that will happen when this tool is selected (clicked).
  *     SearchTool.prototype.onSelect = function () {
  *         $area.text( 'Search tool clicked!' );
  *         // Never display this tool as "active" (selected).
  *         this.setActive( false );
  *     };
  *     SearchTool.prototype.onUpdateState = function () {};
  *     // Make this tool available in our toolFactory and thus our toolbar
  *     toolFactory.register( SearchTool );
  *
  *     // Register two more tools, nothing interesting here
  *     function SettingsTool() {
  *         SettingsTool.super.apply( this, arguments );
  *         this.reallyActive = false;
  *     }
  *     OO.inheritClass( SettingsTool, OO.ui.Tool );
  *     SettingsTool.static.name = 'settings';
  *     SettingsTool.static.icon = 'settings';
  *     SettingsTool.static.title = 'Change settings';
  *     SettingsTool.prototype.onSelect = function () {
  *         $area.text( 'Settings tool clicked!' );
  *         // Toggle the active state on each click
  *         this.reallyActive = !this.reallyActive;
  *         this.setActive( this.reallyActive );
  *         // To update the menu label
  *         this.toolbar.emit( 'updateState' );
  *     };
  *     SettingsTool.prototype.onUpdateState = function () {};
  *     toolFactory.register( SettingsTool );
  *
  *     // Register two more tools, nothing interesting here
  *     function StuffTool() {
  *         StuffTool.super.apply( this, arguments );
  *         this.reallyActive = false;
  *     }
  *     OO.inheritClass( StuffTool, OO.ui.Tool );
  *     StuffTool.static.name = 'stuff';
  *     StuffTool.static.icon = 'ellipsis';
  *     StuffTool.static.title = 'More stuff';
  *     StuffTool.prototype.onSelect = function () {
  *         $area.text( 'More stuff tool clicked!' );
  *         // Toggle the active state on each click
  *         this.reallyActive = !this.reallyActive;
  *         this.setActive( this.reallyActive );
  *         // To update the menu label
  *         this.toolbar.emit( 'updateState' );
  *     };
  *     StuffTool.prototype.onUpdateState = function () {};
  *     toolFactory.register( StuffTool );
  *
  *     // This is a PopupTool. Rather than having a custom 'onSelect' action, it will display a
  *     // little popup window (a PopupWidget). 'onUpdateState' is also already implemented.
  *     function HelpTool( toolGroup, config ) {
  *         OO.ui.PopupTool.call( this, toolGroup, $.extend( { popup: {
  *             padded: true,
  *             label: 'Help',
  *             head: true
  *         } }, config ) );
  *         this.popup.$body.append( '<p>I am helpful!</p>' );
  *     }
  *     OO.inheritClass( HelpTool, OO.ui.PopupTool );
  *     HelpTool.static.name = 'help';
  *     HelpTool.static.icon = 'help';
  *     HelpTool.static.title = 'Help';
  *     toolFactory.register( HelpTool );
  *
  *     // Finally define which tools and in what order appear in the toolbar. Each tool may only be
  *     // used once (but not all defined tools must be used).
  *     toolbar.setup( [
  *         {
  *             // 'bar' tool groups display tools' icons only, side-by-side.
  *             type: 'bar',
  *             include: [ 'search', 'help' ]
  *         },
  *         {
  *             // 'menu' tool groups display both the titles and icons, in a dropdown menu.
  *             // Menu label indicates which items are selected.
  *             type: 'menu',
  *             indicator: 'down',
  *             include: [ 'settings', 'stuff' ]
  *         }
  *     ] );
  *
  *     // Create some UI around the toolbar and place it in the document
  *     var frame = new OO.ui.PanelLayout( {
  *         expanded: false,
  *         framed: true
  *     } );
  *     var contentFrame = new OO.ui.PanelLayout( {
  *         expanded: false,
  *         padded: true
  *     } );
  *     frame.$element.append(
  *         toolbar.$element,
  *         contentFrame.$element.append( $area )
  *     );
  *     $( document.body ).append( frame.$element );
  *
  *     // Here is where the toolbar is actually built. This must be done after inserting it into the
  *     // document.
  *     toolbar.initialize();
  *     toolbar.emit( 'updateState' );
  *
  * ResourceLoader module: `oojs-ui-toolbars`
  *
  * @see https://doc.wikimedia.org/oojs-ui/master/js/#!/api/OO.ui.Toolbar
  */
@js.native
trait Toolbar
  extends StObject
     with Props
     with Prototype
object Toolbar {
  
  trait ConfigOptions
    extends StObject
       with typings.oojsUi.OO.ui.Element.ConfigOptions
       with typings.oojsUi.OO.ui.mixin.GroupElement.ConfigOptions {
    
    /**
      * An overlay for the popup.
      * See <https://www.mediawiki.org/wiki/OOUI/Concepts#Overlays>.
      */
    @JSName("$overlay")
    var $overlay: js.UndefOr[JQuery[HTMLElement]] = js.undefined
    
    /**
      * Add an actions section to the toolbar. Actions are commands that are
      * included in the toolbar, but are not configured as tools. By default, actions are
      * displayed on the right side of the toolbar.
      * This feature is deprecated. It is suggested to use the ToolGroup 'align' property
      * instead.
      *
      * @deprecated
      */
    var actions: js.UndefOr[Boolean] = js.undefined
    
    /** Whether the toolbar is positioned above ('top') or below ('bottom') content. */
    var position: js.UndefOr[top | bottom] = js.undefined
  }
  object ConfigOptions {
    
    inline def apply(): ConfigOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConfigOptions] (val x: Self) extends AnyVal {
      
      inline def set$overlay(value: JQuery[HTMLElement]): Self = StObject.set(x, "$overlay", value.asInstanceOf[js.Any])
      
      inline def set$overlayUndefined: Self = StObject.set(x, "$overlay", js.undefined)
      
      inline def setActions(value: Boolean): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
      
      inline def setPosition(value: top | bottom): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    }
  }
  
  @js.native
  trait Constructor
    extends StObject
       with /**
    * @param toolFactory Factory for creating tools
    * @param toolGroupFactory Factory for creating toolgroups
    * @param config Configuration options
    */
  Instantiable2[/* toolFactory */ ToolFactory, /* toolGroupFactory */ ToolGroupFactory, Toolbar]
       with Instantiable3[
          /* toolFactory */ ToolFactory, 
          /* toolGroupFactory */ ToolGroupFactory, 
          /* config */ ConfigOptions, 
          Toolbar
        ] {
    
    /** @deprecated Use `super` instead */
    var parent: typings.oojsUi.OO.ui.Element.Constructor = js.native
    
    var static: Static = js.native
    
    var `super`: typings.oojsUi.OO.ui.Element.Constructor = js.native
  }
  
  trait EventMap
    extends StObject
       with typings.oojsUi.OO.ui.mixin.GroupElement.EventMap {
    
    var active: js.Array[/* hasActive */ Boolean]
    
    var resize: js.Array[Any]
    
    var updateState: js.Array[/* data */ Any]
  }
  object EventMap {
    
    inline def apply(
      active: js.Array[/* hasActive */ Boolean],
      add: js.Tuple2[/* item */ EventEmitter, /* index */ Double],
      change: js.Array[/* items */ js.Array[Element]],
      clear: js.Array[Any],
      move: js.Tuple3[/* item */ EventEmitter, /* index */ Double, /* oldIndex */ Double],
      remove: js.Tuple2[/* item */ EventEmitter, /* index */ Double],
      resize: js.Array[Any],
      updateState: js.Array[/* data */ Any]
    ): EventMap = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], add = add.asInstanceOf[js.Any], change = change.asInstanceOf[js.Any], clear = clear.asInstanceOf[js.Any], move = move.asInstanceOf[js.Any], remove = remove.asInstanceOf[js.Any], resize = resize.asInstanceOf[js.Any], updateState = updateState.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventMap]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EventMap] (val x: Self) extends AnyVal {
      
      inline def setActive(value: js.Array[/* hasActive */ Boolean]): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveVarargs(value: (/* hasActive */ Boolean)*): Self = StObject.set(x, "active", js.Array(value*))
      
      inline def setResize(value: js.Array[Any]): Self = StObject.set(x, "resize", value.asInstanceOf[js.Any])
      
      inline def setResizeVarargs(value: Any*): Self = StObject.set(x, "resize", js.Array(value*))
      
      inline def setUpdateState(value: js.Array[/* data */ Any]): Self = StObject.set(x, "updateState", value.asInstanceOf[js.Any])
      
      inline def setUpdateStateVarargs(value: (/* data */ Any)*): Self = StObject.set(x, "updateState", js.Array(value*))
    }
  }
  
  trait Props
    extends StObject
       with typings.oojsUi.OO.ui.Element.Props
       with typings.oojsUi.OO.ui.mixin.GroupElement.Props {
    
    @JSName("$actions")
    var $actions: JQuery[HTMLElement]
    
    @JSName("$after")
    var $after: JQuery[HTMLElement]
    
    @JSName("$bar")
    var $bar: JQuery[HTMLElement]
    
    @JSName("$overlay")
    var $overlay: JQuery[HTMLElement]
    
    @JSName("$popups")
    var $popups: JQuery[HTMLElement]
  }
  object Props {
    
    inline def apply(
      $actions: JQuery[HTMLElement],
      $after: JQuery[HTMLElement],
      $bar: JQuery[HTMLElement],
      $element: JQuery[HTMLElement],
      $group: JQuery[HTMLElement],
      $overlay: JQuery[HTMLElement],
      $popups: JQuery[HTMLElement]
    ): Props = {
      val __obj = js.Dynamic.literal($actions = $actions.asInstanceOf[js.Any], $after = $after.asInstanceOf[js.Any], $bar = $bar.asInstanceOf[js.Any], $element = $element.asInstanceOf[js.Any], $group = $group.asInstanceOf[js.Any], $overlay = $overlay.asInstanceOf[js.Any], $popups = $popups.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      inline def set$actions(value: JQuery[HTMLElement]): Self = StObject.set(x, "$actions", value.asInstanceOf[js.Any])
      
      inline def set$after(value: JQuery[HTMLElement]): Self = StObject.set(x, "$after", value.asInstanceOf[js.Any])
      
      inline def set$bar(value: JQuery[HTMLElement]): Self = StObject.set(x, "$bar", value.asInstanceOf[js.Any])
      
      inline def set$overlay(value: JQuery[HTMLElement]): Self = StObject.set(x, "$overlay", value.asInstanceOf[js.Any])
      
      inline def set$popups(value: JQuery[HTMLElement]): Self = StObject.set(x, "$popups", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Prototype
    extends StObject
       with typings.oojsUi.OO.ui.Element.Prototype
       with EventEmitter {
    
    def connect[T /* <: PartialRecordkeyofEventMaResize */, C](context: C, methods: EventConnectionMap[T, C, EventMap]): this.type = js.native
    
    /**
      * Destroy the toolbar.
      *
      * Destroying the toolbar removes all event handlers and DOM elements that constitute the toolbar.
      * Call this method whenever you are done using a toolbar.
      */
    def destroy(): Unit = js.native
    
    def disconnect[T /* <: PartialRecordkeyofEventMaResize */, C](context: C, methods: EventConnectionMap[T, C, EventMap]): this.type = js.native
    
    def emit[K /* <: String */](
      event: /* import warning: importer.ImportType#apply Failed type conversion: K extends 'updateState' | 'active' | 'resize' ? never : K */ js.Any,
      args: Any*
    ): Boolean = js.native
    
    def emitThrow[K /* <: String */](
      event: /* import warning: importer.ImportType#apply Failed type conversion: K extends 'updateState' | 'active' | 'resize' ? never : K */ js.Any,
      args: Any*
    ): Boolean = js.native
    @JSName("emitThrow")
    def emitThrow_active(
      event: active,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventMap[K] is not an array type */ args: js.Array[/* hasActive */ Boolean]
    ): Boolean = js.native
    @JSName("emitThrow")
    def emitThrow_add(
      event: add,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventMap[K] is not an array type */ args: js.Tuple2[/* item */ EventEmitter, /* index */ Double]
    ): Boolean = js.native
    @JSName("emitThrow")
    def emitThrow_change(
      event: change,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventMap[K] is not an array type */ args: js.Array[/* items */ js.Array[Element]]
    ): Boolean = js.native
    @JSName("emitThrow")
    def emitThrow_clear(
      event: clear,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventMap[K] is not an array type */ args: js.Array[Any]
    ): Boolean = js.native
    @JSName("emitThrow")
    def emitThrow_move(
      event: move,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventMap[K] is not an array type */ args: js.Tuple3[/* item */ EventEmitter, /* index */ Double, /* oldIndex */ Double]
    ): Boolean = js.native
    @JSName("emitThrow")
    def emitThrow_remove(
      event: remove,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventMap[K] is not an array type */ args: js.Tuple2[/* item */ EventEmitter, /* index */ Double]
    ): Boolean = js.native
    @JSName("emitThrow")
    def emitThrow_resize(
      event: resize,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventMap[K] is not an array type */ args: js.Array[Any]
    ): Boolean = js.native
    @JSName("emitThrow")
    def emitThrow_updateState(
      event: updateState,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventMap[K] is not an array type */ args: js.Array[/* data */ Any]
    ): Boolean = js.native
    
    @JSName("emit")
    def emit_active(
      event: active,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventMap[K] is not an array type */ args: js.Array[/* hasActive */ Boolean]
    ): Boolean = js.native
    @JSName("emit")
    def emit_add(
      event: add,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventMap[K] is not an array type */ args: js.Tuple2[/* item */ EventEmitter, /* index */ Double]
    ): Boolean = js.native
    @JSName("emit")
    def emit_change(
      event: change,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventMap[K] is not an array type */ args: js.Array[/* items */ js.Array[Element]]
    ): Boolean = js.native
    @JSName("emit")
    def emit_clear(
      event: clear,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventMap[K] is not an array type */ args: js.Array[Any]
    ): Boolean = js.native
    @JSName("emit")
    def emit_move(
      event: move,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventMap[K] is not an array type */ args: js.Tuple3[/* item */ EventEmitter, /* index */ Double, /* oldIndex */ Double]
    ): Boolean = js.native
    @JSName("emit")
    def emit_remove(
      event: remove,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventMap[K] is not an array type */ args: js.Tuple2[/* item */ EventEmitter, /* index */ Double]
    ): Boolean = js.native
    @JSName("emit")
    def emit_resize(
      event: resize,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventMap[K] is not an array type */ args: js.Array[Any]
    ): Boolean = js.native
    @JSName("emit")
    def emit_updateState(
      event: updateState,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventMap[K] is not an array type */ args: js.Array[/* data */ Any]
    ): Boolean = js.native
    
    /**
      * Get accelerator label for tool.
      *
      * The OOUI library does not contain an accelerator system, but this is the hook for one. To
      * use an accelerator system, subclass the toolbar and override this method, which is meant to
      * return a label that describes the accelerator keys for the tool passed (by symbolic name) to
      * the method.
      *
      * @param name Symbolic name of tool
      * @return Tool accelerator label if available
      */
    def getToolAccelerator(name: String): js.UndefOr[String] = js.native
    
    /**
      * Get the tool factory.
      *
      * @return Tool factory
      */
    def getToolFactory(): ToolFactory = js.native
    
    /**
      * Get a toolgroup by name
      *
      * @param name Group name
      * @return Tool group, or null if none found by that name
      */
    def getToolGroupByName(name: String): ToolGroup | Null = js.native
    
    /**
      * Get the toolgroup factory.
      *
      * @return Toolgroup factory
      */
    def getToolGroupFactory(): ToolGroupFactory = js.native
    
    /**
      * Sets up handles and preloads required information for the toolbar to work.
      * This must be called after it is attached to a visible document and before doing anything else.
      */
    def initialize(): Unit = js.native
    
    def insertItemElements(itemWidget: Element, index: Double): Unit = js.native
    
    /**
      * Check if the toolbar is in narrow mode
      *
      * @return Toolbar is in narrow mode
      */
    def isNarrow(): Boolean = js.native
    
    /**
      * Check if the tool is available.
      *
      * Available tools are ones that have not yet been added to the toolbar.
      *
      * @param name Symbolic name of tool
      * @return Tool is available
      */
    def isToolAvailable(name: String): Boolean = js.native
    
    def off[K /* <: String */, C](
      event: /* import warning: importer.ImportType#apply Failed type conversion: K extends 'updateState' | 'active' | 'resize' ? never : K */ js.Any
    ): this.type = js.native
    def off[K /* <: String */, C](
      event: /* import warning: importer.ImportType#apply Failed type conversion: K extends 'updateState' | 'active' | 'resize' ? never : K */ js.Any,
      method: Unit,
      context: C
    ): this.type = js.native
    def off[K /* <: String */, C](
      event: /* import warning: importer.ImportType#apply Failed type conversion: K extends 'updateState' | 'active' | 'resize' ? never : K */ js.Any,
      method: EventHandler[C, js.ThisFunction1[/* this */ C, /* repeated */ Any, Unit]]
    ): this.type = js.native
    def off[K /* <: String */, C](
      event: /* import warning: importer.ImportType#apply Failed type conversion: K extends 'updateState' | 'active' | 'resize' ? never : K */ js.Any,
      method: EventHandler[C, js.ThisFunction1[/* this */ C, /* repeated */ Any, Unit]],
      context: C
    ): this.type = js.native
    @JSName("off")
    def off_active[C](event: active): this.type = js.native
    @JSName("off")
    def off_active[C](event: active, method: Unit, context: C): this.type = js.native
    @JSName("off")
    def off_active[C](
      event: active,
      method: EventHandler[
          C, 
          js.ThisFunction1[/* this */ C, /* args */ js.Array[/* hasActive */ Boolean], Unit]
        ]
    ): this.type = js.native
    @JSName("off")
    def off_active[C](
      event: active,
      method: EventHandler[
          C, 
          js.ThisFunction1[/* this */ C, /* args */ js.Array[/* hasActive */ Boolean], Unit]
        ],
      context: C
    ): this.type = js.native
    @JSName("off")
    def off_add[C](event: add): this.type = js.native
    @JSName("off")
    def off_add[C](event: add, method: Unit, context: C): this.type = js.native
    @JSName("off")
    def off_add[C](
      event: add,
      method: EventHandler[
          C, 
          js.ThisFunction1[
            /* this */ C, 
            /* args */ js.Tuple2[/* item */ EventEmitter, /* index */ Double], 
            Unit
          ]
        ]
    ): this.type = js.native
    @JSName("off")
    def off_add[C](
      event: add,
      method: EventHandler[
          C, 
          js.ThisFunction1[
            /* this */ C, 
            /* args */ js.Tuple2[/* item */ EventEmitter, /* index */ Double], 
            Unit
          ]
        ],
      context: C
    ): this.type = js.native
    @JSName("off")
    def off_change[C](event: change): this.type = js.native
    @JSName("off")
    def off_change[C](event: change, method: Unit, context: C): this.type = js.native
    @JSName("off")
    def off_change[C](
      event: change,
      method: EventHandler[
          C, 
          js.ThisFunction1[/* this */ C, /* args */ js.Array[/* items */ js.Array[Element]], Unit]
        ]
    ): this.type = js.native
    @JSName("off")
    def off_change[C](
      event: change,
      method: EventHandler[
          C, 
          js.ThisFunction1[/* this */ C, /* args */ js.Array[/* items */ js.Array[Element]], Unit]
        ],
      context: C
    ): this.type = js.native
    @JSName("off")
    def off_clear[C](event: clear): this.type = js.native
    @JSName("off")
    def off_clear[C](event: clear, method: Unit, context: C): this.type = js.native
    @JSName("off")
    def off_clear[C](
      event: clear,
      method: EventHandler[C, js.ThisFunction1[/* this */ C, /* args */ js.Array[Any], Unit]]
    ): this.type = js.native
    @JSName("off")
    def off_clear[C](
      event: clear,
      method: EventHandler[C, js.ThisFunction1[/* this */ C, /* args */ js.Array[Any], Unit]],
      context: C
    ): this.type = js.native
    @JSName("off")
    def off_move[C](event: move): this.type = js.native
    @JSName("off")
    def off_move[C](event: move, method: Unit, context: C): this.type = js.native
    @JSName("off")
    def off_move[C](
      event: move,
      method: EventHandler[
          C, 
          js.ThisFunction1[
            /* this */ C, 
            /* args */ js.Tuple3[/* item */ EventEmitter, /* index */ Double, /* oldIndex */ Double], 
            Unit
          ]
        ]
    ): this.type = js.native
    @JSName("off")
    def off_move[C](
      event: move,
      method: EventHandler[
          C, 
          js.ThisFunction1[
            /* this */ C, 
            /* args */ js.Tuple3[/* item */ EventEmitter, /* index */ Double, /* oldIndex */ Double], 
            Unit
          ]
        ],
      context: C
    ): this.type = js.native
    @JSName("off")
    def off_remove[C](event: remove): this.type = js.native
    @JSName("off")
    def off_remove[C](event: remove, method: Unit, context: C): this.type = js.native
    @JSName("off")
    def off_remove[C](
      event: remove,
      method: EventHandler[
          C, 
          js.ThisFunction1[
            /* this */ C, 
            /* args */ js.Tuple2[/* item */ EventEmitter, /* index */ Double], 
            Unit
          ]
        ]
    ): this.type = js.native
    @JSName("off")
    def off_remove[C](
      event: remove,
      method: EventHandler[
          C, 
          js.ThisFunction1[
            /* this */ C, 
            /* args */ js.Tuple2[/* item */ EventEmitter, /* index */ Double], 
            Unit
          ]
        ],
      context: C
    ): this.type = js.native
    @JSName("off")
    def off_resize[C](event: resize): this.type = js.native
    @JSName("off")
    def off_resize[C](event: resize, method: Unit, context: C): this.type = js.native
    @JSName("off")
    def off_resize[C](
      event: resize,
      method: EventHandler[C, js.ThisFunction1[/* this */ C, /* args */ js.Array[Any], Unit]]
    ): this.type = js.native
    @JSName("off")
    def off_resize[C](
      event: resize,
      method: EventHandler[C, js.ThisFunction1[/* this */ C, /* args */ js.Array[Any], Unit]],
      context: C
    ): this.type = js.native
    @JSName("off")
    def off_updateState[C](event: updateState): this.type = js.native
    @JSName("off")
    def off_updateState[C](event: updateState, method: Unit, context: C): this.type = js.native
    @JSName("off")
    def off_updateState[C](
      event: updateState,
      method: EventHandler[C, js.ThisFunction1[/* this */ C, /* args */ js.Array[/* data */ Any], Unit]]
    ): this.type = js.native
    @JSName("off")
    def off_updateState[C](
      event: updateState,
      method: EventHandler[C, js.ThisFunction1[/* this */ C, /* args */ js.Array[/* data */ Any], Unit]],
      context: C
    ): this.type = js.native
    
    def on[K /* <: String */, C](
      event: /* import warning: importer.ImportType#apply Failed type conversion: K extends 'updateState' | 'active' | 'resize' ? never : K */ js.Any,
      method: EventHandler[C, js.ThisFunction1[/* this */ C, /* repeated */ Any, Unit]]
    ): this.type = js.native
    def on[K /* <: String */, C](
      event: /* import warning: importer.ImportType#apply Failed type conversion: K extends 'updateState' | 'active' | 'resize' ? never : K */ js.Any,
      method: EventHandler[C, js.ThisFunction1[/* this */ C, /* repeated */ Any, Unit]],
      args: js.Array[Any]
    ): this.type = js.native
    def on[K /* <: String */, C](
      event: /* import warning: importer.ImportType#apply Failed type conversion: K extends 'updateState' | 'active' | 'resize' ? never : K */ js.Any,
      method: EventHandler[C, js.ThisFunction1[/* this */ C, /* repeated */ Any, Unit]],
      args: js.Array[Any],
      context: C
    ): this.type = js.native
    def on[K /* <: String */, C](
      event: /* import warning: importer.ImportType#apply Failed type conversion: K extends 'updateState' | 'active' | 'resize' ? never : K */ js.Any,
      method: EventHandler[C, js.ThisFunction1[/* this */ C, /* repeated */ Any, Unit]],
      args: Unit,
      context: C
    ): this.type = js.native
    
    /**
      * Handle active events from tool groups
      *
      * @param active Tool group has become active, inactive if false
      */
    def onToolGroupActive(active: Boolean): Unit = js.native
    
    @JSName("on")
    def on_active[A /* <: ArgTuple */, C](
      event: active,
      method: EventHandler[
          C, 
          js.ThisFunction1[
            /* this */ C, 
            /* import warning: importer.ImportType#apply c repeated non-array type: A */ /* args */ js.Array[A], 
            Unit
          ]
        ]
    ): this.type = js.native
    @JSName("on")
    def on_active[A /* <: ArgTuple */, C](
      event: active,
      method: EventHandler[
          C, 
          js.ThisFunction1[
            /* this */ C, 
            /* import warning: importer.ImportType#apply c repeated non-array type: A */ /* args */ js.Array[A], 
            Unit
          ]
        ],
      args: A
    ): this.type = js.native
    @JSName("on")
    def on_active[A /* <: ArgTuple */, C](
      event: active,
      method: EventHandler[
          C, 
          js.ThisFunction1[
            /* this */ C, 
            /* import warning: importer.ImportType#apply c repeated non-array type: A */ /* args */ js.Array[A], 
            Unit
          ]
        ],
      args: A,
      context: C
    ): this.type = js.native
    @JSName("on")
    def on_active[A /* <: ArgTuple */, C](
      event: active,
      method: EventHandler[
          C, 
          js.ThisFunction1[
            /* this */ C, 
            /* import warning: importer.ImportType#apply c repeated non-array type: A */ /* args */ js.Array[A], 
            Unit
          ]
        ],
      args: Unit,
      context: C
    ): this.type = js.native
    @JSName("on")
    def on_add[A /* <: ArgTuple */, C](
      event: add,
      method: EventHandler[
          C, 
          js.ThisFunction1[
            /* this */ C, 
            /* import warning: importer.ImportType#apply c repeated non-array type: A */ /* args */ js.Array[A], 
            Unit
          ]
        ]
    ): this.type = js.native
    @JSName("on")
    def on_add[A /* <: ArgTuple */, C](
      event: add,
      method: EventHandler[
          C, 
          js.ThisFunction1[
            /* this */ C, 
            /* import warning: importer.ImportType#apply c repeated non-array type: A */ /* args */ js.Array[A], 
            Unit
          ]
        ],
      args: A
    ): this.type = js.native
    @JSName("on")
    def on_add[A /* <: ArgTuple */, C](
      event: add,
      method: EventHandler[
          C, 
          js.ThisFunction1[
            /* this */ C, 
            /* import warning: importer.ImportType#apply c repeated non-array type: A */ /* args */ js.Array[A], 
            Unit
          ]
        ],
      args: A,
      context: C
    ): this.type = js.native
    @JSName("on")
    def on_add[A /* <: ArgTuple */, C](
      event: add,
      method: EventHandler[
          C, 
          js.ThisFunction1[
            /* this */ C, 
            /* import warning: importer.ImportType#apply c repeated non-array type: A */ /* args */ js.Array[A], 
            Unit
          ]
        ],
      args: Unit,
      context: C
    ): this.type = js.native
    @JSName("on")
    def on_change[A /* <: ArgTuple */, C](
      event: change,
      method: EventHandler[
          C, 
          js.ThisFunction1[
            /* this */ C, 
            /* import warning: importer.ImportType#apply c repeated non-array type: A */ /* args */ js.Array[A], 
            Unit
          ]
        ]
    ): this.type = js.native
    @JSName("on")
    def on_change[A /* <: ArgTuple */, C](
      event: change,
      method: EventHandler[
          C, 
          js.ThisFunction1[
            /* this */ C, 
            /* import warning: importer.ImportType#apply c repeated non-array type: A */ /* args */ js.Array[A], 
            Unit
          ]
        ],
      args: A
    ): this.type = js.native
    @JSName("on")
    def on_change[A /* <: ArgTuple */, C](
      event: change,
      method: EventHandler[
          C, 
          js.ThisFunction1[
            /* this */ C, 
            /* import warning: importer.ImportType#apply c repeated non-array type: A */ /* args */ js.Array[A], 
            Unit
          ]
        ],
      args: A,
      context: C
    ): this.type = js.native
    @JSName("on")
    def on_change[A /* <: ArgTuple */, C](
      event: change,
      method: EventHandler[
          C, 
          js.ThisFunction1[
            /* this */ C, 
            /* import warning: importer.ImportType#apply c repeated non-array type: A */ /* args */ js.Array[A], 
            Unit
          ]
        ],
      args: Unit,
      context: C
    ): this.type = js.native
    @JSName("on")
    def on_clear[A /* <: ArgTuple */, C](
      event: clear,
      method: EventHandler[
          C, 
          js.ThisFunction1[
            /* this */ C, 
            /* import warning: importer.ImportType#apply c repeated non-array type: A */ /* args */ js.Array[A], 
            Unit
          ]
        ]
    ): this.type = js.native
    @JSName("on")
    def on_clear[A /* <: ArgTuple */, C](
      event: clear,
      method: EventHandler[
          C, 
          js.ThisFunction1[
            /* this */ C, 
            /* import warning: importer.ImportType#apply c repeated non-array type: A */ /* args */ js.Array[A], 
            Unit
          ]
        ],
      args: A
    ): this.type = js.native
    @JSName("on")
    def on_clear[A /* <: ArgTuple */, C](
      event: clear,
      method: EventHandler[
          C, 
          js.ThisFunction1[
            /* this */ C, 
            /* import warning: importer.ImportType#apply c repeated non-array type: A */ /* args */ js.Array[A], 
            Unit
          ]
        ],
      args: A,
      context: C
    ): this.type = js.native
    @JSName("on")
    def on_clear[A /* <: ArgTuple */, C](
      event: clear,
      method: EventHandler[
          C, 
          js.ThisFunction1[
            /* this */ C, 
            /* import warning: importer.ImportType#apply c repeated non-array type: A */ /* args */ js.Array[A], 
            Unit
          ]
        ],
      args: Unit,
      context: C
    ): this.type = js.native
    @JSName("on")
    def on_move[A /* <: ArgTuple */, C](
      event: move,
      method: EventHandler[
          C, 
          js.ThisFunction1[
            /* this */ C, 
            /* import warning: importer.ImportType#apply c repeated non-array type: A */ /* args */ js.Array[A], 
            Unit
          ]
        ]
    ): this.type = js.native
    @JSName("on")
    def on_move[A /* <: ArgTuple */, C](
      event: move,
      method: EventHandler[
          C, 
          js.ThisFunction1[
            /* this */ C, 
            /* import warning: importer.ImportType#apply c repeated non-array type: A */ /* args */ js.Array[A], 
            Unit
          ]
        ],
      args: A
    ): this.type = js.native
    @JSName("on")
    def on_move[A /* <: ArgTuple */, C](
      event: move,
      method: EventHandler[
          C, 
          js.ThisFunction1[
            /* this */ C, 
            /* import warning: importer.ImportType#apply c repeated non-array type: A */ /* args */ js.Array[A], 
            Unit
          ]
        ],
      args: A,
      context: C
    ): this.type = js.native
    @JSName("on")
    def on_move[A /* <: ArgTuple */, C](
      event: move,
      method: EventHandler[
          C, 
          js.ThisFunction1[
            /* this */ C, 
            /* import warning: importer.ImportType#apply c repeated non-array type: A */ /* args */ js.Array[A], 
            Unit
          ]
        ],
      args: Unit,
      context: C
    ): this.type = js.native
    @JSName("on")
    def on_remove[A /* <: ArgTuple */, C](
      event: remove,
      method: EventHandler[
          C, 
          js.ThisFunction1[
            /* this */ C, 
            /* import warning: importer.ImportType#apply c repeated non-array type: A */ /* args */ js.Array[A], 
            Unit
          ]
        ]
    ): this.type = js.native
    @JSName("on")
    def on_remove[A /* <: ArgTuple */, C](
      event: remove,
      method: EventHandler[
          C, 
          js.ThisFunction1[
            /* this */ C, 
            /* import warning: importer.ImportType#apply c repeated non-array type: A */ /* args */ js.Array[A], 
            Unit
          ]
        ],
      args: A
    ): this.type = js.native
    @JSName("on")
    def on_remove[A /* <: ArgTuple */, C](
      event: remove,
      method: EventHandler[
          C, 
          js.ThisFunction1[
            /* this */ C, 
            /* import warning: importer.ImportType#apply c repeated non-array type: A */ /* args */ js.Array[A], 
            Unit
          ]
        ],
      args: A,
      context: C
    ): this.type = js.native
    @JSName("on")
    def on_remove[A /* <: ArgTuple */, C](
      event: remove,
      method: EventHandler[
          C, 
          js.ThisFunction1[
            /* this */ C, 
            /* import warning: importer.ImportType#apply c repeated non-array type: A */ /* args */ js.Array[A], 
            Unit
          ]
        ],
      args: Unit,
      context: C
    ): this.type = js.native
    @JSName("on")
    def on_resize[A /* <: ArgTuple */, C](
      event: resize,
      method: EventHandler[
          C, 
          js.ThisFunction1[
            /* this */ C, 
            /* import warning: importer.ImportType#apply c repeated non-array type: A */ /* args */ js.Array[A], 
            Unit
          ]
        ]
    ): this.type = js.native
    @JSName("on")
    def on_resize[A /* <: ArgTuple */, C](
      event: resize,
      method: EventHandler[
          C, 
          js.ThisFunction1[
            /* this */ C, 
            /* import warning: importer.ImportType#apply c repeated non-array type: A */ /* args */ js.Array[A], 
            Unit
          ]
        ],
      args: A
    ): this.type = js.native
    @JSName("on")
    def on_resize[A /* <: ArgTuple */, C](
      event: resize,
      method: EventHandler[
          C, 
          js.ThisFunction1[
            /* this */ C, 
            /* import warning: importer.ImportType#apply c repeated non-array type: A */ /* args */ js.Array[A], 
            Unit
          ]
        ],
      args: A,
      context: C
    ): this.type = js.native
    @JSName("on")
    def on_resize[A /* <: ArgTuple */, C](
      event: resize,
      method: EventHandler[
          C, 
          js.ThisFunction1[
            /* this */ C, 
            /* import warning: importer.ImportType#apply c repeated non-array type: A */ /* args */ js.Array[A], 
            Unit
          ]
        ],
      args: Unit,
      context: C
    ): this.type = js.native
    // #region EventEmitter overloads
    @JSName("on")
    def on_updateState[A /* <: ArgTuple */, C](
      event: updateState,
      method: EventHandler[
          C, 
          js.ThisFunction1[
            /* this */ C, 
            /* import warning: importer.ImportType#apply c repeated non-array type: A */ /* args */ js.Array[A], 
            Unit
          ]
        ]
    ): this.type = js.native
    @JSName("on")
    def on_updateState[A /* <: ArgTuple */, C](
      event: updateState,
      method: EventHandler[
          C, 
          js.ThisFunction1[
            /* this */ C, 
            /* import warning: importer.ImportType#apply c repeated non-array type: A */ /* args */ js.Array[A], 
            Unit
          ]
        ],
      args: A
    ): this.type = js.native
    @JSName("on")
    def on_updateState[A /* <: ArgTuple */, C](
      event: updateState,
      method: EventHandler[
          C, 
          js.ThisFunction1[
            /* this */ C, 
            /* import warning: importer.ImportType#apply c repeated non-array type: A */ /* args */ js.Array[A], 
            Unit
          ]
        ],
      args: A,
      context: C
    ): this.type = js.native
    @JSName("on")
    def on_updateState[A /* <: ArgTuple */, C](
      event: updateState,
      method: EventHandler[
          C, 
          js.ThisFunction1[
            /* this */ C, 
            /* import warning: importer.ImportType#apply c repeated non-array type: A */ /* args */ js.Array[A], 
            Unit
          ]
        ],
      args: Unit,
      context: C
    ): this.type = js.native
    
    def once[K /* <: String */](
      event: /* import warning: importer.ImportType#apply Failed type conversion: K extends 'updateState' | 'active' | 'resize' ? never : K */ js.Any,
      listener: js.ThisFunction1[/* this */ Null, /* repeated */ Any, Unit]
    ): this.type = js.native
    @JSName("once")
    def once_active(
      event: active,
      listener: js.ThisFunction1[/* this */ Null, /* args */ js.Array[/* hasActive */ Boolean], Unit]
    ): this.type = js.native
    @JSName("once")
    def once_add(
      event: add,
      listener: js.ThisFunction1[
          /* this */ Null, 
          /* args */ js.Tuple2[/* item */ EventEmitter, /* index */ Double], 
          Unit
        ]
    ): this.type = js.native
    @JSName("once")
    def once_change(
      event: change,
      listener: js.ThisFunction1[/* this */ Null, /* args */ js.Array[/* items */ js.Array[Element]], Unit]
    ): this.type = js.native
    @JSName("once")
    def once_clear(event: clear, listener: js.ThisFunction1[/* this */ Null, /* args */ js.Array[Any], Unit]): this.type = js.native
    @JSName("once")
    def once_move(
      event: move,
      listener: js.ThisFunction1[
          /* this */ Null, 
          /* args */ js.Tuple3[/* item */ EventEmitter, /* index */ Double, /* oldIndex */ Double], 
          Unit
        ]
    ): this.type = js.native
    @JSName("once")
    def once_remove(
      event: remove,
      listener: js.ThisFunction1[
          /* this */ Null, 
          /* args */ js.Tuple2[/* item */ EventEmitter, /* index */ Double], 
          Unit
        ]
    ): this.type = js.native
    @JSName("once")
    def once_resize(event: resize, listener: js.ThisFunction1[/* this */ Null, /* args */ js.Array[Any], Unit]): this.type = js.native
    @JSName("once")
    def once_updateState(
      event: updateState,
      listener: js.ThisFunction1[/* this */ Null, /* args */ js.Array[/* data */ Any], Unit]
    ): this.type = js.native
    
    /**
      * Allow tool to be used again.
      *
      * @param tool Tool to release
      */
    def releaseTool(tool: Tool): Unit = js.native
    
    /**
      * Prevent tool from being used again.
      *
      * @param tool Tool to reserve
      */
    def reserveTool(tool: Tool): Unit = js.native
    
    /**
      * Remove all tools and toolgroups from the toolbar.
      */
    def reset(): Unit = js.native
    
    /**
      * Set the narrow mode flag
      *
      * @param narrow Toolbar is in narrow mode
      */
    def setNarrow(narrow: Boolean): Unit = js.native
    
    /**
      * Set up the toolbar.
      *
      * The toolbar is set up with a list of toolgroup configurations that specify the type of
      * toolgroup ({@link OO.ui.BarToolGroup bar}, {@link OO.ui.MenuToolGroup menu}, or
      * {@link OO.ui.ListToolGroup list}) to add and which tools to include, exclude, promote, or demote
      * within that toolgroup. Please see {@link OO.ui.ToolGroup toolgroups} for more information about
      * including tools in toolgroups.
      *
      * @param groups List of toolgroup configurations
      */
    def setup(groups: js.Array[ToolGroupSetupMap]): Unit = js.native
  }
  
  type Static = typings.oojsUi.OO.ui.Element.Static
  
  trait ToolGroupSetupMap
    extends StObject
       with typings.oojsUi.OO.ui.ToolGroup.ConfigOptions {
    
    /** Symbolic name for this toolgroup */
    var name: String
    
    /**
      * Toolgroup type, e.g. "bar", "list", or "menu". Should exist in the
      * {@link OO.ui.ToolGroupFactory} provided via the constructor. Defaults to "list" for
      * catch-all groups where `include='*'`, otherwise "bar".
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object ToolGroupSetupMap {
    
    inline def apply(name: String): ToolGroupSetupMap = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ToolGroupSetupMap]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ToolGroupSetupMap] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
