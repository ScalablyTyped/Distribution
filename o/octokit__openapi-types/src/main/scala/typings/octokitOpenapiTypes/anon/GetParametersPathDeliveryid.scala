package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathDeliveryid extends StObject {
  
  /**
    * Get a delivery for an app webhook
    * @description Returns a delivery for the webhook configured for a GitHub App.
    *
    * You must use a [JWT](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint.
    */
  var get: ParametersPathDeliveryid
}
object GetParametersPathDeliveryid {
  
  inline def apply(get: ParametersPathDeliveryid): GetParametersPathDeliveryid = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathDeliveryid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersPathDeliveryid] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersPathDeliveryid): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
