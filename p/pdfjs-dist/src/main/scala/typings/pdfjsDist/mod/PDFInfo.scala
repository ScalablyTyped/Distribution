package typings.pdfjsDist.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PDFInfo
  extends StObject
     with /* key */ StringDictionary[js.Any] {
  
  var IsAcroFormPresent: Boolean
  
  var IsXFAPresent: Boolean
  
  var PDFFormatVersion: String
}
object PDFInfo {
  
  inline def apply(IsAcroFormPresent: Boolean, IsXFAPresent: Boolean, PDFFormatVersion: String): PDFInfo = {
    val __obj = js.Dynamic.literal(IsAcroFormPresent = IsAcroFormPresent.asInstanceOf[js.Any], IsXFAPresent = IsXFAPresent.asInstanceOf[js.Any], PDFFormatVersion = PDFFormatVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[PDFInfo]
  }
  
  extension [Self <: PDFInfo](x: Self) {
    
    inline def setIsAcroFormPresent(value: Boolean): Self = StObject.set(x, "IsAcroFormPresent", value.asInstanceOf[js.Any])
    
    inline def setIsXFAPresent(value: Boolean): Self = StObject.set(x, "IsXFAPresent", value.asInstanceOf[js.Any])
    
    inline def setPDFFormatVersion(value: String): Self = StObject.set(x, "PDFFormatVersion", value.asInstanceOf[js.Any])
  }
}
