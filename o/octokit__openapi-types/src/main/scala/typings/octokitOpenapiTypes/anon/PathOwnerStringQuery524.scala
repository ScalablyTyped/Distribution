package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathOwnerStringQuery524 extends StObject {
  
  var path: OwnerString
  
  var query: `524`
}
object PathOwnerStringQuery524 {
  
  inline def apply(path: OwnerString, query: `524`): PathOwnerStringQuery524 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathOwnerStringQuery524]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathOwnerStringQuery524] (val x: Self) extends AnyVal {
    
    inline def setPath(value: OwnerString): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `524`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
