package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathOrgPackagenameQueryToken extends StObject {
  
  var path: OrgPackagename
  
  var query: Token
}
object PathOrgPackagenameQueryToken {
  
  inline def apply(path: OrgPackagename, query: Token): PathOrgPackagenameQueryToken = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathOrgPackagenameQueryToken]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathOrgPackagenameQueryToken] (val x: Self) extends AnyVal {
    
    inline def setPath(value: OrgPackagename): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Token): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
