package typings.plaidLink.mod.Plaid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Institution extends js.Object {
  var auth: Boolean = js.native
  var institution_id: String = js.native
  var name: String = js.native
  var transactions: Boolean = js.native
}

object Institution {
  @scala.inline
  def apply(auth: Boolean, institution_id: String, name: String, transactions: Boolean): Institution = {
    val __obj = js.Dynamic.literal(auth = auth.asInstanceOf[js.Any], institution_id = institution_id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], transactions = transactions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Institution]
  }
  @scala.inline
  implicit class InstitutionOps[Self <: Institution] (val x: Self) extends AnyVal {
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
    def setAuth(value: Boolean): Self = this.set("auth", value.asInstanceOf[js.Any])
    @scala.inline
    def setInstitution_id(value: String): Self = this.set("institution_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransactions(value: Boolean): Self = this.set("transactions", value.asInstanceOf[js.Any])
  }
  
}

