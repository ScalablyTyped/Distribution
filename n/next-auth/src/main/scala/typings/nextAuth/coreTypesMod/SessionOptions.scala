package typings.nextAuth.coreTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SessionOptions extends StObject {
  
  /**
    * Generate a custom session token for database-based sessions.
    * By default, a random UUID or string is generated depending on the Node.js version.
    * However, you can specify your own custom string (such as CUID) to be used.
    * @default `randomUUID` or `randomBytes.toHex` depending on the Node.js version
    */
  def generateSessionToken(): String
  
  /**
    * Relative time from now in seconds when to expire the session
    * @default 2592000 // 30 days
    */
  var maxAge: Double
  
  /**
    * Choose how you want to save the user session.
    * The default is `"jwt"`, an encrypted JWT (JWE) in the session cookie.
    *
    * If you use an `adapter` however, we default it to `"database"` instead.
    * You can still force a JWT session by explicitly defining `"jwt"`.
    *
    * When using `"database"`, the session cookie will only contain a `sessionToken` value,
    * which is used to look up the session in the database.
    *
    * [Documentation](https://next-auth.js.org/configuration/options#session) | [Adapter](https://next-auth.js.org/configuration/options#adapter) | [About JSON Web Tokens](https://next-auth.js.org/faq#json-web-tokens)
    */
  var strategy: SessionStrategy
  
  /**
    * How often the session should be updated in seconds.
    * If set to `0`, session is updated every time.
    * @default 86400 // 1 day
    */
  var updateAge: Double
}
object SessionOptions {
  
  inline def apply(generateSessionToken: () => String, maxAge: Double, strategy: SessionStrategy, updateAge: Double): SessionOptions = {
    val __obj = js.Dynamic.literal(generateSessionToken = js.Any.fromFunction0(generateSessionToken), maxAge = maxAge.asInstanceOf[js.Any], strategy = strategy.asInstanceOf[js.Any], updateAge = updateAge.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionOptions]
  }
  
  extension [Self <: SessionOptions](x: Self) {
    
    inline def setGenerateSessionToken(value: () => String): Self = StObject.set(x, "generateSessionToken", js.Any.fromFunction0(value))
    
    inline def setMaxAge(value: Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
    
    inline def setStrategy(value: SessionStrategy): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
    
    inline def setUpdateAge(value: Double): Self = StObject.set(x, "updateAge", value.asInstanceOf[js.Any])
  }
}
