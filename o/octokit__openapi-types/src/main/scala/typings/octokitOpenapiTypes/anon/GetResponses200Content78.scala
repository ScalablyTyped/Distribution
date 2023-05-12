package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content78 extends StObject {
  
  /**
    * Get list of conflicting packages during Docker migration for authenticated-user
    * @description Lists all packages that are owned by the authenticated user within the user's namespace, and that encountered a conflict during a Docker migration.
    * To use this endpoint, you must authenticate using an access token with the `read:packages` scope.
    */
  var get: Responses200Content78
}
object GetResponses200Content78 {
  
  inline def apply(get: Responses200Content78): GetResponses200Content78 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content78]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponses200Content78] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Responses200Content78): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
