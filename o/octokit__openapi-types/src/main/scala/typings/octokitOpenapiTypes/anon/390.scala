package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `390` extends StObject {
  
  var path: Releaseid
  
  var query: js.UndefOr[ContentPagePerpage] = js.undefined
}
object `390` {
  
  inline def apply(path: Releaseid): `390` = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[`390`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `390`] (val x: Self) extends AnyVal {
    
    inline def setPath(value: Releaseid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: ContentPagePerpage): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
