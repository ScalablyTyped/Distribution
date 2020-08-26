package typings.nextReduxWrapper.mod

import typings.redux.mod.Action
import typings.redux.mod.Store
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InitStoreOptions[S, A /* <: Action[_] */] extends js.Object {
  var config: Config[S] = js.native
  var context: Context = js.native
  var makeStore: MakeStore[S, A] = js.native
}

object InitStoreOptions {
  @scala.inline
  def apply[S, /* <: typings.redux.mod.Action[_] */ A](config: Config[S], context: Context, makeStore: /* context */ Context => Store[S, A]): InitStoreOptions[S, A] = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], makeStore = js.Any.fromFunction1(makeStore))
    __obj.asInstanceOf[InitStoreOptions[S, A]]
  }
  @scala.inline
  implicit class InitStoreOptionsOps[Self <: InitStoreOptions[_, _], S, /* <: typings.redux.mod.Action[_] */ A] (val x: Self with (InitStoreOptions[S, A])) extends AnyVal {
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
    def setConfig(value: Config[S]): Self = this.set("config", value.asInstanceOf[js.Any])
    @scala.inline
    def setContext(value: Context): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def setMakeStore(value: /* context */ Context => Store[S, A]): Self = this.set("makeStore", js.Any.fromFunction1(value))
  }
  
}

