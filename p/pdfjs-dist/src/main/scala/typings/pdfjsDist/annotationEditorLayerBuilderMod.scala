package typings.pdfjsDist

import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object annotationEditorLayerBuilderMod {
  
  @JSImport("pdfjs-dist/types/web/annotation_editor_layer_builder", "AnnotationEditorLayerBuilder")
  @js.native
  open class AnnotationEditorLayerBuilder protected () extends StObject {
    /**
      * @param {AnnotationEditorLayerBuilderOptions} options
      */
    def this(options: AnnotationEditorLayerBuilderOptions) = this()
    
    var _cancelled: Boolean = js.native
    
    var accessibilityManager: typings.pdfjsDist.textAccessibilityMod.TextAccessibilityManager = js.native
    
    var annotationEditorLayer: Any = js.native
    
    var annotationStorage: Any = js.native
    
    def cancel(): Unit = js.native
    
    def destroy(): Unit = js.native
    
    var div: HTMLDivElement | Null = js.native
    
    def hide(): Unit = js.native
    
    var l10n: typings.pdfjsDist.interfacesMod.IL10n = js.native
    
    var pageDiv: HTMLDivElement = js.native
    
    var pdfPage: typings.pdfjsDist.apiMod.PDFPageProxy = js.native
    
    /* private */ var `private`: Any = js.native
    
    /**
      * @param {PageViewport} viewport
      * @param {string} intent (default value is 'display')
      */
    def render(viewport: PageViewport): js.Promise[Unit] = js.native
    def render(viewport: PageViewport, intent: String): js.Promise[Unit] = js.native
    
    def show(): Unit = js.native
  }
  
  trait AnnotationEditorLayerBuilderOptions extends StObject {
    
    var accessibilityManager: TextAccessibilityManager
    
    var annotationStorage: Any
    
    /**
      * - Localization service.
      */
    var l10n: IL10n
    
    /**
      * - Editor mode
      */
    var mode: Double
    
    var pageDiv: HTMLDivElement
    
    var pdfPage: PDFPageProxy
    
    var uiManager: AnnotationEditorUIManager
  }
  object AnnotationEditorLayerBuilderOptions {
    
    inline def apply(
      accessibilityManager: TextAccessibilityManager,
      annotationStorage: Any,
      l10n: IL10n,
      mode: Double,
      pageDiv: HTMLDivElement,
      pdfPage: PDFPageProxy,
      uiManager: AnnotationEditorUIManager
    ): AnnotationEditorLayerBuilderOptions = {
      val __obj = js.Dynamic.literal(accessibilityManager = accessibilityManager.asInstanceOf[js.Any], annotationStorage = annotationStorage.asInstanceOf[js.Any], l10n = l10n.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], pageDiv = pageDiv.asInstanceOf[js.Any], pdfPage = pdfPage.asInstanceOf[js.Any], uiManager = uiManager.asInstanceOf[js.Any])
      __obj.asInstanceOf[AnnotationEditorLayerBuilderOptions]
    }
    
    extension [Self <: AnnotationEditorLayerBuilderOptions](x: Self) {
      
      inline def setAccessibilityManager(value: TextAccessibilityManager): Self = StObject.set(x, "accessibilityManager", value.asInstanceOf[js.Any])
      
      inline def setAnnotationStorage(value: Any): Self = StObject.set(x, "annotationStorage", value.asInstanceOf[js.Any])
      
      inline def setL10n(value: IL10n): Self = StObject.set(x, "l10n", value.asInstanceOf[js.Any])
      
      inline def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setPageDiv(value: HTMLDivElement): Self = StObject.set(x, "pageDiv", value.asInstanceOf[js.Any])
      
      inline def setPdfPage(value: PDFPageProxy): Self = StObject.set(x, "pdfPage", value.asInstanceOf[js.Any])
      
      inline def setUiManager(value: AnnotationEditorUIManager): Self = StObject.set(x, "uiManager", value.asInstanceOf[js.Any])
    }
  }
  
  type AnnotationEditorUIManager = typings.pdfjsDist.toolsMod.AnnotationEditorUIManager
  
  type AnnotationStorage = Any
  
  type IL10n = typings.pdfjsDist.interfacesMod.IL10n
  
  type IPDFLinkService = typings.pdfjsDist.interfacesMod.IPDFLinkService
  
  type PDFPageProxy = typings.pdfjsDist.apiMod.PDFPageProxy
  
  type PageViewport = typings.pdfjsDist.displayUtilsMod.PageViewport
  
  type TextAccessibilityManager = typings.pdfjsDist.textAccessibilityMod.TextAccessibilityManager
}
