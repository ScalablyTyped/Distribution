package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathPackagenamePackagetypeQueryToken extends StObject {
  
  var path: PackagenamePackagetype
  
  var query: Token
}
object PathPackagenamePackagetypeQueryToken {
  
  inline def apply(path: PackagenamePackagetype, query: Token): PathPackagenamePackagetypeQueryToken = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathPackagenamePackagetypeQueryToken]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathPackagenamePackagetypeQueryToken] (val x: Self) extends AnyVal {
    
    inline def setPath(value: PackagenamePackagetype): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Token): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
