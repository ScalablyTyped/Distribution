package typings.maximMazurokGapiClientVision.gapi.client.vision

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImportProductSetsRequest extends js.Object {
  
  /** Required. The input content for the list of requests. */
  var inputConfig: js.UndefOr[ImportProductSetsInputConfig] = js.native
}
object ImportProductSetsRequest {
  
  @scala.inline
  def apply(): ImportProductSetsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImportProductSetsRequest]
  }
  
  @scala.inline
  implicit class ImportProductSetsRequestOps[Self <: ImportProductSetsRequest] (val x: Self) extends AnyVal {
    
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
    def setInputConfig(value: ImportProductSetsInputConfig): Self = this.set("inputConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputConfig: Self = this.set("inputConfig", js.undefined)
  }
}
