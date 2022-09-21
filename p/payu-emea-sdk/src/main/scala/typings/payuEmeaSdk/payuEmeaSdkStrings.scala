package typings.payuEmeaSdk

import typings.payuEmeaSdk.payu.SecureFormErrorCode
import typings.payuEmeaSdk.payu.eventTypes
import typings.payuEmeaSdk.payu.fontWeight
import typings.payuEmeaSdk.payu.secureFormType
import typings.payuEmeaSdk.payu.tokenType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object payuEmeaSdkStrings {
  
  @js.native
  sealed trait ERROR extends StObject
  inline def ERROR: ERROR = "ERROR".asInstanceOf[ERROR]
  
  @js.native
  sealed trait MULTI
    extends StObject
       with tokenType
  inline def MULTI: MULTI = "MULTI".asInstanceOf[MULTI]
  
  @js.native
  sealed trait SINGLE
    extends StObject
       with tokenType
  inline def SINGLE: SINGLE = "SINGLE".asInstanceOf[SINGLE]
  
  @js.native
  sealed trait SINGLE_LONGTERM
    extends StObject
       with tokenType
  inline def SINGLE_LONGTERM: SINGLE_LONGTERM = "SINGLE_LONGTERM".asInstanceOf[SINGLE_LONGTERM]
  
  @js.native
  sealed trait SUCCESS extends StObject
  inline def SUCCESS: SUCCESS = "SUCCESS".asInstanceOf[SUCCESS]
  
  @js.native
  sealed trait auto extends StObject
  inline def auto: auto = "auto".asInstanceOf[auto]
  
  @js.native
  sealed trait block extends StObject
  inline def block: block = "block".asInstanceOf[block]
  
  @js.native
  sealed trait blur
    extends StObject
       with eventTypes
  inline def blur: blur = "blur".asInstanceOf[blur]
  
  @js.native
  sealed trait bold
    extends StObject
       with fontWeight
  inline def bold: bold = "bold".asInstanceOf[bold]
  
  @js.native
  sealed trait bolder
    extends StObject
       with fontWeight
  inline def bolder: bolder = "bolder".asInstanceOf[bolder]
  
  @js.native
  sealed trait card
    extends StObject
       with secureFormType
  inline def card: card = "card".asInstanceOf[card]
  
  @js.native
  sealed trait change extends StObject
  inline def change: change = "change".asInstanceOf[change]
  
  @js.native
  sealed trait cs extends StObject
  inline def cs: cs = "cs".asInstanceOf[cs]
  
  @js.native
  sealed trait cvv
    extends StObject
       with secureFormType
  inline def cvv: cvv = "cvv".asInstanceOf[cvv]
  
  @js.native
  sealed trait date
    extends StObject
       with secureFormType
  inline def date: date = "date".asInstanceOf[date]
  
  @js.native
  sealed trait en extends StObject
  inline def en: en = "en".asInstanceOf[en]
  
  @js.native
  sealed trait errorDotnetwork
    extends StObject
       with SecureFormErrorCode
  inline def errorDotnetwork: errorDotnetwork = "error.network".asInstanceOf[errorDotnetwork]
  
  @js.native
  sealed trait errorDotsendDotcvv
    extends StObject
       with SecureFormErrorCode
  inline def errorDotsendDotcvv: errorDotsendDotcvv = "error.send.cvv".asInstanceOf[errorDotsendDotcvv]
  
  @js.native
  sealed trait errorDottokenization
    extends StObject
       with SecureFormErrorCode
  inline def errorDottokenization: errorDottokenization = "error.tokenization".asInstanceOf[errorDottokenization]
  
  @js.native
  sealed trait errorDotvalidationDotcardDotempty
    extends StObject
       with SecureFormErrorCode
  inline def errorDotvalidationDotcardDotempty: errorDotvalidationDotcardDotempty = "error.validation.card.empty".asInstanceOf[errorDotvalidationDotcardDotempty]
  
  @js.native
  sealed trait errorDotvalidationDotcardDotlength
    extends StObject
       with SecureFormErrorCode
  inline def errorDotvalidationDotcardDotlength: errorDotvalidationDotcardDotlength = "error.validation.card.length".asInstanceOf[errorDotvalidationDotcardDotlength]
  
  @js.native
  sealed trait errorDotvalidationDotcardDotnumber
    extends StObject
       with SecureFormErrorCode
  inline def errorDotvalidationDotcardDotnumber: errorDotvalidationDotcardDotnumber = "error.validation.card.number".asInstanceOf[errorDotvalidationDotcardDotnumber]
  
  @js.native
  sealed trait errorDotvalidationDotcardDotunsupported
    extends StObject
       with SecureFormErrorCode
  inline def errorDotvalidationDotcardDotunsupported: errorDotvalidationDotcardDotunsupported = "error.validation.card.unsupported".asInstanceOf[errorDotvalidationDotcardDotunsupported]
  
  @js.native
  sealed trait errorDotvalidationDotcvvDotempty
    extends StObject
       with SecureFormErrorCode
  inline def errorDotvalidationDotcvvDotempty: errorDotvalidationDotcvvDotempty = "error.validation.cvv.empty".asInstanceOf[errorDotvalidationDotcvvDotempty]
  
  @js.native
  sealed trait errorDotvalidationDotcvvDotvalue
    extends StObject
       with SecureFormErrorCode
  inline def errorDotvalidationDotcvvDotvalue: errorDotvalidationDotcvvDotvalue = "error.validation.cvv.value".asInstanceOf[errorDotvalidationDotcvvDotvalue]
  
  @js.native
  sealed trait errorDotvalidationDotexpDateDotempty
    extends StObject
       with SecureFormErrorCode
  inline def errorDotvalidationDotexpDateDotempty: errorDotvalidationDotexpDateDotempty = "error.validation.expDate.empty".asInstanceOf[errorDotvalidationDotexpDateDotempty]
  
  @js.native
  sealed trait errorDotvalidationDotexpDateDotpast
    extends StObject
       with SecureFormErrorCode
  inline def errorDotvalidationDotexpDateDotpast: errorDotvalidationDotexpDateDotpast = "error.validation.expDate.past".asInstanceOf[errorDotvalidationDotexpDateDotpast]
  
  @js.native
  sealed trait errorDotvalidationDotexpDateDotvalue
    extends StObject
       with SecureFormErrorCode
  inline def errorDotvalidationDotexpDateDotvalue: errorDotvalidationDotexpDateDotvalue = "error.validation.expDate.value".asInstanceOf[errorDotvalidationDotexpDateDotvalue]
  
  @js.native
  sealed trait fallback extends StObject
  inline def fallback: fallback = "fallback".asInstanceOf[fallback]
  
  @js.native
  sealed trait focus
    extends StObject
       with eventTypes
  inline def focus: focus = "focus".asInstanceOf[focus]
  
  @js.native
  sealed trait inherit
    extends StObject
       with fontWeight
  inline def inherit: inherit = "inherit".asInstanceOf[inherit]
  
  @js.native
  sealed trait initial
    extends StObject
       with fontWeight
  inline def initial: initial = "initial".asInstanceOf[initial]
  
  @js.native
  sealed trait italic extends StObject
  inline def italic: italic = "italic".asInstanceOf[italic]
  
  @js.native
  sealed trait lighter
    extends StObject
       with fontWeight
  inline def lighter: lighter = "lighter".asInstanceOf[lighter]
  
  @js.native
  sealed trait maestro extends StObject
  inline def maestro: maestro = "maestro".asInstanceOf[maestro]
  
  @js.native
  sealed trait mastercard extends StObject
  inline def mastercard: mastercard = "mastercard".asInstanceOf[mastercard]
  
  @js.native
  sealed trait normal
    extends StObject
       with fontWeight
  inline def normal: normal = "normal".asInstanceOf[normal]
  
  @js.native
  sealed trait number
    extends StObject
       with secureFormType
  inline def number: number = "number".asInstanceOf[number]
  
  @js.native
  sealed trait oblique extends StObject
  inline def oblique: oblique = "oblique".asInstanceOf[oblique]
  
  @js.native
  sealed trait optional extends StObject
  inline def optional: optional = "optional".asInstanceOf[optional]
  
  @js.native
  sealed trait pl extends StObject
  inline def pl: pl = "pl".asInstanceOf[pl]
  
  @js.native
  sealed trait ready
    extends StObject
       with eventTypes
  inline def ready: ready = "ready".asInstanceOf[ready]
  
  @js.native
  sealed trait sk extends StObject
  inline def sk: sk = "sk".asInstanceOf[sk]
  
  @js.native
  sealed trait swap extends StObject
  inline def swap: swap = "swap".asInstanceOf[swap]
  
  @js.native
  sealed trait technical extends StObject
  inline def technical: technical = "technical".asInstanceOf[technical]
  
  @js.native
  sealed trait unset
    extends StObject
       with fontWeight
  inline def unset: unset = "unset".asInstanceOf[unset]
  
  @js.native
  sealed trait validation extends StObject
  inline def validation: validation = "validation".asInstanceOf[validation]
  
  @js.native
  sealed trait visa extends StObject
  inline def visa: visa = "visa".asInstanceOf[visa]
}
