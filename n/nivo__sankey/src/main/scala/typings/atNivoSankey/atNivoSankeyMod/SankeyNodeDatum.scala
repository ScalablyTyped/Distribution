package typings.atNivoSankey.atNivoSankeyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SankeyNodeDatum extends js.Object {
  var color: String
  var depth: Double
  var height: Double
  var id: String
  var index: Double
  var label: String
  var layer: Double
  var sourceLinks: js.Array[SankeyLinkDatum]
  var targetLinks: js.Array[SankeyLinkDatum]
  var value: Double
  var width: Double
  var x: Double
  var x0: Double
  var x1: Double
  var y: Double
  var y0: Double
  var y1: Double
}

object SankeyNodeDatum {
  @scala.inline
  def apply(
    color: String,
    depth: Double,
    height: Double,
    id: String,
    index: Double,
    label: String,
    layer: Double,
    sourceLinks: js.Array[SankeyLinkDatum],
    targetLinks: js.Array[SankeyLinkDatum],
    value: Double,
    width: Double,
    x: Double,
    x0: Double,
    x1: Double,
    y: Double,
    y0: Double,
    y1: Double
  ): SankeyNodeDatum = {
    val __obj = js.Dynamic.literal(color = color, depth = depth, height = height, id = id, index = index, label = label, layer = layer, sourceLinks = sourceLinks, targetLinks = targetLinks, value = value, width = width, x = x, x0 = x0, x1 = x1, y = y, y0 = y0, y1 = y1)
  
    __obj.asInstanceOf[SankeyNodeDatum]
  }
}

