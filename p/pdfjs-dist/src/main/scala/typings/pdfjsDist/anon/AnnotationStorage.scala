package typings.pdfjsDist.anon

import typings.pdfjsDist.interfacesMod.PDFPageProxy
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnnotationStorage extends StObject {
  
  /**
    * - Storage for annotation
    * data in forms.
    */
  var annotationStorage: js.UndefOr[Any] = js.undefined
  
  var pageDiv: HTMLDivElement
  
  var pdfPage: PDFPageProxy
}
object AnnotationStorage {
  
  inline def apply(pageDiv: HTMLDivElement, pdfPage: PDFPageProxy): AnnotationStorage = {
    val __obj = js.Dynamic.literal(pageDiv = pageDiv.asInstanceOf[js.Any], pdfPage = pdfPage.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnnotationStorage]
  }
  
  extension [Self <: AnnotationStorage](x: Self) {
    
    inline def setAnnotationStorage(value: Any): Self = StObject.set(x, "annotationStorage", value.asInstanceOf[js.Any])
    
    inline def setAnnotationStorageUndefined: Self = StObject.set(x, "annotationStorage", js.undefined)
    
    inline def setPageDiv(value: HTMLDivElement): Self = StObject.set(x, "pageDiv", value.asInstanceOf[js.Any])
    
    inline def setPdfPage(value: PDFPageProxy): Self = StObject.set(x, "pdfPage", value.asInstanceOf[js.Any])
  }
}
