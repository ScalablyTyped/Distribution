package typings.moonjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LifecycleHooks extends js.Object {
  var destroyed: js.UndefOr[js.Function0[Unit]] = js.native
  var init: js.UndefOr[js.Function0[Unit]] = js.native
  var mounted: js.UndefOr[js.Function0[Unit]] = js.native
  var updated: js.UndefOr[js.Function0[Unit]] = js.native
}

object LifecycleHooks {
  @scala.inline
  def apply(): LifecycleHooks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LifecycleHooks]
  }
  @scala.inline
  implicit class LifecycleHooksOps[Self <: LifecycleHooks] (val x: Self) extends AnyVal {
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
    def setDestroyed(value: () => Unit): Self = this.set("destroyed", js.Any.fromFunction0(value))
    @scala.inline
    def deleteDestroyed: Self = this.set("destroyed", js.undefined)
    @scala.inline
    def setInit(value: () => Unit): Self = this.set("init", js.Any.fromFunction0(value))
    @scala.inline
    def deleteInit: Self = this.set("init", js.undefined)
    @scala.inline
    def setMounted(value: () => Unit): Self = this.set("mounted", js.Any.fromFunction0(value))
    @scala.inline
    def deleteMounted: Self = this.set("mounted", js.undefined)
    @scala.inline
    def setUpdated(value: () => Unit): Self = this.set("updated", js.Any.fromFunction0(value))
    @scala.inline
    def deleteUpdated: Self = this.set("updated", js.undefined)
  }
  
}

