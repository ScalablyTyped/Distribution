package typings.pdfjsDist.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Scale extends StObject {
  
  var scale: Any
  
  var size: Double
}
object Scale {
  
  inline def apply(scale: Any, size: Double): Scale = {
    val __obj = js.Dynamic.literal(scale = scale.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scale]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Scale] (val x: Self) extends AnyVal {
    
    inline def setScale(value: Any): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
