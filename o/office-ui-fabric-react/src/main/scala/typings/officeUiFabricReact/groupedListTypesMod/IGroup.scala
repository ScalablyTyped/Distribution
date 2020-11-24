package typings.officeUiFabricReact.groupedListTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IGroup extends js.Object {
  
  /**
    * Optional accessibility label (aria-label) attribute that will be stamped on to the element.
    * If none is specified, the arai-label attribute will contain the group name
    */
  var ariaLabel: js.UndefOr[String] = js.native
  
  /**
    * Nested groups, if any.
    */
  var children: js.UndefOr[js.Array[IGroup]] = js.native
  
  /**
    * How many items should be rendered within the group.
    */
  var count: Double = js.native
  
  /**
    * Arbitrary data required to be preserved by the caller.
    */
  var data: js.UndefOr[js.Any] = js.native
  
  /**
    * Optional flag to indicate the group has more data to load than the current group count indicated.
    * This can be used to indicate that a plus should be rendered next to the group count in the header.
    */
  var hasMoreData: js.UndefOr[Boolean] = js.native
  
  /**
    * If all the items in the group are collapsed.
    */
  var isCollapsed: js.UndefOr[Boolean] = js.native
  
  /**
    * If drag/drop is enabled for the group header.
    */
  var isDropEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Deprecated at 1.0.0, selection state will be controled by the selection store only.
    * @deprecated At 1.0.0, selection state wil be controlled by the selection store only.
    */
  var isSelected: js.UndefOr[Boolean] = js.native
  
  /**
    * If the items within the group are summarized or showing all.
    */
  var isShowingAll: js.UndefOr[Boolean] = js.native
  
  /**
    * Unique identifier for the group.
    */
  var key: String = js.native
  
  /**
    * Number indicating the level of nested groups.
    */
  var level: js.UndefOr[Double] = js.native
  
  /**
    * Display name for the group, rendered on the header.
    */
  var name: String = js.native
  
  /**
    * Start index for the group within the given items.
    */
  var startIndex: Double = js.native
}
object IGroup {
  
  @scala.inline
  def apply(count: Double, key: String, name: String, startIndex: Double): IGroup = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], startIndex = startIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGroup]
  }
  
  @scala.inline
  implicit class IGroupOps[Self <: IGroup] (val x: Self) extends AnyVal {
    
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
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartIndex(value: Double): Self = this.set("startIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAriaLabel(value: String): Self = this.set("ariaLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAriaLabel: Self = this.set("ariaLabel", js.undefined)
    
    @scala.inline
    def setChildrenVarargs(value: IGroup*): Self = this.set("children", js.Array(value :_*))
    
    @scala.inline
    def setChildren(value: js.Array[IGroup]): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setHasMoreData(value: Boolean): Self = this.set("hasMoreData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasMoreData: Self = this.set("hasMoreData", js.undefined)
    
    @scala.inline
    def setIsCollapsed(value: Boolean): Self = this.set("isCollapsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsCollapsed: Self = this.set("isCollapsed", js.undefined)
    
    @scala.inline
    def setIsDropEnabled(value: Boolean): Self = this.set("isDropEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsDropEnabled: Self = this.set("isDropEnabled", js.undefined)
    
    @scala.inline
    def setIsSelected(value: Boolean): Self = this.set("isSelected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsSelected: Self = this.set("isSelected", js.undefined)
    
    @scala.inline
    def setIsShowingAll(value: Boolean): Self = this.set("isShowingAll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsShowingAll: Self = this.set("isShowingAll", js.undefined)
    
    @scala.inline
    def setLevel(value: Double): Self = this.set("level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLevel: Self = this.set("level", js.undefined)
  }
}
