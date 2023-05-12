package typings.oojsUi.OO.ui

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.jquery.JQuery
import typings.oojs.OO.ArgTuple
import typings.oojs.OO.EventEmitter
import typings.oojs.OO.EventHandler
import typings.oojsUi.OO.ui.MenuSelectWidget.Props
import typings.oojsUi.OO.ui.MenuSelectWidget.Prototype
import typings.oojsUi.oojsUiStrings.exact
import typings.oojsUi.oojsUiStrings.prefix
import typings.oojsUi.oojsUiStrings.ready
import typings.oojsUi.oojsUiStrings.substring
import typings.std.HTMLElement
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * MenuSelectWidget is a {@link OO.ui.SelectWidget select widget} that contains options and
  * is used together with OO.ui.MenuOptionWidget. It is designed be used as part of another widget.
  * See {@link OO.ui.DropdownWidget DropdownWidget},
  * {@link OO.ui.ComboBoxInputWidget ComboBoxInputWidget}, and
  * {@link OO.ui.mixin.LookupElement LookupElement} for examples of widgets that contain menus.
  * MenuSelectWidgets themselves are not instantiated directly, rather subclassed
  * and customized to be opened, closed, and displayed as needed.
  *
  * By default, menus are clipped to the visible viewport and are not visible when a user presses the
  * mouse outside the menu.
  *
  * Menus also have support for keyboard interaction:
  *
  * - Enter/Return key: choose and select a menu option
  * - Up-arrow key: highlight the previous menu option
  * - Down-arrow key: highlight the next menu option
  * - Escape key: hide the menu
  *
  * Unlike most widgets, MenuSelectWidget is initially hidden and must be shown by calling
  * {@link toggle}.
  *
  * Please see the [OOUI documentation on MediaWiki](https://www.mediawiki.org/wiki/OOUI/Widgets/Selects_and_Options)
  * for more information.
  *
  * ResourceLoader module: `oojs-ui-core`
  *
  * @see https://doc.wikimedia.org/oojs-ui/master/js/#!/api/OO.ui.MenuSelectWidget
  */
@js.native
trait MenuSelectWidget
  extends StObject
     with Props
     with Prototype
object MenuSelectWidget {
  
  trait ConfigOptions
    extends StObject
       with typings.oojsUi.OO.ui.SelectWidget.ConfigOptions
       with typings.oojsUi.OO.ui.mixin.ClippableElement.ConfigOptions
       with typings.oojsUi.OO.ui.mixin.FloatableElement.ConfigOptions {
    
    /** If these elements are clicked, don't auto-hide the menu. */
    @JSName("$autoCloseIgnore")
    var $autoCloseIgnore: js.UndefOr[JQuery[HTMLElement]] = js.undefined
    
    /**
      * Text input used to implement option highlighting for menu items that match
      * the text the user types. This config is used by
      * {@link OO.ui.TagMultiselectWidget TagMultiselectWidget}
      */
    @JSName("$input")
    var $input: js.UndefOr[JQuery[HTMLElement]] = js.undefined
    
    /** Hide the menu when the mouse is pressed outside the menu. */
    var autoHide: js.UndefOr[Boolean] = js.undefined
    
    /** Filter the displayed options from the input */
    var filterFromInput: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The mode by which the menu filters the results.
      * Options are 'exact', 'prefix' or 'substring'. See `OO.ui.SelectWidget.getItemMatcher`
      */
    var filterMode: js.UndefOr[substring | prefix | exact] = js.undefined
    
    /** Hide the menu when the user chooses an option. */
    var hideOnChoose: js.UndefOr[Boolean] = js.undefined
    
    /** Highlight the first result when filtering */
    var highlightOnFilter: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Text input used to implement option highlighting for menu
      * items that match the text the user types. This config is used by
      * {@link OO.ui.ComboBoxInputWidget ComboBoxInputWidget} and
      * {@link OO.ui.mixin.LookupElement LookupElement}
      */
    var input: js.UndefOr[TextInputWidget] = js.undefined
    
    /**
      * Widget associated with the menu's active state. If the user clicks
      * the mouse anywhere on the page outside of this widget, the menu is hidden. For
      * example, if there is a button that toggles the menu's visibility on click, the menu
      * will be hidden then re-shown when the user clicks that button, unless the button (or
      * its parent widget) is passed in here.
      */
    var widget: js.UndefOr[Widget] = js.undefined
    
    /**
      * Width of the menu as a number of pixels or CSS string with unit
      * suffix, used by {@link OO.ui.mixin.ClippableElement ClippableElement}
      */
    var width: js.UndefOr[Double | String] = js.undefined
  }
  object ConfigOptions {
    
    inline def apply(): ConfigOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConfigOptions] (val x: Self) extends AnyVal {
      
      inline def set$autoCloseIgnore(value: JQuery[HTMLElement]): Self = StObject.set(x, "$autoCloseIgnore", value.asInstanceOf[js.Any])
      
      inline def set$autoCloseIgnoreUndefined: Self = StObject.set(x, "$autoCloseIgnore", js.undefined)
      
      inline def set$input(value: JQuery[HTMLElement]): Self = StObject.set(x, "$input", value.asInstanceOf[js.Any])
      
      inline def set$inputUndefined: Self = StObject.set(x, "$input", js.undefined)
      
      inline def setAutoHide(value: Boolean): Self = StObject.set(x, "autoHide", value.asInstanceOf[js.Any])
      
      inline def setAutoHideUndefined: Self = StObject.set(x, "autoHide", js.undefined)
      
      inline def setFilterFromInput(value: Boolean): Self = StObject.set(x, "filterFromInput", value.asInstanceOf[js.Any])
      
      inline def setFilterFromInputUndefined: Self = StObject.set(x, "filterFromInput", js.undefined)
      
      inline def setFilterMode(value: substring | prefix | exact): Self = StObject.set(x, "filterMode", value.asInstanceOf[js.Any])
      
      inline def setFilterModeUndefined: Self = StObject.set(x, "filterMode", js.undefined)
      
      inline def setHideOnChoose(value: Boolean): Self = StObject.set(x, "hideOnChoose", value.asInstanceOf[js.Any])
      
      inline def setHideOnChooseUndefined: Self = StObject.set(x, "hideOnChoose", js.undefined)
      
      inline def setHighlightOnFilter(value: Boolean): Self = StObject.set(x, "highlightOnFilter", value.asInstanceOf[js.Any])
      
      inline def setHighlightOnFilterUndefined: Self = StObject.set(x, "highlightOnFilter", js.undefined)
      
      inline def setInput(value: TextInputWidget): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
      
      inline def setWidget(value: Widget): Self = StObject.set(x, "widget", value.asInstanceOf[js.Any])
      
      inline def setWidgetUndefined: Self = StObject.set(x, "widget", js.undefined)
      
      inline def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait Constructor
    extends StObject
       with /** @param config Configuration options */
  Instantiable0[MenuSelectWidget]
       with Instantiable1[/* config */ ConfigOptions, MenuSelectWidget] {
    
    /** @deprecated Use `super` instead */
    var parent: typings.oojsUi.OO.ui.SelectWidget.Constructor = js.native
    
    var static: Static = js.native
    
    var `super`: typings.oojsUi.OO.ui.SelectWidget.Constructor = js.native
  }
  
  trait EventMap
    extends StObject
       with typings.oojsUi.OO.ui.SelectWidget.EventMap {
    
    var ready: js.Array[Any]
  }
  object EventMap {
    
    inline def apply(
      add: js.Tuple2[/* items */ js.Array[OptionWidget] | OptionWidget, /* index */ Double],
      change: js.Array[/* items */ js.Array[Element]],
      choose: js.Tuple2[/* item */ OptionWidget, /* selected */ Boolean],
      clear: js.Array[Any],
      disable: js.Array[/* disabled */ Boolean],
      highlight: js.Array[/* item */ OptionWidget | Null],
      move: js.Tuple3[/* item */ EventEmitter, /* index */ Double, /* oldIndex */ Double],
      press: js.Array[/* item */ OptionWidget | Null],
      ready: js.Array[Any],
      remove: js.Tuple2[/* items */ js.Array[OptionWidget] | OptionWidget, /* index */ Double],
      select: js.Array[/* items */ js.Array[OptionWidget] | OptionWidget | Null],
      toggle: js.Array[/* visible */ Boolean]
    ): EventMap = {
      val __obj = js.Dynamic.literal(add = add.asInstanceOf[js.Any], change = change.asInstanceOf[js.Any], choose = choose.asInstanceOf[js.Any], clear = clear.asInstanceOf[js.Any], disable = disable.asInstanceOf[js.Any], highlight = highlight.asInstanceOf[js.Any], move = move.asInstanceOf[js.Any], press = press.asInstanceOf[js.Any], ready = ready.asInstanceOf[js.Any], remove = remove.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any], toggle = toggle.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventMap]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EventMap] (val x: Self) extends AnyVal {
      
      inline def setReady(value: js.Array[Any]): Self = StObject.set(x, "ready", value.asInstanceOf[js.Any])
      
      inline def setReadyVarargs(value: Any*): Self = StObject.set(x, "ready", js.Array(value*))
    }
  }
  
  trait Props
    extends StObject
       with typings.oojsUi.OO.ui.SelectWidget.Props
       with typings.oojsUi.OO.ui.mixin.ClippableElement.Props
       with typings.oojsUi.OO.ui.mixin.FloatableElement.Props {
    
    @JSName("$autoCloseIgnore")
    var $autoCloseIgnore: JQuery[HTMLElement]
    
    @JSName("$input")
    var $input: JQuery[HTMLElement] | Null
    
    @JSName("$widget")
    var $widget: JQuery[HTMLElement] | Null
  }
  object Props {
    
    inline def apply(
      $autoCloseIgnore: JQuery[HTMLElement],
      $clippable: JQuery[HTMLElement],
      $clippableContainer: JQuery[HTMLElement],
      $element: JQuery[HTMLElement],
      $floatable: JQuery[HTMLElement],
      $floatableContainer: JQuery[HTMLElement],
      $focusOwner: JQuery[HTMLElement],
      $group: JQuery[HTMLElement]
    ): Props = {
      val __obj = js.Dynamic.literal($autoCloseIgnore = $autoCloseIgnore.asInstanceOf[js.Any], $clippable = $clippable.asInstanceOf[js.Any], $clippableContainer = $clippableContainer.asInstanceOf[js.Any], $element = $element.asInstanceOf[js.Any], $floatable = $floatable.asInstanceOf[js.Any], $floatableContainer = $floatableContainer.asInstanceOf[js.Any], $focusOwner = $focusOwner.asInstanceOf[js.Any], $group = $group.asInstanceOf[js.Any], $input = null, $widget = null)
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      inline def set$autoCloseIgnore(value: JQuery[HTMLElement]): Self = StObject.set(x, "$autoCloseIgnore", value.asInstanceOf[js.Any])
      
      inline def set$input(value: JQuery[HTMLElement]): Self = StObject.set(x, "$input", value.asInstanceOf[js.Any])
      
      inline def set$inputNull: Self = StObject.set(x, "$input", null)
      
      inline def set$widget(value: JQuery[HTMLElement]): Self = StObject.set(x, "$widget", value.asInstanceOf[js.Any])
      
      inline def set$widgetNull: Self = StObject.set(x, "$widget", null)
    }
  }
  
  @js.native
  trait Prototype
    extends StObject
       with typings.oojsUi.OO.ui.SelectWidget.Prototype
       with typings.oojsUi.OO.ui.mixin.ClippableElement.Prototype
       with typings.oojsUi.OO.ui.mixin.FloatableElement.Prototype {
    
    @JSName("emitThrow")
    def emitThrow_ready(
      event: ready,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventMap[K] is not an array type */ args: js.Array[Any]
    ): Boolean = js.native
    @JSName("emitThrow")
    def emitThrow_ready[K /* <: String */](
      event: /* import warning: importer.ImportType#apply Failed type conversion: K extends 'ready' ? never : K */ js.Any,
      args: Any*
    ): Boolean = js.native
    
    @JSName("emit")
    def emit_ready(
      event: ready,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventMap[K] is not an array type */ args: js.Array[Any]
    ): Boolean = js.native
    @JSName("emit")
    def emit_ready[K /* <: String */](
      event: /* import warning: importer.ImportType#apply Failed type conversion: K extends 'ready' ? never : K */ js.Any,
      args: Any*
    ): Boolean = js.native
    
    /**
      * Return the visible items in the menu.
      *
      * @return Visible items
      */
    def getVisibleItems(): js.Array[MenuOptionWidget] = js.native
    
    @JSName("off")
    def off_ready[C](event: ready): this.type = js.native
    @JSName("off")
    def off_ready[C](event: ready, method: Unit, context: C): this.type = js.native
    @JSName("off")
    def off_ready[C](
      event: ready,
      method: EventHandler[C, js.ThisFunction1[/* this */ C, /* args */ js.Array[Any], Unit]]
    ): this.type = js.native
    @JSName("off")
    def off_ready[C](
      event: ready,
      method: EventHandler[C, js.ThisFunction1[/* this */ C, /* args */ js.Array[Any], Unit]],
      context: C
    ): this.type = js.native
    @JSName("off")
    def off_ready[K /* <: String */, C](
      event: /* import warning: importer.ImportType#apply Failed type conversion: K extends 'ready' ? never : K */ js.Any
    ): this.type = js.native
    @JSName("off")
    def off_ready[K /* <: String */, C](
      event: /* import warning: importer.ImportType#apply Failed type conversion: K extends 'ready' ? never : K */ js.Any,
      method: Unit,
      context: C
    ): this.type = js.native
    @JSName("off")
    def off_ready[K /* <: String */, C](
      event: /* import warning: importer.ImportType#apply Failed type conversion: K extends 'ready' ? never : K */ js.Any,
      method: EventHandler[C, js.ThisFunction1[/* this */ C, /* repeated */ Any, Unit]]
    ): this.type = js.native
    @JSName("off")
    def off_ready[K /* <: String */, C](
      event: /* import warning: importer.ImportType#apply Failed type conversion: K extends 'ready' ? never : K */ js.Any,
      method: EventHandler[C, js.ThisFunction1[/* this */ C, /* repeated */ Any, Unit]],
      context: C
    ): this.type = js.native
    
    @JSName("on")
    def on_ready[K /* <: String */, C](
      event: /* import warning: importer.ImportType#apply Failed type conversion: K extends 'ready' ? never : K */ js.Any,
      method: EventHandler[C, js.ThisFunction1[/* this */ C, /* repeated */ Any, Unit]]
    ): this.type = js.native
    @JSName("on")
    def on_ready[K /* <: String */, C](
      event: /* import warning: importer.ImportType#apply Failed type conversion: K extends 'ready' ? never : K */ js.Any,
      method: EventHandler[C, js.ThisFunction1[/* this */ C, /* repeated */ Any, Unit]],
      args: js.Array[Any]
    ): this.type = js.native
    @JSName("on")
    def on_ready[K /* <: String */, C](
      event: /* import warning: importer.ImportType#apply Failed type conversion: K extends 'ready' ? never : K */ js.Any,
      method: EventHandler[C, js.ThisFunction1[/* this */ C, /* repeated */ Any, Unit]],
      args: js.Array[Any],
      context: C
    ): this.type = js.native
    @JSName("on")
    def on_ready[K /* <: String */, C](
      event: /* import warning: importer.ImportType#apply Failed type conversion: K extends 'ready' ? never : K */ js.Any,
      method: EventHandler[C, js.ThisFunction1[/* this */ C, /* repeated */ Any, Unit]],
      args: Unit,
      context: C
    ): this.type = js.native
    // #region EventEmitter overloads
    @JSName("on")
    def on_ready[A /* <: ArgTuple */, C](
      event: ready,
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
    def on_ready[A /* <: ArgTuple */, C](
      event: ready,
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
    def on_ready[A /* <: ArgTuple */, C](
      event: ready,
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
    def on_ready[A /* <: ArgTuple */, C](
      event: ready,
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
    def once_ready(event: ready, listener: js.ThisFunction1[/* this */ Null, /* args */ js.Array[Any], Unit]): this.type = js.native
    @JSName("once")
    def once_ready[K /* <: String */](
      event: /* import warning: importer.ImportType#apply Failed type conversion: K extends 'ready' ? never : K */ js.Any,
      listener: js.ThisFunction1[/* this */ Null, /* repeated */ Any, Unit]
    ): this.type = js.native
    
    /**
      * Scroll to the top of the menu
      */
    def scrollToTop(): Unit = js.native
    
    /**
      * Toggle visibility of the menu for screen readers.
      *
      * @param screenReaderMode
      */
    def toggleScreenReaderMode(screenReaderMode: Boolean): Unit = js.native
  }
  
  @js.native
  trait Static
    extends StObject
       with typings.oojsUi.OO.ui.SelectWidget.Static {
    
    /**
      * Positions to flip to if there isn't room in the container for the
      * menu in a specific direction.
      */
    var flippedPositions: Record[String, String] = js.native
  }
}
