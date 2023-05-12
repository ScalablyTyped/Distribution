package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathPackagenameStringQuery522 extends StObject {
  
  var path: PackagenameString
  
  var query: `522`
}
object PathPackagenameStringQuery522 {
  
  inline def apply(path: PackagenameString, query: `522`): PathPackagenameStringQuery522 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathPackagenameStringQuery522]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathPackagenameStringQuery522] (val x: Self) extends AnyVal {
    
    inline def setPath(value: PackagenameString): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `522`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
