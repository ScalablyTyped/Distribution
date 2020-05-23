package typings.officeUiFabricReact.layerTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILayerStyles extends js.Object {
  /**
    * Style for the Fabric component.
    */
  var content: js.UndefOr[IStyle] = js.undefined
  /**
    * Style for the root element when fixed.
    */
  var root: js.UndefOr[IStyle] = js.undefined
}

object ILayerStyles {
  @scala.inline
  def apply(content: js.UndefOr[Null | IStyle] = js.undefined, root: js.UndefOr[Null | IStyle] = js.undefined): ILayerStyles = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(content)) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (!js.isUndefined(root)) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILayerStyles]
  }
}

