package typings.mobxReactLite.useObserverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IUseObserverOptions extends js.Object {
  var useForceUpdate: js.UndefOr[ForceUpdateHook] = js.native
}

object IUseObserverOptions {
  @scala.inline
  def apply(): IUseObserverOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IUseObserverOptions]
  }
  @scala.inline
  implicit class IUseObserverOptionsOps[Self <: IUseObserverOptions] (val x: Self) extends AnyVal {
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
    def setUseForceUpdate(value: () => js.Function0[Unit]): Self = this.set("useForceUpdate", js.Any.fromFunction0(value))
    @scala.inline
    def deleteUseForceUpdate: Self = this.set("useForceUpdate", js.undefined)
  }
  
}

