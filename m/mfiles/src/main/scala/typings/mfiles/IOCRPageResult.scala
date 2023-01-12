package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IOCRPageResult extends StObject {
  
  val OCRZoneResults: IOCRZoneResults
  
  val PageNum: Double
}
object IOCRPageResult {
  
  inline def apply(OCRZoneResults: IOCRZoneResults, PageNum: Double): IOCRPageResult = {
    val __obj = js.Dynamic.literal(OCRZoneResults = OCRZoneResults.asInstanceOf[js.Any], PageNum = PageNum.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOCRPageResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IOCRPageResult] (val x: Self) extends AnyVal {
    
    inline def setOCRZoneResults(value: IOCRZoneResults): Self = StObject.set(x, "OCRZoneResults", value.asInstanceOf[js.Any])
    
    inline def setPageNum(value: Double): Self = StObject.set(x, "PageNum", value.asInstanceOf[js.Any])
  }
}
