package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathDirOwner extends StObject {
  
  var path: DirOwner
  
  var query: js.UndefOr[`237`] = js.undefined
}
object PathDirOwner {
  
  inline def apply(path: DirOwner): PathDirOwner = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathDirOwner]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathDirOwner] (val x: Self) extends AnyVal {
    
    inline def setPath(value: DirOwner): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `237`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
