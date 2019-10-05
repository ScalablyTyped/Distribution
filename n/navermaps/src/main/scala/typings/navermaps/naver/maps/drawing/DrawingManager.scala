package typings.navermaps.naver.maps.drawing

import typings.navermaps.naver.maps.KVO
import typings.navermaps.naver.maps.Map
import typings.navermaps.naver.maps.MapEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("naver.maps.drawing.DrawingManager")
@js.native
class DrawingManager () extends KVO {
  def this(options: DrawingOptions) = this()
  def addDrawing(overlay: DrawingOverlay, drawingMode: DrawingMode): Unit = js.native
  def addDrawing(overlay: DrawingOverlay, drawingMode: DrawingMode, id: String): Unit = js.native
  def addListener(eventName: DrawingEvent, listener: js.Function1[/* overlay */ DrawingOverlay, Unit]): MapEventListener = js.native
  def destroy(): Unit = js.native
  def getDrawing(id: String): DrawingOverlay = js.native
  def getDrawings(): js.Any = js.native
  def getMap(): Map | Null = js.native
  def setMap(): Unit = js.native
  def setMap(map: Map): Unit = js.native
  def toGeoJson(): js.Any = js.native
}

