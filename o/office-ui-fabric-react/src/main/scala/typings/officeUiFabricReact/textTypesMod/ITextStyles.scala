package typings.officeUiFabricReact.textTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined office-ui-fabric-react.office-ui-fabric-react/lib/Foundation.IComponentStyles<office-ui-fabric-react.office-ui-fabric-react/lib/components/Text/Text.types.ITextSlots> */
trait ITextStyles extends js.Object {
  var root: js.UndefOr[IStyle] = js.undefined
}

object ITextStyles {
  @scala.inline
  def apply(root: IStyle = null): ITextStyles = {
    val __obj = js.Dynamic.literal()
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITextStyles]
  }
}

