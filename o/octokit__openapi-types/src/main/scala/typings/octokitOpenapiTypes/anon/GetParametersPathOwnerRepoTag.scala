package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathOwnerRepoTag extends StObject {
  
  /** Get a published release with the specified tag. */
  var get: ParametersPathOwnerRepoTag
}
object GetParametersPathOwnerRepoTag {
  
  inline def apply(get: ParametersPathOwnerRepoTag): GetParametersPathOwnerRepoTag = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathOwnerRepoTag]
  }
  
  extension [Self <: GetParametersPathOwnerRepoTag](x: Self) {
    
    inline def setGet(value: ParametersPathOwnerRepoTag): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
