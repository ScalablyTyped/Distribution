package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParametersPathInvitationidOwner extends StObject {
  
  var delete: ParametersPathInvitationidOwner
  
  var patch: RequestBodyContentApplicationjson254
}
object DeleteParametersPathInvitationidOwner {
  
  inline def apply(delete: ParametersPathInvitationidOwner, patch: RequestBodyContentApplicationjson254): DeleteParametersPathInvitationidOwner = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParametersPathInvitationidOwner]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteParametersPathInvitationidOwner] (val x: Self) extends AnyVal {
    
    inline def setDelete(value: ParametersPathInvitationidOwner): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setPatch(value: RequestBodyContentApplicationjson254): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
  }
}
