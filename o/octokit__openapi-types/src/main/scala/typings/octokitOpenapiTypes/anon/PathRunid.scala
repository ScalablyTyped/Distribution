package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathRunid extends StObject {
  
  var path: Runid
  
  var query: js.UndefOr[Excludepullrequests] = js.undefined
}
object PathRunid {
  
  inline def apply(path: Runid): PathRunid = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathRunid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathRunid] (val x: Self) extends AnyVal {
    
    inline def setPath(value: Runid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Excludepullrequests): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
