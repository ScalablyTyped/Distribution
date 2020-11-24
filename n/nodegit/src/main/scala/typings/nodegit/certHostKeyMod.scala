package typings.nodegit

import typings.nodegit.certMod.Cert
import typings.nodegit.certMod.Cert.TYPE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit/cert-host-key", JSImport.Namespace)
@js.native
object certHostKeyMod extends js.Object {
  
  @js.native
  class CertHostkey () extends js.Object {
    
    var hashMd5: String = js.native
    
    var hashSha1: String = js.native
    
    var parent: Cert = js.native
    
    var `type`: TYPE = js.native
  }
}
