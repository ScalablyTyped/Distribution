package typings.next

import typings.next.distCompiledWebpackWebpackMod.webpack.Configuration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distBuildWebpackConfigUtilsMod {
  
  @JSImport("next/dist/build/webpack/config/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def pipe[R](fns: (js.Function1[/* a */ R, R | js.Promise[R]])*): js.Function1[/* param */ R, R | js.Promise[R]] = ^.asInstanceOf[js.Dynamic].applyDynamic("pipe")(fns.asInstanceOf[Seq[js.Any]]*).asInstanceOf[js.Function1[/* param */ R, R | js.Promise[R]]]
  
  trait ConfigurationContext extends StObject {
    
    var assetPrefix: String
    
    var customAppFile: js.UndefOr[js.RegExp] = js.undefined
    
    var experimental: /* import warning: importer.ImportType#apply Failed type conversion: next.next/dist/server/config-shared.NextConfigComplete['experimental'] */ js.Any
    
    var future: /* import warning: importer.ImportType#apply Failed type conversion: next.next/dist/server/config-shared.NextConfigComplete['future'] */ js.Any
    
    var isClient: Boolean
    
    var isDevelopment: Boolean
    
    var isEdgeRuntime: Boolean
    
    var isProduction: Boolean
    
    var isServer: Boolean
    
    var productionBrowserSourceMaps: Boolean
    
    var rootDirectory: String
    
    var sassOptions: Any
    
    var supportedBrowsers: js.UndefOr[js.Array[String]] = js.undefined
    
    var targetWeb: Boolean
  }
  object ConfigurationContext {
    
    inline def apply(
      assetPrefix: String,
      experimental: /* import warning: importer.ImportType#apply Failed type conversion: next.next/dist/server/config-shared.NextConfigComplete['experimental'] */ js.Any,
      future: /* import warning: importer.ImportType#apply Failed type conversion: next.next/dist/server/config-shared.NextConfigComplete['future'] */ js.Any,
      isClient: Boolean,
      isDevelopment: Boolean,
      isEdgeRuntime: Boolean,
      isProduction: Boolean,
      isServer: Boolean,
      productionBrowserSourceMaps: Boolean,
      rootDirectory: String,
      sassOptions: Any,
      targetWeb: Boolean
    ): ConfigurationContext = {
      val __obj = js.Dynamic.literal(assetPrefix = assetPrefix.asInstanceOf[js.Any], experimental = experimental.asInstanceOf[js.Any], future = future.asInstanceOf[js.Any], isClient = isClient.asInstanceOf[js.Any], isDevelopment = isDevelopment.asInstanceOf[js.Any], isEdgeRuntime = isEdgeRuntime.asInstanceOf[js.Any], isProduction = isProduction.asInstanceOf[js.Any], isServer = isServer.asInstanceOf[js.Any], productionBrowserSourceMaps = productionBrowserSourceMaps.asInstanceOf[js.Any], rootDirectory = rootDirectory.asInstanceOf[js.Any], sassOptions = sassOptions.asInstanceOf[js.Any], targetWeb = targetWeb.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConfigurationContext]
    }
    
    extension [Self <: ConfigurationContext](x: Self) {
      
      inline def setAssetPrefix(value: String): Self = StObject.set(x, "assetPrefix", value.asInstanceOf[js.Any])
      
      inline def setCustomAppFile(value: js.RegExp): Self = StObject.set(x, "customAppFile", value.asInstanceOf[js.Any])
      
      inline def setCustomAppFileUndefined: Self = StObject.set(x, "customAppFile", js.undefined)
      
      inline def setExperimental(
        value: /* import warning: importer.ImportType#apply Failed type conversion: next.next/dist/server/config-shared.NextConfigComplete['experimental'] */ js.Any
      ): Self = StObject.set(x, "experimental", value.asInstanceOf[js.Any])
      
      inline def setFuture(
        value: /* import warning: importer.ImportType#apply Failed type conversion: next.next/dist/server/config-shared.NextConfigComplete['future'] */ js.Any
      ): Self = StObject.set(x, "future", value.asInstanceOf[js.Any])
      
      inline def setIsClient(value: Boolean): Self = StObject.set(x, "isClient", value.asInstanceOf[js.Any])
      
      inline def setIsDevelopment(value: Boolean): Self = StObject.set(x, "isDevelopment", value.asInstanceOf[js.Any])
      
      inline def setIsEdgeRuntime(value: Boolean): Self = StObject.set(x, "isEdgeRuntime", value.asInstanceOf[js.Any])
      
      inline def setIsProduction(value: Boolean): Self = StObject.set(x, "isProduction", value.asInstanceOf[js.Any])
      
      inline def setIsServer(value: Boolean): Self = StObject.set(x, "isServer", value.asInstanceOf[js.Any])
      
      inline def setProductionBrowserSourceMaps(value: Boolean): Self = StObject.set(x, "productionBrowserSourceMaps", value.asInstanceOf[js.Any])
      
      inline def setRootDirectory(value: String): Self = StObject.set(x, "rootDirectory", value.asInstanceOf[js.Any])
      
      inline def setSassOptions(value: Any): Self = StObject.set(x, "sassOptions", value.asInstanceOf[js.Any])
      
      inline def setSupportedBrowsers(value: js.Array[String]): Self = StObject.set(x, "supportedBrowsers", value.asInstanceOf[js.Any])
      
      inline def setSupportedBrowsersUndefined: Self = StObject.set(x, "supportedBrowsers", js.undefined)
      
      inline def setSupportedBrowsersVarargs(value: String*): Self = StObject.set(x, "supportedBrowsers", js.Array(value*))
      
      inline def setTargetWeb(value: Boolean): Self = StObject.set(x, "targetWeb", value.asInstanceOf[js.Any])
    }
  }
  
  type ConfigurationFn = js.Function1[/* a */ Configuration, Configuration]
}
