package typings.nodeDashForge.nodeDashForgeMod.pki

import typings.nodeDashForge.nodeDashForgeMod.md.MessageDigest
import typings.nodeDashForge.nodeDashForgeStrings.RSAPublicKey
import typings.nodeDashForge.nodeDashForgeStrings.SubjectPublicKeyInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ByteBufferFingerprintOptions extends js.Object {
  /**
    * @description the delimiter to use between bytes for `hex` encoded output
    */
  var delimiter: js.UndefOr[String] = js.undefined
  /**
    * @description if not specified defaults to `md.md5`
    */
  var md: js.UndefOr[MessageDigest] = js.undefined
  /**
    * @description The type of fingerprint. If not specified, defaults to 'RSAPublicKey'
    */
  var `type`: js.UndefOr[SubjectPublicKeyInfo | RSAPublicKey] = js.undefined
}

object ByteBufferFingerprintOptions {
  @scala.inline
  def apply(
    delimiter: String = null,
    md: MessageDigest = null,
    `type`: SubjectPublicKeyInfo | RSAPublicKey = null
  ): ByteBufferFingerprintOptions = {
    val __obj = js.Dynamic.literal()
    if (delimiter != null) __obj.updateDynamic("delimiter")(delimiter.asInstanceOf[js.Any])
    if (md != null) __obj.updateDynamic("md")(md.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ByteBufferFingerprintOptions]
  }
}

