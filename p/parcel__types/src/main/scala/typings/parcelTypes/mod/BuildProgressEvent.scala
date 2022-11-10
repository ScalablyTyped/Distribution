package typings.parcelTypes.mod

import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.parcelTypes.mod.ResolvingProgressEvent
  - typings.parcelTypes.mod.TransformingProgressEvent
  - typings.parcelTypes.mod.BundlingProgressEvent
  - typings.parcelTypes.mod.BundledProgressEvent
  - typings.parcelTypes.mod.PackagingProgressEvent
  - typings.parcelTypes.mod.OptimizingProgressEvent
*/
trait BuildProgressEvent
  extends StObject
     with ReporterEvent
object BuildProgressEvent {
  
  inline def BundledProgressEvent(bundleGraph: BundleGraph[NamedBundle], changedAssets: Map[String, Asset]): typings.parcelTypes.mod.BundledProgressEvent = {
    val __obj = js.Dynamic.literal(bundleGraph = bundleGraph.asInstanceOf[js.Any], changedAssets = changedAssets.asInstanceOf[js.Any], phase = "bundled")
    __obj.updateDynamic("type")("buildProgress")
    __obj.asInstanceOf[typings.parcelTypes.mod.BundledProgressEvent]
  }
  
  inline def BundlingProgressEvent(): typings.parcelTypes.mod.BundlingProgressEvent = {
    val __obj = js.Dynamic.literal(phase = "bundling")
    __obj.updateDynamic("type")("buildProgress")
    __obj.asInstanceOf[typings.parcelTypes.mod.BundlingProgressEvent]
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
  
  inline def ResolvingProgressEvent(dependency: Dependency): typings.parcelTypes.mod.ResolvingProgressEvent = {
    val __obj = js.Dynamic.literal(dependency = dependency.asInstanceOf[js.Any], phase = "resolving")
    __obj.updateDynamic("type")("buildProgress")
    __obj.asInstanceOf[typings.parcelTypes.mod.ResolvingProgressEvent]
  }
  
  inline def TransformingProgressEvent(filePath: FilePath): typings.parcelTypes.mod.TransformingProgressEvent = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any], phase = "transforming")
    __obj.updateDynamic("type")("buildProgress")
    __obj.asInstanceOf[typings.parcelTypes.mod.TransformingProgressEvent]
  }
}
