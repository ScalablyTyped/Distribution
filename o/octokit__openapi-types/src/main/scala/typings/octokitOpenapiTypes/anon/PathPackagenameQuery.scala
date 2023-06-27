package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathPackagenameQuery extends StObject {
  
  var path: Packagename
  
  var query: js.UndefOr[Token] = js.undefined
}
object PathPackagenameQuery {
  
  inline def apply(path: Packagename): PathPackagenameQuery = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathPackagenameQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathPackagenameQuery] (val x: Self) extends AnyVal {
    
    inline def setPath(value: Packagename): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Token): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
