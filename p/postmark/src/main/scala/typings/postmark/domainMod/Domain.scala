package typings.postmark.domainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Domain extends js.Object {
  var DKIMVerified: Boolean
  var ID: Double
  var Name: String
  var ReturnPathDomainVerified: Boolean
  var SPFVerified: Boolean
  var WeakDKIM: Boolean
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
}

