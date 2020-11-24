package typings.maximMazurokGapiClientVision.gapi.client.vision

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AsyncBatchAnnotateImagesResponse extends js.Object {
  
  /** The output location and metadata from AsyncBatchAnnotateImagesRequest. */
  var outputConfig: js.UndefOr[OutputConfig] = js.native
}
object AsyncBatchAnnotateImagesResponse {
  
  @scala.inline
  def apply(): AsyncBatchAnnotateImagesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AsyncBatchAnnotateImagesResponse]
  }
  
  @scala.inline
  implicit class AsyncBatchAnnotateImagesResponseOps[Self <: AsyncBatchAnnotateImagesResponse] (val x: Self) extends AnyVal {
    
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
