package typings.overlayscrollbars.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XBoolean extends StObject {
  
  var x: Boolean
  
  var y: Boolean
}
object XBoolean {
  
  inline def apply(x: Boolean, y: Boolean): XBoolean = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[XBoolean]
  }
  
  extension [Self <: XBoolean](x: Self) {
    
    inline def setX(value: Boolean): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Boolean): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
