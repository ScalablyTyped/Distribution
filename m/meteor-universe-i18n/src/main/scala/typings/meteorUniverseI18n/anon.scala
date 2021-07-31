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
    
    @scala.inline
    def apply(): Partiali18nOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Partiali18nOptions]
    }
    
    @scala.inline
    implicit class Partiali18nOptionsMutableBuilder[Self <: Partiali18nOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClose(value: String): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
      
      @scala.inline
      def setDefaultLocale(value: String): Self = StObject.set(x, "defaultLocale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultLocaleUndefined: Self = StObject.set(x, "defaultLocale", js.undefined)
      
      @scala.inline
      def setHideMissing(value: Boolean): Self = StObject.set(x, "hideMissing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideMissingUndefined: Self = StObject.set(x, "hideMissing", js.undefined)
      
      @scala.inline
      def setHostUrl(value: String): Self = StObject.set(x, "hostUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostUrlUndefined: Self = StObject.set(x, "hostUrl", js.undefined)
      
      @scala.inline
      def setOpen(value: String): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      @scala.inline
      def setPurify(value: () => Unit): Self = StObject.set(x, "purify", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPurifyUndefined: Self = StObject.set(x, "purify", js.undefined)
      
      @scala.inline
      def setSameLocaleOnServerConnection(value: Boolean): Self = StObject.set(x, "sameLocaleOnServerConnection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSameLocaleOnServerConnectionUndefined: Self = StObject.set(x, "sameLocaleOnServerConnection", js.undefined)
      
      @scala.inline
      def setTranslationsHeaders(value: OutgoingHttpHeaders): Self = StObject.set(x, "translationsHeaders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTranslationsHeadersUndefined: Self = StObject.set(x, "translationsHeaders", js.undefined)
    }
  }
}
