package typings.nano.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChangesReaderOptions extends StObject {
  
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
  implicit class ChangesReaderOptionsMutableBuilder[Self <: ChangesReaderOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBatchSize(value: Double): Self = StObject.set(x, "batchSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBatchSizeUndefined: Self = StObject.set(x, "batchSize", js.undefined)
    
    @scala.inline
    def setFastChanges(value: Boolean): Self = StObject.set(x, "fastChanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFastChangesUndefined: Self = StObject.set(x, "fastChanges", js.undefined)
    
    @scala.inline
    def setIncludeDocs(value: Boolean): Self = StObject.set(x, "includeDocs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeDocsUndefined: Self = StObject.set(x, "includeDocs", js.undefined)
    
    @scala.inline
    def setQs(value: js.Object): Self = StObject.set(x, "qs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQsUndefined: Self = StObject.set(x, "qs", js.undefined)
    
    @scala.inline
    def setSelector(value: MangoSelector): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
    
    @scala.inline
    def setSince(value: String): Self = StObject.set(x, "since", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSinceUndefined: Self = StObject.set(x, "since", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    @scala.inline
    def setWait_(value: Boolean): Self = StObject.set(x, "wait", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWait_Undefined: Self = StObject.set(x, "wait", js.undefined)
  }
}
