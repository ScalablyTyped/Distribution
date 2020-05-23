package typings.officeUiFabricReact.keytipTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IKeytipStyles extends js.Object {
  /**
    * Style for the div container surrounding the keytip content.
    */
  var container: IStyle
  /**
    * Style for the keytip content element.
    */
  var root: IStyle
}

object IKeytipStyles {
  @scala.inline
  def apply(
    container: js.UndefOr[Null | IStyle] = js.undefined,
    root: js.UndefOr[Null | IStyle] = js.undefined
  ): IKeytipStyles = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(container)) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (!js.isUndefined(root)) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[IKeytipStyles]
  }
}

