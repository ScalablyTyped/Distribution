package typings.overlayscrollbars.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DirectionChangedArgs extends StObject {
  
  var dir: String
  
  var isRTL: Double
}
object DirectionChangedArgs {
  
  @scala.inline
  def apply(dir: String, isRTL: Double): DirectionChangedArgs = {
    val __obj = js.Dynamic.literal(dir = dir.asInstanceOf[js.Any], isRTL = isRTL.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectionChangedArgs]
  }
  
  @scala.inline
  implicit class DirectionChangedArgsMutableBuilder[Self <: DirectionChangedArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsRTL(value: Double): Self = StObject.set(x, "isRTL", value.asInstanceOf[js.Any])
  }
}
