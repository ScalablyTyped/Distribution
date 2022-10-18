package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `94` extends StObject {
  
  /** @description The name of the status checks */
  var contexts: js.Array[String]
}
object `94` {
  
  inline def apply(contexts: js.Array[String]): `94` = {
    val __obj = js.Dynamic.literal(contexts = contexts.asInstanceOf[js.Any])
    __obj.asInstanceOf[`94`]
  }
  
  extension [Self <: `94`](x: Self) {
    
    inline def setContexts(value: js.Array[String]): Self = StObject.set(x, "contexts", value.asInstanceOf[js.Any])
    
    inline def setContextsVarargs(value: String*): Self = StObject.set(x, "contexts", js.Array(value*))
  }
}
