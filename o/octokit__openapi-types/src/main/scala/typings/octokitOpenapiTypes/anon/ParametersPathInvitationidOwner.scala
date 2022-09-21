package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathInvitationidOwner extends StObject {
  
  var parameters: PathInvitationidOwner
}
object ParametersPathInvitationidOwner {
  
  inline def apply(parameters: PathInvitationidOwner): ParametersPathInvitationidOwner = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathInvitationidOwner]
  }
  
  extension [Self <: ParametersPathInvitationidOwner](x: Self) {
    
    inline def setParameters(value: PathInvitationidOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
  }
}
