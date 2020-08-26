package typings.passportSamlMetadata.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultipleCerts extends js.Object {
  var multipleCerts: Boolean = js.native
}

object MultipleCerts {
  @scala.inline
  def apply(multipleCerts: Boolean): MultipleCerts = {
    val __obj = js.Dynamic.literal(multipleCerts = multipleCerts.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultipleCerts]
  }
  @scala.inline
  implicit class MultipleCertsOps[Self <: MultipleCerts] (val x: Self) extends AnyVal {
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
    def setMultipleCerts(value: Boolean): Self = this.set("multipleCerts", value.asInstanceOf[js.Any])
  }
  
}

