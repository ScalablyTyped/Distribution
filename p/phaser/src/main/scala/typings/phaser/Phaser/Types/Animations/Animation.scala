package typings.phaser.Phaser.Types.Animations

import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Animation extends js.Object {
  
  /**
    * The key of the texture all frames of the animation will use. Can be overridden on a per frame basis.
    */
  var defaultTextureKey: js.UndefOr[String] = js.native
  
  /**
    * Delay before starting playback. Value given in milliseconds.
    */
  var delay: js.UndefOr[integer] = js.native
  
  /**
    * How long the animation should play for in milliseconds. If not given its derived from frameRate.
    */
  var duration: js.UndefOr[integer] = js.native
  
  /**
    * The frame rate of playback in frames per second (default 24 if duration is null)
    */
  var frameRate: js.UndefOr[integer] = js.native
  
  /**
    * An object containing data used to generate the frames for the animation
    */
  var frames: js.UndefOr[js.Array[AnimationFrame]] = js.native
  
  /**
    * Should sprite.visible = false when the animation finishes?
    */
  var hideOnComplete: js.UndefOr[Boolean] = js.native
  
  /**
    * The key that the animation will be associated with. i.e. sprite.animations.play(key)
    */
  var key: js.UndefOr[String] = js.native
  
  /**
    * Number of times to repeat the animation (-1 for infinity)
    */
  var repeat: js.UndefOr[integer] = js.native
  
  /**
    * Delay before the animation repeats. Value given in milliseconds.
    */
  var repeatDelay: js.UndefOr[integer] = js.native
  
  /**
    * Should sprite.visible = true when the animation starts to play?
    */
  var showOnStart: js.UndefOr[Boolean] = js.native
  
  /**
    * Skip frames if the time lags, or always advanced anyway?
    */
  var skipMissedFrames: js.UndefOr[Boolean] = js.native
  
  /**
    * Should the animation yoyo? (reverse back down to the start) before repeating?
    */
  var yoyo: js.UndefOr[Boolean] = js.native
}
object Animation {
  
  @scala.inline
  def apply(): Animation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Animation]
  }
  
  @scala.inline
  implicit class AnimationOps[Self <: Animation] (val x: Self) extends AnyVal {
    
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
    def setDefaultTextureKey(value: String): Self = this.set("defaultTextureKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultTextureKey: Self = this.set("defaultTextureKey", js.undefined)
    
    @scala.inline
    def setDelay(value: integer): Self = this.set("delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    
    @scala.inline
    def setDuration(value: integer): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    
    @scala.inline
    def setFrameRate(value: integer): Self = this.set("frameRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrameRate: Self = this.set("frameRate", js.undefined)
    
    @scala.inline
    def setFramesVarargs(value: AnimationFrame*): Self = this.set("frames", js.Array(value :_*))
    
    @scala.inline
    def setFrames(value: js.Array[AnimationFrame]): Self = this.set("frames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrames: Self = this.set("frames", js.undefined)
    
    @scala.inline
    def setHideOnComplete(value: Boolean): Self = this.set("hideOnComplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideOnComplete: Self = this.set("hideOnComplete", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setRepeat(value: integer): Self = this.set("repeat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRepeat: Self = this.set("repeat", js.undefined)
    
    @scala.inline
    def setRepeatDelay(value: integer): Self = this.set("repeatDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRepeatDelay: Self = this.set("repeatDelay", js.undefined)
    
    @scala.inline
    def setShowOnStart(value: Boolean): Self = this.set("showOnStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowOnStart: Self = this.set("showOnStart", js.undefined)
    
    @scala.inline
    def setSkipMissedFrames(value: Boolean): Self = this.set("skipMissedFrames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkipMissedFrames: Self = this.set("skipMissedFrames", js.undefined)
    
    @scala.inline
    def setYoyo(value: Boolean): Self = this.set("yoyo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYoyo: Self = this.set("yoyo", js.undefined)
  }
}
