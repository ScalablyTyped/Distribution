package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content248 extends StObject {
  
  /**
    * Get repository permissions for a user
    * @description Checks the repository permission of a collaborator. The possible repository permissions are `admin`, `write`, `read`, and `none`.
    */
  var get: Responses200Content248
}
object GetResponses200Content248 {
  
  inline def apply(get: Responses200Content248): GetResponses200Content248 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content248]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponses200Content248] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Responses200Content248): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
