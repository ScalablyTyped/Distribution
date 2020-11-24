package typings.maximMazurokGapiClientToolresults.gapi.client.toolresults

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GraphicsStats extends js.Object {
  
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
  implicit class GraphicsStatsOps[Self <: GraphicsStats] (val x: Self) extends AnyVal {
    
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
    def setBucketsVarargs(value: GraphicsStatsBucket*): Self = this.set("buckets", js.Array(value :_*))
    
    @scala.inline
    def setBuckets(value: js.Array[GraphicsStatsBucket]): Self = this.set("buckets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBuckets: Self = this.set("buckets", js.undefined)
    
    @scala.inline
    def setHighInputLatencyCount(value: String): Self = this.set("highInputLatencyCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHighInputLatencyCount: Self = this.set("highInputLatencyCount", js.undefined)
    
    @scala.inline
    def setJankyFrames(value: String): Self = this.set("jankyFrames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJankyFrames: Self = this.set("jankyFrames", js.undefined)
    
    @scala.inline
    def setMissedVsyncCount(value: String): Self = this.set("missedVsyncCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMissedVsyncCount: Self = this.set("missedVsyncCount", js.undefined)
    
    @scala.inline
    def setP50Millis(value: String): Self = this.set("p50Millis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteP50Millis: Self = this.set("p50Millis", js.undefined)
    
    @scala.inline
    def setP90Millis(value: String): Self = this.set("p90Millis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteP90Millis: Self = this.set("p90Millis", js.undefined)
    
    @scala.inline
    def setP95Millis(value: String): Self = this.set("p95Millis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteP95Millis: Self = this.set("p95Millis", js.undefined)
    
    @scala.inline
    def setP99Millis(value: String): Self = this.set("p99Millis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteP99Millis: Self = this.set("p99Millis", js.undefined)
    
    @scala.inline
    def setSlowBitmapUploadCount(value: String): Self = this.set("slowBitmapUploadCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlowBitmapUploadCount: Self = this.set("slowBitmapUploadCount", js.undefined)
    
    @scala.inline
    def setSlowDrawCount(value: String): Self = this.set("slowDrawCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlowDrawCount: Self = this.set("slowDrawCount", js.undefined)
    
    @scala.inline
    def setSlowUiThreadCount(value: String): Self = this.set("slowUiThreadCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlowUiThreadCount: Self = this.set("slowUiThreadCount", js.undefined)
    
    @scala.inline
    def setTotalFrames(value: String): Self = this.set("totalFrames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalFrames: Self = this.set("totalFrames", js.undefined)
  }
}
