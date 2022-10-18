package typings.paypalCheckoutServerSdk

import typings.paypalCheckoutServerSdk.libOrdersLibMod.CheckoutPaymentIntent
import typings.paypalCheckoutServerSdk.libOrdersLibMod.ShippingPreference
import typings.paypalCheckoutServerSdk.libOrdersLibMod.UserAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object paypalCheckoutServerSdkStrings {
  
  @js.native
  sealed trait AUTHORIZE
    extends StObject
       with CheckoutPaymentIntent
  inline def AUTHORIZE: AUTHORIZE = "AUTHORIZE".asInstanceOf[AUTHORIZE]
  
  @js.native
  sealed trait BUSINESS_REGISTRATION_NUMBER extends StObject
  inline def BUSINESS_REGISTRATION_NUMBER: BUSINESS_REGISTRATION_NUMBER = "BUSINESS_REGISTRATION_NUMBER".asInstanceOf[BUSINESS_REGISTRATION_NUMBER]
  
  @js.native
  sealed trait CAPTURE
    extends StObject
       with CheckoutPaymentIntent
  inline def CAPTURE: CAPTURE = "CAPTURE".asInstanceOf[CAPTURE]
  
  @js.native
  sealed trait CONNECT extends StObject
  inline def CONNECT: CONNECT = "CONNECT".asInstanceOf[CONNECT]
  
  @js.native
  sealed trait CONTINUE
    extends StObject
       with UserAction
  inline def CONTINUE: CONTINUE = "CONTINUE".asInstanceOf[CONTINUE]
  
  @js.native
  sealed trait DELETE extends StObject
  inline def DELETE: DELETE = "DELETE".asInstanceOf[DELETE]
  
  @js.native
  sealed trait GET extends StObject
  inline def GET: GET = "GET".asInstanceOf[GET]
  
  @js.native
  sealed trait GET_FROM_FILE
    extends StObject
       with ShippingPreference
  inline def GET_FROM_FILE: GET_FROM_FILE = "GET_FROM_FILE".asInstanceOf[GET_FROM_FILE]
  
  @js.native
  sealed trait HEAD extends StObject
  inline def HEAD: HEAD = "HEAD".asInstanceOf[HEAD]
  
  @js.native
  sealed trait INDIVIDUAL extends StObject
  inline def INDIVIDUAL: INDIVIDUAL = "INDIVIDUAL".asInstanceOf[INDIVIDUAL]
  
  @js.native
  sealed trait NO_SHIPPING
    extends StObject
       with ShippingPreference
  inline def NO_SHIPPING: NO_SHIPPING = "NO_SHIPPING".asInstanceOf[NO_SHIPPING]
  
  @js.native
  sealed trait OPTIONS extends StObject
  inline def OPTIONS: OPTIONS = "OPTIONS".asInstanceOf[OPTIONS]
  
  @js.native
  sealed trait PARTNERSHIP extends StObject
  inline def PARTNERSHIP: PARTNERSHIP = "PARTNERSHIP".asInstanceOf[PARTNERSHIP]
  
  @js.native
  sealed trait PATCH extends StObject
  inline def PATCH: PATCH = "PATCH".asInstanceOf[PATCH]
  
  @js.native
  sealed trait PAY_NOW
    extends StObject
       with UserAction
  inline def PAY_NOW: PAY_NOW = "PAY_NOW".asInstanceOf[PAY_NOW]
  
  @js.native
  sealed trait POST extends StObject
  inline def POST: POST = "POST".asInstanceOf[POST]
  
  @js.native
  sealed trait PROPRIETORSHIP extends StObject
  inline def PROPRIETORSHIP: PROPRIETORSHIP = "PROPRIETORSHIP".asInstanceOf[PROPRIETORSHIP]
  
  @js.native
  sealed trait PUT extends StObject
  inline def PUT: PUT = "PUT".asInstanceOf[PUT]
  
  @js.native
  sealed trait SET_PROVIDED_ADDRESS
    extends StObject
       with ShippingPreference
  inline def SET_PROVIDED_ADDRESS: SET_PROVIDED_ADDRESS = "SET_PROVIDED_ADDRESS".asInstanceOf[SET_PROVIDED_ADDRESS]
  
  @js.native
  sealed trait TAX_IDENTIFICATION_NUMBER extends StObject
  inline def TAX_IDENTIFICATION_NUMBER: TAX_IDENTIFICATION_NUMBER = "TAX_IDENTIFICATION_NUMBER".asInstanceOf[TAX_IDENTIFICATION_NUMBER]
  
  @js.native
  sealed trait applicationSlashjson extends StObject
  inline def applicationSlashjson: applicationSlashjson = "application/json".asInstanceOf[applicationSlashjson]
  
  @js.native
  sealed trait authorization_code extends StObject
  inline def authorization_code: authorization_code = "authorization_code".asInstanceOf[authorization_code]
}
