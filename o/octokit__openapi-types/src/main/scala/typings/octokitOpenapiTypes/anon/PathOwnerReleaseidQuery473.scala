package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathOwnerReleaseidQuery473 extends StObject {
  
  var path: OwnerReleaseid
  
  var query: `473`
}
object PathOwnerReleaseidQuery473 {
  
  inline def apply(path: OwnerReleaseid, query: `473`): PathOwnerReleaseidQuery473 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathOwnerReleaseidQuery473]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathOwnerReleaseidQuery473] (val x: Self) extends AnyVal {
    
    inline def setPath(value: OwnerReleaseid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `473`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
