package typings.next.anon

import typings.std.Record
import typings.std.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DomainLocale extends StObject {
  
  var basePath: String
  
  var buildId: js.UndefOr[String] = js.undefined
  
  var defaultLocale: js.UndefOr[String] = js.undefined
  
  var domainLocale: js.UndefOr[typings.next.distServerConfigSharedMod.DomainLocale] = js.undefined
  
  var flightSearchParameters: js.UndefOr[Record[String, String]] = js.undefined
  
  var locale: js.UndefOr[String] = js.undefined
  
  var options: typings.next.distServerWebNextUrlMod.Options
  
  var trailingSlash: js.UndefOr[Boolean] = js.undefined
  
  var url: URL
}
object DomainLocale {
  
  inline def apply(basePath: String, options: typings.next.distServerWebNextUrlMod.Options, url: URL): DomainLocale = {
    val __obj = js.Dynamic.literal(basePath = basePath.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomainLocale]
  }
  
  extension [Self <: DomainLocale](x: Self) {
    
    inline def setBasePath(value: String): Self = StObject.set(x, "basePath", value.asInstanceOf[js.Any])
    
    inline def setBuildId(value: String): Self = StObject.set(x, "buildId", value.asInstanceOf[js.Any])
    
    inline def setBuildIdUndefined: Self = StObject.set(x, "buildId", js.undefined)
    
    inline def setDefaultLocale(value: String): Self = StObject.set(x, "defaultLocale", value.asInstanceOf[js.Any])
    
    inline def setDefaultLocaleUndefined: Self = StObject.set(x, "defaultLocale", js.undefined)
    
    inline def setDomainLocale(value: typings.next.distServerConfigSharedMod.DomainLocale): Self = StObject.set(x, "domainLocale", value.asInstanceOf[js.Any])
    
    inline def setDomainLocaleUndefined: Self = StObject.set(x, "domainLocale", js.undefined)
    
    inline def setFlightSearchParameters(value: Record[String, String]): Self = StObject.set(x, "flightSearchParameters", value.asInstanceOf[js.Any])
    
    inline def setFlightSearchParametersUndefined: Self = StObject.set(x, "flightSearchParameters", js.undefined)
    
    inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setOptions(value: typings.next.distServerWebNextUrlMod.Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setTrailingSlash(value: Boolean): Self = StObject.set(x, "trailingSlash", value.asInstanceOf[js.Any])
    
    inline def setTrailingSlashUndefined: Self = StObject.set(x, "trailingSlash", js.undefined)
    
    inline def setUrl(value: URL): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
