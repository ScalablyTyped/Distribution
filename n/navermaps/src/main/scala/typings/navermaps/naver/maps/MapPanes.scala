package typings.navermaps.naver.maps

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
    val __obj = js.Dynamic.literal(floatPane = floatPane.asInstanceOf[js.Any], overlayImage = overlayImage.asInstanceOf[js.Any], overlayLayer = overlayLayer.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapPanes]
  }
}

