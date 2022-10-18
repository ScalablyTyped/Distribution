package typings.parcelTypes.mod

import typings.parcelTypes.anon.Contents
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Optimizer[ConfigType] extends StObject {
  
  var loadConfig: js.UndefOr[
    js.Function1[/* arg0 */ typings.parcelTypes.anon.Config, js.Promise[ConfigType] | ConfigType]
  ] = js.undefined
  
  def optimize(arg0: Contents[ConfigType]): Async[BundleResult]
}
object Optimizer {
  
  inline def apply[ConfigType](optimize: Contents[ConfigType] => Async[BundleResult]): Optimizer[ConfigType] = {
    val __obj = js.Dynamic.literal(optimize = js.Any.fromFunction1(optimize))
    __obj.asInstanceOf[Optimizer[ConfigType]]
  }
  
  extension [Self <: Optimizer[?], ConfigType](x: Self & Optimizer[ConfigType]) {
    
    inline def setLoadConfig(value: /* arg0 */ typings.parcelTypes.anon.Config => js.Promise[ConfigType] | ConfigType): Self = StObject.set(x, "loadConfig", js.Any.fromFunction1(value))
    
    inline def setLoadConfigUndefined: Self = StObject.set(x, "loadConfig", js.undefined)
    
    inline def setOptimize(value: Contents[ConfigType] => Async[BundleResult]): Self = StObject.set(x, "optimize", js.Any.fromFunction1(value))
  }
}
