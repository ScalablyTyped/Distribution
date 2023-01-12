package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathPackagenamePackagetypeQueryState extends StObject {
  
  var path: PackagenamePackagetype
  
  var query: State
}
object PathPackagenamePackagetypeQueryState {
  
  inline def apply(path: PackagenamePackagetype, query: State): PathPackagenamePackagetypeQueryState = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathPackagenamePackagetypeQueryState]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathPackagenamePackagetypeQueryState] (val x: Self) extends AnyVal {
    
    inline def setPath(value: PackagenamePackagetype): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: State): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
