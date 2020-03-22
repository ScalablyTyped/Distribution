package typings.officeUiFabricReact.checkTypesMod

import typings.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Required<std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/Check/Check.types.ICheckProps, 'theme'>> & std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/Check/Check.types.ICheckProps, 'className' | 'checked'> & {  height ? :string,   checkBoxHeight ? :string} */
trait ICheckStyleProps extends js.Object {
  /**
    * Custom height/width for the checkbox.
    * @defaultvalue '18px'
    * @deprecated Use `height`
    */
  var checkBoxHeight: js.UndefOr[String] = js.undefined
  var checked: js.UndefOr[Boolean] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  /**
    * Custom height/width for the checkbox.
    * @defaultvalue '18px'
    */
  var height: js.UndefOr[String] = js.undefined
  var theme: ITheme
}

object ICheckStyleProps {
  @scala.inline
  def apply(
    theme: ITheme,
    checkBoxHeight: String = null,
    checked: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    height: String = null
  ): ICheckStyleProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    if (checkBoxHeight != null) __obj.updateDynamic("checkBoxHeight")(checkBoxHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICheckStyleProps]
  }
}

