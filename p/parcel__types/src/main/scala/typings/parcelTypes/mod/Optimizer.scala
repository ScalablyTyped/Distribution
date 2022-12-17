package typings.parcelTypes.mod

import typings.parcelTypes.anon.BundleGraphConfig
import typings.parcelTypes.anon.GetSourceMapReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Optimizer[ConfigType, BundleConfigType] extends StObject {
  
  var loadBundleConfig: js.UndefOr[js.Function1[/* arg0 */ BundleGraphConfig, Async[BundleConfigType]]] = js.undefined
  
  var loadConfig: js.UndefOr[js.Function1[/* arg0 */ typings.parcelTypes.anon.Config, Async[ConfigType]]] = js.undefined
  
  def optimize(arg0: GetSourceMapReference[ConfigType, BundleConfigType]): Async[BundleResult]
}
object Optimizer {
  
  inline def apply[ConfigType, BundleConfigType](optimize: GetSourceMapReference[ConfigType, BundleConfigType] => Async[BundleResult]): Optimizer[ConfigType, BundleConfigType] = {
    val __obj = js.Dynamic.literal(optimize = js.Any.fromFunction1(optimize))
    __obj.asInstanceOf[Optimizer[ConfigType, BundleConfigType]]
  }
  
  extension [Self <: Optimizer[?, ?], ConfigType, BundleConfigType](x: Self & (Optimizer[ConfigType, BundleConfigType])) {
    
    inline def setLoadBundleConfig(value: /* arg0 */ BundleGraphConfig => Async[BundleConfigType]): Self = StObject.set(x, "loadBundleConfig", js.Any.fromFunction1(value))
    
    inline def setLoadBundleConfigUndefined: Self = StObject.set(x, "loadBundleConfig", js.undefined)
    
    inline def setLoadConfig(value: /* arg0 */ typings.parcelTypes.anon.Config => Async[ConfigType]): Self = StObject.set(x, "loadConfig", js.Any.fromFunction1(value))
    
    inline def setLoadConfigUndefined: Self = StObject.set(x, "loadConfig", js.undefined)
    
    inline def setOptimize(value: GetSourceMapReference[ConfigType, BundleConfigType] => Async[BundleResult]): Self = StObject.set(x, "optimize", js.Any.fromFunction1(value))
  }
}
