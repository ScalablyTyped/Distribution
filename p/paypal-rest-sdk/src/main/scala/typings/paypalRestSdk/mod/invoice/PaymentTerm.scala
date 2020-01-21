package typings.paypalRestSdk.mod.invoice

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaymentTerm extends js.Object {
  var due_date: js.UndefOr[String] = js.undefined
  var term_type: js.UndefOr[String] = js.undefined
}

object PaymentTerm {
  @scala.inline
  def apply(due_date: String = null, term_type: String = null): PaymentTerm = {
    val __obj = js.Dynamic.literal()
    if (due_date != null) __obj.updateDynamic("due_date")(due_date.asInstanceOf[js.Any])
    if (term_type != null) __obj.updateDynamic("term_type")(term_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentTerm]
  }
}

