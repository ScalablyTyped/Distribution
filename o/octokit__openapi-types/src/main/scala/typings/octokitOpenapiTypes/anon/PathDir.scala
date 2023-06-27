package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathDir extends StObject {
  
  var path: Dir
  
  var query: js.UndefOr[`237`] = js.undefined
}
object PathDir {
  
  inline def apply(path: Dir): PathDir = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathDir]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathDir] (val x: Self) extends AnyVal {
    
    inline def setPath(value: Dir): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `237`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
