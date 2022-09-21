package typings.maximMazurokGapiClientOsconfig.gapi.client.osconfig

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PatchConfig extends StObject {
  
  /** Apt update settings. Use this setting to override the default `apt` patch rules. */
  var apt: js.UndefOr[AptSettings] = js.undefined
  
  /** Goo update settings. Use this setting to override the default `goo` patch rules. */
  var goo: js.UndefOr[Any] = js.undefined
  
  /** Allows the patch job to run on Managed instance groups (MIGs). */
  var migInstancesAllowed: js.UndefOr[Boolean] = js.undefined
  
  /** The `ExecStep` to run after the patch update. */
  var postStep: js.UndefOr[ExecStep] = js.undefined
  
  /** The `ExecStep` to run before the patch update. */
  var preStep: js.UndefOr[ExecStep] = js.undefined
  
  /** Post-patch reboot settings. */
  var rebootConfig: js.UndefOr[String] = js.undefined
  
  /** Windows update settings. Use this override the default windows patch rules. */
  var windowsUpdate: js.UndefOr[WindowsUpdateSettings] = js.undefined
  
  /** Yum update settings. Use this setting to override the default `yum` patch rules. */
  var yum: js.UndefOr[YumSettings] = js.undefined
  
  /** Zypper update settings. Use this setting to override the default `zypper` patch rules. */
  var zypper: js.UndefOr[ZypperSettings] = js.undefined
}
object PatchConfig {
  
  inline def apply(): PatchConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PatchConfig]
  }
  
  extension [Self <: PatchConfig](x: Self) {
    
    inline def setApt(value: AptSettings): Self = StObject.set(x, "apt", value.asInstanceOf[js.Any])
    
    inline def setAptUndefined: Self = StObject.set(x, "apt", js.undefined)
    
    inline def setGoo(value: Any): Self = StObject.set(x, "goo", value.asInstanceOf[js.Any])
    
    inline def setGooUndefined: Self = StObject.set(x, "goo", js.undefined)
    
    inline def setMigInstancesAllowed(value: Boolean): Self = StObject.set(x, "migInstancesAllowed", value.asInstanceOf[js.Any])
    
    inline def setMigInstancesAllowedUndefined: Self = StObject.set(x, "migInstancesAllowed", js.undefined)
    
    inline def setPostStep(value: ExecStep): Self = StObject.set(x, "postStep", value.asInstanceOf[js.Any])
    
    inline def setPostStepUndefined: Self = StObject.set(x, "postStep", js.undefined)
    
    inline def setPreStep(value: ExecStep): Self = StObject.set(x, "preStep", value.asInstanceOf[js.Any])
    
    inline def setPreStepUndefined: Self = StObject.set(x, "preStep", js.undefined)
    
    inline def setRebootConfig(value: String): Self = StObject.set(x, "rebootConfig", value.asInstanceOf[js.Any])
    
    inline def setRebootConfigUndefined: Self = StObject.set(x, "rebootConfig", js.undefined)
    
    inline def setWindowsUpdate(value: WindowsUpdateSettings): Self = StObject.set(x, "windowsUpdate", value.asInstanceOf[js.Any])
    
    inline def setWindowsUpdateUndefined: Self = StObject.set(x, "windowsUpdate", js.undefined)
    
    inline def setYum(value: YumSettings): Self = StObject.set(x, "yum", value.asInstanceOf[js.Any])
    
    inline def setYumUndefined: Self = StObject.set(x, "yum", js.undefined)
    
    inline def setZypper(value: ZypperSettings): Self = StObject.set(x, "zypper", value.asInstanceOf[js.Any])
    
    inline def setZypperUndefined: Self = StObject.set(x, "zypper", js.undefined)
  }
}
