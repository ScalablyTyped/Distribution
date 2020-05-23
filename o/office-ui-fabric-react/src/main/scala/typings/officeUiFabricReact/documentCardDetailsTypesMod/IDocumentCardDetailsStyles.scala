package typings.officeUiFabricReact.documentCardDetailsTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDocumentCardDetailsStyles extends js.Object {
  var root: IStyle
}

object IDocumentCardDetailsStyles {
  @scala.inline
  def apply(root: js.UndefOr[Null | IStyle] = js.undefined): IDocumentCardDetailsStyles = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(root)) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDocumentCardDetailsStyles]
  }
}

