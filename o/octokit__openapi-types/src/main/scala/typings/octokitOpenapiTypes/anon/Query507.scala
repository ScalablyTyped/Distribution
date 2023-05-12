package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Query507 extends StObject {
  
  var path: OrgSecretname
  
  var query: `507`
}
object Query507 {
  
  inline def apply(path: OrgSecretname, query: `507`): Query507 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[Query507]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Query507] (val x: Self) extends AnyVal {
    
    inline def setPath(value: OrgSecretname): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `507`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
