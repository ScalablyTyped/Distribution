package typings.next.anon

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientEntryDependencyMap extends StObject {
  
  var clientEntryDependencyMap: js.UndefOr[Record[String, Any]] = js.undefined
  
  var compilation: Any
  
  var dependency: Any
  
  var layoutOrPageRequest: String
}
object ClientEntryDependencyMap {
  
  inline def apply(compilation: Any, dependency: Any, layoutOrPageRequest: String): ClientEntryDependencyMap = {
    val __obj = js.Dynamic.literal(compilation = compilation.asInstanceOf[js.Any], dependency = dependency.asInstanceOf[js.Any], layoutOrPageRequest = layoutOrPageRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientEntryDependencyMap]
  }
  
  extension [Self <: ClientEntryDependencyMap](x: Self) {
    
    inline def setClientEntryDependencyMap(value: Record[String, Any]): Self = StObject.set(x, "clientEntryDependencyMap", value.asInstanceOf[js.Any])
    
    inline def setClientEntryDependencyMapUndefined: Self = StObject.set(x, "clientEntryDependencyMap", js.undefined)
    
    inline def setCompilation(value: Any): Self = StObject.set(x, "compilation", value.asInstanceOf[js.Any])
    
    inline def setDependency(value: Any): Self = StObject.set(x, "dependency", value.asInstanceOf[js.Any])
    
    inline def setLayoutOrPageRequest(value: String): Self = StObject.set(x, "layoutOrPageRequest", value.asInstanceOf[js.Any])
  }
}
