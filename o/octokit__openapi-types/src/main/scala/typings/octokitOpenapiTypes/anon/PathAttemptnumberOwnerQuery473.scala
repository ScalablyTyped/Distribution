package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathAttemptnumberOwnerQuery473 extends StObject {
  
  var path: AttemptnumberOwner
  
  var query: `473`
}
object PathAttemptnumberOwnerQuery473 {
  
  inline def apply(path: AttemptnumberOwner, query: `473`): PathAttemptnumberOwnerQuery473 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathAttemptnumberOwnerQuery473]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathAttemptnumberOwnerQuery473] (val x: Self) extends AnyVal {
    
    inline def setPath(value: AttemptnumberOwner): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `473`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
