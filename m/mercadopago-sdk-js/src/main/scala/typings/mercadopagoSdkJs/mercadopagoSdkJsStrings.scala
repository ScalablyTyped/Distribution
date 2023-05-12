package typings.mercadopagoSdkJs

import typings.mercadopagoSdkJs.bricks.BrickTypes
import typings.mercadopagoSdkJs.cardform.AVAILABLE_PROCESSING_MODE
import typings.mercadopagoSdkJs.fields.FieldEvent
import typings.mercadopagoSdkJs.fields.FieldName
import typings.mercadopagoSdkJs.mercadopagocore.ProcessingMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mercadopagoSdkJsStrings {
  
  @js.native
  sealed trait default extends StObject
  inline def default: default = "default".asInstanceOf[default]
  
  @js.native
  sealed trait aggregator
    extends StObject
       with AVAILABLE_PROCESSING_MODE
       with ProcessingMode
  inline def aggregator: aggregator = "aggregator".asInstanceOf[aggregator]
  
  @js.native
  sealed trait binChange
    extends StObject
       with FieldEvent
  inline def binChange: binChange = "binChange".asInstanceOf[binChange]
  
  @js.native
  sealed trait blur
    extends StObject
       with FieldEvent
  inline def blur: blur = "blur".asInstanceOf[blur]
  
  @js.native
  sealed trait bootstrap extends StObject
  inline def bootstrap: bootstrap = "bootstrap".asInstanceOf[bootstrap]
  
  @js.native
  sealed trait cardNumber
    extends StObject
       with FieldName
  inline def cardNumber: cardNumber = "cardNumber".asInstanceOf[cardNumber]
  
  @js.native
  sealed trait cardPayment
    extends StObject
       with BrickTypes
  inline def cardPayment: cardPayment = "cardPayment".asInstanceOf[cardPayment]
  
  @js.native
  sealed trait change
    extends StObject
       with FieldEvent
  inline def change: change = "change".asInstanceOf[change]
  
  @js.native
  sealed trait critical extends StObject
  inline def critical: critical = "critical".asInstanceOf[critical]
  
  @js.native
  sealed trait customer extends StObject
  inline def customer: customer = "customer".asInstanceOf[customer]
  
  @js.native
  sealed trait dark extends StObject
  inline def dark: dark = "dark".asInstanceOf[dark]
  
  @js.native
  sealed trait error
    extends StObject
       with FieldEvent
  inline def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait expirationDate
    extends StObject
       with FieldName
  inline def expirationDate: expirationDate = "expirationDate".asInstanceOf[expirationDate]
  
  @js.native
  sealed trait expirationMonth
    extends StObject
       with FieldName
  inline def expirationMonth: expirationMonth = "expirationMonth".asInstanceOf[expirationMonth]
  
  @js.native
  sealed trait expirationYear
    extends StObject
       with FieldName
  inline def expirationYear: expirationYear = "expirationYear".asInstanceOf[expirationYear]
  
  @js.native
  sealed trait flat extends StObject
  inline def flat: flat = "flat".asInstanceOf[flat]
  
  @js.native
  sealed trait focus
    extends StObject
       with FieldEvent
  inline def focus: focus = "focus".asInstanceOf[focus]
  
  @js.native
  sealed trait full extends StObject
  inline def full: full = "full".asInstanceOf[full]
  
  @js.native
  sealed trait gateway
    extends StObject
       with AVAILABLE_PROCESSING_MODE
       with ProcessingMode
  inline def gateway: gateway = "gateway".asInstanceOf[gateway]
  
  @js.native
  sealed trait invalid_length extends StObject
  inline def invalid_length: invalid_length = "invalid_length".asInstanceOf[invalid_length]
  
  @js.native
  sealed trait invalid_type extends StObject
  inline def invalid_type: invalid_type = "invalid_type".asInstanceOf[invalid_type]
  
  @js.native
  sealed trait invalid_value extends StObject
  inline def invalid_value: invalid_value = "invalid_value".asInstanceOf[invalid_value]
  
  @js.native
  sealed trait non_critical extends StObject
  inline def non_critical: non_critical = "non_critical".asInstanceOf[non_critical]
  
  @js.native
  sealed trait paste
    extends StObject
       with FieldEvent
  inline def paste: paste = "paste".asInstanceOf[paste]
  
  @js.native
  sealed trait payment
    extends StObject
       with BrickTypes
  inline def payment: payment = "payment".asInstanceOf[payment]
  
  @js.native
  sealed trait ready
    extends StObject
       with FieldEvent
  inline def ready: ready = "ready".asInstanceOf[ready]
  
  @js.native
  sealed trait securityCode
    extends StObject
       with FieldName
  inline def securityCode: securityCode = "securityCode".asInstanceOf[securityCode]
  
  @js.native
  sealed trait short extends StObject
  inline def short: short = "short".asInstanceOf[short]
  
  @js.native
  sealed trait statusScreen
    extends StObject
       with BrickTypes
  inline def statusScreen: statusScreen = "statusScreen".asInstanceOf[statusScreen]
  
  @js.native
  sealed trait validityChange
    extends StObject
       with FieldEvent
  inline def validityChange: validityChange = "validityChange".asInstanceOf[validityChange]
  
  @js.native
  sealed trait wallet
    extends StObject
       with BrickTypes
  inline def wallet: wallet = "wallet".asInstanceOf[wallet]
}
