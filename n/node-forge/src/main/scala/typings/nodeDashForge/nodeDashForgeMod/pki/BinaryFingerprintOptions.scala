package typings.nodeDashForge.nodeDashForgeMod.pki

import typings.nodeDashForge.nodeDashForgeMod.md.MessageDigest
import typings.nodeDashForge.nodeDashForgeStrings.RSAPublicKey
import typings.nodeDashForge.nodeDashForgeStrings.SubjectPublicKeyInfo
import typings.nodeDashForge.nodeDashForgeStrings.binary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BinaryFingerprintOptions extends ByteBufferFingerprintOptions {
  /**
    * @description if not specified, the function will return `ByteStringBuffer`
    */
  var encoding: binary
}

object BinaryFingerprintOptions {
  @scala.inline
  def apply(
    encoding: binary,
    delimiter: String = null,
    md: MessageDigest = null,
    `type`: SubjectPublicKeyInfo | RSAPublicKey = null
  ): BinaryFingerprintOptions = {
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any])
    if (delimiter != null) __obj.updateDynamic("delimiter")(delimiter.asInstanceOf[js.Any])
    if (md != null) __obj.updateDynamic("md")(md.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BinaryFingerprintOptions]
  }
}

