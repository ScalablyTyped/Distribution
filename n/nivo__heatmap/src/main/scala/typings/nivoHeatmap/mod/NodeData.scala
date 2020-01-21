package typings.nivoHeatmap.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeData extends js.Object {
  var height: Double
  var key: String
  var opacity: Double
  var value: Double
  var width: Double
  var x: Double
  var xKey: String | Double
  var y: Double
  var yKey: String | Double
}

object NodeData {
  @scala.inline
  def apply(
    height: Double,
    key: String,
    opacity: Double,
    value: Double,
    width: Double,
    x: Double,
    xKey: String | Double,
    y: Double,
    yKey: String | Double
  ): NodeData = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], xKey = xKey.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], yKey = yKey.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NodeData]
  }
}

