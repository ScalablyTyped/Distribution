package typings.paper.paper

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 
  * Allows tweening `Object` properties between two states for a given
  * duration. To tween properties on Paper.js {@link Item} instances,
  * {@link Item#tween} can be used, which returns created
  * tween instance.
  * 
  * @see Item#tween(from, to, options)
  * @see Item#tween(to, options)
  * @see Item#tween(options)
  * @see Item#tweenTo(to, options)
  * @see Item#tweenFrom(from, options)
  */
trait Tween extends StObject {
  
  /** 
    * The function to be called when the tween is updated. It receives an
    * object as its sole argument, containing the current progress of the
    * tweening and the factor calculated by the easing function.
    */
  var onUpdate: js.Function | Null
  
  /** 
    * Start tweening.
    */
  def start(): Tween
  
  /** 
    * Stop tweening.
    */
  def stop(): Tween
  
  /** 
    * Set a function that will be executed when the tween completes.
    * 
    * @param function - the function to execute when the tween
    *     completes
    */
  def `then`(callback: js.Function): Tween
}
object Tween {
  
  @scala.inline
  def apply(start: () => Tween, stop: () => Tween, `then`: js.Function => Tween): Tween = {
    val __obj = js.Dynamic.literal(start = js.Any.fromFunction0(start), stop = js.Any.fromFunction0(stop), onUpdate = null)
    __obj.updateDynamic("then")(js.Any.fromFunction1(`then`))
    __obj.asInstanceOf[Tween]
  }
  
  @scala.inline
  implicit class TweenMutableBuilder[Self <: Tween] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnUpdate(value: js.Function): Self = StObject.set(x, "onUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnUpdateNull: Self = StObject.set(x, "onUpdate", null)
    
    @scala.inline
    def setStart(value: () => Tween): Self = StObject.set(x, "start", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStop(value: () => Tween): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
    
    @scala.inline
    def setThen(value: js.Function => Tween): Self = StObject.set(x, "then", js.Any.fromFunction1(value))
  }
}
