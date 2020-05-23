package typings.officeUiFabricReact.documentCardLocationTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDocumentCardLocationStyles extends js.Object {
  var root: IStyle
}

object IDocumentCardLocationStyles {
  @scala.inline
  def apply(root: js.UndefOr[Null | IStyle] = js.undefined): IDocumentCardLocationStyles = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(root)) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDocumentCardLocationStyles]
  }
}

