package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Clientid extends StObject {
  
  /** The client ID of the GitHub app. */
  var client_id: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['client-id'] */ js.Any
}
object Clientid {
  
  inline def apply(
    client_id: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['client-id'] */ js.Any
  ): Clientid = {
    val __obj = js.Dynamic.literal(client_id = client_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Clientid]
  }
  
  extension [Self <: Clientid](x: Self) {
    
    inline def setClient_id(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['client-id'] */ js.Any
    ): Self = StObject.set(x, "client_id", value.asInstanceOf[js.Any])
  }
}
