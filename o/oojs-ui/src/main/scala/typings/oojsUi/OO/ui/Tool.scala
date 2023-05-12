package typings.oojsUi.OO.ui

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.jquery.JQuery
import typings.oojs.OO.ArgTuple
import typings.oojs.OO.EventHandler
import typings.oojsUi.OO.ui.Tool.Props
import typings.oojsUi.OO.ui.Tool.Prototype
import typings.oojsUi.oojsUiStrings.flag
import typings.std.HTMLElement
import typings.std.Partial
import typings.std.Pick
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Tools, together with {@link OO.ui.ToolGroup toolgroups}, constitute
  * {@link OO.ui.Toolbar toolbars}.
  * Each tool is configured with a static name, title, and icon and is customized with the command
  * to carry out when the tool is selected. Tools must also be registered with a
  * {@link OO.ui.ToolFactory tool factory}, which creates the tools on demand.
  *
  * Every Tool subclass must implement two methods:
  *
  * - {@link onUpdateState}
  * - {@link onSelect}
  *
  * Tools are added to toolgroups ({@link OO.ui.ListToolGroup ListToolGroup},
  * {@link OO.ui.BarToolGroup BarToolGroup}, or {@link OO.ui.MenuToolGroup MenuToolGroup}), which
  * determine how the tool is displayed in the toolbar. See {@link OO.ui.Toolbar toolbars} for an
  * example.
  *
  * For more information, please see the [OOUI documentation on MediaWiki](https://www.mediawiki.org/wiki/OOUI/Toolbars).
  *
  * ResourceLoader module: `oojs-ui-toolbars`
  *
  * @see https://doc.wikimedia.org/oojs-ui/master/js/#!/api/OO.ui.Tool
  */
@js.native
trait Tool
  extends StObject
     with Props
     with Prototype {
  
  /**
    * Get an ID of a labelable node which is part of this widget, if any, to be used for `<label for>`
    * value.
    *
    * If this function returns null, the widget should have a meaningful {@link simulateLabelClick} method
    * instead.
    *
    * @return The ID of the labelable element
    */
  /* InferMemberOverrides */
  override def getInputId(): String | Null = js.native
}
object Tool {
  
  trait ConfigOptions
    extends StObject
       with typings.oojsUi.OO.ui.Widget.ConfigOptions
       with typings.oojsUi.OO.ui.mixin.IconElement.ConfigOptions
       with typings.oojsUi.OO.ui.mixin.FlaggedElement.ConfigOptions
       with typings.oojsUi.OO.ui.mixin.TabIndexedElement.ConfigOptions {
    
    /**
      * See {@link Static.narrowConfig static.narrowConfig}
      *
      * The title is used in different ways depending on the type of toolgroup that contains the tool.
      * The title is used as a tooltip if the tool is part of a {@link OO.ui.BarToolGroup bar}
      * toolgroup, or as the label text if the tool is part of a {@link OO.ui.ListToolGroup list} or
      * {@link OO.ui.MenuToolGroup menu} toolgroup.
      *
      * For bar toolgroups, a description of the accelerator key is appended to the title if an
      * accelerator key is associated with an action by the same name as the tool and accelerator
      * functionality has been added to the application.
      * To add accelerator key functionality, you must subclass OO.ui.Toolbar and override the
      * {@link OO.ui.Toolbar.getToolAccelerator getToolAccelerator} method.
      */
    var displayBothIconAndLabel: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Title text or a function that returns text. If this config is omitted, the value of
      * the {@link Static.title static title} property is used.
      */
    var title: js.UndefOr[Deferrable[String]] = js.undefined
  }
  object ConfigOptions {
    
    inline def apply(): ConfigOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConfigOptions] (val x: Self) extends AnyVal {
      
      inline def setDisplayBothIconAndLabel(value: Boolean): Self = StObject.set(x, "displayBothIconAndLabel", value.asInstanceOf[js.Any])
      
      inline def setDisplayBothIconAndLabelUndefined: Self = StObject.set(x, "displayBothIconAndLabel", js.undefined)
      
      inline def setTitle(value: Deferrable[String]): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleFunction0(value: () => String): Self = StObject.set(x, "title", js.Any.fromFunction0(value))
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  @js.native
  trait Constructor
    extends StObject
       with /**
    * @param toolGroup
    * @param config Configuration options
    */
  Instantiable1[/* toolGroup */ ToolGroup, Tool]
       with Instantiable2[/* toolGroup */ ToolGroup, /* config */ ConfigOptions, Tool] {
    
    /** @deprecated Use `super` instead */
    var parent: typings.oojsUi.OO.ui.Widget.Constructor = js.native
    
    var static: Static = js.native
    
    var `super`: typings.oojsUi.OO.ui.Widget.Constructor = js.native
  }
  
  trait EventMap
    extends StObject
       with typings.oojsUi.OO.ui.Widget.EventMap
       with typings.oojsUi.OO.ui.mixin.FlaggedElement.EventMap
  object EventMap {
    
    inline def apply(
      disable: js.Array[/* disabled */ Boolean],
      flag: js.Array[/* changes */ Record[String, Boolean]],
      toggle: js.Array[/* visible */ Boolean]
    ): EventMap = {
      val __obj = js.Dynamic.literal(disable = disable.asInstanceOf[js.Any], flag = flag.asInstanceOf[js.Any], toggle = toggle.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventMap]
    }
  }
  
  trait Props
    extends StObject
       with typings.oojsUi.OO.ui.Element.Props
       with typings.oojsUi.OO.ui.mixin.IconElement.Props
       with typings.oojsUi.OO.ui.mixin.FlaggedElement.Props
       with typings.oojsUi.OO.ui.mixin.TabIndexedElement.Props {
    
    @JSName("$accel")
    var $accel: JQuery[HTMLElement]
    
    @JSName("$link")
    var $link: JQuery[HTMLElement]
    
    @JSName("$title")
    var $title: JQuery[HTMLElement]
  }
  object Props {
    
    inline def apply(
      $accel: JQuery[HTMLElement],
      $element: JQuery[HTMLElement],
      $flagged: JQuery[HTMLElement],
      $icon: JQuery[HTMLElement],
      $link: JQuery[HTMLElement],
      $tabIndexed: JQuery[HTMLElement],
      $title: JQuery[HTMLElement]
    ): Props = {
      val __obj = js.Dynamic.literal($accel = $accel.asInstanceOf[js.Any], $element = $element.asInstanceOf[js.Any], $flagged = $flagged.asInstanceOf[js.Any], $icon = $icon.asInstanceOf[js.Any], $link = $link.asInstanceOf[js.Any], $tabIndexed = $tabIndexed.asInstanceOf[js.Any], $title = $title.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      inline def set$accel(value: JQuery[HTMLElement]): Self = StObject.set(x, "$accel", value.asInstanceOf[js.Any])
      
      inline def set$link(value: JQuery[HTMLElement]): Self = StObject.set(x, "$link", value.asInstanceOf[js.Any])
      
      inline def set$title(value: JQuery[HTMLElement]): Self = StObject.set(x, "$title", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Prototype
    extends StObject
       with typings.oojsUi.OO.ui.Widget.Prototype
       with typings.oojsUi.OO.ui.mixin.IconElement.Prototype
       with typings.oojsUi.OO.ui.mixin.FlaggedElement.Prototype
       with typings.oojsUi.OO.ui.mixin.TabIndexedElement.Prototype {
    
    /**
      * Destroy tool.
      *
      * Destroying the tool removes all event handlers and the tool’s DOM elements.
      * Call this method whenever you are done using a tool.
      */
    def destroy(): Unit = js.native
    
    @JSName("emitThrow")
    def emitThrow_flag(
      event: flag,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventMap[K] is not an array type */ args: js.Array[/* changes */ Record[String, Boolean]]
    ): Boolean = js.native
    
    @JSName("emit")
    def emit_flag(
      event: flag,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventMap[K] is not an array type */ args: js.Array[/* changes */ Record[String, Boolean]]
    ): Boolean = js.native
    
    /**
      * Get an ID of a labelable node which is part of this widget, if any, to be used for `<label for>`
      * value.
      *
      * If this function returns null, the widget should have a meaningful {@link simulateLabelClick} method
      * instead.
      *
      * @return The ID of the labelable element
      */
    /* InferMemberOverrides */
    override def getInputId(): String | Null = js.native
    
    /**
      * Get the tool's symbolic name.
      *
      * @return Symbolic name of tool
      */
    def getName(): String = js.native
    
    /**
      * Get the tool {@link ConfigOptions.title title}.
      *
      * @return Title text
      */
    def getTitle(): String = js.native
    
    /**
      * Check if the tool is active.
      *
      * Tools become active when their {@link onSelect} or {@link onUpdateState} handlers
      * change them to appear pressed with the {@link setActive} method. Additional CSS is
      * applied to the tool to reflect the active state.
      *
      * @return Tool is active
      */
    def isActive(): Boolean = js.native
    
    @JSName("off")
    def off_flag[C](event: flag): this.type = js.native
    @JSName("off")
    def off_flag[C](event: flag, method: Unit, context: C): this.type = js.native
    @JSName("off")
    def off_flag[C](
      event: flag,
      method: EventHandler[
          C, 
          js.ThisFunction1[/* this */ C, /* args */ js.Array[/* changes */ Record[String, Boolean]], Unit]
        ]
    ): this.type = js.native
    @JSName("off")
    def off_flag[C](
      event: flag,
      method: EventHandler[
          C, 
          js.ThisFunction1[/* this */ C, /* args */ js.Array[/* changes */ Record[String, Boolean]], Unit]
        ],
      context: C
    ): this.type = js.native
    
    /**
      * Handle the tool being selected. This method is called when the user triggers this tool,
      * usually by clicking on its label/icon.
      *
      * This is an abstract method that must be overridden in a concrete subclass.
      */
    def onSelect(): Unit = js.native
    
    /**
      * Handle resize events from the toolbar
      */
    def onToolbarResize(): Unit = js.native
    
    /**
      * Handle the toolbar state being updated. This method is called when the
      * {@link OO.ui.Toolbar.EventMap.updateState 'updateState' event} is emitted on the
      * {@link OO.ui.Toolbar Toolbar} that uses this tool, and should set the state of this tool
      * depending on application state (usually by calling {@link setDisabled} to enable or disable the tool,
      * or {@link setActive} to mark is as currently in-use or not).
      *
      * This is an abstract method that must be overridden in a concrete subclass.
      */
    def onUpdateState(): Unit = js.native
    
    @JSName("on")
    def on_flag[A /* <: ArgTuple */, C](
      event: flag,
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
    def on_flag[A /* <: ArgTuple */, C](
      event: flag,
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
    def on_flag[A /* <: ArgTuple */, C](
      event: flag,
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
    def on_flag[A /* <: ArgTuple */, C](
      event: flag,
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
    
    @JSName("once")
    def once_flag(
      event: flag,
      listener: js.ThisFunction1[/* this */ Null, /* args */ js.Array[/* changes */ Record[String, Boolean]], Unit]
    ): this.type = js.native
    
    /**
      * Make the tool appear active or inactive.
      *
      * This method should be called within {@link onSelect} or {@link onUpdateState} event
      * handlers to make the tool appear pressed or not.
      *
      * @param state Make tool appear active
      */
    def setActive(state: Boolean): Unit = js.native
    
    /**
      * Set the tool's displayBothIconAndLabel state.
      *
      * Update title classes if necessary
      *
      * @param displayBothIconAndLabel
      * @return The tool, for chaining
      */
    def setDisplayBothIconAndLabel(displayBothIconAndLabel: Boolean): this.type = js.native
    
    /**
      * Set the tool {@link ConfigOptions.title title}.
      *
      * @param title Title text or a function that returns text
      * @return The tool, for chaining
      */
    def setTitle(title: Deferrable[String]): this.type = js.native
    
    /**
      * Update the title.
      */
    def updateTitle(): Unit = js.native
  }
  
  @js.native
  trait Static
    extends StObject
       with typings.oojsUi.OO.ui.Element.Static
       with typings.oojsUi.OO.ui.mixin.IconElement.Static
       with typings.oojsUi.OO.ui.mixin.FlaggedElement.Static {
    
    /**
      * Add tool to catch-all groups automatically.
      *
      * A catch-all group, which contains all tools that do not currently belong to a toolgroup,
      * can be included in a toolgroup using the wildcard selector, an asterisk (*).
      */
    var autoAddToCatchall: Boolean = js.native
    
    /**
      * Add tool to named groups automatically.
      *
      * By default, tools that are configured with a static ‘group’ property are added
      * to that group and will be selected when the symbolic name of the group is specified
      * (e.g., when toolgroups include tools by group name).
      */
    var autoAddToGroup: Boolean = js.native
    
    /**
      * Display both icon and label when the tool is used in a {@link OO.ui.BarToolGroup bar}
      * toolgroup.
      * Normally only the icon is displayed, or only the label if no icon is given.
      */
    var displayBothIconAndLabel: Boolean = js.native
    
    /**
      * Symbolic name of the group.
      *
      * The group name is used to associate tools with each other so that they can be
      * selected later by a {@link OO.ui.ToolGroup toolgroup}.
      */
    var group: String = js.native
    
    /**
      * Check if this tool is compatible with given data.
      *
      * This is a stub that can be overridden to provide support for filtering tools based on an
      * arbitrary piece of information  (e.g., where the cursor is in a document). The implementation
      * must also call this method so that the compatibility check can be performed.
      *
      * @param data Data to check
      * @return Tool can be used with data
      */
    def isCompatibleWith(data: Any): Boolean = js.native
    
    /**
      * Symbolic name of tool.
      *
      * The symbolic name is used internally to register the tool with a
      * {@link OO.ui.ToolFactory ToolFactory}. It can also be used when adding tools to
      * toolgroups.
      */
    var name: String = js.native
    
    /**
      * Config options to change when toolbar is in narrow mode
      *
      * Supports `displayBothIconAndLabel`, `title` and `icon` properties.
      */
    var narrowConfig: (Partial[Pick[this.type, /* template literal string: displayBothIconAndLabel */ String]]) | Null = js.native
    
    /**
      * Tool title text or a function that returns title text. The value of the static property is
      * overridden if the {@link ConfigOptions.title title} config option is used.
      */
    var title: Deferrable[String] = js.native
  }
}
