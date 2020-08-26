package typings.oracleOraclejet.anon

import typings.oracleOraclejet.oracleOraclejetStrings.error
import typings.oracleOraclejet.oracleOraclejetStrings.fatal
import typings.oracleOraclejet.oracleOraclejetStrings.info
import typings.oracleOraclejet.oracleOraclejetStrings.warning
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MessageType extends js.Object {
  var disabled: js.UndefOr[Boolean] = js.native
  var id: js.UndefOr[String] = js.native
  var label: js.UndefOr[String] = js.native
  var messageType: js.UndefOr[info | error | fatal | warning] = js.native
  var visited: js.UndefOr[Boolean] = js.native
}

object MessageType {
  @scala.inline
  def apply(): MessageType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessageType]
  }
  @scala.inline
  implicit class MessageTypeOps[Self <: MessageType] (val x: Self) extends AnyVal {
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
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setMessageType(value: info | error | fatal | warning): Self = this.set("messageType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessageType: Self = this.set("messageType", js.undefined)
    @scala.inline
    def setVisited(value: Boolean): Self = this.set("visited", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisited: Self = this.set("visited", js.undefined)
  }
  
}

