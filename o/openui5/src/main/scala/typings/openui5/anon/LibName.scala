package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LibName extends StObject {
  
  var libName: String
  
  var ruleId: String
}
object LibName {
  
  inline def apply(libName: String, ruleId: String): LibName = {
    val __obj = js.Dynamic.literal(libName = libName.asInstanceOf[js.Any], ruleId = ruleId.asInstanceOf[js.Any])
    __obj.asInstanceOf[LibName]
  }
  
  extension [Self <: LibName](x: Self) {
    
    inline def setLibName(value: String): Self = StObject.set(x, "libName", value.asInstanceOf[js.Any])
    
    inline def setRuleId(value: String): Self = StObject.set(x, "ruleId", value.asInstanceOf[js.Any])
  }
}
