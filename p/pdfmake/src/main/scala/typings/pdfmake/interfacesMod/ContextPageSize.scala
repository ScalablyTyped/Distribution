package typings.pdfmake.interfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContextPageSize extends StObject {
  
  var height: Double
  
  var orientation: PageOrientation
  
  var width: Double
}
object ContextPageSize {
  
  inline def apply(height: Double, orientation: PageOrientation, width: Double): ContextPageSize = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextPageSize]
  }
  
  extension [Self <: ContextPageSize](x: Self) {
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setOrientation(value: PageOrientation): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
