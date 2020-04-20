package typings.postmark.statsMod

import typings.postmark.AnonClicks
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClickCounts extends js.Object {
  var Clicks: Double
  var Days: js.Array[AnonClicks]
  var Unique: Double
}

object ClickCounts {
  @scala.inline
  def apply(Clicks: Double, Days: js.Array[AnonClicks], Unique: Double): ClickCounts = {
    val __obj = js.Dynamic.literal(Clicks = Clicks.asInstanceOf[js.Any], Days = Days.asInstanceOf[js.Any], Unique = Unique.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClickCounts]
  }
}

