package typings.parcelTypes.anon

import typings.parcelTypes.mod.DependencyPriority
import typings.parcelTypes.mod.DependencySpecifier
import typings.parcelTypes.mod.EnvironmentOptions
import typings.parcelTypes.mod.FilePath
import typings.parcelTypes.mod.Meta
import typings.parcelTypes.mod.SemverRange
import typings.parcelTypes.mod.SourceLocation
import typings.parcelTypes.mod.SpecifierType
import typings.parcelTypes.mod.Symbol
import typings.std.ReadonlyMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined utility-types.utility-types.$Shape<@parcel/types.@parcel/types.DependencyOptions> */
trait ShapeDependencyOptions extends StObject {
  
  var bundleBehavior: js.UndefOr[typings.parcelTypes.mod.BundleBehavior] = js.undefined
  
  var env: js.UndefOr[EnvironmentOptions] = js.undefined
  
  var isOptional: js.UndefOr[Boolean] = js.undefined
  
  var loc: js.UndefOr[SourceLocation] = js.undefined
  
  var meta: js.UndefOr[Meta] = js.undefined
  
  var needsStableName: js.UndefOr[Boolean] = js.undefined
  
  var pipeline: js.UndefOr[String] = js.undefined
  
  var priority: js.UndefOr[DependencyPriority] = js.undefined
  
  var range: js.UndefOr[SemverRange] = js.undefined
  
  var resolveFrom: js.UndefOr[FilePath] = js.undefined
  
  var specifier: js.UndefOr[DependencySpecifier] = js.undefined
  
  var specifierType: js.UndefOr[SpecifierType] = js.undefined
  
  var symbols: js.UndefOr[ReadonlyMap[Symbol, Local]] = js.undefined
}
object ShapeDependencyOptions {
  
  inline def apply(): ShapeDependencyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShapeDependencyOptions]
  }
  
  extension [Self <: ShapeDependencyOptions](x: Self) {
    
    inline def setBundleBehavior(value: typings.parcelTypes.mod.BundleBehavior): Self = StObject.set(x, "bundleBehavior", value.asInstanceOf[js.Any])
    
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
    
    inline def setSpecifierTypeUndefined: Self = StObject.set(x, "specifierType", js.undefined)
    
    inline def setSpecifierUndefined: Self = StObject.set(x, "specifier", js.undefined)
    
    inline def setSymbols(value: ReadonlyMap[Symbol, Local]): Self = StObject.set(x, "symbols", value.asInstanceOf[js.Any])
    
    inline def setSymbolsUndefined: Self = StObject.set(x, "symbols", js.undefined)
  }
}
