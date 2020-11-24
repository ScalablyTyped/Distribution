package typings.nano.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChangesReaderOptions extends js.Object {
  
  // number of changes per API call
  var batchSize: js.UndefOr[Double] = js.native
  
  // whether to get a faster changes feed by supplying 'seq_interval'  
  var fastChanges: js.UndefOr[Boolean] = js.native
  
  // whether to return document bodies too
  var includeDocs: js.UndefOr[Boolean] = js.native
  
  // additional query string parameters
  var qs: js.UndefOr[js.Object] = js.native
  
  // a MangoSelector defining the slice of the changes feed to return
  var selector: js.UndefOr[MangoSelector] = js.native
  
  // where to begin the changes feed: 0, now or a sequence token
  var since: js.UndefOr[String] = js.native
  
  // number of milliseconds when the longpoll request will timeout
  var timeout: js.UndefOr[Double] = js.native
  
  // whether to require a callback before performing the next request (get/start only)
  @JSName("wait")
  var wait_FChangesReaderOptions: js.UndefOr[Boolean] = js.native
}
object ChangesReaderOptions {
  
  @scala.inline
  def apply(): ChangesReaderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChangesReaderOptions]
  }
  
  @scala.inline
  implicit class ChangesReaderOptionsOps[Self <: ChangesReaderOptions] (val x: Self) extends AnyVal {
    
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
    def setBatchSize(value: Double): Self = this.set("batchSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBatchSize: Self = this.set("batchSize", js.undefined)
    
    @scala.inline
    def setFastChanges(value: Boolean): Self = this.set("fastChanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFastChanges: Self = this.set("fastChanges", js.undefined)
    
    @scala.inline
    def setIncludeDocs(value: Boolean): Self = this.set("includeDocs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeDocs: Self = this.set("includeDocs", js.undefined)
    
    @scala.inline
    def setQs(value: js.Object): Self = this.set("qs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQs: Self = this.set("qs", js.undefined)
    
    @scala.inline
    def setSelector(value: MangoSelector): Self = this.set("selector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelector: Self = this.set("selector", js.undefined)
    
    @scala.inline
    def setSince(value: String): Self = this.set("since", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSince: Self = this.set("since", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    
    @scala.inline
    def setWait(value: Boolean): Self = this.set("wait", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWait: Self = this.set("wait", js.undefined)
  }
}
