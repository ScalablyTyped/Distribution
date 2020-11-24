package typings.msRestAzure.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MSIVmOptions extends MSIOptions {
  
  /**
    * @prop {number} [port] - port on which the MSI service is running on the host VM. Default port is 50342
    */
  var port: js.UndefOr[Double] = js.native
}
object MSIVmOptions {
  
  @scala.inline
  def apply(): MSIVmOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MSIVmOptions]
  }
  
  @scala.inline
  implicit class MSIVmOptionsOps[Self <: MSIVmOptions] (val x: Self) extends AnyVal {
    
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
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
  }
}
