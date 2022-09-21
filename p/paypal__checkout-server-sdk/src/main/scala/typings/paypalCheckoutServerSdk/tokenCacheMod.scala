package typings.paypalCheckoutServerSdk

import typings.paypalCheckoutServerSdk.accessTokenMod.AccessToken
import typings.paypalPaypalhttp.mod.Environment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tokenCacheMod {
  
  @JSImport("@paypal/checkout-server-sdk/lib/core/token_cache", "TokenCache")
  @js.native
  open class TokenCache () extends StObject {
    
    /**
      * Gets the current token for the client
      */
    def getToken(): AccessToken | Null = js.native
    
    def isLocked(): Boolean = js.native
    
    def isPresent(): Boolean = js.native
    
    def isValid(): Boolean = js.native
    
    def lock(): Unit = js.native
    
    def notify(err: js.Array[Any]): Unit = js.native
    
    /**
      * Sets the token for the current client also setting its status to absent or valid if the token exist or not
      * @param token - The current token for the client or null to remove it
      */
    def setToken(): Unit = js.native
    def setToken(token: AccessToken): Unit = js.native
    
    def unlock(): Unit = js.native
    
    /**
      * Add a request to the queue and wait for the notify method to signal error or completion
      * @param request - The request to be queued
      */
    def wait[T](request: T): js.Promise[T] = js.native
  }
  object TokenCache {
    
    @JSImport("@paypal/checkout-server-sdk/lib/core/token_cache", "TokenCache")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def cacheForEnvironment[T /* <: Environment */](environment: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("cacheForEnvironment")(environment.asInstanceOf[js.Any]).asInstanceOf[T]
    inline def cacheForEnvironment[T /* <: Environment */](environment: T, refreshToken: String): T = (^.asInstanceOf[js.Dynamic].applyDynamic("cacheForEnvironment")(environment.asInstanceOf[js.Any], refreshToken.asInstanceOf[js.Any])).asInstanceOf[T]
  }
}
