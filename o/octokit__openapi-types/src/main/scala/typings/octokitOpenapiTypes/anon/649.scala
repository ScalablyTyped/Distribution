package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `649` extends StObject {
  
  /** The unique identifier of the SSH signing key. */
  var ssh_signing_key_id: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['ssh-signing-key-id'] */ js.Any
}
object `649` {
  
  inline def apply(
    ssh_signing_key_id: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['ssh-signing-key-id'] */ js.Any
  ): `649` = {
    val __obj = js.Dynamic.literal(ssh_signing_key_id = ssh_signing_key_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[`649`]
  }
  
  extension [Self <: `649`](x: Self) {
    
    inline def setSsh_signing_key_id(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['ssh-signing-key-id'] */ js.Any
    ): Self = StObject.set(x, "ssh_signing_key_id", value.asInstanceOf[js.Any])
  }
}
