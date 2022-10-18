package typings.metro

import typings.metro.deltaBundlerTypesMod.AsyncDependencyType
import typings.metro.libReportingMod.GlobalCacheDisabledReason
import typings.metro.moduleGraphWorkerCollectDependenciesMod.DynamicRequiresBehavior
import typings.metro.sharedTypesMod.BundleType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object metroStrings {
  
  @js.native
  sealed trait ascii extends StObject
  inline def ascii: ascii = "ascii".asInstanceOf[ascii]
  
  @js.native
  sealed trait async
    extends StObject
       with AsyncDependencyType
  inline def async: async = "async".asInstanceOf[async]
  
  @js.native
  sealed trait bundle
    extends StObject
       with BundleType
  inline def bundle: bundle = "bundle".asInstanceOf[bundle]
  
  @js.native
  sealed trait bundle_build_done extends StObject
  inline def bundle_build_done: bundle_build_done = "bundle_build_done".asInstanceOf[bundle_build_done]
  
  @js.native
  sealed trait bundle_build_failed extends StObject
  inline def bundle_build_failed: bundle_build_failed = "bundle_build_failed".asInstanceOf[bundle_build_failed]
  
  @js.native
  sealed trait bundle_build_started extends StObject
  inline def bundle_build_started: bundle_build_started = "bundle_build_started".asInstanceOf[bundle_build_started]
  
  @js.native
  sealed trait bundle_transform_progressed extends StObject
  inline def bundle_transform_progressed: bundle_transform_progressed = "bundle_transform_progressed".asInstanceOf[bundle_transform_progressed]
  
  @js.native
  sealed trait bundle_transform_progressed_throttled extends StObject
  inline def bundle_transform_progressed_throttled: bundle_transform_progressed_throttled = "bundle_transform_progressed_throttled".asInstanceOf[bundle_transform_progressed_throttled]
  
  @js.native
  sealed trait bundling_error extends StObject
  inline def bundling_error: bundling_error = "bundling_error".asInstanceOf[bundling_error]
  
  @js.native
  sealed trait cli
    extends StObject
       with BundleType
  inline def cli: cli = "cli".asInstanceOf[cli]
  
  @js.native
  sealed trait client_log extends StObject
  inline def client_log: client_log = "client_log".asInstanceOf[client_log]
  
  @js.native
  sealed trait concrete extends StObject
  inline def concrete: concrete = "concrete".asInstanceOf[concrete]
  
  @js.native
  sealed trait debug extends StObject
  inline def debug: debug = "debug".asInstanceOf[debug]
  
  @js.native
  sealed trait delta
    extends StObject
       with BundleType
  inline def delta: delta = "delta".asInstanceOf[delta]
  
  @js.native
  sealed trait dep_graph_loaded extends StObject
  inline def dep_graph_loaded: dep_graph_loaded = "dep_graph_loaded".asInstanceOf[dep_graph_loaded]
  
  @js.native
  sealed trait dep_graph_loading extends StObject
  inline def dep_graph_loading: dep_graph_loading = "dep_graph_loading".asInstanceOf[dep_graph_loading]
  
  @js.native
  sealed trait global_cache_disabled extends StObject
  inline def global_cache_disabled: global_cache_disabled = "global_cache_disabled".asInstanceOf[global_cache_disabled]
  
  @js.native
  sealed trait global_cache_error extends StObject
  inline def global_cache_error: global_cache_error = "global_cache_error".asInstanceOf[global_cache_error]
  
  @js.native
  sealed trait graph
    extends StObject
       with BundleType
  inline def graph: graph = "graph".asInstanceOf[graph]
  
  @js.native
  sealed trait group extends StObject
  inline def group: group = "group".asInstanceOf[group]
  
  @js.native
  sealed trait groupCollapsed extends StObject
  inline def groupCollapsed: groupCollapsed = "groupCollapsed".asInstanceOf[groupCollapsed]
  
  @js.native
  sealed trait groupEnd extends StObject
  inline def groupEnd: groupEnd = "groupEnd".asInstanceOf[groupEnd]
  
  @js.native
  sealed trait hmr
    extends StObject
       with BundleType
  inline def hmr: hmr = "hmr".asInstanceOf[hmr]
  
  @js.native
  sealed trait hmr_client_error extends StObject
  inline def hmr_client_error: hmr_client_error = "hmr_client_error".asInstanceOf[hmr_client_error]
  
  @js.native
  sealed trait info extends StObject
  inline def info: info = "info".asInstanceOf[info]
  
  @js.native
  sealed trait initialize_failed extends StObject
  inline def initialize_failed: initialize_failed = "initialize_failed".asInstanceOf[initialize_failed]
  
  @js.native
  sealed trait initialize_started extends StObject
  inline def initialize_started: initialize_started = "initialize_started".asInstanceOf[initialize_started]
  
  @js.native
  sealed trait linked extends StObject
  inline def linked: linked = "linked".asInstanceOf[linked]
  
  @js.native
  sealed trait log extends StObject
  inline def log: log = "log".asInstanceOf[log]
  
  @js.native
  sealed trait map
    extends StObject
       with BundleType
  inline def map: map = "map".asInstanceOf[map]
  
  @js.native
  sealed trait meta
    extends StObject
       with BundleType
  inline def meta: meta = "meta".asInstanceOf[meta]
  
  @js.native
  sealed trait prefetch
    extends StObject
       with AsyncDependencyType
  inline def prefetch: prefetch = "prefetch".asInstanceOf[prefetch]
  
  @js.native
  sealed trait ram
    extends StObject
       with BundleType
  inline def ram: ram = "ram".asInstanceOf[ram]
  
  @js.native
  sealed trait reject
    extends StObject
       with DynamicRequiresBehavior
  inline def reject: reject = "reject".asInstanceOf[reject]
  
  @js.native
  sealed trait throwAtRuntime
    extends StObject
       with DynamicRequiresBehavior
  inline def throwAtRuntime: throwAtRuntime = "throwAtRuntime".asInstanceOf[throwAtRuntime]
  
  @js.native
  sealed trait todo
    extends StObject
       with BundleType
  inline def todo: todo = "todo".asInstanceOf[todo]
  
  @js.native
  sealed trait too_many_errors
    extends StObject
       with GlobalCacheDisabledReason
  inline def too_many_errors: too_many_errors = "too_many_errors".asInstanceOf[too_many_errors]
  
  @js.native
  sealed trait too_many_misses
    extends StObject
       with GlobalCacheDisabledReason
  inline def too_many_misses: too_many_misses = "too_many_misses".asInstanceOf[too_many_misses]
  
  @js.native
  sealed trait trace extends StObject
  inline def trace: trace = "trace".asInstanceOf[trace]
  
  @js.native
  sealed trait transform_cache_reset extends StObject
  inline def transform_cache_reset: transform_cache_reset = "transform_cache_reset".asInstanceOf[transform_cache_reset]
  
  @js.native
  sealed trait utf16le extends StObject
  inline def utf16le: utf16le = "utf16le".asInstanceOf[utf16le]
  
  @js.native
  sealed trait utf8 extends StObject
  inline def utf8: utf8 = "utf8".asInstanceOf[utf8]
  
  @js.native
  sealed trait warn extends StObject
  inline def warn: warn = "warn".asInstanceOf[warn]
  
  @js.native
  sealed trait worker_stderr_chunk extends StObject
  inline def worker_stderr_chunk: worker_stderr_chunk = "worker_stderr_chunk".asInstanceOf[worker_stderr_chunk]
  
  @js.native
  sealed trait worker_stdout_chunk extends StObject
  inline def worker_stdout_chunk: worker_stdout_chunk = "worker_stdout_chunk".asInstanceOf[worker_stdout_chunk]
}
