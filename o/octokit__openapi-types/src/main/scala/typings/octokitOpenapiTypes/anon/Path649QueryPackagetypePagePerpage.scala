package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Path649QueryPackagetypePagePerpage extends StObject {
  
  var path: `649`
  
  var query: PackagetypePagePerpage
}
object Path649QueryPackagetypePagePerpage {
  
  inline def apply(path: `649`, query: PackagetypePagePerpage): Path649QueryPackagetypePagePerpage = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[Path649QueryPackagetypePagePerpage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Path649QueryPackagetypePagePerpage] (val x: Self) extends AnyVal {
    
    inline def setPath(value: `649`): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: PackagetypePagePerpage): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
