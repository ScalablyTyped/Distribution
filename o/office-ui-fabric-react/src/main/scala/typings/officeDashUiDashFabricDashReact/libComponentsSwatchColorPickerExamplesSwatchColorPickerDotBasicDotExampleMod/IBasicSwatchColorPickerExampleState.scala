package typings.officeDashUiDashFabricDashReact.libComponentsSwatchColorPickerExamplesSwatchColorPickerDotBasicDotExampleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBasicSwatchColorPickerExampleState extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var color2: js.UndefOr[String] = js.undefined
  var previewColor: js.UndefOr[String] = js.undefined
  var previewColor2: js.UndefOr[String] = js.undefined
}

object IBasicSwatchColorPickerExampleState {
  @scala.inline
  def apply(
    color: String = null,
    color2: String = null,
    previewColor: String = null,
    previewColor2: String = null
  ): IBasicSwatchColorPickerExampleState = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (color2 != null) __obj.updateDynamic("color2")(color2.asInstanceOf[js.Any])
    if (previewColor != null) __obj.updateDynamic("previewColor")(previewColor.asInstanceOf[js.Any])
    if (previewColor2 != null) __obj.updateDynamic("previewColor2")(previewColor2.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBasicSwatchColorPickerExampleState]
  }
}

