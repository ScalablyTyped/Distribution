package typings.nivoColors.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Key extends StObject {
  
  var key: String
  
  var offset: Double
  
  var stopColor: String
}
object Key {
  
  inline def apply(key: String, offset: Double, stopColor: String): Key = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], stopColor = stopColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Key]
  }
  
  extension [Self <: Key](x: Self) {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setStopColor(value: String): Self = StObject.set(x, "stopColor", value.asInstanceOf[js.Any])
  }
}
