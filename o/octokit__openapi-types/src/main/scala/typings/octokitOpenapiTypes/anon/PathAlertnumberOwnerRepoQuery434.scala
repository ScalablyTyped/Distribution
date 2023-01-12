package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathAlertnumberOwnerRepoQuery434 extends StObject {
  
  var path: AlertnumberOwnerRepo
  
  var query: `434`
}
object PathAlertnumberOwnerRepoQuery434 {
  
  inline def apply(path: AlertnumberOwnerRepo, query: `434`): PathAlertnumberOwnerRepoQuery434 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathAlertnumberOwnerRepoQuery434]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathAlertnumberOwnerRepoQuery434] (val x: Self) extends AnyVal {
    
    inline def setPath(value: AlertnumberOwnerRepo): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `434`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
