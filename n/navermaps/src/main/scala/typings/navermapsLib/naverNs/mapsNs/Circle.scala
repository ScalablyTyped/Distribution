package typings
package navermapsLib.naverNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Naver Overlays
@JSGlobal("naver.maps.Circle")
@js.native
class Circle () extends OverlayView {
  def this(options: CircleOptions) = this()
  def getAreaSize(): scala.Double = js.native
  def getBounds(): Bounds = js.native
  def getCenter(): Coord = js.native
  def getClickable(): scala.Boolean = js.native
  def getDrawingRect(): Bounds = js.native
  def getOptions(): CircleOptions = js.native
  def getOptions(key: java.lang.String): CircleOptions = js.native
  def getRadius(): scala.Double = js.native
  def getStyles(key: java.lang.String): CircleOptions = js.native
  def getVisible(): scala.Boolean = js.native
  def getZIndex(): scala.Double = js.native
  def setCenter(center: Coord | CoordLiteral): scala.Unit = js.native
  def setClickable(clickable: scala.Boolean): scala.Unit = js.native
  def setOptions(key: java.lang.String, value: js.Any): scala.Unit = js.native
  def setOptions(options: CircleOptions): scala.Unit = js.native
  def setRadius(radius: scala.Double): scala.Unit = js.native
  def setStyles(key: java.lang.String, value: java.lang.String): scala.Unit = js.native
  def setStyles(options: CircleOptions): scala.Unit = js.native
  def setVisible(visible: scala.Boolean): scala.Unit = js.native
  def setZIndex(zIndex: scala.Double): scala.Unit = js.native
}

