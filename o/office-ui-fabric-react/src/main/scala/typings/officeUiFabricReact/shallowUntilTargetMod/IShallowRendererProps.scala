package typings.officeUiFabricReact.shallowUntilTargetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IShallowRendererProps extends js.Object {
  var disableLifecycleMethods: js.UndefOr[Boolean] = js.undefined
  var lifecycleExperimental: js.UndefOr[Boolean] = js.undefined
}

object IShallowRendererProps {
  @scala.inline
  def apply(
    disableLifecycleMethods: js.UndefOr[Boolean] = js.undefined,
    lifecycleExperimental: js.UndefOr[Boolean] = js.undefined
  ): IShallowRendererProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disableLifecycleMethods)) __obj.updateDynamic("disableLifecycleMethods")(disableLifecycleMethods.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lifecycleExperimental)) __obj.updateDynamic("lifecycleExperimental")(lifecycleExperimental.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IShallowRendererProps]
  }
}

