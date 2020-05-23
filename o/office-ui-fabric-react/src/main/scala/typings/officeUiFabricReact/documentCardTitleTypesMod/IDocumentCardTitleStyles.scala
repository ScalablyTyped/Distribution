package typings.officeUiFabricReact.documentCardTitleTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDocumentCardTitleStyles extends js.Object {
  var root: IStyle
}

object IDocumentCardTitleStyles {
  @scala.inline
  def apply(root: js.UndefOr[Null | IStyle] = js.undefined): IDocumentCardTitleStyles = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(root)) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDocumentCardTitleStyles]
  }
}

