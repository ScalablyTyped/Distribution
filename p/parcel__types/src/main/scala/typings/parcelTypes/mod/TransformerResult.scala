package typings.parcelTypes.mod

import typings.parcelSourceMap.mod.default
import typings.parcelTypes.anon.LocLocal
import typings.std.ReadonlyMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransformerResult extends StObject {
  
  /** The asset's AST. Either content or an AST is required. */
  val ast: js.UndefOr[AST | Null] = js.undefined
  
  /**
    * Controls which bundle the asset is placed into.
    *   - inline: The asset will be placed into a new inline bundle. Inline bundles are not written
    *       to a separate file, but embedded into the parent bundle.
    *   - isolated: The asset will be isolated from its parents in a separate bundle. Shared assets
    *       will be duplicated.
    */
  val bundleBehavior: js.UndefOr[BundleBehavior | Null] = js.undefined
  
  /** The content of the asset. Either content or an AST is required. */
  val content: js.UndefOr[Blob | Null] = js.undefined
  
  /** The dependencies of the asset. */
  val dependencies: js.UndefOr[js.Array[DependencyOptions]] = js.undefined
  
  /** The environment of the asset. The options are merged with the input asset's environment. */
  val env: js.UndefOr[EnvironmentOptions | Environment] = js.undefined
  
  /**
    * If the asset is used as a bundle entry, this controls whether that bundle can be split
    * into multiple, or whether all of the dependencies must be placed in a single bundle.
    */
  val isBundleSplittable: js.UndefOr[Boolean] = js.undefined
  
  /** The source map for the asset. */
  val map: js.UndefOr[default | Null] = js.undefined
  
  /** Plugin-specific metadata for the asset. */
  val meta: js.UndefOr[Meta] = js.undefined
  
  /** The pipeline defined in .parcelrc that the asset should be processed with. */
  val pipeline: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Whether this asset can be omitted if none of its exports are being used.
    * This is initially set by the resolver, but can be overridden by transformers.
    */
  val sideEffects: js.UndefOr[Boolean] = js.undefined
  
  /** The symbols that the asset exports. */
  val symbols: js.UndefOr[ReadonlyMap[Symbol, LocLocal]] = js.undefined
  
  /** The asset's type. */
  val `type`: String
  
  /**
    * When a transformer returns multiple assets, it can give them unique keys to identify them.
    * This can be used to find assets during packaging, or to create dependencies between multiple
    * assets returned by a transformer by using the unique key as the dependency specifier.
    */
  val uniqueKey: js.UndefOr[String | Null] = js.undefined
}
object TransformerResult {
  
  inline def apply(`type`: String): TransformerResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformerResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TransformerResult] (val x: Self) extends AnyVal {
    
    inline def setAst(value: AST): Self = StObject.set(x, "ast", value.asInstanceOf[js.Any])
    
    inline def setAstNull: Self = StObject.set(x, "ast", null)
    
    inline def setAstUndefined: Self = StObject.set(x, "ast", js.undefined)
    
    inline def setBundleBehavior(value: BundleBehavior): Self = StObject.set(x, "bundleBehavior", value.asInstanceOf[js.Any])
    
    inline def setBundleBehaviorNull: Self = StObject.set(x, "bundleBehavior", null)
    
    inline def setBundleBehaviorUndefined: Self = StObject.set(x, "bundleBehavior", js.undefined)
    
    inline def setContent(value: Blob): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentNull: Self = StObject.set(x, "content", null)
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setDependencies(value: js.Array[DependencyOptions]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
    
    inline def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
    
    inline def setDependenciesVarargs(value: DependencyOptions*): Self = StObject.set(x, "dependencies", js.Array(value*))
    
    inline def setEnv(value: EnvironmentOptions | Environment): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
    
    inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
    
    inline def setIsBundleSplittable(value: Boolean): Self = StObject.set(x, "isBundleSplittable", value.asInstanceOf[js.Any])
    
    inline def setIsBundleSplittableUndefined: Self = StObject.set(x, "isBundleSplittable", js.undefined)
    
    inline def setMap(value: default): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    inline def setMapNull: Self = StObject.set(x, "map", null)
    
    inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
    
    inline def setMeta(value: Meta): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
    
    inline def setPipeline(value: String): Self = StObject.set(x, "pipeline", value.asInstanceOf[js.Any])
    
    inline def setPipelineNull: Self = StObject.set(x, "pipeline", null)
    
    inline def setPipelineUndefined: Self = StObject.set(x, "pipeline", js.undefined)
    
    inline def setSideEffects(value: Boolean): Self = StObject.set(x, "sideEffects", value.asInstanceOf[js.Any])
    
    inline def setSideEffectsUndefined: Self = StObject.set(x, "sideEffects", js.undefined)
    
    inline def setSymbols(value: ReadonlyMap[Symbol, LocLocal]): Self = StObject.set(x, "symbols", value.asInstanceOf[js.Any])
    
    inline def setSymbolsUndefined: Self = StObject.set(x, "symbols", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUniqueKey(value: String): Self = StObject.set(x, "uniqueKey", value.asInstanceOf[js.Any])
    
    inline def setUniqueKeyNull: Self = StObject.set(x, "uniqueKey", null)
    
    inline def setUniqueKeyUndefined: Self = StObject.set(x, "uniqueKey", js.undefined)
  }
}
