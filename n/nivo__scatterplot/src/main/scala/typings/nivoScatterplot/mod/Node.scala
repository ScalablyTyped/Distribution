package typings.nivoScatterplot.mod

import typings.nivoScatterplot.AnonColor
import typings.nivoScatterplot.AnonFormattedX
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Node extends js.Object {
  var data: AnonFormattedX
  var id: String
  var index: Double
  var serieId: String
  var size: Double
  var style: AnonColor
  var x: Double
  var y: Double
}

object Node {
  @scala.inline
  def apply(
    data: AnonFormattedX,
    id: String,
    index: Double,
    serieId: String,
    size: Double,
    style: AnonColor,
    x: Double,
    y: Double
  ): Node = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], serieId = serieId.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Node]
  }
}

