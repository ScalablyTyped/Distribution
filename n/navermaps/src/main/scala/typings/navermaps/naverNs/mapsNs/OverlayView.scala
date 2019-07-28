package typings.navermaps.naverNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Overlay
@JSGlobal("naver.maps.OverlayView")
@js.native
class OverlayView () extends KVO {
  def draw(): Unit = js.native
  def getContainerTopLeft(): Point = js.native
  def getMap(): Map | Null = js.native
  def getPanes(): MapPanes = js.native
  def getProjection(): MapSystemProjection = js.native
  def onAdd(): js.Any = js.native
  def onRemove(): js.Any = js.native
  def setMap(): Unit = js.native
  def setMap(map: Map): Unit = js.native
}

