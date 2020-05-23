package typings.officeUiFabricReact.anon

import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Root extends js.Object {
  var root: IStyle
}

object Root {
  @scala.inline
  def apply(root: js.UndefOr[Null | IStyle] = js.undefined): Root = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(root)) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[Root]
  }
}

