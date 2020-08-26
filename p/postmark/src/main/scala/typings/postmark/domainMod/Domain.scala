package typings.postmark.domainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Domain extends js.Object {
  var DKIMVerified: Boolean = js.native
  var ID: Double = js.native
  var Name: String = js.native
  var ReturnPathDomainVerified: Boolean = js.native
  var SPFVerified: Boolean = js.native
  var WeakDKIM: Boolean = js.native
}

object Domain {
  @scala.inline
  def apply(
    DKIMVerified: Boolean,
    ID: Double,
    Name: String,
    ReturnPathDomainVerified: Boolean,
    SPFVerified: Boolean,
    WeakDKIM: Boolean
  ): Domain = {
    val __obj = js.Dynamic.literal(DKIMVerified = DKIMVerified.asInstanceOf[js.Any], ID = ID.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], ReturnPathDomainVerified = ReturnPathDomainVerified.asInstanceOf[js.Any], SPFVerified = SPFVerified.asInstanceOf[js.Any], WeakDKIM = WeakDKIM.asInstanceOf[js.Any])
    __obj.asInstanceOf[Domain]
  }
  @scala.inline
  implicit class DomainOps[Self <: Domain] (val x: Self) extends AnyVal {
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
    def setDKIMVerified(value: Boolean): Self = this.set("DKIMVerified", value.asInstanceOf[js.Any])
    @scala.inline
    def setID(value: Double): Self = this.set("ID", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setReturnPathDomainVerified(value: Boolean): Self = this.set("ReturnPathDomainVerified", value.asInstanceOf[js.Any])
    @scala.inline
    def setSPFVerified(value: Boolean): Self = this.set("SPFVerified", value.asInstanceOf[js.Any])
    @scala.inline
    def setWeakDKIM(value: Boolean): Self = this.set("WeakDKIM", value.asInstanceOf[js.Any])
  }
  
}

