package typings.atOracleOraclejet.ojmessagesMod

import typings.atOracleOraclejet.Anon_AriaLiveRegion
import typings.atOracleOraclejet.atOracleOraclejetMod.JetSettableProperties
import typings.atOracleOraclejet.atOracleOraclejetStrings.general
import typings.atOracleOraclejet.atOracleOraclejetStrings.notification
import typings.atOracleOraclejet.ojdataproviderMod.DataProvider
import typings.atOracleOraclejet.ojmessageMod.ojMessageNs.DisplayOptions
import typings.atOracleOraclejet.ojmessageMod.ojMessageNs.Message
import typings.atOracleOraclejet.ojmessagesMod.ojMessagesNs.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojMessagesSettableProperties extends JetSettableProperties {
  var display: general | notification
  var displayOptions: DisplayOptions
  var messages: js.Array[Message] | Null | (DataProvider[_, Message])
  var position: Position | Null
  var translations: Anon_AriaLiveRegion
}

object ojMessagesSettableProperties {
  @scala.inline
  def apply(
    display: general | notification,
    displayOptions: DisplayOptions,
    translations: Anon_AriaLiveRegion,
    messages: js.Array[Message] | (DataProvider[_, Message]) = null,
    position: Position = null
  ): ojMessagesSettableProperties = {
    val __obj = js.Dynamic.literal(display = display.asInstanceOf[js.Any], displayOptions = displayOptions, translations = translations)
    if (messages != null) __obj.updateDynamic("messages")(messages.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[ojMessagesSettableProperties]
  }
}

