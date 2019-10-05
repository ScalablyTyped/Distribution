package typings.plaidDashLink.plaidDashLinkMod.Plaid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Institution extends js.Object {
  var auth: Boolean
  var institution_id: String
  var name: String
  var transactions: Boolean
}

object Institution {
  @scala.inline
  def apply(auth: Boolean, institution_id: String, name: String, transactions: Boolean): Institution = {
    val __obj = js.Dynamic.literal(auth = auth, institution_id = institution_id, name = name, transactions = transactions)
  
    __obj.asInstanceOf[Institution]
  }
}

