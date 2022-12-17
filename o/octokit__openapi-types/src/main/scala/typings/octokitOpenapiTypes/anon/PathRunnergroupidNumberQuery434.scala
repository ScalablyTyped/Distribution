package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathRunnergroupidNumberQuery434 extends StObject {
  
  var path: RunnergroupidNumber
  
  var query: `434`
}
object PathRunnergroupidNumberQuery434 {
  
  inline def apply(path: RunnergroupidNumber, query: `434`): PathRunnergroupidNumberQuery434 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathRunnergroupidNumberQuery434]
  }
  
  extension [Self <: PathRunnergroupidNumberQuery434](x: Self) {
    
    inline def setPath(value: RunnergroupidNumber): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `434`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
