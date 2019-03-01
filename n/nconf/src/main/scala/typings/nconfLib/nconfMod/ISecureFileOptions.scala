package typings
package nconfLib.nconfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISecureFileOptions extends js.Object {
  var alg: js.UndefOr[java.lang.String] = js.undefined
  var secret: java.lang.String
}

object ISecureFileOptions {
  @scala.inline
  def apply(secret: java.lang.String, alg: java.lang.String = null): ISecureFileOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("secret")(secret)
    if (alg != null) __obj.updateDynamic("alg")(alg)
    __obj.asInstanceOf[ISecureFileOptions]
  }
}

