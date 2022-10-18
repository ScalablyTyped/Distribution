package typings.next.anon

import typings.next.distServerConfigSharedMod.I18NConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait I18n extends StObject {
  
  var basePath: js.UndefOr[String] = js.undefined
  
  var i18n: js.UndefOr[I18NConfig | Null] = js.undefined
  
  var trailingSlash: js.UndefOr[Boolean] = js.undefined
}
object I18n {
  
  inline def apply(): I18n = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[I18n]
  }
  
  extension [Self <: I18n](x: Self) {
    
    inline def setBasePath(value: String): Self = StObject.set(x, "basePath", value.asInstanceOf[js.Any])
    
    inline def setBasePathUndefined: Self = StObject.set(x, "basePath", js.undefined)
    
    inline def setI18n(value: I18NConfig): Self = StObject.set(x, "i18n", value.asInstanceOf[js.Any])
    
    inline def setI18nNull: Self = StObject.set(x, "i18n", null)
    
    inline def setI18nUndefined: Self = StObject.set(x, "i18n", js.undefined)
    
    inline def setTrailingSlash(value: Boolean): Self = StObject.set(x, "trailingSlash", value.asInstanceOf[js.Any])
    
    inline def setTrailingSlashUndefined: Self = StObject.set(x, "trailingSlash", js.undefined)
  }
}
