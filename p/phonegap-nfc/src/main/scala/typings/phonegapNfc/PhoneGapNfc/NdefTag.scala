package typings.phonegapNfc.PhoneGapNfc

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
    val __obj = js.Dynamic.literal(canMakeReadOnly = canMakeReadOnly.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isWritable = isWritable.asInstanceOf[js.Any], maxSize = maxSize.asInstanceOf[js.Any], ndefMessage = ndefMessage.asInstanceOf[js.Any], techTypes = techTypes.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NdefTag]
  }
}

