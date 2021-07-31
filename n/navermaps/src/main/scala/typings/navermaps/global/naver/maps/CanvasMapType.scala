package typings.navermaps.global.naver.maps

import typings.navermaps.naver.maps.CanvasMapTypeOptions
import typings.navermaps.naver.maps.Projection
import typings.std.HTMLElement
import typings.std.ImageData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Map.MapType
@JSGlobal("naver.maps.CanvasMapType")
@js.native
class CanvasMapType protected ()
  extends StObject
     with typings.navermaps.naver.maps.CanvasMapType {
  def this(canvasMapTypeOptions: CanvasMapTypeOptions) = this()
  
  /* CompleteClass */
  override def getMapTypeOptions(): CanvasMapTypeOptions = js.native
  
  /* CompleteClass */
  override def getMaxZoom(): Double = js.native
  
  /* CompleteClass */
  override def getMinZoom(): Double = js.native
  
  /* CompleteClass */
  override def getName(): String = js.native
  
  /* CompleteClass */
  override def getTile(x: Double, y: Double, z: Double): HTMLElement | typings.navermaps.naver.maps.Tile = js.native
  
  /* CompleteClass */
  override def getTileData(x: Double, y: Double, z: Double): ImageData = js.native
  
  /* CompleteClass */
  var maxZoom: Double = js.native
  
  /* CompleteClass */
  var minZoom: Double = js.native
  
  /* CompleteClass */
  var name: String = js.native
  
  /* CompleteClass */
  var projection: Projection = js.native
  
  /* CompleteClass */
  override def setMapTypeOptions(canvasMapTypeOptions: CanvasMapTypeOptions): Unit = js.native
  
  /* CompleteClass */
  var tileSize: typings.navermaps.naver.maps.Size = js.native
}
