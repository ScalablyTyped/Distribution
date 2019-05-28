package typings
package pkcs11jsLib.Pkcs11JsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Mechanism extends js.Object {
  var mechanism: scala.Double
  var parameter: js.UndefOr[nodeLib.Buffer | IParams] = js.undefined
}

object Mechanism {
  @scala.inline
  def apply(mechanism: scala.Double, parameter: nodeLib.Buffer | IParams = null): Mechanism = {
    val __obj = js.Dynamic.literal(mechanism = mechanism)
    if (parameter != null) __obj.updateDynamic("parameter")(parameter.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mechanism]
  }
}

