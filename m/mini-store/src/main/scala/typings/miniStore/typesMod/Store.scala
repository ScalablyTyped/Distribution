package typings.miniStore.typesMod

import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Store[S] extends js.Object {
  def getState(): S = js.native
  def setState(state: Partial[S]): Unit = js.native
  def subscribe(listener: js.Function0[Unit]): js.Function0[Unit] = js.native
}

object Store {
  @scala.inline
  def apply[S](
    getState: () => S,
    setState: Partial[S] => Unit,
    subscribe: js.Function0[Unit] => js.Function0[Unit]
  ): Store[S] = {
    val __obj = js.Dynamic.literal(getState = js.Any.fromFunction0(getState), setState = js.Any.fromFunction1(setState), subscribe = js.Any.fromFunction1(subscribe))
    __obj.asInstanceOf[Store[S]]
  }
  @scala.inline
  implicit class StoreOps[Self <: Store[_], S] (val x: Self with Store[S]) extends AnyVal {
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
    def setGetState(value: () => S): Self = this.set("getState", js.Any.fromFunction0(value))
    @scala.inline
    def setSetState(value: Partial[S] => Unit): Self = this.set("setState", js.Any.fromFunction1(value))
    @scala.inline
    def setSubscribe(value: js.Function0[Unit] => js.Function0[Unit]): Self = this.set("subscribe", js.Any.fromFunction1(value))
  }
  
}

