package typings.orientjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OIndexEntry extends StObject {
  
  var key: String
  
  var value: String | ORID
}
object OIndexEntry {
  
  inline def apply(key: String, value: String | ORID): OIndexEntry = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[OIndexEntry]
  }
  
  extension [Self <: OIndexEntry](x: Self) {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String | ORID): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
