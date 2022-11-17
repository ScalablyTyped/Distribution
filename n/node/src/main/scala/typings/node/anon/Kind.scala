package typings.node.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Kind extends StObject {
  
  var index: Double
  
  var kind: "positional"
  
  var value: String
}
object Kind {
  
  inline def apply(index: Double, value: String): Kind = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], kind = "positional", value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Kind]
  }
  
  extension [Self <: Kind](x: Self) {
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setKind(value: "positional"): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
