package typings.ol.styleAtlasManagerMod

import typings.std.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AtlasManagerInfo extends js.Object {
  var hitImage: HTMLCanvasElement
  var image: HTMLCanvasElement
  var offsetX: Double
  var offsetY: Double
}

object AtlasManagerInfo {
  @scala.inline
  def apply(hitImage: HTMLCanvasElement, image: HTMLCanvasElement, offsetX: Double, offsetY: Double): AtlasManagerInfo = {
    val __obj = js.Dynamic.literal(hitImage = hitImage, image = image, offsetX = offsetX, offsetY = offsetY)
  
    __obj.asInstanceOf[AtlasManagerInfo]
  }
}

