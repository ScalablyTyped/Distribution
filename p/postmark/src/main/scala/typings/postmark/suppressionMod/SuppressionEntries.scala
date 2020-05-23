package typings.postmark.suppressionMod

import typings.postmark.anon.EmailAddress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SuppressionEntries extends js.Object {
  var Suppressions: js.Array[EmailAddress]
}

object SuppressionEntries {
  @scala.inline
  def apply(Suppressions: js.Array[EmailAddress]): SuppressionEntries = {
    val __obj = js.Dynamic.literal(Suppressions = Suppressions.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuppressionEntries]
  }
}

