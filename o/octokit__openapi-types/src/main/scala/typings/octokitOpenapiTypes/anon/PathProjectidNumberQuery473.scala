package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathProjectidNumberQuery473 extends StObject {
  
  var path: ProjectidNumber
  
  var query: `473`
}
object PathProjectidNumberQuery473 {
  
  inline def apply(path: ProjectidNumber, query: `473`): PathProjectidNumberQuery473 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathProjectidNumberQuery473]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathProjectidNumberQuery473] (val x: Self) extends AnyVal {
    
    inline def setPath(value: ProjectidNumber): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `473`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
