package typings.phaser.Phaser.Types.GameObjects

import typings.phaser.Phaser.GameObjects.GameObject
import typings.phaser.Phaser.Types.Actions.GridAlignConfig
import typings.phaser.Phaser.Types.Input.HitAreaCallback
import typings.phaser.integer
import typings.phaser.phaserBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Group {
  
  type GroupCallback = js.Function1[/* item */ GameObject, Unit]
  
  @js.native
  trait GroupConfig extends StObject {
    
    /**
      * Sets {@link Phaser.GameObjects.Group#active}.
      */
    var active: js.UndefOr[Boolean] = js.native
    
    /**
      * Sets {@link Phaser.GameObjects.Group#classType}.
      */
    var classType: js.UndefOr[js.Function] = js.native
    
    /**
      * Sets {@link Phaser.GameObjects.Group#createCallback}.
      */
    var createCallback: js.UndefOr[GroupCallback] = js.native
    
    /**
      * Sets {@link Phaser.GameObjects.Group#createMultipleCallback}.
      */
    var createMultipleCallback: js.UndefOr[GroupMultipleCreateCallback] = js.native
    
    /**
      * Sets {@link Phaser.GameObjects.Group#defaultFrame}.
      */
    var defaultFrame: js.UndefOr[String | integer] = js.native
    
    /**
      * Sets {@link Phaser.GameObjects.Group#defaultKey}.
      */
    var defaultKey: js.UndefOr[String] = js.native
    
    /**
      * Sets {@link Phaser.GameObjects.Group#maxSize}.
      */
    var maxSize: js.UndefOr[Double] = js.native
    
    /**
      * Sets {@link Phaser.GameObjects.Group#name}.
      */
    var name: js.UndefOr[String] = js.native
    
    /**
      * Sets {@link Phaser.GameObjects.Group#removeCallback}.
      */
    var removeCallback: js.UndefOr[GroupCallback] = js.native
    
    /**
      * Sets {@link Phaser.GameObjects.Group#runChildUpdate}.
      */
    var runChildUpdate: js.UndefOr[Boolean] = js.native
  }
  object GroupConfig {
    
    @scala.inline
    def apply(): GroupConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GroupConfig]
    }
    
    @scala.inline
    implicit class GroupConfigMutableBuilder[Self <: GroupConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      @scala.inline
      def setClassType(value: js.Function): Self = StObject.set(x, "classType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassTypeUndefined: Self = StObject.set(x, "classType", js.undefined)
      
      @scala.inline
      def setCreateCallback(value: /* item */ GameObject => Unit): Self = StObject.set(x, "createCallback", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCreateCallbackUndefined: Self = StObject.set(x, "createCallback", js.undefined)
      
      @scala.inline
      def setCreateMultipleCallback(value: /* items */ js.Array[GameObject] => Unit): Self = StObject.set(x, "createMultipleCallback", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCreateMultipleCallbackUndefined: Self = StObject.set(x, "createMultipleCallback", js.undefined)
      
      @scala.inline
      def setDefaultFrame(value: String | integer): Self = StObject.set(x, "defaultFrame", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultFrameUndefined: Self = StObject.set(x, "defaultFrame", js.undefined)
      
      @scala.inline
      def setDefaultKey(value: String): Self = StObject.set(x, "defaultKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultKeyUndefined: Self = StObject.set(x, "defaultKey", js.undefined)
      
      @scala.inline
      def setMaxSize(value: Double): Self = StObject.set(x, "maxSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxSizeUndefined: Self = StObject.set(x, "maxSize", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setRemoveCallback(value: /* item */ GameObject => Unit): Self = StObject.set(x, "removeCallback", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRemoveCallbackUndefined: Self = StObject.set(x, "removeCallback", js.undefined)
      
      @scala.inline
      def setRunChildUpdate(value: Boolean): Self = StObject.set(x, "runChildUpdate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRunChildUpdateUndefined: Self = StObject.set(x, "runChildUpdate", js.undefined)
    }
  }
  
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
  trait GroupCreateConfig extends StObject {
    
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
    implicit class GroupCreateConfigMutableBuilder[Self <: GroupCreateConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      @scala.inline
      def setClassType(value: js.Function): Self = StObject.set(x, "classType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassTypeUndefined: Self = StObject.set(x, "classType", js.undefined)
      
      @scala.inline
      def setFrame(value: String | (js.Array[String | integer]) | integer): Self = StObject.set(x, "frame", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrameQuantity(value: integer): Self = StObject.set(x, "frameQuantity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrameQuantityUndefined: Self = StObject.set(x, "frameQuantity", js.undefined)
      
      @scala.inline
      def setFrameUndefined: Self = StObject.set(x, "frame", js.undefined)
      
      @scala.inline
      def setFrameVarargs(value: (String | integer)*): Self = StObject.set(x, "frame", js.Array(value :_*))
      
      @scala.inline
      def setGridAlign(value: `false` | GridAlignConfig): Self = StObject.set(x, "gridAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridAlignUndefined: Self = StObject.set(x, "gridAlign", js.undefined)
      
      @scala.inline
      def setHitArea(value: js.Any): Self = StObject.set(x, "hitArea", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHitAreaCallback(value: (/* hitArea */ js.Any, /* x */ Double, /* y */ Double, /* gameObject */ GameObject) => Unit): Self = StObject.set(x, "hitAreaCallback", js.Any.fromFunction4(value))
      
      @scala.inline
      def setHitAreaCallbackUndefined: Self = StObject.set(x, "hitAreaCallback", js.undefined)
      
      @scala.inline
      def setHitAreaUndefined: Self = StObject.set(x, "hitArea", js.undefined)
      
      @scala.inline
      def setKey(value: String | js.Array[String]): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setKeyVarargs(value: String*): Self = StObject.set(x, "key", js.Array(value :_*))
      
      @scala.inline
      def setMax(value: integer): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      @scala.inline
      def setQuantity(value: integer): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
      
      @scala.inline
      def setRandomFrame(value: Boolean): Self = StObject.set(x, "randomFrame", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRandomFrameUndefined: Self = StObject.set(x, "randomFrame", js.undefined)
      
      @scala.inline
      def setRandomKey(value: Boolean): Self = StObject.set(x, "randomKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRandomKeyUndefined: Self = StObject.set(x, "randomKey", js.undefined)
      
      @scala.inline
      def setRepeat(value: integer): Self = StObject.set(x, "repeat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepeatUndefined: Self = StObject.set(x, "repeat", js.undefined)
      
      @scala.inline
      def setSetAlpha(value: js.Object): Self = StObject.set(x, "setAlpha", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetAlphaDotstep(value: Double): Self = StObject.set(x, "setAlpha.step", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetAlphaDotstepUndefined: Self = StObject.set(x, "setAlpha.step", js.undefined)
      
      @scala.inline
      def setSetAlphaDotvalue(value: Double): Self = StObject.set(x, "setAlpha.value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetAlphaDotvalueUndefined: Self = StObject.set(x, "setAlpha.value", js.undefined)
      
      @scala.inline
      def setSetAlphaUndefined: Self = StObject.set(x, "setAlpha", js.undefined)
      
      @scala.inline
      def setSetDepth(value: js.Object): Self = StObject.set(x, "setDepth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetDepthDotstep(value: Double): Self = StObject.set(x, "setDepth.step", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetDepthDotstepUndefined: Self = StObject.set(x, "setDepth.step", js.undefined)
      
      @scala.inline
      def setSetDepthDotvalue(value: Double): Self = StObject.set(x, "setDepth.value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetDepthDotvalueUndefined: Self = StObject.set(x, "setDepth.value", js.undefined)
      
      @scala.inline
      def setSetDepthUndefined: Self = StObject.set(x, "setDepth", js.undefined)
      
      @scala.inline
      def setSetRotation(value: js.Object): Self = StObject.set(x, "setRotation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetRotationDotstep(value: Double): Self = StObject.set(x, "setRotation.step", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetRotationDotstepUndefined: Self = StObject.set(x, "setRotation.step", js.undefined)
      
      @scala.inline
      def setSetRotationDotvalue(value: Double): Self = StObject.set(x, "setRotation.value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetRotationDotvalueUndefined: Self = StObject.set(x, "setRotation.value", js.undefined)
      
      @scala.inline
      def setSetRotationUndefined: Self = StObject.set(x, "setRotation", js.undefined)
      
      @scala.inline
      def setSetScale(value: js.Object): Self = StObject.set(x, "setScale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetScaleDotstepX(value: Double): Self = StObject.set(x, "setScale.stepX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetScaleDotstepXUndefined: Self = StObject.set(x, "setScale.stepX", js.undefined)
      
      @scala.inline
      def setSetScaleDotstepY(value: Double): Self = StObject.set(x, "setScale.stepY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetScaleDotstepYUndefined: Self = StObject.set(x, "setScale.stepY", js.undefined)
      
      @scala.inline
      def setSetScaleDotx(value: Double): Self = StObject.set(x, "setScale.x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetScaleDotxUndefined: Self = StObject.set(x, "setScale.x", js.undefined)
      
      @scala.inline
      def setSetScaleDoty(value: Double): Self = StObject.set(x, "setScale.y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetScaleDotyUndefined: Self = StObject.set(x, "setScale.y", js.undefined)
      
      @scala.inline
      def setSetScaleUndefined: Self = StObject.set(x, "setScale", js.undefined)
      
      @scala.inline
      def setSetScrollFactor(value: js.Object): Self = StObject.set(x, "setScrollFactor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetScrollFactorDotstepX(value: Double): Self = StObject.set(x, "setScrollFactor.stepX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetScrollFactorDotstepXUndefined: Self = StObject.set(x, "setScrollFactor.stepX", js.undefined)
      
      @scala.inline
      def setSetScrollFactorDotstepY(value: Double): Self = StObject.set(x, "setScrollFactor.stepY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetScrollFactorDotstepYUndefined: Self = StObject.set(x, "setScrollFactor.stepY", js.undefined)
      
      @scala.inline
      def setSetScrollFactorDotx(value: Double): Self = StObject.set(x, "setScrollFactor.x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetScrollFactorDotxUndefined: Self = StObject.set(x, "setScrollFactor.x", js.undefined)
      
      @scala.inline
      def setSetScrollFactorDoty(value: Double): Self = StObject.set(x, "setScrollFactor.y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetScrollFactorDotyUndefined: Self = StObject.set(x, "setScrollFactor.y", js.undefined)
      
      @scala.inline
      def setSetScrollFactorUndefined: Self = StObject.set(x, "setScrollFactor", js.undefined)
      
      @scala.inline
      def setSetXY(value: js.Object): Self = StObject.set(x, "setXY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetXYDotstepX(value: Double): Self = StObject.set(x, "setXY.stepX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetXYDotstepXUndefined: Self = StObject.set(x, "setXY.stepX", js.undefined)
      
      @scala.inline
      def setSetXYDotstepY(value: Double): Self = StObject.set(x, "setXY.stepY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetXYDotstepYUndefined: Self = StObject.set(x, "setXY.stepY", js.undefined)
      
      @scala.inline
      def setSetXYDotx(value: Double): Self = StObject.set(x, "setXY.x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetXYDotxUndefined: Self = StObject.set(x, "setXY.x", js.undefined)
      
      @scala.inline
      def setSetXYDoty(value: Double): Self = StObject.set(x, "setXY.y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetXYDotyUndefined: Self = StObject.set(x, "setXY.y", js.undefined)
      
      @scala.inline
      def setSetXYUndefined: Self = StObject.set(x, "setXY", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      @scala.inline
      def setYoyo(value: Boolean): Self = StObject.set(x, "yoyo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYoyoUndefined: Self = StObject.set(x, "yoyo", js.undefined)
    }
  }
  
  type GroupMultipleCreateCallback = js.Function1[/* items */ js.Array[GameObject], Unit]
}
