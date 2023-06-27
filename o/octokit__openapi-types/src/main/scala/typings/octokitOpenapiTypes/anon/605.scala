package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `605` extends StObject {
  
  var path: OrgString
  
  var query: js.UndefOr[PagePerpageRole] = js.undefined
}
object `605` {
  
  inline def apply(path: OrgString): `605` = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[`605`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `605`] (val x: Self) extends AnyVal {
    
    inline def setPath(value: OrgString): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: PagePerpageRole): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
