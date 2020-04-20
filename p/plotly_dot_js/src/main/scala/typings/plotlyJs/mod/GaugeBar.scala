package typings.plotlyJs.mod

import typings.plotlyJs.PartialGaugeLine
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GaugeBar extends js.Object {
  var color: Color
  var line: PartialGaugeLine
  var thickness: Double
}

object GaugeBar {
  @scala.inline
  def apply(color: Color, line: PartialGaugeLine, thickness: Double): GaugeBar = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], thickness = thickness.asInstanceOf[js.Any])
    __obj.asInstanceOf[GaugeBar]
  }
}

