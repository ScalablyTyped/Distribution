package typings.pdfjsDist

import org.scalablytyped.runtime.StringDictionary
import typings.std.HTMLCanvasElement
import typings.std.HTMLDivElement
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object annotationLayerBuilderMod {
  
  @JSImport("pdfjs-dist/types/web/annotation_layer_builder", "AnnotationLayerBuilder")
  @js.native
  open class AnnotationLayerBuilder protected () extends StObject {
    /**
      * @param {AnnotationLayerBuilderOptions} options
      */
    def this(hasPageDivPdfPageLinkServiceDownloadManagerAnnotationStorageImageResourcesPathRenderFormsL10nEnableScriptingHasJSActionsPromiseFieldObjectsPromiseMouseStateAnnotationCanvasMapAccessibilityManager: AnnotationLayerBuilderOptions) = this()
    
    var _accessibilityManager: Any = js.native
    
    var _annotationCanvasMap: Map[String, HTMLCanvasElement] = js.native
    
    var _cancelled: Boolean = js.native
    
    var _fieldObjectsPromise: js.Promise[StringDictionary[js.Array[js.Object]] | Null] = js.native
    
    var _hasJSActionsPromise: js.Promise[Boolean] = js.native
    
    var _mouseState: js.Object = js.native
    
    var annotationStorage: Any = js.native
    
    def cancel(): Unit = js.native
    
    var div: HTMLDivElement | Null = js.native
    
    var downloadManager: typings.pdfjsDist.interfacesMod.IDownloadManager = js.native
    
    var enableScripting: Boolean = js.native
    
    def hide(): Unit = js.native
    
    var imageResourcesPath: String = js.native
    
    var l10n: typings.pdfjsDist.interfacesMod.IL10n = js.native
    
    var linkService: typings.pdfjsDist.interfacesMod.IPDFLinkService = js.native
    
    var pageDiv: HTMLDivElement = js.native
    
    var pdfPage: typings.pdfjsDist.apiMod.PDFPageProxy = js.native
    
    /**
      * @param {PageViewport} viewport
      * @param {string} intent (default value is 'display')
      * @returns {Promise<void>} A promise that is resolved when rendering of the
      *   annotations is complete.
      */
    def render(viewport: PageViewport): js.Promise[Unit] = js.native
    def render(viewport: PageViewport, intent: String): js.Promise[Unit] = js.native
    
    var renderForms: Boolean = js.native
  }
  
  trait AnnotationLayerBuilderOptions extends StObject {
    
    var accessibilityManager: Any
    
    var annotationCanvasMap: js.UndefOr[Map[String, HTMLCanvasElement]] = js.undefined
    
    var annotationStorage: js.UndefOr[Any] = js.undefined
    
    var downloadManager: IDownloadManager
    
    var enableScripting: js.UndefOr[Boolean] = js.undefined
    
    var fieldObjectsPromise: js.UndefOr[js.Promise[StringDictionary[js.Array[js.Object]] | Null]] = js.undefined
    
    var hasJSActionsPromise: js.UndefOr[js.Promise[Boolean]] = js.undefined
    
    /**
      * - Path for image resources, mainly
      * for annotation icons. Include trailing slash.
      */
    var imageResourcesPath: js.UndefOr[String] = js.undefined
    
    /**
      * - Localization service.
      */
    var l10n: IL10n
    
    var linkService: IPDFLinkService
    
    var mouseState: js.UndefOr[js.Object] = js.undefined
    
    var pageDiv: HTMLDivElement
    
    var pdfPage: PDFPageProxy
    
    var renderForms: Boolean
  }
  object AnnotationLayerBuilderOptions {
    
    inline def apply(
      accessibilityManager: Any,
      downloadManager: IDownloadManager,
      l10n: IL10n,
      linkService: IPDFLinkService,
      pageDiv: HTMLDivElement,
      pdfPage: PDFPageProxy,
      renderForms: Boolean
    ): AnnotationLayerBuilderOptions = {
      val __obj = js.Dynamic.literal(accessibilityManager = accessibilityManager.asInstanceOf[js.Any], downloadManager = downloadManager.asInstanceOf[js.Any], l10n = l10n.asInstanceOf[js.Any], linkService = linkService.asInstanceOf[js.Any], pageDiv = pageDiv.asInstanceOf[js.Any], pdfPage = pdfPage.asInstanceOf[js.Any], renderForms = renderForms.asInstanceOf[js.Any])
      __obj.asInstanceOf[AnnotationLayerBuilderOptions]
    }
    
    extension [Self <: AnnotationLayerBuilderOptions](x: Self) {
      
      inline def setAccessibilityManager(value: Any): Self = StObject.set(x, "accessibilityManager", value.asInstanceOf[js.Any])
      
      inline def setAnnotationCanvasMap(value: Map[String, HTMLCanvasElement]): Self = StObject.set(x, "annotationCanvasMap", value.asInstanceOf[js.Any])
      
      inline def setAnnotationCanvasMapUndefined: Self = StObject.set(x, "annotationCanvasMap", js.undefined)
      
      inline def setAnnotationStorage(value: Any): Self = StObject.set(x, "annotationStorage", value.asInstanceOf[js.Any])
      
      inline def setAnnotationStorageUndefined: Self = StObject.set(x, "annotationStorage", js.undefined)
      
      inline def setDownloadManager(value: IDownloadManager): Self = StObject.set(x, "downloadManager", value.asInstanceOf[js.Any])
      
      inline def setEnableScripting(value: Boolean): Self = StObject.set(x, "enableScripting", value.asInstanceOf[js.Any])
      
      inline def setEnableScriptingUndefined: Self = StObject.set(x, "enableScripting", js.undefined)
      
      inline def setFieldObjectsPromise(value: js.Promise[StringDictionary[js.Array[js.Object]] | Null]): Self = StObject.set(x, "fieldObjectsPromise", value.asInstanceOf[js.Any])
      
      inline def setFieldObjectsPromiseUndefined: Self = StObject.set(x, "fieldObjectsPromise", js.undefined)
      
      inline def setHasJSActionsPromise(value: js.Promise[Boolean]): Self = StObject.set(x, "hasJSActionsPromise", value.asInstanceOf[js.Any])
      
      inline def setHasJSActionsPromiseUndefined: Self = StObject.set(x, "hasJSActionsPromise", js.undefined)
      
      inline def setImageResourcesPath(value: String): Self = StObject.set(x, "imageResourcesPath", value.asInstanceOf[js.Any])
      
      inline def setImageResourcesPathUndefined: Self = StObject.set(x, "imageResourcesPath", js.undefined)
      
      inline def setL10n(value: IL10n): Self = StObject.set(x, "l10n", value.asInstanceOf[js.Any])
      
      inline def setLinkService(value: IPDFLinkService): Self = StObject.set(x, "linkService", value.asInstanceOf[js.Any])
      
      inline def setMouseState(value: js.Object): Self = StObject.set(x, "mouseState", value.asInstanceOf[js.Any])
      
      inline def setMouseStateUndefined: Self = StObject.set(x, "mouseState", js.undefined)
      
      inline def setPageDiv(value: HTMLDivElement): Self = StObject.set(x, "pageDiv", value.asInstanceOf[js.Any])
      
      inline def setPdfPage(value: PDFPageProxy): Self = StObject.set(x, "pdfPage", value.asInstanceOf[js.Any])
      
      inline def setRenderForms(value: Boolean): Self = StObject.set(x, "renderForms", value.asInstanceOf[js.Any])
    }
  }
  
  type IDownloadManager = typings.pdfjsDist.interfacesMod.IDownloadManager
  
  type IL10n = typings.pdfjsDist.interfacesMod.IL10n
  
  type IPDFLinkService = typings.pdfjsDist.interfacesMod.IPDFLinkService
  
  type PDFPageProxy = typings.pdfjsDist.apiMod.PDFPageProxy
  
  type PageViewport = typings.pdfjsDist.displayUtilsMod.PageViewport
  
  type TextAccessibilityManager = Any
}
