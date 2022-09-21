package typings.pdfjsDist.anon

import typings.pdfjsDist.interfacesMod.IL10n
import typings.pdfjsDist.interfacesMod.PDFPageProxy
import typings.pdfjsDist.textAccessibilityMod.TextAccessibilityManager
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessibilityManager extends StObject {
  
  /**
    * data in forms.
    */
  var accessibilityManager: js.UndefOr[TextAccessibilityManager] = js.undefined
  
  /**
    * - Storage for annotation
    */
  var annotationStorage: js.UndefOr[Any] = js.undefined
  
  var l10n: IL10n
  
  var pageDiv: HTMLDivElement
  
  var pdfPage: PDFPageProxy
  
  var uiManager: js.UndefOr[Any] = js.undefined
}
object AccessibilityManager {
  
  inline def apply(l10n: IL10n, pageDiv: HTMLDivElement, pdfPage: PDFPageProxy): AccessibilityManager = {
    val __obj = js.Dynamic.literal(l10n = l10n.asInstanceOf[js.Any], pageDiv = pageDiv.asInstanceOf[js.Any], pdfPage = pdfPage.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessibilityManager]
  }
  
  extension [Self <: AccessibilityManager](x: Self) {
    
    inline def setAccessibilityManager(value: TextAccessibilityManager): Self = StObject.set(x, "accessibilityManager", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityManagerUndefined: Self = StObject.set(x, "accessibilityManager", js.undefined)
    
    inline def setAnnotationStorage(value: Any): Self = StObject.set(x, "annotationStorage", value.asInstanceOf[js.Any])
    
    inline def setAnnotationStorageUndefined: Self = StObject.set(x, "annotationStorage", js.undefined)
    
    inline def setL10n(value: IL10n): Self = StObject.set(x, "l10n", value.asInstanceOf[js.Any])
    
    inline def setPageDiv(value: HTMLDivElement): Self = StObject.set(x, "pageDiv", value.asInstanceOf[js.Any])
    
    inline def setPdfPage(value: PDFPageProxy): Self = StObject.set(x, "pdfPage", value.asInstanceOf[js.Any])
    
    inline def setUiManager(value: Any): Self = StObject.set(x, "uiManager", value.asInstanceOf[js.Any])
    
    inline def setUiManagerUndefined: Self = StObject.set(x, "uiManager", js.undefined)
  }
}
