package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Sshsigningkeyid extends StObject {
  
  /** The unique identifier of the SSH signing key. */
  var ssh_signing_key_id: Double
}
object Sshsigningkeyid {
  
  inline def apply(ssh_signing_key_id: Double): Sshsigningkeyid = {
    val __obj = js.Dynamic.literal(ssh_signing_key_id = ssh_signing_key_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sshsigningkeyid]
  }
  
  extension [Self <: Sshsigningkeyid](x: Self) {
    
    inline def setSsh_signing_key_id(value: Double): Self = StObject.set(x, "ssh_signing_key_id", value.asInstanceOf[js.Any])
  }
}
