package typings.plugapi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Score extends js.Object {
  var grabs: Double
  var listeners: Double
  var negative: Double
  var positive: Double
  var skipped: Double
}

object Score {
  @scala.inline
  def apply(grabs: Double, listeners: Double, negative: Double, positive: Double, skipped: Double): Score = {
    val __obj = js.Dynamic.literal(grabs = grabs.asInstanceOf[js.Any], listeners = listeners.asInstanceOf[js.Any], negative = negative.asInstanceOf[js.Any], positive = positive.asInstanceOf[js.Any], skipped = skipped.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Score]
  }
}

