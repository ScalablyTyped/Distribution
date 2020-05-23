package typings.nivoScatterplot.mod

import typings.nivoScatterplot.anon.Color
import typings.nivoScatterplot.anon.FormattedX
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Node extends js.Object {
  var data: FormattedX
  var id: String
  var index: Double
  var serieId: String
  var size: Double
  var style: Color
  var x: Double
  var y: Double
}

object Node {
  @scala.inline
  def apply(
    data: FormattedX,
    id: String,
    index: Double,
    serieId: String,
    size: Double,
    style: Color,
    x: Double,
    y: Double
  ): Node = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], serieId = serieId.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
}

