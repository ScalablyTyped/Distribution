package typings.pdfobject

import typings.pdfobject.pdfobjectStrings.`2Dot2Dot3`
import typings.std.HTMLElement
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("pdfobject", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def embed(url: String): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("embed")(url.asInstanceOf[js.Any]).asInstanceOf[HTMLElement]
  inline def embed(url: String, target: Any): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("embed")(url.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  inline def embed(url: String, target: Any, options: Options): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("embed")(url.asInstanceOf[js.Any], target.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  inline def embed(url: String, target: Unit, options: Options): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("embed")(url.asInstanceOf[js.Any], target.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  
  @JSImport("pdfobject", "pdfobjectversion")
  @js.native
  val pdfobjectversion: `2Dot2Dot3` = js.native
  
  @JSImport("pdfobject", "supportsPDFs")
  @js.native
  val supportsPDFs: Boolean = js.native
  
  trait Options extends StObject {
    
    var PDFJS_URL: js.UndefOr[String] = js.undefined
    
    var assumptionMode: js.UndefOr[Boolean] = js.undefined
    
    var fallbackLink: js.UndefOr[Boolean | String] = js.undefined
    
    var forceIframe: js.UndefOr[Boolean] = js.undefined
    
    var forcePDFJS: js.UndefOr[Boolean] = js.undefined
    
    var height: js.UndefOr[String] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var omitInlineStyles: js.UndefOr[Boolean] = js.undefined
    
    var page: js.UndefOr[Boolean] = js.undefined
    
    var pdfOpenParams: js.UndefOr[Record[String, String | Double | Boolean]] = js.undefined
    
    var supportRedirect: js.UndefOr[Boolean] = js.undefined
    
    var suppressConsole: js.UndefOr[Boolean] = js.undefined
    
    var width: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAssumptionMode(value: Boolean): Self = StObject.set(x, "assumptionMode", value.asInstanceOf[js.Any])
      
      inline def setAssumptionModeUndefined: Self = StObject.set(x, "assumptionMode", js.undefined)
      
      inline def setFallbackLink(value: Boolean | String): Self = StObject.set(x, "fallbackLink", value.asInstanceOf[js.Any])
      
      inline def setFallbackLinkUndefined: Self = StObject.set(x, "fallbackLink", js.undefined)
      
      inline def setForceIframe(value: Boolean): Self = StObject.set(x, "forceIframe", value.asInstanceOf[js.Any])
      
      inline def setForceIframeUndefined: Self = StObject.set(x, "forceIframe", js.undefined)
      
      inline def setForcePDFJS(value: Boolean): Self = StObject.set(x, "forcePDFJS", value.asInstanceOf[js.Any])
      
      inline def setForcePDFJSUndefined: Self = StObject.set(x, "forcePDFJS", js.undefined)
      
      inline def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setOmitInlineStyles(value: Boolean): Self = StObject.set(x, "omitInlineStyles", value.asInstanceOf[js.Any])
      
      inline def setOmitInlineStylesUndefined: Self = StObject.set(x, "omitInlineStyles", js.undefined)
      
      inline def setPDFJS_URL(value: String): Self = StObject.set(x, "PDFJS_URL", value.asInstanceOf[js.Any])
      
      inline def setPDFJS_URLUndefined: Self = StObject.set(x, "PDFJS_URL", js.undefined)
      
      inline def setPage(value: Boolean): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
      
      inline def setPdfOpenParams(value: Record[String, String | Double | Boolean]): Self = StObject.set(x, "pdfOpenParams", value.asInstanceOf[js.Any])
      
      inline def setPdfOpenParamsUndefined: Self = StObject.set(x, "pdfOpenParams", js.undefined)
      
      inline def setSupportRedirect(value: Boolean): Self = StObject.set(x, "supportRedirect", value.asInstanceOf[js.Any])
      
      inline def setSupportRedirectUndefined: Self = StObject.set(x, "supportRedirect", js.undefined)
      
      inline def setSuppressConsole(value: Boolean): Self = StObject.set(x, "suppressConsole", value.asInstanceOf[js.Any])
      
      inline def setSuppressConsoleUndefined: Self = StObject.set(x, "suppressConsole", js.undefined)
      
      inline def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
