package typings.nodeDashForge.nodeDashForgeMod.ssh

import typings.nodeDashForge.nodeDashForgeMod.md.MessageDigest
import typings.nodeDashForge.nodeDashForgeStrings.binary
import typings.nodeDashForge.nodeDashForgeStrings.hex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FingerprintOptions extends js.Object {
  /**
    * @description the delimiter to use between bytes for `hex` encoded output
    */
  var delimiter: js.UndefOr[String] = js.undefined
  /**
    * @description if not specified, the function will return `ByteStringBuffer`
    */
  var encoding: js.UndefOr[hex | binary] = js.undefined
  /**
    * @description if not specified defaults to `md.md5`
    */
  var md: js.UndefOr[MessageDigest] = js.undefined
}

object FingerprintOptions {
  @scala.inline
  def apply(delimiter: String = null, encoding: hex | binary = null, md: MessageDigest = null): FingerprintOptions = {
    val __obj = js.Dynamic.literal()
    if (delimiter != null) __obj.updateDynamic("delimiter")(delimiter.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (md != null) __obj.updateDynamic("md")(md.asInstanceOf[js.Any])
    __obj.asInstanceOf[FingerprintOptions]
  }
}

