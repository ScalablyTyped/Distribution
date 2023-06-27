package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathTreesha extends StObject {
  
  var path: Treesha
  
  var query: js.UndefOr[Recursive] = js.undefined
}
object PathTreesha {
  
  inline def apply(path: Treesha): PathTreesha = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathTreesha]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathTreesha] (val x: Self) extends AnyVal {
    
    inline def setPath(value: Treesha): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Recursive): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
