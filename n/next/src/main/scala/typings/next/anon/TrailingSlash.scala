package typings.next.anon

import typings.next.distServerConfigSharedMod.I18NConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TrailingSlash extends StObject {
  
  var basePath: js.UndefOr[String] = js.undefined
  
  var i18n: js.UndefOr[I18NConfig] = js.undefined
  
  var trailingSlash: js.UndefOr[Boolean] = js.undefined
}
object TrailingSlash {
  
  inline def apply(): TrailingSlash = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrailingSlash]
  }
  
  extension [Self <: TrailingSlash](x: Self) {
    
    inline def setBasePath(value: String): Self = StObject.set(x, "basePath", value.asInstanceOf[js.Any])
    
    inline def setBasePathUndefined: Self = StObject.set(x, "basePath", js.undefined)
    
    inline def setI18n(value: I18NConfig): Self = StObject.set(x, "i18n", value.asInstanceOf[js.Any])
    
    inline def setI18nUndefined: Self = StObject.set(x, "i18n", js.undefined)
    
    inline def setTrailingSlash(value: Boolean): Self = StObject.set(x, "trailingSlash", value.asInstanceOf[js.Any])
    
    inline def setTrailingSlashUndefined: Self = StObject.set(x, "trailingSlash", js.undefined)
  }
}
