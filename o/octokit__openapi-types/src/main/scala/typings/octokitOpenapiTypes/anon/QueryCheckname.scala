package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryCheckname extends StObject {
  
  var path: Checksuiteid
  
  var query: Checkname
}
object QueryCheckname {
  
  inline def apply(path: Checksuiteid, query: Checkname): QueryCheckname = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryCheckname]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryCheckname] (val x: Self) extends AnyVal {
    
    inline def setPath(value: Checksuiteid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Checkname): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
