package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathPackagenameStringQuery extends StObject {
  
  var path: PackagenameString
  
  var query: js.UndefOr[Token] = js.undefined
}
object PathPackagenameStringQuery {
  
  inline def apply(path: PackagenameString): PathPackagenameStringQuery = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathPackagenameStringQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathPackagenameStringQuery] (val x: Self) extends AnyVal {
    
    inline def setPath(value: PackagenameString): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Token): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
