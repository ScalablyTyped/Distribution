package typings.maximMazurokGapiClientOsconfig.gapi.client.osconfig

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PatchConfig extends StObject {
  
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
  implicit class PatchConfigMutableBuilder[Self <: PatchConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApt(value: AptSettings): Self = StObject.set(x, "apt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAptUndefined: Self = StObject.set(x, "apt", js.undefined)
    
    @scala.inline
    def setGoo(value: js.Any): Self = StObject.set(x, "goo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGooUndefined: Self = StObject.set(x, "goo", js.undefined)
    
    @scala.inline
    def setPostStep(value: ExecStep): Self = StObject.set(x, "postStep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostStepUndefined: Self = StObject.set(x, "postStep", js.undefined)
    
    @scala.inline
    def setPreStep(value: ExecStep): Self = StObject.set(x, "preStep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreStepUndefined: Self = StObject.set(x, "preStep", js.undefined)
    
    @scala.inline
    def setRebootConfig(value: String): Self = StObject.set(x, "rebootConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRebootConfigUndefined: Self = StObject.set(x, "rebootConfig", js.undefined)
    
    @scala.inline
    def setWindowsUpdate(value: WindowsUpdateSettings): Self = StObject.set(x, "windowsUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowsUpdateUndefined: Self = StObject.set(x, "windowsUpdate", js.undefined)
    
    @scala.inline
    def setYum(value: YumSettings): Self = StObject.set(x, "yum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYumUndefined: Self = StObject.set(x, "yum", js.undefined)
    
    @scala.inline
    def setZypper(value: ZypperSettings): Self = StObject.set(x, "zypper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZypperUndefined: Self = StObject.set(x, "zypper", js.undefined)
  }
}
