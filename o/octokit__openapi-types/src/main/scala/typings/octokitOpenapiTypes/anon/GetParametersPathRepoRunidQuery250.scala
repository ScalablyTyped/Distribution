package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathRepoRunidQuery250 extends StObject {
  
  /** Lists artifacts for a workflow run. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint. */
  var get: ParametersPathRepoRunidQuery250
}
object GetParametersPathRepoRunidQuery250 {
  
  inline def apply(get: ParametersPathRepoRunidQuery250): GetParametersPathRepoRunidQuery250 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathRepoRunidQuery250]
  }
  
  extension [Self <: GetParametersPathRepoRunidQuery250](x: Self) {
    
    inline def setGet(value: ParametersPathRepoRunidQuery250): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
