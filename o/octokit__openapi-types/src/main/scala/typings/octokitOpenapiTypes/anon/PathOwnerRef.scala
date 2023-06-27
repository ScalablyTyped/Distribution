package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathOwnerRef extends StObject {
  
  var path: OwnerRef
  
  var query: js.UndefOr[PagePerpage] = js.undefined
}
object PathOwnerRef {
  
  inline def apply(path: OwnerRef): PathOwnerRef = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathOwnerRef]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathOwnerRef] (val x: Self) extends AnyVal {
    
    inline def setPath(value: OwnerRef): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: PagePerpage): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
