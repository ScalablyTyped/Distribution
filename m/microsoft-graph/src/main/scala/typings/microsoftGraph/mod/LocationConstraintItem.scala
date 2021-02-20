package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
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
  implicit class LocationConstraintItemMutableBuilder[Self <: LocationConstraintItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResolveAvailability(value: NullableOption[Boolean]): Self = StObject.set(x, "resolveAvailability", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolveAvailabilityNull: Self = StObject.set(x, "resolveAvailability", null)
    
    @scala.inline
    def setResolveAvailabilityUndefined: Self = StObject.set(x, "resolveAvailability", js.undefined)
  }
}
