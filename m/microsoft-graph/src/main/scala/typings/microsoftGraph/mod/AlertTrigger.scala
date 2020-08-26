package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AlertTrigger extends js.Object {
  // Name of the property serving as a detection trigger.
  var name: js.UndefOr[String] = js.native
  // Type of the property in the key:value pair for interpretation. For example, String, Boolean, etc.
  var `type`: js.UndefOr[String] = js.native
  // Value of the property serving as a detection trigger.
  var value: js.UndefOr[String] = js.native
}

object AlertTrigger {
  @scala.inline
  def apply(): AlertTrigger = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlertTrigger]
  }
  @scala.inline
  implicit class AlertTriggerOps[Self <: AlertTrigger] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

