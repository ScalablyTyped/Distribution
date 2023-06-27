package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathAttemptnumberOwner extends StObject {
  
  var path: AttemptnumberOwner
  
  var query: js.UndefOr[`644`] = js.undefined
}
object PathAttemptnumberOwner {
  
  inline def apply(path: AttemptnumberOwner): PathAttemptnumberOwner = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathAttemptnumberOwner]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathAttemptnumberOwner] (val x: Self) extends AnyVal {
    
    inline def setPath(value: AttemptnumberOwner): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `644`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
