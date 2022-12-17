package typings.parcelTypes.mod

import typings.parcelTypes.anon.Local
import typings.std.ReadonlyMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DependencyOptions extends StObject {
  
  /**
    * Controls the behavior of the bundle the resolved asset is placed into. Use in combination with `priority`
    * to determine when the bundle is loaded.
    *   - inline: The resolved asset will be placed into a new inline bundle. Inline bundles are not written
    *       to a separate file, but embedded into the parent bundle.
    *   - isolated: The resolved asset will be isolated from its parents in a separate bundle.
    *       Shared assets will be duplicated.
    */
  val bundleBehavior: js.UndefOr[BundleBehavior] = js.undefined
  
  /** The environment of the dependency. */
  val env: js.UndefOr[EnvironmentOptions] = js.undefined
  
  /** Whether the dependency is optional. If the dependency cannot be resolved, this will not fail the build. */
  val isOptional: js.UndefOr[Boolean] = js.undefined
  
  /** The location within the source file where the dependency was found. */
  val loc: js.UndefOr[SourceLocation] = js.undefined
  
  /** Plugin-specific metadata for the dependency. */
  val meta: js.UndefOr[Meta] = js.undefined
  
  /**
    * When the dependency is a bundle entry (priority is "parallel" or "lazy"), this controls the naming
    * of that bundle. `needsStableName` indicates that the name should be stable over time, even when the
    * content of the bundle changes. This is useful for entries that a user would manually enter the URL
    * for, as well as for things like service workers or RSS feeds, where the URL must remain consistent
    * over time.
    */
  val needsStableName: js.UndefOr[Boolean] = js.undefined
  
  /** The pipeline defined in .parcelrc that the dependency should be processed with. */
  val pipeline: js.UndefOr[String] = js.undefined
  
  /**
    * When the dependency should be loaded.
    *   - sync: The dependency should be resolvable synchronously. The resolved asset will be placed
    *       in the same bundle as the parent, or another bundle that's already on the page.
    *   - parallel: The dependency should be placed in a separate bundle that's loaded in parallel
    *       with the current bundle.
    *   - lazy: The dependency should be placed in a separate bundle that's loaded later.
    * @default 'sync'
    */
  val priority: js.UndefOr[DependencyPriority] = js.undefined
  
  /** The semver version range expected for the dependency. */
  val range: js.UndefOr[SemverRange] = js.undefined
  
  /**
    * The file path where the dependency should be resolved from.
    * By default, this is the path of the source file where the dependency was specified.
    */
  val resolveFrom: js.UndefOr[FilePath] = js.undefined
  
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
  
  /** The symbols within the resolved module that the source file depends on. */
  val symbols: js.UndefOr[ReadonlyMap[Symbol, Local]] = js.undefined
}
object DependencyOptions {
  
  inline def apply(specifier: DependencySpecifier, specifierType: SpecifierType): DependencyOptions = {
    val __obj = js.Dynamic.literal(specifier = specifier.asInstanceOf[js.Any], specifierType = specifierType.asInstanceOf[js.Any])
    __obj.asInstanceOf[DependencyOptions]
  }
  
  extension [Self <: DependencyOptions](x: Self) {
    
    inline def setBundleBehavior(value: BundleBehavior): Self = StObject.set(x, "bundleBehavior", value.asInstanceOf[js.Any])
    
    inline def setBundleBehaviorUndefined: Self = StObject.set(x, "bundleBehavior", js.undefined)
    
    inline def setEnv(value: EnvironmentOptions): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
    
    inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
    
    inline def setIsOptional(value: Boolean): Self = StObject.set(x, "isOptional", value.asInstanceOf[js.Any])
    
    inline def setIsOptionalUndefined: Self = StObject.set(x, "isOptional", js.undefined)
    
    inline def setLoc(value: SourceLocation): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
    
    inline def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
    
    inline def setMeta(value: Meta): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
    
    inline def setNeedsStableName(value: Boolean): Self = StObject.set(x, "needsStableName", value.asInstanceOf[js.Any])
    
    inline def setNeedsStableNameUndefined: Self = StObject.set(x, "needsStableName", js.undefined)
    
    inline def setPipeline(value: String): Self = StObject.set(x, "pipeline", value.asInstanceOf[js.Any])
    
    inline def setPipelineUndefined: Self = StObject.set(x, "pipeline", js.undefined)
    
    inline def setPriority(value: DependencyPriority): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    inline def setRange(value: SemverRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    inline def setResolveFrom(value: FilePath): Self = StObject.set(x, "resolveFrom", value.asInstanceOf[js.Any])
    
    inline def setResolveFromUndefined: Self = StObject.set(x, "resolveFrom", js.undefined)
    
    inline def setSpecifier(value: DependencySpecifier): Self = StObject.set(x, "specifier", value.asInstanceOf[js.Any])
    
    inline def setSpecifierType(value: SpecifierType): Self = StObject.set(x, "specifierType", value.asInstanceOf[js.Any])
    
    inline def setSymbols(value: ReadonlyMap[Symbol, Local]): Self = StObject.set(x, "symbols", value.asInstanceOf[js.Any])
    
    inline def setSymbolsUndefined: Self = StObject.set(x, "symbols", js.undefined)
  }
}
