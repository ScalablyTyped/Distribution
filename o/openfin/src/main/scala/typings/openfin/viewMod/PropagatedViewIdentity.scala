package typings.openfin.viewMod

import typings.openfin.identityMod.NamedIdentity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PropagatedViewIdentity extends js.Object {
  var viewIdentity: NamedIdentity = js.native
}

object PropagatedViewIdentity {
  @scala.inline
  def apply(viewIdentity: NamedIdentity): PropagatedViewIdentity = {
    val __obj = js.Dynamic.literal(viewIdentity = viewIdentity.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropagatedViewIdentity]
  }
  @scala.inline
  implicit class PropagatedViewIdentityOps[Self <: PropagatedViewIdentity] (val x: Self) extends AnyVal {
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
    def setViewIdentity(value: NamedIdentity): Self = this.set("viewIdentity", value.asInstanceOf[js.Any])
  }
  
}

