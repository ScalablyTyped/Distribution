package typings
package navermapsLib.naverNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Map.MapType
@JSGlobal("naver.maps.CanvasMapType")
@js.native
class CanvasMapType protected () extends MapType {
  def this(canvasMapTypeOptions: CanvasMapTypeOptions) = this()
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
  def getMapTypeOptions(): CanvasMapTypeOptions = js.native
  def getMaxZoom(): scala.Double = js.native
  def getMinZoom(): scala.Double = js.native
  def getName(): java.lang.String = js.native
  /* CompleteClass */
  override def getTile(x: scala.Double, y: scala.Double, z: scala.Double): stdLib.HTMLElement | Tile = js.native
  def getTileData(x: scala.Double, y: scala.Double, z: scala.Double): stdLib.ImageData = js.native
  def setMapTypeOptions(canvasMapTypeOptions: CanvasMapTypeOptions): scala.Unit = js.native
}

