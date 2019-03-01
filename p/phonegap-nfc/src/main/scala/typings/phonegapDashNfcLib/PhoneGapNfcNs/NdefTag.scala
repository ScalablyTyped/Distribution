package typings
package phonegapDashNfcLib.PhoneGapNfcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NdefTag extends Tag {
  var canMakeReadOnly: scala.Boolean
  var isWritable: scala.Boolean
  var maxSize: scala.Double
  var ndefMessage: js.Array[NdefRecord]
}

object NdefTag {
  @scala.inline
  def apply(
    canMakeReadOnly: scala.Boolean,
    date: java.lang.String,
    id: js.Array[scala.Double],
    isWritable: scala.Boolean,
    maxSize: scala.Double,
    ndefMessage: js.Array[NdefRecord],
    techTypes: js.Array[java.lang.String],
    `type`: java.lang.String
  ): NdefTag = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("canMakeReadOnly")(canMakeReadOnly)
    __obj.updateDynamic("date")(date)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("isWritable")(isWritable)
    __obj.updateDynamic("maxSize")(maxSize)
    __obj.updateDynamic("ndefMessage")(ndefMessage)
    __obj.updateDynamic("techTypes")(techTypes)
    __obj.asInstanceOf[NdefTag]
  }
}

