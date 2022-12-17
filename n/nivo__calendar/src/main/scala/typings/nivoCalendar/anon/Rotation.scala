package typings.nivoCalendar.anon

import typings.nivoCalendar.distTypesTypesMod.BBox
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Rotation extends StObject {
  
  var bbox: BBox
  
  var rotation: Double
  
  var x: Double
  
  var y: Double
  
  var year: Double
}
object Rotation {
  
  inline def apply(bbox: BBox, rotation: Double, x: Double, y: Double, year: Double): Rotation = {
    val __obj = js.Dynamic.literal(bbox = bbox.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rotation]
  }
  
  extension [Self <: Rotation](x: Self) {
    
    inline def setBbox(value: BBox): Self = StObject.set(x, "bbox", value.asInstanceOf[js.Any])
    
    inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYear(value: Double): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
  }
}
