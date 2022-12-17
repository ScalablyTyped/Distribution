package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content339 extends StObject {
  
  /** Get the top 10 referrers over the last 14 days. */
  var get: Responses200Content339
}
object GetResponses200Content339 {
  
  inline def apply(get: Responses200Content339): GetResponses200Content339 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content339]
  }
  
  extension [Self <: GetResponses200Content339](x: Self) {
    
    inline def setGet(value: Responses200Content339): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
