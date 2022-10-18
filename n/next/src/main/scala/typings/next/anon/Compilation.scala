package typings.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Compilation extends StObject {
  
  var compilation: Any
  
  var dependency: Any
  
  var layoutOrPageRequest: String
}
object Compilation {
  
  inline def apply(compilation: Any, dependency: Any, layoutOrPageRequest: String): Compilation = {
    val __obj = js.Dynamic.literal(compilation = compilation.asInstanceOf[js.Any], dependency = dependency.asInstanceOf[js.Any], layoutOrPageRequest = layoutOrPageRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[Compilation]
  }
  
  extension [Self <: Compilation](x: Self) {
    
    inline def setCompilation(value: Any): Self = StObject.set(x, "compilation", value.asInstanceOf[js.Any])
    
    inline def setDependency(value: Any): Self = StObject.set(x, "dependency", value.asInstanceOf[js.Any])
    
    inline def setLayoutOrPageRequest(value: String): Self = StObject.set(x, "layoutOrPageRequest", value.asInstanceOf[js.Any])
  }
}
