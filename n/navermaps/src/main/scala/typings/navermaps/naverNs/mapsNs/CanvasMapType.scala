package typings.navermaps.naverNs.mapsNs

import typings.std.HTMLElement
import typings.std.ImageData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Map.MapType
@JSGlobal("naver.maps.CanvasMapType")
@js.native
class CanvasMapType protected () extends MapType {
  def this(canvasMapTypeOptions: CanvasMapTypeOptions) = this()
  /* CompleteClass */
  override var maxZoom: Double = js.native
  /* CompleteClass */
  override var minZoom: Double = js.native
  /* CompleteClass */
  override var name: String = js.native
  /* CompleteClass */
  override var projection: Projection = js.native
  /* CompleteClass */
  override var tileSize: Size = js.native
  def getMapTypeOptions(): CanvasMapTypeOptions = js.native
  def getMaxZoom(): Double = js.native
  def getMinZoom(): Double = js.native
  def getName(): String = js.native
  /* CompleteClass */
  override def getTile(x: Double, y: Double, z: Double): HTMLElement | Tile = js.native
  def getTileData(x: Double, y: Double, z: Double): ImageData = js.native
  def setMapTypeOptions(canvasMapTypeOptions: CanvasMapTypeOptions): Unit = js.native
}

