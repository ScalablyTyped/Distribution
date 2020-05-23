package typings.navermaps.naver.maps.visualization

import typings.navermaps.naver.maps.KVO
import typings.navermaps.naver.maps.Map
import typings.navermaps.naver.maps.MapEventListener
import typings.navermaps.naver.maps.drawing.DrawingEvent
import typings.navermaps.naver.maps.drawing.DrawingMode
import typings.navermaps.naver.maps.drawing.DrawingOverlay
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DotMap extends KVO {
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

