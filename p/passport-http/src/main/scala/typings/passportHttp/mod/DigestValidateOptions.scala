package typings.passportHttp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DigestValidateOptions extends js.Object {
  var cnonce: String = js.native
  var nc: Double = js.native
  var nonce: String = js.native
  var opaque: String = js.native
}

object DigestValidateOptions {
  @scala.inline
  def apply(cnonce: String, nc: Double, nonce: String, opaque: String): DigestValidateOptions = {
    val __obj = js.Dynamic.literal(cnonce = cnonce.asInstanceOf[js.Any], nc = nc.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any], opaque = opaque.asInstanceOf[js.Any])
    __obj.asInstanceOf[DigestValidateOptions]
  }
  @scala.inline
  implicit class DigestValidateOptionsOps[Self <: DigestValidateOptions] (val x: Self) extends AnyVal {
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
    def setCnonce(value: String): Self = this.set("cnonce", value.asInstanceOf[js.Any])
    @scala.inline
    def setNc(value: Double): Self = this.set("nc", value.asInstanceOf[js.Any])
    @scala.inline
    def setNonce(value: String): Self = this.set("nonce", value.asInstanceOf[js.Any])
    @scala.inline
    def setOpaque(value: String): Self = this.set("opaque", value.asInstanceOf[js.Any])
  }
  
}

