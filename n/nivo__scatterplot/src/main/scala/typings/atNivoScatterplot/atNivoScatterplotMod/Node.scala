package typings.atNivoScatterplot.atNivoScatterplotMod

import typings.atNivoScatterplot.Anon_Color
import typings.atNivoScatterplot.Anon_FormattedX
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Node extends js.Object {
  var data: Anon_FormattedX
  var id: String
  var index: Double
  var serieId: String
  var size: Double
  var style: Anon_Color
  var x: Double
  var y: Double
}

object Node {
  @scala.inline
  def apply(
    data: Anon_FormattedX,
    id: String,
    index: Double,
    serieId: String,
    size: Double,
    style: Anon_Color,
    x: Double,
    y: Double
  ): Node = {
    val __obj = js.Dynamic.literal(data = data, id = id, index = index, serieId = serieId, size = size, style = style, x = x, y = y)
  
    __obj.asInstanceOf[Node]
  }
}

