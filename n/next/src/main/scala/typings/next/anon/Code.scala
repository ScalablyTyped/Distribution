package typings.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Code extends StObject {
  
  var code: String
  
  var map: File | Null
}
object Code {
  
  inline def apply(code: String): Code = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], map = null)
    __obj.asInstanceOf[Code]
  }
  
  extension [Self <: Code](x: Self) {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setMap(value: File): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    inline def setMapNull: Self = StObject.set(x, "map", null)
  }
}
