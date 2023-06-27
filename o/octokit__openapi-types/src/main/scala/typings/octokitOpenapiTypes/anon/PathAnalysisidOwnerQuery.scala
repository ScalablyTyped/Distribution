package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathAnalysisidOwnerQuery extends StObject {
  
  var path: AnalysisidOwner
  
  var query: js.UndefOr[Confirmdelete] = js.undefined
}
object PathAnalysisidOwnerQuery {
  
  inline def apply(path: AnalysisidOwner): PathAnalysisidOwnerQuery = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathAnalysisidOwnerQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathAnalysisidOwnerQuery] (val x: Self) extends AnyVal {
    
    inline def setPath(value: AnalysisidOwner): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Confirmdelete): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
