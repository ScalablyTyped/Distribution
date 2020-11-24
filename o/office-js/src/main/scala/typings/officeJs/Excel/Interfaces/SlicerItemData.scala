package typings.officeJs.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `slicerItem.toJSON()`. */
@js.native
trait SlicerItemData extends js.Object {
  
  /**
    *
    * True if the slicer item has data.
    *
    * [Api set: ExcelApi 1.10]
    */
  var hasData: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * True if the slicer item is selected.
    Setting this value will not clear other SlicerItems' selected state.
    By default, if the slicer item is the only one selected, when it is deselected, all items will be selected.
    *
    * [Api set: ExcelApi 1.10]
    */
  var isSelected: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Represents the unique value representing the slicer item.
    *
    * [Api set: ExcelApi 1.10]
    */
  var key: js.UndefOr[String] = js.native
  
  /**
    *
    * Represents the title displayed in the UI.
    *
    * [Api set: ExcelApi 1.10]
    */
  var name: js.UndefOr[String] = js.native
}
object SlicerItemData {
  
  @scala.inline
  def apply(): SlicerItemData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SlicerItemData]
  }
  
  @scala.inline
  implicit class SlicerItemDataOps[Self <: SlicerItemData] (val x: Self) extends AnyVal {
    
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
    def setHasData(value: Boolean): Self = this.set("hasData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasData: Self = this.set("hasData", js.undefined)
    
    @scala.inline
    def setIsSelected(value: Boolean): Self = this.set("isSelected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsSelected: Self = this.set("isSelected", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}
