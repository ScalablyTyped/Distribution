package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathPackagenamePackagetypeUsernameQueryToken extends StObject {
  
  var path: PackagenamePackagetypeUsername
  
  var query: Token
}
object PathPackagenamePackagetypeUsernameQueryToken {
  
  inline def apply(path: PackagenamePackagetypeUsername, query: Token): PathPackagenamePackagetypeUsernameQueryToken = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathPackagenamePackagetypeUsernameQueryToken]
  }
  
  extension [Self <: PathPackagenamePackagetypeUsernameQueryToken](x: Self) {
    
    inline def setPath(value: PackagenamePackagetypeUsername): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Token): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
