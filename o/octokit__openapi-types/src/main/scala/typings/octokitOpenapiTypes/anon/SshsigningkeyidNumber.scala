package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SshsigningkeyidNumber extends StObject {
  
  var ssh_signing_key_id: Double
}
object SshsigningkeyidNumber {
  
  inline def apply(ssh_signing_key_id: Double): SshsigningkeyidNumber = {
    val __obj = js.Dynamic.literal(ssh_signing_key_id = ssh_signing_key_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[SshsigningkeyidNumber]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SshsigningkeyidNumber] (val x: Self) extends AnyVal {
    
    inline def setSsh_signing_key_id(value: Double): Self = StObject.set(x, "ssh_signing_key_id", value.asInstanceOf[js.Any])
  }
}
