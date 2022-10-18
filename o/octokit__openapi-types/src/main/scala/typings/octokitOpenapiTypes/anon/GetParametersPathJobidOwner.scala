package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathJobidOwner extends StObject {
  
  /** Gets a specific job in a workflow run. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint. */
  var get: ParametersPathJobidOwner
}
object GetParametersPathJobidOwner {
  
  inline def apply(get: ParametersPathJobidOwner): GetParametersPathJobidOwner = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathJobidOwner]
  }
  
  extension [Self <: GetParametersPathJobidOwner](x: Self) {
    
    inline def setGet(value: ParametersPathJobidOwner): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
