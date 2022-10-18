package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Path244 extends StObject {
  
  var path: `244`
  
  var query: Dateend
}
object Path244 {
  
  inline def apply(path: `244`, query: Dateend): Path244 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[Path244]
  }
  
  extension [Self <: Path244](x: Self) {
    
    inline def setPath(value: `244`): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Dateend): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
