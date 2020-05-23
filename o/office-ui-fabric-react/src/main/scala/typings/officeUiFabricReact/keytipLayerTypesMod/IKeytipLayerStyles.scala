package typings.officeUiFabricReact.keytipLayerTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IKeytipLayerStyles extends js.Object {
  var innerContent: IStyle
}

object IKeytipLayerStyles {
  @scala.inline
  def apply(innerContent: js.UndefOr[Null | IStyle] = js.undefined): IKeytipLayerStyles = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(innerContent)) __obj.updateDynamic("innerContent")(innerContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[IKeytipLayerStyles]
  }
}

