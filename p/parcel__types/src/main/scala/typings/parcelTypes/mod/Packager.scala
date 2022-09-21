package typings.parcelTypes.mod

import typings.parcelTypes.anon.GetInlineBundleContents
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Packager[ConfigType] extends StObject {
  
  @JSName("package")
  def _package(arg0: GetInlineBundleContents[ConfigType]): Async[BundleResult]
  
  var loadConfig: js.UndefOr[
    js.Function1[/* arg0 */ typings.parcelTypes.anon.Config, js.Promise[ConfigType] | ConfigType]
  ] = js.undefined
}
object Packager {
  
  inline def apply[ConfigType](_package: GetInlineBundleContents[ConfigType] => Async[BundleResult]): Packager[ConfigType] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("package")(js.Any.fromFunction1(_package))
    __obj.asInstanceOf[Packager[ConfigType]]
  }
  
  extension [Self <: Packager[?], ConfigType](x: Self & Packager[ConfigType]) {
    
    inline def setLoadConfig(value: /* arg0 */ typings.parcelTypes.anon.Config => js.Promise[ConfigType] | ConfigType): Self = StObject.set(x, "loadConfig", js.Any.fromFunction1(value))
    
    inline def setLoadConfigUndefined: Self = StObject.set(x, "loadConfig", js.undefined)
    
    inline def set_package(value: GetInlineBundleContents[ConfigType] => Async[BundleResult]): Self = StObject.set(x, "package", js.Any.fromFunction1(value))
  }
}
