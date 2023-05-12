package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses304401403404500 extends StObject {
  
  /**
    * List machine types for a codespace
    * @description List the machine types a codespace can transition to use.
    *
    * You must authenticate using an access token with the `codespace` scope to use this endpoint.
    *
    * GitHub Apps must have read access to the `codespaces_metadata` repository permission to use this endpoint.
    */
  var get: Responses304401403404500
}
object GetResponses304401403404500 {
  
  inline def apply(get: Responses304401403404500): GetResponses304401403404500 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses304401403404500]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponses304401403404500] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Responses304401403404500): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
