package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Path599QuerySubjectid extends StObject {
  
  var path: `599`
  
  var query: Subjectid
}
object Path599QuerySubjectid {
  
  inline def apply(path: `599`, query: Subjectid): Path599QuerySubjectid = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[Path599QuerySubjectid]
  }
  
  extension [Self <: Path599QuerySubjectid](x: Self) {
    
    inline def setPath(value: `599`): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Subjectid): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
