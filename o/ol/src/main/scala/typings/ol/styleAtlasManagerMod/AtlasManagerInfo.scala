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
    val __obj = js.Dynamic.literal(hitImage = hitImage.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], offsetX = offsetX.asInstanceOf[js.Any], offsetY = offsetY.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AtlasManagerInfo]
  }
}

