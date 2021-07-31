package typings.overlayscrollbars.mod

import typings.overlayscrollbars.anon.XNumber
import typings.std.Event
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Compatibility extends StObject {
  
  def bind(func: js.Function1[/* repeated */ js.Any, js.Any], thisObj: js.Any, args: js.Any*): js.Any
  
  def cAF(): js.Function1[/* requestID */ Double, Unit]
  
  def inA[T](item: T, array: js.Array[T]): Double
  
  def isA(obj: js.Any): Boolean
  
  def mBtn(event: MouseEvent): Double
  
  def mO(): js.Any
  
  def now(): Double
  
  def page(event: MouseEvent): XNumber
  
  def prvD(event: Event): Unit
  
  def rAF(): js.Function1[/* callback */ js.Function1[/* repeated */ js.Any, js.Any], Double]
  
  def rO(): js.Any
  
  def stpP(event: Event): Unit
  
  def `type`(obj: js.Any): String
  
  def wH(): Double
  
  def wW(): Double
}
object Compatibility {
  
  @scala.inline
  def apply(
    bind: (js.Function1[/* repeated */ js.Any, js.Any], js.Any, /* repeated */ js.Any) => js.Any,
    cAF: () => js.Function1[/* requestID */ Double, Unit],
    inA: (js.Any, js.Array[js.Any]) => Double,
    isA: js.Any => Boolean,
    mBtn: MouseEvent => Double,
    mO: () => js.Any,
    now: () => Double,
    page: MouseEvent => XNumber,
    prvD: Event => Unit,
    rAF: () => js.Function1[/* callback */ js.Function1[/* repeated */ js.Any, js.Any], Double],
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
  implicit class CompatibilityMutableBuilder[Self <: Compatibility] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBind(value: (js.Function1[/* repeated */ js.Any, js.Any], js.Any, /* repeated */ js.Any) => js.Any): Self = StObject.set(x, "bind", js.Any.fromFunction3(value))
    
    @scala.inline
    def setCAF(value: () => js.Function1[/* requestID */ Double, Unit]): Self = StObject.set(x, "cAF", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInA(value: (js.Any, js.Array[js.Any]) => Double): Self = StObject.set(x, "inA", js.Any.fromFunction2(value))
    
    @scala.inline
    def setIsA(value: js.Any => Boolean): Self = StObject.set(x, "isA", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMBtn(value: MouseEvent => Double): Self = StObject.set(x, "mBtn", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMO(value: () => js.Any): Self = StObject.set(x, "mO", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNow(value: () => Double): Self = StObject.set(x, "now", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPage(value: MouseEvent => XNumber): Self = StObject.set(x, "page", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPrvD(value: Event => Unit): Self = StObject.set(x, "prvD", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRAF(value: () => js.Function1[/* callback */ js.Function1[/* repeated */ js.Any, js.Any], Double]): Self = StObject.set(x, "rAF", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRO(value: () => js.Any): Self = StObject.set(x, "rO", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStpP(value: Event => Unit): Self = StObject.set(x, "stpP", js.Any.fromFunction1(value))
    
    @scala.inline
    def setType(value: js.Any => String): Self = StObject.set(x, "type", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWH(value: () => Double): Self = StObject.set(x, "wH", js.Any.fromFunction0(value))
    
    @scala.inline
    def setWW(value: () => Double): Self = StObject.set(x, "wW", js.Any.fromFunction0(value))
  }
}
