package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `737` extends StObject {
  
  var path: OwnerString
  
  var query: js.UndefOr[`616`] = js.undefined
}
object `737` {
  
  inline def apply(path: OwnerString): `737` = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[`737`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `737`] (val x: Self) extends AnyVal {
    
    inline def setPath(value: OwnerString): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `616`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
