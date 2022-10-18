package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEngineEngineMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/engine/Engine", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with Engine
  @JSImport("@nginstack/engine/lib/engine/Engine", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  trait Engine extends StObject {
    
    var applicationFileName: String = js.native
    
    var applicationPath: String = js.native
    
    var arch: String = js.native
    
    var dataDir: String = js.native
    
    def discardEndpointInfoCache(): Unit = js.native
    
    var env: Any = js.native
    
    def exit(): Unit = js.native
    def exit(exitCode: Double): Unit = js.native
    def exit(exitCode: Double, delay: Double): Unit = js.native
    def exit(exitCode: Unit, delay: Double): Unit = js.native
    
    def getPorts(): js.Array[Any] = js.native
    
    var instanceId: String = js.native
    
    var keyCacheRange: Double = js.native
    
    var localAddress: String = js.native
    
    var localHost: String = js.native
    
    var localPort: Double = js.native
    
    var logDir: String = js.native
    
    def osRun(command: String, opt_wait: Boolean, opt_commandShow: String): Double = js.native
    
    var platform: String = js.native
    
    var processId: Double = js.native
    
    var programDir: String = js.native
    
    var progressMonitor: ProgressMonitor = js.native
    
    def restart(): Unit = js.native
    def restart(delay: Double): Unit = js.native
    
    var sessionManager: SessionManager = js.native
    
    def setKioskMode(kioskMode: Boolean): Unit = js.native
    
    var smallTempDir: String = js.native
    
    var startTime: js.Date = js.native
    
    var tempDir: String = js.native
    
    var version: String = js.native
    
    var versionInfo: VersionInfo = js.native
  }
  
  type ProgressMonitor = typings.nginstackEngine.libProgressProgressMonitorMod.^
  
  type SessionManager = typings.nginstackEngine.libSessionSessionManagerMod.^
  
  trait VersionInfo extends StObject {
    
    var companyName: String
    
    var fileVersion: String
    
    var legalCopyright: String
  }
  object VersionInfo {
    
    inline def apply(companyName: String, fileVersion: String, legalCopyright: String): VersionInfo = {
      val __obj = js.Dynamic.literal(companyName = companyName.asInstanceOf[js.Any], fileVersion = fileVersion.asInstanceOf[js.Any], legalCopyright = legalCopyright.asInstanceOf[js.Any])
      __obj.asInstanceOf[VersionInfo]
    }
    
    extension [Self <: VersionInfo](x: Self) {
      
      inline def setCompanyName(value: String): Self = StObject.set(x, "companyName", value.asInstanceOf[js.Any])
      
      inline def setFileVersion(value: String): Self = StObject.set(x, "fileVersion", value.asInstanceOf[js.Any])
      
      inline def setLegalCopyright(value: String): Self = StObject.set(x, "legalCopyright", value.asInstanceOf[js.Any])
    }
  }
}
