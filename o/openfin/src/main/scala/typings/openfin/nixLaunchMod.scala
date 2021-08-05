package typings.openfin

import typings.node.childProcessMod.ChildProcess
import typings.openfin.wireMod.ConfigWithRuntime
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nixLaunchMod {
  
  @JSImport("openfin/_v2/launcher/nix-launch", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(config: ConfigWithRuntime, osConfig: OsConfig): js.Promise[ChildProcess] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(config.asInstanceOf[js.Any], osConfig.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ChildProcess]]
  
  inline def download(version: String, folder: String, osConfig: OsConfig): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("download")(version.asInstanceOf[js.Any], folder.asInstanceOf[js.Any], osConfig.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  inline def getRuntimePath(version: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRuntimePath")(version.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  inline def getUrl(version: String, urlPath: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getUrl")(version.asInstanceOf[js.Any], urlPath.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def install(versionOrChannel: String, osConfig: OsConfig): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("install")(versionOrChannel.asInstanceOf[js.Any], osConfig.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  trait OsConfig extends StObject {
    
    var executablePath: String
    
    var manifestLocation: String
    
    var namedPipeName: String
    
    var urlPath: String
  }
  object OsConfig {
    
    inline def apply(executablePath: String, manifestLocation: String, namedPipeName: String, urlPath: String): OsConfig = {
      val __obj = js.Dynamic.literal(executablePath = executablePath.asInstanceOf[js.Any], manifestLocation = manifestLocation.asInstanceOf[js.Any], namedPipeName = namedPipeName.asInstanceOf[js.Any], urlPath = urlPath.asInstanceOf[js.Any])
      __obj.asInstanceOf[OsConfig]
    }
    
    extension [Self <: OsConfig](x: Self) {
      
      inline def setExecutablePath(value: String): Self = StObject.set(x, "executablePath", value.asInstanceOf[js.Any])
      
      inline def setManifestLocation(value: String): Self = StObject.set(x, "manifestLocation", value.asInstanceOf[js.Any])
      
      inline def setNamedPipeName(value: String): Self = StObject.set(x, "namedPipeName", value.asInstanceOf[js.Any])
      
      inline def setUrlPath(value: String): Self = StObject.set(x, "urlPath", value.asInstanceOf[js.Any])
    }
  }
}
