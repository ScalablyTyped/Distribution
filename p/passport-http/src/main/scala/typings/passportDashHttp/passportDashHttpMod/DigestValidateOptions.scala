package typings.passportDashHttp.passportDashHttpMod

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
    val __obj = js.Dynamic.literal(cnonce = cnonce, nc = nc, nonce = nonce, opaque = opaque)
  
    __obj.asInstanceOf[DigestValidateOptions]
  }
}

