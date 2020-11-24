package typings.officeUiFabricReact.contextualMenuTypesMod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IContextualMenuListProps extends js.Object {
  
  def defaultMenuItemRenderer(item: IContextualMenuItemRenderProps): ReactNode = js.native
  
  var hasCheckmarks: Boolean = js.native
  
  var hasIcons: Boolean = js.native
  
  var items: js.Array[IContextualMenuItem] = js.native
  
  var role: js.UndefOr[String] = js.native
  
  var totalItemCount: Double = js.native
}
object IContextualMenuListProps {
  
  @scala.inline
  def apply(
    defaultMenuItemRenderer: IContextualMenuItemRenderProps => ReactNode,
    hasCheckmarks: Boolean,
    hasIcons: Boolean,
    items: js.Array[IContextualMenuItem],
    totalItemCount: Double
  ): IContextualMenuListProps = {
    val __obj = js.Dynamic.literal(defaultMenuItemRenderer = js.Any.fromFunction1(defaultMenuItemRenderer), hasCheckmarks = hasCheckmarks.asInstanceOf[js.Any], hasIcons = hasIcons.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], totalItemCount = totalItemCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[IContextualMenuListProps]
  }
  
  @scala.inline
  implicit class IContextualMenuListPropsOps[Self <: IContextualMenuListProps] (val x: Self) extends AnyVal {
    
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
    def setDefaultMenuItemRenderer(value: IContextualMenuItemRenderProps => ReactNode): Self = this.set("defaultMenuItemRenderer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHasCheckmarks(value: Boolean): Self = this.set("hasCheckmarks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasIcons(value: Boolean): Self = this.set("hasIcons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsVarargs(value: IContextualMenuItem*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[IContextualMenuItem]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalItemCount(value: Double): Self = this.set("totalItemCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRole(value: String): Self = this.set("role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRole: Self = this.set("role", js.undefined)
  }
}
