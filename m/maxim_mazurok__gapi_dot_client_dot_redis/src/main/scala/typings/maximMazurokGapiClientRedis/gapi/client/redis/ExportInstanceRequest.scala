package typings.maximMazurokGapiClientRedis.gapi.client.redis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExportInstanceRequest extends js.Object {
  
  /** Required. Specify data to be exported. */
  var outputConfig: js.UndefOr[OutputConfig] = js.native
}
object ExportInstanceRequest {
  
  @scala.inline
  def apply(): ExportInstanceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportInstanceRequest]
  }
  
  @scala.inline
  implicit class ExportInstanceRequestOps[Self <: ExportInstanceRequest] (val x: Self) extends AnyVal {
    
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
    def setOutputConfig(value: OutputConfig): Self = this.set("outputConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputConfig: Self = this.set("outputConfig", js.undefined)
  }
}
