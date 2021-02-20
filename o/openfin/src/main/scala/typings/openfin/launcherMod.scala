package typings.openfin

import typings.node.childProcessMod.ChildProcess
import typings.openfin.wireMod.ConfigWithRuntime
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object launcherMod {
  
  @JSImport("openfin/_v2/launcher/launcher", JSImport.Default)
  @js.native
  class default () extends Launcher
  /* static members */
  object default {
    
    @JSImport("openfin/_v2/launcher/launcher", "default.IS_SUPPORTED")
    @js.native
    def IS_SUPPORTED(): Boolean = js.native
  }
  
  @js.native
  trait Launcher extends StObject {
    
    var Installer_Work_Dir: String = js.native
    
    var OpenFin_Installer: String = js.native
    
    var Security_Realm_Config_Key: String = js.native
    
    def launch(config: ConfigWithRuntime, manifestLocation: String, namedPipeName: String): js.Promise[ChildProcess] = js.native
    
    var macLaunch: js.Any = js.native
    
    var nixConfig: js.UndefOr[js.Any] = js.native
    
    var os: js.Any = js.native
    
    var winLaunch: js.Any = js.native
  }
  object Launcher {
    
    @scala.inline
    def apply(
      Installer_Work_Dir: String,
      OpenFin_Installer: String,
      Security_Realm_Config_Key: String,
      launch: (ConfigWithRuntime, String, String) => js.Promise[ChildProcess],
      macLaunch: js.Any,
      os: js.Any,
      winLaunch: js.Any
    ): Launcher = {
      val __obj = js.Dynamic.literal(Installer_Work_Dir = Installer_Work_Dir.asInstanceOf[js.Any], OpenFin_Installer = OpenFin_Installer.asInstanceOf[js.Any], Security_Realm_Config_Key = Security_Realm_Config_Key.asInstanceOf[js.Any], launch = js.Any.fromFunction3(launch), macLaunch = macLaunch.asInstanceOf[js.Any], os = os.asInstanceOf[js.Any], winLaunch = winLaunch.asInstanceOf[js.Any])
      __obj.asInstanceOf[Launcher]
    }
    
    @scala.inline
    implicit class LauncherMutableBuilder[Self <: Launcher] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInstaller_Work_Dir(value: String): Self = StObject.set(x, "Installer_Work_Dir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLaunch(value: (ConfigWithRuntime, String, String) => js.Promise[ChildProcess]): Self = StObject.set(x, "launch", js.Any.fromFunction3(value))
      
      @scala.inline
      def setMacLaunch(value: js.Any): Self = StObject.set(x, "macLaunch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNixConfig(value: js.Any): Self = StObject.set(x, "nixConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNixConfigUndefined: Self = StObject.set(x, "nixConfig", js.undefined)
      
      @scala.inline
      def setOpenFin_Installer(value: String): Self = StObject.set(x, "OpenFin_Installer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOs(value: js.Any): Self = StObject.set(x, "os", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecurity_Realm_Config_Key(value: String): Self = StObject.set(x, "Security_Realm_Config_Key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWinLaunch(value: js.Any): Self = StObject.set(x, "winLaunch", value.asInstanceOf[js.Any])
    }
  }
}
