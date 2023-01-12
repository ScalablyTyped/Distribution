package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathEnvironmentnameRepositoryid extends StObject {
  
  var path: EnvironmentnameRepositoryid
  
  var query: Page
}
object PathEnvironmentnameRepositoryid {
  
  inline def apply(path: EnvironmentnameRepositoryid, query: Page): PathEnvironmentnameRepositoryid = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathEnvironmentnameRepositoryid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathEnvironmentnameRepositoryid] (val x: Self) extends AnyVal {
    
    inline def setPath(value: EnvironmentnameRepositoryid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Page): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
