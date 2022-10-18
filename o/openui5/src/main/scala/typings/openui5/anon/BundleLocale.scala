package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BundleLocale extends StObject {
  
  /**
    * A locale in "BCP-47 language tag" notation specifying the locale in which to load the bundle; when not
    * given, the current session locale of UI5 is used (recommended)
    */
  var bundleLocale: js.UndefOr[String] = js.undefined
  
  /**
    * UI5 module name in dot notation, referring to the base ".properties" file; this name is resolved to a
    * path like the paths of normal UI5 modules, and ".properties" is then appended (e.g. a name like "myapp.i18n.myBundle"
    * can be given); relative module names are not supported
    */
  var bundleName: js.UndefOr[String] = js.undefined
  
  /**
    * URL pointing to the base ".properties" file of a bundle (".properties" file without any locale information,
    * e.g. "../../i18n/mybundle.properties"); relative URLs are evaluated relative to the document.baseURI
    */
  var bundleUrl: js.UndefOr[String] = js.undefined
}
object BundleLocale {
  
  inline def apply(): BundleLocale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BundleLocale]
  }
  
  extension [Self <: BundleLocale](x: Self) {
    
    inline def setBundleLocale(value: String): Self = StObject.set(x, "bundleLocale", value.asInstanceOf[js.Any])
    
    inline def setBundleLocaleUndefined: Self = StObject.set(x, "bundleLocale", js.undefined)
    
    inline def setBundleName(value: String): Self = StObject.set(x, "bundleName", value.asInstanceOf[js.Any])
    
    inline def setBundleNameUndefined: Self = StObject.set(x, "bundleName", js.undefined)
    
    inline def setBundleUrl(value: String): Self = StObject.set(x, "bundleUrl", value.asInstanceOf[js.Any])
    
    inline def setBundleUrlUndefined: Self = StObject.set(x, "bundleUrl", js.undefined)
  }
}
