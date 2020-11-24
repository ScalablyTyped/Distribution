package typings.ngTable.groupSettingsMod

import typings.ngTable.sortingMod.SortDirection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IGroupSettings extends js.Object {
  
  /**
    * The default sort direction that will be used whenever a group is supplied that
    * does not define its own sort direction
    */
  var defaultSort: js.UndefOr[SortDirection] = js.native
  
  /**
    * Determines whether groups should be displayed expanded to show their items. Defaults to true
    */
  var isExpanded: js.UndefOr[Boolean] = js.native
}
object IGroupSettings {
  
  @scala.inline
  def apply(): IGroupSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGroupSettings]
  }
  
  @scala.inline
  implicit class IGroupSettingsOps[Self <: IGroupSettings] (val x: Self) extends AnyVal {
    
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
    def setDefaultSort(value: SortDirection): Self = this.set("defaultSort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultSort: Self = this.set("defaultSort", js.undefined)
    
    @scala.inline
    def setIsExpanded(value: Boolean): Self = this.set("isExpanded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsExpanded: Self = this.set("isExpanded", js.undefined)
  }
}
