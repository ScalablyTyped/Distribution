package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses492 extends StObject {
  
  /**
    * List social accounts for a user
    * @description Lists social media accounts for a user. This endpoint is accessible by anyone.
    */
  var get: Responses492
}
object GetResponses492 {
  
  inline def apply(get: Responses492): GetResponses492 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses492]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponses492] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Responses492): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
