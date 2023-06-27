package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathSecretnameQuery extends StObject {
  
  var path: Secretname
  
  var query: js.UndefOr[PagePerpage] = js.undefined
}
object PathSecretnameQuery {
  
  inline def apply(path: Secretname): PathSecretnameQuery = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathSecretnameQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathSecretnameQuery] (val x: Self) extends AnyVal {
    
    inline def setPath(value: Secretname): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: PagePerpage): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
