package typings.postmark.suppressionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SuppressionStatuses extends js.Object {
  var Suppressions: js.Array[SuppressionStatus]
}

object SuppressionStatuses {
  @scala.inline
  def apply(Suppressions: js.Array[SuppressionStatus]): SuppressionStatuses = {
    val __obj = js.Dynamic.literal(Suppressions = Suppressions.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SuppressionStatuses]
  }
}

