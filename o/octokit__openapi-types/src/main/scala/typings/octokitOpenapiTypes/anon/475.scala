package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `475` extends StObject {
  
  var invitation_id: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['invitation-id'] */ js.Any
}
object `475` {
  
  inline def apply(
    invitation_id: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['invitation-id'] */ js.Any
  ): `475` = {
    val __obj = js.Dynamic.literal(invitation_id = invitation_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[`475`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `475`] (val x: Self) extends AnyVal {
    
    inline def setInvitation_id(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['invitation-id'] */ js.Any
    ): Self = StObject.set(x, "invitation_id", value.asInstanceOf[js.Any])
  }
}
