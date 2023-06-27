package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `782` extends StObject {
  
  var path: DiscussionnumberNumber
  
  var query: js.UndefOr[`627`] = js.undefined
}
object `782` {
  
  inline def apply(path: DiscussionnumberNumber): `782` = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[`782`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `782`] (val x: Self) extends AnyVal {
    
    inline def setPath(value: DiscussionnumberNumber): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `627`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
