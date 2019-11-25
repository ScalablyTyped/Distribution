package typings.atNivoSankey.atNivoSankeyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SankeyNodeProps extends js.Object {
  var color: String
  var height: Double
  var id: String | Double
  var label: String
  var width: Double
  var x: Double
  var y: Double
}

object SankeyNodeProps {
  @scala.inline
  def apply(
    color: String,
    height: Double,
    id: String | Double,
    label: String,
    width: Double,
    x: Double,
    y: Double
  ): SankeyNodeProps = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SankeyNodeProps]
  }
}

