package typings.phaser.Phaser.Types.GameObjects.Group

import typings.phaser.Phaser.GameObjects.GameObject
import typings.phaser.Phaser.Types.Actions.GridAlignConfig
import typings.phaser.Phaser.Types.Input.HitAreaCallback
import typings.phaser.integer
import typings.phaser.phaserBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The total number of objects created will be
  * 
  *     key.length * frame.length * frameQuantity * (yoyo ? 2 : 1) * (1 + repeat)
  * 
  * If `max` is nonzero, then the total created will not exceed `max`.
  * 
  * `key` is required. {@link Phaser.GameObjects.Group#defaultKey} is not used.
  */
@js.native
trait GroupCreateConfig extends js.Object {
  
  /**
    * The active state of each new Game Object.
    */
  var active: js.UndefOr[Boolean] = js.native
  
  /**
    * The class of each new Game Object.
    */
  var classType: js.UndefOr[js.Function] = js.native
  
  /**
    * The texture frame of each new Game Object.
    */
  var frame: js.UndefOr[String | (js.Array[String | integer]) | integer] = js.native
  
  /**
    * The number of times each `frame` should be combined with one `key`.
    */
  var frameQuantity: js.UndefOr[integer] = js.native
  
  /**
    * Align the new Game Objects in a grid using these settings.
    */
  var gridAlign: js.UndefOr[`false` | GridAlignConfig] = js.native
  
  /**
    * A geometric shape that defines the hit area for the Game Object.
    */
  var hitArea: js.UndefOr[js.Any] = js.native
  
  /**
    * A callback to be invoked when the Game Object is interacted with.
    */
  var hitAreaCallback: js.UndefOr[HitAreaCallback] = js.native
  
  /**
    * The texture key of each new Game Object.
    */
  var key: js.UndefOr[String | js.Array[String]] = js.native
  
  /**
    * The maximum number of new Game Objects to create. 0 is no maximum.
    */
  var max: js.UndefOr[integer] = js.native
  
  /**
    * The number of Game Objects to create. If set, this overrides the `frameQuantity` value. Use `frameQuantity` for more advanced control.
    */
  var quantity: js.UndefOr[integer] = js.native
  
  /**
    * Select a `frame` at random.
    */
  var randomFrame: js.UndefOr[Boolean] = js.native
  
  /**
    * Select a `key` at random.
    */
  var randomKey: js.UndefOr[Boolean] = js.native
  
  /**
    * The number of times each `key` × `frame` combination will be *repeated* (after the first combination).
    */
  var repeat: js.UndefOr[integer] = js.native
  
  var setAlpha: js.UndefOr[js.Object] = js.native
  
  /**
    * Increment each Game Object's alpha from the previous by this amount, starting from `setAlpha.value`.
    */
  @JSName("setAlpha.step")
  var setAlphaDotstep: js.UndefOr[Double] = js.native
  
  /**
    * The alpha value of each new Game Object.
    */
  @JSName("setAlpha.value")
  var setAlphaDotvalue: js.UndefOr[Double] = js.native
  
  var setDepth: js.UndefOr[js.Object] = js.native
  
  /**
    * Increment each Game Object's depth from the previous by this amount, starting from `setDepth.value`.
    */
  @JSName("setDepth.step")
  var setDepthDotstep: js.UndefOr[Double] = js.native
  
  /**
    * The depth value of each new Game Object.
    */
  @JSName("setDepth.value")
  var setDepthDotvalue: js.UndefOr[Double] = js.native
  
  var setRotation: js.UndefOr[js.Object] = js.native
  
  /**
    * Increment each Game Object's rotation from the previous by this amount, starting at `setRotation.value`.
    */
  @JSName("setRotation.step")
  var setRotationDotstep: js.UndefOr[Double] = js.native
  
  /**
    * Rotation of each new Game Object.
    */
  @JSName("setRotation.value")
  var setRotationDotvalue: js.UndefOr[Double] = js.native
  
  var setScale: js.UndefOr[js.Object] = js.native
  
  /**
    * Increment each Game Object's horizontal scale from the previous by this amount, starting from `setScale.x`.
    */
  @JSName("setScale.stepX")
  var setScaleDotstepX: js.UndefOr[Double] = js.native
  
  /**
    * Increment each Game object's vertical scale from the previous by this amount, starting from `setScale.y`.
    */
  @JSName("setScale.stepY")
  var setScaleDotstepY: js.UndefOr[Double] = js.native
  
  /**
    * The horizontal scale of each new Game Object.
    */
  @JSName("setScale.x")
  var setScaleDotx: js.UndefOr[Double] = js.native
  
  /**
    * The vertical scale of each new Game Object.
    */
  @JSName("setScale.y")
  var setScaleDoty: js.UndefOr[Double] = js.native
  
  var setScrollFactor: js.UndefOr[js.Object] = js.native
  
  /**
    * Increment each Game Object's horizontal scroll factor from the previous by this amount, starting from `setScrollFactor.x`.
    */
  @JSName("setScrollFactor.stepX")
  var setScrollFactorDotstepX: js.UndefOr[Double] = js.native
  
  /**
    * Increment each Game object's vertical scroll factor from the previous by this amount, starting from `setScrollFactor.y`.
    */
  @JSName("setScrollFactor.stepY")
  var setScrollFactorDotstepY: js.UndefOr[Double] = js.native
  
  /**
    * The horizontal scroll factor of each new Game Object.
    */
  @JSName("setScrollFactor.x")
  var setScrollFactorDotx: js.UndefOr[Double] = js.native
  
  /**
    * The vertical scroll factor of each new Game Object.
    */
  @JSName("setScrollFactor.y")
  var setScrollFactorDoty: js.UndefOr[Double] = js.native
  
  var setXY: js.UndefOr[js.Object] = js.native
  
  /**
    * Increment each Game Object's horizontal position from the previous by this amount, starting from `setXY.x`.
    */
  @JSName("setXY.stepX")
  var setXYDotstepX: js.UndefOr[Double] = js.native
  
  /**
    * Increment each Game Object's vertical position from the previous by this amount, starting from `setXY.y`.
    */
  @JSName("setXY.stepY")
  var setXYDotstepY: js.UndefOr[Double] = js.native
  
  /**
    * The horizontal position of each new Game Object.
    */
  @JSName("setXY.x")
  var setXYDotx: js.UndefOr[Double] = js.native
  
  /**
    * The vertical position of each new Game Object.
    */
  @JSName("setXY.y")
  var setXYDoty: js.UndefOr[Double] = js.native
  
  /**
    * The visible state of each new Game Object.
    */
  var visible: js.UndefOr[Boolean] = js.native
  
  /**
    * Select keys and frames by moving forward then backward through `key` and `frame`.
    */
  var yoyo: js.UndefOr[Boolean] = js.native
}
object GroupCreateConfig {
  
  @scala.inline
  def apply(): GroupCreateConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupCreateConfig]
  }
  
  @scala.inline
  implicit class GroupCreateConfigOps[Self <: GroupCreateConfig] (val x: Self) extends AnyVal {
    
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
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    
    @scala.inline
    def setClassType(value: js.Function): Self = this.set("classType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassType: Self = this.set("classType", js.undefined)
    
    @scala.inline
    def setFrameVarargs(value: (String | integer)*): Self = this.set("frame", js.Array(value :_*))
    
    @scala.inline
    def setFrame(value: String | (js.Array[String | integer]) | integer): Self = this.set("frame", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrame: Self = this.set("frame", js.undefined)
    
    @scala.inline
    def setFrameQuantity(value: integer): Self = this.set("frameQuantity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrameQuantity: Self = this.set("frameQuantity", js.undefined)
    
    @scala.inline
    def setGridAlign(value: `false` | GridAlignConfig): Self = this.set("gridAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGridAlign: Self = this.set("gridAlign", js.undefined)
    
    @scala.inline
    def setHitArea(value: js.Any): Self = this.set("hitArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHitArea: Self = this.set("hitArea", js.undefined)
    
    @scala.inline
    def setHitAreaCallback(value: (/* hitArea */ js.Any, /* x */ Double, /* y */ Double, /* gameObject */ GameObject) => Unit): Self = this.set("hitAreaCallback", js.Any.fromFunction4(value))
    
    @scala.inline
    def deleteHitAreaCallback: Self = this.set("hitAreaCallback", js.undefined)
    
    @scala.inline
    def setKeyVarargs(value: String*): Self = this.set("key", js.Array(value :_*))
    
    @scala.inline
    def setKey(value: String | js.Array[String]): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setMax(value: integer): Self = this.set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    
    @scala.inline
    def setQuantity(value: integer): Self = this.set("quantity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuantity: Self = this.set("quantity", js.undefined)
    
    @scala.inline
    def setRandomFrame(value: Boolean): Self = this.set("randomFrame", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRandomFrame: Self = this.set("randomFrame", js.undefined)
    
    @scala.inline
    def setRandomKey(value: Boolean): Self = this.set("randomKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRandomKey: Self = this.set("randomKey", js.undefined)
    
    @scala.inline
    def setRepeat(value: integer): Self = this.set("repeat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRepeat: Self = this.set("repeat", js.undefined)
    
    @scala.inline
    def setSetAlpha(value: js.Object): Self = this.set("setAlpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSetAlpha: Self = this.set("setAlpha", js.undefined)
    
    @scala.inline
    def setSetAlphaDotstep(value: Double): Self = this.set("setAlpha.step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSetAlphaDotstep: Self = this.set("setAlpha.step", js.undefined)
    
    @scala.inline
    def setSetAlphaDotvalue(value: Double): Self = this.set("setAlpha.value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSetAlphaDotvalue: Self = this.set("setAlpha.value", js.undefined)
    
    @scala.inline
    def setSetDepth(value: js.Object): Self = this.set("setDepth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSetDepth: Self = this.set("setDepth", js.undefined)
    
    @scala.inline
    def setSetDepthDotstep(value: Double): Self = this.set("setDepth.step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSetDepthDotstep: Self = this.set("setDepth.step", js.undefined)
    
    @scala.inline
    def setSetDepthDotvalue(value: Double): Self = this.set("setDepth.value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSetDepthDotvalue: Self = this.set("setDepth.value", js.undefined)
    
    @scala.inline
    def setSetRotation(value: js.Object): Self = this.set("setRotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSetRotation: Self = this.set("setRotation", js.undefined)
    
    @scala.inline
    def setSetRotationDotstep(value: Double): Self = this.set("setRotation.step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSetRotationDotstep: Self = this.set("setRotation.step", js.undefined)
    
    @scala.inline
    def setSetRotationDotvalue(value: Double): Self = this.set("setRotation.value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSetRotationDotvalue: Self = this.set("setRotation.value", js.undefined)
    
    @scala.inline
    def setSetScale(value: js.Object): Self = this.set("setScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSetScale: Self = this.set("setScale", js.undefined)
    
    @scala.inline
    def setSetScaleDotstepX(value: Double): Self = this.set("setScale.stepX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSetScaleDotstepX: Self = this.set("setScale.stepX", js.undefined)
    
    @scala.inline
    def setSetScaleDotstepY(value: Double): Self = this.set("setScale.stepY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSetScaleDotstepY: Self = this.set("setScale.stepY", js.undefined)
    
    @scala.inline
    def setSetScaleDotx(value: Double): Self = this.set("setScale.x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSetScaleDotx: Self = this.set("setScale.x", js.undefined)
    
    @scala.inline
    def setSetScaleDoty(value: Double): Self = this.set("setScale.y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSetScaleDoty: Self = this.set("setScale.y", js.undefined)
    
    @scala.inline
    def setSetScrollFactor(value: js.Object): Self = this.set("setScrollFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSetScrollFactor: Self = this.set("setScrollFactor", js.undefined)
    
    @scala.inline
    def setSetScrollFactorDotstepX(value: Double): Self = this.set("setScrollFactor.stepX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSetScrollFactorDotstepX: Self = this.set("setScrollFactor.stepX", js.undefined)
    
    @scala.inline
    def setSetScrollFactorDotstepY(value: Double): Self = this.set("setScrollFactor.stepY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSetScrollFactorDotstepY: Self = this.set("setScrollFactor.stepY", js.undefined)
    
    @scala.inline
    def setSetScrollFactorDotx(value: Double): Self = this.set("setScrollFactor.x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSetScrollFactorDotx: Self = this.set("setScrollFactor.x", js.undefined)
    
    @scala.inline
    def setSetScrollFactorDoty(value: Double): Self = this.set("setScrollFactor.y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSetScrollFactorDoty: Self = this.set("setScrollFactor.y", js.undefined)
    
    @scala.inline
    def setSetXY(value: js.Object): Self = this.set("setXY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSetXY: Self = this.set("setXY", js.undefined)
    
    @scala.inline
    def setSetXYDotstepX(value: Double): Self = this.set("setXY.stepX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSetXYDotstepX: Self = this.set("setXY.stepX", js.undefined)
    
    @scala.inline
    def setSetXYDotstepY(value: Double): Self = this.set("setXY.stepY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSetXYDotstepY: Self = this.set("setXY.stepY", js.undefined)
    
    @scala.inline
    def setSetXYDotx(value: Double): Self = this.set("setXY.x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSetXYDotx: Self = this.set("setXY.x", js.undefined)
    
    @scala.inline
    def setSetXYDoty(value: Double): Self = this.set("setXY.y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSetXYDoty: Self = this.set("setXY.y", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
    
    @scala.inline
    def setYoyo(value: Boolean): Self = this.set("yoyo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYoyo: Self = this.set("yoyo", js.undefined)
  }
}
