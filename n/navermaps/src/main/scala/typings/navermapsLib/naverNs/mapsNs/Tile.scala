package typings
package navermapsLib.naverNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Map.Tile
@JSGlobal("naver.maps.Tile")
@js.native
class Tile protected () extends KVO {
  def this(element: stdLib.HTMLElement) = this()
  def this(element: stdLib.HTMLElement, tileOptions: TileOptions) = this()
  def appendTo(parentNode: stdLib.HTMLElement): scala.Unit = js.native
  def cancelFadeIn(): scala.Unit = js.native
  def destroy(): scala.Unit = js.native
  def fadeIn(callback: js.Function0[_]): scala.Unit = js.native
  def fadeIn(callback: js.Function0[_], startOpacity: scala.Double): scala.Unit = js.native
  def getElement(): stdLib.HTMLElement = js.native
  def getOffset(): Point = js.native
  def getOpacity(): scala.Double = js.native
  def getSize(): Size = js.native
  def getTileIndex(): TileIndex = js.native
  def getZIndex(): scala.Double = js.native
  def hide(): scala.Unit = js.native
  def load(): scala.Unit = js.native
  def load(tileOptions: TileOptions): scala.Unit = js.native
  def remove(): scala.Unit = js.native
  def reset(mapType: MapType, zoom: scala.Double): scala.Unit = js.native
  def reset(mapType: MapType, zoom: scala.Double, tileOptions: TileOptions): scala.Unit = js.native
  def setBlank(): scala.Unit = js.native
  def setOffset(offset: Point): scala.Unit = js.native
  def setOffset(x: scala.Double, y: scala.Double): scala.Unit = js.native
  def setOpacity(opacity: scala.Double): scala.Unit = js.native
  def setSize(size: Size): scala.Unit = js.native
  def setTileIndex(tileIndex: TileIndex): scala.Unit = js.native
  def setZIndex(zIndex: scala.Double): scala.Unit = js.native
  def show(): scala.Unit = js.native
}

