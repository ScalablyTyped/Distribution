package typings
package pkcs11jsLib.Pkcs11JsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Mechanism extends js.Object {
  var mechanism: scala.Double
  var parameter: nodeLib.Buffer | IParams
}

object Mechanism {
  @scala.inline
  def apply(mechanism: scala.Double, parameter: nodeLib.Buffer | IParams): Mechanism = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("mechanism")(mechanism)
    __obj.updateDynamic("parameter")(parameter.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mechanism]
  }
}

