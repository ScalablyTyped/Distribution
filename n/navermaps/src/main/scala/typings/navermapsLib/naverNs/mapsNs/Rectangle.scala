package typings
package navermapsLib.naverNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("naver.maps.Rectangle")
@js.native
class Rectangle () extends OverlayView {
  def this(options: RectangleOptions) = this()
  def getAreaSize(): scala.Double = js.native
  def getBounds(): Bounds = js.native
  def getClickable(): scala.Boolean = js.native
  def getDrawingRect(): Bounds = js.native
  def getOptions(): RectangleOptions = js.native
  def getOptions(key: java.lang.String): RectangleOptions = js.native
  def getStyles(): RectangleOptions = js.native
  def getStyles(key: java.lang.String): RectangleOptions = js.native
  def getVisible(): scala.Boolean = js.native
  def getZIndex(): scala.Double = js.native
  def setBounds(bounds: Bounds): scala.Unit = js.native
  def setBounds(bounds: BoundsLiteral): scala.Unit = js.native
  def setClickable(clickable: scala.Boolean): scala.Unit = js.native
  def setOptions(key: java.lang.String, value: js.Any): scala.Unit = js.native
  def setOptions(options: RectangleOptions): scala.Unit = js.native
  def setStyles(key: java.lang.String, value: js.Any): scala.Unit = js.native
  def setStyles(options: RectangleOptions): scala.Unit = js.native
  def setVisible(visible: scala.Boolean): scala.Unit = js.native
  def setZIndex(zIndex: scala.Double): scala.Unit = js.native
}

