package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathAlertnumberOwnerRepoQuery507 extends StObject {
  
  var path: AlertnumberOwnerRepo
  
  var query: `507`
}
object PathAlertnumberOwnerRepoQuery507 {
  
  inline def apply(path: AlertnumberOwnerRepo, query: `507`): PathAlertnumberOwnerRepoQuery507 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathAlertnumberOwnerRepoQuery507]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathAlertnumberOwnerRepoQuery507] (val x: Self) extends AnyVal {
    
    inline def setPath(value: AlertnumberOwnerRepo): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `507`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
