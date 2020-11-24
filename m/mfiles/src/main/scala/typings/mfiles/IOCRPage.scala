package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IOCRPage extends js.Object {
  
  def Clone(): IOCRPage = js.native
  
  var OCRZones: IOCRZones = js.native
  
  var PageNum: Double = js.native
}
object IOCRPage {
  
  @scala.inline
  def apply(Clone: () => IOCRPage, OCRZones: IOCRZones, PageNum: Double): IOCRPage = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), OCRZones = OCRZones.asInstanceOf[js.Any], PageNum = PageNum.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOCRPage]
  }
  
  @scala.inline
  implicit class IOCRPageOps[Self <: IOCRPage] (val x: Self) extends AnyVal {
    
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
    def setClone(value: () => IOCRPage): Self = this.set("Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOCRZones(value: IOCRZones): Self = this.set("OCRZones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageNum(value: Double): Self = this.set("PageNum", value.asInstanceOf[js.Any])
  }
}
