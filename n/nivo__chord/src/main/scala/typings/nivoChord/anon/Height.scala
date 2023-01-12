package typings.nivoChord.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Height extends StObject {
  
  var height: Double
  
  var innerRadiusOffset: Double
  
  var innerRadiusRatio: Double
  
  var width: Double
}
object Height {
  
  inline def apply(height: Double, innerRadiusOffset: Double, innerRadiusRatio: Double, width: Double): Height = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], innerRadiusOffset = innerRadiusOffset.asInstanceOf[js.Any], innerRadiusRatio = innerRadiusRatio.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Height]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Height] (val x: Self) extends AnyVal {
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setInnerRadiusOffset(value: Double): Self = StObject.set(x, "innerRadiusOffset", value.asInstanceOf[js.Any])
    
    inline def setInnerRadiusRatio(value: Double): Self = StObject.set(x, "innerRadiusRatio", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
