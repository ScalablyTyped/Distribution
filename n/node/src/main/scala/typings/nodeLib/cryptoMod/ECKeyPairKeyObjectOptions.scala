package typings
package nodeLib.cryptoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ECKeyPairKeyObjectOptions extends js.Object {
  /**
    * Name of the curve to use.
    */
  var namedCurve: java.lang.String
}

object ECKeyPairKeyObjectOptions {
  @scala.inline
  def apply(namedCurve: java.lang.String): ECKeyPairKeyObjectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("namedCurve")(namedCurve)
    __obj.asInstanceOf[ECKeyPairKeyObjectOptions]
  }
}

