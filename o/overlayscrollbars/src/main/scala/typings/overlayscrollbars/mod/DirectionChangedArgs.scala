package typings.overlayscrollbars.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DirectionChangedArgs extends StObject {
  
  var dir: String
  
  var isRTL: Double
}
object DirectionChangedArgs {
  
  inline def apply(dir: String, isRTL: Double): DirectionChangedArgs = {
    val __obj = js.Dynamic.literal(dir = dir.asInstanceOf[js.Any], isRTL = isRTL.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectionChangedArgs]
  }
  
  extension [Self <: DirectionChangedArgs](x: Self) {
    
    inline def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
    
    inline def setIsRTL(value: Double): Self = StObject.set(x, "isRTL", value.asInstanceOf[js.Any])
  }
}
