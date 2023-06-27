package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathUsernameQuery extends StObject {
  
  var path: Username
  
  var query: js.UndefOr[Page] = js.undefined
}
object PathUsernameQuery {
  
  inline def apply(path: Username): PathUsernameQuery = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathUsernameQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathUsernameQuery] (val x: Self) extends AnyVal {
    
    inline def setPath(value: Username): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Page): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
