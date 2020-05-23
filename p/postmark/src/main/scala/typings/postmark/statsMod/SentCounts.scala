package typings.postmark.statsMod

import typings.postmark.anon.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SentCounts extends js.Object {
  var Days: js.Array[Date]
  var Sent: Double
}

object SentCounts {
  @scala.inline
  def apply(Days: js.Array[Date], Sent: Double): SentCounts = {
    val __obj = js.Dynamic.literal(Days = Days.asInstanceOf[js.Any], Sent = Sent.asInstanceOf[js.Any])
    __obj.asInstanceOf[SentCounts]
  }
}

