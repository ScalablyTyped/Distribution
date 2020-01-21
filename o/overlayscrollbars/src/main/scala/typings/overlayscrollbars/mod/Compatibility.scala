package typings.overlayscrollbars.mod

import typings.overlayscrollbars.AnonXYNumber
import typings.std.Event_
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Compatibility extends js.Object {
  def bind(func: js.Function1[/* repeated */ js.Any, _], thisObj: js.Any, args: js.Any*): js.Any
  def cAF(): js.Function1[/* requestID */ Double, Unit]
  def inA[T](item: T, array: js.Array[T]): Double
  def isA(obj: js.Any): Boolean
  def mBtn(event: MouseEvent): Double
  def mO(): js.Any
  def now(): Double
  def page(event: MouseEvent): AnonXYNumber
  def prvD(event: Event_): Unit
  def rAF(): js.Function1[/* callback */ js.Function1[/* repeated */ js.Any, _], Double]
  def rO(): js.Any
  def stpP(event: Event_): Unit
  def `type`(obj: js.Any): String
  def wH(): Double
  def wW(): Double
}

object Compatibility {
  @scala.inline
  def apply(
    bind: (js.Function1[/* repeated */ js.Any, _], js.Any, /* repeated */ js.Any) => js.Any,
    cAF: () => js.Function1[/* requestID */ Double, Unit],
    inA: (js.Any, js.Array[js.Any]) => Double,
    isA: js.Any => Boolean,
    mBtn: MouseEvent => Double,
    mO: () => js.Any,
    now: () => Double,
    page: MouseEvent => AnonXYNumber,
    prvD: Event_ => Unit,
    rAF: () => js.Function1[/* callback */ js.Function1[/* repeated */ js.Any, _], Double],
    rO: () => js.Any,
    stpP: Event_ => Unit,
    `type`: js.Any => String,
    wH: () => Double,
    wW: () => Double
  ): Compatibility = {
    val __obj = js.Dynamic.literal(bind = js.Any.fromFunction3(bind), cAF = js.Any.fromFunction0(cAF), inA = js.Any.fromFunction2(inA), isA = js.Any.fromFunction1(isA), mBtn = js.Any.fromFunction1(mBtn), mO = js.Any.fromFunction0(mO), now = js.Any.fromFunction0(now), page = js.Any.fromFunction1(page), prvD = js.Any.fromFunction1(prvD), rAF = js.Any.fromFunction0(rAF), rO = js.Any.fromFunction0(rO), stpP = js.Any.fromFunction1(stpP), wH = js.Any.fromFunction0(wH), wW = js.Any.fromFunction0(wW))
    __obj.updateDynamic("type")(js.Any.fromFunction1(`type`))
    __obj.asInstanceOf[Compatibility]
  }
}

