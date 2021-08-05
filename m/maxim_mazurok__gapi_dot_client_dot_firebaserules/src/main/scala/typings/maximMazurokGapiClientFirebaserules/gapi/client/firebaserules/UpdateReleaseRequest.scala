package typings.maximMazurokGapiClientFirebaserules.gapi.client.firebaserules

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateReleaseRequest extends StObject {
  
  /** `Release` to update. */
  var release: js.UndefOr[Release] = js.undefined
  
  /** Specifies which fields to update. */
  var updateMask: js.UndefOr[String] = js.undefined
}
object UpdateReleaseRequest {
  
  inline def apply(): UpdateReleaseRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateReleaseRequest]
  }
  
  extension [Self <: UpdateReleaseRequest](x: Self) {
    
    inline def setRelease(value: Release): Self = StObject.set(x, "release", value.asInstanceOf[js.Any])
    
    inline def setReleaseUndefined: Self = StObject.set(x, "release", js.undefined)
    
    inline def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    inline def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}
