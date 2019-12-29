package typings.node.cryptoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ECKeyPairKeyObjectOptions extends js.Object {
  /**
    * Name of the curve to use.
    */
  var namedCurve: String
}

object ECKeyPairKeyObjectOptions {
  @scala.inline
  def apply(namedCurve: String): ECKeyPairKeyObjectOptions = {
    val __obj = js.Dynamic.literal(namedCurve = namedCurve.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ECKeyPairKeyObjectOptions]
  }
}

