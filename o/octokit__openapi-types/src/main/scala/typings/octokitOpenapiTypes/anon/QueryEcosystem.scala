package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryEcosystem extends StObject {
  
  var path: Owner
  
  var query: Ecosystem
}
object QueryEcosystem {
  
  inline def apply(path: Owner, query: Ecosystem): QueryEcosystem = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryEcosystem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryEcosystem] (val x: Self) extends AnyVal {
    
    inline def setPath(value: Owner): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Ecosystem): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
