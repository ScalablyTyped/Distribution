package typings.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BasePathI18n extends StObject {
  
  var basePath: js.UndefOr[String] = js.undefined
  
  var i18n: js.UndefOr[Locales | Null] = js.undefined
  
  var trailingSlash: js.UndefOr[Boolean] = js.undefined
}
object BasePathI18n {
  
  inline def apply(): BasePathI18n = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BasePathI18n]
  }
  
  extension [Self <: BasePathI18n](x: Self) {
    
    inline def setBasePath(value: String): Self = StObject.set(x, "basePath", value.asInstanceOf[js.Any])
    
    inline def setBasePathUndefined: Self = StObject.set(x, "basePath", js.undefined)
    
    inline def setI18n(value: Locales): Self = StObject.set(x, "i18n", value.asInstanceOf[js.Any])
    
    inline def setI18nNull: Self = StObject.set(x, "i18n", null)
    
    inline def setI18nUndefined: Self = StObject.set(x, "i18n", js.undefined)
    
    inline def setTrailingSlash(value: Boolean): Self = StObject.set(x, "trailingSlash", value.asInstanceOf[js.Any])
    
    inline def setTrailingSlashUndefined: Self = StObject.set(x, "trailingSlash", js.undefined)
  }
}
