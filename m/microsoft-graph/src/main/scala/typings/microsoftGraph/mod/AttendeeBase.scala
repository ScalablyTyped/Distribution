package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttendeeBase extends Recipient {
  
  /**
    * The type of attendee. The possible values are: required, optional, resource. Currently if the attendee is a person,
    * findMeetingTimes always considers the person is of the Required type.
    */
  var `type`: js.UndefOr[NullableOption[AttendeeType]] = js.native
}
object AttendeeBase {
  
  @scala.inline
  def apply(): AttendeeBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttendeeBase]
  }
  
  @scala.inline
  implicit class AttendeeBaseMutableBuilder[Self <: AttendeeBase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: NullableOption[AttendeeType]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeNull: Self = StObject.set(x, "type", null)
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
