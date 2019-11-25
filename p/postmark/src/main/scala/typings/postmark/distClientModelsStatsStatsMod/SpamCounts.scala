package typings.postmark.distClientModelsStatsStatsMod

import typings.postmark.Anon_DateSpamComplaint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpamCounts extends js.Object {
  var Days: js.Array[Anon_DateSpamComplaint]
  var SpamComplaint: Double
}

object SpamCounts {
  @scala.inline
  def apply(Days: js.Array[Anon_DateSpamComplaint], SpamComplaint: Double): SpamCounts = {
    val __obj = js.Dynamic.literal(Days = Days.asInstanceOf[js.Any], SpamComplaint = SpamComplaint.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SpamCounts]
  }
}

