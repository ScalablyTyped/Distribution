package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOCRPageResult extends js.Object {
  val OCRZoneResults: IOCRZoneResults
  val PageNum: scala.Double
}

object IOCRPageResult {
  @scala.inline
  def apply(OCRZoneResults: IOCRZoneResults, PageNum: scala.Double): IOCRPageResult = {
    val __obj = js.Dynamic.literal(OCRZoneResults = OCRZoneResults, PageNum = PageNum)
  
    __obj.asInstanceOf[IOCRPageResult]
  }
}

