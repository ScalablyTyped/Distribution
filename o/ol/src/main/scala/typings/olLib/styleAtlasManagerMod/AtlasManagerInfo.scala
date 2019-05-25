package typings
package olLib.styleAtlasManagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AtlasManagerInfo extends js.Object {
  var hitImage: stdLib.HTMLCanvasElement
  var image: stdLib.HTMLCanvasElement
  var offsetX: scala.Double
  var offsetY: scala.Double
}

object AtlasManagerInfo {
  @scala.inline
  def apply(
    hitImage: stdLib.HTMLCanvasElement,
    image: stdLib.HTMLCanvasElement,
    offsetX: scala.Double,
    offsetY: scala.Double
  ): AtlasManagerInfo = {
    val __obj = js.Dynamic.literal(hitImage = hitImage, image = image, offsetX = offsetX, offsetY = offsetY)
  
    __obj.asInstanceOf[AtlasManagerInfo]
  }
}

