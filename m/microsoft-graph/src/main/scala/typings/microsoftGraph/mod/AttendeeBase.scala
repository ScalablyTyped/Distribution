package typings.microsoftGraph.mod

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
  implicit class AttendeeBaseOps[Self <: AttendeeBase] (val x: Self) extends AnyVal {
    
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
    def setType(value: NullableOption[AttendeeType]): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setTypeNull: Self = this.set("type", null)
  }
}
