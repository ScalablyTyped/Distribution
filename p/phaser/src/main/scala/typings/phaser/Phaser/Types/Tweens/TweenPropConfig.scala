package typings.phaser.Phaser.Types.Tweens

import typings.phaser.Phaser.Tweens.Tween
import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TweenPropConfig extends js.Object {
  
  /**
    * Time in ms/frames before tween will start.
    */
  var delay: js.UndefOr[Double] = js.native
  
  /**
    * Duration of the tween in ms/frames.
    */
  var duration: js.UndefOr[Double] = js.native
  
  /**
    * The ease function this tween uses.
    */
  var ease: js.UndefOr[String | js.Function] = js.native
  
  /**
    * Should toggleFlipX be called when yoyo or repeat happens?
    */
  var flipX: js.UndefOr[Boolean] = js.native
  
  /**
    * Should toggleFlipY be called when yoyo or repeat happens?
    */
  var flipY: js.UndefOr[Boolean] = js.native
  
  /**
    * What the property will be set to immediately when this tween becomes active.
    */
  var getActive: js.UndefOr[GetActiveCallback] = js.native
  
  /**
    * What the property will be at the END of the Tween.
    */
  var getEnd: js.UndefOr[GetEndCallback] = js.native
  
  /**
    * What the property will be at the START of the Tween.
    */
  var getStart: js.UndefOr[GetStartCallback] = js.native
  
  /**
    * Time in ms/frames the tween will pause before repeating or returning to its starting value if yoyo is set to true.
    */
  var hold: js.UndefOr[Double] = js.native
  
  /**
    * Number of times to repeat the tween. The tween will always run once regardless, so a repeat value of '1' will play the tween twice.
    */
  var repeat: js.UndefOr[Double] = js.native
  
  /**
    * Time in ms/frames before the repeat will start.
    */
  var repeatDelay: js.UndefOr[Double] = js.native
  
  /**
    * What the property will be at the END of the Tween.
    */
  var value: js.UndefOr[Double | String | GetEndCallback | TweenPropConfig] = js.native
  
  /**
    * Determines whether the tween should return back to its start value after hold has expired.
    */
  var yoyo: js.UndefOr[Boolean] = js.native
}
object TweenPropConfig {
  
  @scala.inline
  def apply(): TweenPropConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TweenPropConfig]
  }
  
  @scala.inline
  implicit class TweenPropConfigOps[Self <: TweenPropConfig] (val x: Self) extends AnyVal {
    
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
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    
    @scala.inline
    def setEase(value: String | js.Function): Self = this.set("ease", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEase: Self = this.set("ease", js.undefined)
    
    @scala.inline
    def setFlipX(value: Boolean): Self = this.set("flipX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlipX: Self = this.set("flipX", js.undefined)
    
    @scala.inline
    def setFlipY(value: Boolean): Self = this.set("flipY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlipY: Self = this.set("flipY", js.undefined)
    
    @scala.inline
    def setGetActive(
      value: (/* target */ js.Any, /* key */ String, /* value */ Double, /* targetIndex */ integer, /* totalTargets */ integer, /* tween */ Tween) => Unit
    ): Self = this.set("getActive", js.Any.fromFunction6(value))
    
    @scala.inline
    def deleteGetActive: Self = this.set("getActive", js.undefined)
    
    @scala.inline
    def setGetEnd(
      value: (/* target */ js.Any, /* key */ String, /* value */ Double, /* targetIndex */ integer, /* totalTargets */ integer, /* tween */ Tween) => Unit
    ): Self = this.set("getEnd", js.Any.fromFunction6(value))
    
    @scala.inline
    def deleteGetEnd: Self = this.set("getEnd", js.undefined)
    
    @scala.inline
    def setGetStart(
      value: (/* target */ js.Any, /* key */ String, /* value */ Double, /* targetIndex */ integer, /* totalTargets */ integer, /* tween */ Tween) => Unit
    ): Self = this.set("getStart", js.Any.fromFunction6(value))
    
    @scala.inline
    def deleteGetStart: Self = this.set("getStart", js.undefined)
    
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
    def setValueFunction6(
      value: (/* target */ js.Any, /* key */ String, /* value */ Double, /* targetIndex */ integer, /* totalTargets */ integer, /* tween */ Tween) => Unit
    ): Self = this.set("value", js.Any.fromFunction6(value))
    
    @scala.inline
    def setValue(value: Double | String | GetEndCallback | TweenPropConfig): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    
    @scala.inline
    def setYoyo(value: Boolean): Self = this.set("yoyo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYoyo: Self = this.set("yoyo", js.undefined)
  }
}
