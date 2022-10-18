package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryLabelNameString extends StObject {
  
  var path: Releaseid
  
  var query: LabelNameString
}
object QueryLabelNameString {
  
  inline def apply(path: Releaseid, query: LabelNameString): QueryLabelNameString = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryLabelNameString]
  }
  
  extension [Self <: QueryLabelNameString](x: Self) {
    
    inline def setPath(value: Releaseid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: LabelNameString): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
