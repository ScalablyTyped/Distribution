package typings.postmark

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDate extends js.Object {
  var Date: String
  var Sent: Double
}

object AnonDate {
  @scala.inline
  def apply(Date: String, Sent: Double): AnonDate = {
    val __obj = js.Dynamic.literal(Date = Date.asInstanceOf[js.Any], Sent = Sent.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDate]
  }
}

