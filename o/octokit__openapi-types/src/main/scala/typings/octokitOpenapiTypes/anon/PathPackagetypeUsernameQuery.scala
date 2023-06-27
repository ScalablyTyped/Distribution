package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathPackagetypeUsernameQuery extends StObject {
  
  var path: PackagetypeUsername
  
  var query: js.UndefOr[Token] = js.undefined
}
object PathPackagetypeUsernameQuery {
  
  inline def apply(path: PackagetypeUsername): PathPackagetypeUsernameQuery = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathPackagetypeUsernameQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathPackagetypeUsernameQuery] (val x: Self) extends AnyVal {
    
    inline def setPath(value: PackagetypeUsername): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Token): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
