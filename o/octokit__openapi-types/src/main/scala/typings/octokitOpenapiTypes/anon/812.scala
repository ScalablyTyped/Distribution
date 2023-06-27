package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `812` extends StObject {
  
  var path: `786`
  
  var query: js.UndefOr[Subjectid] = js.undefined
}
object `812` {
  
  inline def apply(path: `786`): `812` = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[`812`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `812`] (val x: Self) extends AnyVal {
    
    inline def setPath(value: `786`): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Subjectid): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
