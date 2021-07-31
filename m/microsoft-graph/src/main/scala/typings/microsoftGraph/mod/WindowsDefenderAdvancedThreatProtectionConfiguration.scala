package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WindowsDefenderAdvancedThreatProtectionConfiguration
  extends StObject
     with DeviceConfiguration {
  
  // Windows Defender AdvancedThreatProtection 'Allow Sample Sharing' Rule
  var allowSampleSharing: js.UndefOr[Boolean] = js.undefined
  
  // Expedite Windows Defender Advanced Threat Protection telemetry reporting frequency.
  var enableExpeditedTelemetryReporting: js.UndefOr[Boolean] = js.undefined
}
object WindowsDefenderAdvancedThreatProtectionConfiguration {
  
  @scala.inline
  def apply(): WindowsDefenderAdvancedThreatProtectionConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WindowsDefenderAdvancedThreatProtectionConfiguration]
  }
  
  @scala.inline
  implicit class WindowsDefenderAdvancedThreatProtectionConfigurationMutableBuilder[Self <: WindowsDefenderAdvancedThreatProtectionConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowSampleSharing(value: Boolean): Self = StObject.set(x, "allowSampleSharing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowSampleSharingUndefined: Self = StObject.set(x, "allowSampleSharing", js.undefined)
    
    @scala.inline
    def setEnableExpeditedTelemetryReporting(value: Boolean): Self = StObject.set(x, "enableExpeditedTelemetryReporting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableExpeditedTelemetryReportingUndefined: Self = StObject.set(x, "enableExpeditedTelemetryReporting", js.undefined)
  }
}
