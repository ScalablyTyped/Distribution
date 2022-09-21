package typings.parcelTypes.anon

import typings.parcelTypes.mod.CreateBundleOpts
import typings.parcelTypes.mod.Target
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// If an entryAsset is provided, a bundle id, type, and environment will be
// inferred from the entryAsset.
trait BundleBehavior
  extends StObject
     with CreateBundleOpts {
  
  /**
    * Controls the behavior of the bundle.
    * to determine when the bundle is loaded.
    *   - inline: Inline bundles are not written to a separate file, but embedded into the parent bundle.
    *   - isolated: The bundle will be isolated from its parents. Shared assets will be duplicated.
    */
  val bundleBehavior: js.UndefOr[typings.parcelTypes.mod.BundleBehavior | Null] = js.undefined
  
  /** The entry asset of the bundle. If provided, many bundle properties will be inferred from it. */
  val entryAsset: typings.parcelTypes.mod.Asset
  
  /**
    * Indicates that the bundle's file name should be stable over time, even when the content of the bundle
    * changes. This is useful for entries that a user would manually enter the URL for, as well as for things
    * like service workers or RSS feeds, where the URL must remain consistent over time.
    */
  val needsStableName: js.UndefOr[Boolean | Null] = js.undefined
  
  /** The target of the bundle. Should come from the dependency that created the bundle. */
  val target: Target
}
object BundleBehavior {
  
  inline def apply(entryAsset: typings.parcelTypes.mod.Asset, target: Target): BundleBehavior = {
    val __obj = js.Dynamic.literal(entryAsset = entryAsset.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[BundleBehavior]
  }
  
  extension [Self <: BundleBehavior](x: Self) {
    
    inline def setBundleBehavior(value: typings.parcelTypes.mod.BundleBehavior): Self = StObject.set(x, "bundleBehavior", value.asInstanceOf[js.Any])
    
    inline def setBundleBehaviorNull: Self = StObject.set(x, "bundleBehavior", null)
    
    inline def setBundleBehaviorUndefined: Self = StObject.set(x, "bundleBehavior", js.undefined)
    
    inline def setEntryAsset(value: typings.parcelTypes.mod.Asset): Self = StObject.set(x, "entryAsset", value.asInstanceOf[js.Any])
    
    inline def setNeedsStableName(value: Boolean): Self = StObject.set(x, "needsStableName", value.asInstanceOf[js.Any])
    
    inline def setNeedsStableNameNull: Self = StObject.set(x, "needsStableName", null)
    
    inline def setNeedsStableNameUndefined: Self = StObject.set(x, "needsStableName", js.undefined)
    
    inline def setTarget(value: Target): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
