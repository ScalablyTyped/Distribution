package typings.node.cryptoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ECKeyPairKeyObjectOptions extends js.Object {
  /**
    * Name of the curve to use.
    */
  var namedCurve: String = js.native
}

object ECKeyPairKeyObjectOptions {
  @scala.inline
  def apply(namedCurve: String): ECKeyPairKeyObjectOptions = {
    val __obj = js.Dynamic.literal(namedCurve = namedCurve.asInstanceOf[js.Any])
    __obj.asInstanceOf[ECKeyPairKeyObjectOptions]
  }
  @scala.inline
  implicit class ECKeyPairKeyObjectOptionsOps[Self <: ECKeyPairKeyObjectOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setNamedCurve(value: String): Self = this.set("namedCurve", value.asInstanceOf[js.Any])
  }
  
}

