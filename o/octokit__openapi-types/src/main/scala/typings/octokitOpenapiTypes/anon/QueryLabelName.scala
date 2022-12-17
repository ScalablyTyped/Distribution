package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryLabelName extends StObject {
  
  var path: Releaseid
  
  var query: LabelName
}
object QueryLabelName {
  
  inline def apply(path: Releaseid, query: LabelName): QueryLabelName = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryLabelName]
  }
  
  extension [Self <: QueryLabelName](x: Self) {
    
    inline def setPath(value: Releaseid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: LabelName): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
