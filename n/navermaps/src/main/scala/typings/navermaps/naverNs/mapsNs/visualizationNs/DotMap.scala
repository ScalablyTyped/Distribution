package typings.navermaps.naverNs.mapsNs.visualizationNs

import typings.navermaps.naverNs.mapsNs.KVO
import typings.navermaps.naverNs.mapsNs.Map
import typings.navermaps.naverNs.mapsNs.MapEventListener
import typings.navermaps.naverNs.mapsNs.drawingNs.DrawingEvent
import typings.navermaps.naverNs.mapsNs.drawingNs.DrawingMode
import typings.navermaps.naverNs.mapsNs.drawingNs.DrawingOverlay
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("naver.maps.visualization.DotMap")
@js.native
class DotMap () extends KVO {
  def this(dotMapOptions: DotMapOptions) = this()
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

