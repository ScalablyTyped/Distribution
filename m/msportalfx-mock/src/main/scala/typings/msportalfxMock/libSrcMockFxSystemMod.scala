package typings.msportalfxMock

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSrcMockFxSystemMod {
  
  @JSImport("msportalfx-mock/lib/src/MockFx/system", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addFirewallRule(port: Double): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("addFirewallRule")(port.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def getSSLCertificate(): js.Promise[SSLCertificate] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSSLCertificate")().asInstanceOf[js.Promise[SSLCertificate]]
  
  inline def loadWinCAs(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("loadWinCAs")().asInstanceOf[Unit]
  
  inline def removeFirewallRule(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("removeFirewallRule")().asInstanceOf[js.Promise[Unit]]
  
  trait SSLCertificate extends StObject {
    
    var passphrase: String
    
    var pfx: Buffer
  }
  object SSLCertificate {
    
    inline def apply(passphrase: String, pfx: Buffer): SSLCertificate = {
      val __obj = js.Dynamic.literal(passphrase = passphrase.asInstanceOf[js.Any], pfx = pfx.asInstanceOf[js.Any])
      __obj.asInstanceOf[SSLCertificate]
    }
    
    extension [Self <: SSLCertificate](x: Self) {
      
      inline def setPassphrase(value: String): Self = StObject.set(x, "passphrase", value.asInstanceOf[js.Any])
      
      inline def setPfx(value: Buffer): Self = StObject.set(x, "pfx", value.asInstanceOf[js.Any])
    }
  }
}
