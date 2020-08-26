package typings.memoizee.mod

import typings.memoizee.memoizeeBooleans.`false`
import typings.memoizee.memoizeeBooleans.`true`
import typings.std.Parameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options[F /* <: js.Function1[/* repeated */ js.Any, _] */] extends js.Object {
  var async: js.UndefOr[Boolean] = js.native
  var dispose: js.UndefOr[js.Function1[/* value */ js.Any, Unit]] = js.native
  var length: js.UndefOr[Double | `false`] = js.native
  var max: js.UndefOr[Double] = js.native
  var maxAge: js.UndefOr[Double] = js.native
  var normalizer: js.UndefOr[js.Function1[/* args */ Parameters[F], String]] = js.native
  var preFetch: js.UndefOr[Double | `true`] = js.native
  var primitive: js.UndefOr[Boolean] = js.native
  var promise: js.UndefOr[Boolean] = js.native
  var resolvers: js.UndefOr[js.Array[js.Function1[/* arg */ _, _]]] = js.native
}

object Options {
  @scala.inline
  def apply[/* <: js.Function1[/ * repeated * / js.Any, _] */ F](): Options[F] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options[F]]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options[_], /* <: js.Function1[/ * repeated * / js.Any, _] */ F] (val x: Self with Options[F]) extends AnyVal {
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
    def setAsync(value: Boolean): Self = this.set("async", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAsync: Self = this.set("async", js.undefined)
    @scala.inline
    def setDispose(value: /* value */ js.Any => Unit): Self = this.set("dispose", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDispose: Self = this.set("dispose", js.undefined)
    @scala.inline
    def setLength(value: Double | `false`): Self = this.set("length", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLength: Self = this.set("length", js.undefined)
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    @scala.inline
    def setMaxAge(value: Double): Self = this.set("maxAge", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxAge: Self = this.set("maxAge", js.undefined)
    @scala.inline
    def setNormalizer(value: /* args */ Parameters[F] => String): Self = this.set("normalizer", js.Any.fromFunction1(value))
    @scala.inline
    def deleteNormalizer: Self = this.set("normalizer", js.undefined)
    @scala.inline
    def setPreFetch(value: Double | `true`): Self = this.set("preFetch", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreFetch: Self = this.set("preFetch", js.undefined)
    @scala.inline
    def setPrimitive(value: Boolean): Self = this.set("primitive", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrimitive: Self = this.set("primitive", js.undefined)
    @scala.inline
    def setPromise(value: Boolean): Self = this.set("promise", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePromise: Self = this.set("promise", js.undefined)
    @scala.inline
    def setResolversVarargs(value: (js.Function1[js.Any, js.Any])*): Self = this.set("resolvers", js.Array(value :_*))
    @scala.inline
    def setResolvers(value: js.Array[js.Function1[/* arg */ _, _]]): Self = this.set("resolvers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResolvers: Self = this.set("resolvers", js.undefined)
  }
  
}

