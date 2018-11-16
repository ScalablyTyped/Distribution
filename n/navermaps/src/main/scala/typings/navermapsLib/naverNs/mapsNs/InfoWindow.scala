package typings
package navermapsLib.naverNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("naver.maps.InfoWindow")
@js.native
class InfoWindow protected () extends OverlayView {
  def this(options: InfoWindowOptions) = this()
  def close(): scala.Unit = js.native
  def getContent(): stdLib.HTMLElement = js.native
  def getOptions(): InfoWindowOptions = js.native
  def getOptions(key: java.lang.String): InfoWindowOptions = js.native
  def getPosition(): Coord = js.native
  def getZIndex(): scala.Double = js.native
  def open(map: Map, anchor: Coord | CoordLiteral): scala.Unit = js.native
  def open(map: Map, anchor: Marker): scala.Unit = js.native
  def setContent(content: java.lang.String): scala.Unit = js.native
  def setContent(content: stdLib.HTMLElement): scala.Unit = js.native
  def setOptions(options: InfoWindowOptions): scala.Unit = js.native
  def setPosition(position: Coord | CoordLiteral): scala.Unit = js.native
  def setZIndex(zIndex: scala.Double): scala.Unit = js.native
}

