package typings.nodegit

import typings.nodegit.certMod.Cert
import typings.nodegit.nodegitNumbers.`0`
import typings.nodegit.remoteMod.Remote
import typings.nodegit.strArrayMod.Strarray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
    
    @JSImport("nodegit/transport", "Transport")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def sshWithPaths(owner: Remote, payload: String): js.Promise[Transport] = (^.asInstanceOf[js.Dynamic].applyDynamic("sshWithPaths")(owner.asInstanceOf[js.Any], payload.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Transport]]
    @scala.inline
    def sshWithPaths(owner: Remote, payload: js.Array[String]): js.Promise[Transport] = (^.asInstanceOf[js.Dynamic].applyDynamic("sshWithPaths")(owner.asInstanceOf[js.Any], payload.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Transport]]
    @scala.inline
    def sshWithPaths(owner: Remote, payload: Strarray): js.Promise[Transport] = (^.asInstanceOf[js.Dynamic].applyDynamic("sshWithPaths")(owner.asInstanceOf[js.Any], payload.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Transport]]
    
    @scala.inline
    def unregister(prefix: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("unregister")(prefix.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    object FLAGS {
      
      @scala.inline
      def NONE: `0` = 0.asInstanceOf[`0`]
    }
    type FLAGS = `0`
  }
}
