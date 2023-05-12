package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersQueryNamePage extends StObject {
  
  /**
    * List artifacts for a repository
    * @description Lists all artifacts for a repository. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint.
    */
  var get: ParametersQueryNamePage
}
object GetParametersQueryNamePage {
  
  inline def apply(get: ParametersQueryNamePage): GetParametersQueryNamePage = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersQueryNamePage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersQueryNamePage] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersQueryNamePage): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
