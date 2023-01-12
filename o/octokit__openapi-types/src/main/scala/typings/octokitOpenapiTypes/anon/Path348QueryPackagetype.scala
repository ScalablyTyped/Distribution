package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Path348QueryPackagetype extends StObject {
  
  var path: `348`
  
  var query: Packagetype
}
object Path348QueryPackagetype {
  
  inline def apply(path: `348`, query: Packagetype): Path348QueryPackagetype = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[Path348QueryPackagetype]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Path348QueryPackagetype] (val x: Self) extends AnyVal {
    
    inline def setPath(value: `348`): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Packagetype): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
