package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathOwnerReleaseidQueryLabelNameString extends StObject {
  
  var path: OwnerReleaseid
  
  var query: LabelNameString
}
object PathOwnerReleaseidQueryLabelNameString {
  
  inline def apply(path: OwnerReleaseid, query: LabelNameString): PathOwnerReleaseidQueryLabelNameString = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathOwnerReleaseidQueryLabelNameString]
  }
  
  extension [Self <: PathOwnerReleaseidQueryLabelNameString](x: Self) {
    
    inline def setPath(value: OwnerReleaseid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: LabelNameString): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
