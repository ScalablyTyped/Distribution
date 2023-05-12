package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathOwnerStringQuery507 extends StObject {
  
  var path: OwnerString
  
  var query: `507`
}
object PathOwnerStringQuery507 {
  
  inline def apply(path: OwnerString, query: `507`): PathOwnerStringQuery507 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathOwnerStringQuery507]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathOwnerStringQuery507] (val x: Self) extends AnyVal {
    
    inline def setPath(value: OwnerString): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `507`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
