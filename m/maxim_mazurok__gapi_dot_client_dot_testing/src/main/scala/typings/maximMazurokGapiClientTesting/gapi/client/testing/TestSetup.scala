package typings.maximMazurokGapiClientTesting.gapi.client.testing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestSetup extends js.Object {
  
  /** The device will be logged in on this account for the duration of the test. */
  var account: js.UndefOr[Account] = js.native
  
  /** APKs to install in addition to those being directly tested. Currently capped at 100. */
  var additionalApks: js.UndefOr[js.Array[Apk]] = js.native
  
  /**
    * List of directories on the device to upload to GCS at the end of the test; they must be absolute paths under /sdcard, /storage or /data/local/tmp. Path names are restricted to
    * characters a-z A-Z 0-9 _ - . + and / Note: The paths /sdcard and /data will be made available and treated as implicit path substitutions. E.g. if /sdcard on a particular device does
    * not map to external storage, the system will replace it with the external storage path prefix for that device.
    */
  var directoriesToPull: js.UndefOr[js.Array[String]] = js.native
  
  /** Whether to prevent all runtime permissions to be granted at app install */
  var dontAutograntPermissions: js.UndefOr[Boolean] = js.native
  
  /** Environment variables to set for the test (only applicable for instrumentation tests). */
  var environmentVariables: js.UndefOr[js.Array[EnvironmentVariable]] = js.native
  
  /** List of files to push to the device before starting the test. */
  var filesToPush: js.UndefOr[js.Array[DeviceFile]] = js.native
  
  /**
    * The network traffic profile used for running the test. Available network profiles can be queried by using the NETWORK_CONFIGURATION environment type when calling
    * TestEnvironmentDiscoveryService.GetTestEnvironmentCatalog.
    */
  var networkProfile: js.UndefOr[String] = js.native
  
  /**
    * Systrace configuration for the run. If set a systrace will be taken, starting on test start and lasting for the configured duration. The systrace file thus obtained is put in the
    * results bucket together with the other artifacts from the run.
    */
  var systrace: js.UndefOr[SystraceSetup] = js.native
}
object TestSetup {
  
  @scala.inline
  def apply(): TestSetup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestSetup]
  }
  
  @scala.inline
  implicit class TestSetupOps[Self <: TestSetup] (val x: Self) extends AnyVal {
    
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
    def setAccount(value: Account): Self = this.set("account", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccount: Self = this.set("account", js.undefined)
    
    @scala.inline
    def setAdditionalApksVarargs(value: Apk*): Self = this.set("additionalApks", js.Array(value :_*))
    
    @scala.inline
    def setAdditionalApks(value: js.Array[Apk]): Self = this.set("additionalApks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdditionalApks: Self = this.set("additionalApks", js.undefined)
    
    @scala.inline
    def setDirectoriesToPullVarargs(value: String*): Self = this.set("directoriesToPull", js.Array(value :_*))
    
    @scala.inline
    def setDirectoriesToPull(value: js.Array[String]): Self = this.set("directoriesToPull", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirectoriesToPull: Self = this.set("directoriesToPull", js.undefined)
    
    @scala.inline
    def setDontAutograntPermissions(value: Boolean): Self = this.set("dontAutograntPermissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDontAutograntPermissions: Self = this.set("dontAutograntPermissions", js.undefined)
    
    @scala.inline
    def setEnvironmentVariablesVarargs(value: EnvironmentVariable*): Self = this.set("environmentVariables", js.Array(value :_*))
    
    @scala.inline
    def setEnvironmentVariables(value: js.Array[EnvironmentVariable]): Self = this.set("environmentVariables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnvironmentVariables: Self = this.set("environmentVariables", js.undefined)
    
    @scala.inline
    def setFilesToPushVarargs(value: DeviceFile*): Self = this.set("filesToPush", js.Array(value :_*))
    
    @scala.inline
    def setFilesToPush(value: js.Array[DeviceFile]): Self = this.set("filesToPush", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilesToPush: Self = this.set("filesToPush", js.undefined)
    
    @scala.inline
    def setNetworkProfile(value: String): Self = this.set("networkProfile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworkProfile: Self = this.set("networkProfile", js.undefined)
    
    @scala.inline
    def setSystrace(value: SystraceSetup): Self = this.set("systrace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSystrace: Self = this.set("systrace", js.undefined)
  }
}
