package typings
package passportDashHttpLib.passportDashHttpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DigestValidateOptions extends js.Object {
  var cnonce: java.lang.String
  var nc: scala.Double
  var nonce: java.lang.String
  var opaque: java.lang.String
}

object DigestValidateOptions {
  @scala.inline
  def apply(cnonce: java.lang.String, nc: scala.Double, nonce: java.lang.String, opaque: java.lang.String): DigestValidateOptions = {
    val __obj = js.Dynamic.literal(cnonce = cnonce, nc = nc, nonce = nonce, opaque = opaque)
  
    __obj.asInstanceOf[DigestValidateOptions]
  }
}

