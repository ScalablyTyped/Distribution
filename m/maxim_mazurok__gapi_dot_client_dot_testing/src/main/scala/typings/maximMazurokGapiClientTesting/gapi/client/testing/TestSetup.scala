package typings.maximMazurokGapiClientTesting.gapi.client.testing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestSetup extends StObject {
  
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
  implicit class TestSetupMutableBuilder[Self <: TestSetup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccount(value: Account): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountUndefined: Self = StObject.set(x, "account", js.undefined)
    
    @scala.inline
    def setAdditionalApks(value: js.Array[Apk]): Self = StObject.set(x, "additionalApks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionalApksUndefined: Self = StObject.set(x, "additionalApks", js.undefined)
    
    @scala.inline
    def setAdditionalApksVarargs(value: Apk*): Self = StObject.set(x, "additionalApks", js.Array(value :_*))
    
    @scala.inline
    def setDirectoriesToPull(value: js.Array[String]): Self = StObject.set(x, "directoriesToPull", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectoriesToPullUndefined: Self = StObject.set(x, "directoriesToPull", js.undefined)
    
    @scala.inline
    def setDirectoriesToPullVarargs(value: String*): Self = StObject.set(x, "directoriesToPull", js.Array(value :_*))
    
    @scala.inline
    def setDontAutograntPermissions(value: Boolean): Self = StObject.set(x, "dontAutograntPermissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDontAutograntPermissionsUndefined: Self = StObject.set(x, "dontAutograntPermissions", js.undefined)
    
    @scala.inline
    def setEnvironmentVariables(value: js.Array[EnvironmentVariable]): Self = StObject.set(x, "environmentVariables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironmentVariablesUndefined: Self = StObject.set(x, "environmentVariables", js.undefined)
    
    @scala.inline
    def setEnvironmentVariablesVarargs(value: EnvironmentVariable*): Self = StObject.set(x, "environmentVariables", js.Array(value :_*))
    
    @scala.inline
    def setFilesToPush(value: js.Array[DeviceFile]): Self = StObject.set(x, "filesToPush", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilesToPushUndefined: Self = StObject.set(x, "filesToPush", js.undefined)
    
    @scala.inline
    def setFilesToPushVarargs(value: DeviceFile*): Self = StObject.set(x, "filesToPush", js.Array(value :_*))
    
    @scala.inline
    def setNetworkProfile(value: String): Self = StObject.set(x, "networkProfile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkProfileUndefined: Self = StObject.set(x, "networkProfile", js.undefined)
    
    @scala.inline
    def setSystrace(value: SystraceSetup): Self = StObject.set(x, "systrace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystraceUndefined: Self = StObject.set(x, "systrace", js.undefined)
  }
}
