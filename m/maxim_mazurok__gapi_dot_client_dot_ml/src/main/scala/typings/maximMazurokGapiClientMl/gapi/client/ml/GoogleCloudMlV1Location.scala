package typings.maximMazurokGapiClientMl.gapi.client.ml

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudMlV1Location extends StObject {
  
  /** Capabilities available in the location. */
  var capabilities: js.UndefOr[js.Array[GoogleCloudMlV1Capability]] = js.native
  
  var name: js.UndefOr[String] = js.native
}
object GoogleCloudMlV1Location {
  
  @scala.inline
  def apply(): GoogleCloudMlV1Location = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudMlV1Location]
  }
  
  @scala.inline
  implicit class GoogleCloudMlV1LocationMutableBuilder[Self <: GoogleCloudMlV1Location] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCapabilities(value: js.Array[GoogleCloudMlV1Capability]): Self = StObject.set(x, "capabilities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapabilitiesUndefined: Self = StObject.set(x, "capabilities", js.undefined)
    
    @scala.inline
    def setCapabilitiesVarargs(value: GoogleCloudMlV1Capability*): Self = StObject.set(x, "capabilities", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
