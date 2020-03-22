package typings.officeUiFabricReact.stackItemTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined office-ui-fabric-react.office-ui-fabric-react/lib/Foundation.IComponentStyles<office-ui-fabric-react.office-ui-fabric-react/lib/components/Stack/StackItem/StackItem.types.IStackItemSlots> */
trait IStackItemStyles extends js.Object {
  var root: js.UndefOr[IStyle] = js.undefined
}

object IStackItemStyles {
  @scala.inline
  def apply(root: IStyle = null): IStackItemStyles = {
    val __obj = js.Dynamic.literal()
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStackItemStyles]
  }
}

