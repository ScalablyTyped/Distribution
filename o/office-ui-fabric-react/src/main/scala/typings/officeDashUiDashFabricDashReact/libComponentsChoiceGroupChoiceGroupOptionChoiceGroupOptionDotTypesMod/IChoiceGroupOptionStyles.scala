package typings.officeDashUiDashFabricDashReact.libComponentsChoiceGroupChoiceGroupOptionChoiceGroupOptionDotTypesMod

import typings.atUifabricMergeDashStyles.libIStyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IChoiceGroupOptionStyles extends js.Object {
  var choiceFieldWrapper: js.UndefOr[IStyle] = js.undefined
  var field: js.UndefOr[IStyle] = js.undefined
  var iconWrapper: js.UndefOr[IStyle] = js.undefined
  var imageWrapper: js.UndefOr[IStyle] = js.undefined
  var innerField: js.UndefOr[IStyle] = js.undefined
  var input: js.UndefOr[IStyle] = js.undefined
  var labelWrapper: js.UndefOr[IStyle] = js.undefined
  var root: js.UndefOr[IStyle] = js.undefined
  var selectedImageWrapper: js.UndefOr[IStyle] = js.undefined
}

object IChoiceGroupOptionStyles {
  @scala.inline
  def apply(
    choiceFieldWrapper: IStyle = null,
    field: IStyle = null,
    iconWrapper: IStyle = null,
    imageWrapper: IStyle = null,
    innerField: IStyle = null,
    input: IStyle = null,
    labelWrapper: IStyle = null,
    root: IStyle = null,
    selectedImageWrapper: IStyle = null
  ): IChoiceGroupOptionStyles = {
    val __obj = js.Dynamic.literal()
    if (choiceFieldWrapper != null) __obj.updateDynamic("choiceFieldWrapper")(choiceFieldWrapper.asInstanceOf[js.Any])
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (iconWrapper != null) __obj.updateDynamic("iconWrapper")(iconWrapper.asInstanceOf[js.Any])
    if (imageWrapper != null) __obj.updateDynamic("imageWrapper")(imageWrapper.asInstanceOf[js.Any])
    if (innerField != null) __obj.updateDynamic("innerField")(innerField.asInstanceOf[js.Any])
    if (input != null) __obj.updateDynamic("input")(input.asInstanceOf[js.Any])
    if (labelWrapper != null) __obj.updateDynamic("labelWrapper")(labelWrapper.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (selectedImageWrapper != null) __obj.updateDynamic("selectedImageWrapper")(selectedImageWrapper.asInstanceOf[js.Any])
    __obj.asInstanceOf[IChoiceGroupOptionStyles]
  }
}

