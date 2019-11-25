package typings.paypalDashRestDashSdk.paypalDashRestDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorDetails extends js.Object {
  val field: String
  val issue: String
}

object ErrorDetails {
  @scala.inline
  def apply(field: String, issue: String): ErrorDetails = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], issue = issue.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ErrorDetails]
  }
}

