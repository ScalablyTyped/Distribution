package typings.officeUiFabricReact.overflowSetTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/OverflowSet/OverflowSet.types.IOverflowSetProps, 'vertical' | 'className'> */
trait IOverflowSetStyleProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var vertical: js.UndefOr[Boolean] = js.undefined
}

object IOverflowSetStyleProps {
  @scala.inline
  def apply(className: String = null, vertical: js.UndefOr[Boolean] = js.undefined): IOverflowSetStyleProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(vertical)) __obj.updateDynamic("vertical")(vertical.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOverflowSetStyleProps]
  }
}

