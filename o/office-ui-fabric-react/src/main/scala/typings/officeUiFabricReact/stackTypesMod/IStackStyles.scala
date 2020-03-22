package typings.officeUiFabricReact.stackTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined office-ui-fabric-react.office-ui-fabric-react/lib/Foundation.IComponentStyles<office-ui-fabric-react.office-ui-fabric-react/lib/components/Stack/Stack.types.IStackSlots> */
trait IStackStyles extends js.Object {
  var inner: js.UndefOr[IStyle] = js.undefined
  var root: js.UndefOr[IStyle] = js.undefined
}

object IStackStyles {
  @scala.inline
  def apply(inner: IStyle = null, root: IStyle = null): IStackStyles = {
    val __obj = js.Dynamic.literal()
    if (inner != null) __obj.updateDynamic("inner")(inner.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStackStyles]
  }
}

