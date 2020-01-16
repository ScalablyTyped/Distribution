package typings.nodeDashForge.nodeDashForgeMod.pki

import typings.nodeDashForge.nodeDashForgeMod.md.MessageDigest
import typings.nodeDashForge.nodeDashForgeStrings.RSAPublicKey
import typings.nodeDashForge.nodeDashForgeStrings.SubjectPublicKeyInfo
import typings.nodeDashForge.nodeDashForgeStrings.hex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HexFingerprintOptions extends ByteBufferFingerprintOptions {
  /**
    * @description if not specified, the function will return `ByteStringBuffer`
    */
  var encoding: hex
}

object HexFingerprintOptions {
  @scala.inline
  def apply(
    encoding: hex,
    delimiter: String = null,
    md: MessageDigest = null,
    `type`: SubjectPublicKeyInfo | RSAPublicKey = null
  ): HexFingerprintOptions = {
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any])
    if (delimiter != null) __obj.updateDynamic("delimiter")(delimiter.asInstanceOf[js.Any])
    if (md != null) __obj.updateDynamic("md")(md.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HexFingerprintOptions]
  }
}

