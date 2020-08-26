package typings.oracleOraclejet.ojmessagesMod

import typings.oracleOraclejet.anon.AriaLiveRegion
import typings.oracleOraclejet.mod.JetSettableProperties
import typings.oracleOraclejet.ojdataproviderMod.DataProvider
import typings.oracleOraclejet.ojmessageMod.ojMessage.DisplayOptions
import typings.oracleOraclejet.ojmessageMod.ojMessage.Message
import typings.oracleOraclejet.ojmessagesMod.ojMessages.Position
import typings.oracleOraclejet.oracleOraclejetStrings.general
import typings.oracleOraclejet.oracleOraclejetStrings.notification
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojMessagesSettableProperties extends JetSettableProperties {
  var display: general | notification = js.native
  var displayOptions: DisplayOptions = js.native
  var messages: js.Array[Message] | Null | (DataProvider[_, Message]) = js.native
  var position: Position | Null = js.native
  var translations: AriaLiveRegion = js.native
}

object ojMessagesSettableProperties {
  @scala.inline
  def apply(display: general | notification, displayOptions: DisplayOptions, translations: AriaLiveRegion): ojMessagesSettableProperties = {
    val __obj = js.Dynamic.literal(display = display.asInstanceOf[js.Any], displayOptions = displayOptions.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojMessagesSettableProperties]
  }
  @scala.inline
  implicit class ojMessagesSettablePropertiesOps[Self <: ojMessagesSettableProperties] (val x: Self) extends AnyVal {
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
    def setDisplay(value: general | notification): Self = this.set("display", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisplayOptions(value: DisplayOptions): Self = this.set("displayOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def setTranslations(value: AriaLiveRegion): Self = this.set("translations", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessagesVarargs(value: Message*): Self = this.set("messages", js.Array(value :_*))
    @scala.inline
    def setMessages(value: js.Array[Message] | (DataProvider[_, Message])): Self = this.set("messages", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessagesNull: Self = this.set("messages", null)
    @scala.inline
    def setPosition(value: Position): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def setPositionNull: Self = this.set("position", null)
  }
  
}

