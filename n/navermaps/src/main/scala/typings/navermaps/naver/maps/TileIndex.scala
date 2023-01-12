package typings.navermaps.naver.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TileIndex extends StObject {
  
  var xIndex: Double
  
  var yIndex: Double
}
object TileIndex {
  
  inline def apply(xIndex: Double, yIndex: Double): TileIndex = {
    val __obj = js.Dynamic.literal(xIndex = xIndex.asInstanceOf[js.Any], yIndex = yIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[TileIndex]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TileIndex] (val x: Self) extends AnyVal {
    
    inline def setXIndex(value: Double): Self = StObject.set(x, "xIndex", value.asInstanceOf[js.Any])
    
    inline def setYIndex(value: Double): Self = StObject.set(x, "yIndex", value.asInstanceOf[js.Any])
  }
}
