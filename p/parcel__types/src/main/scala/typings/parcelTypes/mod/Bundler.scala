package typings.parcelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bundler[ConfigType] extends StObject {
  
  def bundle(arg0: typings.parcelTypes.anon.BundleGraph[ConfigType]): Async[Unit]
  
  var loadConfig: js.UndefOr[
    js.Function1[/* arg0 */ typings.parcelTypes.anon.Config, js.Promise[ConfigType] | ConfigType]
  ] = js.undefined
  
  def optimize(arg0: typings.parcelTypes.anon.BundleGraph[ConfigType]): Async[Unit]
}
object Bundler {
  
  inline def apply[ConfigType](
    bundle: typings.parcelTypes.anon.BundleGraph[ConfigType] => Async[Unit],
    optimize: typings.parcelTypes.anon.BundleGraph[ConfigType] => Async[Unit]
  ): Bundler[ConfigType] = {
    val __obj = js.Dynamic.literal(bundle = js.Any.fromFunction1(bundle), optimize = js.Any.fromFunction1(optimize))
    __obj.asInstanceOf[Bundler[ConfigType]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Bundler[?], ConfigType] (val x: Self & Bundler[ConfigType]) extends AnyVal {
    
    inline def setBundle(value: typings.parcelTypes.anon.BundleGraph[ConfigType] => Async[Unit]): Self = StObject.set(x, "bundle", js.Any.fromFunction1(value))
    
    inline def setLoadConfig(value: /* arg0 */ typings.parcelTypes.anon.Config => js.Promise[ConfigType] | ConfigType): Self = StObject.set(x, "loadConfig", js.Any.fromFunction1(value))
    
    inline def setLoadConfigUndefined: Self = StObject.set(x, "loadConfig", js.undefined)
    
    inline def setOptimize(value: typings.parcelTypes.anon.BundleGraph[ConfigType] => Async[Unit]): Self = StObject.set(x, "optimize", js.Any.fromFunction1(value))
  }
}
