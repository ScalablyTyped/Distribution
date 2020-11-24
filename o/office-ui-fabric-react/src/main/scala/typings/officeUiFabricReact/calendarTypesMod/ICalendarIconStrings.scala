package typings.officeUiFabricReact.calendarTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICalendarIconStrings extends js.Object {
  
  /**
    * Close icon
    * @defaultvalue 'CalculatorMultiply'
    */
  var closeIcon: js.UndefOr[String] = js.native
  
  /**
    * FabricMDL2Icons name for the left navigation icon.  Previous default: ChevronLeft.
    * @defaultvalue 'Up'
    */
  var leftNavigation: js.UndefOr[String] = js.native
  
  /**
    * FabricMDL2Icons name for the right navigation icon.  Previous default: ChevronRight.
    * @defaultvalue 'Down'
    */
  var rightNavigation: js.UndefOr[String] = js.native
}
object ICalendarIconStrings {
  
  @scala.inline
  def apply(): ICalendarIconStrings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICalendarIconStrings]
  }
  
  @scala.inline
  implicit class ICalendarIconStringsOps[Self <: ICalendarIconStrings] (val x: Self) extends AnyVal {
    
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
    def setCloseIcon(value: String): Self = this.set("closeIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloseIcon: Self = this.set("closeIcon", js.undefined)
    
    @scala.inline
    def setLeftNavigation(value: String): Self = this.set("leftNavigation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeftNavigation: Self = this.set("leftNavigation", js.undefined)
    
    @scala.inline
    def setRightNavigation(value: String): Self = this.set("rightNavigation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRightNavigation: Self = this.set("rightNavigation", js.undefined)
  }
}
