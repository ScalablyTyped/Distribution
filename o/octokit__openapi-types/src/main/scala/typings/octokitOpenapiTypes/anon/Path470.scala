package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Path470 extends StObject {
  
  var path: `470`
  
  var query: js.UndefOr[`469`] = js.undefined
}
object Path470 {
  
  inline def apply(path: `470`): Path470 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Path470]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Path470] (val x: Self) extends AnyVal {
    
    inline def setPath(value: `470`): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `469`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
