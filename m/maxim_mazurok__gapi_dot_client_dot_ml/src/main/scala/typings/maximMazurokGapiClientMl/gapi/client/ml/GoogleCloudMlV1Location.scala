package typings.maximMazurokGapiClientMl.gapi.client.ml

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudMlV1Location extends StObject {
  
  /** Capabilities available in the location. */
  var capabilities: js.UndefOr[js.Array[GoogleCloudMlV1Capability]] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
}
object GoogleCloudMlV1Location {
  
  inline def apply(): GoogleCloudMlV1Location = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudMlV1Location]
  }
  
  extension [Self <: GoogleCloudMlV1Location](x: Self) {
    
    inline def setCapabilities(value: js.Array[GoogleCloudMlV1Capability]): Self = StObject.set(x, "capabilities", value.asInstanceOf[js.Any])
    
    inline def setCapabilitiesUndefined: Self = StObject.set(x, "capabilities", js.undefined)
    
    inline def setCapabilitiesVarargs(value: GoogleCloudMlV1Capability*): Self = StObject.set(x, "capabilities", js.Array(value :_*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
