package typings.officeDashUiDashFabricDashReact.libComponentsBreadcrumbBreadcrumbDotTypesMod

import typings.officeDashUiDashFabricDashReact.libComponentsIconIconDotTypesMod.IIconProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDividerAsProps extends IIconProps {
  /**
    * Breadcrumb item to left of the divider to be passed for custom rendering.
    * For overflowed items, it will be last item in the list.
    */
  var item: js.UndefOr[IBreadcrumbItem] = js.undefined
}

object IDividerAsProps {
  @scala.inline
  def apply(IIconProps: IIconProps = null, item: IBreadcrumbItem = null): IDividerAsProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IIconProps)
    if (item != null) __obj.updateDynamic("item")(item)
    __obj.asInstanceOf[IDividerAsProps]
  }
}

