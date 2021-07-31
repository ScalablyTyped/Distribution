package typings.overlayscrollbars.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SizeChangedArgs extends StObject {
  
  var height: Double
  
  var width: Double
}
object SizeChangedArgs {
  
  @scala.inline
  def apply(height: Double, width: Double): SizeChangedArgs = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[SizeChangedArgs]
  }
  
  @scala.inline
  implicit class SizeChangedArgsMutableBuilder[Self <: SizeChangedArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
