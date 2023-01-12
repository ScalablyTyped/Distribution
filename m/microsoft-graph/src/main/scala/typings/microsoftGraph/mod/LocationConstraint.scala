package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocationConstraint extends StObject {
  
  /**
    * The client requests the service to include in the response a meeting location for the meeting. If this is true and all
    * the resources are busy, findMeetingTimes will not return any meeting time suggestions. If this is false and all the
    * resources are busy, findMeetingTimes would still look for meeting times without locations.
    */
  var isRequired: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // Constraint information for one or more locations that the client requests for the meeting.
  var locations: js.UndefOr[NullableOption[js.Array[LocationConstraintItem]]] = js.undefined
  
  // The client requests the service to suggest one or more meeting locations.
  var suggestLocation: js.UndefOr[NullableOption[Boolean]] = js.undefined
}
object LocationConstraint {
  
  inline def apply(): LocationConstraint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocationConstraint]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LocationConstraint] (val x: Self) extends AnyVal {
    
    inline def setIsRequired(value: NullableOption[Boolean]): Self = StObject.set(x, "isRequired", value.asInstanceOf[js.Any])
    
    inline def setIsRequiredNull: Self = StObject.set(x, "isRequired", null)
    
    inline def setIsRequiredUndefined: Self = StObject.set(x, "isRequired", js.undefined)
    
    inline def setLocations(value: NullableOption[js.Array[LocationConstraintItem]]): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
    
    inline def setLocationsNull: Self = StObject.set(x, "locations", null)
    
    inline def setLocationsUndefined: Self = StObject.set(x, "locations", js.undefined)
    
    inline def setLocationsVarargs(value: LocationConstraintItem*): Self = StObject.set(x, "locations", js.Array(value*))
    
    inline def setSuggestLocation(value: NullableOption[Boolean]): Self = StObject.set(x, "suggestLocation", value.asInstanceOf[js.Any])
    
    inline def setSuggestLocationNull: Self = StObject.set(x, "suggestLocation", null)
    
    inline def setSuggestLocationUndefined: Self = StObject.set(x, "suggestLocation", js.undefined)
  }
}
