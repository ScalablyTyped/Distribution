package typings.parcelTypes.mod

import typings.parcelDiagnostic.mod.Diagnostic
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.parcelTypes.mod.BuildFailureEvent
  - typings.parcelTypes.mod.BuildSuccessEvent
*/
trait BuildEvent extends StObject
object BuildEvent {
  
  inline def BuildFailureEvent(diagnostics: js.Array[Diagnostic]): typings.parcelTypes.mod.BuildFailureEvent = {
    val __obj = js.Dynamic.literal(diagnostics = diagnostics.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("buildFailure")
    __obj.asInstanceOf[typings.parcelTypes.mod.BuildFailureEvent]
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
}
