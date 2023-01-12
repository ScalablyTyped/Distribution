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
  
  inline def apply(Clone: () => IOCRPage, OCRZones: IOCRZones, PageNum: Double): IOCRPage = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), OCRZones = OCRZones.asInstanceOf[js.Any], PageNum = PageNum.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOCRPage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IOCRPage] (val x: Self) extends AnyVal {
    
    inline def setClone(value: () => IOCRPage): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    inline def setOCRZones(value: IOCRZones): Self = StObject.set(x, "OCRZones", value.asInstanceOf[js.Any])
    
    inline def setPageNum(value: Double): Self = StObject.set(x, "PageNum", value.asInstanceOf[js.Any])
  }
}
