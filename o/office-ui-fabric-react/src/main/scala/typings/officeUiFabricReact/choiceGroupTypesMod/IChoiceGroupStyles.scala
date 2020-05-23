package typings.officeUiFabricReact.choiceGroupTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IChoiceGroupStyles extends js.Object {
  /**
    * The actual root of the component.
    * @deprecated Styles will be merged with `root` in a future release.
    */
  var applicationRole: js.UndefOr[IStyle] = js.undefined
  var flexContainer: js.UndefOr[IStyle] = js.undefined
  var label: js.UndefOr[IStyle] = js.undefined
  /**
    * Not currently the actual root of the component (will be fixed in a future release).
    * For now, to style the actual root, use `applicationRole`.
    */
  var root: js.UndefOr[IStyle] = js.undefined
}

object IChoiceGroupStyles {
  @scala.inline
  def apply(
    applicationRole: js.UndefOr[Null | IStyle] = js.undefined,
    flexContainer: js.UndefOr[Null | IStyle] = js.undefined,
    label: js.UndefOr[Null | IStyle] = js.undefined,
    root: js.UndefOr[Null | IStyle] = js.undefined
  ): IChoiceGroupStyles = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(applicationRole)) __obj.updateDynamic("applicationRole")(applicationRole.asInstanceOf[js.Any])
    if (!js.isUndefined(flexContainer)) __obj.updateDynamic("flexContainer")(flexContainer.asInstanceOf[js.Any])
    if (!js.isUndefined(label)) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (!js.isUndefined(root)) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[IChoiceGroupStyles]
  }
}

