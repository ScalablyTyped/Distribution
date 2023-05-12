package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathEnvironmentnameRepositoryidQuery68 extends StObject {
  
  var path: EnvironmentnameRepositoryid
  
  var query: `68`
}
object PathEnvironmentnameRepositoryidQuery68 {
  
  inline def apply(path: EnvironmentnameRepositoryid, query: `68`): PathEnvironmentnameRepositoryidQuery68 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathEnvironmentnameRepositoryidQuery68]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathEnvironmentnameRepositoryidQuery68] (val x: Self) extends AnyVal {
    
    inline def setPath(value: EnvironmentnameRepositoryid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `68`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
