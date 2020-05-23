package typings.officeUiFabricReact.separatorTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISeparatorStyles extends js.Object {
  /**
    * Style for the content
    */
  var content: IStyle
  /**
    * Style for the root element
    */
  var root: IStyle
}

object ISeparatorStyles {
  @scala.inline
  def apply(content: js.UndefOr[Null | IStyle] = js.undefined, root: js.UndefOr[Null | IStyle] = js.undefined): ISeparatorStyles = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(content)) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (!js.isUndefined(root)) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISeparatorStyles]
  }
}

