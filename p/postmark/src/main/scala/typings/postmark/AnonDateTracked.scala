package typings.postmark

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDateTracked extends js.Object {
  var Date: String
  var Tracked: Double
}

object AnonDateTracked {
  @scala.inline
  def apply(Date: String, Tracked: Double): AnonDateTracked = {
    val __obj = js.Dynamic.literal(Date = Date.asInstanceOf[js.Any], Tracked = Tracked.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDateTracked]
  }
}

