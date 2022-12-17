package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathProjectidNumberQuery407 extends StObject {
  
  var path: ProjectidNumber
  
  var query: `407`
}
object PathProjectidNumberQuery407 {
  
  inline def apply(path: ProjectidNumber, query: `407`): PathProjectidNumberQuery407 = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathProjectidNumberQuery407]
  }
  
  extension [Self <: PathProjectidNumberQuery407](x: Self) {
    
    inline def setPath(value: ProjectidNumber): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: `407`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
