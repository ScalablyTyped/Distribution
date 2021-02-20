package typings.nodegit

import typings.nodegit.certMod.Cert
import typings.nodegit.nodegitNumbers.`0`
import typings.nodegit.remoteMod.Remote
import typings.nodegit.strArrayMod.Strarray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transportMod {
  
  @JSImport("nodegit/transport", "Transport")
  @js.native
  class Transport () extends StObject {
    
    def init(version: Double): Double = js.native
    
    def smartCertificateCheck(cert: Cert, valid: Double, hostName: String): Double = js.native
  }
  /* static members */
  object Transport {
    
    @JSImport("nodegit/transport", "Transport.sshWithPaths")
    @js.native
    def sshWithPaths(owner: Remote, payload: String): js.Promise[Transport] = js.native
    @JSImport("nodegit/transport", "Transport.sshWithPaths")
    @js.native
    def sshWithPaths(owner: Remote, payload: js.Array[String]): js.Promise[Transport] = js.native
    @JSImport("nodegit/transport", "Transport.sshWithPaths")
    @js.native
    def sshWithPaths(owner: Remote, payload: Strarray): js.Promise[Transport] = js.native
    
    @JSImport("nodegit/transport", "Transport.unregister")
    @js.native
    def unregister(prefix: String): Double = js.native
    
    object FLAGS {
      
      @scala.inline
      def NONE: `0` = 0.asInstanceOf[`0`]
    }
    type FLAGS = `0`
  }
}
