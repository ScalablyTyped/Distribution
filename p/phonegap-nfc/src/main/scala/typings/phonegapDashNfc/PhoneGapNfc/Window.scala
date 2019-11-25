package typings.phonegapDashNfc.PhoneGapNfc

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
  def fireNfcTagEvent(event: TagEvent, tagAsJson: String): Unit
}

object Window {
  @scala.inline
  def apply(fireNfcTagEvent: (TagEvent, String) => Unit, ndef: Ndef, nfc: Nfc, util: Util): Window = {
    val __obj = js.Dynamic.literal(fireNfcTagEvent = js.Any.fromFunction2(fireNfcTagEvent), ndef = ndef.asInstanceOf[js.Any], nfc = nfc.asInstanceOf[js.Any], util = util.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Window]
  }
}

