package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathAnalysisidQuery extends StObject {
  
  var path: Analysisid
  
  var query: js.UndefOr[Confirmdelete] = js.undefined
}
object PathAnalysisidQuery {
  
  inline def apply(path: Analysisid): PathAnalysisidQuery = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathAnalysisidQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathAnalysisidQuery] (val x: Self) extends AnyVal {
    
    inline def setPath(value: Analysisid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Confirmdelete): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
