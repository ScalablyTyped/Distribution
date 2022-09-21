package typings.parcelTypes.mod

import typings.parcelDiagnostic.mod.Diagnostic
import typings.parcelTypes.parcelTypesStrings.error
import typings.parcelTypes.parcelTypesStrings.info
import typings.parcelTypes.parcelTypesStrings.verbose
import typings.parcelTypes.parcelTypesStrings.warn
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.parcelTypes.mod.LogEvent
  - typings.parcelTypes.mod.BuildStartEvent
  - typings.parcelTypes.mod.BuildProgressEvent
  - typings.parcelTypes.mod.BuildSuccessEvent
  - typings.parcelTypes.mod.BuildFailureEvent
  - typings.parcelTypes.mod.WatchStartEvent
  - typings.parcelTypes.mod.WatchEndEvent
  - typings.parcelTypes.mod.ValidationEvent
*/
trait ReporterEvent extends StObject
object ReporterEvent {
  
  inline def BuildFailureEvent(diagnostics: js.Array[Diagnostic]): typings.parcelTypes.mod.BuildFailureEvent = {
    val __obj = js.Dynamic.literal(diagnostics = diagnostics.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("buildFailure")
    __obj.asInstanceOf[typings.parcelTypes.mod.BuildFailureEvent]
  }
  
  inline def BuildStartEvent(): typings.parcelTypes.mod.BuildStartEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("buildStart")
    __obj.asInstanceOf[typings.parcelTypes.mod.BuildStartEvent]
  }
  
  inline def BuildSuccessEvent(
    buildTime: Double,
    bundleGraph: BundleGraph[PackagedBundle],
    changedAssets: Map[String, Asset],
    requestBundle: NamedBundle => js.Promise[typings.parcelTypes.mod.BuildSuccessEvent]
  ): typings.parcelTypes.mod.BuildSuccessEvent = {
    val __obj = js.Dynamic.literal(buildTime = buildTime.asInstanceOf[js.Any], bundleGraph = bundleGraph.asInstanceOf[js.Any], changedAssets = changedAssets.asInstanceOf[js.Any], requestBundle = js.Any.fromFunction1(requestBundle))
    __obj.updateDynamic("type")("buildSuccess")
    __obj.asInstanceOf[typings.parcelTypes.mod.BuildSuccessEvent]
  }
  
  inline def BundlingProgressEvent(): typings.parcelTypes.mod.BundlingProgressEvent = {
    val __obj = js.Dynamic.literal(phase = "bundling")
    __obj.updateDynamic("type")("buildProgress")
    __obj.asInstanceOf[typings.parcelTypes.mod.BundlingProgressEvent]
  }
  
  inline def DiagnosticLogEvent(diagnostics: js.Array[Diagnostic], level: error | warn | info | verbose): typings.parcelTypes.mod.DiagnosticLogEvent = {
    val __obj = js.Dynamic.literal(diagnostics = diagnostics.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("log")
    __obj.asInstanceOf[typings.parcelTypes.mod.DiagnosticLogEvent]
  }
  
  inline def OptimizingProgressEvent(bundle: NamedBundle): typings.parcelTypes.mod.OptimizingProgressEvent = {
    val __obj = js.Dynamic.literal(bundle = bundle.asInstanceOf[js.Any], phase = "optimizing")
    __obj.updateDynamic("type")("buildProgress")
    __obj.asInstanceOf[typings.parcelTypes.mod.OptimizingProgressEvent]
  }
  
  inline def PackagingProgressEvent(bundle: NamedBundle): typings.parcelTypes.mod.PackagingProgressEvent = {
    val __obj = js.Dynamic.literal(bundle = bundle.asInstanceOf[js.Any], phase = "packaging")
    __obj.updateDynamic("type")("buildProgress")
    __obj.asInstanceOf[typings.parcelTypes.mod.PackagingProgressEvent]
  }
  
  inline def ProgressLogEvent(message: String): typings.parcelTypes.mod.ProgressLogEvent = {
    val __obj = js.Dynamic.literal(level = "progress", message = message.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("log")
    __obj.asInstanceOf[typings.parcelTypes.mod.ProgressLogEvent]
  }
  
  inline def ResolvingProgressEvent(dependency: Dependency): typings.parcelTypes.mod.ResolvingProgressEvent = {
    val __obj = js.Dynamic.literal(dependency = dependency.asInstanceOf[js.Any], phase = "resolving")
    __obj.updateDynamic("type")("buildProgress")
    __obj.asInstanceOf[typings.parcelTypes.mod.ResolvingProgressEvent]
  }
  
  inline def TextLogEvent(message: String): typings.parcelTypes.mod.TextLogEvent = {
    val __obj = js.Dynamic.literal(level = "success", message = message.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("log")
    __obj.asInstanceOf[typings.parcelTypes.mod.TextLogEvent]
  }
  
  inline def TransformingProgressEvent(filePath: FilePath): typings.parcelTypes.mod.TransformingProgressEvent = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any], phase = "transforming")
    __obj.updateDynamic("type")("buildProgress")
    __obj.asInstanceOf[typings.parcelTypes.mod.TransformingProgressEvent]
  }
  
  inline def ValidationEvent(filePath: FilePath): typings.parcelTypes.mod.ValidationEvent = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("validation")
    __obj.asInstanceOf[typings.parcelTypes.mod.ValidationEvent]
  }
  
  inline def WatchEndEvent(): typings.parcelTypes.mod.WatchEndEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("watchEnd")
    __obj.asInstanceOf[typings.parcelTypes.mod.WatchEndEvent]
  }
  
  inline def WatchStartEvent(): typings.parcelTypes.mod.WatchStartEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("watchStart")
    __obj.asInstanceOf[typings.parcelTypes.mod.WatchStartEvent]
  }
}
