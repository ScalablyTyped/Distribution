package typings.navermaps.naver.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroundOverlay extends OverlayView {
  def getBounds(): Bounds = js.native
  def getOpacity(): Double = js.native
  def getUrl(): String = js.native
  def setOpacity(opacity: Double): Unit = js.native
}

