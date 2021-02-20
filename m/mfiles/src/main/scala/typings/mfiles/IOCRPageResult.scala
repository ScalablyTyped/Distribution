package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IOCRPageResult extends StObject {
  
  val OCRZoneResults: IOCRZoneResults = js.native
  
  val PageNum: Double = js.native
}
object IOCRPageResult {
  
  @scala.inline
  def apply(OCRZoneResults: IOCRZoneResults, PageNum: Double): IOCRPageResult = {
    val __obj = js.Dynamic.literal(OCRZoneResults = OCRZoneResults.asInstanceOf[js.Any], PageNum = PageNum.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOCRPageResult]
  }
  
  @scala.inline
  implicit class IOCRPageResultMutableBuilder[Self <: IOCRPageResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOCRZoneResults(value: IOCRZoneResults): Self = StObject.set(x, "OCRZoneResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageNum(value: Double): Self = StObject.set(x, "PageNum", value.asInstanceOf[js.Any])
  }
}
