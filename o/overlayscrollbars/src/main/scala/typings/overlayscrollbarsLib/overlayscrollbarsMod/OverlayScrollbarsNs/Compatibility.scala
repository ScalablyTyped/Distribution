package typings
package overlayscrollbarsLib.overlayscrollbarsMod.OverlayScrollbarsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Compatibility extends js.Object {
  def bind(func: js.Function1[/* repeated */ js.Any, _], thisObj: js.Any, args: js.Any*): js.Any
  def cAF(): js.Function1[/* requestID */ scala.Double, scala.Unit]
  def inA[T](item: T, array: js.Array[T]): scala.Double
  def isA(obj: js.Any): scala.Boolean
  def mBtn(event: stdLib.MouseEvent): scala.Double
  def mO(): js.Any
  def now(): scala.Double
  def page(event: stdLib.MouseEvent): overlayscrollbarsLib.Anon_XYNumber
  def prvD(event: stdLib.Event): scala.Unit
  def rAF(): js.Function1[/* callback */ js.Function1[/* repeated */ js.Any, _], scala.Double]
  def rO(): js.Any
  def stpP(event: stdLib.Event): scala.Unit
  def `type`(obj: js.Any): java.lang.String
  def wH(): scala.Double
  def wW(): scala.Double
}

object Compatibility {
  @scala.inline
  def apply(
    bind: (js.Function1[/* repeated */ js.Any, _], js.Any, /* repeated */ js.Any) => js.Any,
    cAF: () => js.Function1[/* requestID */ scala.Double, scala.Unit],
    inA: (js.Any, js.Array[js.Any]) => scala.Double,
    isA: js.Any => scala.Boolean,
    mBtn: stdLib.MouseEvent => scala.Double,
    mO: () => js.Any,
    now: () => scala.Double,
    page: stdLib.MouseEvent => overlayscrollbarsLib.Anon_XYNumber,
    prvD: stdLib.Event => scala.Unit,
    rAF: () => js.Function1[/* callback */ js.Function1[/* repeated */ js.Any, _], scala.Double],
    rO: () => js.Any,
    stpP: stdLib.Event => scala.Unit,
    `type`: js.Any => java.lang.String,
    wH: () => scala.Double,
    wW: () => scala.Double
  ): Compatibility = {
    val __obj = js.Dynamic.literal(bind = js.Any.fromFunction3(bind), cAF = js.Any.fromFunction0(cAF), inA = js.Any.fromFunction2(inA), isA = js.Any.fromFunction1(isA), mBtn = js.Any.fromFunction1(mBtn), mO = js.Any.fromFunction0(mO), now = js.Any.fromFunction0(now), page = js.Any.fromFunction1(page), prvD = js.Any.fromFunction1(prvD), rAF = js.Any.fromFunction0(rAF), rO = js.Any.fromFunction0(rO), stpP = js.Any.fromFunction1(stpP), wH = js.Any.fromFunction0(wH), wW = js.Any.fromFunction0(wW))
    __obj.updateDynamic("type")(js.Any.fromFunction1(`type`))
    __obj.asInstanceOf[Compatibility]
  }
}

