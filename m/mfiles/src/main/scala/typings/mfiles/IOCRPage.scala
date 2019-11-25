package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOCRPage extends js.Object {
  var OCRZones: IOCRZones
  var PageNum: Double
  def Clone(): IOCRPage
}

object IOCRPage {
  @scala.inline
  def apply(Clone: () => IOCRPage, OCRZones: IOCRZones, PageNum: Double): IOCRPage = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), OCRZones = OCRZones.asInstanceOf[js.Any], PageNum = PageNum.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IOCRPage]
  }
}

