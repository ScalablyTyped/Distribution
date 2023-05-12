package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathNameStringOrgStringQuery507 extends StObject {
  
  var path: NameStringOrgString
  
  var query: `507`
}
object PathNameStringOrgStringQuery507 {
  
  inline def apply(path: NameStringOrgString, query: `507`): PathNameStringOrgStringQuery507 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathNameStringOrgStringQuery507]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathNameStringOrgStringQuery507] (val x: Self) extends AnyVal {
    
    inline def setPath(value: NameStringOrgString): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `507`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
