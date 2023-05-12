package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryPage extends StObject {
  
  var query: Page
}
object QueryPage {
  
  inline def apply(query: Page): QueryPage = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryPage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryPage] (val x: Self) extends AnyVal {
    
    inline def setQuery(value: Page): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
