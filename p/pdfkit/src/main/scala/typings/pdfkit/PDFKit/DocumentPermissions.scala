package typings.pdfkit.PDFKit

import typings.pdfkit.pdfkitStrings.highResolution
import typings.pdfkit.pdfkitStrings.lowResolution
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentPermissions extends StObject {
  
  var annotating: js.UndefOr[Boolean] = js.undefined
  
  var contentAccessibility: js.UndefOr[Boolean] = js.undefined
  
  var copying: js.UndefOr[Boolean] = js.undefined
  
  var documentAssembly: js.UndefOr[Boolean] = js.undefined
  
  var fillingForms: js.UndefOr[Boolean] = js.undefined
  
  var modifying: js.UndefOr[Boolean] = js.undefined
  
  var printing: js.UndefOr[lowResolution | highResolution] = js.undefined
}
object DocumentPermissions {
  
  inline def apply(): DocumentPermissions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentPermissions]
  }
  
  extension [Self <: DocumentPermissions](x: Self) {
    
    inline def setAnnotating(value: Boolean): Self = StObject.set(x, "annotating", value.asInstanceOf[js.Any])
    
    inline def setAnnotatingUndefined: Self = StObject.set(x, "annotating", js.undefined)
    
    inline def setContentAccessibility(value: Boolean): Self = StObject.set(x, "contentAccessibility", value.asInstanceOf[js.Any])
    
    inline def setContentAccessibilityUndefined: Self = StObject.set(x, "contentAccessibility", js.undefined)
    
    inline def setCopying(value: Boolean): Self = StObject.set(x, "copying", value.asInstanceOf[js.Any])
    
    inline def setCopyingUndefined: Self = StObject.set(x, "copying", js.undefined)
    
    inline def setDocumentAssembly(value: Boolean): Self = StObject.set(x, "documentAssembly", value.asInstanceOf[js.Any])
    
    inline def setDocumentAssemblyUndefined: Self = StObject.set(x, "documentAssembly", js.undefined)
    
    inline def setFillingForms(value: Boolean): Self = StObject.set(x, "fillingForms", value.asInstanceOf[js.Any])
    
    inline def setFillingFormsUndefined: Self = StObject.set(x, "fillingForms", js.undefined)
    
    inline def setModifying(value: Boolean): Self = StObject.set(x, "modifying", value.asInstanceOf[js.Any])
    
    inline def setModifyingUndefined: Self = StObject.set(x, "modifying", js.undefined)
    
    inline def setPrinting(value: lowResolution | highResolution): Self = StObject.set(x, "printing", value.asInstanceOf[js.Any])
    
    inline def setPrintingUndefined: Self = StObject.set(x, "printing", js.undefined)
  }
}
