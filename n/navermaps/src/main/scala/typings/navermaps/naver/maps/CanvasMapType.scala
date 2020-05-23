package typings.navermaps.naver.maps

import typings.std.HTMLElement
import typings.std.ImageData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Map.MapType
trait CanvasMapType extends MapType {
  def getMapTypeOptions(): CanvasMapTypeOptions
  def getMaxZoom(): Double
  def getMinZoom(): Double
  def getName(): String
  def getTileData(x: Double, y: Double, z: Double): ImageData
  def setMapTypeOptions(canvasMapTypeOptions: CanvasMapTypeOptions): Unit
}

object CanvasMapType {
  @scala.inline
  def apply(
    getMapTypeOptions: () => CanvasMapTypeOptions,
    getMaxZoom: () => Double,
    getMinZoom: () => Double,
    getName: () => String,
    getTile: (Double, Double, Double) => HTMLElement | Tile,
    getTileData: (Double, Double, Double) => ImageData,
    maxZoom: Double,
    minZoom: Double,
    name: String,
    projection: Projection,
    setMapTypeOptions: CanvasMapTypeOptions => Unit,
    tileSize: Size
  ): CanvasMapType = {
    val __obj = js.Dynamic.literal(getMapTypeOptions = js.Any.fromFunction0(getMapTypeOptions), getMaxZoom = js.Any.fromFunction0(getMaxZoom), getMinZoom = js.Any.fromFunction0(getMinZoom), getName = js.Any.fromFunction0(getName), getTile = js.Any.fromFunction3(getTile), getTileData = js.Any.fromFunction3(getTileData), maxZoom = maxZoom.asInstanceOf[js.Any], minZoom = minZoom.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], projection = projection.asInstanceOf[js.Any], setMapTypeOptions = js.Any.fromFunction1(setMapTypeOptions), tileSize = tileSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanvasMapType]
  }
}

