package typings.popmotion.valueMod

import typings.popmotion.observerTypesMod.Complete
import typings.popmotion.observerTypesMod.Error
import typings.popmotion.observerTypesMod.Middleware
import typings.popmotion.observerTypesMod.Update
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined popmotion.popmotion/lib/observer/types.ObserverProps & {  value :popmotion.popmotion/lib/reactions/value.Value,   initialSubscription :popmotion.popmotion/lib/observer/types.Update | undefined} */
@js.native
trait ValueProps extends js.Object {
  var complete: js.UndefOr[Complete] = js.native
  var error: js.UndefOr[Error] = js.native
  var initialSubscription: js.UndefOr[Update] = js.native
  var middleware: js.UndefOr[js.Array[Middleware]] = js.native
  var onComplete: js.UndefOr[js.Function] = js.native
  var registerParent: js.UndefOr[js.Function] = js.native
  var update: js.UndefOr[Update] = js.native
  var value: Value = js.native
}

object ValueProps {
  @scala.inline
  def apply(value: Value): ValueProps = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueProps]
  }
  @scala.inline
  implicit class ValuePropsOps[Self <: ValueProps] (val x: Self) extends AnyVal {
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
    def setValueVarargs(value: (Double | String)*): Self = this.set("value", js.Array(value :_*))
    @scala.inline
    def setValue(value: Value): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def setComplete(value: () => js.Any): Self = this.set("complete", js.Any.fromFunction0(value))
    @scala.inline
    def deleteComplete: Self = this.set("complete", js.undefined)
    @scala.inline
    def setError(value: /* err */ js.UndefOr[js.Any] => js.Any): Self = this.set("error", js.Any.fromFunction1(value))
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setInitialSubscription(value: Update): Self = this.set("initialSubscription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialSubscription: Self = this.set("initialSubscription", js.undefined)
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

