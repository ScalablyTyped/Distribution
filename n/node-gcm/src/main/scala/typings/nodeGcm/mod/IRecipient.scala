package typings.nodeGcm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRecipient extends js.Object {
  var condition: js.UndefOr[String] = js.native
  var notificationKey: js.UndefOr[String] = js.native
  var registrationIds: js.UndefOr[js.Array[String]] = js.native
  var registrationTokens: js.UndefOr[js.Array[String]] = js.native
  var to: js.UndefOr[String] = js.native
  var topic: js.UndefOr[String] = js.native
}

object IRecipient {
  @scala.inline
  def apply(): IRecipient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRecipient]
  }
  @scala.inline
  implicit class IRecipientOps[Self <: IRecipient] (val x: Self) extends AnyVal {
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
    def setCondition(value: String): Self = this.set("condition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCondition: Self = this.set("condition", js.undefined)
    @scala.inline
    def setNotificationKey(value: String): Self = this.set("notificationKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotificationKey: Self = this.set("notificationKey", js.undefined)
    @scala.inline
    def setRegistrationIdsVarargs(value: String*): Self = this.set("registrationIds", js.Array(value :_*))
    @scala.inline
    def setRegistrationIds(value: js.Array[String]): Self = this.set("registrationIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegistrationIds: Self = this.set("registrationIds", js.undefined)
    @scala.inline
    def setRegistrationTokensVarargs(value: String*): Self = this.set("registrationTokens", js.Array(value :_*))
    @scala.inline
    def setRegistrationTokens(value: js.Array[String]): Self = this.set("registrationTokens", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegistrationTokens: Self = this.set("registrationTokens", js.undefined)
    @scala.inline
    def setTo(value: String): Self = this.set("to", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTo: Self = this.set("to", js.undefined)
    @scala.inline
    def setTopic(value: String): Self = this.set("topic", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTopic: Self = this.set("topic", js.undefined)
  }
  
}

