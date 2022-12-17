package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathJobid extends StObject {
  
  /** Gets a specific job in a workflow run. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint. */
  var get: ParametersPathJobid
}
object GetParametersPathJobid {
  
  inline def apply(get: ParametersPathJobid): GetParametersPathJobid = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathJobid]
  }
  
  extension [Self <: GetParametersPathJobid](x: Self) {
    
    inline def setGet(value: ParametersPathJobid): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
