package typings
package atNivoSankeyLib.atNivoSankeyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SankeyNodeProps extends js.Object {
  var color: java.lang.String
  var height: scala.Double
  var id: java.lang.String | scala.Double
  var label: java.lang.String
  var width: scala.Double
  var x: scala.Double
  var y: scala.Double
}

object SankeyNodeProps {
  @scala.inline
  def apply(
    color: java.lang.String,
    height: scala.Double,
    id: java.lang.String | scala.Double,
    label: java.lang.String,
    width: scala.Double,
    x: scala.Double,
    y: scala.Double
  ): SankeyNodeProps = {
    val __obj = js.Dynamic.literal(color = color, height = height, id = id.asInstanceOf[js.Any], label = label, width = width, x = x, y = y)
  
    __obj.asInstanceOf[SankeyNodeProps]
  }
}

