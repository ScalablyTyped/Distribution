package typings.parcelTypes.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RawParcelConfig extends StObject {
  
  var bundler: js.UndefOr[PackageName] = js.undefined
  
  var compressors: js.UndefOr[Record[Glob, RawParcelConfigPipeline]] = js.undefined
  
  var `extends`: js.UndefOr[PackageName | FilePath | (js.Array[PackageName | FilePath])] = js.undefined
  
  var namers: js.UndefOr[RawParcelConfigPipeline] = js.undefined
  
  var optimizers: js.UndefOr[Record[Glob, RawParcelConfigPipeline]] = js.undefined
  
  var packagers: js.UndefOr[Record[Glob, PackageName]] = js.undefined
  
  var reporters: js.UndefOr[RawParcelConfigPipeline] = js.undefined
  
  var resolvers: js.UndefOr[RawParcelConfigPipeline] = js.undefined
  
  var runtimes: js.UndefOr[RawParcelConfigPipeline] = js.undefined
  
  var transformers: js.UndefOr[Record[Glob, RawParcelConfigPipeline]] = js.undefined
  
  var validators: js.UndefOr[Record[Glob, RawParcelConfigPipeline]] = js.undefined
}
object RawParcelConfig {
  
  inline def apply(): RawParcelConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RawParcelConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RawParcelConfig] (val x: Self) extends AnyVal {
    
    inline def setBundler(value: PackageName): Self = StObject.set(x, "bundler", value.asInstanceOf[js.Any])
    
    inline def setBundlerUndefined: Self = StObject.set(x, "bundler", js.undefined)
    
    inline def setCompressors(value: Record[Glob, RawParcelConfigPipeline]): Self = StObject.set(x, "compressors", value.asInstanceOf[js.Any])
    
    inline def setCompressorsUndefined: Self = StObject.set(x, "compressors", js.undefined)
    
    inline def setExtends(value: PackageName | FilePath | (js.Array[PackageName | FilePath])): Self = StObject.set(x, "extends", value.asInstanceOf[js.Any])
    
    inline def setExtendsUndefined: Self = StObject.set(x, "extends", js.undefined)
    
    inline def setExtendsVarargs(value: (PackageName | FilePath)*): Self = StObject.set(x, "extends", js.Array(value*))
    
    inline def setNamers(value: RawParcelConfigPipeline): Self = StObject.set(x, "namers", value.asInstanceOf[js.Any])
    
    inline def setNamersUndefined: Self = StObject.set(x, "namers", js.undefined)
    
    inline def setNamersVarargs(value: PackageName*): Self = StObject.set(x, "namers", js.Array(value*))
    
    inline def setOptimizers(value: Record[Glob, RawParcelConfigPipeline]): Self = StObject.set(x, "optimizers", value.asInstanceOf[js.Any])
    
    inline def setOptimizersUndefined: Self = StObject.set(x, "optimizers", js.undefined)
    
    inline def setPackagers(value: Record[Glob, PackageName]): Self = StObject.set(x, "packagers", value.asInstanceOf[js.Any])
    
    inline def setPackagersUndefined: Self = StObject.set(x, "packagers", js.undefined)
    
    inline def setReporters(value: RawParcelConfigPipeline): Self = StObject.set(x, "reporters", value.asInstanceOf[js.Any])
    
    inline def setReportersUndefined: Self = StObject.set(x, "reporters", js.undefined)
    
    inline def setReportersVarargs(value: PackageName*): Self = StObject.set(x, "reporters", js.Array(value*))
    
    inline def setResolvers(value: RawParcelConfigPipeline): Self = StObject.set(x, "resolvers", value.asInstanceOf[js.Any])
    
    inline def setResolversUndefined: Self = StObject.set(x, "resolvers", js.undefined)
    
    inline def setResolversVarargs(value: PackageName*): Self = StObject.set(x, "resolvers", js.Array(value*))
    
    inline def setRuntimes(value: RawParcelConfigPipeline): Self = StObject.set(x, "runtimes", value.asInstanceOf[js.Any])
    
    inline def setRuntimesUndefined: Self = StObject.set(x, "runtimes", js.undefined)
    
    inline def setRuntimesVarargs(value: PackageName*): Self = StObject.set(x, "runtimes", js.Array(value*))
    
    inline def setTransformers(value: Record[Glob, RawParcelConfigPipeline]): Self = StObject.set(x, "transformers", value.asInstanceOf[js.Any])
    
    inline def setTransformersUndefined: Self = StObject.set(x, "transformers", js.undefined)
    
    inline def setValidators(value: Record[Glob, RawParcelConfigPipeline]): Self = StObject.set(x, "validators", value.asInstanceOf[js.Any])
    
    inline def setValidatorsUndefined: Self = StObject.set(x, "validators", js.undefined)
  }
}
