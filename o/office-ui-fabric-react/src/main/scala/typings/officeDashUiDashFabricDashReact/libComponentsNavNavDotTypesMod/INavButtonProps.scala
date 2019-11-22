package typings.officeDashUiDashFabricDashReact.libComponentsNavNavDotTypesMod

import typings.officeDashUiDashFabricDashReact.libComponentsButtonButtonDotTypesMod.IButtonProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INavButtonProps extends IButtonProps {
  /**
    * (Optional) Link to be rendered.
    */
  var link: js.UndefOr[INavLink] = js.undefined
}

object INavButtonProps {
  @scala.inline
  def apply(IButtonProps: IButtonProps = null, link: INavLink = null): INavButtonProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IButtonProps)
    if (link != null) __obj.updateDynamic("link")(link)
    __obj.asInstanceOf[INavButtonProps]
  }
}

