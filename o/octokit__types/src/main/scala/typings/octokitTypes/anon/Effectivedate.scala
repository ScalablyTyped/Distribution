package typings.octokitTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Effectivedate extends js.Object {
  var effective_date: String
  var id: Double
  var plan: Accountsurl
  var unit_count: String
}

object Effectivedate {
  @scala.inline
  def apply(effective_date: String, id: Double, plan: Accountsurl, unit_count: String): Effectivedate = {
    val __obj = js.Dynamic.literal(effective_date = effective_date.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], plan = plan.asInstanceOf[js.Any], unit_count = unit_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[Effectivedate]
  }
}

