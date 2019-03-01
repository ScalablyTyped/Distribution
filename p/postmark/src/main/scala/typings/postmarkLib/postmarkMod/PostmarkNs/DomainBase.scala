package typings
package postmarkLib.postmarkMod.PostmarkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// domain
trait DomainBase extends js.Object {
  var DKIMVerified: scala.Boolean
  var ID: scala.Double
  var Name: java.lang.String
  var ReturnPathDomainVerified: scala.Boolean
  var SPFVerified: scala.Boolean
  var WeakDKIM: scala.Boolean
}

object DomainBase {
  @scala.inline
  def apply(
    DKIMVerified: scala.Boolean,
    ID: scala.Double,
    Name: java.lang.String,
    ReturnPathDomainVerified: scala.Boolean,
    SPFVerified: scala.Boolean,
    WeakDKIM: scala.Boolean
  ): DomainBase = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("DKIMVerified")(DKIMVerified)
    __obj.updateDynamic("ID")(ID)
    __obj.updateDynamic("Name")(Name)
    __obj.updateDynamic("ReturnPathDomainVerified")(ReturnPathDomainVerified)
    __obj.updateDynamic("SPFVerified")(SPFVerified)
    __obj.updateDynamic("WeakDKIM")(WeakDKIM)
    __obj.asInstanceOf[DomainBase]
  }
}

