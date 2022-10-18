package typings.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppPathsPage extends StObject {
  
  var appPaths: js.Array[String] | Null
  
  var page: String
}
object AppPathsPage {
  
  inline def apply(page: String): AppPathsPage = {
    val __obj = js.Dynamic.literal(page = page.asInstanceOf[js.Any], appPaths = null)
    __obj.asInstanceOf[AppPathsPage]
  }
  
  extension [Self <: AppPathsPage](x: Self) {
    
    inline def setAppPaths(value: js.Array[String]): Self = StObject.set(x, "appPaths", value.asInstanceOf[js.Any])
    
    inline def setAppPathsNull: Self = StObject.set(x, "appPaths", null)
    
    inline def setAppPathsVarargs(value: String*): Self = StObject.set(x, "appPaths", js.Array(value*))
    
    inline def setPage(value: String): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
  }
}
