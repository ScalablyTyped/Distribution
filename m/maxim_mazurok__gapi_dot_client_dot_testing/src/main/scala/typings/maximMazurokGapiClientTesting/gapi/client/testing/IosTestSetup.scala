package typings.maximMazurokGapiClientTesting.gapi.client.testing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IosTestSetup extends StObject {
  
  /** iOS apps to install in addition to those being directly tested. */
  var additionalIpas: js.UndefOr[js.Array[FileReference]] = js.undefined
  
  /**
    * The network traffic profile used for running the test. Available network profiles can be queried by using the NETWORK_CONFIGURATION environment type when calling
    * TestEnvironmentDiscoveryService.GetTestEnvironmentCatalog.
    */
  var networkProfile: js.UndefOr[String] = js.undefined
  
  /**
    * List of directories on the device to upload to Cloud Storage at the end of the test. Directories should either be in a shared directory (e.g. /private/var/mobile/Media) or within an
    * accessible directory inside the app's filesystem (e.g. /Documents) by specifying the bundle id.
    */
  var pullDirectories: js.UndefOr[js.Array[IosDeviceFile]] = js.undefined
  
  /** List of files to push to the device before starting the test. */
  var pushFiles: js.UndefOr[js.Array[IosDeviceFile]] = js.undefined
}
object IosTestSetup {
  
  @scala.inline
  def apply(): IosTestSetup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IosTestSetup]
  }
  
  @scala.inline
  implicit class IosTestSetupMutableBuilder[Self <: IosTestSetup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdditionalIpas(value: js.Array[FileReference]): Self = StObject.set(x, "additionalIpas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionalIpasUndefined: Self = StObject.set(x, "additionalIpas", js.undefined)
    
    @scala.inline
    def setAdditionalIpasVarargs(value: FileReference*): Self = StObject.set(x, "additionalIpas", js.Array(value :_*))
    
    @scala.inline
    def setNetworkProfile(value: String): Self = StObject.set(x, "networkProfile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkProfileUndefined: Self = StObject.set(x, "networkProfile", js.undefined)
    
    @scala.inline
    def setPullDirectories(value: js.Array[IosDeviceFile]): Self = StObject.set(x, "pullDirectories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPullDirectoriesUndefined: Self = StObject.set(x, "pullDirectories", js.undefined)
    
    @scala.inline
    def setPullDirectoriesVarargs(value: IosDeviceFile*): Self = StObject.set(x, "pullDirectories", js.Array(value :_*))
    
    @scala.inline
    def setPushFiles(value: js.Array[IosDeviceFile]): Self = StObject.set(x, "pushFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPushFilesUndefined: Self = StObject.set(x, "pushFiles", js.undefined)
    
    @scala.inline
    def setPushFilesVarargs(value: IosDeviceFile*): Self = StObject.set(x, "pushFiles", js.Array(value :_*))
  }
}
