package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Sshsigningkeyid extends StObject {
  
  var ssh_signing_key_id: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['ssh-signing-key-id'] */ js.Any
}
object Sshsigningkeyid {
  
  inline def apply(
    ssh_signing_key_id: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['ssh-signing-key-id'] */ js.Any
  ): Sshsigningkeyid = {
    val __obj = js.Dynamic.literal(ssh_signing_key_id = ssh_signing_key_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sshsigningkeyid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Sshsigningkeyid] (val x: Self) extends AnyVal {
    
    inline def setSsh_signing_key_id(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['ssh-signing-key-id'] */ js.Any
    ): Self = StObject.set(x, "ssh_signing_key_id", value.asInstanceOf[js.Any])
  }
}
