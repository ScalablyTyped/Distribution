package typings.maximMazurokGapiClientTesting.gapi.client.testing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IosDeviceFile extends js.Object {
  
  /** The bundle id of the app where this file lives. iOS apps sandbox their own filesystem, so app files must specify which app installed on the device. */
  var bundleId: js.UndefOr[String] = js.native
  
  /** The source file */
  var content: js.UndefOr[FileReference] = js.native
  
  /** Location of the file on the device, inside the app's sandboxed filesystem */
  var devicePath: js.UndefOr[String] = js.native
}
object IosDeviceFile {
  
  @scala.inline
  def apply(): IosDeviceFile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IosDeviceFile]
  }
  
  @scala.inline
  implicit class IosDeviceFileOps[Self <: IosDeviceFile] (val x: Self) extends AnyVal {
    
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
    def setBundleId(value: String): Self = this.set("bundleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBundleId: Self = this.set("bundleId", js.undefined)
    
    @scala.inline
    def setContent(value: FileReference): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    
    @scala.inline
    def setDevicePath(value: String): Self = this.set("devicePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDevicePath: Self = this.set("devicePath", js.undefined)
  }
}
