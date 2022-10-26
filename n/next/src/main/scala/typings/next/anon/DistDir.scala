package typings.next.anon

import typings.next.nextStrings.app
import typings.next.nextStrings.pages
import typings.next.typesMod.ServerRuntime
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DistDir extends StObject {
  
  var configFileName: String
  
  var defaultLocale: js.UndefOr[String] = js.undefined
  
  var distDir: String
  
  var edgeInfo: js.UndefOr[Any] = js.undefined
  
  var enableUndici: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: next.next/dist/server/config-shared.NextConfigComplete['experimental']['enableUndici'] */ js.Any
  ] = js.undefined
  
  var hasServerComponents: js.UndefOr[Boolean] = js.undefined
  
  var httpAgentOptions: /* import warning: importer.ImportType#apply Failed type conversion: next.next/dist/server/config-shared.NextConfigComplete['httpAgentOptions'] */ js.Any
  
  var locales: js.UndefOr[js.Array[String]] = js.undefined
  
  var originalAppPath: js.UndefOr[String] = js.undefined
  
  var page: String
  
  var pageRuntime: ServerRuntime
  
  var pageType: js.UndefOr[pages | app] = js.undefined
  
  var parentId: js.UndefOr[Any] = js.undefined
  
  var runtimeEnvConfig: Any
}
object DistDir {
  
  inline def apply(
    configFileName: String,
    distDir: String,
    httpAgentOptions: /* import warning: importer.ImportType#apply Failed type conversion: next.next/dist/server/config-shared.NextConfigComplete['httpAgentOptions'] */ js.Any,
    page: String,
    runtimeEnvConfig: Any
  ): DistDir = {
    val __obj = js.Dynamic.literal(configFileName = configFileName.asInstanceOf[js.Any], distDir = distDir.asInstanceOf[js.Any], httpAgentOptions = httpAgentOptions.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], runtimeEnvConfig = runtimeEnvConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistDir]
  }
  
  extension [Self <: DistDir](x: Self) {
    
    inline def setConfigFileName(value: String): Self = StObject.set(x, "configFileName", value.asInstanceOf[js.Any])
    
    inline def setDefaultLocale(value: String): Self = StObject.set(x, "defaultLocale", value.asInstanceOf[js.Any])
    
    inline def setDefaultLocaleUndefined: Self = StObject.set(x, "defaultLocale", js.undefined)
    
    inline def setDistDir(value: String): Self = StObject.set(x, "distDir", value.asInstanceOf[js.Any])
    
    inline def setEdgeInfo(value: Any): Self = StObject.set(x, "edgeInfo", value.asInstanceOf[js.Any])
    
    inline def setEdgeInfoUndefined: Self = StObject.set(x, "edgeInfo", js.undefined)
    
    inline def setEnableUndici(
      value: /* import warning: importer.ImportType#apply Failed type conversion: next.next/dist/server/config-shared.NextConfigComplete['experimental']['enableUndici'] */ js.Any
    ): Self = StObject.set(x, "enableUndici", value.asInstanceOf[js.Any])
    
    inline def setEnableUndiciUndefined: Self = StObject.set(x, "enableUndici", js.undefined)
    
    inline def setHasServerComponents(value: Boolean): Self = StObject.set(x, "hasServerComponents", value.asInstanceOf[js.Any])
    
    inline def setHasServerComponentsUndefined: Self = StObject.set(x, "hasServerComponents", js.undefined)
    
    inline def setHttpAgentOptions(
      value: /* import warning: importer.ImportType#apply Failed type conversion: next.next/dist/server/config-shared.NextConfigComplete['httpAgentOptions'] */ js.Any
    ): Self = StObject.set(x, "httpAgentOptions", value.asInstanceOf[js.Any])
    
    inline def setLocales(value: js.Array[String]): Self = StObject.set(x, "locales", value.asInstanceOf[js.Any])
    
    inline def setLocalesUndefined: Self = StObject.set(x, "locales", js.undefined)
    
    inline def setLocalesVarargs(value: String*): Self = StObject.set(x, "locales", js.Array(value*))
    
    inline def setOriginalAppPath(value: String): Self = StObject.set(x, "originalAppPath", value.asInstanceOf[js.Any])
    
    inline def setOriginalAppPathUndefined: Self = StObject.set(x, "originalAppPath", js.undefined)
    
    inline def setPage(value: String): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPageRuntime(value: ServerRuntime): Self = StObject.set(x, "pageRuntime", value.asInstanceOf[js.Any])
    
    inline def setPageRuntimeUndefined: Self = StObject.set(x, "pageRuntime", js.undefined)
    
    inline def setPageType(value: pages | app): Self = StObject.set(x, "pageType", value.asInstanceOf[js.Any])
    
    inline def setPageTypeUndefined: Self = StObject.set(x, "pageType", js.undefined)
    
    inline def setParentId(value: Any): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
    
    inline def setParentIdUndefined: Self = StObject.set(x, "parentId", js.undefined)
    
    inline def setRuntimeEnvConfig(value: Any): Self = StObject.set(x, "runtimeEnvConfig", value.asInstanceOf[js.Any])
  }
}
