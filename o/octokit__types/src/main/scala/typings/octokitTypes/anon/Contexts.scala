package typings.octokitTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Contexts extends StObject {
  
  var contexts: js.Array[String]
  
  var enforcement_level: String
}
object Contexts {
  
  inline def apply(contexts: js.Array[String], enforcement_level: String): Contexts = {
    val __obj = js.Dynamic.literal(contexts = contexts.asInstanceOf[js.Any], enforcement_level = enforcement_level.asInstanceOf[js.Any])
    __obj.asInstanceOf[Contexts]
  }
  
  extension [Self <: Contexts](x: Self) {
    
    inline def setContexts(value: js.Array[String]): Self = StObject.set(x, "contexts", value.asInstanceOf[js.Any])
    
    inline def setContextsVarargs(value: String*): Self = StObject.set(x, "contexts", js.Array(value :_*))
    
    inline def setEnforcement_level(value: String): Self = StObject.set(x, "enforcement_level", value.asInstanceOf[js.Any])
  }
}
