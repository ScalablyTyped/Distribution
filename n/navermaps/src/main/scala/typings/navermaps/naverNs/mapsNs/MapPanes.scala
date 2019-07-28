package typings.navermaps.naverNs.mapsNs

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapPanes extends js.Object {
  var floatPane: HTMLElement
  var overlayImage: HTMLElement
  var overlayLayer: HTMLElement
}

object MapPanes {
  @scala.inline
  def apply(floatPane: HTMLElement, overlayImage: HTMLElement, overlayLayer: HTMLElement): MapPanes = {
    val __obj = js.Dynamic.literal(floatPane = floatPane, overlayImage = overlayImage, overlayLayer = overlayLayer)
  
    __obj.asInstanceOf[MapPanes]
  }
}

