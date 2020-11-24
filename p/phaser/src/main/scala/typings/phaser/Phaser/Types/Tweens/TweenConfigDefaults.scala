package typings.phaser.Phaser.Types.Tweens

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TweenConfigDefaults extends js.Object {
  
  /**
    * The number of milliseconds to delay before the tween will start.
    */
  var delay: js.UndefOr[Double] = js.native
  
  /**
    * The duration of the tween in milliseconds.
    */
  var duration: js.UndefOr[Double] = js.native
  
  /**
    * The easing equation to use for the tween.
    */
  var ease: js.UndefOr[String] = js.native
  
  /**
    * Optional easing parameters.
    */
  var easeParams: js.UndefOr[js.Array[_]] = js.native
  
  /**
    * Horizontally flip the target of the Tween when it completes (before it yoyos, if set to do so). Only works for targets that support the `flipX` property.
    */
  var flipX: js.UndefOr[Boolean] = js.native
  
  /**
    * Vertically flip the target of the Tween when it completes (before it yoyos, if set to do so). Only works for targets that support the `flipY` property.
    */
  var flipY: js.UndefOr[Boolean] = js.native
  
  /**
    * The number of milliseconds to hold the tween for before yoyo'ing.
    */
  var hold: js.UndefOr[Double] = js.native
  
  /**
    * The number of times to repeat the tween.
    */
  var repeat: js.UndefOr[Double] = js.native
  
  /**
    * The number of milliseconds to pause before a tween will repeat.
    */
  var repeatDelay: js.UndefOr[Double] = js.native
  
  /**
    * The object, or an array of objects, to run the tween on.
    */
  var targets: js.Object | js.Array[js.Object] = js.native
  
  /**
    * Should the tween complete, then reverse the values incrementally to get back to the starting tween values? The reverse tweening will also take `duration` milliseconds to complete.
    */
  var yoyo: js.UndefOr[Boolean] = js.native
}
object TweenConfigDefaults {
  
  @scala.inline
  def apply(targets: js.Object | js.Array[js.Object]): TweenConfigDefaults = {
    val __obj = js.Dynamic.literal(targets = targets.asInstanceOf[js.Any])
    __obj.asInstanceOf[TweenConfigDefaults]
  }
  
  @scala.inline
  implicit class TweenConfigDefaultsOps[Self <: TweenConfigDefaults] (val x: Self) extends AnyVal {
    
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
    def setTargetsVarargs(value: js.Object*): Self = this.set("targets", js.Array(value :_*))
    
    @scala.inline
    def setTargets(value: js.Object | js.Array[js.Object]): Self = this.set("targets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    
    @scala.inline
    def setEase(value: String): Self = this.set("ease", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEase: Self = this.set("ease", js.undefined)
    
    @scala.inline
    def setEaseParamsVarargs(value: js.Any*): Self = this.set("easeParams", js.Array(value :_*))
    
    @scala.inline
    def setEaseParams(value: js.Array[_]): Self = this.set("easeParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEaseParams: Self = this.set("easeParams", js.undefined)
    
    @scala.inline
    def setFlipX(value: Boolean): Self = this.set("flipX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlipX: Self = this.set("flipX", js.undefined)
    
    @scala.inline
    def setFlipY(value: Boolean): Self = this.set("flipY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlipY: Self = this.set("flipY", js.undefined)
    
    @scala.inline
    def setHold(value: Double): Self = this.set("hold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHold: Self = this.set("hold", js.undefined)
    
    @scala.inline
    def setRepeat(value: Double): Self = this.set("repeat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRepeat: Self = this.set("repeat", js.undefined)
    
    @scala.inline
    def setRepeatDelay(value: Double): Self = this.set("repeatDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRepeatDelay: Self = this.set("repeatDelay", js.undefined)
    
    @scala.inline
    def setYoyo(value: Boolean): Self = this.set("yoyo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYoyo: Self = this.set("yoyo", js.undefined)
  }
}
