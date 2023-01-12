package typings.mongodb.anon

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Email extends StObject {
  
  /** The service account email to authenticate */
  var email: String
  
  /**
    * If present, a host with optional port. E.g. "example.com" or "example.com:443".
    * Defaults to "oauth2.googleapis.com"
    */
  var endpoint: js.UndefOr[String] = js.undefined
  
  /** A PKCS#8 encrypted key. This can either be a base64 string or a binary representation */
  var privateKey: String | Buffer
}
object Email {
  
  inline def apply(email: String, privateKey: String | Buffer): Email = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], privateKey = privateKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Email]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Email] (val x: Self) extends AnyVal {
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEndpoint(value: String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
    
    inline def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
    
    inline def setPrivateKey(value: String | Buffer): Self = StObject.set(x, "privateKey", value.asInstanceOf[js.Any])
  }
}
