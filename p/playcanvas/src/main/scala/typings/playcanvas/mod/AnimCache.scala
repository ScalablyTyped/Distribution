package typings.playcanvas.mod

import typings.playcanvas.anon.M0
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Internal cache data for the evaluation of a single curve timeline.
  *
  * @ignore
  */
trait AnimCache extends StObject {
  
  def _findKey(time: Any, input: Any): Double
  
  var _hermite: M0
  
  var _left: Double
  
  var _len: Double
  
  var _p0: Double
  
  var _p1: Double
  
  var _recip: Double
  
  var _right: Double
  
  var _t: Double
  
  def eval(result: Any, interpolation: Any, output: Any): Unit
  
  def update(time: Any, input: Any): Unit
}
object AnimCache {
  
  inline def apply(
    _findKey: (Any, Any) => Double,
    _hermite: M0,
    _left: Double,
    _len: Double,
    _p0: Double,
    _p1: Double,
    _recip: Double,
    _right: Double,
    _t: Double,
    eval: (Any, Any, Any) => Unit,
    update: (Any, Any) => Unit
  ): AnimCache = {
    val __obj = js.Dynamic.literal(_findKey = js.Any.fromFunction2(_findKey), _hermite = _hermite.asInstanceOf[js.Any], _left = _left.asInstanceOf[js.Any], _len = _len.asInstanceOf[js.Any], _p0 = _p0.asInstanceOf[js.Any], _p1 = _p1.asInstanceOf[js.Any], _recip = _recip.asInstanceOf[js.Any], _right = _right.asInstanceOf[js.Any], _t = _t.asInstanceOf[js.Any], eval = js.Any.fromFunction3(eval), update = js.Any.fromFunction2(update))
    __obj.asInstanceOf[AnimCache]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnimCache] (val x: Self) extends AnyVal {
    
    inline def setEval(value: (Any, Any, Any) => Unit): Self = StObject.set(x, "eval", js.Any.fromFunction3(value))
    
    inline def setUpdate(value: (Any, Any) => Unit): Self = StObject.set(x, "update", js.Any.fromFunction2(value))
    
    inline def set_findKey(value: (Any, Any) => Double): Self = StObject.set(x, "_findKey", js.Any.fromFunction2(value))
    
    inline def set_hermite(value: M0): Self = StObject.set(x, "_hermite", value.asInstanceOf[js.Any])
    
    inline def set_left(value: Double): Self = StObject.set(x, "_left", value.asInstanceOf[js.Any])
    
    inline def set_len(value: Double): Self = StObject.set(x, "_len", value.asInstanceOf[js.Any])
    
    inline def set_p0(value: Double): Self = StObject.set(x, "_p0", value.asInstanceOf[js.Any])
    
    inline def set_p1(value: Double): Self = StObject.set(x, "_p1", value.asInstanceOf[js.Any])
    
    inline def set_recip(value: Double): Self = StObject.set(x, "_recip", value.asInstanceOf[js.Any])
    
    inline def set_right(value: Double): Self = StObject.set(x, "_right", value.asInstanceOf[js.Any])
    
    inline def set_t(value: Double): Self = StObject.set(x, "_t", value.asInstanceOf[js.Any])
  }
}
