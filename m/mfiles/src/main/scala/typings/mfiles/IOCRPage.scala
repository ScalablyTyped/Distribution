package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IOCRPage extends StObject {
  
  def Clone(): IOCRPage
  
  var OCRZones: IOCRZones
  
  var PageNum: Double
}
object IOCRPage {
  
  @scala.inline
  def apply(Clone: () => IOCRPage, OCRZones: IOCRZones, PageNum: Double): IOCRPage = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), OCRZones = OCRZones.asInstanceOf[js.Any], PageNum = PageNum.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOCRPage]
  }
  
  @scala.inline
  implicit class IOCRPageMutableBuilder[Self <: IOCRPage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClone(value: () => IOCRPage): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOCRZones(value: IOCRZones): Self = StObject.set(x, "OCRZones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageNum(value: Double): Self = StObject.set(x, "PageNum", value.asInstanceOf[js.Any])
  }
}
