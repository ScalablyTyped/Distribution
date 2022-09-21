package typings.notie

import typings.notie.anon.Overlay
import typings.notie.anon.PartialRecordalertforceco
import typings.notie.anon.PartialRecordcontainertex
import typings.notie.notieStrings.a
import typings.notie.notieStrings.an
import typings.notie.notieStrings.n
import typings.notie.notieStrings.s
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("notie", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def alert(options: AlertOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("alert")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def confirm(options: ConfirmOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("confirm")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def confirm(options: ConfirmOptions, submitCallback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("confirm")(options.asInstanceOf[js.Any], submitCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def confirm(options: ConfirmOptions, submitCallback: js.Function0[Unit], cancelCallback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("confirm")(options.asInstanceOf[js.Any], submitCallback.asInstanceOf[js.Any], cancelCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def confirm(options: ConfirmOptions, submitCallback: Unit, cancelCallback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("confirm")(options.asInstanceOf[js.Any], submitCallback.asInstanceOf[js.Any], cancelCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def date(options: DateOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("date")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def date(options: DateOptions, submitCallback: js.Function1[/* date */ js.Date, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("date")(options.asInstanceOf[js.Any], submitCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def date(
    options: DateOptions,
    submitCallback: js.Function1[/* date */ js.Date, Unit],
    cancelCallback: js.Function1[/* date */ js.Date, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("date")(options.asInstanceOf[js.Any], submitCallback.asInstanceOf[js.Any], cancelCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def date(options: DateOptions, submitCallback: Unit, cancelCallback: js.Function1[/* date */ js.Date, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("date")(options.asInstanceOf[js.Any], submitCallback.asInstanceOf[js.Any], cancelCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def force(options: ForceOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("force")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def force(options: ForceOptions, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("force")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def hideAlerts(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("hideAlerts")().asInstanceOf[Unit]
  inline def hideAlerts(callback: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("hideAlerts")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def input(options: InputOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("input")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def input(options: InputOptions, submitCallback: js.Function1[/* value */ String, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("input")(options.asInstanceOf[js.Any], submitCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def input(
    options: InputOptions,
    submitCallback: js.Function1[/* value */ String, Unit],
    cancelCallback: js.Function1[/* value */ String, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("input")(options.asInstanceOf[js.Any], submitCallback.asInstanceOf[js.Any], cancelCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def input(
    options: InputOptions,
    submitCallback: Unit,
    cancelCallback: js.Function1[/* value */ String, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("input")(options.asInstanceOf[js.Any], submitCallback.asInstanceOf[js.Any], cancelCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def select(options: SelectOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("select")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def select(options: SelectOptions, cancelCallback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("select")(options.asInstanceOf[js.Any], cancelCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setOptions(options: AllOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setOptions")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait AlertOptions extends StObject {
    
    /** @default 'top' */
    var position: js.UndefOr[Position] = js.undefined
    
    /** @default false */
    var stay: js.UndefOr[Boolean] = js.undefined
    
    var text: String
    
    /**
      * Time to linger in seconds.
      * Minimum: 1
      * @default 3
      */
    var time: js.UndefOr[Double] = js.undefined
    
    /** @default 4 */
    var `type`: js.UndefOr[AlertType] = js.undefined
  }
  object AlertOptions {
    
    inline def apply(text: String): AlertOptions = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[AlertOptions]
    }
    
    extension [Self <: AlertOptions](x: Self) {
      
      inline def setPosition(value: Position): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setStay(value: Boolean): Self = StObject.set(x, "stay", value.asInstanceOf[js.Any])
      
      inline def setStayUndefined: Self = StObject.set(x, "stay", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      inline def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
      
      inline def setType(value: AlertType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.notie.notieNumbers.`1`
    - typings.notie.notieNumbers.`2`
    - typings.notie.notieNumbers.`3`
    - typings.notie.notieNumbers.`4`
    - typings.notie.notieNumbers.`5`
    - typings.notie.notieStrings.success
    - typings.notie.notieStrings.warning
    - typings.notie.notieStrings.error
    - typings.notie.notieStrings.info
    - typings.notie.notieStrings.neutral
  */
  trait AlertType extends StObject
  object AlertType {
    
    inline def `1`: typings.notie.notieNumbers.`1` = 1.asInstanceOf[typings.notie.notieNumbers.`1`]
    
    inline def `2`: typings.notie.notieNumbers.`2` = 2.asInstanceOf[typings.notie.notieNumbers.`2`]
    
    inline def `3`: typings.notie.notieNumbers.`3` = 3.asInstanceOf[typings.notie.notieNumbers.`3`]
    
    inline def `4`: typings.notie.notieNumbers.`4` = 4.asInstanceOf[typings.notie.notieNumbers.`4`]
    
    inline def `5`: typings.notie.notieNumbers.`5` = 5.asInstanceOf[typings.notie.notieNumbers.`5`]
    
    inline def error: typings.notie.notieStrings.error = "error".asInstanceOf[typings.notie.notieStrings.error]
    
    inline def info: typings.notie.notieStrings.info = "info".asInstanceOf[typings.notie.notieStrings.info]
    
    inline def neutral: typings.notie.notieStrings.neutral = "neutral".asInstanceOf[typings.notie.notieStrings.neutral]
    
    inline def success: typings.notie.notieStrings.success = "success".asInstanceOf[typings.notie.notieStrings.success]
    
    inline def warning: typings.notie.notieStrings.warning = "warning".asInstanceOf[typings.notie.notieStrings.warning]
  }
  
  trait AllOptions extends StObject {
    
    var alertTime: js.UndefOr[Double] = js.undefined
    
    var classes: js.UndefOr[PartialRecordcontainertex] = js.undefined
    
    var dateMonths: js.UndefOr[js.Array[String]] = js.undefined
    
    var ids: js.UndefOr[Overlay] = js.undefined
    
    var overlayClickDismiss: js.UndefOr[Boolean] = js.undefined
    
    var overlayOpacity: js.UndefOr[Double] = js.undefined
    
    var positions: js.UndefOr[PartialRecordalertforceco] = js.undefined
    
    var transitionCurve: js.UndefOr[String] = js.undefined
    
    var transitionDuration: js.UndefOr[Double] = js.undefined
    
    var transitionSelector: js.UndefOr[String] = js.undefined
  }
  object AllOptions {
    
    inline def apply(): AllOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AllOptions]
    }
    
    extension [Self <: AllOptions](x: Self) {
      
      inline def setAlertTime(value: Double): Self = StObject.set(x, "alertTime", value.asInstanceOf[js.Any])
      
      inline def setAlertTimeUndefined: Self = StObject.set(x, "alertTime", js.undefined)
      
      inline def setClasses(value: PartialRecordcontainertex): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
      
      inline def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
      
      inline def setDateMonths(value: js.Array[String]): Self = StObject.set(x, "dateMonths", value.asInstanceOf[js.Any])
      
      inline def setDateMonthsUndefined: Self = StObject.set(x, "dateMonths", js.undefined)
      
      inline def setDateMonthsVarargs(value: String*): Self = StObject.set(x, "dateMonths", js.Array(value*))
      
      inline def setIds(value: Overlay): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
      
      inline def setIdsUndefined: Self = StObject.set(x, "ids", js.undefined)
      
      inline def setOverlayClickDismiss(value: Boolean): Self = StObject.set(x, "overlayClickDismiss", value.asInstanceOf[js.Any])
      
      inline def setOverlayClickDismissUndefined: Self = StObject.set(x, "overlayClickDismiss", js.undefined)
      
      inline def setOverlayOpacity(value: Double): Self = StObject.set(x, "overlayOpacity", value.asInstanceOf[js.Any])
      
      inline def setOverlayOpacityUndefined: Self = StObject.set(x, "overlayOpacity", js.undefined)
      
      inline def setPositions(value: PartialRecordalertforceco): Self = StObject.set(x, "positions", value.asInstanceOf[js.Any])
      
      inline def setPositionsUndefined: Self = StObject.set(x, "positions", js.undefined)
      
      inline def setTransitionCurve(value: String): Self = StObject.set(x, "transitionCurve", value.asInstanceOf[js.Any])
      
      inline def setTransitionCurveUndefined: Self = StObject.set(x, "transitionCurve", js.undefined)
      
      inline def setTransitionDuration(value: Double): Self = StObject.set(x, "transitionDuration", value.asInstanceOf[js.Any])
      
      inline def setTransitionDurationUndefined: Self = StObject.set(x, "transitionDuration", js.undefined)
      
      inline def setTransitionSelector(value: String): Self = StObject.set(x, "transitionSelector", value.asInstanceOf[js.Any])
      
      inline def setTransitionSelectorUndefined: Self = StObject.set(x, "transitionSelector", js.undefined)
    }
  }
  
  trait ConfirmOptions extends StObject {
    
    var cancelCallback: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** @default 'Cancel' */
    var cancelText: js.UndefOr[String] = js.undefined
    
    /** @default 'top' */
    var position: js.UndefOr[Position] = js.undefined
    
    var submitCallback: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** @default 'Yes' */
    var submitText: js.UndefOr[String] = js.undefined
    
    var text: String
  }
  object ConfirmOptions {
    
    inline def apply(text: String): ConfirmOptions = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConfirmOptions]
    }
    
    extension [Self <: ConfirmOptions](x: Self) {
      
      inline def setCancelCallback(value: () => Unit): Self = StObject.set(x, "cancelCallback", js.Any.fromFunction0(value))
      
      inline def setCancelCallbackUndefined: Self = StObject.set(x, "cancelCallback", js.undefined)
      
      inline def setCancelText(value: String): Self = StObject.set(x, "cancelText", value.asInstanceOf[js.Any])
      
      inline def setCancelTextUndefined: Self = StObject.set(x, "cancelText", js.undefined)
      
      inline def setPosition(value: Position): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setSubmitCallback(value: () => Unit): Self = StObject.set(x, "submitCallback", js.Any.fromFunction0(value))
      
      inline def setSubmitCallbackUndefined: Self = StObject.set(x, "submitCallback", js.undefined)
      
      inline def setSubmitText(value: String): Self = StObject.set(x, "submitText", value.asInstanceOf[js.Any])
      
      inline def setSubmitTextUndefined: Self = StObject.set(x, "submitText", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  trait DateOptions extends StObject {
    
    /** @default 'Cancel' */
    var cancel: js.UndefOr[String] = js.undefined
    
    var cancelCallback: js.UndefOr[js.Function1[/* date */ js.Date, Unit]] = js.undefined
    
    /** @default 'top' */
    var position: js.UndefOr[Position] = js.undefined
    
    var submitCallback: js.UndefOr[js.Function1[/* date */ js.Date, Unit]] = js.undefined
    
    /** @default 'OK' */
    var submitText: js.UndefOr[String] = js.undefined
    
    var value: js.Date
  }
  object DateOptions {
    
    inline def apply(value: js.Date): DateOptions = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[DateOptions]
    }
    
    extension [Self <: DateOptions](x: Self) {
      
      inline def setCancel(value: String): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelCallback(value: /* date */ js.Date => Unit): Self = StObject.set(x, "cancelCallback", js.Any.fromFunction1(value))
      
      inline def setCancelCallbackUndefined: Self = StObject.set(x, "cancelCallback", js.undefined)
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setPosition(value: Position): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setSubmitCallback(value: /* date */ js.Date => Unit): Self = StObject.set(x, "submitCallback", js.Any.fromFunction1(value))
      
      inline def setSubmitCallbackUndefined: Self = StObject.set(x, "submitCallback", js.undefined)
      
      inline def setSubmitText(value: String): Self = StObject.set(x, "submitText", value.asInstanceOf[js.Any])
      
      inline def setSubmitTextUndefined: Self = StObject.set(x, "submitText", js.undefined)
      
      inline def setValue(value: js.Date): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait ForceOptions extends StObject {
    
    /** @default 'OK' */
    var buttonText: js.UndefOr[String] = js.undefined
    
    var callback: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** @default 'top' */
    var position: js.UndefOr[Position] = js.undefined
    
    var text: String
    
    /** @default 5 */
    var `type`: js.UndefOr[AlertType] = js.undefined
  }
  object ForceOptions {
    
    inline def apply(text: String): ForceOptions = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[ForceOptions]
    }
    
    extension [Self <: ForceOptions](x: Self) {
      
      inline def setButtonText(value: String): Self = StObject.set(x, "buttonText", value.asInstanceOf[js.Any])
      
      inline def setButtonTextUndefined: Self = StObject.set(x, "buttonText", js.undefined)
      
      inline def setCallback(value: () => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction0(value))
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setPosition(value: Position): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setType(value: AlertType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait InputOptions extends StObject {
    
    /** @default 'null' */
    var allowed: js.UndefOr[(js.Array[an | a | n | s]) | js.RegExp | Null] = js.undefined
    
    /** @default 'none' */
    var autocapitalize: js.UndefOr[String] = js.undefined
    
    /** @default 'off' */
    var autocomplete: js.UndefOr[String] = js.undefined
    
    /** @default 'off' */
    var autocorrect: js.UndefOr[String] = js.undefined
    
    /** @default 'true' */
    var autofocus: js.UndefOr[String] = js.undefined
    
    var cancelCallback: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.undefined
    
    /** @default 'Cancel' */
    var cancelText: js.UndefOr[String] = js.undefined
    
    /** @default 'verbatim' */
    var inputmode: js.UndefOr[String] = js.undefined
    
    /** @default '' */
    var max: js.UndefOr[String] = js.undefined
    
    /** @default '' */
    var maxlength: js.UndefOr[String] = js.undefined
    
    /** @default '' */
    var min: js.UndefOr[String] = js.undefined
    
    /** @default '' */
    var minlength: js.UndefOr[String] = js.undefined
    
    /** @default '' */
    var placeholder: js.UndefOr[String] = js.undefined
    
    /** @default 'top' */
    var position: js.UndefOr[Position] = js.undefined
    
    /** @default 'default' */
    var spellcheck: js.UndefOr[String] = js.undefined
    
    /** @default 'any' */
    var step: js.UndefOr[String] = js.undefined
    
    var submitCallback: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.undefined
    
    /** @default 'Submit' */
    var submitText: js.UndefOr[String] = js.undefined
    
    var text: String
    
    /** @default 'text' */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object InputOptions {
    
    inline def apply(text: String): InputOptions = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[InputOptions]
    }
    
    extension [Self <: InputOptions](x: Self) {
      
      inline def setAllowed(value: (js.Array[an | a | n | s]) | js.RegExp): Self = StObject.set(x, "allowed", value.asInstanceOf[js.Any])
      
      inline def setAllowedNull: Self = StObject.set(x, "allowed", null)
      
      inline def setAllowedUndefined: Self = StObject.set(x, "allowed", js.undefined)
      
      inline def setAllowedVarargs(value: (an | a | n | s)*): Self = StObject.set(x, "allowed", js.Array(value*))
      
      inline def setAutocapitalize(value: String): Self = StObject.set(x, "autocapitalize", value.asInstanceOf[js.Any])
      
      inline def setAutocapitalizeUndefined: Self = StObject.set(x, "autocapitalize", js.undefined)
      
      inline def setAutocomplete(value: String): Self = StObject.set(x, "autocomplete", value.asInstanceOf[js.Any])
      
      inline def setAutocompleteUndefined: Self = StObject.set(x, "autocomplete", js.undefined)
      
      inline def setAutocorrect(value: String): Self = StObject.set(x, "autocorrect", value.asInstanceOf[js.Any])
      
      inline def setAutocorrectUndefined: Self = StObject.set(x, "autocorrect", js.undefined)
      
      inline def setAutofocus(value: String): Self = StObject.set(x, "autofocus", value.asInstanceOf[js.Any])
      
      inline def setAutofocusUndefined: Self = StObject.set(x, "autofocus", js.undefined)
      
      inline def setCancelCallback(value: /* value */ String => Unit): Self = StObject.set(x, "cancelCallback", js.Any.fromFunction1(value))
      
      inline def setCancelCallbackUndefined: Self = StObject.set(x, "cancelCallback", js.undefined)
      
      inline def setCancelText(value: String): Self = StObject.set(x, "cancelText", value.asInstanceOf[js.Any])
      
      inline def setCancelTextUndefined: Self = StObject.set(x, "cancelText", js.undefined)
      
      inline def setInputmode(value: String): Self = StObject.set(x, "inputmode", value.asInstanceOf[js.Any])
      
      inline def setInputmodeUndefined: Self = StObject.set(x, "inputmode", js.undefined)
      
      inline def setMax(value: String): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMaxlength(value: String): Self = StObject.set(x, "maxlength", value.asInstanceOf[js.Any])
      
      inline def setMaxlengthUndefined: Self = StObject.set(x, "maxlength", js.undefined)
      
      inline def setMin(value: String): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      inline def setMinlength(value: String): Self = StObject.set(x, "minlength", value.asInstanceOf[js.Any])
      
      inline def setMinlengthUndefined: Self = StObject.set(x, "minlength", js.undefined)
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setPosition(value: Position): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setSpellcheck(value: String): Self = StObject.set(x, "spellcheck", value.asInstanceOf[js.Any])
      
      inline def setSpellcheckUndefined: Self = StObject.set(x, "spellcheck", js.undefined)
      
      inline def setStep(value: String): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
      
      inline def setSubmitCallback(value: /* value */ String => Unit): Self = StObject.set(x, "submitCallback", js.Any.fromFunction1(value))
      
      inline def setSubmitCallbackUndefined: Self = StObject.set(x, "submitCallback", js.undefined)
      
      inline def setSubmitText(value: String): Self = StObject.set(x, "submitText", value.asInstanceOf[js.Any])
      
      inline def setSubmitTextUndefined: Self = StObject.set(x, "submitText", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.notie.notieStrings.top
    - typings.notie.notieStrings.bottom
  */
  trait Position extends StObject
  object Position {
    
    inline def bottom: typings.notie.notieStrings.bottom = "bottom".asInstanceOf[typings.notie.notieStrings.bottom]
    
    inline def top: typings.notie.notieStrings.top = "top".asInstanceOf[typings.notie.notieStrings.top]
  }
  
  trait SelectChoice extends StObject {
    
    def handler(): Unit
    
    var text: String
    
    /** @default 1 */
    var `type`: js.UndefOr[String | Double] = js.undefined
  }
  object SelectChoice {
    
    inline def apply(handler: () => Unit, text: String): SelectChoice = {
      val __obj = js.Dynamic.literal(handler = js.Any.fromFunction0(handler), text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectChoice]
    }
    
    extension [Self <: SelectChoice](x: Self) {
      
      inline def setHandler(value: () => Unit): Self = StObject.set(x, "handler", js.Any.fromFunction0(value))
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setType(value: String | Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait SelectOptions extends StObject {
    
    var cancelCallback: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** @default 'Cancel' */
    var cancelText: js.UndefOr[String] = js.undefined
    
    var choices: js.Array[SelectChoice]
    
    /** @default 'bottom' */
    var position: js.UndefOr[Position] = js.undefined
    
    var text: String
  }
  object SelectOptions {
    
    inline def apply(choices: js.Array[SelectChoice], text: String): SelectOptions = {
      val __obj = js.Dynamic.literal(choices = choices.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectOptions]
    }
    
    extension [Self <: SelectOptions](x: Self) {
      
      inline def setCancelCallback(value: () => Unit): Self = StObject.set(x, "cancelCallback", js.Any.fromFunction0(value))
      
      inline def setCancelCallbackUndefined: Self = StObject.set(x, "cancelCallback", js.undefined)
      
      inline def setCancelText(value: String): Self = StObject.set(x, "cancelText", value.asInstanceOf[js.Any])
      
      inline def setCancelTextUndefined: Self = StObject.set(x, "cancelText", js.undefined)
      
      inline def setChoices(value: js.Array[SelectChoice]): Self = StObject.set(x, "choices", value.asInstanceOf[js.Any])
      
      inline def setChoicesVarargs(value: SelectChoice*): Self = StObject.set(x, "choices", js.Array(value*))
      
      inline def setPosition(value: Position): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
}
