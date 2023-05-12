package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Path649QuerySubjectid extends StObject {
  
  var path: `649`
  
  var query: Subjectid
}
object Path649QuerySubjectid {
  
  inline def apply(path: `649`, query: Subjectid): Path649QuerySubjectid = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[Path649QuerySubjectid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Path649QuerySubjectid] (val x: Self) extends AnyVal {
    
    inline def setPath(value: `649`): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Subjectid): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
