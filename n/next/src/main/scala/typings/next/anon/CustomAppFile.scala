package typings.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomAppFile extends StObject {
  
  var assetPrefix: String
  
  var customAppFile: js.UndefOr[js.RegExp] = js.undefined
  
  var disableStaticImages: /* import warning: importer.ImportType#apply Failed type conversion: next.next/dist/server/config-shared.NextConfigComplete['disableStaticImages'] */ js.Any
  
  var experimental: /* import warning: importer.ImportType#apply Failed type conversion: next.next/dist/server/config-shared.NextConfigComplete['experimental'] */ js.Any
  
  var future: /* import warning: importer.ImportType#apply Failed type conversion: next.next/dist/server/config-shared.NextConfigComplete['future'] */ js.Any
  
  var isDevelopment: Boolean
  
  var isEdgeRuntime: Boolean
  
  var isServer: Boolean
  
  var productionBrowserSourceMaps: Boolean
  
  var rootDirectory: String
  
  var sassOptions: Any
  
  var supportedBrowsers: js.UndefOr[js.Array[String]] = js.undefined
  
  var targetWeb: Boolean
}
object CustomAppFile {
  
  inline def apply(
    assetPrefix: String,
    disableStaticImages: /* import warning: importer.ImportType#apply Failed type conversion: next.next/dist/server/config-shared.NextConfigComplete['disableStaticImages'] */ js.Any,
    experimental: /* import warning: importer.ImportType#apply Failed type conversion: next.next/dist/server/config-shared.NextConfigComplete['experimental'] */ js.Any,
    future: /* import warning: importer.ImportType#apply Failed type conversion: next.next/dist/server/config-shared.NextConfigComplete['future'] */ js.Any,
    isDevelopment: Boolean,
    isEdgeRuntime: Boolean,
    isServer: Boolean,
    productionBrowserSourceMaps: Boolean,
    rootDirectory: String,
    sassOptions: Any,
    targetWeb: Boolean
  ): CustomAppFile = {
    val __obj = js.Dynamic.literal(assetPrefix = assetPrefix.asInstanceOf[js.Any], disableStaticImages = disableStaticImages.asInstanceOf[js.Any], experimental = experimental.asInstanceOf[js.Any], future = future.asInstanceOf[js.Any], isDevelopment = isDevelopment.asInstanceOf[js.Any], isEdgeRuntime = isEdgeRuntime.asInstanceOf[js.Any], isServer = isServer.asInstanceOf[js.Any], productionBrowserSourceMaps = productionBrowserSourceMaps.asInstanceOf[js.Any], rootDirectory = rootDirectory.asInstanceOf[js.Any], sassOptions = sassOptions.asInstanceOf[js.Any], targetWeb = targetWeb.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomAppFile]
  }
  
  extension [Self <: CustomAppFile](x: Self) {
    
    inline def setAssetPrefix(value: String): Self = StObject.set(x, "assetPrefix", value.asInstanceOf[js.Any])
    
    inline def setCustomAppFile(value: js.RegExp): Self = StObject.set(x, "customAppFile", value.asInstanceOf[js.Any])
    
    inline def setCustomAppFileUndefined: Self = StObject.set(x, "customAppFile", js.undefined)
    
    inline def setDisableStaticImages(
      value: /* import warning: importer.ImportType#apply Failed type conversion: next.next/dist/server/config-shared.NextConfigComplete['disableStaticImages'] */ js.Any
    ): Self = StObject.set(x, "disableStaticImages", value.asInstanceOf[js.Any])
    
    inline def setExperimental(
      value: /* import warning: importer.ImportType#apply Failed type conversion: next.next/dist/server/config-shared.NextConfigComplete['experimental'] */ js.Any
    ): Self = StObject.set(x, "experimental", value.asInstanceOf[js.Any])
    
    inline def setFuture(
      value: /* import warning: importer.ImportType#apply Failed type conversion: next.next/dist/server/config-shared.NextConfigComplete['future'] */ js.Any
    ): Self = StObject.set(x, "future", value.asInstanceOf[js.Any])
    
    inline def setIsDevelopment(value: Boolean): Self = StObject.set(x, "isDevelopment", value.asInstanceOf[js.Any])
    
    inline def setIsEdgeRuntime(value: Boolean): Self = StObject.set(x, "isEdgeRuntime", value.asInstanceOf[js.Any])
    
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
