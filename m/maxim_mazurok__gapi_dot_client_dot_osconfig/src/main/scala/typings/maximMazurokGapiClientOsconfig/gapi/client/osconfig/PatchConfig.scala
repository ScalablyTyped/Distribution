package typings.maximMazurokGapiClientOsconfig.gapi.client.osconfig

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PatchConfig extends js.Object {
  
  /** Apt update settings. Use this setting to override the default `apt` patch rules. */
  var apt: js.UndefOr[AptSettings] = js.native
  
  /** Goo update settings. Use this setting to override the default `goo` patch rules. */
  var goo: js.UndefOr[js.Any] = js.native
  
  /** The `ExecStep` to run after the patch update. */
  var postStep: js.UndefOr[ExecStep] = js.native
  
  /** The `ExecStep` to run before the patch update. */
  var preStep: js.UndefOr[ExecStep] = js.native
  
  /** Post-patch reboot settings. */
  var rebootConfig: js.UndefOr[String] = js.native
  
  /** Windows update settings. Use this override the default windows patch rules. */
  var windowsUpdate: js.UndefOr[WindowsUpdateSettings] = js.native
  
  /** Yum update settings. Use this setting to override the default `yum` patch rules. */
  var yum: js.UndefOr[YumSettings] = js.native
  
  /** Zypper update settings. Use this setting to override the default `zypper` patch rules. */
  var zypper: js.UndefOr[ZypperSettings] = js.native
}
object PatchConfig {
  
  @scala.inline
  def apply(): PatchConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PatchConfig]
  }
  
  @scala.inline
  implicit class PatchConfigOps[Self <: PatchConfig] (val x: Self) extends AnyVal {
    
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
    def setApt(value: AptSettings): Self = this.set("apt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApt: Self = this.set("apt", js.undefined)
    
    @scala.inline
    def setGoo(value: js.Any): Self = this.set("goo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGoo: Self = this.set("goo", js.undefined)
    
    @scala.inline
    def setPostStep(value: ExecStep): Self = this.set("postStep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePostStep: Self = this.set("postStep", js.undefined)
    
    @scala.inline
    def setPreStep(value: ExecStep): Self = this.set("preStep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreStep: Self = this.set("preStep", js.undefined)
    
    @scala.inline
    def setRebootConfig(value: String): Self = this.set("rebootConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRebootConfig: Self = this.set("rebootConfig", js.undefined)
    
    @scala.inline
    def setWindowsUpdate(value: WindowsUpdateSettings): Self = this.set("windowsUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWindowsUpdate: Self = this.set("windowsUpdate", js.undefined)
    
    @scala.inline
    def setYum(value: YumSettings): Self = this.set("yum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYum: Self = this.set("yum", js.undefined)
    
    @scala.inline
    def setZypper(value: ZypperSettings): Self = this.set("zypper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZypper: Self = this.set("zypper", js.undefined)
  }
}
