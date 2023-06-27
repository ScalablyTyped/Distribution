package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathBaseHead_ extends StObject {
  
  var path: BaseHead_
  
  var query: js.UndefOr[Page] = js.undefined
}
object PathBaseHead_ {
  
  inline def apply(path: BaseHead_): PathBaseHead_ = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathBaseHead_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathBaseHead_] (val x: Self) extends AnyVal {
    
    inline def setPath(value: BaseHead_): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Page): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
