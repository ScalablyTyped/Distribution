package typings.maximMazurokGapiClientMl.gapi.client.ml

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudMlV1Capability extends StObject {
  
  /** Available accelerators for the capability. */
  var availableAccelerators: js.UndefOr[js.Array[String]] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
}
object GoogleCloudMlV1Capability {
  
  inline def apply(): GoogleCloudMlV1Capability = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudMlV1Capability]
  }
  
  extension [Self <: GoogleCloudMlV1Capability](x: Self) {
    
    inline def setAvailableAccelerators(value: js.Array[String]): Self = StObject.set(x, "availableAccelerators", value.asInstanceOf[js.Any])
    
    inline def setAvailableAcceleratorsUndefined: Self = StObject.set(x, "availableAccelerators", js.undefined)
    
    inline def setAvailableAcceleratorsVarargs(value: String*): Self = StObject.set(x, "availableAccelerators", js.Array(value*))
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
