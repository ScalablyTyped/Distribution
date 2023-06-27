package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathOrgPackagenameQuery extends StObject {
  
  var path: OrgPackagename
  
  var query: js.UndefOr[Token] = js.undefined
}
object PathOrgPackagenameQuery {
  
  inline def apply(path: OrgPackagename): PathOrgPackagenameQuery = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathOrgPackagenameQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathOrgPackagenameQuery] (val x: Self) extends AnyVal {
    
    inline def setPath(value: OrgPackagename): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Token): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
