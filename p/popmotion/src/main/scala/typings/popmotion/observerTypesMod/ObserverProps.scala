package typings.popmotion.observerTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined popmotion.popmotion/lib/observer/types.PartialObserver & {  middleware :std.Array<popmotion.popmotion/lib/observer/types.Middleware> | undefined,   onComplete :std.Function | undefined} */
@js.native
trait ObserverProps extends js.Object {
  var complete: js.UndefOr[Complete] = js.native
  var error: js.UndefOr[Error] = js.native
  var middleware: js.UndefOr[js.Array[Middleware]] = js.native
  var onComplete: js.UndefOr[js.Function] = js.native
  var registerParent: js.UndefOr[js.Function] = js.native
  var update: js.UndefOr[Update] = js.native
}

object ObserverProps {
  @scala.inline
  def apply(): ObserverProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObserverProps]
  }
  @scala.inline
  implicit class ObserverPropsOps[Self <: ObserverProps] (val x: Self) extends AnyVal {
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
    def setComplete(value: () => js.Any): Self = this.set("complete", js.Any.fromFunction0(value))
    @scala.inline
    def deleteComplete: Self = this.set("complete", js.undefined)
    @scala.inline
    def setError(value: /* err */ js.UndefOr[js.Any] => js.Any): Self = this.set("error", js.Any.fromFunction1(value))
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setMiddlewareVarargs(value: Middleware*): Self = this.set("middleware", js.Array(value :_*))
    @scala.inline
    def setMiddleware(value: js.Array[Middleware]): Self = this.set("middleware", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMiddleware: Self = this.set("middleware", js.undefined)
    @scala.inline
    def setOnComplete(value: js.Function): Self = this.set("onComplete", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnComplete: Self = this.set("onComplete", js.undefined)
    @scala.inline
    def setRegisterParent(value: js.Function): Self = this.set("registerParent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegisterParent: Self = this.set("registerParent", js.undefined)
    @scala.inline
    def setUpdate(value: Update): Self = this.set("update", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdate: Self = this.set("update", js.undefined)
  }
  
}

