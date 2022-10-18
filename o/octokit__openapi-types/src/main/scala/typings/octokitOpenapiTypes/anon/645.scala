package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `645` extends StObject {
  
  /** The unique identifier of the invitation. */
  var invitation_id: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['invitation-id'] */ js.Any
}
object `645` {
  
  inline def apply(
    invitation_id: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['invitation-id'] */ js.Any
  ): `645` = {
    val __obj = js.Dynamic.literal(invitation_id = invitation_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[`645`]
  }
  
  extension [Self <: `645`](x: Self) {
    
    inline def setInvitation_id(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['invitation-id'] */ js.Any
    ): Self = StObject.set(x, "invitation_id", value.asInstanceOf[js.Any])
  }
}
