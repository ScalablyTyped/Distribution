package typings.officeDashUiDashFabricDashReact.libComponentsButtonBaseButtonMod

import typings.officeDashUiDashFabricDashReact.libComponentsButtonButtonDotTypesMod.IButtonProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBaseButtonProps extends IButtonProps {
  var baseClassName: js.UndefOr[String] = js.undefined
  var variantClassName: js.UndefOr[String] = js.undefined
}

object IBaseButtonProps {
  @scala.inline
  def apply(IButtonProps: IButtonProps = null, baseClassName: String = null, variantClassName: String = null): IBaseButtonProps = {
    val __obj = js.Dynamic.literal()
    if (IButtonProps != null) js.Dynamic.global.Object.assign(__obj, IButtonProps)
    if (baseClassName != null) __obj.updateDynamic("baseClassName")(baseClassName.asInstanceOf[js.Any])
    if (variantClassName != null) __obj.updateDynamic("variantClassName")(variantClassName.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBaseButtonProps]
  }
}

