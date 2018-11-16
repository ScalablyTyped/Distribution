package typings
package navermapsLib.naverNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("naver.maps.GroundOverlay")
@js.native
class GroundOverlay protected () extends OverlayView {
  def this(url: java.lang.String, bounds: Bounds | BoundsLiteral) = this()
  def this(url: java.lang.String, bounds: Bounds | BoundsLiteral, options: GroundOverlayOptions) = this()
  def getBounds(): Bounds = js.native
  def getOpacity(): scala.Double = js.native
  def getUrl(): java.lang.String = js.native
  def setOpacity(opacity: scala.Double): scala.Unit = js.native
}

