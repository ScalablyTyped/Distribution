package typings
package plaidDashLinkLib.plaidDashLinkMod.PlaidNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Institution extends js.Object {
  var auth: scala.Boolean
  var institution_id: java.lang.String
  var name: java.lang.String
  var transactions: scala.Boolean
}

object Institution {
  @scala.inline
  def apply(
    auth: scala.Boolean,
    institution_id: java.lang.String,
    name: java.lang.String,
    transactions: scala.Boolean
  ): Institution = {
    val __obj = js.Dynamic.literal(auth = auth, institution_id = institution_id, name = name, transactions = transactions)
  
    __obj.asInstanceOf[Institution]
  }
}

