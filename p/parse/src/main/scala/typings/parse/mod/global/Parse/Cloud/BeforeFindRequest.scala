package typings.parse.mod.global.Parse.Cloud

import typings.parse.mod.global.Parse.Attributes
import typings.parse.mod.global.Parse.Object
import typings.parse.mod.global.Parse.Query
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BeforeFindRequest
  extends StObject
     with TriggerRequest {
  
  var count: Boolean
  
  var isGet: Boolean
  
  var query: Query[Object[Attributes]]
  
  var readPreference: js.UndefOr[ReadPreferenceOption] = js.undefined
}
object BeforeFindRequest {
  
  inline def apply(
    count: Boolean,
    headers: js.Any,
    ip: String,
    isGet: Boolean,
    log: js.Any,
    `object`: Object[Attributes],
    query: Query[Object[Attributes]],
    triggerName: String
  ): BeforeFindRequest = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], ip = ip.asInstanceOf[js.Any], isGet = isGet.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], triggerName = triggerName.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BeforeFindRequest]
  }
  
  extension [Self <: BeforeFindRequest](x: Self) {
    
    inline def setCount(value: Boolean): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setIsGet(value: Boolean): Self = StObject.set(x, "isGet", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Query[Object[Attributes]]): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setReadPreference(value: ReadPreferenceOption): Self = StObject.set(x, "readPreference", value.asInstanceOf[js.Any])
    
    inline def setReadPreferenceUndefined: Self = StObject.set(x, "readPreference", js.undefined)
  }
}
