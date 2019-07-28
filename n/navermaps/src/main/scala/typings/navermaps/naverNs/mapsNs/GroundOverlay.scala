package typings.navermaps.naverNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("naver.maps.GroundOverlay")
@js.native
class GroundOverlay protected () extends OverlayView {
  def this(url: String, bounds: Bounds) = this()
  def this(url: String, bounds: BoundsLiteral) = this()
  def this(url: String, bounds: BoundsLiteral, options: GroundOverlayOptions) = this()
  def this(url: String, bounds: Bounds, options: GroundOverlayOptions) = this()
  def getBounds(): Bounds = js.native
  def getOpacity(): Double = js.native
  def getUrl(): String = js.native
  def setOpacity(opacity: Double): Unit = js.native
}

