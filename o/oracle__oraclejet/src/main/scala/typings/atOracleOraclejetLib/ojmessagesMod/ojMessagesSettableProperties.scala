package typings
package atOracleOraclejetLib.ojmessagesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojMessagesSettableProperties
  extends atOracleOraclejetLib.atOracleOraclejetMod.JetSettableProperties {
  var display: atOracleOraclejetLib.atOracleOraclejetLibStrings.general | atOracleOraclejetLib.atOracleOraclejetLibStrings.notification
  var displayOptions: atOracleOraclejetLib.ojmessageMod.ojMessageNs.DisplayOptions
  var messages: js.Array[atOracleOraclejetLib.ojmessageMod.ojMessageNs.Message] | scala.Null | (atOracleOraclejetLib.ojdataproviderMod.DataProvider[_, atOracleOraclejetLib.ojmessageMod.ojMessageNs.Message])
  var position: atOracleOraclejetLib.ojmessagesMod.ojMessagesNs.Position | scala.Null
  var translations: atOracleOraclejetLib.Anon_AriaLiveRegion
}

object ojMessagesSettableProperties {
  @scala.inline
  def apply(
    display: atOracleOraclejetLib.atOracleOraclejetLibStrings.general | atOracleOraclejetLib.atOracleOraclejetLibStrings.notification,
    displayOptions: atOracleOraclejetLib.ojmessageMod.ojMessageNs.DisplayOptions,
    translations: atOracleOraclejetLib.Anon_AriaLiveRegion,
    messages: js.Array[atOracleOraclejetLib.ojmessageMod.ojMessageNs.Message] | (atOracleOraclejetLib.ojdataproviderMod.DataProvider[_, atOracleOraclejetLib.ojmessageMod.ojMessageNs.Message]) = null,
    position: atOracleOraclejetLib.ojmessagesMod.ojMessagesNs.Position = null
  ): ojMessagesSettableProperties = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    __obj.updateDynamic("displayOptions")(displayOptions)
    __obj.updateDynamic("translations")(translations)
    if (messages != null) __obj.updateDynamic("messages")(messages.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[ojMessagesSettableProperties]
  }
}

