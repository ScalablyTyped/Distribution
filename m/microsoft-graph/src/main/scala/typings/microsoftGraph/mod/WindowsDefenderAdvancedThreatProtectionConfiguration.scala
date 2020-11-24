package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WindowsDefenderAdvancedThreatProtectionConfiguration extends DeviceConfiguration {
  
  // Windows Defender AdvancedThreatProtection 'Allow Sample Sharing' Rule
  var allowSampleSharing: js.UndefOr[Boolean] = js.native
  
  // Expedite Windows Defender Advanced Threat Protection telemetry reporting frequency.
  var enableExpeditedTelemetryReporting: js.UndefOr[Boolean] = js.native
}
object WindowsDefenderAdvancedThreatProtectionConfiguration {
  
  @scala.inline
  def apply(): WindowsDefenderAdvancedThreatProtectionConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WindowsDefenderAdvancedThreatProtectionConfiguration]
  }
  
  @scala.inline
  implicit class WindowsDefenderAdvancedThreatProtectionConfigurationOps[Self <: WindowsDefenderAdvancedThreatProtectionConfiguration] (val x: Self) extends AnyVal {
    
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
    def setAllowSampleSharing(value: Boolean): Self = this.set("allowSampleSharing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowSampleSharing: Self = this.set("allowSampleSharing", js.undefined)
    
    @scala.inline
    def setEnableExpeditedTelemetryReporting(value: Boolean): Self = this.set("enableExpeditedTelemetryReporting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableExpeditedTelemetryReporting: Self = this.set("enableExpeditedTelemetryReporting", js.undefined)
  }
}
