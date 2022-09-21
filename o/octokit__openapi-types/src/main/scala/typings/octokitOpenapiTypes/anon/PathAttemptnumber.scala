package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathAttemptnumber extends StObject {
  
  var path: Attemptnumber
  
  var query: Excludepullrequests
}
object PathAttemptnumber {
  
  inline def apply(path: Attemptnumber, query: Excludepullrequests): PathAttemptnumber = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathAttemptnumber]
  }
  
  extension [Self <: PathAttemptnumber](x: Self) {
    
    inline def setPath(value: Attemptnumber): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Excludepullrequests): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
