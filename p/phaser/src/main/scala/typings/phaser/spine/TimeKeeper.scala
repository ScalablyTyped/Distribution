package typings.phaser.spine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimeKeeper extends js.Object {
  
  var delta: Double = js.native
  
  var frameCount: js.Any = js.native
  
  var frameTime: js.Any = js.native
  
  var framesPerSecond: Double = js.native
  
  var lastTime: js.Any = js.native
  
  var maxDelta: Double = js.native
  
  var totalTime: Double = js.native
  
  def update(): Unit = js.native
}
object TimeKeeper {
  
  @scala.inline
  def apply(
    delta: Double,
    frameCount: js.Any,
    frameTime: js.Any,
    framesPerSecond: Double,
    lastTime: js.Any,
    maxDelta: Double,
    totalTime: Double,
    update: () => Unit
  ): TimeKeeper = {
    val __obj = js.Dynamic.literal(delta = delta.asInstanceOf[js.Any], frameCount = frameCount.asInstanceOf[js.Any], frameTime = frameTime.asInstanceOf[js.Any], framesPerSecond = framesPerSecond.asInstanceOf[js.Any], lastTime = lastTime.asInstanceOf[js.Any], maxDelta = maxDelta.asInstanceOf[js.Any], totalTime = totalTime.asInstanceOf[js.Any], update = js.Any.fromFunction0(update))
    __obj.asInstanceOf[TimeKeeper]
  }
  
  @scala.inline
  implicit class TimeKeeperOps[Self <: TimeKeeper] (val x: Self) extends AnyVal {
    
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
    def setDelta(value: Double): Self = this.set("delta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrameCount(value: js.Any): Self = this.set("frameCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrameTime(value: js.Any): Self = this.set("frameTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFramesPerSecond(value: Double): Self = this.set("framesPerSecond", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastTime(value: js.Any): Self = this.set("lastTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxDelta(value: Double): Self = this.set("maxDelta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalTime(value: Double): Self = this.set("totalTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdate(value: () => Unit): Self = this.set("update", js.Any.fromFunction0(value))
  }
}
