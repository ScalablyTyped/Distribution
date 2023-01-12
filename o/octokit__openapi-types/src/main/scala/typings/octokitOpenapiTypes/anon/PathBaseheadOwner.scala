package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathBaseheadOwner extends StObject {
  
  var path: BaseheadOwner
  
  var query: `434`
}
object PathBaseheadOwner {
  
  inline def apply(path: BaseheadOwner, query: `434`): PathBaseheadOwner = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathBaseheadOwner]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathBaseheadOwner] (val x: Self) extends AnyVal {
    
    inline def setPath(value: BaseheadOwner): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `434`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
