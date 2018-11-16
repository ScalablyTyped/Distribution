package typings
package navermapsLib.naverNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("naver.maps.ImageMapType")
@js.native
class ImageMapType protected () extends MapType {
  def this(imageMapTypeOptions: ImageMapTypeOptions) = this()
  /* CompleteClass */
  override var maxZoom: scala.Double = js.native
  /* CompleteClass */
  override var minZoom: scala.Double = js.native
  /* CompleteClass */
  override var name: java.lang.String = js.native
  /* CompleteClass */
  override var projection: Projection = js.native
  /* CompleteClass */
  override var tileSize: Size = js.native
  def getMapTypeOptions(): ImageMapTypeOptions = js.native
  def getMaxZoom(): scala.Double = js.native
  def getMinZoom(): scala.Double = js.native
  def getName(): java.lang.String = js.native
  /* CompleteClass */
  override def getTile(x: scala.Double, y: scala.Double, z: scala.Double): stdLib.HTMLElement | Tile = js.native
  def getTileUrls(x: scala.Double, y: scala.Double, z: scala.Double): js.Array[java.lang.String] = js.native
  def setMapTypeOptions(imageMapTypeOptions: ImageMapTypeOptions): scala.Unit = js.native
}

