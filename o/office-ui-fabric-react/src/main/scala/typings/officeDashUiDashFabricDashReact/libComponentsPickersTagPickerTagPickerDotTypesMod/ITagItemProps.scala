package typings.officeDashUiDashFabricDashReact.libComponentsPickersTagPickerTagPickerDotTypesMod

import typings.atUifabricMergeDashStyles.libIStyleFunctionMod.IStyleFunctionOrObject
import typings.atUifabricStyling.libInterfacesIThemeMod.ITheme
import typings.officeDashUiDashFabricDashReact.libComponentsPickersPickerItemDotTypesMod.IPickerItemProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITagItemProps extends IPickerItemProps[ITag] {
  /**
    * Enable or not focus on TagItem when TagPicker is disabled.
    * @defaultvalue false
    */
  var enableTagFocusInDisabledPicker: js.UndefOr[Boolean] = js.undefined
  /** Call to provide customized styling that will layer on top of the variant rules. */
  var styles: js.UndefOr[IStyleFunctionOrObject[ITagItemStyleProps, ITagItemStyles]] = js.undefined
  /** Theme provided by High-Order Component. */
  var theme: js.UndefOr[ITheme] = js.undefined
}

object ITagItemProps {
  @scala.inline
  def apply(
    IPickerItemProps: IPickerItemProps[ITag],
    enableTagFocusInDisabledPicker: js.UndefOr[Boolean] = js.undefined,
    styles: IStyleFunctionOrObject[ITagItemStyleProps, ITagItemStyles] = null,
    theme: ITheme = null
  ): ITagItemProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IPickerItemProps)
    if (!js.isUndefined(enableTagFocusInDisabledPicker)) __obj.updateDynamic("enableTagFocusInDisabledPicker")(enableTagFocusInDisabledPicker.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITagItemProps]
  }
}

