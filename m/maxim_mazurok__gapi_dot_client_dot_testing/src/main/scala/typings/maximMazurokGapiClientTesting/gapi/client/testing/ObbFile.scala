package typings.maximMazurokGapiClientTesting.gapi.client.testing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObbFile extends js.Object {
  
  /** Required. Opaque Binary Blob (OBB) file(s) to install on the device. */
  var obb: js.UndefOr[FileReference] = js.native
  
  /**
    * Required. OBB file name which must conform to the format as specified by Android e.g. [main|patch].0300110.com.example.android.obb which will be installed into \/Android/obb/\/ on
    * the device.
    */
  var obbFileName: js.UndefOr[String] = js.native
}
object ObbFile {
  
  @scala.inline
  def apply(): ObbFile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObbFile]
  }
  
  @scala.inline
  implicit class ObbFileOps[Self <: ObbFile] (val x: Self) extends AnyVal {
    
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
    def setObb(value: FileReference): Self = this.set("obb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObb: Self = this.set("obb", js.undefined)
    
    @scala.inline
    def setObbFileName(value: String): Self = this.set("obbFileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObbFileName: Self = this.set("obbFileName", js.undefined)
  }
}
