package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathPackagenamePackagetypeUsernameQuery extends StObject {
  
  var path: PackagenamePackagetypeUsername
  
  var query: js.UndefOr[Token] = js.undefined
}
object PathPackagenamePackagetypeUsernameQuery {
  
  inline def apply(path: PackagenamePackagetypeUsername): PathPackagenamePackagetypeUsernameQuery = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathPackagenamePackagetypeUsernameQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathPackagenamePackagetypeUsernameQuery] (val x: Self) extends AnyVal {
    
    inline def setPath(value: PackagenamePackagetypeUsername): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Token): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
