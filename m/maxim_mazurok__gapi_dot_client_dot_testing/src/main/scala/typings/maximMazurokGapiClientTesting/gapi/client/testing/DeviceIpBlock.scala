package typings.maximMazurokGapiClientTesting.gapi.client.testing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeviceIpBlock extends js.Object {
  
  /** The date this block was added to Firebase Test Lab */
  var addedDate: js.UndefOr[Date] = js.native
  
  /** An IP address block in CIDR notation eg: 34.68.194.64/29 */
  var block: js.UndefOr[String] = js.native
  
  /** Whether this block is used by physical or virtual devices */
  var form: js.UndefOr[String] = js.native
}
object DeviceIpBlock {
  
  @scala.inline
  def apply(): DeviceIpBlock = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceIpBlock]
  }
  
  @scala.inline
  implicit class DeviceIpBlockOps[Self <: DeviceIpBlock] (val x: Self) extends AnyVal {
    
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
    def setAddedDate(value: Date): Self = this.set("addedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddedDate: Self = this.set("addedDate", js.undefined)
    
    @scala.inline
    def setBlock(value: String): Self = this.set("block", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlock: Self = this.set("block", js.undefined)
    
    @scala.inline
    def setForm(value: String): Self = this.set("form", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForm: Self = this.set("form", js.undefined)
  }
}
