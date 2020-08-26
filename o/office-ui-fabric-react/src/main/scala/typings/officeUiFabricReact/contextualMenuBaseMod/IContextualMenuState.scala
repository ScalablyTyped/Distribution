package typings.officeUiFabricReact.contextualMenuBaseMod

import typings.officeUiFabricReact.contextualMenuTypesMod.IContextualMenuItem
import typings.officeUiFabricReact.directionalHintMod.DirectionalHint
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IContextualMenuState extends js.Object {
  var contextualMenuItems: js.UndefOr[js.Array[IContextualMenuItem]] = js.native
  var contextualMenuTarget: js.UndefOr[Element] = js.native
  var dismissedMenuItemKey: js.UndefOr[String] = js.native
  /** True if the menu was expanded by mouse click OR hover (as opposed to by keyboard) */
  var expandedByMouseClick: js.UndefOr[Boolean] = js.native
  var expandedMenuItemKey: js.UndefOr[String] = js.native
  var positions: js.UndefOr[js.Any] = js.native
  var slideDirectionalClassName: js.UndefOr[String] = js.native
  var subMenuId: js.UndefOr[String] = js.native
  var submenuDirection: js.UndefOr[DirectionalHint] = js.native
  var submenuTarget: js.UndefOr[Element] = js.native
}

object IContextualMenuState {
  @scala.inline
  def apply(): IContextualMenuState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IContextualMenuState]
  }
  @scala.inline
  implicit class IContextualMenuStateOps[Self <: IContextualMenuState] (val x: Self) extends AnyVal {
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
    def setContextualMenuItemsVarargs(value: IContextualMenuItem*): Self = this.set("contextualMenuItems", js.Array(value :_*))
    @scala.inline
    def setContextualMenuItems(value: js.Array[IContextualMenuItem]): Self = this.set("contextualMenuItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContextualMenuItems: Self = this.set("contextualMenuItems", js.undefined)
    @scala.inline
    def setContextualMenuTarget(value: Element): Self = this.set("contextualMenuTarget", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContextualMenuTarget: Self = this.set("contextualMenuTarget", js.undefined)
    @scala.inline
    def setDismissedMenuItemKey(value: String): Self = this.set("dismissedMenuItemKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDismissedMenuItemKey: Self = this.set("dismissedMenuItemKey", js.undefined)
    @scala.inline
    def setExpandedByMouseClick(value: Boolean): Self = this.set("expandedByMouseClick", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpandedByMouseClick: Self = this.set("expandedByMouseClick", js.undefined)
    @scala.inline
    def setExpandedMenuItemKey(value: String): Self = this.set("expandedMenuItemKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpandedMenuItemKey: Self = this.set("expandedMenuItemKey", js.undefined)
    @scala.inline
    def setPositions(value: js.Any): Self = this.set("positions", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePositions: Self = this.set("positions", js.undefined)
    @scala.inline
    def setSlideDirectionalClassName(value: String): Self = this.set("slideDirectionalClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSlideDirectionalClassName: Self = this.set("slideDirectionalClassName", js.undefined)
    @scala.inline
    def setSubMenuId(value: String): Self = this.set("subMenuId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubMenuId: Self = this.set("subMenuId", js.undefined)
    @scala.inline
    def setSubmenuDirection(value: DirectionalHint): Self = this.set("submenuDirection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubmenuDirection: Self = this.set("submenuDirection", js.undefined)
    @scala.inline
    def setSubmenuTarget(value: Element): Self = this.set("submenuTarget", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubmenuTarget: Self = this.set("submenuTarget", js.undefined)
  }
  
}

