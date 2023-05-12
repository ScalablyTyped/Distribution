package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryPackagetypePagePerpage extends StObject {
  
  var query: PackagetypePagePerpage
}
object QueryPackagetypePagePerpage {
  
  inline def apply(query: PackagetypePagePerpage): QueryPackagetypePagePerpage = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryPackagetypePagePerpage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryPackagetypePagePerpage] (val x: Self) extends AnyVal {
    
    inline def setQuery(value: PackagetypePagePerpage): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
