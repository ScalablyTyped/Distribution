package typings.mercadopagoSdkJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object shared {
  
  trait Bin extends StObject {
    
    var exclusion_pattern: String
    
    var installments_pattern: String
    
    var pattern: String
  }
  object Bin {
    
    inline def apply(exclusion_pattern: String, installments_pattern: String, pattern: String): Bin = {
      val __obj = js.Dynamic.literal(exclusion_pattern = exclusion_pattern.asInstanceOf[js.Any], installments_pattern = installments_pattern.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any])
      __obj.asInstanceOf[Bin]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Bin] (val x: Self) extends AnyVal {
      
      inline def setExclusion_pattern(value: String): Self = StObject.set(x, "exclusion_pattern", value.asInstanceOf[js.Any])
      
      inline def setInstallments_pattern(value: String): Self = StObject.set(x, "installments_pattern", value.asInstanceOf[js.Any])
      
      inline def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    }
  }
  
  trait CardNumber extends StObject {
    
    var length: Double
    
    var validation: String
  }
  object CardNumber {
    
    inline def apply(length: Double, validation: String): CardNumber = {
      val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], validation = validation.asInstanceOf[js.Any])
      __obj.asInstanceOf[CardNumber]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CardNumber] (val x: Self) extends AnyVal {
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setValidation(value: String): Self = StObject.set(x, "validation", value.asInstanceOf[js.Any])
    }
  }
  
  trait CardTokenResponse extends StObject {
    
    var card_id: js.UndefOr[Any] = js.undefined
    
    var card_number_length: Double
    
    var cardholder: Cardholder
    
    var date_created: js.Date
    
    var date_due: js.Date
    
    var date_last_updated: js.Date
    
    var date_used: js.UndefOr[Any] = js.undefined
    
    var expiration_month: Double
    
    var expiration_year: Double
    
    var first_six_digits: String
    
    var id: String
    
    var last_four_digits: String
    
    var live_mode: Boolean
    
    var luhn_validation: Boolean
    
    var public_key: String
    
    var security_code_length: Double
    
    var status: String
  }
  object CardTokenResponse {
    
    inline def apply(
      card_number_length: Double,
      cardholder: Cardholder,
      date_created: js.Date,
      date_due: js.Date,
      date_last_updated: js.Date,
      expiration_month: Double,
      expiration_year: Double,
      first_six_digits: String,
      id: String,
      last_four_digits: String,
      live_mode: Boolean,
      luhn_validation: Boolean,
      public_key: String,
      security_code_length: Double,
      status: String
    ): CardTokenResponse = {
      val __obj = js.Dynamic.literal(card_number_length = card_number_length.asInstanceOf[js.Any], cardholder = cardholder.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], date_due = date_due.asInstanceOf[js.Any], date_last_updated = date_last_updated.asInstanceOf[js.Any], expiration_month = expiration_month.asInstanceOf[js.Any], expiration_year = expiration_year.asInstanceOf[js.Any], first_six_digits = first_six_digits.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], last_four_digits = last_four_digits.asInstanceOf[js.Any], live_mode = live_mode.asInstanceOf[js.Any], luhn_validation = luhn_validation.asInstanceOf[js.Any], public_key = public_key.asInstanceOf[js.Any], security_code_length = security_code_length.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[CardTokenResponse]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CardTokenResponse] (val x: Self) extends AnyVal {
      
      inline def setCard_id(value: Any): Self = StObject.set(x, "card_id", value.asInstanceOf[js.Any])
      
      inline def setCard_idUndefined: Self = StObject.set(x, "card_id", js.undefined)
      
      inline def setCard_number_length(value: Double): Self = StObject.set(x, "card_number_length", value.asInstanceOf[js.Any])
      
      inline def setCardholder(value: Cardholder): Self = StObject.set(x, "cardholder", value.asInstanceOf[js.Any])
      
      inline def setDate_created(value: js.Date): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_due(value: js.Date): Self = StObject.set(x, "date_due", value.asInstanceOf[js.Any])
      
      inline def setDate_last_updated(value: js.Date): Self = StObject.set(x, "date_last_updated", value.asInstanceOf[js.Any])
      
      inline def setDate_used(value: Any): Self = StObject.set(x, "date_used", value.asInstanceOf[js.Any])
      
      inline def setDate_usedUndefined: Self = StObject.set(x, "date_used", js.undefined)
      
      inline def setExpiration_month(value: Double): Self = StObject.set(x, "expiration_month", value.asInstanceOf[js.Any])
      
      inline def setExpiration_year(value: Double): Self = StObject.set(x, "expiration_year", value.asInstanceOf[js.Any])
      
      inline def setFirst_six_digits(value: String): Self = StObject.set(x, "first_six_digits", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLast_four_digits(value: String): Self = StObject.set(x, "last_four_digits", value.asInstanceOf[js.Any])
      
      inline def setLive_mode(value: Boolean): Self = StObject.set(x, "live_mode", value.asInstanceOf[js.Any])
      
      inline def setLuhn_validation(value: Boolean): Self = StObject.set(x, "luhn_validation", value.asInstanceOf[js.Any])
      
      inline def setPublic_key(value: String): Self = StObject.set(x, "public_key", value.asInstanceOf[js.Any])
      
      inline def setSecurity_code_length(value: Double): Self = StObject.set(x, "security_code_length", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  trait Cardholder extends StObject {
    
    var identification: Identification
    
    var name: String
  }
  object Cardholder {
    
    inline def apply(identification: Identification, name: String): Cardholder = {
      val __obj = js.Dynamic.literal(identification = identification.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Cardholder]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Cardholder] (val x: Self) extends AnyVal {
      
      inline def setIdentification(value: Identification): Self = StObject.set(x, "identification", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait CustomFonts extends StObject {
    
    var src: String
  }
  object CustomFonts {
    
    inline def apply(src: String): CustomFonts = {
      val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomFonts]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CustomFonts] (val x: Self) extends AnyVal {
      
      inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    }
  }
  
  trait FieldStyle extends StObject {
    
    var color: js.UndefOr[String] = js.undefined
    
    var `font-family`: js.UndefOr[String] = js.undefined
    
    var `font-size`: js.UndefOr[String] = js.undefined
    
    var `font-style`: js.UndefOr[String] = js.undefined
    
    var `font-variant`: js.UndefOr[String] = js.undefined
    
    var `font-weight`: js.UndefOr[String] = js.undefined
    
    var fontFamily: js.UndefOr[String] = js.undefined
    
    var fontSize: js.UndefOr[String] = js.undefined
    
    var fontStyle: js.UndefOr[String] = js.undefined
    
    var fontVariant: js.UndefOr[String] = js.undefined
    
    var fontWeight: js.UndefOr[String] = js.undefined
    
    var height: js.UndefOr[String] = js.undefined
    
    var margin: js.UndefOr[String] = js.undefined
    
    var `margin-bottom`: js.UndefOr[String] = js.undefined
    
    var `margin-left`: js.UndefOr[String] = js.undefined
    
    var `margin-right`: js.UndefOr[String] = js.undefined
    
    var `margin-top`: js.UndefOr[String] = js.undefined
    
    var marginBottom: js.UndefOr[String] = js.undefined
    
    var marginLeft: js.UndefOr[String] = js.undefined
    
    var marginRight: js.UndefOr[String] = js.undefined
    
    var marginTop: js.UndefOr[String] = js.undefined
    
    var padding: js.UndefOr[String] = js.undefined
    
    var `padding-bottom`: js.UndefOr[String] = js.undefined
    
    var `padding-left`: js.UndefOr[String] = js.undefined
    
    var `padding-right`: js.UndefOr[String] = js.undefined
    
    var `padding-top`: js.UndefOr[String] = js.undefined
    
    var paddingBottom: js.UndefOr[String] = js.undefined
    
    var paddingLeft: js.UndefOr[String] = js.undefined
    
    var paddingRight: js.UndefOr[String] = js.undefined
    
    var paddingTop: js.UndefOr[String] = js.undefined
    
    var `placeholder-color`: js.UndefOr[String] = js.undefined
    
    var placeholderColor: js.UndefOr[String] = js.undefined
    
    var `text-align`: js.UndefOr[String] = js.undefined
    
    var textAlign: js.UndefOr[String] = js.undefined
    
    var width: js.UndefOr[String] = js.undefined
  }
  object FieldStyle {
    
    inline def apply(): FieldStyle = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FieldStyle]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FieldStyle] (val x: Self) extends AnyVal {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def `setFont-family`(value: String): Self = StObject.set(x, "font-family", value.asInstanceOf[js.Any])
      
      inline def `setFont-familyUndefined`: Self = StObject.set(x, "font-family", js.undefined)
      
      inline def `setFont-size`(value: String): Self = StObject.set(x, "font-size", value.asInstanceOf[js.Any])
      
      inline def `setFont-sizeUndefined`: Self = StObject.set(x, "font-size", js.undefined)
      
      inline def `setFont-style`(value: String): Self = StObject.set(x, "font-style", value.asInstanceOf[js.Any])
      
      inline def `setFont-styleUndefined`: Self = StObject.set(x, "font-style", js.undefined)
      
      inline def `setFont-variant`(value: String): Self = StObject.set(x, "font-variant", value.asInstanceOf[js.Any])
      
      inline def `setFont-variantUndefined`: Self = StObject.set(x, "font-variant", js.undefined)
      
      inline def `setFont-weight`(value: String): Self = StObject.set(x, "font-weight", value.asInstanceOf[js.Any])
      
      inline def `setFont-weightUndefined`: Self = StObject.set(x, "font-weight", js.undefined)
      
      inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      inline def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      inline def setFontSize(value: String): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      inline def setFontStyle(value: String): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      inline def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
      
      inline def setFontVariant(value: String): Self = StObject.set(x, "fontVariant", value.asInstanceOf[js.Any])
      
      inline def setFontVariantUndefined: Self = StObject.set(x, "fontVariant", js.undefined)
      
      inline def setFontWeight(value: String): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      inline def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
      
      inline def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setMargin(value: String): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def `setMargin-bottom`(value: String): Self = StObject.set(x, "margin-bottom", value.asInstanceOf[js.Any])
      
      inline def `setMargin-bottomUndefined`: Self = StObject.set(x, "margin-bottom", js.undefined)
      
      inline def `setMargin-left`(value: String): Self = StObject.set(x, "margin-left", value.asInstanceOf[js.Any])
      
      inline def `setMargin-leftUndefined`: Self = StObject.set(x, "margin-left", js.undefined)
      
      inline def `setMargin-right`(value: String): Self = StObject.set(x, "margin-right", value.asInstanceOf[js.Any])
      
      inline def `setMargin-rightUndefined`: Self = StObject.set(x, "margin-right", js.undefined)
      
      inline def `setMargin-top`(value: String): Self = StObject.set(x, "margin-top", value.asInstanceOf[js.Any])
      
      inline def `setMargin-topUndefined`: Self = StObject.set(x, "margin-top", js.undefined)
      
      inline def setMarginBottom(value: String): Self = StObject.set(x, "marginBottom", value.asInstanceOf[js.Any])
      
      inline def setMarginBottomUndefined: Self = StObject.set(x, "marginBottom", js.undefined)
      
      inline def setMarginLeft(value: String): Self = StObject.set(x, "marginLeft", value.asInstanceOf[js.Any])
      
      inline def setMarginLeftUndefined: Self = StObject.set(x, "marginLeft", js.undefined)
      
      inline def setMarginRight(value: String): Self = StObject.set(x, "marginRight", value.asInstanceOf[js.Any])
      
      inline def setMarginRightUndefined: Self = StObject.set(x, "marginRight", js.undefined)
      
      inline def setMarginTop(value: String): Self = StObject.set(x, "marginTop", value.asInstanceOf[js.Any])
      
      inline def setMarginTopUndefined: Self = StObject.set(x, "marginTop", js.undefined)
      
      inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      inline def setPadding(value: String): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def `setPadding-bottom`(value: String): Self = StObject.set(x, "padding-bottom", value.asInstanceOf[js.Any])
      
      inline def `setPadding-bottomUndefined`: Self = StObject.set(x, "padding-bottom", js.undefined)
      
      inline def `setPadding-left`(value: String): Self = StObject.set(x, "padding-left", value.asInstanceOf[js.Any])
      
      inline def `setPadding-leftUndefined`: Self = StObject.set(x, "padding-left", js.undefined)
      
      inline def `setPadding-right`(value: String): Self = StObject.set(x, "padding-right", value.asInstanceOf[js.Any])
      
      inline def `setPadding-rightUndefined`: Self = StObject.set(x, "padding-right", js.undefined)
      
      inline def `setPadding-top`(value: String): Self = StObject.set(x, "padding-top", value.asInstanceOf[js.Any])
      
      inline def `setPadding-topUndefined`: Self = StObject.set(x, "padding-top", js.undefined)
      
      inline def setPaddingBottom(value: String): Self = StObject.set(x, "paddingBottom", value.asInstanceOf[js.Any])
      
      inline def setPaddingBottomUndefined: Self = StObject.set(x, "paddingBottom", js.undefined)
      
      inline def setPaddingLeft(value: String): Self = StObject.set(x, "paddingLeft", value.asInstanceOf[js.Any])
      
      inline def setPaddingLeftUndefined: Self = StObject.set(x, "paddingLeft", js.undefined)
      
      inline def setPaddingRight(value: String): Self = StObject.set(x, "paddingRight", value.asInstanceOf[js.Any])
      
      inline def setPaddingRightUndefined: Self = StObject.set(x, "paddingRight", js.undefined)
      
      inline def setPaddingTop(value: String): Self = StObject.set(x, "paddingTop", value.asInstanceOf[js.Any])
      
      inline def setPaddingTopUndefined: Self = StObject.set(x, "paddingTop", js.undefined)
      
      inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      inline def `setPlaceholder-color`(value: String): Self = StObject.set(x, "placeholder-color", value.asInstanceOf[js.Any])
      
      inline def `setPlaceholder-colorUndefined`: Self = StObject.set(x, "placeholder-color", js.undefined)
      
      inline def setPlaceholderColor(value: String): Self = StObject.set(x, "placeholderColor", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderColorUndefined: Self = StObject.set(x, "placeholderColor", js.undefined)
      
      inline def `setText-align`(value: String): Self = StObject.set(x, "text-align", value.asInstanceOf[js.Any])
      
      inline def `setText-alignUndefined`: Self = StObject.set(x, "text-align", js.undefined)
      
      inline def setTextAlign(value: String): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
      
      inline def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
      
      inline def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait Identification extends StObject {
    
    var number: String
    
    var `type`: String
  }
  object Identification {
    
    inline def apply(number: String, `type`: String): Identification = {
      val __obj = js.Dynamic.literal(number = number.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Identification]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Identification] (val x: Self) extends AnyVal {
      
      inline def setNumber(value: String): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Issuer extends StObject {
    
    var default: Boolean
    
    var id: Double
    
    var name: String
  }
  object Issuer {
    
    inline def apply(default: Boolean, id: Double, name: String): Issuer = {
      val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Issuer]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Issuer] (val x: Self) extends AnyVal {
      
      inline def setDefault(value: Boolean): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait PayerCost extends StObject {
    
    var discount_rate: Double
    
    var installment_amount: js.UndefOr[Double] = js.undefined
    
    var installment_rate: Double
    
    var installments: Double
    
    var labels: js.UndefOr[js.Array[String]] = js.undefined
    
    var max_allowed_amount: Double
    
    var min_allowed_amount: Double
    
    var payment_method_option_id: String
    
    var recommended_message: js.UndefOr[String] = js.undefined
    
    var reimbursement_rate: js.UndefOr[Any] = js.undefined
    
    var total_amount: js.UndefOr[Double] = js.undefined
  }
  object PayerCost {
    
    inline def apply(
      discount_rate: Double,
      installment_rate: Double,
      installments: Double,
      max_allowed_amount: Double,
      min_allowed_amount: Double,
      payment_method_option_id: String
    ): PayerCost = {
      val __obj = js.Dynamic.literal(discount_rate = discount_rate.asInstanceOf[js.Any], installment_rate = installment_rate.asInstanceOf[js.Any], installments = installments.asInstanceOf[js.Any], max_allowed_amount = max_allowed_amount.asInstanceOf[js.Any], min_allowed_amount = min_allowed_amount.asInstanceOf[js.Any], payment_method_option_id = payment_method_option_id.asInstanceOf[js.Any])
      __obj.asInstanceOf[PayerCost]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PayerCost] (val x: Self) extends AnyVal {
      
      inline def setDiscount_rate(value: Double): Self = StObject.set(x, "discount_rate", value.asInstanceOf[js.Any])
      
      inline def setInstallment_amount(value: Double): Self = StObject.set(x, "installment_amount", value.asInstanceOf[js.Any])
      
      inline def setInstallment_amountUndefined: Self = StObject.set(x, "installment_amount", js.undefined)
      
      inline def setInstallment_rate(value: Double): Self = StObject.set(x, "installment_rate", value.asInstanceOf[js.Any])
      
      inline def setInstallments(value: Double): Self = StObject.set(x, "installments", value.asInstanceOf[js.Any])
      
      inline def setLabels(value: js.Array[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
      
      inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
      
      inline def setLabelsVarargs(value: String*): Self = StObject.set(x, "labels", js.Array(value*))
      
      inline def setMax_allowed_amount(value: Double): Self = StObject.set(x, "max_allowed_amount", value.asInstanceOf[js.Any])
      
      inline def setMin_allowed_amount(value: Double): Self = StObject.set(x, "min_allowed_amount", value.asInstanceOf[js.Any])
      
      inline def setPayment_method_option_id(value: String): Self = StObject.set(x, "payment_method_option_id", value.asInstanceOf[js.Any])
      
      inline def setRecommended_message(value: String): Self = StObject.set(x, "recommended_message", value.asInstanceOf[js.Any])
      
      inline def setRecommended_messageUndefined: Self = StObject.set(x, "recommended_message", js.undefined)
      
      inline def setReimbursement_rate(value: Any): Self = StObject.set(x, "reimbursement_rate", value.asInstanceOf[js.Any])
      
      inline def setReimbursement_rateUndefined: Self = StObject.set(x, "reimbursement_rate", js.undefined)
      
      inline def setTotal_amount(value: Double): Self = StObject.set(x, "total_amount", value.asInstanceOf[js.Any])
      
      inline def setTotal_amountUndefined: Self = StObject.set(x, "total_amount", js.undefined)
    }
  }
  
  trait SecurityCode extends StObject {
    
    var length: Double
    
    var mode: String
  }
  object SecurityCode {
    
    inline def apply(length: Double, mode: String): SecurityCode = {
      val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any])
      __obj.asInstanceOf[SecurityCode]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SecurityCode] (val x: Self) extends AnyVal {
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    }
  }
  
  trait Setting extends StObject {
    
    var bin: Bin
    
    var card_number: CardNumber
    
    var security_code: SecurityCode
  }
  object Setting {
    
    inline def apply(bin: Bin, card_number: CardNumber, security_code: SecurityCode): Setting = {
      val __obj = js.Dynamic.literal(bin = bin.asInstanceOf[js.Any], card_number = card_number.asInstanceOf[js.Any], security_code = security_code.asInstanceOf[js.Any])
      __obj.asInstanceOf[Setting]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Setting] (val x: Self) extends AnyVal {
      
      inline def setBin(value: Bin): Self = StObject.set(x, "bin", value.asInstanceOf[js.Any])
      
      inline def setCard_number(value: CardNumber): Self = StObject.set(x, "card_number", value.asInstanceOf[js.Any])
      
      inline def setSecurity_code(value: SecurityCode): Self = StObject.set(x, "security_code", value.asInstanceOf[js.Any])
    }
  }
}
