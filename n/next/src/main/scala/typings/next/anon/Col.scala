package typings.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Col extends StObject {
  
  var code: String
  
  var col: Double
  
  var line: Double
}
object Col {
  
  inline def apply(code: String, col: Double, line: Double): Col = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], col = col.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
    __obj.asInstanceOf[Col]
  }
  
  extension [Self <: Col](x: Self) {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCol(value: Double): Self = StObject.set(x, "col", value.asInstanceOf[js.Any])
    
    inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
  }
}
