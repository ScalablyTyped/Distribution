package typings.ol.styleAtlasMod

import typings.std.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AtlasInfo extends js.Object {
  var image: HTMLCanvasElement
  var offsetX: Double
  var offsetY: Double
}

object AtlasInfo {
  @scala.inline
  def apply(image: HTMLCanvasElement, offsetX: Double, offsetY: Double): AtlasInfo = {
    val __obj = js.Dynamic.literal(image = image, offsetX = offsetX, offsetY = offsetY)
  
    __obj.asInstanceOf[AtlasInfo]
  }
}

