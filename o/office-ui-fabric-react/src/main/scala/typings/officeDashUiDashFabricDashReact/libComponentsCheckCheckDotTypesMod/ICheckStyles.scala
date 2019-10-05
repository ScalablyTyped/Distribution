package typings.officeDashUiDashFabricDashReact.libComponentsCheckCheckDotTypesMod

import typings.atUifabricMergeDashStyles.libIStyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICheckStyles extends js.Object {
  /**
    * The 'check' icon styles.
    */
  var check: IStyle
  /**
    * Check host style
    * @deprecated Not used directly within the component. Instead, use `CheckGlobalClassNames.checkHost` from
    * `Check.styles.ts` to get the static class name to apply to the parent element of the Check.
    */
  var checkHost: IStyle
  /**
    * The 'circle' icon styles.
    */
  var circle: IStyle
  /**
    * Style for the root element.
    */
  var root: IStyle
}

object ICheckStyles {
  @scala.inline
  def apply(check: IStyle = null, checkHost: IStyle = null, circle: IStyle = null, root: IStyle = null): ICheckStyles = {
    val __obj = js.Dynamic.literal()
    if (check != null) __obj.updateDynamic("check")(check.asInstanceOf[js.Any])
    if (checkHost != null) __obj.updateDynamic("checkHost")(checkHost.asInstanceOf[js.Any])
    if (circle != null) __obj.updateDynamic("circle")(circle.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICheckStyles]
  }
}

