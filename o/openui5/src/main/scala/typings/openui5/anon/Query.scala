package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Query extends StObject {
  
  /**
    * The search query
    */
  var query: js.UndefOr[String] = js.undefined
}
object Query {
  
  inline def apply(): Query = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Query]
  }
  
  extension [Self <: Query](x: Self) {
    
    inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
