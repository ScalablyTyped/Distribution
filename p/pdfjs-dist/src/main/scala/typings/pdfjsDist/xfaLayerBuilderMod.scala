package typings.pdfjsDist

import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xfaLayerBuilderMod {
  
  @JSImport("pdfjs-dist/types/web/xfa_layer_builder", "XfaLayerBuilder")
  @js.native
  open class XfaLayerBuilder protected () extends StObject {
    /**
      * @param {XfaLayerBuilderOptions} options
      */
    def this(hasPageDivPdfPageAnnotationStorageLinkServiceXfaHtml: XfaLayerBuilderOptions) = this()
    
    var _cancelled: Boolean = js.native
    
    var annotationStorage: Any = js.native
    
    def cancel(): Unit = js.native
    
    var div: HTMLDivElement | Null = js.native
    
    def hide(): Unit = js.native
    
    var linkService: typings.pdfjsDist.interfacesMod.IPDFLinkService = js.native
    
    var pageDiv: HTMLDivElement = js.native
    
    var pdfPage: typings.pdfjsDist.apiMod.PDFPageProxy = js.native
    
    /**
      * @param {PageViewport} viewport
      * @param {string} intent (default value is 'display')
      * @returns {Promise<Object | void>} A promise that is resolved when rendering
      *   of the XFA layer is complete. The first rendering will return an object
      *   with a `textDivs` property that  can be used with the TextHighlighter.
      */
    def render(viewport: PageViewport): js.Promise[js.Object | Unit] = js.native
    def render(viewport: PageViewport, intent: String): js.Promise[js.Object | Unit] = js.native
    
    var xfaHtml: js.Object = js.native
  }
  
  type IPDFLinkService = typings.pdfjsDist.interfacesMod.IPDFLinkService
  
  type PDFPageProxy = typings.pdfjsDist.apiMod.PDFPageProxy
  
  type PageViewport = typings.pdfjsDist.displayUtilsMod.PageViewport
  
  trait XfaLayerBuilderOptions extends StObject {
    
    var annotationStorage: js.UndefOr[Any] = js.undefined
    
    var linkService: IPDFLinkService
    
    var pageDiv: HTMLDivElement
    
    var pdfPage: PDFPageProxy
    
    var xfaHtml: js.UndefOr[js.Object] = js.undefined
  }
  object XfaLayerBuilderOptions {
    
    inline def apply(linkService: IPDFLinkService, pageDiv: HTMLDivElement, pdfPage: PDFPageProxy): XfaLayerBuilderOptions = {
      val __obj = js.Dynamic.literal(linkService = linkService.asInstanceOf[js.Any], pageDiv = pageDiv.asInstanceOf[js.Any], pdfPage = pdfPage.asInstanceOf[js.Any])
      __obj.asInstanceOf[XfaLayerBuilderOptions]
    }
    
    extension [Self <: XfaLayerBuilderOptions](x: Self) {
      
      inline def setAnnotationStorage(value: Any): Self = StObject.set(x, "annotationStorage", value.asInstanceOf[js.Any])
      
      inline def setAnnotationStorageUndefined: Self = StObject.set(x, "annotationStorage", js.undefined)
      
      inline def setLinkService(value: IPDFLinkService): Self = StObject.set(x, "linkService", value.asInstanceOf[js.Any])
      
      inline def setPageDiv(value: HTMLDivElement): Self = StObject.set(x, "pageDiv", value.asInstanceOf[js.Any])
      
      inline def setPdfPage(value: PDFPageProxy): Self = StObject.set(x, "pdfPage", value.asInstanceOf[js.Any])
      
      inline def setXfaHtml(value: js.Object): Self = StObject.set(x, "xfaHtml", value.asInstanceOf[js.Any])
      
      inline def setXfaHtmlUndefined: Self = StObject.set(x, "xfaHtml", js.undefined)
    }
  }
}
