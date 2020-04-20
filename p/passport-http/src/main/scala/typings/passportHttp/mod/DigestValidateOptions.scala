package typings.passportHttp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DigestValidateOptions extends js.Object {
  var cnonce: String
  var nc: Double
  var nonce: String
  var opaque: String
}

object DigestValidateOptions {
  @scala.inline
  def apply(cnonce: String, nc: Double, nonce: String, opaque: String): DigestValidateOptions = {
    val __obj = js.Dynamic.literal(cnonce = cnonce.asInstanceOf[js.Any], nc = nc.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any], opaque = opaque.asInstanceOf[js.Any])
    __obj.asInstanceOf[DigestValidateOptions]
  }
}

