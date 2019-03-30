package typings
package atNivoHeatmapLib.atNivoHeatmapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeData extends js.Object {
  var height: scala.Double
  var key: java.lang.String
  var opacity: scala.Double
  var value: scala.Double
  var width: scala.Double
  var x: scala.Double
  var xKey: java.lang.String | scala.Double
  var y: scala.Double
  var yKey: java.lang.String | scala.Double
}

object NodeData {
  @scala.inline
  def apply(
    height: scala.Double,
    key: java.lang.String,
    opacity: scala.Double,
    value: scala.Double,
    width: scala.Double,
    x: scala.Double,
    xKey: java.lang.String | scala.Double,
    y: scala.Double,
    yKey: java.lang.String | scala.Double
  ): NodeData = {
    val __obj = js.Dynamic.literal(height = height, key = key, opacity = opacity, value = value, width = width, x = x, xKey = xKey.asInstanceOf[js.Any], y = y, yKey = yKey.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NodeData]
  }
}

