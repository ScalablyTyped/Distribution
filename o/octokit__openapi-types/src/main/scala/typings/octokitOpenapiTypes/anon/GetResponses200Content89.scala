package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content89 extends StObject {
  
  /**
    * Get list of conflicting packages during Docker migration for authenticated-user
    * @description Lists all packages that are owned by the authenticated user within the user's namespace, and that encountered a conflict during a Docker migration.
    * To use this endpoint, you must authenticate using an access token with the `read:packages` scope.
    */
  var get: Responses200Content89
}
object GetResponses200Content89 {
  
  inline def apply(get: Responses200Content89): GetResponses200Content89 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content89]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponses200Content89] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Responses200Content89): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
