package typings.pdfjsDist

import typings.pdfjsDist.anon.AccessibilityManager
import typings.pdfjsDist.anon.AnnotationCanvasMap
import typings.pdfjsDist.anon.AnnotationStorage
import typings.pdfjsDist.anon.EnhanceTextSelection
import typings.pdfjsDist.anon.PdfPage
import typings.std.Blob
import typings.std.HTMLAnchorElement
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interfacesMod {
  
  @JSImport("pdfjs-dist/types/web/interfaces", "IDownloadManager")
  @js.native
  open class IDownloadManager () extends StObject {
    
    /**
      * @param {Blob} blob
      * @param {string} url
      * @param {string} filename
      */
    def download(blob: Blob, url: String, filename: String): Unit = js.native
    
    /**
      * @param {Uint8Array} data
      * @param {string} filename
      * @param {string} [contentType]
      */
    def downloadData(data: js.typedarray.Uint8Array, filename: String): Unit = js.native
    def downloadData(data: js.typedarray.Uint8Array, filename: String, contentType: String): Unit = js.native
    
    /**
      * @param {string} url
      * @param {string} filename
      */
    def downloadUrl(url: String, filename: String): Unit = js.native
    
    /**
      * @param {HTMLElement} element
      * @param {Uint8Array} data
      * @param {string} filename
      * @returns {boolean} Indicating if the data was opened.
      */
    def openOrDownloadData(element: HTMLElement, data: js.typedarray.Uint8Array, filename: String): Boolean = js.native
  }
  
  @JSImport("pdfjs-dist/types/web/interfaces", "IL10n")
  @js.native
  open class IL10n () extends StObject {
    
    /**
      * Translates text identified by the key and adds/formats data using the args
      * property bag. If the key was not found, translation falls back to the
      * fallback text.
      * @param {string} key
      * @param {Object | null} [args]
      * @param {string} [fallback]
      * @returns {Promise<string>}
      */
    def get(key: String): js.Promise[String] = js.native
    def get(key: String, args: js.Object): js.Promise[String] = js.native
    def get(key: String, args: js.Object, fallback: String): js.Promise[String] = js.native
    def get(key: String, args: Null, fallback: String): js.Promise[String] = js.native
    def get(key: String, args: Unit, fallback: String): js.Promise[String] = js.native
    
    /**
      * @returns {Promise<string>} - Resolves to 'rtl' or 'ltr'.
      */
    def getDirection(): js.Promise[String] = js.native
    
    /**
      * @returns {Promise<string>} - Resolves to the current locale.
      */
    def getLanguage(): js.Promise[String] = js.native
    
    /**
      * Translates HTML element.
      * @param {HTMLElement} element
      * @returns {Promise<void>}
      */
    def translate(element: HTMLElement): js.Promise[Unit] = js.native
  }
  
  @JSImport("pdfjs-dist/types/web/interfaces", "IPDFAnnotationEditorLayerFactory")
  @js.native
  open class IPDFAnnotationEditorLayerFactory () extends StObject {
    
    /**
      * @typedef {Object} CreateAnnotationEditorLayerBuilderParameters
      * @property {AnnotationEditorUIManager} [uiManager]
      * @property {HTMLDivElement} pageDiv
      * @property {PDFPageProxy} pdfPage
      * @property {IL10n} l10n
      * @property {AnnotationStorage} [annotationStorage] - Storage for annotation
      * @property {TextAccessibilityManager} [accessibilityManager]
      *   data in forms.
      */
    /**
      * @param {CreateAnnotationEditorLayerBuilderParameters}
      * @returns {AnnotationEditorLayerBuilder}
      */
    def createAnnotationEditorLayerBuilder(hasUiManagerPageDivPdfPageL10nAnnotationStorageAccessibilityManager: AccessibilityManager): AnnotationEditorLayerBuilder = js.native
  }
  
  @JSImport("pdfjs-dist/types/web/interfaces", "IPDFAnnotationLayerFactory")
  @js.native
  open class IPDFAnnotationLayerFactory () extends StObject {
    
    /**
      * @typedef {Object} CreateAnnotationLayerBuilderParameters
      * @property {HTMLDivElement} pageDiv
      * @property {PDFPageProxy} pdfPage
      * @property {AnnotationStorage} [annotationStorage] - Storage for annotation
      *   data in forms.
      * @property {string} [imageResourcesPath] - Path for image resources, mainly
      *   for annotation icons. Include trailing slash.
      * @property {boolean} renderForms
      * @property {IL10n} l10n
      * @property {boolean} [enableScripting]
      * @property {Promise<boolean>} [hasJSActionsPromise]
      * @property {Object} [mouseState]
      * @property {Promise<Object<string, Array<Object>> | null>}
      *   [fieldObjectsPromise]
      * @property {Map<string, HTMLCanvasElement>} [annotationCanvasMap] - Map some
      *   annotation ids with canvases used to render them.
      * @property {TextAccessibilityManager} [accessibilityManager]
      */
    /**
      * @param {CreateAnnotationLayerBuilderParameters}
      * @returns {AnnotationLayerBuilder}
      */
    def createAnnotationLayerBuilder(
      hasPageDivPdfPageAnnotationStorageImageResourcesPathRenderFormsL10nEnableScriptingHasJSActionsPromiseMouseStateFieldObjectsPromiseAnnotationCanvasMapAccessibilityManager: AnnotationCanvasMap
    ): AnnotationLayerBuilder = js.native
  }
  
  @JSImport("pdfjs-dist/types/web/interfaces", "IPDFLinkService")
  @js.native
  open class IPDFLinkService () extends StObject {
    
    /**
      * @param {HTMLAnchorElement} link
      * @param {string} url
      * @param {boolean} [newWindow]
      */
    def addLinkAttributes(link: HTMLAnchorElement, url: String): Unit = js.native
    def addLinkAttributes(link: HTMLAnchorElement, url: String, newWindow: Boolean): Unit = js.native
    
    /**
      * @param {number} pageNum - page number.
      * @param {Object} pageRef - reference to the page.
      */
    def cachePageRef(pageNum: Double, pageRef: js.Object): Unit = js.native
    
    /**
      * @param {string} action
      */
    def executeNamedAction(action: String): Unit = js.native
    
    /**
      * @type {boolean}
      */
    def externalLinkEnabled: Boolean = js.native
    /**
      * @param {boolean} value
      */
    def externalLinkEnabled_=(arg: Boolean): Unit = js.native
    
    /**
      * @param hash - The PDF parameters/hash.
      * @returns {string} The hyperlink to the PDF object.
      */
    def getAnchorUrl(hash: Any): String = js.native
    
    /**
      * @param dest - The PDF destination object.
      * @returns {string} The hyperlink to the PDF object.
      */
    def getDestinationHash(dest: Any): String = js.native
    
    /**
      * @param {string|Array} dest - The named, or explicit, PDF destination.
      */
    def goToDestination(dest: String): js.Promise[Unit] = js.native
    def goToDestination(dest: js.Array[Any]): js.Promise[Unit] = js.native
    
    def goToPage(`val`: String): Unit = js.native
    /**
      * @param {number|string} val - The page number, or page label.
      */
    def goToPage(`val`: Double): Unit = js.native
    
    /**
      * @param {number} pageNumber
      */
    def isPageCached(pageNumber: Double): Unit = js.native
    
    /**
      * @param {number} pageNumber
      */
    def isPageVisible(pageNumber: Double): Unit = js.native
    
    /**
      * @type {number}
      */
    def page: Double = js.native
    /**
      * @param {number} value
      */
    def page_=(arg: Double): Unit = js.native
    
    /**
      * @type {number}
      */
    def pagesCount: Double = js.native
    
    /**
      * @type {number}
      */
    def rotation: Double = js.native
    /**
      * @param {number} value
      */
    def rotation_=(arg: Double): Unit = js.native
    
    /**
      * @param {string} hash
      */
    def setHash(hash: String): Unit = js.native
  }
  
  @JSImport("pdfjs-dist/types/web/interfaces", "IPDFStructTreeLayerFactory")
  @js.native
  open class IPDFStructTreeLayerFactory () extends StObject {
    
    /**
      * @typedef {Object} CreateStructTreeLayerBuilderParameters
      * @property {PDFPageProxy} pdfPage
      */
    /**
      * @param {CreateStructTreeLayerBuilderParameters}
      * @returns {StructTreeLayerBuilder}
      */
    def createStructTreeLayerBuilder(hasPdfPage: PdfPage): Any = js.native
  }
  
  @JSImport("pdfjs-dist/types/web/interfaces", "IPDFTextLayerFactory")
  @js.native
  open class IPDFTextLayerFactory () extends StObject {
    
    /**
      * @typedef {Object} CreateTextLayerBuilderParameters
      * @property {HTMLDivElement} textLayerDiv
      * @property {number} pageIndex
      * @property {PageViewport} viewport
      * @property {boolean} [enhanceTextSelection]
      * @property {EventBus} eventBus
      * @property {TextHighlighter} highlighter
      * @property {TextAccessibilityManager} [accessibilityManager]
      */
    /**
      * @param {CreateTextLayerBuilderParameters}
      * @returns {TextLayerBuilder}
      */
    def createTextLayerBuilder(
      hasTextLayerDivPageIndexViewportEnhanceTextSelectionEventBusHighlighterAccessibilityManager: EnhanceTextSelection
    ): TextLayerBuilder = js.native
  }
  
  @JSImport("pdfjs-dist/types/web/interfaces", "IPDFXfaLayerFactory")
  @js.native
  open class IPDFXfaLayerFactory () extends StObject {
    
    /**
      * @typedef {Object} CreateXfaLayerBuilderParameters
      * @property {HTMLDivElement} pageDiv
      * @property {PDFPageProxy} pdfPage
      * @property {AnnotationStorage} [annotationStorage] - Storage for annotation
      *   data in forms.
      */
    /**
      * @param {CreateXfaLayerBuilderParameters}
      * @returns {XfaLayerBuilder}
      */
    def createXfaLayerBuilder(hasPageDivPdfPageAnnotationStorage: AnnotationStorage): XfaLayerBuilder = js.native
  }
  
  @JSImport("pdfjs-dist/types/web/interfaces", "IRenderableView")
  @js.native
  open class IRenderableView () extends StObject {
    
    /**
      * @returns {Promise} Resolved on draw completion.
      */
    def draw(): js.Promise[Any] = js.native
    
    /**
      * @type {string} - Unique ID for rendering queue.
      */
    def renderingId: String = js.native
    
    /**
      * @type {RenderingStates}
      */
    def renderingState: Any = js.native
    
    /** @type {function | null} */
    var resume: js.Function | Null = js.native
  }
  
  type AnnotationEditorLayerBuilder = typings.pdfjsDist.annotationEditorLayerBuilderMod.AnnotationEditorLayerBuilder
  
  type AnnotationLayerBuilder = typings.pdfjsDist.annotationLayerBuilderMod.AnnotationLayerBuilder
  
  type EventBus = typings.pdfjsDist.eventUtilsMod.EventBus
  
  type PDFPageProxy = typings.pdfjsDist.apiMod.PDFPageProxy
  
  type PageViewport = typings.pdfjsDist.displayUtilsMod.PageViewport
  
  type RenderingStates = Any
  
  type StructTreeLayerBuilder = Any
  
  type TextAccessibilityManager = typings.pdfjsDist.textAccessibilityMod.TextAccessibilityManager
  
  type TextHighlighter = typings.pdfjsDist.textHighlighterMod.TextHighlighter
  
  type TextLayerBuilder = typings.pdfjsDist.textLayerBuilderMod.TextLayerBuilder
  
  type XfaLayerBuilder = typings.pdfjsDist.xfaLayerBuilderMod.XfaLayerBuilder
}
