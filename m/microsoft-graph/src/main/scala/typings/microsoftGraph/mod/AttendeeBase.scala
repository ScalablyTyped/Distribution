package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttendeeBase
  extends StObject
     with Recipient {
  
  /**
    * The type of attendee. The possible values are: required, optional, resource. Currently if the attendee is a person,
    * findMeetingTimes always considers the person is of the Required type.
    */
  var `type`: js.UndefOr[NullableOption[AttendeeType]] = js.undefined
}
object AttendeeBase {
  
  inline def apply(): AttendeeBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttendeeBase]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AttendeeBase] (val x: Self) extends AnyVal {
    
    inline def setType(value: NullableOption[AttendeeType]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
