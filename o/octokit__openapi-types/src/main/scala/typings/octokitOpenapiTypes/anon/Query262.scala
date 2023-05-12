package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Query262 extends StObject {
  
  var path: Owner
  
  var query: `262`
}
object Query262 {
  
  inline def apply(path: Owner, query: `262`): Query262 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[Query262]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Query262] (val x: Self) extends AnyVal {
    
    inline def setPath(value: Owner): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `262`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
