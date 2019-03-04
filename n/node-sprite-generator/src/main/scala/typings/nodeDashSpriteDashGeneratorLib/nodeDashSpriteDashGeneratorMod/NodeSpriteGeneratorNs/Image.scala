package typings
package nodeDashSpriteDashGeneratorLib.nodeDashSpriteDashGeneratorMod.NodeSpriteGeneratorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Image extends js.Object {
  var data: js.Any
  var height: scala.Double
  var width: scala.Double
}

object Image {
  @scala.inline
  def apply(data: js.Any, height: scala.Double, width: scala.Double): Image = {
    val __obj = js.Dynamic.literal(data = data, height = height, width = width)
  
    __obj.asInstanceOf[Image]
  }
}

