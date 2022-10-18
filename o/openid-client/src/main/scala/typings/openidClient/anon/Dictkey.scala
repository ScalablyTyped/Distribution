package typings.openidClient.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dictkey
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var expires_in: Double
  
  var request_uri: String
}
object Dictkey {
  
  inline def apply(expires_in: Double, request_uri: String): Dictkey = {
    val __obj = js.Dynamic.literal(expires_in = expires_in.asInstanceOf[js.Any], request_uri = request_uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dictkey]
  }
  
  extension [Self <: Dictkey](x: Self) {
    
    inline def setExpires_in(value: Double): Self = StObject.set(x, "expires_in", value.asInstanceOf[js.Any])
    
    inline def setRequest_uri(value: String): Self = StObject.set(x, "request_uri", value.asInstanceOf[js.Any])
  }
}
