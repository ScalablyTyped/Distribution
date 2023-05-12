package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathOwnerQuery68 extends StObject {
  
  /**
    * List repository organization variables
    * @description Lists all organiation variables shared with a repository. You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `actions_variables:read` repository permission to use this endpoint.
    */
  var get: ParametersPathOwnerQuery68
}
object GetParametersPathOwnerQuery68 {
  
  inline def apply(get: ParametersPathOwnerQuery68): GetParametersPathOwnerQuery68 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathOwnerQuery68]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersPathOwnerQuery68] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersPathOwnerQuery68): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
