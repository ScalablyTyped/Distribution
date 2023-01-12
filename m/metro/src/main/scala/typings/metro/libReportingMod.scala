package typings.metro

import typings.metro.metroStrings.debug
import typings.metro.metroStrings.group
import typings.metro.metroStrings.groupCollapsed
import typings.metro.metroStrings.groupEnd
import typings.metro.metroStrings.info
import typings.metro.metroStrings.log
import typings.metro.metroStrings.trace
import typings.metro.metroStrings.warn
import typings.metro.srcLibTerminalReporterMod.TerminalReportableEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libReportingMod {
  
  trait BundleDetails extends StObject {
    
    var bundleType: String
    
    var dev: Boolean
    
    var entryFile: String
    
    var minify: Boolean
    
    var platform: js.UndefOr[String] = js.undefined
    
    var runtimeBytecodeVersion: js.UndefOr[Double] = js.undefined
  }
  object BundleDetails {
    
    inline def apply(bundleType: String, dev: Boolean, entryFile: String, minify: Boolean): BundleDetails = {
      val __obj = js.Dynamic.literal(bundleType = bundleType.asInstanceOf[js.Any], dev = dev.asInstanceOf[js.Any], entryFile = entryFile.asInstanceOf[js.Any], minify = minify.asInstanceOf[js.Any])
      __obj.asInstanceOf[BundleDetails]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BundleDetails] (val x: Self) extends AnyVal {
      
      inline def setBundleType(value: String): Self = StObject.set(x, "bundleType", value.asInstanceOf[js.Any])
      
      inline def setDev(value: Boolean): Self = StObject.set(x, "dev", value.asInstanceOf[js.Any])
      
      inline def setEntryFile(value: String): Self = StObject.set(x, "entryFile", value.asInstanceOf[js.Any])
      
      inline def setMinify(value: Boolean): Self = StObject.set(x, "minify", value.asInstanceOf[js.Any])
      
      inline def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      inline def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
      
      inline def setRuntimeBytecodeVersion(value: Double): Self = StObject.set(x, "runtimeBytecodeVersion", value.asInstanceOf[js.Any])
      
      inline def setRuntimeBytecodeVersionUndefined: Self = StObject.set(x, "runtimeBytecodeVersion", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.metro.metroStrings.too_many_errors
    - typings.metro.metroStrings.too_many_misses
  */
  trait GlobalCacheDisabledReason extends StObject
  object GlobalCacheDisabledReason {
    
    inline def too_many_errors: typings.metro.metroStrings.too_many_errors = "too_many_errors".asInstanceOf[typings.metro.metroStrings.too_many_errors]
    
    inline def too_many_misses: typings.metro.metroStrings.too_many_misses = "too_many_misses".asInstanceOf[typings.metro.metroStrings.too_many_misses]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.metro.anon.HasReducedPerformance
    - typings.metro.anon.Error
    - typings.metro.anon.BuildID
    - typings.metro.anon.Type
    - typings.metro.anon.BundleDetails
    - typings.metro.anon.ErrorType
    - typings.metro.anon.HasReducedPerformanceType
    - typings.metro.anon.`0`
    - typings.metro.anon.TotalFileCount
    - typings.metro.anon.ErrorError
    - typings.metro.anon.Reason
    - typings.metro.anon.`1`
    - typings.metro.anon.Chunk
    - typings.metro.anon.ChunkType
    - typings.metro.anon.ErrorErrorType
    - typings.metro.anon.Data
  */
  trait ReportableEvent
    extends StObject
       with TerminalReportableEvent
  object ReportableEvent {
    
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
    
    inline def BundleDetails(buildID: String, bundleDetails: typings.metro.libReportingMod.BundleDetails): typings.metro.anon.BundleDetails = {
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
    
    inline def Type(buildID: String): typings.metro.anon.Type = {
      val __obj = js.Dynamic.literal(buildID = buildID.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("bundle_build_failed")
      __obj.asInstanceOf[typings.metro.anon.Type]
    }
  }
  
  trait Reporter extends StObject {
    
    def update(event: ReportableEvent): Unit
  }
  object Reporter {
    
    inline def apply(update: ReportableEvent => Unit): Reporter = {
      val __obj = js.Dynamic.literal(update = js.Any.fromFunction1(update))
      __obj.asInstanceOf[Reporter]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Reporter] (val x: Self) extends AnyVal {
      
      inline def setUpdate(value: ReportableEvent => Unit): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
    }
  }
}
