package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathRunnergroupidNumberQuery407 extends StObject {
  
  var path: RunnergroupidNumber
  
  var query: `407`
}
object PathRunnergroupidNumberQuery407 {
  
  inline def apply(path: RunnergroupidNumber, query: `407`): PathRunnergroupidNumberQuery407 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathRunnergroupidNumberQuery407]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathRunnergroupidNumberQuery407] (val x: Self) extends AnyVal {
    
    inline def setPath(value: RunnergroupidNumber): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `407`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
