package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPath444Responses200401403 extends StObject {
  
  /**
    * Get list of conflicting packages during Docker migration for user
    * @description Lists all packages that are in a specific user's namespace, that the requesting user has access to, and that encountered a conflict during Docker migration.
    * To use this endpoint, you must authenticate using an access token with the `read:packages` scope.
    */
  var get: ParametersPath444Responses200401403
}
object GetParametersPath444Responses200401403 {
  
  inline def apply(get: ParametersPath444Responses200401403): GetParametersPath444Responses200401403 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPath444Responses200401403]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersPath444Responses200401403] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersPath444Responses200401403): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
