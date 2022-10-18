package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QuerySubjectid extends StObject {
  
  var path: UsernameString
  
  var query: Subjectid
}
object QuerySubjectid {
  
  inline def apply(path: UsernameString, query: Subjectid): QuerySubjectid = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuerySubjectid]
  }
  
  extension [Self <: QuerySubjectid](x: Self) {
    
    inline def setPath(value: UsernameString): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Subjectid): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
