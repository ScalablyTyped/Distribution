package typings.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AbsolutePagePath extends StObject {
  
  var absolutePagePath: String
  
  var page: String
}
object AbsolutePagePath {
  
  inline def apply(absolutePagePath: String, page: String): AbsolutePagePath = {
    val __obj = js.Dynamic.literal(absolutePagePath = absolutePagePath.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbsolutePagePath]
  }
  
  extension [Self <: AbsolutePagePath](x: Self) {
    
    inline def setAbsolutePagePath(value: String): Self = StObject.set(x, "absolutePagePath", value.asInstanceOf[js.Any])
    
    inline def setPage(value: String): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
  }
}
