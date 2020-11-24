package typings.maximMazurokGapiClientTesting.gapi.client.testing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeviceIpBlockCatalog extends js.Object {
  
  /** The device IP blocks used by Firebase Test Lab */
  var ipBlocks: js.UndefOr[js.Array[DeviceIpBlock]] = js.native
}
object DeviceIpBlockCatalog {
  
  @scala.inline
  def apply(): DeviceIpBlockCatalog = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceIpBlockCatalog]
  }
  
  @scala.inline
  implicit class DeviceIpBlockCatalogOps[Self <: DeviceIpBlockCatalog] (val x: Self) extends AnyVal {
    
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
    def setIpBlocksVarargs(value: DeviceIpBlock*): Self = this.set("ipBlocks", js.Array(value :_*))
    
    @scala.inline
    def setIpBlocks(value: js.Array[DeviceIpBlock]): Self = this.set("ipBlocks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIpBlocks: Self = this.set("ipBlocks", js.undefined)
  }
}
