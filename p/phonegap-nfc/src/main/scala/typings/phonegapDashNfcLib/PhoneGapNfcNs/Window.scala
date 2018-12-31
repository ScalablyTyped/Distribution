package typings
package phonegapDashNfcLib.PhoneGapNfcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Global object NFC.
  */
trait Window extends js.Object {
  var ndef: Ndef
  var nfc: Nfc
  var util: Util
  def fireNfcTagEvent(event: TagEvent, tagAsJson: java.lang.String): scala.Unit
}

