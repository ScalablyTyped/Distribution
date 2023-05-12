package typings.mongodb.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessToken extends StObject {
  
  /**
    * If present, an access token to authenticate with GCP.
    */
  var accessToken: String
}
object AccessToken {
  
  inline def apply(accessToken: String): AccessToken = {
    val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessToken]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccessToken] (val x: Self) extends AnyVal {
    
    inline def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
  }
}
