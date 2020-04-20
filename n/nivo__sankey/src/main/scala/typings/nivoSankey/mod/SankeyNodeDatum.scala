package typings.nivoSankey.mod

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
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], layer = layer.asInstanceOf[js.Any], sourceLinks = sourceLinks.asInstanceOf[js.Any], targetLinks = targetLinks.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], x0 = x0.asInstanceOf[js.Any], x1 = x1.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], y0 = y0.asInstanceOf[js.Any], y1 = y1.asInstanceOf[js.Any])
    __obj.asInstanceOf[SankeyNodeDatum]
  }
}

