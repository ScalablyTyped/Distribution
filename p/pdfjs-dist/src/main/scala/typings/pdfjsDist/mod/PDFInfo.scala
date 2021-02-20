package typings.pdfjsDist.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PDFInfo
  extends /* key */ StringDictionary[js.Any] {
  
  var IsAcroFormPresent: Boolean = js.native
  
  var IsXFAPresent: Boolean = js.native
  
  var PDFFormatVersion: String = js.native
}
object PDFInfo {
  
  @scala.inline
  def apply(IsAcroFormPresent: Boolean, IsXFAPresent: Boolean, PDFFormatVersion: String): PDFInfo = {
    val __obj = js.Dynamic.literal(IsAcroFormPresent = IsAcroFormPresent.asInstanceOf[js.Any], IsXFAPresent = IsXFAPresent.asInstanceOf[js.Any], PDFFormatVersion = PDFFormatVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[PDFInfo]
  }
  
  @scala.inline
  implicit class PDFInfoMutableBuilder[Self <: PDFInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsAcroFormPresent(value: Boolean): Self = StObject.set(x, "IsAcroFormPresent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsXFAPresent(value: Boolean): Self = StObject.set(x, "IsXFAPresent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPDFFormatVersion(value: String): Self = StObject.set(x, "PDFFormatVersion", value.asInstanceOf[js.Any])
  }
}
