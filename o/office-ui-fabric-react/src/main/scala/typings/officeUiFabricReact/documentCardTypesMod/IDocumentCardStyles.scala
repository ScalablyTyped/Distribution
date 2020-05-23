package typings.officeUiFabricReact.documentCardTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDocumentCardStyles extends js.Object {
  var root: IStyle
}

object IDocumentCardStyles {
  @scala.inline
  def apply(root: js.UndefOr[Null | IStyle] = js.undefined): IDocumentCardStyles = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(root)) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDocumentCardStyles]
  }
}

