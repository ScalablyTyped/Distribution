package typings.meteorUniverseI18n

import typings.node.httpMod.OutgoingHttpHeaders
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<meteor-universe-i18n.meteor/universe:i18n.i18nOptions> */
  trait Partiali18nOptions extends StObject {
    
    var close: js.UndefOr[String] = js.undefined
    
    var defaultLocale: js.UndefOr[String] = js.undefined
    
    var hideMissing: js.UndefOr[Boolean] = js.undefined
    
    var hostUrl: js.UndefOr[String] = js.undefined
    
    var open: js.UndefOr[String] = js.undefined
    
    var purify: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var sameLocaleOnServerConnection: js.UndefOr[Boolean] = js.undefined
    
    var translationsHeaders: js.UndefOr[OutgoingHttpHeaders] = js.undefined
  }
  object Partiali18nOptions {
    
    inline def apply(): Partiali18nOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Partiali18nOptions]
    }
    
    extension [Self <: Partiali18nOptions](x: Self) {
      
      inline def setClose(value: String): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
      
      inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
      
      inline def setDefaultLocale(value: String): Self = StObject.set(x, "defaultLocale", value.asInstanceOf[js.Any])
      
      inline def setDefaultLocaleUndefined: Self = StObject.set(x, "defaultLocale", js.undefined)
      
      inline def setHideMissing(value: Boolean): Self = StObject.set(x, "hideMissing", value.asInstanceOf[js.Any])
      
      inline def setHideMissingUndefined: Self = StObject.set(x, "hideMissing", js.undefined)
      
      inline def setHostUrl(value: String): Self = StObject.set(x, "hostUrl", value.asInstanceOf[js.Any])
      
      inline def setHostUrlUndefined: Self = StObject.set(x, "hostUrl", js.undefined)
      
      inline def setOpen(value: String): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      inline def setPurify(value: () => Unit): Self = StObject.set(x, "purify", js.Any.fromFunction0(value))
      
      inline def setPurifyUndefined: Self = StObject.set(x, "purify", js.undefined)
      
      inline def setSameLocaleOnServerConnection(value: Boolean): Self = StObject.set(x, "sameLocaleOnServerConnection", value.asInstanceOf[js.Any])
      
      inline def setSameLocaleOnServerConnectionUndefined: Self = StObject.set(x, "sameLocaleOnServerConnection", js.undefined)
      
      inline def setTranslationsHeaders(value: OutgoingHttpHeaders): Self = StObject.set(x, "translationsHeaders", value.asInstanceOf[js.Any])
      
      inline def setTranslationsHeadersUndefined: Self = StObject.set(x, "translationsHeaders", js.undefined)
    }
  }
}
