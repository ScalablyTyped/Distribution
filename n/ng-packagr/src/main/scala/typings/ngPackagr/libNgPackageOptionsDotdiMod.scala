package typings.ngPackagr

import typings.injectionJs.mod.InjectionToken
import typings.injectionJs.providerMod.Provider
import typings.injectionJs.providerMod.ValueProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libNgPackageOptionsDotdiMod {
  
  @JSImport("ng-packagr/lib/ng-package/options.di", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ng-packagr/lib/ng-package/options.di", "DEFAULT_OPTIONS_PROVIDER")
  @js.native
  val DEFAULT_OPTIONS_PROVIDER: Provider = js.native
  
  @JSImport("ng-packagr/lib/ng-package/options.di", "OPTIONS_TOKEN")
  @js.native
  val OPTIONS_TOKEN: InjectionToken[NgPackagrOptions] = js.native
  
  inline def provideOptions(): ValueProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("provideOptions")().asInstanceOf[ValueProvider]
  inline def provideOptions(options: NgPackagrOptions): ValueProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("provideOptions")(options.asInstanceOf[js.Any]).asInstanceOf[ValueProvider]
  
  trait NgPackagrOptions extends StObject {
    
    var cacheDirectory: js.UndefOr[String] = js.undefined
    
    var cacheEnabled: js.UndefOr[Boolean] = js.undefined
    
    /** Whether or not ng-packagr will watch for file changes and perform an incremental build. */
    var watch: js.UndefOr[Boolean] = js.undefined
  }
  object NgPackagrOptions {
    
    inline def apply(): NgPackagrOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NgPackagrOptions]
    }
    
    extension [Self <: NgPackagrOptions](x: Self) {
      
      inline def setCacheDirectory(value: String): Self = StObject.set(x, "cacheDirectory", value.asInstanceOf[js.Any])
      
      inline def setCacheDirectoryUndefined: Self = StObject.set(x, "cacheDirectory", js.undefined)
      
      inline def setCacheEnabled(value: Boolean): Self = StObject.set(x, "cacheEnabled", value.asInstanceOf[js.Any])
      
      inline def setCacheEnabledUndefined: Self = StObject.set(x, "cacheEnabled", js.undefined)
      
      inline def setWatch(value: Boolean): Self = StObject.set(x, "watch", value.asInstanceOf[js.Any])
      
      inline def setWatchUndefined: Self = StObject.set(x, "watch", js.undefined)
    }
  }
}
