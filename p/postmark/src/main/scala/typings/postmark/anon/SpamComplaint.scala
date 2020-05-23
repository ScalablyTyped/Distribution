package typings.postmark.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpamComplaint extends js.Object {
  var Date: String
  var SpamComplaint: Double
}

object SpamComplaint {
  @scala.inline
  def apply(Date: String, SpamComplaint: Double): SpamComplaint = {
    val __obj = js.Dynamic.literal(Date = Date.asInstanceOf[js.Any], SpamComplaint = SpamComplaint.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpamComplaint]
  }
}

