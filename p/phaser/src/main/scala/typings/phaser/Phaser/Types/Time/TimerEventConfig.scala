package typings.phaser.Phaser.Types.Time

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimerEventConfig extends js.Object {
  
  /**
    * Additional arguments to be passed to the `callback`.
    */
  var args: js.UndefOr[js.Array[_]] = js.native
  
  /**
    * The callback which will be called when the Timer Event fires.
    */
  var callback: js.UndefOr[js.Function] = js.native
  
  /**
    * The scope (`this` object) with which to invoke the `callback`.
    */
  var callbackScope: js.UndefOr[js.Any] = js.native
  
  /**
    * The delay after which the Timer Event should fire, in milliseconds.
    */
  var delay: js.UndefOr[Double] = js.native
  
  /**
    * `true` if the Timer Event should repeat indefinitely.
    */
  var loop: js.UndefOr[Boolean] = js.native
  
  /**
    * `true` if the Timer Event should be paused.
    */
  var paused: js.UndefOr[Boolean] = js.native
  
  /**
    * The total number of times the Timer Event will repeat before finishing.
    */
  var repeat: js.UndefOr[Double] = js.native
  
  /**
    * The initial elapsed time in milliseconds. Useful if you want a long duration with repeat, but for the first loop to fire quickly.
    */
  var startAt: js.UndefOr[Double] = js.native
  
  /**
    * The scale of the elapsed time.
    */
  var timeScale: js.UndefOr[Double] = js.native
}
object TimerEventConfig {
  
  @scala.inline
  def apply(): TimerEventConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimerEventConfig]
  }
  
  @scala.inline
  implicit class TimerEventConfigOps[Self <: TimerEventConfig] (val x: Self) extends AnyVal {
    
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
    def setArgsVarargs(value: js.Any*): Self = this.set("args", js.Array(value :_*))
    
    @scala.inline
    def setArgs(value: js.Array[_]): Self = this.set("args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArgs: Self = this.set("args", js.undefined)
    
    @scala.inline
    def setCallback(value: js.Function): Self = this.set("callback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCallback: Self = this.set("callback", js.undefined)
    
    @scala.inline
    def setCallbackScope(value: js.Any): Self = this.set("callbackScope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCallbackScope: Self = this.set("callbackScope", js.undefined)
    
    @scala.inline
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    
    @scala.inline
    def setLoop(value: Boolean): Self = this.set("loop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoop: Self = this.set("loop", js.undefined)
    
    @scala.inline
    def setPaused(value: Boolean): Self = this.set("paused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaused: Self = this.set("paused", js.undefined)
    
    @scala.inline
    def setRepeat(value: Double): Self = this.set("repeat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRepeat: Self = this.set("repeat", js.undefined)
    
    @scala.inline
    def setStartAt(value: Double): Self = this.set("startAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartAt: Self = this.set("startAt", js.undefined)
    
    @scala.inline
    def setTimeScale(value: Double): Self = this.set("timeScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeScale: Self = this.set("timeScale", js.undefined)
  }
}
