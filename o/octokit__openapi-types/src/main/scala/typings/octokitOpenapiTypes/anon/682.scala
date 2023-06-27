package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `682` extends StObject {
  
  var path: OwnerRefRepo
  
  var query: js.UndefOr[AppidChecknamePage] = js.undefined
}
object `682` {
  
  inline def apply(path: OwnerRefRepo): `682` = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[`682`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `682`] (val x: Self) extends AnyVal {
    
    inline def setPath(value: OwnerRefRepo): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: AppidChecknamePage): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
