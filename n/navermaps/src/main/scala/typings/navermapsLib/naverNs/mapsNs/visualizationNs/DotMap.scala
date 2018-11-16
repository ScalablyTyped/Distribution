package typings
package navermapsLib.naverNs.mapsNs.visualizationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("naver.maps.visualization.DotMap")
@js.native
class DotMap ()
  extends navermapsLib.naverNs.mapsNs.KVO {
  def this(dotMapOptions: DotMapOptions) = this()
  def addDrawing(
    overlay: navermapsLib.naverNs.mapsNs.drawingNs.DrawingOverlay,
    drawingMode: navermapsLib.naverNs.mapsNs.drawingNs.DrawingMode
  ): scala.Unit = js.native
  def addDrawing(
    overlay: navermapsLib.naverNs.mapsNs.drawingNs.DrawingOverlay,
    drawingMode: navermapsLib.naverNs.mapsNs.drawingNs.DrawingMode,
    id: java.lang.String
  ): scala.Unit = js.native
  def addListener(
    eventName: navermapsLib.naverNs.mapsNs.drawingNs.DrawingEvent,
    listener: js.Function1[/* overlay */ navermapsLib.naverNs.mapsNs.drawingNs.DrawingOverlay, scala.Unit]
  ): navermapsLib.naverNs.mapsNs.MapEventListener = js.native
  def destroy(): scala.Unit = js.native
  def getDrawing(id: java.lang.String): navermapsLib.naverNs.mapsNs.drawingNs.DrawingOverlay = js.native
  def getDrawings(): js.Any = js.native
  def getMap(): navermapsLib.naverNs.mapsNs.Map | scala.Null = js.native
  def setMap(): scala.Unit = js.native
  def setMap(map: navermapsLib.naverNs.mapsNs.Map): scala.Unit = js.native
  def toGeoJson(): js.Any = js.native
}

