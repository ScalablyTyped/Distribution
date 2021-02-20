package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocationConstraint extends StObject {
  
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
  implicit class LocationConstraintMutableBuilder[Self <: LocationConstraint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsRequired(value: NullableOption[Boolean]): Self = StObject.set(x, "isRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsRequiredNull: Self = StObject.set(x, "isRequired", null)
    
    @scala.inline
    def setIsRequiredUndefined: Self = StObject.set(x, "isRequired", js.undefined)
    
    @scala.inline
    def setLocations(value: NullableOption[js.Array[LocationConstraintItem]]): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationsNull: Self = StObject.set(x, "locations", null)
    
    @scala.inline
    def setLocationsUndefined: Self = StObject.set(x, "locations", js.undefined)
    
    @scala.inline
    def setLocationsVarargs(value: LocationConstraintItem*): Self = StObject.set(x, "locations", js.Array(value :_*))
    
    @scala.inline
    def setSuggestLocation(value: NullableOption[Boolean]): Self = StObject.set(x, "suggestLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuggestLocationNull: Self = StObject.set(x, "suggestLocation", null)
    
    @scala.inline
    def setSuggestLocationUndefined: Self = StObject.set(x, "suggestLocation", js.undefined)
  }
}
