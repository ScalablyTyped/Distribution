package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Query532 extends StObject {
  
  var path: CommentnumberDiscussionnumberOrg
  
  var query: `532`
}
object Query532 {
  
  inline def apply(path: CommentnumberDiscussionnumberOrg, query: `532`): Query532 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[Query532]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Query532] (val x: Self) extends AnyVal {
    
    inline def setPath(value: CommentnumberDiscussionnumberOrg): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `532`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
