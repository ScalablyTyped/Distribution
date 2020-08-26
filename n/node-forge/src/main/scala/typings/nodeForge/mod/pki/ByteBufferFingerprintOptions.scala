package typings.nodeForge.mod.pki

import typings.nodeForge.mod.md.MessageDigest
import typings.nodeForge.nodeForgeStrings.RSAPublicKey
import typings.nodeForge.nodeForgeStrings.SubjectPublicKeyInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ByteBufferFingerprintOptions extends js.Object {
  /**
    * @description the delimiter to use between bytes for `hex` encoded output
    */
  var delimiter: js.UndefOr[String] = js.native
  /**
    * @description if not specified defaults to `md.md5`
    */
  var md: js.UndefOr[MessageDigest] = js.native
  /**
    * @description The type of fingerprint. If not specified, defaults to 'RSAPublicKey'
    */
  var `type`: js.UndefOr[SubjectPublicKeyInfo | RSAPublicKey] = js.native
}

object ByteBufferFingerprintOptions {
  @scala.inline
  def apply(): ByteBufferFingerprintOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ByteBufferFingerprintOptions]
  }
  @scala.inline
  implicit class ByteBufferFingerprintOptionsOps[Self <: ByteBufferFingerprintOptions] (val x: Self) extends AnyVal {
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
    def setDelimiter(value: String): Self = this.set("delimiter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelimiter: Self = this.set("delimiter", js.undefined)
    @scala.inline
    def setMd(value: MessageDigest): Self = this.set("md", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMd: Self = this.set("md", js.undefined)
    @scala.inline
    def setType(value: SubjectPublicKeyInfo | RSAPublicKey): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

