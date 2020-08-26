package typings.officeUiFabricReact.navTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRenderGroupHeaderProps extends INavLinkGroup {
  /**
    * Whether or not the group is presently expanded.
    */
  var isExpanded: js.UndefOr[Boolean] = js.native
}

object IRenderGroupHeaderProps {
  @scala.inline
  def apply(links: js.Array[INavLink]): IRenderGroupHeaderProps = {
    val __obj = js.Dynamic.literal(links = links.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRenderGroupHeaderProps]
  }
  @scala.inline
  implicit class IRenderGroupHeaderPropsOps[Self <: IRenderGroupHeaderProps] (val x: Self) extends AnyVal {
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
    def setIsExpanded(value: Boolean): Self = this.set("isExpanded", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsExpanded: Self = this.set("isExpanded", js.undefined)
  }
  
}

