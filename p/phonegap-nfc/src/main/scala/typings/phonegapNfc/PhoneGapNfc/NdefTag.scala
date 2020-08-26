package typings.phonegapNfc.PhoneGapNfc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NdefTag extends Tag {
  var canMakeReadOnly: Boolean = js.native
  var isWritable: Boolean = js.native
  var maxSize: Double = js.native
  var ndefMessage: js.Array[NdefRecord] = js.native
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
  @scala.inline
  implicit class NdefTagOps[Self <: NdefTag] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCanMakeReadOnly(value: Boolean): Self = this.set("canMakeReadOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsWritable(value: Boolean): Self = this.set("isWritable", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxSize(value: Double): Self = this.set("maxSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setNdefMessageVarargs(value: NdefRecord*): Self = this.set("ndefMessage", js.Array(value :_*))
    @scala.inline
    def setNdefMessage(value: js.Array[NdefRecord]): Self = this.set("ndefMessage", value.asInstanceOf[js.Any])
  }
  
}

