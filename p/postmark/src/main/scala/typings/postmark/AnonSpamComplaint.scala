package typings.postmark

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSpamComplaint extends js.Object {
  var Date: String
  var SpamComplaint: Double
}

object AnonSpamComplaint {
  @scala.inline
  def apply(Date: String, SpamComplaint: Double): AnonSpamComplaint = {
    val __obj = js.Dynamic.literal(Date = Date.asInstanceOf[js.Any], SpamComplaint = SpamComplaint.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSpamComplaint]
  }
}

