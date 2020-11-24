package typings.popmotion.typesMod

import typings.popmotion.popmotionStrings.decay
import typings.popmotion.popmotionStrings.keyframes
import typings.popmotion.popmotionStrings.loop
import typings.popmotion.popmotionStrings.mirror
import typings.popmotion.popmotionStrings.reverse
import typings.popmotion.popmotionStrings.spring
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlaybackOptions[V] extends js.Object {
  
  var autoplay: js.UndefOr[Boolean] = js.native
  
  var driver: js.UndefOr[Driver] = js.native
  
  var elapsed: js.UndefOr[Double] = js.native
  
  var from: js.UndefOr[V] = js.native
  
  var onComplete: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onPlay: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onRepeat: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onStop: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onUpdate: js.UndefOr[js.Function1[/* latest */ V, Unit]] = js.native
  
  var repeat: js.UndefOr[Double] = js.native
  
  var repeatDelay: js.UndefOr[Double] = js.native
  
  var repeatType: js.UndefOr[loop | reverse | mirror] = js.native
  
  var `type`: js.UndefOr[spring | decay | keyframes] = js.native
}
object PlaybackOptions {
  
  @scala.inline
  def apply[V](): PlaybackOptions[V] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlaybackOptions[V]]
  }
  
  @scala.inline
  implicit class PlaybackOptionsOps[Self <: PlaybackOptions[_], V] (val x: Self with PlaybackOptions[V]) extends AnyVal {
    
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
    def setAutoplay(value: Boolean): Self = this.set("autoplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoplay: Self = this.set("autoplay", js.undefined)
    
    @scala.inline
    def setDriver(value: /* update */ Update => DriverControls): Self = this.set("driver", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDriver: Self = this.set("driver", js.undefined)
    
    @scala.inline
    def setElapsed(value: Double): Self = this.set("elapsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElapsed: Self = this.set("elapsed", js.undefined)
    
    @scala.inline
    def setFrom(value: V): Self = this.set("from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrom: Self = this.set("from", js.undefined)
    
    @scala.inline
    def setOnComplete(value: () => Unit): Self = this.set("onComplete", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnComplete: Self = this.set("onComplete", js.undefined)
    
    @scala.inline
    def setOnPlay(value: () => Unit): Self = this.set("onPlay", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnPlay: Self = this.set("onPlay", js.undefined)
    
    @scala.inline
    def setOnRepeat(value: () => Unit): Self = this.set("onRepeat", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnRepeat: Self = this.set("onRepeat", js.undefined)
    
    @scala.inline
    def setOnStop(value: () => Unit): Self = this.set("onStop", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnStop: Self = this.set("onStop", js.undefined)
    
    @scala.inline
    def setOnUpdate(value: /* latest */ V => Unit): Self = this.set("onUpdate", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnUpdate: Self = this.set("onUpdate", js.undefined)
    
    @scala.inline
    def setRepeat(value: Double): Self = this.set("repeat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRepeat: Self = this.set("repeat", js.undefined)
    
    @scala.inline
    def setRepeatDelay(value: Double): Self = this.set("repeatDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRepeatDelay: Self = this.set("repeatDelay", js.undefined)
    
    @scala.inline
    def setRepeatType(value: loop | reverse | mirror): Self = this.set("repeatType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRepeatType: Self = this.set("repeatType", js.undefined)
    
    @scala.inline
    def setType(value: spring | decay | keyframes): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
