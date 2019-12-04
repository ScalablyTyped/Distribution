package typings.popmotion.libCompositorsMultiMod

import typings.popmotion.libActionTypesMod.ColdSubscription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiProps[A, T, V, I] extends js.Object {
  def getCount(actions: A): Double
  def getFirst(subs: T): ColdSubscription
  def getOutput(): V
  def mapApi(subs: T, methodName: String): js.Function1[/* repeated */ js.Any, V]
  def setProp(output: V, name: I, value: js.Any): js.Any
  def startActions(actions: A, starter: ActionStarter[I]): T
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
}

