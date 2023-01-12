package typings.parcelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dependency extends StObject {
  
  /**
    * Controls the behavior of the bundle the resolved asset is placed into. Use in combination with `priority`
    * to determine when the bundle is loaded.
    *   - inline: The resolved asset will be placed into a new inline bundle. Inline bundles are not written
    *       to a separate file, but embedded into the parent bundle.
    *   - isolated: The resolved asset will be isolated from its parents in a separate bundle.
    *       Shared assets will be duplicated.
    */
  val bundleBehavior: js.UndefOr[BundleBehavior | Null] = js.undefined
  
  /** The environment of the dependency. */
  val env: Environment
  
  /** The id of the dependency. */
  val id: String
  
  /** Whether the dependency is an entry. */
  val isEntry: Boolean
  
  /** Whether the dependency is optional. If the dependency cannot be resolved, this will not fail the build. */
  val isOptional: Boolean
  
  /** The location within the source file where the dependency was found. */
  val loc: js.UndefOr[SourceLocation | Null] = js.undefined
  
  /** Plugin-specific metadata for the dependency. */
  val meta: Meta
  
  /**
    * When the dependency is a bundle entry (priority is "parallel" or "lazy"), this controls the naming
    * of that bundle. `needsStableName` indicates that the name should be stable over time, even when the
    * content of the bundle changes. This is useful for entries that a user would manually enter the URL
    * for, as well as for things like service workers or RSS feeds, where the URL must remain consistent
    * over time.
    */
  val needsStableName: Boolean
  
  /** The pipeline defined in .parcelrc that the dependency should be processed with. */
  val pipeline: js.UndefOr[String | Null] = js.undefined
  
  /**
    * When the dependency should be loaded.
    *   - sync: The dependency should be resolvable synchronously. The resolved asset will be placed
    *       in the same bundle as the parent, or another bundle that's already on the page.
    *   - parallel: The dependency should be placed in a separate bundle that's loaded in parallel
    *       with the current bundle.
    *   - lazy: The dependency should be placed in a separate bundle that's loaded later.
    * @default 'sync'
    */
  val priority: DependencyPriority
  
  /** The semver version range expected for the dependency. */
  val range: js.UndefOr[SemverRange | Null] = js.undefined
  
  /**
    * The file path where the dependency should be resolved from.
    * By default, this is the path of the source file where the dependency was specified.
    */
  val resolveFrom: js.UndefOr[FilePath | Null] = js.undefined
  
  /** The id of the asset with this dependency. */
  val sourceAssetId: js.UndefOr[String | Null] = js.undefined
  
  /** The type of the asset that referenced this dependency. */
  val sourceAssetType: js.UndefOr[String | Null] = js.undefined
  
  /** The file path of the asset with this dependency. */
  val sourcePath: js.UndefOr[FilePath | Null] = js.undefined
  
  /** The specifier used to resolve the dependency. */
  val specifier: DependencySpecifier
  
  /**
    * How the specifier should be interpreted.
    *   - esm: An ES module specifier. It is parsed as a URL, but bare specifiers are treated as node_modules.
    *   - commonjs: A CommonJS specifier. It is not parsed as a URL.
    *   - url: A URL that works as in a browser. Bare specifiers are treated as relative URLs.
    *   - custom: A custom specifier. Must be handled by a custom resolver plugin.
    */
  val specifierType: SpecifierType
  
  // TODO make immutable
  /** The symbols within the resolved module that the source file depends on. */
  val symbols: MutableDependencySymbols
  
  /** If this is an entry, this is the target that is associated with that entry. */
  val target: js.UndefOr[Target | Null] = js.undefined
}
object Dependency {
  
  inline def apply(
    env: Environment,
    id: String,
    isEntry: Boolean,
    isOptional: Boolean,
    meta: Meta,
    needsStableName: Boolean,
    priority: DependencyPriority,
    specifier: DependencySpecifier,
    specifierType: SpecifierType,
    symbols: MutableDependencySymbols
  ): Dependency = {
    val __obj = js.Dynamic.literal(env = env.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isEntry = isEntry.asInstanceOf[js.Any], isOptional = isOptional.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], needsStableName = needsStableName.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], specifier = specifier.asInstanceOf[js.Any], specifierType = specifierType.asInstanceOf[js.Any], symbols = symbols.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dependency]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Dependency] (val x: Self) extends AnyVal {
    
    inline def setBundleBehavior(value: BundleBehavior): Self = StObject.set(x, "bundleBehavior", value.asInstanceOf[js.Any])
    
    inline def setBundleBehaviorNull: Self = StObject.set(x, "bundleBehavior", null)
    
    inline def setBundleBehaviorUndefined: Self = StObject.set(x, "bundleBehavior", js.undefined)
    
    inline def setEnv(value: Environment): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIsEntry(value: Boolean): Self = StObject.set(x, "isEntry", value.asInstanceOf[js.Any])
    
    inline def setIsOptional(value: Boolean): Self = StObject.set(x, "isOptional", value.asInstanceOf[js.Any])
    
    inline def setLoc(value: SourceLocation): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
    
    inline def setLocNull: Self = StObject.set(x, "loc", null)
    
    inline def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
    
    inline def setMeta(value: Meta): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    inline def setNeedsStableName(value: Boolean): Self = StObject.set(x, "needsStableName", value.asInstanceOf[js.Any])
    
    inline def setPipeline(value: String): Self = StObject.set(x, "pipeline", value.asInstanceOf[js.Any])
    
    inline def setPipelineNull: Self = StObject.set(x, "pipeline", null)
    
    inline def setPipelineUndefined: Self = StObject.set(x, "pipeline", js.undefined)
    
    inline def setPriority(value: DependencyPriority): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setRange(value: SemverRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeNull: Self = StObject.set(x, "range", null)
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    inline def setResolveFrom(value: FilePath): Self = StObject.set(x, "resolveFrom", value.asInstanceOf[js.Any])
    
    inline def setResolveFromNull: Self = StObject.set(x, "resolveFrom", null)
    
    inline def setResolveFromUndefined: Self = StObject.set(x, "resolveFrom", js.undefined)
    
    inline def setSourceAssetId(value: String): Self = StObject.set(x, "sourceAssetId", value.asInstanceOf[js.Any])
    
    inline def setSourceAssetIdNull: Self = StObject.set(x, "sourceAssetId", null)
    
    inline def setSourceAssetIdUndefined: Self = StObject.set(x, "sourceAssetId", js.undefined)
    
    inline def setSourceAssetType(value: String): Self = StObject.set(x, "sourceAssetType", value.asInstanceOf[js.Any])
    
    inline def setSourceAssetTypeNull: Self = StObject.set(x, "sourceAssetType", null)
    
    inline def setSourceAssetTypeUndefined: Self = StObject.set(x, "sourceAssetType", js.undefined)
    
    inline def setSourcePath(value: FilePath): Self = StObject.set(x, "sourcePath", value.asInstanceOf[js.Any])
    
    inline def setSourcePathNull: Self = StObject.set(x, "sourcePath", null)
    
    inline def setSourcePathUndefined: Self = StObject.set(x, "sourcePath", js.undefined)
    
    inline def setSpecifier(value: DependencySpecifier): Self = StObject.set(x, "specifier", value.asInstanceOf[js.Any])
    
    inline def setSpecifierType(value: SpecifierType): Self = StObject.set(x, "specifierType", value.asInstanceOf[js.Any])
    
    inline def setSymbols(value: MutableDependencySymbols): Self = StObject.set(x, "symbols", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: Target): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetNull: Self = StObject.set(x, "target", null)
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
