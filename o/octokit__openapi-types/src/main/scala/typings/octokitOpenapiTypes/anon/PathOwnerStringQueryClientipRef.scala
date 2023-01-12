package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathOwnerStringQueryClientipRef extends StObject {
  
  var path: OwnerString
  
  var query: ClientipRef
}
object PathOwnerStringQueryClientipRef {
  
  inline def apply(path: OwnerString, query: ClientipRef): PathOwnerStringQueryClientipRef = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathOwnerStringQueryClientipRef]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathOwnerStringQueryClientipRef] (val x: Self) extends AnyVal {
    
    inline def setPath(value: OwnerString): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: ClientipRef): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
