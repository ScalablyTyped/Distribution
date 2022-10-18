package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathProjectidNumberQueryPage extends StObject {
  
  var path: ProjectidNumber
  
  var query: Page
}
object PathProjectidNumberQueryPage {
  
  inline def apply(path: ProjectidNumber, query: Page): PathProjectidNumberQueryPage = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathProjectidNumberQueryPage]
  }
  
  extension [Self <: PathProjectidNumberQueryPage](x: Self) {
    
    inline def setPath(value: ProjectidNumber): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Page): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
