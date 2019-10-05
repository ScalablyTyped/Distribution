package typings.phonegapDashNfc.PhoneGapNfc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NdefTag extends Tag {
  var canMakeReadOnly: Boolean
  var isWritable: Boolean
  var maxSize: Double
  var ndefMessage: js.Array[NdefRecord]
}

object NdefTag {
  @scala.inline
  def apply(
    canMakeReadOnly: Boolean,
    date: String,
    id: js.Array[Double],
    isWritable: Boolean,
    maxSize: Double,
    ndefMessage: js.Array[NdefRecord],
    techTypes: js.Array[String],
    `type`: String
  ): NdefTag = {
    val __obj = js.Dynamic.literal(canMakeReadOnly = canMakeReadOnly, date = date, id = id, isWritable = isWritable, maxSize = maxSize, ndefMessage = ndefMessage, techTypes = techTypes)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[NdefTag]
  }
}

