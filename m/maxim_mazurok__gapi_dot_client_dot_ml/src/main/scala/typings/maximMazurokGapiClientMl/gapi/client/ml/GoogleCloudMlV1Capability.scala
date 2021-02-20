package typings.maximMazurokGapiClientMl.gapi.client.ml

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudMlV1Capability extends StObject {
  
  /** Available accelerators for the capability. */
  var availableAccelerators: js.UndefOr[js.Array[String]] = js.native
  
  var `type`: js.UndefOr[String] = js.native
}
object GoogleCloudMlV1Capability {
  
  @scala.inline
  def apply(): GoogleCloudMlV1Capability = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudMlV1Capability]
  }
  
  @scala.inline
  implicit class GoogleCloudMlV1CapabilityMutableBuilder[Self <: GoogleCloudMlV1Capability] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvailableAccelerators(value: js.Array[String]): Self = StObject.set(x, "availableAccelerators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailableAcceleratorsUndefined: Self = StObject.set(x, "availableAccelerators", js.undefined)
    
    @scala.inline
    def setAvailableAcceleratorsVarargs(value: String*): Self = StObject.set(x, "availableAccelerators", js.Array(value :_*))
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
