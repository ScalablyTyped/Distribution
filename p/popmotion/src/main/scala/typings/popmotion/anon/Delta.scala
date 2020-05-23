package typings.popmotion.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Delta extends js.Object {
  var delta: Double
  var timestamp: Double
}

object Delta {
  @scala.inline
  def apply(delta: Double, timestamp: Double): Delta = {
    val __obj = js.Dynamic.literal(delta = delta.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[Delta]
  }
}

