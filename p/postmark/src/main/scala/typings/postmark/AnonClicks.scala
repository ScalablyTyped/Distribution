package typings.postmark

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonClicks extends js.Object {
  var Clicks: Double
  var Date: String
  var Unique: Double
}

object AnonClicks {
  @scala.inline
  def apply(Clicks: Double, Date: String, Unique: Double): AnonClicks = {
    val __obj = js.Dynamic.literal(Clicks = Clicks.asInstanceOf[js.Any], Date = Date.asInstanceOf[js.Any], Unique = Unique.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonClicks]
  }
}

