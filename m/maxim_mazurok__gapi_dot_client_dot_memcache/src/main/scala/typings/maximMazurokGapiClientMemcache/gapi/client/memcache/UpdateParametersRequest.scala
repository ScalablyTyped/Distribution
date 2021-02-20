package typings.maximMazurokGapiClientMemcache.gapi.client.memcache

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateParametersRequest extends StObject {
  
  /** The parameters to apply to the instance. */
  var parameters: js.UndefOr[MemcacheParameters] = js.native
  
  /** Required. Mask of fields to update. */
  var updateMask: js.UndefOr[String] = js.native
}
object UpdateParametersRequest {
  
  @scala.inline
  def apply(): UpdateParametersRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateParametersRequest]
  }
  
  @scala.inline
  implicit class UpdateParametersRequestMutableBuilder[Self <: UpdateParametersRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: MemcacheParameters): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    @scala.inline
    def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}
