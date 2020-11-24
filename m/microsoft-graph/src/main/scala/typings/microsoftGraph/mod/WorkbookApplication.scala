package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkbookApplication extends Entity {
  
  // Returns the calculation mode used in the workbook. Possible values are: Automatic, AutomaticExceptTables, Manual.
  var calculationMode: js.UndefOr[String] = js.native
}
object WorkbookApplication {
  
  @scala.inline
  def apply(): WorkbookApplication = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkbookApplication]
  }
  
  @scala.inline
  implicit class WorkbookApplicationOps[Self <: WorkbookApplication] (val x: Self) extends AnyVal {
    
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
    def setCalculationMode(value: String): Self = this.set("calculationMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCalculationMode: Self = this.set("calculationMode", js.undefined)
  }
}
