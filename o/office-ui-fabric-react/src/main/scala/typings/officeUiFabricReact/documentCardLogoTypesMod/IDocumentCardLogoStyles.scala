package typings.officeUiFabricReact.documentCardLogoTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDocumentCardLogoStyles extends js.Object {
  var root: IStyle
}

object IDocumentCardLogoStyles {
  @scala.inline
  def apply(root: js.UndefOr[Null | IStyle] = js.undefined): IDocumentCardLogoStyles = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(root)) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDocumentCardLogoStyles]
  }
}

