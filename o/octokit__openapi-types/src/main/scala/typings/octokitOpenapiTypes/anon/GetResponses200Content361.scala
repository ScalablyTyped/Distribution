package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content361 extends StObject {
  
  /**
    * Get latest Pages build
    * @description Gets information about the single most recent build of a GitHub Pages site.
    *
    * A token with the `repo` scope is required. GitHub Apps must have the `pages:read` permission.
    */
  var get: Responses200Content361
}
object GetResponses200Content361 {
  
  inline def apply(get: Responses200Content361): GetResponses200Content361 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content361]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponses200Content361] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Responses200Content361): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
