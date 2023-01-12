package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryFeaturedPage extends StObject {
  
  var query: FeaturedPage
}
object QueryFeaturedPage {
  
  inline def apply(query: FeaturedPage): QueryFeaturedPage = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryFeaturedPage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryFeaturedPage] (val x: Self) extends AnyVal {
    
    inline def setQuery(value: FeaturedPage): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
