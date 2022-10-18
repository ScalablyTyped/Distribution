package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathPackagenamePackagetypeQueryPerpageState extends StObject {
  
  var path: PackagenamePackagetype
  
  var query: PerpageState
}
object PathPackagenamePackagetypeQueryPerpageState {
  
  inline def apply(path: PackagenamePackagetype, query: PerpageState): PathPackagenamePackagetypeQueryPerpageState = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathPackagenamePackagetypeQueryPerpageState]
  }
  
  extension [Self <: PathPackagenamePackagetypeQueryPerpageState](x: Self) {
    
    inline def setPath(value: PackagenamePackagetype): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: PerpageState): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
