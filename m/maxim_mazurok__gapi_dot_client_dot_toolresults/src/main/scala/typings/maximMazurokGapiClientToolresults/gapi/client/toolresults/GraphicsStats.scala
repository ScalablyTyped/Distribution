package typings.maximMazurokGapiClientToolresults.gapi.client.toolresults

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GraphicsStats extends StObject {
  
  /** Histogram of frame render times. There should be 154 buckets ranging from [5ms, 6ms) to [4950ms, infinity) */
  var buckets: js.UndefOr[js.Array[GraphicsStatsBucket]] = js.native
  
  /** Total "high input latency" events. */
  var highInputLatencyCount: js.UndefOr[String] = js.native
  
  /** Total frames with slow render time. Should be <= total_frames. */
  var jankyFrames: js.UndefOr[String] = js.native
  
  /** Total "missed vsync" events. */
  var missedVsyncCount: js.UndefOr[String] = js.native
  
  /** 50th percentile frame render time in milliseconds. */
  var p50Millis: js.UndefOr[String] = js.native
  
  /** 90th percentile frame render time in milliseconds. */
  var p90Millis: js.UndefOr[String] = js.native
  
  /** 95th percentile frame render time in milliseconds. */
  var p95Millis: js.UndefOr[String] = js.native
  
  /** 99th percentile frame render time in milliseconds. */
  var p99Millis: js.UndefOr[String] = js.native
  
  /** Total "slow bitmap upload" events. */
  var slowBitmapUploadCount: js.UndefOr[String] = js.native
  
  /** Total "slow draw" events. */
  var slowDrawCount: js.UndefOr[String] = js.native
  
  /** Total "slow UI thread" events. */
  var slowUiThreadCount: js.UndefOr[String] = js.native
  
  /** Total frames rendered by package. */
  var totalFrames: js.UndefOr[String] = js.native
}
object GraphicsStats {
  
  @scala.inline
  def apply(): GraphicsStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GraphicsStats]
  }
  
  @scala.inline
  implicit class GraphicsStatsMutableBuilder[Self <: GraphicsStats] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuckets(value: js.Array[GraphicsStatsBucket]): Self = StObject.set(x, "buckets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBucketsUndefined: Self = StObject.set(x, "buckets", js.undefined)
    
    @scala.inline
    def setBucketsVarargs(value: GraphicsStatsBucket*): Self = StObject.set(x, "buckets", js.Array(value :_*))
    
    @scala.inline
    def setHighInputLatencyCount(value: String): Self = StObject.set(x, "highInputLatencyCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighInputLatencyCountUndefined: Self = StObject.set(x, "highInputLatencyCount", js.undefined)
    
    @scala.inline
    def setJankyFrames(value: String): Self = StObject.set(x, "jankyFrames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJankyFramesUndefined: Self = StObject.set(x, "jankyFrames", js.undefined)
    
    @scala.inline
    def setMissedVsyncCount(value: String): Self = StObject.set(x, "missedVsyncCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMissedVsyncCountUndefined: Self = StObject.set(x, "missedVsyncCount", js.undefined)
    
    @scala.inline
    def setP50Millis(value: String): Self = StObject.set(x, "p50Millis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setP50MillisUndefined: Self = StObject.set(x, "p50Millis", js.undefined)
    
    @scala.inline
    def setP90Millis(value: String): Self = StObject.set(x, "p90Millis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setP90MillisUndefined: Self = StObject.set(x, "p90Millis", js.undefined)
    
    @scala.inline
    def setP95Millis(value: String): Self = StObject.set(x, "p95Millis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setP95MillisUndefined: Self = StObject.set(x, "p95Millis", js.undefined)
    
    @scala.inline
    def setP99Millis(value: String): Self = StObject.set(x, "p99Millis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setP99MillisUndefined: Self = StObject.set(x, "p99Millis", js.undefined)
    
    @scala.inline
    def setSlowBitmapUploadCount(value: String): Self = StObject.set(x, "slowBitmapUploadCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlowBitmapUploadCountUndefined: Self = StObject.set(x, "slowBitmapUploadCount", js.undefined)
    
    @scala.inline
    def setSlowDrawCount(value: String): Self = StObject.set(x, "slowDrawCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlowDrawCountUndefined: Self = StObject.set(x, "slowDrawCount", js.undefined)
    
    @scala.inline
    def setSlowUiThreadCount(value: String): Self = StObject.set(x, "slowUiThreadCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlowUiThreadCountUndefined: Self = StObject.set(x, "slowUiThreadCount", js.undefined)
    
    @scala.inline
    def setTotalFrames(value: String): Self = StObject.set(x, "totalFrames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalFramesUndefined: Self = StObject.set(x, "totalFrames", js.undefined)
  }
}
