package typings.maximMazurokGapiClientMemcache.gapi.client.memcache

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateParametersRequest extends StObject {
  
  /** The parameters to apply to the instance. */
  var parameters: js.UndefOr[MemcacheParameters] = js.undefined
  
  /** Required. Mask of fields to update. */
  var updateMask: js.UndefOr[String] = js.undefined
}
object UpdateParametersRequest {
  
  inline def apply(): UpdateParametersRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateParametersRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateParametersRequest] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: MemcacheParameters): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    inline def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    inline def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}
