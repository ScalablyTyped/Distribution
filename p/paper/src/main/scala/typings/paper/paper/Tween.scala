package typings.paper.paper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
@js.native
trait Tween extends js.Object {
  /** 
    * The function to be called when the tween is updated. It receives an
    * object as its sole argument, containing the current progress of the
    * tweening and the factor calculated by the easing function.
    */
  var onUpdate: js.Function | Null = js.native
  /** 
    * Start tweening.
    */
  def start(): Tween = js.native
  /** 
    * Stop tweening.
    */
  def stop(): Tween = js.native
  /** 
    * Set a function that will be executed when the tween completes.
    * 
    * @param function - the function to execute when the tween
    *     completes
    */
  def `then`(callback: js.Function): Tween = js.native
}

object Tween {
  @scala.inline
  def apply(start: () => Tween, stop: () => Tween, `then`: js.Function => Tween): Tween = {
    val __obj = js.Dynamic.literal(start = js.Any.fromFunction0(start), stop = js.Any.fromFunction0(stop))
    __obj.updateDynamic("then")(js.Any.fromFunction1(`then`))
    __obj.asInstanceOf[Tween]
  }
  @scala.inline
  implicit class TweenOps[Self <: Tween] (val x: Self) extends AnyVal {
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
    def setStart(value: () => Tween): Self = this.set("start", js.Any.fromFunction0(value))
    @scala.inline
    def setStop(value: () => Tween): Self = this.set("stop", js.Any.fromFunction0(value))
    @scala.inline
    def setThen(value: js.Function => Tween): Self = this.set("then", js.Any.fromFunction1(value))
    @scala.inline
    def setOnUpdate(value: js.Function): Self = this.set("onUpdate", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnUpdateNull: Self = this.set("onUpdate", null)
  }
  
}

