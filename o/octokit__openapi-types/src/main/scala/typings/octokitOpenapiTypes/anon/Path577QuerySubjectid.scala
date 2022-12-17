package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Path577QuerySubjectid extends StObject {
  
  var path: `577`
  
  var query: Subjectid
}
object Path577QuerySubjectid {
  
  inline def apply(path: `577`, query: Subjectid): Path577QuerySubjectid = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[Path577QuerySubjectid]
  }
  
  extension [Self <: Path577QuerySubjectid](x: Self) {
    
    inline def setPath(value: `577`): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Subjectid): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
