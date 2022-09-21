package typings.parcelTypes

import typings.parcelTypes.mod.BundleBehavior
import typings.parcelTypes.mod.DependencyPriority
import typings.parcelTypes.mod.EnvironmentContext
import typings.parcelTypes.mod.EnvironmentFeature
import typings.parcelTypes.mod.LogLevel
import typings.parcelTypes.mod.OutputFormat
import typings.parcelTypes.mod.SourceType
import typings.parcelTypes.mod.SpecifierType
import typings.parcelTypes.mod._BuildMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parcelTypesStrings {
  
  @js.native
  sealed trait PackageJSON extends StObject
  inline def PackageJSON: PackageJSON = "PackageJSON".asInstanceOf[PackageJSON]
  
  @js.native
  sealed trait `arrow-functions`
    extends StObject
       with EnvironmentFeature
  inline def `arrow-functions`: `arrow-functions` = "arrow-functions".asInstanceOf[`arrow-functions`]
  
  @js.native
  sealed trait asset extends StObject
  inline def asset: asset = "asset".asInstanceOf[asset]
  
  @js.native
  sealed trait browser
    extends StObject
       with EnvironmentContext
  inline def browser: browser = "browser".asInstanceOf[browser]
  
  @js.native
  sealed trait buildFailure extends StObject
  inline def buildFailure: buildFailure = "buildFailure".asInstanceOf[buildFailure]
  
  @js.native
  sealed trait buildProgress extends StObject
  inline def buildProgress: buildProgress = "buildProgress".asInstanceOf[buildProgress]
  
  @js.native
  sealed trait buildStart extends StObject
  inline def buildStart: buildStart = "buildStart".asInstanceOf[buildStart]
  
  @js.native
  sealed trait buildSuccess extends StObject
  inline def buildSuccess: buildSuccess = "buildSuccess".asInstanceOf[buildSuccess]
  
  @js.native
  sealed trait bundle_group extends StObject
  inline def bundle_group: bundle_group = "bundle_group".asInstanceOf[bundle_group]
  
  @js.native
  sealed trait bundling extends StObject
  inline def bundling: bundling = "bundling".asInstanceOf[bundling]
  
  @js.native
  sealed trait commonjs
    extends StObject
       with OutputFormat
       with SpecifierType
  inline def commonjs: commonjs = "commonjs".asInstanceOf[commonjs]
  
  @js.native
  sealed trait custom
    extends StObject
       with SpecifierType
  inline def custom: custom = "custom".asInstanceOf[custom]
  
  @js.native
  sealed trait dependency extends StObject
  inline def dependency: dependency = "dependency".asInstanceOf[dependency]
  
  @js.native
  sealed trait development
    extends StObject
       with _BuildMode
  inline def development: development = "development".asInstanceOf[development]
  
  @js.native
  sealed trait `dynamic-import`
    extends StObject
       with EnvironmentFeature
  inline def `dynamic-import`: `dynamic-import` = "dynamic-import".asInstanceOf[`dynamic-import`]
  
  @js.native
  sealed trait `electron-main`
    extends StObject
       with EnvironmentContext
  inline def `electron-main`: `electron-main` = "electron-main".asInstanceOf[`electron-main`]
  
  @js.native
  sealed trait `electron-renderer`
    extends StObject
       with EnvironmentContext
  inline def `electron-renderer`: `electron-renderer` = "electron-renderer".asInstanceOf[`electron-renderer`]
  
  @js.native
  sealed trait error
    extends StObject
       with LogLevel
  inline def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait esm
    extends StObject
       with SpecifierType
  inline def esm: esm = "esm".asInstanceOf[esm]
  
  @js.native
  sealed trait esmodule
    extends StObject
       with OutputFormat
  inline def esmodule: esmodule = "esmodule".asInstanceOf[esmodule]
  
  @js.native
  sealed trait esmodules
    extends StObject
       with EnvironmentFeature
  inline def esmodules: esmodules = "esmodules".asInstanceOf[esmodules]
  
  @js.native
  sealed trait global
    extends StObject
       with OutputFormat
  inline def global: global = "global".asInstanceOf[global]
  
  @js.native
  sealed trait `import-meta-url`
    extends StObject
       with EnvironmentFeature
  inline def `import-meta-url`: `import-meta-url` = "import-meta-url".asInstanceOf[`import-meta-url`]
  
  @js.native
  sealed trait info
    extends StObject
       with LogLevel
  inline def info: info = "info".asInstanceOf[info]
  
  @js.native
  sealed trait `inline`
    extends StObject
       with BundleBehavior
  inline def `inline`: `inline` = "inline".asInstanceOf[`inline`]
  
  @js.native
  sealed trait isolated
    extends StObject
       with BundleBehavior
  inline def isolated: isolated = "isolated".asInstanceOf[isolated]
  
  @js.native
  sealed trait `lazy`
    extends StObject
       with DependencyPriority
  inline def `lazy`: `lazy` = "lazy".asInstanceOf[`lazy`]
  
  @js.native
  sealed trait log extends StObject
  inline def log: log = "log".asInstanceOf[log]
  
  @js.native
  sealed trait module
    extends StObject
       with SourceType
  inline def module: module = "module".asInstanceOf[module]
  
  @js.native
  sealed trait node
    extends StObject
       with EnvironmentContext
  inline def node: node = "node".asInstanceOf[node]
  
  @js.native
  sealed trait none
    extends StObject
       with LogLevel
  inline def none: none = "none".asInstanceOf[none]
  
  @js.native
  sealed trait optimizing extends StObject
  inline def optimizing: optimizing = "optimizing".asInstanceOf[optimizing]
  
  @js.native
  sealed trait packaging extends StObject
  inline def packaging: packaging = "packaging".asInstanceOf[packaging]
  
  @js.native
  sealed trait parallel
    extends StObject
       with DependencyPriority
  inline def parallel: parallel = "parallel".asInstanceOf[parallel]
  
  @js.native
  sealed trait production
    extends StObject
       with _BuildMode
  inline def production: production = "production".asInstanceOf[production]
  
  @js.native
  sealed trait progress extends StObject
  inline def progress: progress = "progress".asInstanceOf[progress]
  
  @js.native
  sealed trait resolving extends StObject
  inline def resolving: resolving = "resolving".asInstanceOf[resolving]
  
  @js.native
  sealed trait script
    extends StObject
       with SourceType
  inline def script: script = "script".asInstanceOf[script]
  
  @js.native
  sealed trait `service-worker`
    extends StObject
       with EnvironmentContext
  inline def `service-worker`: `service-worker` = "service-worker".asInstanceOf[`service-worker`]
  
  @js.native
  sealed trait `service-worker-module`
    extends StObject
       with EnvironmentFeature
  inline def `service-worker-module`: `service-worker-module` = "service-worker-module".asInstanceOf[`service-worker-module`]
  
  @js.native
  sealed trait success extends StObject
  inline def success: success = "success".asInstanceOf[success]
  
  @js.native
  sealed trait sync
    extends StObject
       with DependencyPriority
  inline def sync: sync = "sync".asInstanceOf[sync]
  
  @js.native
  sealed trait transforming extends StObject
  inline def transforming: transforming = "transforming".asInstanceOf[transforming]
  
  @js.native
  sealed trait url
    extends StObject
       with SpecifierType
  inline def url: url = "url".asInstanceOf[url]
  
  @js.native
  sealed trait validation extends StObject
  inline def validation: validation = "validation".asInstanceOf[validation]
  
  @js.native
  sealed trait verbose
    extends StObject
       with LogLevel
  inline def verbose: verbose = "verbose".asInstanceOf[verbose]
  
  @js.native
  sealed trait warn
    extends StObject
       with LogLevel
  inline def warn: warn = "warn".asInstanceOf[warn]
  
  @js.native
  sealed trait watchEnd extends StObject
  inline def watchEnd: watchEnd = "watchEnd".asInstanceOf[watchEnd]
  
  @js.native
  sealed trait watchStart extends StObject
  inline def watchStart: watchStart = "watchStart".asInstanceOf[watchStart]
  
  @js.native
  sealed trait `web-worker`
    extends StObject
       with EnvironmentContext
  inline def `web-worker`: `web-worker` = "web-worker".asInstanceOf[`web-worker`]
  
  @js.native
  sealed trait `worker-module`
    extends StObject
       with EnvironmentFeature
  inline def `worker-module`: `worker-module` = "worker-module".asInstanceOf[`worker-module`]
  
  @js.native
  sealed trait worklet
    extends StObject
       with EnvironmentContext
  inline def worklet: worklet = "worklet".asInstanceOf[worklet]
}
