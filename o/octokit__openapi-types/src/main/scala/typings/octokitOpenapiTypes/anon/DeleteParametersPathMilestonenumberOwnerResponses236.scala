package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParametersPathMilestonenumberOwnerResponses236 extends StObject {
  
  var delete: ParametersPathMilestonenumberOwnerResponses236
  
  var get: ParametersPathMilestonenumberOwner
  
  var patch: Responses548
}
object DeleteParametersPathMilestonenumberOwnerResponses236 {
  
  inline def apply(
    delete: ParametersPathMilestonenumberOwnerResponses236,
    get: ParametersPathMilestonenumberOwner,
    patch: Responses548
  ): DeleteParametersPathMilestonenumberOwnerResponses236 = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParametersPathMilestonenumberOwnerResponses236]
  }
  
  extension [Self <: DeleteParametersPathMilestonenumberOwnerResponses236](x: Self) {
    
    inline def setDelete(value: ParametersPathMilestonenumberOwnerResponses236): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: ParametersPathMilestonenumberOwner): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPatch(value: Responses548): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
  }
}
