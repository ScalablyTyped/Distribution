package typings
package navermapsLib.naverNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Overlay
@JSGlobal("naver.maps.OverlayView")
@js.native
class OverlayView () extends KVO {
  def draw(): scala.Unit = js.native
  def getContainerTopLeft(): Point = js.native
  def getMap(): Map | scala.Null = js.native
  def getPanes(): MapPanes = js.native
  def getProjection(): MapSystemProjection = js.native
  def onAdd(): js.Any = js.native
  def onRemove(): js.Any = js.native
  def setMap(): scala.Unit = js.native
  def setMap(map: Map): scala.Unit = js.native
}

