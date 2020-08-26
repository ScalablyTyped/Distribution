package typings.nodemailer.smtpConnectionMod

import typings.nodemailer.nodemailerBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Envelope extends js.Object {
  /** the dsn options */
  var dsn: js.UndefOr[DSNOptions] = js.native
  /** includes an address object or is set to false */
  var from: String | `false` = js.native
  /** an optional value of the predicted size of the message in bytes. This value is used if the server supports the SIZE extension (RFC1870) */
  var size: js.UndefOr[Double] = js.native
  /** the recipient address or an array of addresses */
  var to: String | js.Array[String] = js.native
  /** if true then inform the server that this message might contain bytes outside 7bit ascii range */
  var use8BitMime: js.UndefOr[Boolean] = js.native
}

object Envelope {
  @scala.inline
  def apply(from: String | `false`, to: String | js.Array[String]): Envelope = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[Envelope]
  }
  @scala.inline
  implicit class EnvelopeOps[Self <: Envelope] (val x: Self) extends AnyVal {
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
    def setFrom(value: String | `false`): Self = this.set("from", value.asInstanceOf[js.Any])
    @scala.inline
    def setToVarargs(value: String*): Self = this.set("to", js.Array(value :_*))
    @scala.inline
    def setTo(value: String | js.Array[String]): Self = this.set("to", value.asInstanceOf[js.Any])
    @scala.inline
    def setDsn(value: DSNOptions): Self = this.set("dsn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDsn: Self = this.set("dsn", js.undefined)
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setUse8BitMime(value: Boolean): Self = this.set("use8BitMime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUse8BitMime: Self = this.set("use8BitMime", js.undefined)
  }
  
}

