package typings.plotlyJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEnd extends js.Object {
  var end: Double | String
  var size: Double | String
  var start: Double | String
}

object AnonEnd {
  @scala.inline
  def apply(end: Double | String, size: Double | String, start: Double | String): AnonEnd = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonEnd]
  }
}

