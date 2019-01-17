package typings
package atOracleOraclejetLib.ojmessagesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojMessagesEventMap
  extends stdLib.HTMLElementEventMap {
  var displayChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.general | atOracleOraclejetLib.atOracleOraclejetLibStrings.notification
  ]
  var displayOptionsChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.ojmessageMod.ojMessageNs.DisplayOptions]
  var messagesChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    js.Array[atOracleOraclejetLib.ojmessageMod.ojMessageNs.Message] | scala.Null | (atOracleOraclejetLib.ojdataproviderMod.DataProvider[_, atOracleOraclejetLib.ojmessageMod.ojMessageNs.Message])
  ]
  var positionChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.ojmessagesMod.ojMessagesNs.Position | scala.Null]
  var translationsChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_AriaLiveRegion]
}

