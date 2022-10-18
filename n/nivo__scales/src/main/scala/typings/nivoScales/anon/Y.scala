package typings.nivoScales.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Y extends StObject {
  
  var x: All
  
  var y: All
}
object Y {
  
  inline def apply(x: All, y: All): Y = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Y]
  }
  
  extension [Self <: Y](x: Self) {
    
    inline def setX(value: All): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: All): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
