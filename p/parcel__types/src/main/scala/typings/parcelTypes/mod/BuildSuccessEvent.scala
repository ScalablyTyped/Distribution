package typings.parcelTypes.mod

import typings.parcelTypes.parcelTypesStrings.buildSuccess
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildSuccessEvent
  extends StObject
     with BuildEvent
     with ReporterEvent {
  
  val buildTime: Double
  
  val bundleGraph: BundleGraph[PackagedBundle]
  
  val changedAssets: Map[String, Asset]
  
  def requestBundle(bundle: NamedBundle): js.Promise[BuildSuccessEvent]
  
  val `type`: buildSuccess
}
object BuildSuccessEvent {
  
  inline def apply(
    buildTime: Double,
    bundleGraph: BundleGraph[PackagedBundle],
    changedAssets: Map[String, Asset],
    requestBundle: NamedBundle => js.Promise[BuildSuccessEvent]
  ): BuildSuccessEvent = {
    val __obj = js.Dynamic.literal(buildTime = buildTime.asInstanceOf[js.Any], bundleGraph = bundleGraph.asInstanceOf[js.Any], changedAssets = changedAssets.asInstanceOf[js.Any], requestBundle = js.Any.fromFunction1(requestBundle))
    __obj.updateDynamic("type")("buildSuccess")
    __obj.asInstanceOf[BuildSuccessEvent]
  }
  
  extension [Self <: BuildSuccessEvent](x: Self) {
    
    inline def setBuildTime(value: Double): Self = StObject.set(x, "buildTime", value.asInstanceOf[js.Any])
    
    inline def setBundleGraph(value: BundleGraph[PackagedBundle]): Self = StObject.set(x, "bundleGraph", value.asInstanceOf[js.Any])
    
    inline def setChangedAssets(value: Map[String, Asset]): Self = StObject.set(x, "changedAssets", value.asInstanceOf[js.Any])
    
    inline def setRequestBundle(value: NamedBundle => js.Promise[BuildSuccessEvent]): Self = StObject.set(x, "requestBundle", js.Any.fromFunction1(value))
    
    inline def setType(value: buildSuccess): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
