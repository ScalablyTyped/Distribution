package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryPackagetypePage extends StObject {
  
  var query: PackagetypePage
}
object QueryPackagetypePage {
  
  inline def apply(query: PackagetypePage): QueryPackagetypePage = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryPackagetypePage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryPackagetypePage] (val x: Self) extends AnyVal {
    
    inline def setQuery(value: PackagetypePage): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
