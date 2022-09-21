package typings.pdfjsDist.anon

import org.scalablytyped.runtime.StringDictionary
import typings.pdfjsDist.interfacesMod.IL10n
import typings.pdfjsDist.interfacesMod.PDFPageProxy
import typings.pdfjsDist.textAccessibilityMod.TextAccessibilityManager
import typings.std.HTMLCanvasElement
import typings.std.HTMLDivElement
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnnotationCanvasMap extends StObject {
  
  var accessibilityManager: js.UndefOr[TextAccessibilityManager] = js.undefined
  
  /**
    * - Map some
    * annotation ids with canvases used to render them.
    */
  var annotationCanvasMap: js.UndefOr[Map[String, HTMLCanvasElement]] = js.undefined
  
  /**
    * - Storage for annotation
    * data in forms.
    */
  var annotationStorage: js.UndefOr[Any] = js.undefined
  
  var enableScripting: js.UndefOr[Boolean] = js.undefined
  
  var fieldObjectsPromise: js.UndefOr[js.Promise[StringDictionary[js.Array[js.Object]] | Null]] = js.undefined
  
  var hasJSActionsPromise: js.UndefOr[js.Promise[Boolean]] = js.undefined
  
  /**
    * - Path for image resources, mainly
    * for annotation icons. Include trailing slash.
    */
  var imageResourcesPath: js.UndefOr[String] = js.undefined
  
  var l10n: IL10n
  
  var mouseState: js.UndefOr[js.Object] = js.undefined
  
  var pageDiv: HTMLDivElement
  
  var pdfPage: PDFPageProxy
  
  var renderForms: Boolean
}
object AnnotationCanvasMap {
  
  inline def apply(l10n: IL10n, pageDiv: HTMLDivElement, pdfPage: PDFPageProxy, renderForms: Boolean): AnnotationCanvasMap = {
    val __obj = js.Dynamic.literal(l10n = l10n.asInstanceOf[js.Any], pageDiv = pageDiv.asInstanceOf[js.Any], pdfPage = pdfPage.asInstanceOf[js.Any], renderForms = renderForms.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnnotationCanvasMap]
  }
  
  extension [Self <: AnnotationCanvasMap](x: Self) {
    
    inline def setAccessibilityManager(value: TextAccessibilityManager): Self = StObject.set(x, "accessibilityManager", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityManagerUndefined: Self = StObject.set(x, "accessibilityManager", js.undefined)
    
    inline def setAnnotationCanvasMap(value: Map[String, HTMLCanvasElement]): Self = StObject.set(x, "annotationCanvasMap", value.asInstanceOf[js.Any])
    
    inline def setAnnotationCanvasMapUndefined: Self = StObject.set(x, "annotationCanvasMap", js.undefined)
    
    inline def setAnnotationStorage(value: Any): Self = StObject.set(x, "annotationStorage", value.asInstanceOf[js.Any])
    
    inline def setAnnotationStorageUndefined: Self = StObject.set(x, "annotationStorage", js.undefined)
    
    inline def setEnableScripting(value: Boolean): Self = StObject.set(x, "enableScripting", value.asInstanceOf[js.Any])
    
    inline def setEnableScriptingUndefined: Self = StObject.set(x, "enableScripting", js.undefined)
    
    inline def setFieldObjectsPromise(value: js.Promise[StringDictionary[js.Array[js.Object]] | Null]): Self = StObject.set(x, "fieldObjectsPromise", value.asInstanceOf[js.Any])
    
    inline def setFieldObjectsPromiseUndefined: Self = StObject.set(x, "fieldObjectsPromise", js.undefined)
    
    inline def setHasJSActionsPromise(value: js.Promise[Boolean]): Self = StObject.set(x, "hasJSActionsPromise", value.asInstanceOf[js.Any])
    
    inline def setHasJSActionsPromiseUndefined: Self = StObject.set(x, "hasJSActionsPromise", js.undefined)
    
    inline def setImageResourcesPath(value: String): Self = StObject.set(x, "imageResourcesPath", value.asInstanceOf[js.Any])
    
    inline def setImageResourcesPathUndefined: Self = StObject.set(x, "imageResourcesPath", js.undefined)
    
    inline def setL10n(value: IL10n): Self = StObject.set(x, "l10n", value.asInstanceOf[js.Any])
    
    inline def setMouseState(value: js.Object): Self = StObject.set(x, "mouseState", value.asInstanceOf[js.Any])
    
    inline def setMouseStateUndefined: Self = StObject.set(x, "mouseState", js.undefined)
    
    inline def setPageDiv(value: HTMLDivElement): Self = StObject.set(x, "pageDiv", value.asInstanceOf[js.Any])
    
    inline def setPdfPage(value: PDFPageProxy): Self = StObject.set(x, "pdfPage", value.asInstanceOf[js.Any])
    
    inline def setRenderForms(value: Boolean): Self = StObject.set(x, "renderForms", value.asInstanceOf[js.Any])
  }
}
