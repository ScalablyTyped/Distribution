package typings.maximMazurokGapiClientDoubleclicksearch.gapi.client.doubleclicksearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateAvailabilityResponse extends js.Object {
  
  /** The availabilities being returned. */
  var availabilities: js.UndefOr[js.Array[Availability]] = js.native
}
object UpdateAvailabilityResponse {
  
  @scala.inline
  def apply(): UpdateAvailabilityResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateAvailabilityResponse]
  }
  
  @scala.inline
  implicit class UpdateAvailabilityResponseOps[Self <: UpdateAvailabilityResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAvailabilitiesVarargs(value: Availability*): Self = this.set("availabilities", js.Array(value :_*))
    
    @scala.inline
    def setAvailabilities(value: js.Array[Availability]): Self = this.set("availabilities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvailabilities: Self = this.set("availabilities", js.undefined)
  }
}
