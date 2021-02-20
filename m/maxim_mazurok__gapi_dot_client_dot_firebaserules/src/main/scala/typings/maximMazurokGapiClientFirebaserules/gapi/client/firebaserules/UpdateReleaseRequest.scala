package typings.maximMazurokGapiClientFirebaserules.gapi.client.firebaserules

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateReleaseRequest extends StObject {
  
  /** `Release` to update. */
  var release: js.UndefOr[Release] = js.native
  
  /** Specifies which fields to update. */
  var updateMask: js.UndefOr[String] = js.native
}
object UpdateReleaseRequest {
  
  @scala.inline
  def apply(): UpdateReleaseRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateReleaseRequest]
  }
  
  @scala.inline
  implicit class UpdateReleaseRequestMutableBuilder[Self <: UpdateReleaseRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRelease(value: Release): Self = StObject.set(x, "release", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReleaseUndefined: Self = StObject.set(x, "release", js.undefined)
    
    @scala.inline
    def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}
