package typings.miniprogram

import typings.miniprogram.anon.ExtraData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LaunchQuery extends StObject {
  
  var path: String
  
  /**
    * Current Mini Program query, parsed from the query field in the startup parameter
    */
  var query: Any
  
  var referrerInfo: js.UndefOr[ExtraData] = js.undefined
}
object LaunchQuery {
  
  inline def apply(path: String, query: Any): LaunchQuery = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaunchQuery]
  }
  
  extension [Self <: LaunchQuery](x: Self) {
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Any): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setReferrerInfo(value: ExtraData): Self = StObject.set(x, "referrerInfo", value.asInstanceOf[js.Any])
    
    inline def setReferrerInfoUndefined: Self = StObject.set(x, "referrerInfo", js.undefined)
  }
}
