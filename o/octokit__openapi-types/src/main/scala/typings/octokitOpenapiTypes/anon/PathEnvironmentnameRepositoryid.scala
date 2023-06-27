package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathEnvironmentnameRepositoryid extends StObject {
  
  var path: EnvironmentnameRepositoryid
  
  var query: js.UndefOr[Page] = js.undefined
}
object PathEnvironmentnameRepositoryid {
  
  inline def apply(path: EnvironmentnameRepositoryid): PathEnvironmentnameRepositoryid = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathEnvironmentnameRepositoryid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathEnvironmentnameRepositoryid] (val x: Self) extends AnyVal {
    
    inline def setPath(value: EnvironmentnameRepositoryid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Page): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
