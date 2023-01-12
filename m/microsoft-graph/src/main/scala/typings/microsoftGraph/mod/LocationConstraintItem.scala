package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocationConstraintItem
  extends StObject
     with Location {
  
  /**
    * If set to true and the specified resource is busy, findMeetingTimes looks for another resource that is free. If set to
    * false and the specified resource is busy, findMeetingTimes returns the resource best ranked in the user's cache without
    * checking if it's free. Default is true.
    */
  var resolveAvailability: js.UndefOr[NullableOption[Boolean]] = js.undefined
}
object LocationConstraintItem {
  
  inline def apply(): LocationConstraintItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocationConstraintItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LocationConstraintItem] (val x: Self) extends AnyVal {
    
    inline def setResolveAvailability(value: NullableOption[Boolean]): Self = StObject.set(x, "resolveAvailability", value.asInstanceOf[js.Any])
    
    inline def setResolveAvailabilityNull: Self = StObject.set(x, "resolveAvailability", null)
    
    inline def setResolveAvailabilityUndefined: Self = StObject.set(x, "resolveAvailability", js.undefined)
  }
}
