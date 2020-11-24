package typings.maximMazurokGapiClientToolresults.gapi.client.toolresults

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchCreatePerfSamplesResponse extends js.Object {
  
  var perfSamples: js.UndefOr[js.Array[PerfSample]] = js.native
}
object BatchCreatePerfSamplesResponse {
  
  @scala.inline
  def apply(): BatchCreatePerfSamplesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchCreatePerfSamplesResponse]
  }
  
  @scala.inline
  implicit class BatchCreatePerfSamplesResponseOps[Self <: BatchCreatePerfSamplesResponse] (val x: Self) extends AnyVal {
    
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
    def setPerfSamplesVarargs(value: PerfSample*): Self = this.set("perfSamples", js.Array(value :_*))
    
    @scala.inline
    def setPerfSamples(value: js.Array[PerfSample]): Self = this.set("perfSamples", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePerfSamples: Self = this.set("perfSamples", js.undefined)
  }
}
