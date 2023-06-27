package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathPackagenamePackagetypeQuery extends StObject {
  
  var path: PackagenamePackagetype
  
  var query: js.UndefOr[Token] = js.undefined
}
object PathPackagenamePackagetypeQuery {
  
  inline def apply(path: PackagenamePackagetype): PathPackagenamePackagetypeQuery = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathPackagenamePackagetypeQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathPackagenamePackagetypeQuery] (val x: Self) extends AnyVal {
    
    inline def setPath(value: PackagenamePackagetype): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Token): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
