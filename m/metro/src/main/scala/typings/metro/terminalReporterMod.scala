package typings.metro

import typings.metro.metroStrings.debug
import typings.metro.metroStrings.group
import typings.metro.metroStrings.groupCollapsed
import typings.metro.metroStrings.groupEnd
import typings.metro.metroStrings.info
import typings.metro.metroStrings.log
import typings.metro.metroStrings.trace
import typings.metro.metroStrings.warn
import typings.metro.reportingMod.GlobalCacheDisabledReason
import typings.metroCore.mod.Terminal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object terminalReporterMod {
  
  @JSImport("metro/src/lib/TerminalReporter", "TerminalReporter")
  @js.native
  open class TerminalReporter protected () extends StObject {
    def this(terminal: Terminal) = this()
    
    def update(event: TerminalReportableEvent): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.metro.reportingMod.ReportableEvent
    - typings.metro.anon.TransformedFileCount
  */
  trait TerminalReportableEvent extends StObject
  object TerminalReportableEvent {
    
    inline def `0`(): typings.metro.anon.`0` = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("dep_graph_loaded")
      __obj.asInstanceOf[typings.metro.anon.`0`]
    }
    
    inline def `1`(): typings.metro.anon.`1` = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("transform_cache_reset")
      __obj.asInstanceOf[typings.metro.anon.`1`]
    }
    
    inline def BuildID(buildID: String): typings.metro.anon.BuildID = {
      val __obj = js.Dynamic.literal(buildID = buildID.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("bundle_build_done")
      __obj.asInstanceOf[typings.metro.anon.BuildID]
    }
    
    inline def BundleDetails(buildID: String, bundleDetails: typings.metro.reportingMod.BundleDetails): typings.metro.anon.BundleDetails = {
      val __obj = js.Dynamic.literal(buildID = buildID.asInstanceOf[js.Any], bundleDetails = bundleDetails.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("bundle_build_started")
      __obj.asInstanceOf[typings.metro.anon.BundleDetails]
    }
    
    inline def Chunk(chunk: String): typings.metro.anon.Chunk = {
      val __obj = js.Dynamic.literal(chunk = chunk.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("worker_stdout_chunk")
      __obj.asInstanceOf[typings.metro.anon.Chunk]
    }
    
    inline def ChunkType(chunk: String): typings.metro.anon.ChunkType = {
      val __obj = js.Dynamic.literal(chunk = chunk.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("worker_stderr_chunk")
      __obj.asInstanceOf[typings.metro.anon.ChunkType]
    }
    
    inline def Data(data: js.Array[Any], level: trace | info | warn | log | group | groupCollapsed | groupEnd | debug): typings.metro.anon.Data = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("client_log")
      __obj.asInstanceOf[typings.metro.anon.Data]
    }
    
    inline def Error(error: js.Error, port: Double): typings.metro.anon.Error = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("initialize_failed")
      __obj.asInstanceOf[typings.metro.anon.Error]
    }
    
    inline def ErrorError(error: js.Error): typings.metro.anon.ErrorError = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("global_cache_error")
      __obj.asInstanceOf[typings.metro.anon.ErrorError]
    }
    
    inline def ErrorErrorType(error: js.Error): typings.metro.anon.ErrorErrorType = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("hmr_client_error")
      __obj.asInstanceOf[typings.metro.anon.ErrorErrorType]
    }
    
    inline def ErrorType(error: js.Error): typings.metro.anon.ErrorType = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("bundling_error")
      __obj.asInstanceOf[typings.metro.anon.ErrorType]
    }
    
    inline def HasReducedPerformance(hasReducedPerformance: Boolean, port: Double): typings.metro.anon.HasReducedPerformance = {
      val __obj = js.Dynamic.literal(hasReducedPerformance = hasReducedPerformance.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("initialize_started")
      __obj.asInstanceOf[typings.metro.anon.HasReducedPerformance]
    }
    
    inline def HasReducedPerformanceType(hasReducedPerformance: Boolean): typings.metro.anon.HasReducedPerformanceType = {
      val __obj = js.Dynamic.literal(hasReducedPerformance = hasReducedPerformance.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("dep_graph_loading")
      __obj.asInstanceOf[typings.metro.anon.HasReducedPerformanceType]
    }
    
    inline def Reason(reason: GlobalCacheDisabledReason): typings.metro.anon.Reason = {
      val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("global_cache_disabled")
      __obj.asInstanceOf[typings.metro.anon.Reason]
    }
    
    inline def TotalFileCount(buildID: String, totalFileCount: Double, transformedFileCount: Double): typings.metro.anon.TotalFileCount = {
      val __obj = js.Dynamic.literal(buildID = buildID.asInstanceOf[js.Any], totalFileCount = totalFileCount.asInstanceOf[js.Any], transformedFileCount = transformedFileCount.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("bundle_transform_progressed")
      __obj.asInstanceOf[typings.metro.anon.TotalFileCount]
    }
    
    inline def TransformedFileCount(buildID: String, totalFileCount: Double, transformedFileCount: Double): typings.metro.anon.TransformedFileCount = {
      val __obj = js.Dynamic.literal(buildID = buildID.asInstanceOf[js.Any], totalFileCount = totalFileCount.asInstanceOf[js.Any], transformedFileCount = transformedFileCount.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("bundle_transform_progressed_throttled")
      __obj.asInstanceOf[typings.metro.anon.TransformedFileCount]
    }
    
    inline def Type(buildID: String): typings.metro.anon.Type = {
      val __obj = js.Dynamic.literal(buildID = buildID.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("bundle_build_failed")
      __obj.asInstanceOf[typings.metro.anon.Type]
    }
  }
}
