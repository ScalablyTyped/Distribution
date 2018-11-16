package typings
package navermapsLib.naverNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("naver.maps.Polyline")
@js.native
class Polyline () extends OverlayView {
  def this(options: PolylineOptions) = this()
  def getBounds(): Bounds = js.native
  def getClickable(): scala.Boolean = js.native
  def getDistance(): scala.Double = js.native
  def getDrawingRect(): Bounds = js.native
  def getOptions(): PolylineOptions = js.native
  def getOptions(key: java.lang.String): PolylineOptions = js.native
  def getPath(): ArrayOfCoords | KVOArrayOfCoords = js.native
  def getStyles(): PolylineOptions = js.native
  def getStyles(key: java.lang.String): PolylineOptions = js.native
  def getVisible(): scala.Boolean = js.native
  def getZIndex(): scala.Double = js.native
  def setClickable(clickable: scala.Boolean): scala.Unit = js.native
  def setOptions(key: java.lang.String, value: js.Any): scala.Unit = js.native
  def setOptions(options: PolylineOptions): scala.Unit = js.native
  def setPath(path: ArrayOfCoords | ArrayOfCoordsLiteral): scala.Unit = js.native
  def setPath(path: KVOArrayOfCoords): scala.Unit = js.native
  def setStyles(key: java.lang.String, value: js.Any): scala.Unit = js.native
  def setStyles(options: PolylineOptions): scala.Unit = js.native
  def setVisible(visible: scala.Boolean): scala.Unit = js.native
  def setZIndex(zIndex: scala.Double): scala.Unit = js.native
}

