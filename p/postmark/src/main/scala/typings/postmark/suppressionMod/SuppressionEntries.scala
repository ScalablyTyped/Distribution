package typings.postmark.suppressionMod

import typings.postmark.AnonEmailAddress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SuppressionEntries extends js.Object {
  var Suppressions: js.Array[AnonEmailAddress]
}

object SuppressionEntries {
  @scala.inline
  def apply(Suppressions: js.Array[AnonEmailAddress]): SuppressionEntries = {
    val __obj = js.Dynamic.literal(Suppressions = Suppressions.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuppressionEntries]
  }
}

