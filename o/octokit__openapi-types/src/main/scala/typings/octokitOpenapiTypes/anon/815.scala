package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `815` extends StObject {
  
  var path: `786`
  
  var query: js.UndefOr[`616`] = js.undefined
}
object `815` {
  
  inline def apply(path: `786`): `815` = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[`815`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `815`] (val x: Self) extends AnyVal {
    
    inline def setPath(value: `786`): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `616`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
