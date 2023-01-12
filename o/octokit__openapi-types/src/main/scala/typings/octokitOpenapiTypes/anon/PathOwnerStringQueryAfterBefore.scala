package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathOwnerStringQueryAfterBefore extends StObject {
  
  var path: OwnerString
  
  var query: AfterBefore
}
object PathOwnerStringQueryAfterBefore {
  
  inline def apply(path: OwnerString, query: AfterBefore): PathOwnerStringQueryAfterBefore = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathOwnerStringQueryAfterBefore]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathOwnerStringQueryAfterBefore] (val x: Self) extends AnyVal {
    
    inline def setPath(value: OwnerString): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: AfterBefore): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
