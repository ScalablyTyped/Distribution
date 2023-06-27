package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `523` extends StObject {
  
  var contexts: js.Array[Octicon]
}
object `523` {
  
  inline def apply(contexts: js.Array[Octicon]): `523` = {
    val __obj = js.Dynamic.literal(contexts = contexts.asInstanceOf[js.Any])
    __obj.asInstanceOf[`523`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `523`] (val x: Self) extends AnyVal {
    
    inline def setContexts(value: js.Array[Octicon]): Self = StObject.set(x, "contexts", value.asInstanceOf[js.Any])
    
    inline def setContextsVarargs(value: Octicon*): Self = StObject.set(x, "contexts", js.Array(value*))
  }
}
