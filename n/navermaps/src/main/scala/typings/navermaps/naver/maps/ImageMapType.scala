package typings.navermaps.naver.maps

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageMapType extends MapType {
  def getMapTypeOptions(): ImageMapTypeOptions = js.native
  def getMaxZoom(): Double = js.native
  def getMinZoom(): Double = js.native
  def getName(): String = js.native
  def getTileUrls(x: Double, y: Double, z: Double): js.Array[String] = js.native
  def setMapTypeOptions(imageMapTypeOptions: ImageMapTypeOptions): Unit = js.native
}

object ImageMapType {
  @scala.inline
  def apply(
    getMapTypeOptions: () => ImageMapTypeOptions,
    getMaxZoom: () => Double,
    getMinZoom: () => Double,
    getName: () => String,
    getTile: (Double, Double, Double) => HTMLElement | Tile,
    getTileUrls: (Double, Double, Double) => js.Array[String],
    maxZoom: Double,
    minZoom: Double,
    name: String,
    projection: Projection,
    setMapTypeOptions: ImageMapTypeOptions => Unit,
    tileSize: Size
  ): ImageMapType = {
    val __obj = js.Dynamic.literal(getMapTypeOptions = js.Any.fromFunction0(getMapTypeOptions), getMaxZoom = js.Any.fromFunction0(getMaxZoom), getMinZoom = js.Any.fromFunction0(getMinZoom), getName = js.Any.fromFunction0(getName), getTile = js.Any.fromFunction3(getTile), getTileUrls = js.Any.fromFunction3(getTileUrls), maxZoom = maxZoom.asInstanceOf[js.Any], minZoom = minZoom.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], projection = projection.asInstanceOf[js.Any], setMapTypeOptions = js.Any.fromFunction1(setMapTypeOptions), tileSize = tileSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageMapType]
  }
  @scala.inline
  implicit class ImageMapTypeOps[Self <: ImageMapType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGetMapTypeOptions(value: () => ImageMapTypeOptions): Self = this.set("getMapTypeOptions", js.Any.fromFunction0(value))
    @scala.inline
    def setGetMaxZoom(value: () => Double): Self = this.set("getMaxZoom", js.Any.fromFunction0(value))
    @scala.inline
    def setGetMinZoom(value: () => Double): Self = this.set("getMinZoom", js.Any.fromFunction0(value))
    @scala.inline
    def setGetName(value: () => String): Self = this.set("getName", js.Any.fromFunction0(value))
    @scala.inline
    def setGetTileUrls(value: (Double, Double, Double) => js.Array[String]): Self = this.set("getTileUrls", js.Any.fromFunction3(value))
    @scala.inline
    def setSetMapTypeOptions(value: ImageMapTypeOptions => Unit): Self = this.set("setMapTypeOptions", js.Any.fromFunction1(value))
  }
  
}

