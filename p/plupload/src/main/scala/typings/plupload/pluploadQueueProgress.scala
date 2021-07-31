package typings.plupload

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait pluploadQueueProgress extends StObject {
  
  var bytesPerSec: Double
  
  var failed: Double
  
  var loaded: Double
  
  var percent: Double
  
  var queued: Double
  
  def reset(): Unit
  
  var size: Double
  
  var uploaded: Double
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
  implicit class pluploadQueueProgressMutableBuilder[Self <: pluploadQueueProgress] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBytesPerSec(value: Double): Self = StObject.set(x, "bytesPerSec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailed(value: Double): Self = StObject.set(x, "failed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoaded(value: Double): Self = StObject.set(x, "loaded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPercent(value: Double): Self = StObject.set(x, "percent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueued(value: Double): Self = StObject.set(x, "queued", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUploaded(value: Double): Self = StObject.set(x, "uploaded", value.asInstanceOf[js.Any])
  }
}
