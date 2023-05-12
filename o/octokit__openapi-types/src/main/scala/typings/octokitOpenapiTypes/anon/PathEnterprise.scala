package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathEnterprise extends StObject {
  
  var path: Enterprise
  
  var query: Before
}
object PathEnterprise {
  
  inline def apply(path: Enterprise, query: Before): PathEnterprise = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathEnterprise]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathEnterprise] (val x: Self) extends AnyVal {
    
    inline def setPath(value: Enterprise): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Before): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
