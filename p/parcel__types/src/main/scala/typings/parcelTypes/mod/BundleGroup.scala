package typings.parcelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BundleGroup extends StObject {
  
  /** The id of the entry asset in the bundle group, which is executed immediately when the bundle group is loaded. */
  val entryAssetId: String
  
  /** The target of the bundle group. */
  val target: Target
}
object BundleGroup {
  
  inline def apply(entryAssetId: String, target: Target): BundleGroup = {
    val __obj = js.Dynamic.literal(entryAssetId = entryAssetId.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[BundleGroup]
  }
  
  extension [Self <: BundleGroup](x: Self) {
    
    inline def setEntryAssetId(value: String): Self = StObject.set(x, "entryAssetId", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: Target): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
