package typings.maximMazurokGapiClientTesting.gapi.client.testing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IosTestSetup extends js.Object {
  
  /** iOS apps to install in addition to those being directly tested. */
  var additionalIpas: js.UndefOr[js.Array[FileReference]] = js.native
  
  /**
    * The network traffic profile used for running the test. Available network profiles can be queried by using the NETWORK_CONFIGURATION environment type when calling
    * TestEnvironmentDiscoveryService.GetTestEnvironmentCatalog.
    */
  var networkProfile: js.UndefOr[String] = js.native
  
  /**
    * List of directories on the device to upload to Cloud Storage at the end of the test. Directories should either be in a shared directory (e.g. /private/var/mobile/Media) or within an
    * accessible directory inside the app's filesystem (e.g. /Documents) by specifying the bundle id.
    */
  var pullDirectories: js.UndefOr[js.Array[IosDeviceFile]] = js.native
  
  /** List of files to push to the device before starting the test. */
  var pushFiles: js.UndefOr[js.Array[IosDeviceFile]] = js.native
}
object IosTestSetup {
  
  @scala.inline
  def apply(): IosTestSetup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IosTestSetup]
  }
  
  @scala.inline
  implicit class IosTestSetupOps[Self <: IosTestSetup] (val x: Self) extends AnyVal {
    
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
    def setAdditionalIpasVarargs(value: FileReference*): Self = this.set("additionalIpas", js.Array(value :_*))
    
    @scala.inline
    def setAdditionalIpas(value: js.Array[FileReference]): Self = this.set("additionalIpas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdditionalIpas: Self = this.set("additionalIpas", js.undefined)
    
    @scala.inline
    def setNetworkProfile(value: String): Self = this.set("networkProfile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworkProfile: Self = this.set("networkProfile", js.undefined)
    
    @scala.inline
    def setPullDirectoriesVarargs(value: IosDeviceFile*): Self = this.set("pullDirectories", js.Array(value :_*))
    
    @scala.inline
    def setPullDirectories(value: js.Array[IosDeviceFile]): Self = this.set("pullDirectories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePullDirectories: Self = this.set("pullDirectories", js.undefined)
    
    @scala.inline
    def setPushFilesVarargs(value: IosDeviceFile*): Self = this.set("pushFiles", js.Array(value :_*))
    
    @scala.inline
    def setPushFiles(value: js.Array[IosDeviceFile]): Self = this.set("pushFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePushFiles: Self = this.set("pushFiles", js.undefined)
  }
}
