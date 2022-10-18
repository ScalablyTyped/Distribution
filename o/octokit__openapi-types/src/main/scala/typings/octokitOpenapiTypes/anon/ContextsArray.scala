package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContextsArray extends StObject {
  
  var contexts: js.Array[Octicon]
}
object ContextsArray {
  
  inline def apply(contexts: js.Array[Octicon]): ContextsArray = {
    val __obj = js.Dynamic.literal(contexts = contexts.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextsArray]
  }
  
  extension [Self <: ContextsArray](x: Self) {
    
    inline def setContexts(value: js.Array[Octicon]): Self = StObject.set(x, "contexts", value.asInstanceOf[js.Any])
    
    inline def setContextsVarargs(value: Octicon*): Self = StObject.set(x, "contexts", js.Array(value*))
  }
}
