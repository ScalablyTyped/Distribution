package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathPackagetypeUsernameQueryToken extends StObject {
  
  var path: PackagetypeUsername
  
  var query: Token
}
object PathPackagetypeUsernameQueryToken {
  
  inline def apply(path: PackagetypeUsername, query: Token): PathPackagetypeUsernameQueryToken = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathPackagetypeUsernameQueryToken]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathPackagetypeUsernameQueryToken] (val x: Self) extends AnyVal {
    
    inline def setPath(value: PackagetypeUsername): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Token): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
