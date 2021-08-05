package typings.maximMazurokGapiClientRedis.gapi.client.redis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceAuthString extends StObject {
  
  /** AUTH string set on the instance. */
  var authString: js.UndefOr[String] = js.undefined
}
object InstanceAuthString {
  
  inline def apply(): InstanceAuthString = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceAuthString]
  }
  
  extension [Self <: InstanceAuthString](x: Self) {
    
    inline def setAuthString(value: String): Self = StObject.set(x, "authString", value.asInstanceOf[js.Any])
    
    inline def setAuthStringUndefined: Self = StObject.set(x, "authString", js.undefined)
  }
}
