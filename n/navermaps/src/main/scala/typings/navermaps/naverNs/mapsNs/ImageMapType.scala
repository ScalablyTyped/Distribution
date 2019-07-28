package typings.navermaps.naverNs.mapsNs

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("naver.maps.ImageMapType")
@js.native
class ImageMapType protected () extends MapType {
  def this(imageMapTypeOptions: ImageMapTypeOptions) = this()
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
  def getMapTypeOptions(): ImageMapTypeOptions = js.native
  def getMaxZoom(): Double = js.native
  def getMinZoom(): Double = js.native
  def getName(): String = js.native
  /* CompleteClass */
  override def getTile(x: Double, y: Double, z: Double): HTMLElement | Tile = js.native
  def getTileUrls(x: Double, y: Double, z: Double): js.Array[String] = js.native
  def setMapTypeOptions(imageMapTypeOptions: ImageMapTypeOptions): Unit = js.native
}

