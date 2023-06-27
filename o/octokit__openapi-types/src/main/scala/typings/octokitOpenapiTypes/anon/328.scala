package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `328` extends StObject {
  
  var path: Issuenumber
  
  var query: js.UndefOr[Page] = js.undefined
}
object `328` {
  
  inline def apply(path: Issuenumber): `328` = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[`328`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `328`] (val x: Self) extends AnyVal {
    
    inline def setPath(value: Issuenumber): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Page): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
