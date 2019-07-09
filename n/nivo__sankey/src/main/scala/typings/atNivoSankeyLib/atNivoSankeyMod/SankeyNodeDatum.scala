package typings
package atNivoSankeyLib.atNivoSankeyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SankeyNodeDatum extends js.Object {
  var color: java.lang.String
  var depth: scala.Double
  var height: scala.Double
  var id: java.lang.String
  var index: scala.Double
  var label: java.lang.String
  var layer: scala.Double
  var sourceLinks: js.Array[SankeyLinkDatum]
  var targetLinks: js.Array[SankeyLinkDatum]
  var value: scala.Double
  var width: scala.Double
  var x: scala.Double
  var x0: scala.Double
  var x1: scala.Double
  var y: scala.Double
  var y0: scala.Double
  var y1: scala.Double
}

object SankeyNodeDatum {
  @scala.inline
  def apply(
    color: java.lang.String,
    depth: scala.Double,
    height: scala.Double,
    id: java.lang.String,
    index: scala.Double,
    label: java.lang.String,
    layer: scala.Double,
    sourceLinks: js.Array[SankeyLinkDatum],
    targetLinks: js.Array[SankeyLinkDatum],
    value: scala.Double,
    width: scala.Double,
    x: scala.Double,
    x0: scala.Double,
    x1: scala.Double,
    y: scala.Double,
    y0: scala.Double,
    y1: scala.Double
  ): SankeyNodeDatum = {
    val __obj = js.Dynamic.literal(color = color, depth = depth, height = height, id = id, index = index, label = label, layer = layer, sourceLinks = sourceLinks, targetLinks = targetLinks, value = value, width = width, x = x, x0 = x0, x1 = x1, y = y, y0 = y0, y1 = y1)
  
    __obj.asInstanceOf[SankeyNodeDatum]
  }
}

