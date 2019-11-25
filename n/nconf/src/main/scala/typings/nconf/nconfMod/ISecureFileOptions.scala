package typings.nconf.nconfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISecureFileOptions extends js.Object {
  var alg: js.UndefOr[String] = js.undefined
  var secret: String
}

object ISecureFileOptions {
  @scala.inline
  def apply(secret: String, alg: String = null): ISecureFileOptions = {
    val __obj = js.Dynamic.literal(secret = secret.asInstanceOf[js.Any])
    if (alg != null) __obj.updateDynamic("alg")(alg.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISecureFileOptions]
  }
}

