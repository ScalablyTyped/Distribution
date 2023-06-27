package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathChecksuiteidQuery extends StObject {
  
  var path: Checksuiteid
  
  var query: js.UndefOr[Checkname] = js.undefined
}
object PathChecksuiteidQuery {
  
  inline def apply(path: Checksuiteid): PathChecksuiteidQuery = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathChecksuiteidQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathChecksuiteidQuery] (val x: Self) extends AnyVal {
    
    inline def setPath(value: Checksuiteid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Checkname): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
