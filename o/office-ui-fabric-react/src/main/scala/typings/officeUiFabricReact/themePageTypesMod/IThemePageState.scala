package typings.officeUiFabricReact.themePageTypesMod

import typings.officeUiFabricReact.anon.Index
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IThemePageState extends js.Object {
  var activeList: js.UndefOr[String] = js.undefined
  var colorPickerProps: js.UndefOr[Index] = js.undefined
  var palette: js.Array[IThemePagePalette]
  var semanticColors: js.Array[IThemePagePalette]
}

object IThemePageState {
  @scala.inline
  def apply(
    palette: js.Array[IThemePagePalette],
    semanticColors: js.Array[IThemePagePalette],
    activeList: String = null,
    colorPickerProps: Index = null
  ): IThemePageState = {
    val __obj = js.Dynamic.literal(palette = palette.asInstanceOf[js.Any], semanticColors = semanticColors.asInstanceOf[js.Any])
    if (activeList != null) __obj.updateDynamic("activeList")(activeList.asInstanceOf[js.Any])
    if (colorPickerProps != null) __obj.updateDynamic("colorPickerProps")(colorPickerProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[IThemePageState]
  }
}

