package typings.oojsUi.OO.ui

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.jquery.JQuery
import typings.jquery.JQuery.Event
import typings.oojs.OO.ArgTuple
import typings.oojs.OO.EventConnectionMap
import typings.oojs.OO.EventHandler
import typings.oojsUi.OO.ui.FieldLayout.Props
import typings.oojsUi.OO.ui.FieldLayout.Prototype
import typings.oojsUi.anon.PartialRecordkeyofEventMa0
import typings.oojsUi.oojsUiStrings.`inline`
import typings.oojsUi.oojsUiStrings.labelChange
import typings.oojsUi.oojsUiStrings.left
import typings.oojsUi.oojsUiStrings.right
import typings.oojsUi.oojsUiStrings.top
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * FieldLayouts are used with OO.ui.FieldsetLayout. Each FieldLayout requires a field-widget,
  * which is a widget that is specified by reference before any optional configuration settings.
  *
  * Field layouts can be configured with help text and/or labels. Labels are aligned in one of
  * four ways:
  *
  * - **left**: The label is placed before the field-widget and aligned with the left margin.
  *   A left-alignment is used for forms with many fields.
  * - **right**: The label is placed before the field-widget and aligned to the right margin.
  *   A right-alignment is used for long but familiar forms which users tab through,
  *   verifying the current field with a quick glance at the label.
  * - **top**: The label is placed above the field-widget. A top-alignment is used for brief forms
  *   that users fill out from top to bottom.
  * - **inline**: The label is placed after the field-widget and aligned to the left.
  *   An inline-alignment is best used with checkboxes or radio buttons.
  *
  * Help text can either be:
  *
  * - accessed via a help icon that appears in the upper right corner of the rendered field layout,
  *   or
  * - shown as a subtle explanation below the label.
  *
  * If the help text is brief, or is essential to always expose it, set `helpInline` to `true`.
  * If it is long or not essential, leave `helpInline` to its default, `false`.
  *
  * Please see the [OOUI documentation on MediaWiki](https://www.mediawiki.org/wiki/OOUI/Layouts/Fields_and_Fieldsets)
  * for examples and more information.
  *
  * ResourceLoader module: `oojs-ui-core`
  *
  * @see https://doc.wikimedia.org/oojs-ui/master/js/#!/api/OO.ui.FieldLayout
  */
@js.native
trait FieldLayout[T /* <: Widget */]
  extends StObject
     with Props
     with Prototype[T]
object FieldLayout {
  
  trait ConfigOptions
    extends StObject
       with typings.oojsUi.OO.ui.Element.ConfigOptions
       with typings.oojsUi.OO.ui.mixin.LabelElement.ConfigOptions
       with typings.oojsUi.OO.ui.mixin.TitledElement.ConfigOptions {
    
    /**
      * Passed to OO.ui.PopupButtonWidget for help popup, if `help` is given.
      * See <https://www.mediawiki.org/wiki/OOUI/Concepts#Overlays>.
      */
    @JSName("$overlay")
    var $overlay: js.UndefOr[JQuery[HTMLElement]] = js.undefined
    
    /** Alignment of the label: 'left', 'right', 'top' or 'inline' */
    var align: js.UndefOr[left | right | top | `inline`] = js.undefined
    
    /** Error messages about the widget, which will be displayed below the widget. */
    var errors: js.UndefOr[js.Array[String | HtmlSnippet]] = js.undefined
    
    /**
      * Help text.
      *
      * When help text is specified and `helpInline` is `false`, a "help" icon will appear in
      * the upper-right corner of the rendered field; clicking it will display the text in a
      * popup. If `helpInline` is `true`, then a subtle description will be shown after the
      * label.
      */
    var help: js.UndefOr[String | HtmlSnippet] = js.undefined
    
    /** Whether or not the help should be inline, or shown when the "help" icon is clicked. */
    var helpInline: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Notices about the widget, which will be displayed
      * below the widget.
      * The array may contain strings or OO.ui.HtmlSnippet instances.
      * These are more visible than `help` messages when `helpInline` is set, and so
      * might be good for transient messages.
      */
    var notices: js.UndefOr[js.Array[String | HtmlSnippet]] = js.undefined
    
    /**
      * Success messages on user interactions with the widget, which will be displayed below
      * the widget. The array may contain strings or OO.ui.HtmlSnippet instances.
      */
    var successMessages: js.UndefOr[js.Array[String | HtmlSnippet]] = js.undefined
    
    /** Warning messages about the widget, which will be displayed below the widget. */
    var warnings: js.UndefOr[js.Array[String | HtmlSnippet]] = js.undefined
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
      
      inline def setAlign(value: left | right | top | `inline`): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      inline def setErrors(value: js.Array[String | HtmlSnippet]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
      
      inline def setErrorsVarargs(value: (String | HtmlSnippet)*): Self = StObject.set(x, "errors", js.Array(value*))
      
      inline def setHelp(value: String | HtmlSnippet): Self = StObject.set(x, "help", value.asInstanceOf[js.Any])
      
      inline def setHelpInline(value: Boolean): Self = StObject.set(x, "helpInline", value.asInstanceOf[js.Any])
      
      inline def setHelpInlineUndefined: Self = StObject.set(x, "helpInline", js.undefined)
      
      inline def setHelpUndefined: Self = StObject.set(x, "help", js.undefined)
      
      inline def setNotices(value: js.Array[String | HtmlSnippet]): Self = StObject.set(x, "notices", value.asInstanceOf[js.Any])
      
      inline def setNoticesUndefined: Self = StObject.set(x, "notices", js.undefined)
      
      inline def setNoticesVarargs(value: (String | HtmlSnippet)*): Self = StObject.set(x, "notices", js.Array(value*))
      
      inline def setSuccessMessages(value: js.Array[String | HtmlSnippet]): Self = StObject.set(x, "successMessages", value.asInstanceOf[js.Any])
      
      inline def setSuccessMessagesUndefined: Self = StObject.set(x, "successMessages", js.undefined)
      
      inline def setSuccessMessagesVarargs(value: (String | HtmlSnippet)*): Self = StObject.set(x, "successMessages", js.Array(value*))
      
      inline def setWarnings(value: js.Array[String | HtmlSnippet]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
      
      inline def setWarningsUndefined: Self = StObject.set(x, "warnings", js.undefined)
      
      inline def setWarningsVarargs(value: (String | HtmlSnippet)*): Self = StObject.set(x, "warnings", js.Array(value*))
    }
  }
  
  @js.native
  trait Constructor
    extends StObject
       with /**
    * @param fieldWidget Field widget
    * @param config Configuration options
    * @throws {Error} An error is thrown if no widget is specified
    */
  Instantiable1[/* fieldWidget */ Widget, FieldLayout[Widget]]
       with Instantiable2[/* fieldWidget */ Widget, /* config */ ConfigOptions, FieldLayout[Widget]] {
    
    /** @deprecated Use `super` instead */
    var parent: typings.oojsUi.OO.ui.Layout.Constructor = js.native
    
    var static: Static = js.native
    
    var `super`: typings.oojsUi.OO.ui.Layout.Constructor = js.native
  }
  
  type EventMap = typings.oojsUi.OO.ui.mixin.LabelElement.EventMap
  
  trait Props
    extends StObject
       with typings.oojsUi.OO.ui.Element.Props
       with typings.oojsUi.OO.ui.mixin.LabelElement.Props
       with typings.oojsUi.OO.ui.mixin.TitledElement.Props {
    
    @JSName("$body")
    var $body: JQuery[HTMLElement]
    
    @JSName("$field")
    var $field: JQuery[HTMLElement]
    
    @JSName("$header")
    var $header: JQuery[HTMLElement]
    
    @JSName("$help")
    var $help: JQuery[HTMLElement]
    
    @JSName("$messages")
    var $messages: JQuery[HTMLElement]
  }
  object Props {
    
    inline def apply(
      $body: JQuery[HTMLElement],
      $element: JQuery[HTMLElement],
      $field: JQuery[HTMLElement],
      $header: JQuery[HTMLElement],
      $help: JQuery[HTMLElement],
      $label: JQuery[HTMLElement],
      $messages: JQuery[HTMLElement],
      $titled: JQuery[HTMLElement]
    ): Props = {
      val __obj = js.Dynamic.literal($body = $body.asInstanceOf[js.Any], $element = $element.asInstanceOf[js.Any], $field = $field.asInstanceOf[js.Any], $header = $header.asInstanceOf[js.Any], $help = $help.asInstanceOf[js.Any], $label = $label.asInstanceOf[js.Any], $messages = $messages.asInstanceOf[js.Any], $titled = $titled.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      inline def set$body(value: JQuery[HTMLElement]): Self = StObject.set(x, "$body", value.asInstanceOf[js.Any])
      
      inline def set$field(value: JQuery[HTMLElement]): Self = StObject.set(x, "$field", value.asInstanceOf[js.Any])
      
      inline def set$header(value: JQuery[HTMLElement]): Self = StObject.set(x, "$header", value.asInstanceOf[js.Any])
      
      inline def set$help(value: JQuery[HTMLElement]): Self = StObject.set(x, "$help", value.asInstanceOf[js.Any])
      
      inline def set$messages(value: JQuery[HTMLElement]): Self = StObject.set(x, "$messages", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Prototype[T /* <: Widget */]
    extends StObject
       with typings.oojsUi.OO.ui.Layout.Prototype
       with typings.oojsUi.OO.ui.mixin.LabelElement.Prototype
       with typings.oojsUi.OO.ui.mixin.TitledElement.Prototype {
    
    def connect[T /* <: PartialRecordkeyofEventMa0 */, C](context: C, methods: EventConnectionMap[T, C, EventMap]): this.type = js.native
    
    def disconnect[T /* <: PartialRecordkeyofEventMa0 */, C](context: C, methods: EventConnectionMap[T, C, EventMap]): this.type = js.native
    
    def emit[K /* <: String */](
      event: /* import warning: importer.ImportType#apply Failed type conversion: K extends keyof oojs-ui.OO.ui.FieldLayout.EventMap ? never : K */ js.Any,
      args: Any*
    ): Boolean = js.native
    
    def emitThrow[K /* <: String */](
      event: /* import warning: importer.ImportType#apply Failed type conversion: K extends keyof oojs-ui.OO.ui.FieldLayout.EventMap ? never : K */ js.Any,
      args: Any*
    ): Boolean = js.native
    @JSName("emitThrow")
    def emitThrow_labelChange(
      event: labelChange,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventMap[K] is not an array type */ args: js.Array[Any]
    ): Boolean = js.native
    
    @JSName("emit")
    def emit_labelChange(
      event: labelChange,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventMap[K] is not an array type */ args: js.Array[Any]
    ): Boolean = js.native
    
    /**
      * Get the widget contained by the field.
      *
      * @return Field widget
      */
    def getField(): T = js.native
    
    /**
      * Return `true` if the given field widget can be used with `'inline'` alignment (see
      * {@link setAlignment}). Return `false` if it can't or if this can't be determined.
      *
      * @return
      */
    def isFieldInline(): Boolean = js.native
    
    def off[K /* <: String */, C](
      event: /* import warning: importer.ImportType#apply Failed type conversion: K extends keyof oojs-ui.OO.ui.FieldLayout.EventMap ? never : K */ js.Any
    ): this.type = js.native
    def off[K /* <: String */, C](
      event: /* import warning: importer.ImportType#apply Failed type conversion: K extends keyof oojs-ui.OO.ui.FieldLayout.EventMap ? never : K */ js.Any,
      method: Unit,
      context: C
    ): this.type = js.native
    def off[K /* <: String */, C](
      event: /* import warning: importer.ImportType#apply Failed type conversion: K extends keyof oojs-ui.OO.ui.FieldLayout.EventMap ? never : K */ js.Any,
      method: EventHandler[C, js.ThisFunction1[/* this */ C, /* repeated */ Any, Unit]]
    ): this.type = js.native
    def off[K /* <: String */, C](
      event: /* import warning: importer.ImportType#apply Failed type conversion: K extends keyof oojs-ui.OO.ui.FieldLayout.EventMap ? never : K */ js.Any,
      method: EventHandler[C, js.ThisFunction1[/* this */ C, /* repeated */ Any, Unit]],
      context: C
    ): this.type = js.native
    @JSName("off")
    def off_labelChange[C](event: labelChange): this.type = js.native
    @JSName("off")
    def off_labelChange[C](event: labelChange, method: Unit, context: C): this.type = js.native
    @JSName("off")
    def off_labelChange[C](
      event: labelChange,
      method: EventHandler[C, js.ThisFunction1[/* this */ C, /* args */ js.Array[Any], Unit]]
    ): this.type = js.native
    @JSName("off")
    def off_labelChange[C](
      event: labelChange,
      method: EventHandler[C, js.ThisFunction1[/* this */ C, /* args */ js.Array[Any], Unit]],
      context: C
    ): this.type = js.native
    
    def on[K /* <: String */, C](
      event: /* import warning: importer.ImportType#apply Failed type conversion: K extends keyof oojs-ui.OO.ui.FieldLayout.EventMap ? never : K */ js.Any,
      method: EventHandler[C, js.ThisFunction1[/* this */ C, /* repeated */ Any, Unit]]
    ): this.type = js.native
    def on[K /* <: String */, C](
      event: /* import warning: importer.ImportType#apply Failed type conversion: K extends keyof oojs-ui.OO.ui.FieldLayout.EventMap ? never : K */ js.Any,
      method: EventHandler[C, js.ThisFunction1[/* this */ C, /* repeated */ Any, Unit]],
      args: js.Array[Any]
    ): this.type = js.native
    def on[K /* <: String */, C](
      event: /* import warning: importer.ImportType#apply Failed type conversion: K extends keyof oojs-ui.OO.ui.FieldLayout.EventMap ? never : K */ js.Any,
      method: EventHandler[C, js.ThisFunction1[/* this */ C, /* repeated */ Any, Unit]],
      args: js.Array[Any],
      context: C
    ): this.type = js.native
    def on[K /* <: String */, C](
      event: /* import warning: importer.ImportType#apply Failed type conversion: K extends keyof oojs-ui.OO.ui.FieldLayout.EventMap ? never : K */ js.Any,
      method: EventHandler[C, js.ThisFunction1[/* this */ C, /* repeated */ Any, Unit]],
      args: Unit,
      context: C
    ): this.type = js.native
    
    /**
      * Handle click events on the field label, or inline help
      *
      * @param event
      */
    def onLabelClick(): Event = js.native
    
    // #region EventEmitter overloads
    @JSName("on")
    def on_labelChange[A /* <: ArgTuple */, C](
      event: labelChange,
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
    def on_labelChange[A /* <: ArgTuple */, C](
      event: labelChange,
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
    def on_labelChange[A /* <: ArgTuple */, C](
      event: labelChange,
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
    def on_labelChange[A /* <: ArgTuple */, C](
      event: labelChange,
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
      event: /* import warning: importer.ImportType#apply Failed type conversion: K extends keyof oojs-ui.OO.ui.FieldLayout.EventMap ? never : K */ js.Any,
      listener: js.ThisFunction1[/* this */ Null, /* repeated */ Any, Unit]
    ): this.type = js.native
    @JSName("once")
    def once_labelChange(event: labelChange, listener: js.ThisFunction1[/* this */ Null, /* args */ js.Array[Any], Unit]): this.type = js.native
    
    /**
      * Set the list of error messages.
      *
      * @param errors Error messages about the widget, which will be displayed below the
      *  widget. The array may contain strings or OO.ui.HtmlSnippet instances.
      * @return The layout, for chaining
      */
    def setErrors(errors: js.Array[String | HtmlSnippet]): this.type = js.native
    
    /**
      * Set the list of notice messages.
      *
      * @param notices Notices about the widget, which will be displayed below the widget.
      *  The array may contain strings or OO.ui.HtmlSnippet instances.
      * @return The layout, for chaining
      */
    def setNotices(notices: js.Array[String | HtmlSnippet]): this.type = js.native
    
    /**
      * Set the list of success messages.
      *
      * @param  successMessages Success messages about the widget, which will be displayed
      *  below the widget.
      *  The array may contain strings or OO.ui.HtmlSnippet instances.
      * @return The layout, for chaining
      */
    def setSuccess(successMessages: js.Array[String | HtmlSnippet]): this.type = js.native
    
    /**
      * Set the list of warning messages.
      *
      * @param warnings Warning messages about the widget, which will be displayed below
      *  the widget.
      *  The array may contain strings or OO.ui.HtmlSnippet instances.
      * @return The layout, for chaining
      */
    def setWarnings(warnings: js.Array[String | HtmlSnippet]): this.type = js.native
  }
  
  @js.native
  trait Static
    extends StObject
       with typings.oojsUi.OO.ui.Element.Static
       with typings.oojsUi.OO.ui.mixin.LabelElement.Static
       with typings.oojsUi.OO.ui.mixin.TitledElement.Static
}
