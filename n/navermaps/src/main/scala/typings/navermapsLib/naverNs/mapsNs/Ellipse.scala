package typings
package navermapsLib.naverNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("naver.maps.Ellipse")
@js.native
class Ellipse () extends OverlayView {
  def this(options: EllipseOptions) = this()
  def getAreaSize(): scala.Double = js.native
  def getBounds(): Bounds = js.native
  def getClickable(): scala.Boolean = js.native
  def getDrawingRect(): Bounds = js.native
  def getOptions(): EllipseOptions = js.native
  def getOptions(key: java.lang.String): EllipseOptions = js.native
  def getStyles(): EllipseOptions = js.native
  def getStyles(key: java.lang.String): EllipseOptions = js.native
  def getVisible(): scala.Boolean = js.native
  def getZIndex(): scala.Double = js.native
  def setBounds(bounds: Bounds | BoundsLiteral): scala.Unit = js.native
  def setOptions(key: java.lang.String, value: js.Any): scala.Unit = js.native
  def setOptions(options: EllipseOptions): scala.Unit = js.native
  def setStyles(key: java.lang.String, value: js.Any): scala.Unit = js.native
  def setStyles(options: EllipseOptions): scala.Unit = js.native
  def setVisible(visible: scala.Boolean): scala.Unit = js.native
  def setZIndex(zIndex: scala.Double): scala.Unit = js.native
}

