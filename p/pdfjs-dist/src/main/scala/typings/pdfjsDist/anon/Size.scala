package typings.pdfjsDist.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Size extends StObject {
  
  var scale: Any
  
  var size: Double
}
object Size {
  
  inline def apply(scale: Any, size: Double): Size = {
    val __obj = js.Dynamic.literal(scale = scale.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Size]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Size] (val x: Self) extends AnyVal {
    
    inline def setScale(value: Any): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
