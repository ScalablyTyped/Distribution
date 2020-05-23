package typings.officeUiFabricReact.fabricTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFabricStyles extends js.Object {
  var bodyThemed: IStyle
  var root: IStyle
}

object IFabricStyles {
  @scala.inline
  def apply(
    bodyThemed: js.UndefOr[Null | IStyle] = js.undefined,
    root: js.UndefOr[Null | IStyle] = js.undefined
  ): IFabricStyles = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bodyThemed)) __obj.updateDynamic("bodyThemed")(bodyThemed.asInstanceOf[js.Any])
    if (!js.isUndefined(root)) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFabricStyles]
  }
}

