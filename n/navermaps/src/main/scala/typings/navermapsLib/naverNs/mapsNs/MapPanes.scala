package typings
package navermapsLib.naverNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapPanes extends js.Object {
  var floatPane: stdLib.HTMLElement
  var overlayImage: stdLib.HTMLElement
  var overlayLayer: stdLib.HTMLElement
}

object MapPanes {
  @scala.inline
  def apply(floatPane: stdLib.HTMLElement, overlayImage: stdLib.HTMLElement, overlayLayer: stdLib.HTMLElement): MapPanes = {
    val __obj = js.Dynamic.literal(floatPane = floatPane, overlayImage = overlayImage, overlayLayer = overlayLayer)
  
    __obj.asInstanceOf[MapPanes]
  }
}

