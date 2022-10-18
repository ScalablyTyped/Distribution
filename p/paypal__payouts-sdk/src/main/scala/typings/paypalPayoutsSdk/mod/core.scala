package typings.paypalPayoutsSdk.mod

import typings.paypalPayoutsSdk.mod.payouts.PayoutsGetRequest
import typings.paypalPayoutsSdk.mod.payouts.PayoutsItemCancelRequest
import typings.paypalPayoutsSdk.mod.payouts.PayoutsItemGetRequest
import typings.paypalPayoutsSdk.mod.payouts.PayoutsPostRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object core {
  
  /**
    * Live Environment
    */
  type LiveEnvironment = PayPalEnvironment
  
  /**
    * Base class for PayPal environments
    */
  trait PayPalEnvironment extends StObject {
    
    // Authorization header string for basic authentication with the current client id and secret
    def authorizationString(): String
  }
  object PayPalEnvironment {
    
    inline def apply(authorizationString: () => String): PayPalEnvironment = {
      val __obj = js.Dynamic.literal(authorizationString = js.Any.fromFunction0(authorizationString))
      __obj.asInstanceOf[PayPalEnvironment]
    }
    
    extension [Self <: PayPalEnvironment](x: Self) {
      
      inline def setAuthorizationString(value: () => String): Self = StObject.set(x, "authorizationString", js.Any.fromFunction0(value))
    }
  }
  
  /**
    * PayPal HTTP client
    */
  @js.native
  trait PayPalHttpClient extends StObject {
    
    def execute(request: PayoutsGetRequest): js.Promise[HttpResponse[GetBatchPayoutResponse]] = js.native
    def execute(request: PayoutsItemCancelRequest): js.Promise[HttpResponse[GetPayoutsItemResponse]] = js.native
    def execute(request: PayoutsItemGetRequest): js.Promise[HttpResponse[GetPayoutsItemResponse]] = js.native
    def execute(request: PayoutsPostRequest): js.Promise[HttpResponse[CreateBatchPayoutResponse]] = js.native
  }
  
  /**
    * Sandbox Environment
    */
  type SandboxEnvironment = PayPalEnvironment
}
