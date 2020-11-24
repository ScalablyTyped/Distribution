package typings.openfin.launcherMod

import typings.node.childProcessMod.ChildProcess
import typings.openfin.wireMod.ConfigWithRuntime
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Launcher extends js.Object {
  
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
  implicit class LauncherOps[Self <: Launcher] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setInstaller_Work_Dir(value: String): Self = this.set("Installer_Work_Dir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenFin_Installer(value: String): Self = this.set("OpenFin_Installer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurity_Realm_Config_Key(value: String): Self = this.set("Security_Realm_Config_Key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLaunch(value: (ConfigWithRuntime, String, String) => js.Promise[ChildProcess]): Self = this.set("launch", js.Any.fromFunction3(value))
    
    @scala.inline
    def setMacLaunch(value: js.Any): Self = this.set("macLaunch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOs(value: js.Any): Self = this.set("os", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWinLaunch(value: js.Any): Self = this.set("winLaunch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNixConfig(value: js.Any): Self = this.set("nixConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNixConfig: Self = this.set("nixConfig", js.undefined)
  }
}
