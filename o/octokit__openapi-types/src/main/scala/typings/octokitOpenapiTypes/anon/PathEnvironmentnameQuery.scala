package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathEnvironmentnameQuery extends StObject {
  
  var path: Environmentname
  
  var query: js.UndefOr[Page] = js.undefined
}
object PathEnvironmentnameQuery {
  
  inline def apply(path: Environmentname): PathEnvironmentnameQuery = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathEnvironmentnameQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathEnvironmentnameQuery] (val x: Self) extends AnyVal {
    
    inline def setPath(value: Environmentname): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Page): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
