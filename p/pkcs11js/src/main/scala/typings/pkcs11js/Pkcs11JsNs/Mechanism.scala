package typings.pkcs11js.Pkcs11JsNs

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Mechanism extends js.Object {
  var mechanism: Double
  var parameter: js.UndefOr[Buffer | IParams] = js.undefined
}

object Mechanism {
  @scala.inline
  def apply(mechanism: Double, parameter: Buffer | IParams = null): Mechanism = {
    val __obj = js.Dynamic.literal(mechanism = mechanism)
    if (parameter != null) __obj.updateDynamic("parameter")(parameter.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mechanism]
  }
}

