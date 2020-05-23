package typings.officeUiFabricReact.checkTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
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
  def apply(
    check: js.UndefOr[Null | IStyle] = js.undefined,
    checkHost: js.UndefOr[Null | IStyle] = js.undefined,
    circle: js.UndefOr[Null | IStyle] = js.undefined,
    root: js.UndefOr[Null | IStyle] = js.undefined
  ): ICheckStyles = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(check)) __obj.updateDynamic("check")(check.asInstanceOf[js.Any])
    if (!js.isUndefined(checkHost)) __obj.updateDynamic("checkHost")(checkHost.asInstanceOf[js.Any])
    if (!js.isUndefined(circle)) __obj.updateDynamic("circle")(circle.asInstanceOf[js.Any])
    if (!js.isUndefined(root)) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICheckStyles]
  }
}

