package typings.openfin

import typings.node.childProcessMod.ChildProcess
import typings.openfin.wireMod.ConfigWithRuntime
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nixLaunchMod {
  
  @JSImport("openfin/_v2/launcher/nix-launch", JSImport.Default)
  @js.native
  def default(config: ConfigWithRuntime, osConfig: OsConfig): js.Promise[ChildProcess] = js.native
  
  @JSImport("openfin/_v2/launcher/nix-launch", "download")
  @js.native
  def download(version: String, folder: String, osConfig: OsConfig): js.Promise[String] = js.native
  
  @JSImport("openfin/_v2/launcher/nix-launch", "getRuntimePath")
  @js.native
  def getRuntimePath(version: String): js.Promise[String] = js.native
  
  @JSImport("openfin/_v2/launcher/nix-launch", "getUrl")
  @js.native
  def getUrl(version: String, urlPath: String): String = js.native
  
  @JSImport("openfin/_v2/launcher/nix-launch", "install")
  @js.native
  def install(versionOrChannel: String, osConfig: OsConfig): js.Promise[String] = js.native
  
  @js.native
  trait OsConfig extends StObject {
    
    var executablePath: String = js.native
    
    var manifestLocation: String = js.native
    
    var namedPipeName: String = js.native
    
    var urlPath: String = js.native
  }
  object OsConfig {
    
    @scala.inline
    def apply(executablePath: String, manifestLocation: String, namedPipeName: String, urlPath: String): OsConfig = {
      val __obj = js.Dynamic.literal(executablePath = executablePath.asInstanceOf[js.Any], manifestLocation = manifestLocation.asInstanceOf[js.Any], namedPipeName = namedPipeName.asInstanceOf[js.Any], urlPath = urlPath.asInstanceOf[js.Any])
      __obj.asInstanceOf[OsConfig]
    }
    
    @scala.inline
    implicit class OsConfigMutableBuilder[Self <: OsConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExecutablePath(value: String): Self = StObject.set(x, "executablePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setManifestLocation(value: String): Self = StObject.set(x, "manifestLocation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamedPipeName(value: String): Self = StObject.set(x, "namedPipeName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlPath(value: String): Self = StObject.set(x, "urlPath", value.asInstanceOf[js.Any])
    }
  }
}
