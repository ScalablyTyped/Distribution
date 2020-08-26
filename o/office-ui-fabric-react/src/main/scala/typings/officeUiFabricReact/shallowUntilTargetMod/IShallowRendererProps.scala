package typings.officeUiFabricReact.shallowUntilTargetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IShallowRendererProps extends js.Object {
  var disableLifecycleMethods: js.UndefOr[Boolean] = js.native
  var lifecycleExperimental: js.UndefOr[Boolean] = js.native
}

object IShallowRendererProps {
  @scala.inline
  def apply(): IShallowRendererProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IShallowRendererProps]
  }
  @scala.inline
  implicit class IShallowRendererPropsOps[Self <: IShallowRendererProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDisableLifecycleMethods(value: Boolean): Self = this.set("disableLifecycleMethods", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableLifecycleMethods: Self = this.set("disableLifecycleMethods", js.undefined)
    @scala.inline
    def setLifecycleExperimental(value: Boolean): Self = this.set("lifecycleExperimental", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLifecycleExperimental: Self = this.set("lifecycleExperimental", js.undefined)
  }
  
}

