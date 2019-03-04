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
    bind: js.Function3[js.Function1[/* repeated */ js.Any, _], js.Any, /* repeated */ js.Any, js.Any],
    cAF: js.Function0[js.Function1[/* requestID */ scala.Double, scala.Unit]],
    inA: js.Function2[js.Any, js.Array[js.Any], scala.Double],
    isA: js.Function1[js.Any, scala.Boolean],
    mBtn: js.Function1[stdLib.MouseEvent, scala.Double],
    mO: js.Function0[js.Any],
    now: js.Function0[scala.Double],
    page: js.Function1[stdLib.MouseEvent, overlayscrollbarsLib.Anon_XYNumber],
    prvD: js.Function1[stdLib.Event, scala.Unit],
    rAF: js.Function0[
      js.Function1[/* callback */ js.Function1[/* repeated */ js.Any, _], scala.Double]
    ],
    rO: js.Function0[js.Any],
    stpP: js.Function1[stdLib.Event, scala.Unit],
    `type`: js.Function1[js.Any, java.lang.String],
    wH: js.Function0[scala.Double],
    wW: js.Function0[scala.Double]
  ): Compatibility = {
    val __obj = js.Dynamic.literal(bind = bind, cAF = cAF, inA = inA, isA = isA, mBtn = mBtn, mO = mO, now = now, page = page, prvD = prvD, rAF = rAF, rO = rO, stpP = stpP, wH = wH, wW = wW)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Compatibility]
  }
}

