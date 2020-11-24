package typings.officeUiFabricReact.detailsColumnTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDetailsColumnStyles extends js.Object {
  
  /**
    * Styleable label region.
    */
  var accessibleLabel: IStyle = js.native
  
  /**
    * Styleable border region after drag & drop.
    */
  var borderAfterDropping: IStyle = js.native
  
  /**
    * Styleable border while drag & drop occurs.
    */
  var borderWhileDragging: IStyle = js.native
  
  /**
    * Styleable cell name region.
    */
  var cellName: IStyle = js.native
  
  /**
    * Styleable cell title region.
    */
  var cellTitle: IStyle = js.native
  
  /**
    * Styleable cell tooltip region.
    */
  var cellTooltip: IStyle = js.native
  
  /**
    * Styleable filter glyph.
    */
  var filterChevron: IStyle = js.native
  
  /**
    * Styleable resize glyph region.
    */
  var gripperBarVerticalStyle: IStyle = js.native
  
  /**
    * Styleable icon region.
    */
  var iconClassName: IStyle = js.native
  
  /**
    * Styleable margin by icon region.
    */
  var nearIcon: IStyle = js.native
  
  /**
    * Transparent no border region after drag & drop to avoid content shift.
    */
  var noBorderAfterDropping: IStyle = js.native
  
  /**
    * Transparent no border region while drag & drop occurs to avoid content shift.
    */
  var noBorderWhileDragging: IStyle = js.native
  
  /**
    * Styleable root region.
    */
  var root: IStyle = js.native
  
  /**
    * Styleable column sort icon region.
    */
  var sortIcon: IStyle = js.native
}
object IDetailsColumnStyles {
  
  @scala.inline
  def apply(): IDetailsColumnStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDetailsColumnStyles]
  }
  
  @scala.inline
  implicit class IDetailsColumnStylesOps[Self <: IDetailsColumnStyles] (val x: Self) extends AnyVal {
    
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
    def setAccessibleLabel(value: IStyle): Self = this.set("accessibleLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibleLabel: Self = this.set("accessibleLabel", js.undefined)
    
    @scala.inline
    def setAccessibleLabelNull: Self = this.set("accessibleLabel", null)
    
    @scala.inline
    def setBorderAfterDropping(value: IStyle): Self = this.set("borderAfterDropping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderAfterDropping: Self = this.set("borderAfterDropping", js.undefined)
    
    @scala.inline
    def setBorderAfterDroppingNull: Self = this.set("borderAfterDropping", null)
    
    @scala.inline
    def setBorderWhileDragging(value: IStyle): Self = this.set("borderWhileDragging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderWhileDragging: Self = this.set("borderWhileDragging", js.undefined)
    
    @scala.inline
    def setBorderWhileDraggingNull: Self = this.set("borderWhileDragging", null)
    
    @scala.inline
    def setCellName(value: IStyle): Self = this.set("cellName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCellName: Self = this.set("cellName", js.undefined)
    
    @scala.inline
    def setCellNameNull: Self = this.set("cellName", null)
    
    @scala.inline
    def setCellTitle(value: IStyle): Self = this.set("cellTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCellTitle: Self = this.set("cellTitle", js.undefined)
    
    @scala.inline
    def setCellTitleNull: Self = this.set("cellTitle", null)
    
    @scala.inline
    def setCellTooltip(value: IStyle): Self = this.set("cellTooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCellTooltip: Self = this.set("cellTooltip", js.undefined)
    
    @scala.inline
    def setCellTooltipNull: Self = this.set("cellTooltip", null)
    
    @scala.inline
    def setFilterChevron(value: IStyle): Self = this.set("filterChevron", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterChevron: Self = this.set("filterChevron", js.undefined)
    
    @scala.inline
    def setFilterChevronNull: Self = this.set("filterChevron", null)
    
    @scala.inline
    def setGripperBarVerticalStyle(value: IStyle): Self = this.set("gripperBarVerticalStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGripperBarVerticalStyle: Self = this.set("gripperBarVerticalStyle", js.undefined)
    
    @scala.inline
    def setGripperBarVerticalStyleNull: Self = this.set("gripperBarVerticalStyle", null)
    
    @scala.inline
    def setIconClassName(value: IStyle): Self = this.set("iconClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconClassName: Self = this.set("iconClassName", js.undefined)
    
    @scala.inline
    def setIconClassNameNull: Self = this.set("iconClassName", null)
    
    @scala.inline
    def setNearIcon(value: IStyle): Self = this.set("nearIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNearIcon: Self = this.set("nearIcon", js.undefined)
    
    @scala.inline
    def setNearIconNull: Self = this.set("nearIcon", null)
    
    @scala.inline
    def setNoBorderAfterDropping(value: IStyle): Self = this.set("noBorderAfterDropping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoBorderAfterDropping: Self = this.set("noBorderAfterDropping", js.undefined)
    
    @scala.inline
    def setNoBorderAfterDroppingNull: Self = this.set("noBorderAfterDropping", null)
    
    @scala.inline
    def setNoBorderWhileDragging(value: IStyle): Self = this.set("noBorderWhileDragging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoBorderWhileDragging: Self = this.set("noBorderWhileDragging", js.undefined)
    
    @scala.inline
    def setNoBorderWhileDraggingNull: Self = this.set("noBorderWhileDragging", null)
    
    @scala.inline
    def setRoot(value: IStyle): Self = this.set("root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    
    @scala.inline
    def setRootNull: Self = this.set("root", null)
    
    @scala.inline
    def setSortIcon(value: IStyle): Self = this.set("sortIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortIcon: Self = this.set("sortIcon", js.undefined)
    
    @scala.inline
    def setSortIconNull: Self = this.set("sortIcon", null)
  }
}
