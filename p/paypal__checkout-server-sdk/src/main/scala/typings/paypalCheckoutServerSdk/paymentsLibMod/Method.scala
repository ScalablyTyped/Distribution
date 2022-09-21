package typings.paypalCheckoutServerSdk.paymentsLibMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Method extends StObject
@JSImport("@paypal/checkout-server-sdk/lib/payments/lib", "Method")
@js.native
object Method extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Method & String] = js.native
  
  @js.native
  sealed trait CONNECT
    extends StObject
       with Method
  /* "CONNECT" */ val CONNECT: typings.paypalCheckoutServerSdk.paymentsLibMod.Method.CONNECT & String = js.native
  
  @js.native
  sealed trait DELETE
    extends StObject
       with Method
  /* "DELETE" */ val DELETE: typings.paypalCheckoutServerSdk.paymentsLibMod.Method.DELETE & String = js.native
  
  @js.native
  sealed trait GET
    extends StObject
       with Method
  /* "GET" */ val GET: typings.paypalCheckoutServerSdk.paymentsLibMod.Method.GET & String = js.native
  
  @js.native
  sealed trait HEAD
    extends StObject
       with Method
  /* "HEAD" */ val HEAD: typings.paypalCheckoutServerSdk.paymentsLibMod.Method.HEAD & String = js.native
  
  @js.native
  sealed trait OPTIONS
    extends StObject
       with Method
  /* "OPTIONS" */ val OPTIONS: typings.paypalCheckoutServerSdk.paymentsLibMod.Method.OPTIONS & String = js.native
  
  @js.native
  sealed trait PATCH
    extends StObject
       with Method
  /* "PATCH" */ val PATCH: typings.paypalCheckoutServerSdk.paymentsLibMod.Method.PATCH & String = js.native
  
  @js.native
  sealed trait POST
    extends StObject
       with Method
  /* "POST" */ val POST: typings.paypalCheckoutServerSdk.paymentsLibMod.Method.POST & String = js.native
  
  @js.native
  sealed trait PUT
    extends StObject
       with Method
  /* "PUT" */ val PUT: typings.paypalCheckoutServerSdk.paymentsLibMod.Method.PUT & String = js.native
}
