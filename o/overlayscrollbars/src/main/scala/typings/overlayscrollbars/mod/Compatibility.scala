package typings.overlayscrollbars.mod

import typings.overlayscrollbars.anon.XNumber
import typings.std.Event
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Compatibility extends js.Object {
  def bind(func: js.Function1[/* repeated */ js.Any, _], thisObj: js.Any, args: js.Any*): js.Any = js.native
  def cAF(): js.Function1[/* requestID */ Double, Unit] = js.native
  def inA[T](item: T, array: js.Array[T]): Double = js.native
  def isA(obj: js.Any): Boolean = js.native
  def mBtn(event: MouseEvent): Double = js.native
  def mO(): js.Any = js.native
  def now(): Double = js.native
  def page(event: MouseEvent): XNumber = js.native
  def prvD(event: Event): Unit = js.native
  def rAF(): js.Function1[/* callback */ js.Function1[/* repeated */ js.Any, _], Double] = js.native
  def rO(): js.Any = js.native
  def stpP(event: Event): Unit = js.native
  def `type`(obj: js.Any): String = js.native
  def wH(): Double = js.native
  def wW(): Double = js.native
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
    page: MouseEvent => XNumber,
    prvD: Event => Unit,
    rAF: () => js.Function1[/* callback */ js.Function1[/* repeated */ js.Any, _], Double],
    rO: () => js.Any,
    stpP: Event => Unit,
    `type`: js.Any => String,
    wH: () => Double,
    wW: () => Double
  ): Compatibility = {
    val __obj = js.Dynamic.literal(bind = js.Any.fromFunction3(bind), cAF = js.Any.fromFunction0(cAF), inA = js.Any.fromFunction2(inA), isA = js.Any.fromFunction1(isA), mBtn = js.Any.fromFunction1(mBtn), mO = js.Any.fromFunction0(mO), now = js.Any.fromFunction0(now), page = js.Any.fromFunction1(page), prvD = js.Any.fromFunction1(prvD), rAF = js.Any.fromFunction0(rAF), rO = js.Any.fromFunction0(rO), stpP = js.Any.fromFunction1(stpP), wH = js.Any.fromFunction0(wH), wW = js.Any.fromFunction0(wW))
    __obj.updateDynamic("type")(js.Any.fromFunction1(`type`))
    __obj.asInstanceOf[Compatibility]
  }
  @scala.inline
  implicit class CompatibilityOps[Self <: Compatibility] (val x: Self) extends AnyVal {
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
    def setBind(value: (js.Function1[/* repeated */ js.Any, _], js.Any, /* repeated */ js.Any) => js.Any): Self = this.set("bind", js.Any.fromFunction3(value))
    @scala.inline
    def setCAF(value: () => js.Function1[/* requestID */ Double, Unit]): Self = this.set("cAF", js.Any.fromFunction0(value))
    @scala.inline
    def setInA(value: (js.Any, js.Array[js.Any]) => Double): Self = this.set("inA", js.Any.fromFunction2(value))
    @scala.inline
    def setIsA(value: js.Any => Boolean): Self = this.set("isA", js.Any.fromFunction1(value))
    @scala.inline
    def setMBtn(value: MouseEvent => Double): Self = this.set("mBtn", js.Any.fromFunction1(value))
    @scala.inline
    def setMO(value: () => js.Any): Self = this.set("mO", js.Any.fromFunction0(value))
    @scala.inline
    def setNow(value: () => Double): Self = this.set("now", js.Any.fromFunction0(value))
    @scala.inline
    def setPage(value: MouseEvent => XNumber): Self = this.set("page", js.Any.fromFunction1(value))
    @scala.inline
    def setPrvD(value: Event => Unit): Self = this.set("prvD", js.Any.fromFunction1(value))
    @scala.inline
    def setRAF(value: () => js.Function1[/* callback */ js.Function1[/* repeated */ js.Any, _], Double]): Self = this.set("rAF", js.Any.fromFunction0(value))
    @scala.inline
    def setRO(value: () => js.Any): Self = this.set("rO", js.Any.fromFunction0(value))
    @scala.inline
    def setStpP(value: Event => Unit): Self = this.set("stpP", js.Any.fromFunction1(value))
    @scala.inline
    def setType(value: js.Any => String): Self = this.set("type", js.Any.fromFunction1(value))
    @scala.inline
    def setWH(value: () => Double): Self = this.set("wH", js.Any.fromFunction0(value))
    @scala.inline
    def setWW(value: () => Double): Self = this.set("wW", js.Any.fromFunction0(value))
  }
  
}

