package typings.parcelTypes.mod

import typings.parcelTypes.anon.BundleBundleGraph
import typings.parcelTypes.anon.GetInlineBundleContents
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Packager[ConfigType, BundleConfigType] extends StObject {
  
  @JSName("package")
  def _package(arg0: GetInlineBundleContents[ConfigType, BundleConfigType]): Async[BundleResult]
  
  var loadBundleConfig: js.UndefOr[js.Function1[/* arg0 */ BundleBundleGraph, Async[BundleConfigType]]] = js.undefined
  
  var loadConfig: js.UndefOr[js.Function1[/* arg0 */ typings.parcelTypes.anon.Config, Async[ConfigType]]] = js.undefined
}
object Packager {
  
  inline def apply[ConfigType, BundleConfigType](_package: GetInlineBundleContents[ConfigType, BundleConfigType] => Async[BundleResult]): Packager[ConfigType, BundleConfigType] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("package")(js.Any.fromFunction1(_package))
    __obj.asInstanceOf[Packager[ConfigType, BundleConfigType]]
  }
  
  extension [Self <: Packager[?, ?], ConfigType, BundleConfigType](x: Self & (Packager[ConfigType, BundleConfigType])) {
    
    inline def setLoadBundleConfig(value: /* arg0 */ BundleBundleGraph => Async[BundleConfigType]): Self = StObject.set(x, "loadBundleConfig", js.Any.fromFunction1(value))
    
    inline def setLoadBundleConfigUndefined: Self = StObject.set(x, "loadBundleConfig", js.undefined)
    
    inline def setLoadConfig(value: /* arg0 */ typings.parcelTypes.anon.Config => Async[ConfigType]): Self = StObject.set(x, "loadConfig", js.Any.fromFunction1(value))
    
    inline def setLoadConfigUndefined: Self = StObject.set(x, "loadConfig", js.undefined)
    
    inline def set_package(value: GetInlineBundleContents[ConfigType, BundleConfigType] => Async[BundleResult]): Self = StObject.set(x, "package", js.Any.fromFunction1(value))
  }
}
