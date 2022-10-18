package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Path642QueryToken extends StObject {
  
  var path: `642`
  
  var query: Token
}
object Path642QueryToken {
  
  inline def apply(path: `642`, query: Token): Path642QueryToken = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[Path642QueryToken]
  }
  
  extension [Self <: Path642QueryToken](x: Self) {
    
    inline def setPath(value: `642`): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Token): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
