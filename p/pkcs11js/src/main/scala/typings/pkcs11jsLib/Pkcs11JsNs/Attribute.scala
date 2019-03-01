package typings
package pkcs11jsLib.Pkcs11JsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Attribute extends js.Object {
  var `type`: scala.Double
  var value: js.UndefOr[scala.Double | scala.Boolean | java.lang.String | nodeLib.Buffer] = js.undefined
}

object Attribute {
  @scala.inline
  def apply(
    `type`: scala.Double,
    value: scala.Double | scala.Boolean | java.lang.String | nodeLib.Buffer = null
  ): Attribute = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attribute]
  }
}

