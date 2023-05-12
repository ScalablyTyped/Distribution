package typings.oojsUi.OO.ui

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.jquery.JQuery
import typings.jquery.JQuery.Promise
import typings.oojs.OO.ArgTuple
import typings.oojs.OO.EventHandler
import typings.oojsUi.OO.ui.TextInputWidget.Props
import typings.oojsUi.OO.ui.TextInputWidget.Prototype
import typings.oojsUi.oojsUiStrings.after
import typings.oojsUi.oojsUiStrings.before
import typings.oojsUi.oojsUiStrings.email
import typings.oojsUi.oojsUiStrings.enter
import typings.oojsUi.oojsUiStrings.flag
import typings.oojsUi.oojsUiStrings.invalid
import typings.oojsUi.oojsUiStrings.labelChange
import typings.oojsUi.oojsUiStrings.number
import typings.oojsUi.oojsUiStrings.password
import typings.oojsUi.oojsUiStrings.text
import typings.oojsUi.oojsUiStrings.url
import typings.std.HTMLElement
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * TextInputWidgets, like HTML text inputs, can be configured with options that customize the
  * size of the field as well as its presentation. In addition, these widgets can be configured
  * with {@link OO.ui.mixin.IconElement icons}, {@link OO.ui.mixin.IndicatorElement indicators}, an
  * optional validation-pattern (used to determine if an input value is valid or not) and an input
  * filter, which modifies incoming values rather than validating them.
  * Please see the [OOUI documentation on MediaWiki](https://www.mediawiki.org/wiki/OOUI/Widgets/Inputs)
  * for more information and examples.
  *
  * This widget can be used inside an HTML form, such as a OO.ui.FormLayout.
  *
  *     // A TextInputWidget.
  *     var textInput = new OO.ui.TextInputWidget( {
  *         value: 'Text input'
  *     } );
  *     $( document.body ).append( textInput.$element );
  *
  * ResourceLoader module: `oojs-ui-core`
  *
  * @see https://doc.wikimedia.org/oojs-ui/master/js/#!/api/OO.ui.TextInputWidget
  */
@js.native
trait TextInputWidget
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
object TextInputWidget {
  
  trait ConfigOptions
    extends StObject
       with typings.oojsUi.OO.ui.InputWidget.ConfigOptions
       with typings.oojsUi.OO.ui.mixin.IconElement.ConfigOptions
       with typings.oojsUi.OO.ui.mixin.IndicatorElement.ConfigOptions
       with typings.oojsUi.OO.ui.mixin.PendingElement.ConfigOptions
       with typings.oojsUi.OO.ui.mixin.LabelElement.ConfigOptions
       with typings.oojsUi.OO.ui.mixin.FlaggedElement.ConfigOptions
       with typings.oojsUi.OO.ui.mixin.RequiredElement.ConfigOptions {
    
    /**
      * Should the browser support autocomplete for this field?
      * Type hints such as 'email' are also allowed.
      */
    var autocomplete: js.UndefOr[Boolean | String] = js.undefined
    
    /** Use an HTML `autofocus` attribute to instruct the browser to focus this widget. */
    var autofocus: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The position of the inline label relative to that of the value or placeholder text:
      * `'before'` or `'after'`
      */
    var labelPosition: js.UndefOr[before | after] = js.undefined
    
    /** Maximum number of characters allowed in the input. */
    var maxLength: js.UndefOr[Double] = js.undefined
    
    /**
      * Minimum number of characters allowed in the input.
      *
      * For unfortunate historical reasons, this counts the number of UTF-16 code units
      * rather than Unicode codepoints, which means that codepoints outside the Basic
      * Multilingual Plane (e.g. many emojis) count as 2 characters each.
      */
    var minLength: js.UndefOr[Double] = js.undefined
    
    /** Placeholder text */
    var placeholder: js.UndefOr[String] = js.undefined
    
    /** Prevent changes to the value of the text input. */
    var readOnly: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Should the browser support spellcheck for this field (`undefined` means leaving it up
      * to the browser).
      */
    var spellcheck: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The value of the HTML `type` attribute: 'text', 'password' 'email', 'url' or 'number'.
      * Subclasses might support other types.
      */
    var `type`: js.UndefOr[LiteralUnion[text | password | email | url | number]] = js.undefined
    
    /**
      * Validation pattern: when string, a symbolic name of a
      * pattern defined by the class: 'non-empty' (the value cannot be an empty string) or
      * 'integer' (the value must contain only numbers); when RegExp, a regular expression
      * that must match the value for it to be considered valid; when Function, a function
      * receiving the value as parameter that must return true, or promise resolving to true,
      * for it to be considered valid.
      */
    var validate: js.UndefOr[
        js.RegExp | String | (js.Function1[/* value */ String, Boolean | (Promise[Boolean, Any, Any])])
      ] = js.undefined
  }
  object ConfigOptions {
    
    inline def apply(): ConfigOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConfigOptions] (val x: Self) extends AnyVal {
      
      inline def setAutocomplete(value: Boolean | String): Self = StObject.set(x, "autocomplete", value.asInstanceOf[js.Any])
      
      inline def setAutocompleteUndefined: Self = StObject.set(x, "autocomplete", js.undefined)
      
      inline def setAutofocus(value: Boolean): Self = StObject.set(x, "autofocus", value.asInstanceOf[js.Any])
      
      inline def setAutofocusUndefined: Self = StObject.set(x, "autofocus", js.undefined)
      
      inline def setLabelPosition(value: before | after): Self = StObject.set(x, "labelPosition", value.asInstanceOf[js.Any])
      
      inline def setLabelPositionUndefined: Self = StObject.set(x, "labelPosition", js.undefined)
      
      inline def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
      
      inline def setMinLength(value: Double): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
      
      inline def setMinLengthUndefined: Self = StObject.set(x, "minLength", js.undefined)
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      inline def setSpellcheck(value: Boolean): Self = StObject.set(x, "spellcheck", value.asInstanceOf[js.Any])
      
      inline def setSpellcheckUndefined: Self = StObject.set(x, "spellcheck", js.undefined)
      
      inline def setType(value: LiteralUnion[text | password | email | url | number]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setValidate(
        value: js.RegExp | String | (js.Function1[/* value */ String, Boolean | (Promise[Boolean, Any, Any])])
      ): Self = StObject.set(x, "validate", value.asInstanceOf[js.Any])
      
      inline def setValidateFunction1(value: /* value */ String => Boolean | (Promise[Boolean, Any, Any])): Self = StObject.set(x, "validate", js.Any.fromFunction1(value))
      
      inline def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
    }
  }
  
  @js.native
  trait Constructor
    extends StObject
       with /** @param config Configuration options */
  Instantiable0[TextInputWidget]
       with Instantiable1[/* config */ ConfigOptions, TextInputWidget] {
    
    /** @deprecated Use `super` instead */
    var parent: typings.oojsUi.OO.ui.InputWidget.Constructor = js.native
    
    var static: Static = js.native
    
    var `super`: typings.oojsUi.OO.ui.InputWidget.Constructor = js.native
  }
  
  trait EventMap
    extends StObject
       with typings.oojsUi.OO.ui.InputWidget.EventMap
       with typings.oojsUi.OO.ui.mixin.LabelElement.EventMap
       with typings.oojsUi.OO.ui.mixin.FlaggedElement.EventMap {
    
    var enter: js.Array[Any]
  }
  object EventMap {
    
    inline def apply(
      change: js.Array[/* value */ String],
      disable: js.Array[/* disabled */ Boolean],
      enter: js.Array[Any],
      flag: js.Array[/* changes */ Record[String, Boolean]],
      labelChange: js.Array[Any],
      toggle: js.Array[/* visible */ Boolean]
    ): EventMap = {
      val __obj = js.Dynamic.literal(change = change.asInstanceOf[js.Any], disable = disable.asInstanceOf[js.Any], enter = enter.asInstanceOf[js.Any], flag = flag.asInstanceOf[js.Any], labelChange = labelChange.asInstanceOf[js.Any], toggle = toggle.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventMap]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EventMap] (val x: Self) extends AnyVal {
      
      inline def setEnter(value: js.Array[Any]): Self = StObject.set(x, "enter", value.asInstanceOf[js.Any])
      
      inline def setEnterVarargs(value: Any*): Self = StObject.set(x, "enter", js.Array(value*))
    }
  }
  
  /**
    * @see https://www.mediawiki.org/wiki/OOUI/Elements/Flagged#TextInputWidget
    */
  type Flag = invalid
  
  trait Props
    extends StObject
       with typings.oojsUi.OO.ui.InputWidget.Props
       with typings.oojsUi.OO.ui.mixin.IconElement.Props
       with typings.oojsUi.OO.ui.mixin.IndicatorElement.Props
       with typings.oojsUi.OO.ui.mixin.PendingElement.Props
       with typings.oojsUi.OO.ui.mixin.LabelElement.Props
       with typings.oojsUi.OO.ui.mixin.FlaggedElement.Props
       with typings.oojsUi.OO.ui.mixin.RequiredElement.Props
  object Props {
    
    inline def apply(
      $accessKeyed: JQuery[HTMLElement],
      $element: JQuery[HTMLElement],
      $flagged: JQuery[HTMLElement],
      $icon: JQuery[HTMLElement],
      $indicator: JQuery[HTMLElement],
      $input: JQuery[HTMLElement],
      $label: JQuery[HTMLElement],
      $pending: JQuery[HTMLElement],
      $required: JQuery[HTMLElement],
      $tabIndexed: JQuery[HTMLElement],
      $titled: JQuery[HTMLElement]
    ): Props = {
      val __obj = js.Dynamic.literal($accessKeyed = $accessKeyed.asInstanceOf[js.Any], $element = $element.asInstanceOf[js.Any], $flagged = $flagged.asInstanceOf[js.Any], $icon = $icon.asInstanceOf[js.Any], $indicator = $indicator.asInstanceOf[js.Any], $input = $input.asInstanceOf[js.Any], $label = $label.asInstanceOf[js.Any], $pending = $pending.asInstanceOf[js.Any], $required = $required.asInstanceOf[js.Any], $tabIndexed = $tabIndexed.asInstanceOf[js.Any], $titled = $titled.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
  }
  
  @js.native
  trait Prototype
    extends StObject
       with typings.oojsUi.OO.ui.InputWidget.Prototype
       with typings.oojsUi.OO.ui.mixin.IconElement.Prototype
       with typings.oojsUi.OO.ui.mixin.IndicatorElement.Prototype
       with typings.oojsUi.OO.ui.mixin.PendingElement.Prototype
       with typings.oojsUi.OO.ui.mixin.LabelElement.Prototype
       with typings.oojsUi.OO.ui.mixin.FlaggedElement.Prototype
       with typings.oojsUi.OO.ui.mixin.RequiredElement.Prototype {
    
    @JSName("emitThrow")
    def emitThrow_enter(
      event: enter,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventMap[K] is not an array type */ args: js.Array[Any]
    ): Boolean = js.native
    @JSName("emitThrow")
    def emitThrow_enter[K /* <: String */](
      event: /* import warning: importer.ImportType#apply Failed type conversion: K extends 'enter' ? never : K */ js.Any,
      args: Any*
    ): Boolean = js.native
    @JSName("emitThrow")
    def emitThrow_flag(
      event: flag,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventMap[K] is not an array type */ args: js.Array[/* changes */ Record[String, Boolean]]
    ): Boolean = js.native
    @JSName("emitThrow")
    def emitThrow_labelChange(
      event: labelChange,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventMap[K] is not an array type */ args: js.Array[Any]
    ): Boolean = js.native
    
    @JSName("emit")
    def emit_enter(
      event: enter,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventMap[K] is not an array type */ args: js.Array[Any]
    ): Boolean = js.native
    @JSName("emit")
    def emit_enter[K /* <: String */](
      event: /* import warning: importer.ImportType#apply Failed type conversion: K extends 'enter' ? never : K */ js.Any,
      args: Any*
    ): Boolean = js.native
    @JSName("emit")
    def emit_flag(
      event: flag,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventMap[K] is not an array type */ args: js.Array[/* changes */ Record[String, Boolean]]
    ): Boolean = js.native
    @JSName("emit")
    def emit_labelChange(
      event: labelChange,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventMap[K] is not an array type */ args: js.Array[Any]
    ): Boolean = js.native
    
    /**
      * Insert new content either side of a selection.
      *
      * @param pre Content to be inserted before the selection
      * @param post Content to be inserted after the selection
      * @return The widget, for chaining
      */
    def encapsulateContent(pre: String, post: String): this.type = js.native
    
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
      * Get the length of the text input value.
      *
      * This could differ from the length of {@link getValue} if the value gets filtered
      *
      * @return Input length
      */
    def getInputLength(): Double = js.native
    
    /**
      * Get an object describing the current selection range in a directional manner
      *
      * @return Object containing 'from' and 'to' offsets
      */
    def getRange(): Range = js.native
    
    /**
      * Get the validity of current value.
      *
      * This method returns a promise that resolves if the value is valid and rejects if
      * it isn't. Uses the {@link ConfigOptions.validate validation pattern}  to check for
      * validity.
      *
      * @return A promise that resolves if the value is valid, rejects if not.
      */
    def getValidity(): Promise[Unit, Any, Any] = js.native
    
    /**
      * Insert new content into the input.
      *
      * @param content Content to be inserted
      * @return The widget, for chaining
      */
    def insertContent(content: String): this.type = js.native
    
    /**
      * Support function for making onElementAttach work across browsers.
      *
      * Due to MutationObserver performance woes, onElementAttach is only somewhat reliably
      * called the first time that the element gets attached to the documented.
      */
    def installParentChangeDetector(): Unit = js.native
    
    /**
      * Check if the input is {@link ConfigOptions.readOnly read-only}.
      *
      * @return
      */
    def isReadOnly(): Boolean = js.native
    
    /**
      * Focus the input and move the cursor to the end.
      *
      * @return The widget, for chaining
      */
    def moveCursorToEnd(): this.type = js.native
    
    /**
      * Focus the input and move the cursor to the start.
      *
      * @return The widget, for chaining
      */
    def moveCursorToStart(): this.type = js.native
    
    @JSName("off")
    def off_enter[C](event: enter): this.type = js.native
    @JSName("off")
    def off_enter[C](event: enter, method: Unit, context: C): this.type = js.native
    @JSName("off")
    def off_enter[C](
      event: enter,
      method: EventHandler[C, js.ThisFunction1[/* this */ C, /* args */ js.Array[Any], Unit]]
    ): this.type = js.native
    @JSName("off")
    def off_enter[C](
      event: enter,
      method: EventHandler[C, js.ThisFunction1[/* this */ C, /* args */ js.Array[Any], Unit]],
      context: C
    ): this.type = js.native
    @JSName("off")
    def off_enter[K /* <: String */, C](
      event: /* import warning: importer.ImportType#apply Failed type conversion: K extends 'enter' ? never : K */ js.Any
    ): this.type = js.native
    @JSName("off")
    def off_enter[K /* <: String */, C](
      event: /* import warning: importer.ImportType#apply Failed type conversion: K extends 'enter' ? never : K */ js.Any,
      method: Unit,
      context: C
    ): this.type = js.native
    @JSName("off")
    def off_enter[K /* <: String */, C](
      event: /* import warning: importer.ImportType#apply Failed type conversion: K extends 'enter' ? never : K */ js.Any,
      method: EventHandler[C, js.ThisFunction1[/* this */ C, /* repeated */ Any, Unit]]
    ): this.type = js.native
    @JSName("off")
    def off_enter[K /* <: String */, C](
      event: /* import warning: importer.ImportType#apply Failed type conversion: K extends 'enter' ? never : K */ js.Any,
      method: EventHandler[C, js.ThisFunction1[/* this */ C, /* repeated */ Any, Unit]],
      context: C
    ): this.type = js.native
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
    
    @JSName("on")
    def on_enter[K /* <: String */, C](
      event: /* import warning: importer.ImportType#apply Failed type conversion: K extends 'enter' ? never : K */ js.Any,
      method: EventHandler[C, js.ThisFunction1[/* this */ C, /* repeated */ Any, Unit]]
    ): this.type = js.native
    @JSName("on")
    def on_enter[K /* <: String */, C](
      event: /* import warning: importer.ImportType#apply Failed type conversion: K extends 'enter' ? never : K */ js.Any,
      method: EventHandler[C, js.ThisFunction1[/* this */ C, /* repeated */ Any, Unit]],
      args: js.Array[Any]
    ): this.type = js.native
    @JSName("on")
    def on_enter[K /* <: String */, C](
      event: /* import warning: importer.ImportType#apply Failed type conversion: K extends 'enter' ? never : K */ js.Any,
      method: EventHandler[C, js.ThisFunction1[/* this */ C, /* repeated */ Any, Unit]],
      args: js.Array[Any],
      context: C
    ): this.type = js.native
    @JSName("on")
    def on_enter[K /* <: String */, C](
      event: /* import warning: importer.ImportType#apply Failed type conversion: K extends 'enter' ? never : K */ js.Any,
      method: EventHandler[C, js.ThisFunction1[/* this */ C, /* repeated */ Any, Unit]],
      args: Unit,
      context: C
    ): this.type = js.native
    // #region EventEmitter overloads
    @JSName("on")
    def on_enter[A /* <: ArgTuple */, C](
      event: enter,
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
    def on_enter[A /* <: ArgTuple */, C](
      event: enter,
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
    def on_enter[A /* <: ArgTuple */, C](
      event: enter,
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
    def on_enter[A /* <: ArgTuple */, C](
      event: enter,
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
    
    @JSName("once")
    def once_enter(event: enter, listener: js.ThisFunction1[/* this */ Null, /* args */ js.Array[Any], Unit]): this.type = js.native
    @JSName("once")
    def once_enter[K /* <: String */](
      event: /* import warning: importer.ImportType#apply Failed type conversion: K extends 'enter' ? never : K */ js.Any,
      listener: js.ThisFunction1[/* this */ Null, /* repeated */ Any, Unit]
    ): this.type = js.native
    @JSName("once")
    def once_flag(
      event: flag,
      listener: js.ThisFunction1[/* this */ Null, /* args */ js.Array[/* changes */ Record[String, Boolean]], Unit]
    ): this.type = js.native
    @JSName("once")
    def once_labelChange(event: labelChange, listener: js.ThisFunction1[/* this */ Null, /* args */ js.Array[Any], Unit]): this.type = js.native
    
    /**
      * Focus the input and select the entire text.
      *
      * @return The widget, for chaining
      */
    def select(): this.type = js.native
    
    /**
      * Focus the input and select a specified range within the text.
      *
      * @param from Select from offset
      * @param to Select to offset
      * @return The widget, for chaining
      */
    def selectRange(from: Double): this.type = js.native
    def selectRange(from: Double, to: Double): this.type = js.native
    
    /**
      * Set the position of the inline label relative to that of the value: `‘before’` or
      * `‘after’`.
      *
      * @param labelPosition Label position, 'before' or 'after'
      * @return The widget, for chaining
      */
    def setLabelPosition(labelPosition: before | after): this.type = js.native
    
    /**
      * Set the {@link ConfigOptions.readOnly read-only} state of the input.
      *
      * @param state Make input read-only
      * @return The widget, for chaining
      */
    def setReadOnly(state: Boolean): this.type = js.native
    
    /**
      * Set the validation pattern.
      *
      * The validation pattern is either a regular expression, a function, or the symbolic
      * name of a pattern defined by the class: 'non-empty' (the value cannot be an empty
      * string) or 'integer' (the value must contain only numbers).
      *
      * @param validate Regular expression, function, or the symbolic name of a pattern
      *  (either ‘integer’ or ‘non-empty’) defined by the class.
      */
    def setValidation(): Unit = js.native
    def setValidation(validate: String): Unit = js.native
    def setValidation(validate: js.Function1[/* value */ String, Boolean | (Promise[Boolean, Any, Any])]): Unit = js.native
    def setValidation(validate: js.RegExp): Unit = js.native
    
    /**
      * Sets the 'invalid' flag appropriately.
      *
      * @param isValid Optionally override validation result
      */
    def setValidityFlag(): Unit = js.native
    def setValidityFlag(isValid: Boolean): Unit = js.native
    
    /**
      * Update the position of the inline label.
      *
      * This method is called by {@link setLabelPosition}, and can also be called on its own
      * if something causes the label to be mispositioned.
      *
      * @return The widget, for chaining
      */
    def updatePosition(): this.type = js.native
  }
  
  trait Range extends StObject {
    
    var from: Double | Null
    
    var to: Double | Null
  }
  object Range {
    
    inline def apply(): Range = {
      val __obj = js.Dynamic.literal(from = null, to = null)
      __obj.asInstanceOf[Range]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Range] (val x: Self) extends AnyVal {
      
      inline def setFrom(value: Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setFromNull: Self = StObject.set(x, "from", null)
      
      inline def setTo(value: Double): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setToNull: Self = StObject.set(x, "to", null)
    }
  }
  
  @js.native
  trait Static
    extends StObject
       with typings.oojsUi.OO.ui.InputWidget.Static
       with typings.oojsUi.OO.ui.mixin.IconElement.Static
       with typings.oojsUi.OO.ui.mixin.IndicatorElement.Static
       with typings.oojsUi.OO.ui.mixin.LabelElement.Static
       with typings.oojsUi.OO.ui.mixin.FlaggedElement.Static {
    
    var validationPatterns: Record[String, js.RegExp] = js.native
  }
}
