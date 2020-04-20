package typings.plotlyJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GaugeLine extends js.Object {
  var color: Color
  var width: Double
}

object GaugeLine {
  @scala.inline
  def apply(color: Color, width: Double): GaugeLine = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[GaugeLine]
  }
}

