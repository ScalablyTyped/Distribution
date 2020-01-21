package typings.postmark.statsMod

import typings.postmark.AnonDateSpamComplaint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpamCounts extends js.Object {
  var Days: js.Array[AnonDateSpamComplaint]
  var SpamComplaint: Double
}

object SpamCounts {
  @scala.inline
  def apply(Days: js.Array[AnonDateSpamComplaint], SpamComplaint: Double): SpamCounts = {
    val __obj = js.Dynamic.literal(Days = Days.asInstanceOf[js.Any], SpamComplaint = SpamComplaint.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SpamCounts]
  }
}

