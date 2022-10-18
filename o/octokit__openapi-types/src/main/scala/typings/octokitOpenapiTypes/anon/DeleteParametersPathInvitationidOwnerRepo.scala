package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParametersPathInvitationidOwnerRepo extends StObject {
  
  var delete: ParametersPathInvitationidOwnerRepo
  
  var patch: Responses200Content464
}
object DeleteParametersPathInvitationidOwnerRepo {
  
  inline def apply(delete: ParametersPathInvitationidOwnerRepo, patch: Responses200Content464): DeleteParametersPathInvitationidOwnerRepo = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParametersPathInvitationidOwnerRepo]
  }
  
  extension [Self <: DeleteParametersPathInvitationidOwnerRepo](x: Self) {
    
    inline def setDelete(value: ParametersPathInvitationidOwnerRepo): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setPatch(value: Responses200Content464): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
  }
}
