package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathPackagenameStringQuery455 extends StObject {
  
  var path: PackagenameString
  
  var query: `455`
}
object PathPackagenameStringQuery455 {
  
  inline def apply(path: PackagenameString, query: `455`): PathPackagenameStringQuery455 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathPackagenameStringQuery455]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathPackagenameStringQuery455] (val x: Self) extends AnyVal {
    
    inline def setPath(value: PackagenameString): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `455`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
