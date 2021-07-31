package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Win32LobApp
  extends StObject
     with MobileLobApp {
  
  // The Windows architecture(s) for which this app can run on. Possible values are: none, x86, x64, arm, neutral.
  var applicableArchitectures: js.UndefOr[WindowsArchitecture] = js.undefined
  
  // The command line to install this app
  var installCommandLine: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The install experience for this app.
  var installExperience: js.UndefOr[NullableOption[Win32LobAppInstallExperience]] = js.undefined
  
  // The value for the minimum CPU speed which is required to install this app.
  var minimumCpuSpeedInMHz: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // The value for the minimum free disk space which is required to install this app.
  var minimumFreeDiskSpaceInMB: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // The value for the minimum physical memory which is required to install this app.
  var minimumMemoryInMB: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // The value for the minimum number of processors which is required to install this app.
  var minimumNumberOfProcessors: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // The value for the minimum supported windows release.
  var minimumSupportedWindowsRelease: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The MSI details if this Win32 app is an MSI app.
  var msiInformation: js.UndefOr[NullableOption[Win32LobAppMsiInformation]] = js.undefined
  
  // The return codes for post installation behavior.
  var returnCodes: js.UndefOr[NullableOption[js.Array[Win32LobAppReturnCode]]] = js.undefined
  
  // The detection and requirement rules for this app.
  var rules: js.UndefOr[NullableOption[js.Array[Win32LobAppRule]]] = js.undefined
  
  // The relative path of the setup file in the encrypted Win32LobApp package.
  var setupFilePath: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The command line to uninstall this app
  var uninstallCommandLine: js.UndefOr[NullableOption[String]] = js.undefined
}
object Win32LobApp {
  
  @scala.inline
  def apply(): Win32LobApp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Win32LobApp]
  }
  
  @scala.inline
  implicit class Win32LobAppMutableBuilder[Self <: Win32LobApp] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicableArchitectures(value: WindowsArchitecture): Self = StObject.set(x, "applicableArchitectures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicableArchitecturesUndefined: Self = StObject.set(x, "applicableArchitectures", js.undefined)
    
    @scala.inline
    def setInstallCommandLine(value: NullableOption[String]): Self = StObject.set(x, "installCommandLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstallCommandLineNull: Self = StObject.set(x, "installCommandLine", null)
    
    @scala.inline
    def setInstallCommandLineUndefined: Self = StObject.set(x, "installCommandLine", js.undefined)
    
    @scala.inline
    def setInstallExperience(value: NullableOption[Win32LobAppInstallExperience]): Self = StObject.set(x, "installExperience", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstallExperienceNull: Self = StObject.set(x, "installExperience", null)
    
    @scala.inline
    def setInstallExperienceUndefined: Self = StObject.set(x, "installExperience", js.undefined)
    
    @scala.inline
    def setMinimumCpuSpeedInMHz(value: NullableOption[Double]): Self = StObject.set(x, "minimumCpuSpeedInMHz", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumCpuSpeedInMHzNull: Self = StObject.set(x, "minimumCpuSpeedInMHz", null)
    
    @scala.inline
    def setMinimumCpuSpeedInMHzUndefined: Self = StObject.set(x, "minimumCpuSpeedInMHz", js.undefined)
    
    @scala.inline
    def setMinimumFreeDiskSpaceInMB(value: NullableOption[Double]): Self = StObject.set(x, "minimumFreeDiskSpaceInMB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumFreeDiskSpaceInMBNull: Self = StObject.set(x, "minimumFreeDiskSpaceInMB", null)
    
    @scala.inline
    def setMinimumFreeDiskSpaceInMBUndefined: Self = StObject.set(x, "minimumFreeDiskSpaceInMB", js.undefined)
    
    @scala.inline
    def setMinimumMemoryInMB(value: NullableOption[Double]): Self = StObject.set(x, "minimumMemoryInMB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumMemoryInMBNull: Self = StObject.set(x, "minimumMemoryInMB", null)
    
    @scala.inline
    def setMinimumMemoryInMBUndefined: Self = StObject.set(x, "minimumMemoryInMB", js.undefined)
    
    @scala.inline
    def setMinimumNumberOfProcessors(value: NullableOption[Double]): Self = StObject.set(x, "minimumNumberOfProcessors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumNumberOfProcessorsNull: Self = StObject.set(x, "minimumNumberOfProcessors", null)
    
    @scala.inline
    def setMinimumNumberOfProcessorsUndefined: Self = StObject.set(x, "minimumNumberOfProcessors", js.undefined)
    
    @scala.inline
    def setMinimumSupportedWindowsRelease(value: NullableOption[String]): Self = StObject.set(x, "minimumSupportedWindowsRelease", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumSupportedWindowsReleaseNull: Self = StObject.set(x, "minimumSupportedWindowsRelease", null)
    
    @scala.inline
    def setMinimumSupportedWindowsReleaseUndefined: Self = StObject.set(x, "minimumSupportedWindowsRelease", js.undefined)
    
    @scala.inline
    def setMsiInformation(value: NullableOption[Win32LobAppMsiInformation]): Self = StObject.set(x, "msiInformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsiInformationNull: Self = StObject.set(x, "msiInformation", null)
    
    @scala.inline
    def setMsiInformationUndefined: Self = StObject.set(x, "msiInformation", js.undefined)
    
    @scala.inline
    def setReturnCodes(value: NullableOption[js.Array[Win32LobAppReturnCode]]): Self = StObject.set(x, "returnCodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnCodesNull: Self = StObject.set(x, "returnCodes", null)
    
    @scala.inline
    def setReturnCodesUndefined: Self = StObject.set(x, "returnCodes", js.undefined)
    
    @scala.inline
    def setReturnCodesVarargs(value: Win32LobAppReturnCode*): Self = StObject.set(x, "returnCodes", js.Array(value :_*))
    
    @scala.inline
    def setRules(value: NullableOption[js.Array[Win32LobAppRule]]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRulesNull: Self = StObject.set(x, "rules", null)
    
    @scala.inline
    def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
    
    @scala.inline
    def setRulesVarargs(value: Win32LobAppRule*): Self = StObject.set(x, "rules", js.Array(value :_*))
    
    @scala.inline
    def setSetupFilePath(value: NullableOption[String]): Self = StObject.set(x, "setupFilePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetupFilePathNull: Self = StObject.set(x, "setupFilePath", null)
    
    @scala.inline
    def setSetupFilePathUndefined: Self = StObject.set(x, "setupFilePath", js.undefined)
    
    @scala.inline
    def setUninstallCommandLine(value: NullableOption[String]): Self = StObject.set(x, "uninstallCommandLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUninstallCommandLineNull: Self = StObject.set(x, "uninstallCommandLine", null)
    
    @scala.inline
    def setUninstallCommandLineUndefined: Self = StObject.set(x, "uninstallCommandLine", js.undefined)
  }
}
