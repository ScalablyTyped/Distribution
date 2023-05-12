package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QuerySubjectid extends StObject {
  
  var path: `370`
  
  var query: Subjectid
}
object QuerySubjectid {
  
  inline def apply(path: `370`, query: Subjectid): QuerySubjectid = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuerySubjectid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QuerySubjectid] (val x: Self) extends AnyVal {
    
    inline def setPath(value: `370`): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Subjectid): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
