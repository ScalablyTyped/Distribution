package typings.maximMazurokGapiClientNotebooks.gapi.client.notebooks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AcceleratorConfig extends js.Object {
  
  /** Count of cores of this accelerator. */
  var coreCount: js.UndefOr[String] = js.native
  
  /** Type of this accelerator. */
  var `type`: js.UndefOr[String] = js.native
}
object AcceleratorConfig {
  
  @scala.inline
  def apply(): AcceleratorConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AcceleratorConfig]
  }
  
  @scala.inline
  implicit class AcceleratorConfigOps[Self <: AcceleratorConfig] (val x: Self) extends AnyVal {
    
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
    def setCoreCount(value: String): Self = this.set("coreCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCoreCount: Self = this.set("coreCount", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
