package typings
package atNivoScatterplotLib.atNivoScatterplotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Node extends js.Object {
  var data: atNivoScatterplotLib.Anon_FormattedX
  var id: java.lang.String
  var index: scala.Double
  var serieId: java.lang.String
  var size: scala.Double
  var style: atNivoScatterplotLib.Anon_Color
  var x: scala.Double
  var y: scala.Double
}

object Node {
  @scala.inline
  def apply(
    data: atNivoScatterplotLib.Anon_FormattedX,
    id: java.lang.String,
    index: scala.Double,
    serieId: java.lang.String,
    size: scala.Double,
    style: atNivoScatterplotLib.Anon_Color,
    x: scala.Double,
    y: scala.Double
  ): Node = {
    val __obj = js.Dynamic.literal(data = data, id = id, index = index, serieId = serieId, size = size, style = style, x = x, y = y)
  
    __obj.asInstanceOf[Node]
  }
}

