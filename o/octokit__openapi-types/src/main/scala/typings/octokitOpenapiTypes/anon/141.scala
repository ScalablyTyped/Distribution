package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `141` extends StObject {
  
  var path: Discussionnumber
  
  var query: js.UndefOr[ContentPage] = js.undefined
}
object `141` {
  
  inline def apply(path: Discussionnumber): `141` = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[`141`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `141`] (val x: Self) extends AnyVal {
    
    inline def setPath(value: Discussionnumber): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: ContentPage): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
