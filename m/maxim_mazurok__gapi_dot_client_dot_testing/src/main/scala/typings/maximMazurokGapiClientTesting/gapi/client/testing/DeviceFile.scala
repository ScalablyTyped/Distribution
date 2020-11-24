package typings.maximMazurokGapiClientTesting.gapi.client.testing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeviceFile extends js.Object {
  
  /** A reference to an opaque binary blob file. */
  var obbFile: js.UndefOr[ObbFile] = js.native
  
  /** A reference to a regular file. */
  var regularFile: js.UndefOr[RegularFile] = js.native
}
object DeviceFile {
  
  @scala.inline
  def apply(): DeviceFile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceFile]
  }
  
  @scala.inline
  implicit class DeviceFileOps[Self <: DeviceFile] (val x: Self) extends AnyVal {
    
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
    def setObbFile(value: ObbFile): Self = this.set("obbFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObbFile: Self = this.set("obbFile", js.undefined)
    
    @scala.inline
    def setRegularFile(value: RegularFile): Self = this.set("regularFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegularFile: Self = this.set("regularFile", js.undefined)
  }
}
