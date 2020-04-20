package typings.postmark.suppressionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Suppression extends js.Object {
  var CreatedAt: String
  var EmailAddress: String
  var Origin: String
  var SuppressionReason: String
}

object Suppression {
  @scala.inline
  def apply(CreatedAt: String, EmailAddress: String, Origin: String, SuppressionReason: String): Suppression = {
    val __obj = js.Dynamic.literal(CreatedAt = CreatedAt.asInstanceOf[js.Any], EmailAddress = EmailAddress.asInstanceOf[js.Any], Origin = Origin.asInstanceOf[js.Any], SuppressionReason = SuppressionReason.asInstanceOf[js.Any])
    __obj.asInstanceOf[Suppression]
  }
}

