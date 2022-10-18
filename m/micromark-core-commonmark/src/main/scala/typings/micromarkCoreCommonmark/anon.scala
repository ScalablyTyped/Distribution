package typings.micromarkCoreCommonmark

import typings.micromarkCoreCommonmark.devLibListMod.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Marker extends StObject {
    
    var marker: Code
    
    var size: Double
    
    var `type`: String
  }
  object Marker {
    
    inline def apply(size: Double, `type`: String): Marker = {
      val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any], marker = null)
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Marker]
    }
    
    extension [Self <: Marker](x: Self) {
      
      inline def setMarker(value: Code): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
      
      inline def setMarkerNull: Self = StObject.set(x, "marker", null)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
