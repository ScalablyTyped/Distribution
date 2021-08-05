package typings.openfin

import typings.node.childProcessMod.ChildProcess
import typings.openfin.wireMod.ConfigWithRuntime
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object launcherMod {
  
  @JSImport("openfin/_v2/launcher/launcher", JSImport.Default)
  @js.native
  class default ()
    extends StObject
       with Launcher {
    
    /* CompleteClass */
    var Installer_Work_Dir: String = js.native
    
    /* CompleteClass */
    var OpenFin_Installer: String = js.native
    
    /* CompleteClass */
    var Security_Realm_Config_Key: String = js.native
    
    /* CompleteClass */
    override def launch(config: ConfigWithRuntime, manifestLocation: String, namedPipeName: String): js.Promise[ChildProcess] = js.native
    
    /* private */ /* CompleteClass */
    var macLaunch: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var os: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var winLaunch: js.Any = js.native
  }
  /* static members */
  object default {
    
    @JSImport("openfin/_v2/launcher/launcher", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def IS_SUPPORTED(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("IS_SUPPORTED")().asInstanceOf[Boolean]
  }
  
  trait Launcher extends StObject {
    
    var Installer_Work_Dir: String
    
    var OpenFin_Installer: String
    
    var Security_Realm_Config_Key: String
    
    def launch(config: ConfigWithRuntime, manifestLocation: String, namedPipeName: String): js.Promise[ChildProcess]
    
    /* private */ var macLaunch: js.Any
    
    var nixConfig: js.UndefOr[js.Any] = js.undefined
    
    /* private */ var os: js.Any
    
    /* private */ var winLaunch: js.Any
  }
  object Launcher {
    
    inline def apply(
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
    
    extension [Self <: Launcher](x: Self) {
      
      inline def setInstaller_Work_Dir(value: String): Self = StObject.set(x, "Installer_Work_Dir", value.asInstanceOf[js.Any])
      
      inline def setLaunch(value: (ConfigWithRuntime, String, String) => js.Promise[ChildProcess]): Self = StObject.set(x, "launch", js.Any.fromFunction3(value))
      
      inline def setMacLaunch(value: js.Any): Self = StObject.set(x, "macLaunch", value.asInstanceOf[js.Any])
      
      inline def setNixConfig(value: js.Any): Self = StObject.set(x, "nixConfig", value.asInstanceOf[js.Any])
      
      inline def setNixConfigUndefined: Self = StObject.set(x, "nixConfig", js.undefined)
      
      inline def setOpenFin_Installer(value: String): Self = StObject.set(x, "OpenFin_Installer", value.asInstanceOf[js.Any])
      
      inline def setOs(value: js.Any): Self = StObject.set(x, "os", value.asInstanceOf[js.Any])
      
      inline def setSecurity_Realm_Config_Key(value: String): Self = StObject.set(x, "Security_Realm_Config_Key", value.asInstanceOf[js.Any])
      
      inline def setWinLaunch(value: js.Any): Self = StObject.set(x, "winLaunch", value.asInstanceOf[js.Any])
    }
  }
}
