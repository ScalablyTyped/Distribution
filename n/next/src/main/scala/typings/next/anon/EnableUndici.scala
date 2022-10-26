package typings.next.anon

import typings.next.distServerDevStaticPathsWorkerMod.RuntimeConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnableUndici extends StObject {
  
  var config: RuntimeConfig
  
  var defaultLocale: js.UndefOr[String] = js.undefined
  
  var distDir: String
  
  var enableUndici: /* import warning: importer.ImportType#apply Failed type conversion: next.next/dist/server/config-shared.NextConfigComplete['enableUndici'] */ js.Any
  
  var httpAgentOptions: /* import warning: importer.ImportType#apply Failed type conversion: next.next/dist/server/config-shared.NextConfigComplete['httpAgentOptions'] */ js.Any
  
  var isAppPath: js.UndefOr[Boolean] = js.undefined
  
  var locales: js.UndefOr[js.Array[String]] = js.undefined
  
  var originalAppPath: js.UndefOr[String] = js.undefined
  
  var pathname: String
}
object EnableUndici {
  
  inline def apply(
    config: RuntimeConfig,
    distDir: String,
    enableUndici: /* import warning: importer.ImportType#apply Failed type conversion: next.next/dist/server/config-shared.NextConfigComplete['enableUndici'] */ js.Any,
    httpAgentOptions: /* import warning: importer.ImportType#apply Failed type conversion: next.next/dist/server/config-shared.NextConfigComplete['httpAgentOptions'] */ js.Any,
    pathname: String
  ): EnableUndici = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], distDir = distDir.asInstanceOf[js.Any], enableUndici = enableUndici.asInstanceOf[js.Any], httpAgentOptions = httpAgentOptions.asInstanceOf[js.Any], pathname = pathname.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnableUndici]
  }
  
  extension [Self <: EnableUndici](x: Self) {
    
    inline def setConfig(value: RuntimeConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setDefaultLocale(value: String): Self = StObject.set(x, "defaultLocale", value.asInstanceOf[js.Any])
    
    inline def setDefaultLocaleUndefined: Self = StObject.set(x, "defaultLocale", js.undefined)
    
    inline def setDistDir(value: String): Self = StObject.set(x, "distDir", value.asInstanceOf[js.Any])
    
    inline def setEnableUndici(
      value: /* import warning: importer.ImportType#apply Failed type conversion: next.next/dist/server/config-shared.NextConfigComplete['enableUndici'] */ js.Any
    ): Self = StObject.set(x, "enableUndici", value.asInstanceOf[js.Any])
    
    inline def setHttpAgentOptions(
      value: /* import warning: importer.ImportType#apply Failed type conversion: next.next/dist/server/config-shared.NextConfigComplete['httpAgentOptions'] */ js.Any
    ): Self = StObject.set(x, "httpAgentOptions", value.asInstanceOf[js.Any])
    
    inline def setIsAppPath(value: Boolean): Self = StObject.set(x, "isAppPath", value.asInstanceOf[js.Any])
    
    inline def setIsAppPathUndefined: Self = StObject.set(x, "isAppPath", js.undefined)
    
    inline def setLocales(value: js.Array[String]): Self = StObject.set(x, "locales", value.asInstanceOf[js.Any])
    
    inline def setLocalesUndefined: Self = StObject.set(x, "locales", js.undefined)
    
    inline def setLocalesVarargs(value: String*): Self = StObject.set(x, "locales", js.Array(value*))
    
    inline def setOriginalAppPath(value: String): Self = StObject.set(x, "originalAppPath", value.asInstanceOf[js.Any])
    
    inline def setOriginalAppPathUndefined: Self = StObject.set(x, "originalAppPath", js.undefined)
    
    inline def setPathname(value: String): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
  }
}
