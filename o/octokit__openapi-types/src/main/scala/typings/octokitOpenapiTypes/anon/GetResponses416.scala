package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses416 extends StObject {
  
  /**
    * List social accounts for a user
    * @description Lists social media accounts for a user. This endpoint is accessible by anyone.
    */
  var get: Responses416
}
object GetResponses416 {
  
  inline def apply(get: Responses416): GetResponses416 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses416]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponses416] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Responses416): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
