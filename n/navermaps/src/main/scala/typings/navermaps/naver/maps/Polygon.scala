package typings.navermaps.naver.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("naver.maps.Polygon")
@js.native
class Polygon () extends OverlayView {
  def this(options: PolygonOptions) = this()
  def getAreaSize(): Double = js.native
  def getBounds(): Bounds = js.native
  def getClickable(): Boolean = js.native
  def getDrawingRect(): Bounds = js.native
  def getOptions(): PolygonOptions = js.native
  def getOptions(key: String): PolygonOptions = js.native
  def getPath(): ArrayOfCoords | KVOArrayOfCoords = js.native
  def getPaths(): js.Array[ArrayOfCoords | KVOArrayOfCoords] = js.native
  def getStyles(): PolygonOptions = js.native
  def getStyles(key: String): PolygonOptions = js.native
  def getVisible(): Boolean = js.native
  def getZIndex(): Double = js.native
  def setClickable(clickable: Boolean): Unit = js.native
  def setOptions(key: String, value: js.Any): Unit = js.native
  def setOptions(options: PolygonOptions): Unit = js.native
  def setPath(path: ArrayOfCoords | ArrayOfCoordsLiteral): Unit = js.native
  def setPath(path: KVOArrayOfCoords): Unit = js.native
  def setPaths(paths: js.Array[ArrayOfCoords] | ArrayOfCoordsLiteral): Unit = js.native
   // TODO. KVOArray.<KVOArrayOfCoords>
  def setStyles(key: String, value: js.Any): Unit = js.native
  def setStyles(options: PolygonOptions): Unit = js.native
  def setVisible(visible: Boolean): Unit = js.native
  def setZIndex(zIndex: Double): Unit = js.native
}

