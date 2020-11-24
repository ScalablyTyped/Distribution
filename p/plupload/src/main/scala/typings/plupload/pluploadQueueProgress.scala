package typings.plupload

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait pluploadQueueProgress extends js.Object {
  
  var bytesPerSec: Double = js.native
  
  var failed: Double = js.native
  
  var loaded: Double = js.native
  
  var percent: Double = js.native
  
  var queued: Double = js.native
  
  def reset(): Unit = js.native
  
  var size: Double = js.native
  
  var uploaded: Double = js.native
}
object pluploadQueueProgress {
  
  @scala.inline
  def apply(
    bytesPerSec: Double,
    failed: Double,
    loaded: Double,
    percent: Double,
    queued: Double,
    reset: () => Unit,
    size: Double,
    uploaded: Double
  ): pluploadQueueProgress = {
    val __obj = js.Dynamic.literal(bytesPerSec = bytesPerSec.asInstanceOf[js.Any], failed = failed.asInstanceOf[js.Any], loaded = loaded.asInstanceOf[js.Any], percent = percent.asInstanceOf[js.Any], queued = queued.asInstanceOf[js.Any], reset = js.Any.fromFunction0(reset), size = size.asInstanceOf[js.Any], uploaded = uploaded.asInstanceOf[js.Any])
    __obj.asInstanceOf[pluploadQueueProgress]
  }
  
  @scala.inline
  implicit class pluploadQueueProgressOps[Self <: pluploadQueueProgress] (val x: Self) extends AnyVal {
    
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
    def setBytesPerSec(value: Double): Self = this.set("bytesPerSec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailed(value: Double): Self = this.set("failed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoaded(value: Double): Self = this.set("loaded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPercent(value: Double): Self = this.set("percent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueued(value: Double): Self = this.set("queued", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReset(value: () => Unit): Self = this.set("reset", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUploaded(value: Double): Self = this.set("uploaded", value.asInstanceOf[js.Any])
  }
}
