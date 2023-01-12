package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathInvitationidOwnerRepo extends StObject {
  
  var parameters: PathInvitationidOwnerRepo
}
object ParametersPathInvitationidOwnerRepo {
  
  inline def apply(parameters: PathInvitationidOwnerRepo): ParametersPathInvitationidOwnerRepo = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathInvitationidOwnerRepo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathInvitationidOwnerRepo] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathInvitationidOwnerRepo): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
  }
}
