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
    val __obj = js.Dynamic.literal(canMakeReadOnly = canMakeReadOnly, date = date, id = id, isWritable = isWritable, maxSize = maxSize, ndefMessage = ndefMessage, techTypes = techTypes)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[NdefTag]
  }
}

