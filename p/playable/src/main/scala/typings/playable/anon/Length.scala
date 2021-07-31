package typings.playable.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Length extends StObject {
  
  def end(): Double
  
  var length: Double
  
  def start(): Double
}
object Length {
  
  @scala.inline
  def apply(end: () => Double, length: Double, start: () => Double): Length = {
    val __obj = js.Dynamic.literal(end = js.Any.fromFunction0(end), length = length.asInstanceOf[js.Any], start = js.Any.fromFunction0(start))
    __obj.asInstanceOf[Length]
  }
  
  @scala.inline
  implicit class LengthMutableBuilder[Self <: Length] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnd(value: () => Double): Self = StObject.set(x, "end", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: () => Double): Self = StObject.set(x, "start", js.Any.fromFunction0(value))
  }
}
