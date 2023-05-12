package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200401403 extends StObject {
  
  /**
    * Get list of conflicting packages during Docker migration for organization
    * @description Lists all packages that are in a specific organization, are readable by the requesting user, and that encountered a conflict during a Docker migration.
    * To use this endpoint, you must authenticate using an access token with the `read:packages` scope.
    */
  var get: Responses200401403
}
object GetResponses200401403 {
  
  inline def apply(get: Responses200401403): GetResponses200401403 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200401403]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponses200401403] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Responses200401403): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
