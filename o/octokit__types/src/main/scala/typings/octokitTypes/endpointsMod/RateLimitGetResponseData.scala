package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Core
import typings.octokitTypes.anon.Limit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RateLimitGetResponseData extends StObject {
  
  var rate: Limit
  
  var resources: Core
}
object RateLimitGetResponseData {
  
  inline def apply(rate: Limit, resources: Core): RateLimitGetResponseData = {
    val __obj = js.Dynamic.literal(rate = rate.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any])
    __obj.asInstanceOf[RateLimitGetResponseData]
  }
  
  extension [Self <: RateLimitGetResponseData](x: Self) {
    
    inline def setRate(value: Limit): Self = StObject.set(x, "rate", value.asInstanceOf[js.Any])
    
    inline def setResources(value: Core): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
  }
}
