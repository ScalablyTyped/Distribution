package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IOCRPageResult extends js.Object {
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
  implicit class IOCRPageResultOps[Self <: IOCRPageResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setOCRZoneResults(value: IOCRZoneResults): Self = this.set("OCRZoneResults", value.asInstanceOf[js.Any])
    @scala.inline
    def setPageNum(value: Double): Self = this.set("PageNum", value.asInstanceOf[js.Any])
  }
  
}

