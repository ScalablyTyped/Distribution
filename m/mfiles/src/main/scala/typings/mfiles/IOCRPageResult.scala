package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOCRPageResult extends js.Object {
  val OCRZoneResults: IOCRZoneResults
  val PageNum: Double
}

object IOCRPageResult {
  @scala.inline
  def apply(OCRZoneResults: IOCRZoneResults, PageNum: Double): IOCRPageResult = {
    val __obj = js.Dynamic.literal(OCRZoneResults = OCRZoneResults.asInstanceOf[js.Any], PageNum = PageNum.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IOCRPageResult]
  }
}

