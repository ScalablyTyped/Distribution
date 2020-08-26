package typings.popmotion.multiMod

import typings.popmotion.actionTypesMod.ColdSubscription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultiProps[A, T, V, I] extends js.Object {
  def getCount(actions: A): Double = js.native
  def getFirst(subs: T): ColdSubscription = js.native
  def getOutput(): V = js.native
  def mapApi(subs: T, methodName: String): js.Function1[/* repeated */ js.Any, V] = js.native
  def setProp(output: V, name: I, value: js.Any): js.Any = js.native
  def startActions(actions: A, starter: ActionStarter[I]): T = js.native
}

object MultiProps {
  @scala.inline
  def apply[A, T, V, I](
    getCount: A => Double,
    getFirst: T => ColdSubscription,
    getOutput: () => V,
    mapApi: (T, String) => js.Function1[/* repeated */ js.Any, V],
    setProp: (V, I, js.Any) => js.Any,
    startActions: (A, ActionStarter[I]) => T
  ): MultiProps[A, T, V, I] = {
    val __obj = js.Dynamic.literal(getCount = js.Any.fromFunction1(getCount), getFirst = js.Any.fromFunction1(getFirst), getOutput = js.Any.fromFunction0(getOutput), mapApi = js.Any.fromFunction2(mapApi), setProp = js.Any.fromFunction3(setProp), startActions = js.Any.fromFunction2(startActions))
    __obj.asInstanceOf[MultiProps[A, T, V, I]]
  }
  @scala.inline
  implicit class MultiPropsOps[Self <: MultiProps[_, _, _, _], A, T, V, I] (val x: Self with (MultiProps[A, T, V, I])) extends AnyVal {
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
    def setGetCount(value: A => Double): Self = this.set("getCount", js.Any.fromFunction1(value))
    @scala.inline
    def setGetFirst(value: T => ColdSubscription): Self = this.set("getFirst", js.Any.fromFunction1(value))
    @scala.inline
    def setGetOutput(value: () => V): Self = this.set("getOutput", js.Any.fromFunction0(value))
    @scala.inline
    def setMapApi(value: (T, String) => js.Function1[/* repeated */ js.Any, V]): Self = this.set("mapApi", js.Any.fromFunction2(value))
    @scala.inline
    def setSetProp(value: (V, I, js.Any) => js.Any): Self = this.set("setProp", js.Any.fromFunction3(value))
    @scala.inline
    def setStartActions(value: (A, ActionStarter[I]) => T): Self = this.set("startActions", js.Any.fromFunction2(value))
  }
  
}

