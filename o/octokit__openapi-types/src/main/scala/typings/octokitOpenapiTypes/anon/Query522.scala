package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Query522 extends StObject {
  
  var path: OrgPackagename
  
  var query: `522`
}
object Query522 {
  
  inline def apply(path: OrgPackagename, query: `522`): Query522 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[Query522]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Query522] (val x: Self) extends AnyVal {
    
    inline def setPath(value: OrgPackagename): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `522`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
