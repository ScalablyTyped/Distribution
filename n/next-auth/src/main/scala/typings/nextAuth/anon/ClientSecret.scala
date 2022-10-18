package typings.nextAuth.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientSecret extends StObject {
  
  /**
    * Apple requires the client secret to be a JWT. You can generate one using the following script:
    * https://bal.so/apple-gen-secret
    *
    * Read more: [Creating the Client Secret
  ](https://developer.apple.com/documentation/sign_in_with_apple/generate_and_validate_tokens#3262048)
    */
  var clientSecret: String
}
object ClientSecret {
  
  inline def apply(clientSecret: String): ClientSecret = {
    val __obj = js.Dynamic.literal(clientSecret = clientSecret.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientSecret]
  }
  
  extension [Self <: ClientSecret](x: Self) {
    
    inline def setClientSecret(value: String): Self = StObject.set(x, "clientSecret", value.asInstanceOf[js.Any])
  }
}
