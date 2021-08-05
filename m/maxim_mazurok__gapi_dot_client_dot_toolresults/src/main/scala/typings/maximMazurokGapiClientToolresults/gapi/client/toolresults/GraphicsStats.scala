package typings.maximMazurokGapiClientToolresults.gapi.client.toolresults

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GraphicsStats extends StObject {
  
  /** Histogram of frame render times. There should be 154 buckets ranging from [5ms, 6ms) to [4950ms, infinity) */
  var buckets: js.UndefOr[js.Array[GraphicsStatsBucket]] = js.undefined
  
  /** Total "high input latency" events. */
  var highInputLatencyCount: js.UndefOr[String] = js.undefined
  
  /** Total frames with slow render time. Should be <= total_frames. */
  var jankyFrames: js.UndefOr[String] = js.undefined
  
  /** Total "missed vsync" events. */
  var missedVsyncCount: js.UndefOr[String] = js.undefined
  
  /** 50th percentile frame render time in milliseconds. */
  var p50Millis: js.UndefOr[String] = js.undefined
  
  /** 90th percentile frame render time in milliseconds. */
  var p90Millis: js.UndefOr[String] = js.undefined
  
  /** 95th percentile frame render time in milliseconds. */
  var p95Millis: js.UndefOr[String] = js.undefined
  
  /** 99th percentile frame render time in milliseconds. */
  var p99Millis: js.UndefOr[String] = js.undefined
  
  /** Total "slow bitmap upload" events. */
  var slowBitmapUploadCount: js.UndefOr[String] = js.undefined
  
  /** Total "slow draw" events. */
  var slowDrawCount: js.UndefOr[String] = js.undefined
  
  /** Total "slow UI thread" events. */
  var slowUiThreadCount: js.UndefOr[String] = js.undefined
  
  /** Total frames rendered by package. */
  var totalFrames: js.UndefOr[String] = js.undefined
}
object GraphicsStats {
  
  inline def apply(): GraphicsStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GraphicsStats]
  }
  
  extension [Self <: GraphicsStats](x: Self) {
    
    inline def setBuckets(value: js.Array[GraphicsStatsBucket]): Self = StObject.set(x, "buckets", value.asInstanceOf[js.Any])
    
    inline def setBucketsUndefined: Self = StObject.set(x, "buckets", js.undefined)
    
    inline def setBucketsVarargs(value: GraphicsStatsBucket*): Self = StObject.set(x, "buckets", js.Array(value :_*))
    
    inline def setHighInputLatencyCount(value: String): Self = StObject.set(x, "highInputLatencyCount", value.asInstanceOf[js.Any])
    
    inline def setHighInputLatencyCountUndefined: Self = StObject.set(x, "highInputLatencyCount", js.undefined)
    
    inline def setJankyFrames(value: String): Self = StObject.set(x, "jankyFrames", value.asInstanceOf[js.Any])
    
    inline def setJankyFramesUndefined: Self = StObject.set(x, "jankyFrames", js.undefined)
    
    inline def setMissedVsyncCount(value: String): Self = StObject.set(x, "missedVsyncCount", value.asInstanceOf[js.Any])
    
    inline def setMissedVsyncCountUndefined: Self = StObject.set(x, "missedVsyncCount", js.undefined)
    
    inline def setP50Millis(value: String): Self = StObject.set(x, "p50Millis", value.asInstanceOf[js.Any])
    
    inline def setP50MillisUndefined: Self = StObject.set(x, "p50Millis", js.undefined)
    
    inline def setP90Millis(value: String): Self = StObject.set(x, "p90Millis", value.asInstanceOf[js.Any])
    
    inline def setP90MillisUndefined: Self = StObject.set(x, "p90Millis", js.undefined)
    
    inline def setP95Millis(value: String): Self = StObject.set(x, "p95Millis", value.asInstanceOf[js.Any])
    
    inline def setP95MillisUndefined: Self = StObject.set(x, "p95Millis", js.undefined)
    
    inline def setP99Millis(value: String): Self = StObject.set(x, "p99Millis", value.asInstanceOf[js.Any])
    
    inline def setP99MillisUndefined: Self = StObject.set(x, "p99Millis", js.undefined)
    
    inline def setSlowBitmapUploadCount(value: String): Self = StObject.set(x, "slowBitmapUploadCount", value.asInstanceOf[js.Any])
    
    inline def setSlowBitmapUploadCountUndefined: Self = StObject.set(x, "slowBitmapUploadCount", js.undefined)
    
    inline def setSlowDrawCount(value: String): Self = StObject.set(x, "slowDrawCount", value.asInstanceOf[js.Any])
    
    inline def setSlowDrawCountUndefined: Self = StObject.set(x, "slowDrawCount", js.undefined)
    
    inline def setSlowUiThreadCount(value: String): Self = StObject.set(x, "slowUiThreadCount", value.asInstanceOf[js.Any])
    
    inline def setSlowUiThreadCountUndefined: Self = StObject.set(x, "slowUiThreadCount", js.undefined)
    
    inline def setTotalFrames(value: String): Self = StObject.set(x, "totalFrames", value.asInstanceOf[js.Any])
    
    inline def setTotalFramesUndefined: Self = StObject.set(x, "totalFrames", js.undefined)
  }
}
