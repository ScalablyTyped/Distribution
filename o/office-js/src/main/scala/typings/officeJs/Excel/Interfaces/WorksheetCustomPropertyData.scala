package typings.officeJs.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `worksheetCustomProperty.toJSON()`. */
@js.native
trait WorksheetCustomPropertyData extends js.Object {
  
  /**
    *
    * Gets the key of the custom property. Custom property keys are case-insensitive. The key is limited to 255 characters (larger values will cause an "InvalidArgument" error to be thrown.)
    *
    * [Api set: ExcelApi 1.12]
    */
  var key: js.UndefOr[String] = js.native
  
  /**
    *
    * Gets or sets the value of the custom property.
    *
    * [Api set: ExcelApi 1.12]
    */
  var value: js.UndefOr[String] = js.native
}
object WorksheetCustomPropertyData {
  
  @scala.inline
  def apply(): WorksheetCustomPropertyData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorksheetCustomPropertyData]
  }
  
  @scala.inline
  implicit class WorksheetCustomPropertyDataOps[Self <: WorksheetCustomPropertyData] (val x: Self) extends AnyVal {
    
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
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
