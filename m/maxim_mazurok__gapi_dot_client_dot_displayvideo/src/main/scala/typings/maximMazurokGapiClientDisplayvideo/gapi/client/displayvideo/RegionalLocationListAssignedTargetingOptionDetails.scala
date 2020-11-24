package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegionalLocationListAssignedTargetingOptionDetails extends js.Object {
  
  /** Indicates if this option is being negatively targeted. */
  var negative: js.UndefOr[Boolean] = js.native
  
  /** Required. ID of the regional location list. Should refer to the location_list_id field of a LocationList resource whose type is `TARGETING_LOCATION_TYPE_REGIONAL`. */
  var regionalLocationListId: js.UndefOr[String] = js.native
}
object RegionalLocationListAssignedTargetingOptionDetails {
  
  @scala.inline
  def apply(): RegionalLocationListAssignedTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegionalLocationListAssignedTargetingOptionDetails]
  }
  
  @scala.inline
  implicit class RegionalLocationListAssignedTargetingOptionDetailsOps[Self <: RegionalLocationListAssignedTargetingOptionDetails] (val x: Self) extends AnyVal {
    
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
    def setNegative(value: Boolean): Self = this.set("negative", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNegative: Self = this.set("negative", js.undefined)
    
    @scala.inline
    def setRegionalLocationListId(value: String): Self = this.set("regionalLocationListId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegionalLocationListId: Self = this.set("regionalLocationListId", js.undefined)
  }
}
