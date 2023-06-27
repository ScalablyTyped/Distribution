package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `650` extends StObject {
  
  var path: RepoRunid
  
  var query: js.UndefOr[`649`] = js.undefined
}
object `650` {
  
  inline def apply(path: RepoRunid): `650` = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[`650`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `650`] (val x: Self) extends AnyVal {
    
    inline def setPath(value: RepoRunid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `649`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
