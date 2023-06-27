package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathHeadOwner extends StObject {
  
  var path: HeadOwner
  
  var query: js.UndefOr[`552`] = js.undefined
}
object PathHeadOwner {
  
  inline def apply(path: HeadOwner): PathHeadOwner = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathHeadOwner]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathHeadOwner] (val x: Self) extends AnyVal {
    
    inline def setPath(value: HeadOwner): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `552`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
