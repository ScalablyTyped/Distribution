package typings.parcelTypes.anon

import typings.parcelTypes.mod.CreateBundleOpts
import typings.parcelTypes.mod.Environment
import typings.parcelTypes.mod.Target
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Env
  extends StObject
     with CreateBundleOpts {
  
  /**
    * Controls the behavior of the bundle.
    * to determine when the bundle is loaded.
    *   - inline: Inline bundles are not written to a separate file, but embedded into the parent bundle.
    *   - isolated: The bundle will be isolated from its parents. Shared assets will be duplicated.
    */
  val bundleBehavior: js.UndefOr[typings.parcelTypes.mod.BundleBehavior | Null] = js.undefined
  
  /** The environment of the bundle. */
  val env: Environment
  
  /**
    * Whether the bundle can be split. If false, then all dependencies of the bundle will be kept
    * internal to the bundle, rather than referring to other bundles. This may result in assets
    * being duplicated between multiple bundles, but can be useful for things like server side rendering.
    */
  val isSplittable: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Indicates that the bundle's file name should be stable over time, even when the content of the bundle
    * changes. This is useful for entries that a user would manually enter the URL for, as well as for things
    * like service workers or RSS feeds, where the URL must remain consistent over time.
    */
  val needsStableName: js.UndefOr[Boolean | Null] = js.undefined
  
  /** The bundle's pipeline, to be used for optimization. Usually based on the pipeline of the entry asset. */
  val pipeline: js.UndefOr[String | Null] = js.undefined
  
  /** The target of the bundle. Should come from the dependency that created the bundle. */
  val target: Target
  
  /** The type of the bundle. */
  val `type`: String
  
  /** A unique value for the bundle to be used in its id. */
  val uniqueKey: String
}
object Env {
  
  inline def apply(env: Environment, target: Target, `type`: String, uniqueKey: String): Env = {
    val __obj = js.Dynamic.literal(env = env.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], uniqueKey = uniqueKey.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Env]
  }
  
  extension [Self <: Env](x: Self) {
    
    inline def setBundleBehavior(value: typings.parcelTypes.mod.BundleBehavior): Self = StObject.set(x, "bundleBehavior", value.asInstanceOf[js.Any])
    
    inline def setBundleBehaviorNull: Self = StObject.set(x, "bundleBehavior", null)
    
    inline def setBundleBehaviorUndefined: Self = StObject.set(x, "bundleBehavior", js.undefined)
    
    inline def setEnv(value: Environment): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
    
    inline def setIsSplittable(value: Boolean): Self = StObject.set(x, "isSplittable", value.asInstanceOf[js.Any])
    
    inline def setIsSplittableNull: Self = StObject.set(x, "isSplittable", null)
    
    inline def setIsSplittableUndefined: Self = StObject.set(x, "isSplittable", js.undefined)
    
    inline def setNeedsStableName(value: Boolean): Self = StObject.set(x, "needsStableName", value.asInstanceOf[js.Any])
    
    inline def setNeedsStableNameNull: Self = StObject.set(x, "needsStableName", null)
    
    inline def setNeedsStableNameUndefined: Self = StObject.set(x, "needsStableName", js.undefined)
    
    inline def setPipeline(value: String): Self = StObject.set(x, "pipeline", value.asInstanceOf[js.Any])
    
    inline def setPipelineNull: Self = StObject.set(x, "pipeline", null)
    
    inline def setPipelineUndefined: Self = StObject.set(x, "pipeline", js.undefined)
    
    inline def setTarget(value: Target): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUniqueKey(value: String): Self = StObject.set(x, "uniqueKey", value.asInstanceOf[js.Any])
  }
}
