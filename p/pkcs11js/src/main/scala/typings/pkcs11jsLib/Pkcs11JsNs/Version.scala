package typings
package pkcs11jsLib.Pkcs11JsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Version extends js.Object {
  var major: scala.Double
  var minor: scala.Double
}

object Version {
  @scala.inline
  def apply(major: scala.Double, minor: scala.Double): Version = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("major")(major)
    __obj.updateDynamic("minor")(minor)
    __obj.asInstanceOf[Version]
  }
}

