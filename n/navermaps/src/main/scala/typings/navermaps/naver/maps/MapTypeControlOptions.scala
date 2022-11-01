package typings.navermaps.naver.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapTypeControlOptions
  extends StObject
     with ControlOptions {
  
  var mapTypeIds: js.Array[MapTypeId] | Null
  
  var style: MapTypeControlStyle
}
object MapTypeControlOptions {
  
  inline def apply(position: Position, style: MapTypeControlStyle): MapTypeControlOptions = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], mapTypeIds = null)
    __obj.asInstanceOf[MapTypeControlOptions]
  }
  
  extension [Self <: MapTypeControlOptions](x: Self) {
    
    inline def setMapTypeIds(value: js.Array[MapTypeId]): Self = StObject.set(x, "mapTypeIds", value.asInstanceOf[js.Any])
    
    inline def setMapTypeIdsNull: Self = StObject.set(x, "mapTypeIds", null)
    
    inline def setMapTypeIdsVarargs(value: MapTypeId*): Self = StObject.set(x, "mapTypeIds", js.Array(value*))
    
    inline def setStyle(value: MapTypeControlStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
  }
}
