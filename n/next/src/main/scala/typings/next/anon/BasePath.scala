package typings.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BasePath extends StObject {
  
  var basePath: String
  
  var i18n: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: next.next/dist/server/config-shared.NextConfig['i18n'] */ js.Any
  ] = js.undefined
  
  var page: String
  
  var pageIsDynamic: Boolean
  
  var rewrites: BeforeFiles
  
  var trailingSlash: js.UndefOr[Boolean] = js.undefined
}
object BasePath {
  
  inline def apply(basePath: String, page: String, pageIsDynamic: Boolean, rewrites: BeforeFiles): BasePath = {
    val __obj = js.Dynamic.literal(basePath = basePath.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], pageIsDynamic = pageIsDynamic.asInstanceOf[js.Any], rewrites = rewrites.asInstanceOf[js.Any])
    __obj.asInstanceOf[BasePath]
  }
  
  extension [Self <: BasePath](x: Self) {
    
    inline def setBasePath(value: String): Self = StObject.set(x, "basePath", value.asInstanceOf[js.Any])
    
    inline def setI18n(
      value: /* import warning: importer.ImportType#apply Failed type conversion: next.next/dist/server/config-shared.NextConfig['i18n'] */ js.Any
    ): Self = StObject.set(x, "i18n", value.asInstanceOf[js.Any])
    
    inline def setI18nUndefined: Self = StObject.set(x, "i18n", js.undefined)
    
    inline def setPage(value: String): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPageIsDynamic(value: Boolean): Self = StObject.set(x, "pageIsDynamic", value.asInstanceOf[js.Any])
    
    inline def setRewrites(value: BeforeFiles): Self = StObject.set(x, "rewrites", value.asInstanceOf[js.Any])
    
    inline def setTrailingSlash(value: Boolean): Self = StObject.set(x, "trailingSlash", value.asInstanceOf[js.Any])
    
    inline def setTrailingSlashUndefined: Self = StObject.set(x, "trailingSlash", js.undefined)
  }
}
