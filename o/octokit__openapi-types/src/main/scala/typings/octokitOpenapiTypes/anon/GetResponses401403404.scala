package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses401403404 extends StObject {
  
  /**
    * List codespaces for the organization
    * @description Lists the codespaces associated to a specified organization.
    *
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    */
  var get: Responses401403404
}
object GetResponses401403404 {
  
  inline def apply(get: Responses401403404): GetResponses401403404 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses401403404]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponses401403404] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Responses401403404): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
