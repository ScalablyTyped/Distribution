package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathAnalysisidOwnerQueryConfirmdelete extends StObject {
  
  var path: AnalysisidOwner
  
  var query: Confirmdelete
}
object PathAnalysisidOwnerQueryConfirmdelete {
  
  inline def apply(path: AnalysisidOwner, query: Confirmdelete): PathAnalysisidOwnerQueryConfirmdelete = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathAnalysisidOwnerQueryConfirmdelete]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathAnalysisidOwnerQueryConfirmdelete] (val x: Self) extends AnyVal {
    
    inline def setPath(value: AnalysisidOwner): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Confirmdelete): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
