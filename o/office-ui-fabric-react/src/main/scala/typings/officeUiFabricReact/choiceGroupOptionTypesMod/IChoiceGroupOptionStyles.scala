package typings.officeUiFabricReact.choiceGroupOptionTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
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
    choiceFieldWrapper: js.UndefOr[Null | IStyle] = js.undefined,
    field: js.UndefOr[Null | IStyle] = js.undefined,
    iconWrapper: js.UndefOr[Null | IStyle] = js.undefined,
    imageWrapper: js.UndefOr[Null | IStyle] = js.undefined,
    innerField: js.UndefOr[Null | IStyle] = js.undefined,
    input: js.UndefOr[Null | IStyle] = js.undefined,
    labelWrapper: js.UndefOr[Null | IStyle] = js.undefined,
    root: js.UndefOr[Null | IStyle] = js.undefined,
    selectedImageWrapper: js.UndefOr[Null | IStyle] = js.undefined
  ): IChoiceGroupOptionStyles = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(choiceFieldWrapper)) __obj.updateDynamic("choiceFieldWrapper")(choiceFieldWrapper.asInstanceOf[js.Any])
    if (!js.isUndefined(field)) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (!js.isUndefined(iconWrapper)) __obj.updateDynamic("iconWrapper")(iconWrapper.asInstanceOf[js.Any])
    if (!js.isUndefined(imageWrapper)) __obj.updateDynamic("imageWrapper")(imageWrapper.asInstanceOf[js.Any])
    if (!js.isUndefined(innerField)) __obj.updateDynamic("innerField")(innerField.asInstanceOf[js.Any])
    if (!js.isUndefined(input)) __obj.updateDynamic("input")(input.asInstanceOf[js.Any])
    if (!js.isUndefined(labelWrapper)) __obj.updateDynamic("labelWrapper")(labelWrapper.asInstanceOf[js.Any])
    if (!js.isUndefined(root)) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (!js.isUndefined(selectedImageWrapper)) __obj.updateDynamic("selectedImageWrapper")(selectedImageWrapper.asInstanceOf[js.Any])
    __obj.asInstanceOf[IChoiceGroupOptionStyles]
  }
}

