package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathHeadOwner extends StObject {
  
  var path: HeadOwner
  
  var query: `407`
}
object PathHeadOwner {
  
  inline def apply(path: HeadOwner, query: `407`): PathHeadOwner = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathHeadOwner]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathHeadOwner] (val x: Self) extends AnyVal {
    
    inline def setPath(value: HeadOwner): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `407`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
