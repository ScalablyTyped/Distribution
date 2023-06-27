package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParametersPathInvitationidOwner extends StObject {
  
  /** Delete a repository invitation */
  var delete: ParametersPathInvitationidOwner
  
  /** Update a repository invitation */
  var patch: Responses200Content246
}
object DeleteParametersPathInvitationidOwner {
  
  inline def apply(delete: ParametersPathInvitationidOwner, patch: Responses200Content246): DeleteParametersPathInvitationidOwner = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParametersPathInvitationidOwner]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteParametersPathInvitationidOwner] (val x: Self) extends AnyVal {
    
    inline def setDelete(value: ParametersPathInvitationidOwner): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setPatch(value: Responses200Content246): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
  }
}
