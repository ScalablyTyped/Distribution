package typings.plotlyJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Duration extends js.Object {
  var duration: Double
  var redraw: Boolean
}

object Duration {
  @scala.inline
  def apply(duration: Double, redraw: Boolean): Duration = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], redraw = redraw.asInstanceOf[js.Any])
    __obj.asInstanceOf[Duration]
  }
}

