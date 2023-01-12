package typings.openidClient.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Expiresin
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var expires_in: Double
  
  var request_uri: String
}
object Expiresin {
  
  inline def apply(expires_in: Double, request_uri: String): Expiresin = {
    val __obj = js.Dynamic.literal(expires_in = expires_in.asInstanceOf[js.Any], request_uri = request_uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expiresin]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Expiresin] (val x: Self) extends AnyVal {
    
    inline def setExpires_in(value: Double): Self = StObject.set(x, "expires_in", value.asInstanceOf[js.Any])
    
    inline def setRequest_uri(value: String): Self = StObject.set(x, "request_uri", value.asInstanceOf[js.Any])
  }
}
