package typings.navermaps.naver.maps

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageMapType
  extends StObject
     with MapType {
  
  def getMapTypeOptions(): ImageMapTypeOptions
  
  def getMaxZoom(): Double
  
  def getMinZoom(): Double
  
  def getName(): String
  
  def getTileUrls(x: Double, y: Double, z: Double): js.Array[String]
  
  def setMapTypeOptions(imageMapTypeOptions: ImageMapTypeOptions): Unit
}
object ImageMapType {
  
  inline def apply(
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
  
  extension [Self <: ImageMapType](x: Self) {
    
    inline def setGetMapTypeOptions(value: () => ImageMapTypeOptions): Self = StObject.set(x, "getMapTypeOptions", js.Any.fromFunction0(value))
    
    inline def setGetMaxZoom(value: () => Double): Self = StObject.set(x, "getMaxZoom", js.Any.fromFunction0(value))
    
    inline def setGetMinZoom(value: () => Double): Self = StObject.set(x, "getMinZoom", js.Any.fromFunction0(value))
    
    inline def setGetName(value: () => String): Self = StObject.set(x, "getName", js.Any.fromFunction0(value))
    
    inline def setGetTileUrls(value: (Double, Double, Double) => js.Array[String]): Self = StObject.set(x, "getTileUrls", js.Any.fromFunction3(value))
    
    inline def setSetMapTypeOptions(value: ImageMapTypeOptions => Unit): Self = StObject.set(x, "setMapTypeOptions", js.Any.fromFunction1(value))
  }
}
