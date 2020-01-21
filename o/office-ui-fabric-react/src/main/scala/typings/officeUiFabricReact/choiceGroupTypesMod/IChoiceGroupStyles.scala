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
    applicationRole: IStyle = null,
    flexContainer: IStyle = null,
    label: IStyle = null,
    root: IStyle = null
  ): IChoiceGroupStyles = {
    val __obj = js.Dynamic.literal()
    if (applicationRole != null) __obj.updateDynamic("applicationRole")(applicationRole.asInstanceOf[js.Any])
    if (flexContainer != null) __obj.updateDynamic("flexContainer")(flexContainer.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[IChoiceGroupStyles]
  }
}

