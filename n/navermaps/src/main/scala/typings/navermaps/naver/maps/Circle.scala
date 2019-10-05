package typings.navermaps.naver.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Naver Overlays
@JSGlobal("naver.maps.Circle")
@js.native
class Circle () extends OverlayView {
  def this(options: CircleOptions) = this()
  def getAreaSize(): Double = js.native
  def getBounds(): Bounds = js.native
  def getCenter(): Coord = js.native
  def getClickable(): Boolean = js.native
  def getDrawingRect(): Bounds = js.native
  def getOptions(): CircleOptions = js.native
  def getOptions(key: String): CircleOptions = js.native
  def getRadius(): Double = js.native
  def getStyles(key: String): CircleOptions = js.native
  def getVisible(): Boolean = js.native
  def getZIndex(): Double = js.native
  def setCenter(center: Coord): Unit = js.native
  def setCenter(center: CoordLiteral): Unit = js.native
  def setClickable(clickable: Boolean): Unit = js.native
  def setOptions(key: String, value: js.Any): Unit = js.native
  def setOptions(options: CircleOptions): Unit = js.native
  def setRadius(radius: Double): Unit = js.native
  def setStyles(key: String, value: String): Unit = js.native
  def setStyles(options: CircleOptions): Unit = js.native
  def setVisible(visible: Boolean): Unit = js.native
  def setZIndex(zIndex: Double): Unit = js.native
}

