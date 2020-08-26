package typings.officeUiFabricReact.breadcrumbTypesMod

import typings.officeUiFabricReact.iconTypesMod.IIconProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDividerAsProps extends IIconProps {
  /**
    * Breadcrumb item to left of the divider to be passed for custom rendering.
    * For overflowed items, it will be last item in the list.
    */
  var item: js.UndefOr[IBreadcrumbItem] = js.native
}

object IDividerAsProps {
  @scala.inline
  def apply(): IDividerAsProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDividerAsProps]
  }
  @scala.inline
  implicit class IDividerAsPropsOps[Self <: IDividerAsProps] (val x: Self) extends AnyVal {
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
    def setItem(value: IBreadcrumbItem): Self = this.set("item", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItem: Self = this.set("item", js.undefined)
  }
  
}

