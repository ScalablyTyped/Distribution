package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContextsArray extends StObject {
  
  /** @description The name of the status checks */
  var contexts: js.Array[String]
}
object ContextsArray {
  
  inline def apply(contexts: js.Array[String]): ContextsArray = {
    val __obj = js.Dynamic.literal(contexts = contexts.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextsArray]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContextsArray] (val x: Self) extends AnyVal {
    
    inline def setContexts(value: js.Array[String]): Self = StObject.set(x, "contexts", value.asInstanceOf[js.Any])
    
    inline def setContextsVarargs(value: String*): Self = StObject.set(x, "contexts", js.Array(value*))
  }
}
