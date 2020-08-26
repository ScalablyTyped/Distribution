package typings.optimism.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptimisticWrapOptions[TArgs /* <: js.Array[_] */, TKeyArgs /* <: js.Array[_] */] extends js.Object {
  var keyArgs: js.UndefOr[js.Function1[/* args */ TArgs, TKeyArgs]] = js.native
  var makeCacheKey: js.UndefOr[js.Function1[/* args */ TKeyArgs, TCacheKey]] = js.native
  var max: js.UndefOr[Double] = js.native
  var subscribe: js.UndefOr[js.Function1[/* args */ TArgs, Unit | js.Function0[_]]] = js.native
}

object OptimisticWrapOptions {
  @scala.inline
  def apply[/* <: js.Array[_] */ TArgs, /* <: js.Array[_] */ TKeyArgs](): OptimisticWrapOptions[TArgs, TKeyArgs] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptimisticWrapOptions[TArgs, TKeyArgs]]
  }
  @scala.inline
  implicit class OptimisticWrapOptionsOps[Self <: OptimisticWrapOptions[_, _], /* <: js.Array[_] */ TArgs, /* <: js.Array[_] */ TKeyArgs] (val x: Self with (OptimisticWrapOptions[TArgs, TKeyArgs])) extends AnyVal {
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
    def setKeyArgs(value: /* args */ TArgs => TKeyArgs): Self = this.set("keyArgs", js.Any.fromFunction1(value))
    @scala.inline
    def deleteKeyArgs: Self = this.set("keyArgs", js.undefined)
    @scala.inline
    def setMakeCacheKey(value: /* args */ TKeyArgs => TCacheKey): Self = this.set("makeCacheKey", js.Any.fromFunction1(value))
    @scala.inline
    def deleteMakeCacheKey: Self = this.set("makeCacheKey", js.undefined)
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    @scala.inline
    def setSubscribe(value: /* args */ TArgs => Unit | js.Function0[_]): Self = this.set("subscribe", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSubscribe: Self = this.set("subscribe", js.undefined)
  }
  
}

