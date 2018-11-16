package typings
package navermapsLib.naverNs.mapsNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("naver.maps.drawing.DrawingManager")
@js.native
class DrawingManager ()
  extends navermapsLib.naverNs.mapsNs.KVO {
  def this(options: DrawingOptions) = this()
  def addDrawing(overlay: DrawingOverlay, drawingMode: DrawingMode): scala.Unit = js.native
  def addDrawing(overlay: DrawingOverlay, drawingMode: DrawingMode, id: java.lang.String): scala.Unit = js.native
  def addListener(eventName: DrawingEvent, listener: js.Function1[/* overlay */ DrawingOverlay, scala.Unit]): navermapsLib.naverNs.mapsNs.MapEventListener = js.native
  def destroy(): scala.Unit = js.native
  def getDrawing(id: java.lang.String): DrawingOverlay = js.native
  def getDrawings(): js.Any = js.native
  def getMap(): navermapsLib.naverNs.mapsNs.Map | scala.Null = js.native
  def setMap(): scala.Unit = js.native
  def setMap(map: navermapsLib.naverNs.mapsNs.Map): scala.Unit = js.native
  def toGeoJson(): js.Any = js.native
}

