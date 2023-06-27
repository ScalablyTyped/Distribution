package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `743` extends StObject {
  
  var path: PullnumberRepo
  
  var query: js.UndefOr[`552`] = js.undefined
}
object `743` {
  
  inline def apply(path: PullnumberRepo): `743` = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[`743`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `743`] (val x: Self) extends AnyVal {
    
    inline def setPath(value: PullnumberRepo): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `552`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
