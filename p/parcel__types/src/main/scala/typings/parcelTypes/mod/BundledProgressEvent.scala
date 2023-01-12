package typings.parcelTypes.mod

import typings.parcelTypes.parcelTypesStrings.buildProgress
import typings.parcelTypes.parcelTypesStrings.bundled
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BundledProgressEvent
  extends StObject
     with BuildProgressEvent {
  
  val bundleGraph: BundleGraph[NamedBundle]
  
  val changedAssets: Map[String, Asset]
  
  val phase: bundled
  
  val `type`: buildProgress
}
object BundledProgressEvent {
  
  inline def apply(bundleGraph: BundleGraph[NamedBundle], changedAssets: Map[String, Asset]): BundledProgressEvent = {
    val __obj = js.Dynamic.literal(bundleGraph = bundleGraph.asInstanceOf[js.Any], changedAssets = changedAssets.asInstanceOf[js.Any], phase = "bundled")
    __obj.updateDynamic("type")("buildProgress")
    __obj.asInstanceOf[BundledProgressEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BundledProgressEvent] (val x: Self) extends AnyVal {
    
    inline def setBundleGraph(value: BundleGraph[NamedBundle]): Self = StObject.set(x, "bundleGraph", value.asInstanceOf[js.Any])
    
    inline def setChangedAssets(value: Map[String, Asset]): Self = StObject.set(x, "changedAssets", value.asInstanceOf[js.Any])
    
    inline def setPhase(value: bundled): Self = StObject.set(x, "phase", value.asInstanceOf[js.Any])
    
    inline def setType(value: buildProgress): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
