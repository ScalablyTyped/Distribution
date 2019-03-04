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

object Window {
  @scala.inline
  def apply(
    fireNfcTagEvent: js.Function2[TagEvent, java.lang.String, scala.Unit],
    ndef: Ndef,
    nfc: Nfc,
    util: Util
  ): Window = {
    val __obj = js.Dynamic.literal(fireNfcTagEvent = fireNfcTagEvent, ndef = ndef, nfc = nfc, util = util)
  
    __obj.asInstanceOf[Window]
  }
}

