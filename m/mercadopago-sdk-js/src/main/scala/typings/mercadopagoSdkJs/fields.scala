package typings.mercadopagoSdkJs

import typings.mercadopagoSdkJs.anon.Fingerprint
import typings.mercadopagoSdkJs.mercadopagoSdkJsStrings.full
import typings.mercadopagoSdkJs.mercadopagoSdkJsStrings.invalid_length
import typings.mercadopagoSdkJs.mercadopagoSdkJsStrings.invalid_type
import typings.mercadopagoSdkJs.mercadopagoSdkJsStrings.invalid_value
import typings.mercadopagoSdkJs.mercadopagoSdkJsStrings.short
import typings.mercadopagoSdkJs.shared.CardNumber
import typings.mercadopagoSdkJs.shared.CardTokenResponse
import typings.mercadopagoSdkJs.shared.CustomFonts
import typings.mercadopagoSdkJs.shared.FieldStyle
import typings.mercadopagoSdkJs.shared.SecurityCode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fields {
  
  trait BaseFieldsOptions extends StObject {
    
    var customFonts: js.UndefOr[js.Array[CustomFonts]] = js.undefined
    
    var group: js.UndefOr[String] = js.undefined
  }
  object BaseFieldsOptions {
    
    inline def apply(): BaseFieldsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseFieldsOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BaseFieldsOptions] (val x: Self) extends AnyVal {
      
      inline def setCustomFonts(value: js.Array[CustomFonts]): Self = StObject.set(x, "customFonts", value.asInstanceOf[js.Any])
      
      inline def setCustomFontsUndefined: Self = StObject.set(x, "customFonts", js.undefined)
      
      inline def setCustomFontsVarargs(value: CustomFonts*): Self = StObject.set(x, "customFonts", js.Array(value*))
      
      inline def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
      
      inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    }
  }
  
  trait BinChangeArg
    extends StObject
       with DefaultArg {
    
    var bin: js.UndefOr[String] = js.undefined
  }
  object BinChangeArg {
    
    inline def apply(field: String): BinChangeArg = {
      val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
      __obj.asInstanceOf[BinChangeArg]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BinChangeArg] (val x: Self) extends AnyVal {
      
      inline def setBin(value: String): Self = StObject.set(x, "bin", value.asInstanceOf[js.Any])
      
      inline def setBinUndefined: Self = StObject.set(x, "bin", js.undefined)
    }
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    FieldEvent extends 'blur' ? mercadopago-sdk-js.fields.DefaultArg : FieldEvent extends 'focus' ? mercadopago-sdk-js.fields.DefaultArg : FieldEvent extends 'ready' ? mercadopago-sdk-js.fields.DefaultArg : FieldEvent extends 'change' ? mercadopago-sdk-js.fields.DefaultArg : FieldEvent extends 'validityChange' ? mercadopago-sdk-js.fields.ValidityChangeArg<FieldName> : FieldEvent extends 'error' ? mercadopago-sdk-js.fields.ErrorArg : FieldEvent extends 'binChange' ? mercadopago-sdk-js.fields.BinChangeArg : mercadopago-sdk-js.fields.DefaultArg
    }}}
    */
  type CallbackArgs[FieldEvent, FieldName] = DefaultArg
  
  type CardNumberCause = InvalidType | InvalidLength
  
  trait CardNumberOptions
    extends StObject
       with BaseFieldsOptions {
    
    var enableLuhnValidation: js.UndefOr[Boolean] = js.undefined
  }
  object CardNumberOptions {
    
    inline def apply(): CardNumberOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CardNumberOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CardNumberOptions] (val x: Self) extends AnyVal {
      
      inline def setEnableLuhnValidation(value: Boolean): Self = StObject.set(x, "enableLuhnValidation", value.asInstanceOf[js.Any])
      
      inline def setEnableLuhnValidationUndefined: Self = StObject.set(x, "enableLuhnValidation", js.undefined)
    }
  }
  
  trait DateYearFieldsOptions
    extends StObject
       with BaseFieldsOptions {
    
    var mode: js.UndefOr[short | full] = js.undefined
  }
  object DateYearFieldsOptions {
    
    inline def apply(): DateYearFieldsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DateYearFieldsOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DateYearFieldsOptions] (val x: Self) extends AnyVal {
      
      inline def setMode(value: short | full): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    }
  }
  
  trait DefaultArg extends StObject {
    
    var field: String
  }
  object DefaultArg {
    
    inline def apply(field: String): DefaultArg = {
      val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
      __obj.asInstanceOf[DefaultArg]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DefaultArg] (val x: Self) extends AnyVal {
      
      inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    }
  }
  
  trait ErrorArg
    extends StObject
       with DefaultArg {
    
    var error: String
  }
  object ErrorArg {
    
    inline def apply(error: String, field: String): ErrorArg = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any])
      __obj.asInstanceOf[ErrorArg]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ErrorArg] (val x: Self) extends AnyVal {
      
      inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    }
  }
  
  trait ErrorMessage[FieldName] extends StObject {
    
    var cause: /* import warning: importer.ImportType#apply Failed type conversion: FieldName extends 'cardNumber' ? mercadopago-sdk-js.fields.CardNumberCause : FieldName extends 'securityCode' ? mercadopago-sdk-js.fields.SecurityCodeCause : FieldName extends 'expirationMonth' ? mercadopago-sdk-js.fields.ExpirationDateCause : FieldName extends 'expirationYear' ? mercadopago-sdk-js.fields.ExpirationYearCause : FieldName extends 'expirationDate' ? mercadopago-sdk-js.fields.ExpirationDateCause : never */ js.Any
    
    var message: String
  }
  object ErrorMessage {
    
    inline def apply[FieldName](
      cause: /* import warning: importer.ImportType#apply Failed type conversion: FieldName extends 'cardNumber' ? mercadopago-sdk-js.fields.CardNumberCause : FieldName extends 'securityCode' ? mercadopago-sdk-js.fields.SecurityCodeCause : FieldName extends 'expirationMonth' ? mercadopago-sdk-js.fields.ExpirationDateCause : FieldName extends 'expirationYear' ? mercadopago-sdk-js.fields.ExpirationYearCause : FieldName extends 'expirationDate' ? mercadopago-sdk-js.fields.ExpirationDateCause : never */ js.Any,
      message: String
    ): ErrorMessage[FieldName] = {
      val __obj = js.Dynamic.literal(cause = cause.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[ErrorMessage[FieldName]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ErrorMessage[?], FieldName] (val x: Self & ErrorMessage[FieldName]) extends AnyVal {
      
      inline def setCause(
        value: /* import warning: importer.ImportType#apply Failed type conversion: FieldName extends 'cardNumber' ? mercadopago-sdk-js.fields.CardNumberCause : FieldName extends 'securityCode' ? mercadopago-sdk-js.fields.SecurityCodeCause : FieldName extends 'expirationMonth' ? mercadopago-sdk-js.fields.ExpirationDateCause : FieldName extends 'expirationYear' ? mercadopago-sdk-js.fields.ExpirationYearCause : FieldName extends 'expirationDate' ? mercadopago-sdk-js.fields.ExpirationDateCause : never */ js.Any
      ): Self = StObject.set(x, "cause", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
  
  type ExpirationDateCause = ExpirationYearCause
  
  type ExpirationMonthCause = InvalidType | InvalidValue
  
  type ExpirationYearCause = ExpirationMonthCause | CardNumberCause
  
  trait Field extends StObject {
    
    def blur(): Unit
    
    def focus(): Unit
    
    def mount(container: String): Unit
    
    def on[FieldEvent](event: FieldEvent, callback: js.Function1[/* args */ CallbackArgs[FieldEvent, FieldName], Unit]): Unit
    
    def unmount(): Unit
    
    def update(properties: FieldsUpdatableProperties): Unit
  }
  object Field {
    
    inline def apply(
      blur: () => Unit,
      focus: () => Unit,
      mount: String => Unit,
      on: (Any, js.Function1[/* args */ CallbackArgs[Any, FieldName], Unit]) => Unit,
      unmount: () => Unit,
      update: FieldsUpdatableProperties => Unit
    ): Field = {
      val __obj = js.Dynamic.literal(blur = js.Any.fromFunction0(blur), focus = js.Any.fromFunction0(focus), mount = js.Any.fromFunction1(mount), on = js.Any.fromFunction2(on), unmount = js.Any.fromFunction0(unmount), update = js.Any.fromFunction1(update))
      __obj.asInstanceOf[Field]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Field] (val x: Self) extends AnyVal {
      
      inline def setBlur(value: () => Unit): Self = StObject.set(x, "blur", js.Any.fromFunction0(value))
      
      inline def setFocus(value: () => Unit): Self = StObject.set(x, "focus", js.Any.fromFunction0(value))
      
      inline def setMount(value: String => Unit): Self = StObject.set(x, "mount", js.Any.fromFunction1(value))
      
      inline def setOn(value: (Any, js.Function1[/* args */ CallbackArgs[Any, FieldName], Unit]) => Unit): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
      
      inline def setUnmount(value: () => Unit): Self = StObject.set(x, "unmount", js.Any.fromFunction0(value))
      
      inline def setUpdate(value: FieldsUpdatableProperties => Unit): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.mercadopagoSdkJs.mercadopagoSdkJsStrings.blur
    - typings.mercadopagoSdkJs.mercadopagoSdkJsStrings.focus
    - typings.mercadopagoSdkJs.mercadopagoSdkJsStrings.change
    - typings.mercadopagoSdkJs.mercadopagoSdkJsStrings.ready
    - typings.mercadopagoSdkJs.mercadopagoSdkJsStrings.validityChange
    - typings.mercadopagoSdkJs.mercadopagoSdkJsStrings.error
    - typings.mercadopagoSdkJs.mercadopagoSdkJsStrings.binChange
    - typings.mercadopagoSdkJs.mercadopagoSdkJsStrings.paste
  */
  trait FieldEvent extends StObject
  object FieldEvent {
    
    inline def binChange: typings.mercadopagoSdkJs.mercadopagoSdkJsStrings.binChange = "binChange".asInstanceOf[typings.mercadopagoSdkJs.mercadopagoSdkJsStrings.binChange]
    
    inline def blur: typings.mercadopagoSdkJs.mercadopagoSdkJsStrings.blur = "blur".asInstanceOf[typings.mercadopagoSdkJs.mercadopagoSdkJsStrings.blur]
    
    inline def change: typings.mercadopagoSdkJs.mercadopagoSdkJsStrings.change = "change".asInstanceOf[typings.mercadopagoSdkJs.mercadopagoSdkJsStrings.change]
    
    inline def error: typings.mercadopagoSdkJs.mercadopagoSdkJsStrings.error = "error".asInstanceOf[typings.mercadopagoSdkJs.mercadopagoSdkJsStrings.error]
    
    inline def focus: typings.mercadopagoSdkJs.mercadopagoSdkJsStrings.focus = "focus".asInstanceOf[typings.mercadopagoSdkJs.mercadopagoSdkJsStrings.focus]
    
    inline def paste: typings.mercadopagoSdkJs.mercadopagoSdkJsStrings.paste = "paste".asInstanceOf[typings.mercadopagoSdkJs.mercadopagoSdkJsStrings.paste]
    
    inline def ready: typings.mercadopagoSdkJs.mercadopagoSdkJsStrings.ready = "ready".asInstanceOf[typings.mercadopagoSdkJs.mercadopagoSdkJsStrings.ready]
    
    inline def validityChange: typings.mercadopagoSdkJs.mercadopagoSdkJsStrings.validityChange = "validityChange".asInstanceOf[typings.mercadopagoSdkJs.mercadopagoSdkJsStrings.validityChange]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.mercadopagoSdkJs.mercadopagoSdkJsStrings.securityCode
    - typings.mercadopagoSdkJs.mercadopagoSdkJsStrings.cardNumber
    - typings.mercadopagoSdkJs.mercadopagoSdkJsStrings.expirationDate
    - typings.mercadopagoSdkJs.mercadopagoSdkJsStrings.expirationMonth
    - typings.mercadopagoSdkJs.mercadopagoSdkJsStrings.expirationYear
  */
  trait FieldName extends StObject
  object FieldName {
    
    inline def cardNumber: typings.mercadopagoSdkJs.mercadopagoSdkJsStrings.cardNumber = "cardNumber".asInstanceOf[typings.mercadopagoSdkJs.mercadopagoSdkJsStrings.cardNumber]
    
    inline def expirationDate: typings.mercadopagoSdkJs.mercadopagoSdkJsStrings.expirationDate = "expirationDate".asInstanceOf[typings.mercadopagoSdkJs.mercadopagoSdkJsStrings.expirationDate]
    
    inline def expirationMonth: typings.mercadopagoSdkJs.mercadopagoSdkJsStrings.expirationMonth = "expirationMonth".asInstanceOf[typings.mercadopagoSdkJs.mercadopagoSdkJsStrings.expirationMonth]
    
    inline def expirationYear: typings.mercadopagoSdkJs.mercadopagoSdkJsStrings.expirationYear = "expirationYear".asInstanceOf[typings.mercadopagoSdkJs.mercadopagoSdkJsStrings.expirationYear]
    
    inline def securityCode: typings.mercadopagoSdkJs.mercadopagoSdkJsStrings.securityCode = "securityCode".asInstanceOf[typings.mercadopagoSdkJs.mercadopagoSdkJsStrings.securityCode]
  }
  
  @js.native
  trait Fields extends StObject {
    
    def create(field: FieldName): Field = js.native
    def create(field: FieldName, options: FieldsOptions[FieldName]): Field = js.native
    
    def createCardToken(nonPCIData: FieldsCardTokenParams, options: OptionsToken): js.Promise[js.UndefOr[CardTokenResponse]] = js.native
    
    def updateCardToken(token: String, options: OptionsToken): js.Promise[js.UndefOr[CardTokenResponse]] = js.native
  }
  
  trait FieldsCardTokenParams extends StObject {
    
    var cardId: js.UndefOr[String] = js.undefined
    
    var cardholderName: js.UndefOr[String] = js.undefined
    
    var identificationNumber: js.UndefOr[String] = js.undefined
    
    var identificationType: js.UndefOr[String] = js.undefined
  }
  object FieldsCardTokenParams {
    
    inline def apply(): FieldsCardTokenParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FieldsCardTokenParams]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FieldsCardTokenParams] (val x: Self) extends AnyVal {
      
      inline def setCardId(value: String): Self = StObject.set(x, "cardId", value.asInstanceOf[js.Any])
      
      inline def setCardIdUndefined: Self = StObject.set(x, "cardId", js.undefined)
      
      inline def setCardholderName(value: String): Self = StObject.set(x, "cardholderName", value.asInstanceOf[js.Any])
      
      inline def setCardholderNameUndefined: Self = StObject.set(x, "cardholderName", js.undefined)
      
      inline def setIdentificationNumber(value: String): Self = StObject.set(x, "identificationNumber", value.asInstanceOf[js.Any])
      
      inline def setIdentificationNumberUndefined: Self = StObject.set(x, "identificationNumber", js.undefined)
      
      inline def setIdentificationType(value: String): Self = StObject.set(x, "identificationType", value.asInstanceOf[js.Any])
      
      inline def setIdentificationTypeUndefined: Self = StObject.set(x, "identificationType", js.undefined)
    }
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends 'cardNumber' ? mercadopago-sdk-js.fields.CardNumberOptions : T extends 'securityCode' ? mercadopago-sdk-js.fields.BaseFieldsOptions : T extends 'expirationMonth' ? mercadopago-sdk-js.fields.BaseFieldsOptions : T extends 'expirationYear' ? mercadopago-sdk-js.fields.DateYearFieldsOptions : T extends 'expirationDate' ? mercadopago-sdk-js.fields.DateYearFieldsOptions : never
    }}}
    */
  type FieldsOptions[T] = CardNumberOptions
  
  trait FieldsUpdatableProperties extends StObject {
    
    var placeholder: js.UndefOr[String] = js.undefined
    
    var settings: js.UndefOr[SecurityCode | CardNumber] = js.undefined
    
    var style: js.UndefOr[FieldStyle] = js.undefined
  }
  object FieldsUpdatableProperties {
    
    inline def apply(): FieldsUpdatableProperties = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FieldsUpdatableProperties]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FieldsUpdatableProperties] (val x: Self) extends AnyVal {
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setSettings(value: SecurityCode | CardNumber): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
      
      inline def setSettingsUndefined: Self = StObject.set(x, "settings", js.undefined)
      
      inline def setStyle(value: FieldStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  type InvalidLength = invalid_length
  
  type InvalidType = invalid_type
  
  type InvalidValue = invalid_value
  
  type OptionsToken = js.UndefOr[Fingerprint | String]
  
  type SecurityCodeCause = CardNumberCause
  
  trait ValidityChangeArg[FieldName]
    extends StObject
       with DefaultArg {
    
    var errorMessages: ErrorMessage[js.Array[FieldName]]
  }
  object ValidityChangeArg {
    
    inline def apply[FieldName](errorMessages: ErrorMessage[js.Array[FieldName]], field: String): ValidityChangeArg[FieldName] = {
      val __obj = js.Dynamic.literal(errorMessages = errorMessages.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValidityChangeArg[FieldName]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ValidityChangeArg[?], FieldName] (val x: Self & ValidityChangeArg[FieldName]) extends AnyVal {
      
      inline def setErrorMessages(value: ErrorMessage[js.Array[FieldName]]): Self = StObject.set(x, "errorMessages", value.asInstanceOf[js.Any])
    }
  }
}
