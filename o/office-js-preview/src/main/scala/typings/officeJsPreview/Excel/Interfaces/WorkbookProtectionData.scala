package typings.officeJsPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `workbookProtection.toJSON()`. */
@js.native
trait WorkbookProtectionData extends js.Object {
  
  /**
    *
    * Specifies if the workbook is protected.
    *
    * [Api set: ExcelApi 1.7]
    */
  var `protected`: js.UndefOr[Boolean] = js.native
}
object WorkbookProtectionData {
  
  @scala.inline
  def apply(): WorkbookProtectionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkbookProtectionData]
  }
  
  @scala.inline
  implicit class WorkbookProtectionDataOps[Self <: WorkbookProtectionData] (val x: Self) extends AnyVal {
    
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
    def setProtected(value: Boolean): Self = this.set("protected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProtected: Self = this.set("protected", js.undefined)
  }
}
