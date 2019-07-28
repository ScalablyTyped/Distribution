package typings.plugapi.plugapiMod

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
    val __obj = js.Dynamic.literal(grabs = grabs, listeners = listeners, negative = negative, positive = positive, skipped = skipped)
  
    __obj.asInstanceOf[Score]
  }
}

