package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocationConstraintItem extends Location {
  
  /**
    * If set to true and the specified resource is busy, findMeetingTimes looks for another resource that is free. If set to
    * false and the specified resource is busy, findMeetingTimes returns the resource best ranked in the user's cache without
    * checking if it's free. Default is true.
    */
  var resolveAvailability: js.UndefOr[NullableOption[Boolean]] = js.native
}
object LocationConstraintItem {
  
  @scala.inline
  def apply(): LocationConstraintItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocationConstraintItem]
  }
  
  @scala.inline
  implicit class LocationConstraintItemOps[Self <: LocationConstraintItem] (val x: Self) extends AnyVal {
    
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
    def setResolveAvailability(value: NullableOption[Boolean]): Self = this.set("resolveAvailability", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResolveAvailability: Self = this.set("resolveAvailability", js.undefined)
    
    @scala.inline
    def setResolveAvailabilityNull: Self = this.set("resolveAvailability", null)
  }
}
