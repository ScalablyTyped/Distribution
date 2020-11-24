package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ManualRuleGroup extends js.Object {
  
  /** The group name, which must be a string. Each group in a given ManualRule must have a unique group name. */
  var groupName: js.UndefOr[ExtendedValue] = js.native
  
  /**
    * The items in the source data that should be placed into this group. Each item may be a string, number, or boolean. Items may appear in at most one group within a given ManualRule.
    * Items that do not appear in any group will appear on their own.
    */
  var items: js.UndefOr[js.Array[ExtendedValue]] = js.native
}
object ManualRuleGroup {
  
  @scala.inline
  def apply(): ManualRuleGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManualRuleGroup]
  }
  
  @scala.inline
  implicit class ManualRuleGroupOps[Self <: ManualRuleGroup] (val x: Self) extends AnyVal {
    
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
    def setGroupName(value: ExtendedValue): Self = this.set("groupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupName: Self = this.set("groupName", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: ExtendedValue*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[ExtendedValue]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
  }
}
