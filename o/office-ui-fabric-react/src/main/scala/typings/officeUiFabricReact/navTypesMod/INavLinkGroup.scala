package typings.officeUiFabricReact.navTypesMod

import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait INavLinkGroup extends js.Object {
  /**
    * The name to use for functional automation tests
    */
  var automationId: js.UndefOr[String] = js.native
  /**
    * ARIA label when group is collapsed and can be expanded.
    */
  var collapseAriaLabel: js.UndefOr[String] = js.native
  /**
    * If true, the group should render collapsed by default
    */
  var collapseByDefault: js.UndefOr[Boolean] = js.native
  /**
    * ARIA label when group is collapsed and can be expanded.
    */
  var expandAriaLabel: js.UndefOr[String] = js.native
  /**
    * (Optional) Any additional properties to apply to a group.
    */
  var groupData: js.UndefOr[js.Any] = js.native
  /**
    * Links to render within this group
    */
  var links: js.Array[INavLink] = js.native
  /**
    * Text to render as the header of a group
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Callback invoked when a group header is clicked
    */
  var onHeaderClick: js.UndefOr[
    js.Function2[
      /* ev */ js.UndefOr[MouseEvent[HTMLElement, NativeMouseEvent]], 
      /* isCollapsing */ js.UndefOr[Boolean], 
      Unit
    ]
  ] = js.native
}

object INavLinkGroup {
  @scala.inline
  def apply(links: js.Array[INavLink]): INavLinkGroup = {
    val __obj = js.Dynamic.literal(links = links.asInstanceOf[js.Any])
    __obj.asInstanceOf[INavLinkGroup]
  }
  @scala.inline
  implicit class INavLinkGroupOps[Self <: INavLinkGroup] (val x: Self) extends AnyVal {
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
    def setLinksVarargs(value: INavLink*): Self = this.set("links", js.Array(value :_*))
    @scala.inline
    def setLinks(value: js.Array[INavLink]): Self = this.set("links", value.asInstanceOf[js.Any])
    @scala.inline
    def setAutomationId(value: String): Self = this.set("automationId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutomationId: Self = this.set("automationId", js.undefined)
    @scala.inline
    def setCollapseAriaLabel(value: String): Self = this.set("collapseAriaLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollapseAriaLabel: Self = this.set("collapseAriaLabel", js.undefined)
    @scala.inline
    def setCollapseByDefault(value: Boolean): Self = this.set("collapseByDefault", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollapseByDefault: Self = this.set("collapseByDefault", js.undefined)
    @scala.inline
    def setExpandAriaLabel(value: String): Self = this.set("expandAriaLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpandAriaLabel: Self = this.set("expandAriaLabel", js.undefined)
    @scala.inline
    def setGroupData(value: js.Any): Self = this.set("groupData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupData: Self = this.set("groupData", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOnHeaderClick(
      value: (/* ev */ js.UndefOr[MouseEvent[HTMLElement, NativeMouseEvent]], /* isCollapsing */ js.UndefOr[Boolean]) => Unit
    ): Self = this.set("onHeaderClick", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnHeaderClick: Self = this.set("onHeaderClick", js.undefined)
  }
  
}

