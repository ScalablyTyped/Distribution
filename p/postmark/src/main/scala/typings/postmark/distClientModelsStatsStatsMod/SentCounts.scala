package typings.postmark.distClientModelsStatsStatsMod

import typings.postmark.Anon_Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SentCounts extends js.Object {
  var Days: js.Array[Anon_Date]
  var Sent: Double
}

object SentCounts {
  @scala.inline
  def apply(Days: js.Array[Anon_Date], Sent: Double): SentCounts = {
    val __obj = js.Dynamic.literal(Days = Days.asInstanceOf[js.Any], Sent = Sent.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SentCounts]
  }
}

