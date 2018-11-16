package typings
package navermapsLib.naverNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("naver.maps.Polygon")
@js.native
class Polygon () extends OverlayView {
  def this(options: PolygonOptions) = this()
  def getAreaSize(): scala.Double = js.native
  def getBounds(): Bounds = js.native
  def getClickable(): scala.Boolean = js.native
  def getDrawingRect(): Bounds = js.native
  def getOptions(): PolygonOptions = js.native
  def getOptions(key: java.lang.String): PolygonOptions = js.native
  def getPath(): ArrayOfCoords | KVOArrayOfCoords = js.native
  def getPaths(): js.Array[ArrayOfCoords] | js.Array[KVOArrayOfCoords] = js.native
  def getStyles(): PolygonOptions = js.native
  def getStyles(key: java.lang.String): PolygonOptions = js.native
  def getVisible(): scala.Boolean = js.native
  def getZIndex(): scala.Double = js.native
  def setClickable(clickable: scala.Boolean): scala.Unit = js.native
  def setOptions(key: java.lang.String, value: js.Any): scala.Unit = js.native
  def setOptions(options: PolygonOptions): scala.Unit = js.native
  def setPath(path: ArrayOfCoords | ArrayOfCoordsLiteral): scala.Unit = js.native
  def setPath(path: KVOArrayOfCoords): scala.Unit = js.native
  def setPaths(paths: js.Array[ArrayOfCoords]): scala.Unit = js.native
  def setPaths(paths: ArrayOfCoordsLiteral): scala.Unit = js.native
   // TODO. KVOArray.<KVOArrayOfCoords>
  def setStyles(key: java.lang.String, value: js.Any): scala.Unit = js.native
  def setStyles(options: PolygonOptions): scala.Unit = js.native
  def setVisible(visible: scala.Boolean): scala.Unit = js.native
  def setZIndex(zIndex: scala.Double): scala.Unit = js.native
}

