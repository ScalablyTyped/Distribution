package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Path615QuerySubjectid extends StObject {
  
  var path: `615`
  
  var query: Subjectid
}
object Path615QuerySubjectid {
  
  inline def apply(path: `615`, query: Subjectid): Path615QuerySubjectid = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[Path615QuerySubjectid]
  }
  
  extension [Self <: Path615QuerySubjectid](x: Self) {
    
    inline def setPath(value: `615`): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Subjectid): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
