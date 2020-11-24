package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Win32LobApp extends MobileLobApp {
  
  // The Windows architecture(s) for which this app can run on. Possible values are: none, x86, x64, arm, neutral.
  var applicableArchitectures: js.UndefOr[WindowsArchitecture] = js.native
  
  // The command line to install this app
  var installCommandLine: js.UndefOr[NullableOption[String]] = js.native
  
  // The install experience for this app.
  var installExperience: js.UndefOr[NullableOption[Win32LobAppInstallExperience]] = js.native
  
  // The value for the minimum CPU speed which is required to install this app.
  var minimumCpuSpeedInMHz: js.UndefOr[NullableOption[Double]] = js.native
  
  // The value for the minimum free disk space which is required to install this app.
  var minimumFreeDiskSpaceInMB: js.UndefOr[NullableOption[Double]] = js.native
  
  // The value for the minimum physical memory which is required to install this app.
  var minimumMemoryInMB: js.UndefOr[NullableOption[Double]] = js.native
  
  // The value for the minimum number of processors which is required to install this app.
  var minimumNumberOfProcessors: js.UndefOr[NullableOption[Double]] = js.native
  
  // The value for the minimum supported windows release.
  var minimumSupportedWindowsRelease: js.UndefOr[NullableOption[String]] = js.native
  
  // The MSI details if this Win32 app is an MSI app.
  var msiInformation: js.UndefOr[NullableOption[Win32LobAppMsiInformation]] = js.native
  
  // The return codes for post installation behavior.
  var returnCodes: js.UndefOr[NullableOption[js.Array[Win32LobAppReturnCode]]] = js.native
  
  // The detection and requirement rules for this app.
  var rules: js.UndefOr[NullableOption[js.Array[Win32LobAppRule]]] = js.native
  
  // The relative path of the setup file in the encrypted Win32LobApp package.
  var setupFilePath: js.UndefOr[NullableOption[String]] = js.native
  
  // The command line to uninstall this app
  var uninstallCommandLine: js.UndefOr[NullableOption[String]] = js.native
}
object Win32LobApp {
  
  @scala.inline
  def apply(): Win32LobApp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Win32LobApp]
  }
  
  @scala.inline
  implicit class Win32LobAppOps[Self <: Win32LobApp] (val x: Self) extends AnyVal {
    
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
    def setApplicableArchitectures(value: WindowsArchitecture): Self = this.set("applicableArchitectures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApplicableArchitectures: Self = this.set("applicableArchitectures", js.undefined)
    
    @scala.inline
    def setInstallCommandLine(value: NullableOption[String]): Self = this.set("installCommandLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstallCommandLine: Self = this.set("installCommandLine", js.undefined)
    
    @scala.inline
    def setInstallCommandLineNull: Self = this.set("installCommandLine", null)
    
    @scala.inline
    def setInstallExperience(value: NullableOption[Win32LobAppInstallExperience]): Self = this.set("installExperience", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstallExperience: Self = this.set("installExperience", js.undefined)
    
    @scala.inline
    def setInstallExperienceNull: Self = this.set("installExperience", null)
    
    @scala.inline
    def setMinimumCpuSpeedInMHz(value: NullableOption[Double]): Self = this.set("minimumCpuSpeedInMHz", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinimumCpuSpeedInMHz: Self = this.set("minimumCpuSpeedInMHz", js.undefined)
    
    @scala.inline
    def setMinimumCpuSpeedInMHzNull: Self = this.set("minimumCpuSpeedInMHz", null)
    
    @scala.inline
    def setMinimumFreeDiskSpaceInMB(value: NullableOption[Double]): Self = this.set("minimumFreeDiskSpaceInMB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinimumFreeDiskSpaceInMB: Self = this.set("minimumFreeDiskSpaceInMB", js.undefined)
    
    @scala.inline
    def setMinimumFreeDiskSpaceInMBNull: Self = this.set("minimumFreeDiskSpaceInMB", null)
    
    @scala.inline
    def setMinimumMemoryInMB(value: NullableOption[Double]): Self = this.set("minimumMemoryInMB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinimumMemoryInMB: Self = this.set("minimumMemoryInMB", js.undefined)
    
    @scala.inline
    def setMinimumMemoryInMBNull: Self = this.set("minimumMemoryInMB", null)
    
    @scala.inline
    def setMinimumNumberOfProcessors(value: NullableOption[Double]): Self = this.set("minimumNumberOfProcessors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinimumNumberOfProcessors: Self = this.set("minimumNumberOfProcessors", js.undefined)
    
    @scala.inline
    def setMinimumNumberOfProcessorsNull: Self = this.set("minimumNumberOfProcessors", null)
    
    @scala.inline
    def setMinimumSupportedWindowsRelease(value: NullableOption[String]): Self = this.set("minimumSupportedWindowsRelease", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinimumSupportedWindowsRelease: Self = this.set("minimumSupportedWindowsRelease", js.undefined)
    
    @scala.inline
    def setMinimumSupportedWindowsReleaseNull: Self = this.set("minimumSupportedWindowsRelease", null)
    
    @scala.inline
    def setMsiInformation(value: NullableOption[Win32LobAppMsiInformation]): Self = this.set("msiInformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMsiInformation: Self = this.set("msiInformation", js.undefined)
    
    @scala.inline
    def setMsiInformationNull: Self = this.set("msiInformation", null)
    
    @scala.inline
    def setReturnCodesVarargs(value: Win32LobAppReturnCode*): Self = this.set("returnCodes", js.Array(value :_*))
    
    @scala.inline
    def setReturnCodes(value: NullableOption[js.Array[Win32LobAppReturnCode]]): Self = this.set("returnCodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReturnCodes: Self = this.set("returnCodes", js.undefined)
    
    @scala.inline
    def setReturnCodesNull: Self = this.set("returnCodes", null)
    
    @scala.inline
    def setRulesVarargs(value: Win32LobAppRule*): Self = this.set("rules", js.Array(value :_*))
    
    @scala.inline
    def setRules(value: NullableOption[js.Array[Win32LobAppRule]]): Self = this.set("rules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRules: Self = this.set("rules", js.undefined)
    
    @scala.inline
    def setRulesNull: Self = this.set("rules", null)
    
    @scala.inline
    def setSetupFilePath(value: NullableOption[String]): Self = this.set("setupFilePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSetupFilePath: Self = this.set("setupFilePath", js.undefined)
    
    @scala.inline
    def setSetupFilePathNull: Self = this.set("setupFilePath", null)
    
    @scala.inline
    def setUninstallCommandLine(value: NullableOption[String]): Self = this.set("uninstallCommandLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUninstallCommandLine: Self = this.set("uninstallCommandLine", js.undefined)
    
    @scala.inline
    def setUninstallCommandLineNull: Self = this.set("uninstallCommandLine", null)
  }
}
