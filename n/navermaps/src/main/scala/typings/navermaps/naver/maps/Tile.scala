package typings.navermaps.naver.maps

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Map.Tile
@js.native
trait Tile extends KVO {
  def appendTo(parentNode: HTMLElement): Unit = js.native
  def cancelFadeIn(): Unit = js.native
  def destroy(): Unit = js.native
  def fadeIn(callback: js.Function0[_]): Unit = js.native
  def fadeIn(callback: js.Function0[_], startOpacity: Double): Unit = js.native
  def getElement(): HTMLElement = js.native
  def getOffset(): Point = js.native
  def getOpacity(): Double = js.native
  def getSize(): Size = js.native
  def getTileIndex(): TileIndex = js.native
  def getZIndex(): Double = js.native
  def hide(): Unit = js.native
  def load(): Unit = js.native
  def load(tileOptions: TileOptions): Unit = js.native
  def remove(): Unit = js.native
  def reset(mapType: MapType, zoom: Double): Unit = js.native
  def reset(mapType: MapType, zoom: Double, tileOptions: TileOptions): Unit = js.native
  def setBlank(): Unit = js.native
  def setOffset(offset: Point): Unit = js.native
  def setOffset(x: Double, y: Double): Unit = js.native
  def setOpacity(opacity: Double): Unit = js.native
  def setSize(size: Size): Unit = js.native
  def setTileIndex(tileIndex: TileIndex): Unit = js.native
  def setZIndex(zIndex: Double): Unit = js.native
  def show(): Unit = js.native
}

