package typings.officeJs.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents the necessary strings to get/set a hyperlink (XHL) object.
  *
  * [Api set: ExcelApi 1.7]
  */
@js.native
trait RangeHyperlink extends js.Object {
  
  /**
    *
    * Represents the url target for the hyperlink.
    *
    * [Api set: ExcelApi 1.7]
    */
  var address: js.UndefOr[String] = js.native
  
  /**
    *
    * Represents the document reference target for the hyperlink.
    *
    * [Api set: ExcelApi 1.7]
    */
  var documentReference: js.UndefOr[String] = js.native
  
  /**
    *
    * Represents the string displayed when hovering over the hyperlink.
    *
    * [Api set: ExcelApi 1.7]
    */
  var screenTip: js.UndefOr[String] = js.native
  
  /**
    *
    * Represents the string that is displayed in the top left most cell in the range.
    *
    * [Api set: ExcelApi 1.7]
    */
  var textToDisplay: js.UndefOr[String] = js.native
}
object RangeHyperlink {
  
  @scala.inline
  def apply(): RangeHyperlink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RangeHyperlink]
  }
  
  @scala.inline
  implicit class RangeHyperlinkOps[Self <: RangeHyperlink] (val x: Self) extends AnyVal {
    
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
    def setAddress(value: String): Self = this.set("address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddress: Self = this.set("address", js.undefined)
    
    @scala.inline
    def setDocumentReference(value: String): Self = this.set("documentReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocumentReference: Self = this.set("documentReference", js.undefined)
    
    @scala.inline
    def setScreenTip(value: String): Self = this.set("screenTip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScreenTip: Self = this.set("screenTip", js.undefined)
    
    @scala.inline
    def setTextToDisplay(value: String): Self = this.set("textToDisplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextToDisplay: Self = this.set("textToDisplay", js.undefined)
  }
}
