package typings.plotlyJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDuration extends js.Object {
  var duration: Double
  var redraw: Boolean
}

object AnonDuration {
  @scala.inline
  def apply(duration: Double, redraw: Boolean): AnonDuration = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], redraw = redraw.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDuration]
  }
}

