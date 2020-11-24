package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocationConstraint extends js.Object {
  
  /**
    * The client requests the service to include in the response a meeting location for the meeting. If this is true and all
    * the resources are busy, findMeetingTimes will not return any meeting time suggestions. If this is false and all the
    * resources are busy, findMeetingTimes would still look for meeting times without locations.
    */
  var isRequired: js.UndefOr[NullableOption[Boolean]] = js.native
  
  // Constraint information for one or more locations that the client requests for the meeting.
  var locations: js.UndefOr[NullableOption[js.Array[LocationConstraintItem]]] = js.native
  
  // The client requests the service to suggest one or more meeting locations.
  var suggestLocation: js.UndefOr[NullableOption[Boolean]] = js.native
}
object LocationConstraint {
  
  @scala.inline
  def apply(): LocationConstraint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocationConstraint]
  }
  
  @scala.inline
  implicit class LocationConstraintOps[Self <: LocationConstraint] (val x: Self) extends AnyVal {
    
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
    def setIsRequired(value: NullableOption[Boolean]): Self = this.set("isRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsRequired: Self = this.set("isRequired", js.undefined)
    
    @scala.inline
    def setIsRequiredNull: Self = this.set("isRequired", null)
    
    @scala.inline
    def setLocationsVarargs(value: LocationConstraintItem*): Self = this.set("locations", js.Array(value :_*))
    
    @scala.inline
    def setLocations(value: NullableOption[js.Array[LocationConstraintItem]]): Self = this.set("locations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocations: Self = this.set("locations", js.undefined)
    
    @scala.inline
    def setLocationsNull: Self = this.set("locations", null)
    
    @scala.inline
    def setSuggestLocation(value: NullableOption[Boolean]): Self = this.set("suggestLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuggestLocation: Self = this.set("suggestLocation", js.undefined)
    
    @scala.inline
    def setSuggestLocationNull: Self = this.set("suggestLocation", null)
  }
}
