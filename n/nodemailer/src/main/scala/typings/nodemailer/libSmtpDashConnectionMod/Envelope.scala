package typings.nodemailer.libSmtpDashConnectionMod

import typings.nodemailer.nodemailerBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Envelope extends js.Object {
  /** the dsn options */
  var dsn: js.UndefOr[DSNOptions] = js.undefined
  /** includes an address object or is set to false */
  var from: String | `false`
  /** an optional value of the predicted size of the message in bytes. This value is used if the server supports the SIZE extension (RFC1870) */
  var size: js.UndefOr[Double] = js.undefined
  /** the recipient address or an array of addresses */
  var to: String | js.Array[String]
  /** if true then inform the server that this message might contain bytes outside 7bit ascii range */
  var use8BitMime: js.UndefOr[Boolean] = js.undefined
}

object Envelope {
  @scala.inline
  def apply(
    from: String | `false`,
    to: String | js.Array[String],
    dsn: DSNOptions = null,
    size: Int | Double = null,
    use8BitMime: js.UndefOr[Boolean] = js.undefined
  ): Envelope = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    if (dsn != null) __obj.updateDynamic("dsn")(dsn.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (!js.isUndefined(use8BitMime)) __obj.updateDynamic("use8BitMime")(use8BitMime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Envelope]
  }
}

