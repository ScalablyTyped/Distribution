package typings
package paypalDashRestDashSdkLib.paypalDashRestDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorDetails extends js.Object {
  val field: java.lang.String
  val issue: java.lang.String
}

object ErrorDetails {
  @scala.inline
  def apply(field: java.lang.String, issue: java.lang.String): ErrorDetails = {
    val __obj = js.Dynamic.literal(field = field, issue = issue)
  
    __obj.asInstanceOf[ErrorDetails]
  }
}

