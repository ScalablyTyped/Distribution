package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathBuildid extends StObject {
  
  /**
    * Get GitHub Pages build
    * @description Gets information about a GitHub Pages build.
    *
    * A token with the `repo` scope is required. GitHub Apps must have the `pages:read` permission.
    */
  var get: ParametersPathBuildid
}
object GetParametersPathBuildid {
  
  inline def apply(get: ParametersPathBuildid): GetParametersPathBuildid = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathBuildid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersPathBuildid] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersPathBuildid): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
