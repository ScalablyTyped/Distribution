package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content182 extends StObject {
  
  /**
    * Get the review history for a workflow run
    * @description Anyone with read access to the repository can use this endpoint. If the repository is private, you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint.
    */
  var get: Responses200Content182
}
object GetResponses200Content182 {
  
  inline def apply(get: Responses200Content182): GetResponses200Content182 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content182]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponses200Content182] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Responses200Content182): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
