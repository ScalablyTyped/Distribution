package typings.postmark.postmarkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// domain
trait DomainBase extends js.Object {
  var DKIMVerified: Boolean
  var ID: Double
  var Name: String
  var ReturnPathDomainVerified: Boolean
  var SPFVerified: Boolean
  var WeakDKIM: Boolean
}

object DomainBase {
  @scala.inline
  def apply(
    DKIMVerified: Boolean,
    ID: Double,
    Name: String,
    ReturnPathDomainVerified: Boolean,
    SPFVerified: Boolean,
    WeakDKIM: Boolean
  ): DomainBase = {
    val __obj = js.Dynamic.literal(DKIMVerified = DKIMVerified, ID = ID, Name = Name, ReturnPathDomainVerified = ReturnPathDomainVerified, SPFVerified = SPFVerified, WeakDKIM = WeakDKIM)
  
    __obj.asInstanceOf[DomainBase]
  }
}

