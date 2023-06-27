package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathOwnerQuery extends StObject {
  
  /**
    * List artifacts for a repository
    * @description Lists all artifacts for a repository. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint.
    */
  var get: ParametersPathOwnerQuery
}
object GetParametersPathOwnerQuery {
  
  inline def apply(get: ParametersPathOwnerQuery): GetParametersPathOwnerQuery = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathOwnerQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersPathOwnerQuery] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersPathOwnerQuery): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
