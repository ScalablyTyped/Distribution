package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathPatidNumberQuery473 extends StObject {
  
  var path: PatidNumber
  
  var query: `473`
}
object PathPatidNumberQuery473 {
  
  inline def apply(path: PatidNumber, query: `473`): PathPatidNumberQuery473 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathPatidNumberQuery473]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathPatidNumberQuery473] (val x: Self) extends AnyVal {
    
    inline def setPath(value: PatidNumber): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `473`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
