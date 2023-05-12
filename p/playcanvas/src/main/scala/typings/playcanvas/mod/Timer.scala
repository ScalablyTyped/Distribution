package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Timer extends StObject {
  
  var _a: Double
  
  var _b: Double
  
  var _isRunning: Boolean
  
  def getMilliseconds(): Double
  
  def start(): Unit
  
  def stop(): Unit
}
object Timer {
  
  inline def apply(
    _a: Double,
    _b: Double,
    _isRunning: Boolean,
    getMilliseconds: () => Double,
    start: () => Unit,
    stop: () => Unit
  ): Timer = {
    val __obj = js.Dynamic.literal(_a = _a.asInstanceOf[js.Any], _b = _b.asInstanceOf[js.Any], _isRunning = _isRunning.asInstanceOf[js.Any], getMilliseconds = js.Any.fromFunction0(getMilliseconds), start = js.Any.fromFunction0(start), stop = js.Any.fromFunction0(stop))
    __obj.asInstanceOf[Timer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Timer] (val x: Self) extends AnyVal {
    
    inline def setGetMilliseconds(value: () => Double): Self = StObject.set(x, "getMilliseconds", js.Any.fromFunction0(value))
    
    inline def setStart(value: () => Unit): Self = StObject.set(x, "start", js.Any.fromFunction0(value))
    
    inline def setStop(value: () => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
    
    inline def set_a(value: Double): Self = StObject.set(x, "_a", value.asInstanceOf[js.Any])
    
    inline def set_b(value: Double): Self = StObject.set(x, "_b", value.asInstanceOf[js.Any])
    
    inline def set_isRunning(value: Boolean): Self = StObject.set(x, "_isRunning", value.asInstanceOf[js.Any])
  }
}
