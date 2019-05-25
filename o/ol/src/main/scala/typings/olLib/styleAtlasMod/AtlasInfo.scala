package typings
package olLib.styleAtlasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AtlasInfo extends js.Object {
  var image: stdLib.HTMLCanvasElement
  var offsetX: scala.Double
  var offsetY: scala.Double
}

object AtlasInfo {
  @scala.inline
  def apply(image: stdLib.HTMLCanvasElement, offsetX: scala.Double, offsetY: scala.Double): AtlasInfo = {
    val __obj = js.Dynamic.literal(image = image, offsetX = offsetX, offsetY = offsetY)
  
    __obj.asInstanceOf[AtlasInfo]
  }
}

