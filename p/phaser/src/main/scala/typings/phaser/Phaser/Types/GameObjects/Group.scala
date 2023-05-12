package typings.phaser.Phaser.Types.GameObjects

import typings.phaser.Phaser.GameObjects.GameObject
import typings.phaser.Phaser.Scene
import typings.phaser.Phaser.Textures.Texture
import typings.phaser.Phaser.Types.Actions.GridAlignConfig
import typings.phaser.Phaser.Types.Input.HitAreaCallback
import typings.phaser.phaserBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Group {
  
  type GroupCallback = js.Function1[/* item */ GameObject, Unit]
  
  type GroupClassTypeConstructor = js.Function5[
    /* scene */ Scene, 
    /* x */ Double, 
    /* y */ Double, 
    /* texture */ String | Texture, 
    /* frame */ js.UndefOr[String | Double], 
    Unit
  ]
  
  trait GroupConfig extends StObject {
    
    /**
      * Sets {@link Phaser.GameObjects.Group#active}.
      */
    var active: js.UndefOr[Boolean | Null] = js.undefined
    
    /**
      * Sets {@link Phaser.GameObjects.Group#classType}.
      */
    var classType: js.UndefOr[js.Function | Null] = js.undefined
    
    /**
      * Sets {@link Phaser.GameObjects.Group#createCallback}.
      */
    var createCallback: js.UndefOr[GroupCallback | Null] = js.undefined
    
    /**
      * Sets {@link Phaser.GameObjects.Group#createMultipleCallback}.
      */
    var createMultipleCallback: js.UndefOr[GroupMultipleCreateCallback | Null] = js.undefined
    
    /**
      * Sets {@link Phaser.GameObjects.Group#defaultFrame}.
      */
    var defaultFrame: js.UndefOr[String | Double | Null] = js.undefined
    
    /**
      * Sets {@link Phaser.GameObjects.Group#defaultKey}.
      */
    var defaultKey: js.UndefOr[String | Null] = js.undefined
    
    /**
      * Sets {@link Phaser.GameObjects.Group#maxSize}.
      */
    var maxSize: js.UndefOr[Double | Null] = js.undefined
    
    /**
      * Sets {@link Phaser.GameObjects.Group#name}.
      */
    var name: js.UndefOr[String | Null] = js.undefined
    
    /**
      * Sets {@link Phaser.GameObjects.Group#removeCallback}.
      */
    var removeCallback: js.UndefOr[GroupCallback | Null] = js.undefined
    
    /**
      * Sets {@link Phaser.GameObjects.Group#runChildUpdate}.
      */
    var runChildUpdate: js.UndefOr[Boolean | Null] = js.undefined
  }
  object GroupConfig {
    
    inline def apply(): GroupConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GroupConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GroupConfig] (val x: Self) extends AnyVal {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveNull: Self = StObject.set(x, "active", null)
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      inline def setClassType(value: js.Function): Self = StObject.set(x, "classType", value.asInstanceOf[js.Any])
      
      inline def setClassTypeNull: Self = StObject.set(x, "classType", null)
      
      inline def setClassTypeUndefined: Self = StObject.set(x, "classType", js.undefined)
      
      inline def setCreateCallback(value: /* item */ GameObject => Unit): Self = StObject.set(x, "createCallback", js.Any.fromFunction1(value))
      
      inline def setCreateCallbackNull: Self = StObject.set(x, "createCallback", null)
      
      inline def setCreateCallbackUndefined: Self = StObject.set(x, "createCallback", js.undefined)
      
      inline def setCreateMultipleCallback(value: /* items */ js.Array[GameObject] => Unit): Self = StObject.set(x, "createMultipleCallback", js.Any.fromFunction1(value))
      
      inline def setCreateMultipleCallbackNull: Self = StObject.set(x, "createMultipleCallback", null)
      
      inline def setCreateMultipleCallbackUndefined: Self = StObject.set(x, "createMultipleCallback", js.undefined)
      
      inline def setDefaultFrame(value: String | Double): Self = StObject.set(x, "defaultFrame", value.asInstanceOf[js.Any])
      
      inline def setDefaultFrameNull: Self = StObject.set(x, "defaultFrame", null)
      
      inline def setDefaultFrameUndefined: Self = StObject.set(x, "defaultFrame", js.undefined)
      
      inline def setDefaultKey(value: String): Self = StObject.set(x, "defaultKey", value.asInstanceOf[js.Any])
      
      inline def setDefaultKeyNull: Self = StObject.set(x, "defaultKey", null)
      
      inline def setDefaultKeyUndefined: Self = StObject.set(x, "defaultKey", js.undefined)
      
      inline def setMaxSize(value: Double): Self = StObject.set(x, "maxSize", value.asInstanceOf[js.Any])
      
      inline def setMaxSizeNull: Self = StObject.set(x, "maxSize", null)
      
      inline def setMaxSizeUndefined: Self = StObject.set(x, "maxSize", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameNull: Self = StObject.set(x, "name", null)
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setRemoveCallback(value: /* item */ GameObject => Unit): Self = StObject.set(x, "removeCallback", js.Any.fromFunction1(value))
      
      inline def setRemoveCallbackNull: Self = StObject.set(x, "removeCallback", null)
      
      inline def setRemoveCallbackUndefined: Self = StObject.set(x, "removeCallback", js.undefined)
      
      inline def setRunChildUpdate(value: Boolean): Self = StObject.set(x, "runChildUpdate", value.asInstanceOf[js.Any])
      
      inline def setRunChildUpdateNull: Self = StObject.set(x, "runChildUpdate", null)
      
      inline def setRunChildUpdateUndefined: Self = StObject.set(x, "runChildUpdate", js.undefined)
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
  trait GroupCreateConfig extends StObject {
    
    /**
      * The active state of each new Game Object.
      */
    var active: js.UndefOr[Boolean | Null] = js.undefined
    
    /**
      * The class of each new Game Object.
      */
    var classType: js.UndefOr[js.Function | Null] = js.undefined
    
    /**
      * The texture frame of each new Game Object.
      */
    var frame: js.UndefOr[String | (js.Array[Double | String]) | Double | Null] = js.undefined
    
    /**
      * The number of times each `frame` should be combined with one `key`.
      */
    var frameQuantity: js.UndefOr[Double | Null] = js.undefined
    
    /**
      * Align the new Game Objects in a grid using these settings.
      */
    var gridAlign: js.UndefOr[`false` | GridAlignConfig | Null] = js.undefined
    
    /**
      * A geometric shape that defines the hit area for the Game Object.
      */
    var hitArea: js.UndefOr[Any | Null] = js.undefined
    
    /**
      * A callback to be invoked when the Game Object is interacted with.
      */
    var hitAreaCallback: js.UndefOr[HitAreaCallback | Null] = js.undefined
    
    /**
      * The texture key of each new Game Object. Must be provided or not objects will be created.
      */
    var key: String | js.Array[String]
    
    /**
      * The maximum number of new Game Objects to create. 0 is no maximum.
      */
    var max: js.UndefOr[Double | Null] = js.undefined
    
    /**
      * The number of Game Objects to create. If set, this overrides the `frameQuantity` value. Use `frameQuantity` for more advanced control.
      */
    var quantity: js.UndefOr[Double | Null] = js.undefined
    
    /**
      * Select a `frame` at random.
      */
    var randomFrame: js.UndefOr[Boolean | Null] = js.undefined
    
    /**
      * Select a `key` at random.
      */
    var randomKey: js.UndefOr[Boolean | Null] = js.undefined
    
    /**
      * The number of times each `key` × `frame` combination will be *repeated* (after the first combination).
      */
    var repeat: js.UndefOr[Double | Null] = js.undefined
    
    var setAlpha: js.UndefOr[js.Object | Null] = js.undefined
    
    /**
      * Increment each Game Object's alpha from the previous by this amount, starting from `setAlpha.value`.
      */
    @JSName("setAlpha.step")
    var setAlphaDotstep: js.UndefOr[Double | Null] = js.undefined
    
    /**
      * The alpha value of each new Game Object.
      */
    @JSName("setAlpha.value")
    var setAlphaDotvalue: js.UndefOr[Double | Null] = js.undefined
    
    var setDepth: js.UndefOr[js.Object | Null] = js.undefined
    
    /**
      * Increment each Game Object's depth from the previous by this amount, starting from `setDepth.value`.
      */
    @JSName("setDepth.step")
    var setDepthDotstep: js.UndefOr[Double | Null] = js.undefined
    
    /**
      * The depth value of each new Game Object.
      */
    @JSName("setDepth.value")
    var setDepthDotvalue: js.UndefOr[Double | Null] = js.undefined
    
    var setOrigin: js.UndefOr[js.Object | Null] = js.undefined
    
    /**
      * Increment each Game Object's horizontal origin from the previous by this amount, starting from `setOrigin.x`.
      */
    @JSName("setOrigin.stepX")
    var setOriginDotstepX: js.UndefOr[Double | Null] = js.undefined
    
    /**
      * Increment each Game object's vertical origin from the previous by this amount, starting from `setOrigin.y`.
      */
    @JSName("setOrigin.stepY")
    var setOriginDotstepY: js.UndefOr[Double | Null] = js.undefined
    
    /**
      * The horizontal origin of each new Game Object.
      */
    @JSName("setOrigin.x")
    var setOriginDotx: js.UndefOr[Double | Null] = js.undefined
    
    /**
      * The vertical origin of each new Game Object.
      */
    @JSName("setOrigin.y")
    var setOriginDoty: js.UndefOr[Double | Null] = js.undefined
    
    var setRotation: js.UndefOr[js.Object | Null] = js.undefined
    
    /**
      * Increment each Game Object's rotation from the previous by this amount, starting at `setRotation.value`.
      */
    @JSName("setRotation.step")
    var setRotationDotstep: js.UndefOr[Double | Null] = js.undefined
    
    /**
      * Rotation of each new Game Object.
      */
    @JSName("setRotation.value")
    var setRotationDotvalue: js.UndefOr[Double | Null] = js.undefined
    
    var setScale: js.UndefOr[js.Object | Null] = js.undefined
    
    /**
      * Increment each Game Object's horizontal scale from the previous by this amount, starting from `setScale.x`.
      */
    @JSName("setScale.stepX")
    var setScaleDotstepX: js.UndefOr[Double | Null] = js.undefined
    
    /**
      * Increment each Game object's vertical scale from the previous by this amount, starting from `setScale.y`.
      */
    @JSName("setScale.stepY")
    var setScaleDotstepY: js.UndefOr[Double | Null] = js.undefined
    
    /**
      * The horizontal scale of each new Game Object.
      */
    @JSName("setScale.x")
    var setScaleDotx: js.UndefOr[Double | Null] = js.undefined
    
    /**
      * The vertical scale of each new Game Object.
      */
    @JSName("setScale.y")
    var setScaleDoty: js.UndefOr[Double | Null] = js.undefined
    
    var setScrollFactor: js.UndefOr[js.Object | Null] = js.undefined
    
    /**
      * Increment each Game Object's horizontal scroll factor from the previous by this amount, starting from `setScrollFactor.x`.
      */
    @JSName("setScrollFactor.stepX")
    var setScrollFactorDotstepX: js.UndefOr[Double | Null] = js.undefined
    
    /**
      * Increment each Game object's vertical scroll factor from the previous by this amount, starting from `setScrollFactor.y`.
      */
    @JSName("setScrollFactor.stepY")
    var setScrollFactorDotstepY: js.UndefOr[Double | Null] = js.undefined
    
    /**
      * The horizontal scroll factor of each new Game Object.
      */
    @JSName("setScrollFactor.x")
    var setScrollFactorDotx: js.UndefOr[Double | Null] = js.undefined
    
    /**
      * The vertical scroll factor of each new Game Object.
      */
    @JSName("setScrollFactor.y")
    var setScrollFactorDoty: js.UndefOr[Double | Null] = js.undefined
    
    var setXY: js.UndefOr[js.Object | Null] = js.undefined
    
    /**
      * Increment each Game Object's horizontal position from the previous by this amount, starting from `setXY.x`.
      */
    @JSName("setXY.stepX")
    var setXYDotstepX: js.UndefOr[Double | Null] = js.undefined
    
    /**
      * Increment each Game Object's vertical position from the previous by this amount, starting from `setXY.y`.
      */
    @JSName("setXY.stepY")
    var setXYDotstepY: js.UndefOr[Double | Null] = js.undefined
    
    /**
      * The horizontal position of each new Game Object.
      */
    @JSName("setXY.x")
    var setXYDotx: js.UndefOr[Double | Null] = js.undefined
    
    /**
      * The vertical position of each new Game Object.
      */
    @JSName("setXY.y")
    var setXYDoty: js.UndefOr[Double | Null] = js.undefined
    
    /**
      * The visible state of each new Game Object.
      */
    var visible: js.UndefOr[Boolean | Null] = js.undefined
    
    /**
      * Select keys and frames by moving forward then backward through `key` and `frame`.
      */
    var yoyo: js.UndefOr[Boolean | Null] = js.undefined
  }
  object GroupCreateConfig {
    
    inline def apply(key: String | js.Array[String]): GroupCreateConfig = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[GroupCreateConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GroupCreateConfig] (val x: Self) extends AnyVal {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveNull: Self = StObject.set(x, "active", null)
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      inline def setClassType(value: js.Function): Self = StObject.set(x, "classType", value.asInstanceOf[js.Any])
      
      inline def setClassTypeNull: Self = StObject.set(x, "classType", null)
      
      inline def setClassTypeUndefined: Self = StObject.set(x, "classType", js.undefined)
      
      inline def setFrame(value: String | (js.Array[Double | String]) | Double): Self = StObject.set(x, "frame", value.asInstanceOf[js.Any])
      
      inline def setFrameNull: Self = StObject.set(x, "frame", null)
      
      inline def setFrameQuantity(value: Double): Self = StObject.set(x, "frameQuantity", value.asInstanceOf[js.Any])
      
      inline def setFrameQuantityNull: Self = StObject.set(x, "frameQuantity", null)
      
      inline def setFrameQuantityUndefined: Self = StObject.set(x, "frameQuantity", js.undefined)
      
      inline def setFrameUndefined: Self = StObject.set(x, "frame", js.undefined)
      
      inline def setFrameVarargs(value: (Double | String)*): Self = StObject.set(x, "frame", js.Array(value*))
      
      inline def setGridAlign(value: `false` | GridAlignConfig): Self = StObject.set(x, "gridAlign", value.asInstanceOf[js.Any])
      
      inline def setGridAlignNull: Self = StObject.set(x, "gridAlign", null)
      
      inline def setGridAlignUndefined: Self = StObject.set(x, "gridAlign", js.undefined)
      
      inline def setHitArea(value: Any): Self = StObject.set(x, "hitArea", value.asInstanceOf[js.Any])
      
      inline def setHitAreaCallback(value: (/* hitArea */ Any, /* x */ Double, /* y */ Double, /* gameObject */ GameObject) => Boolean): Self = StObject.set(x, "hitAreaCallback", js.Any.fromFunction4(value))
      
      inline def setHitAreaCallbackNull: Self = StObject.set(x, "hitAreaCallback", null)
      
      inline def setHitAreaCallbackUndefined: Self = StObject.set(x, "hitAreaCallback", js.undefined)
      
      inline def setHitAreaNull: Self = StObject.set(x, "hitArea", null)
      
      inline def setHitAreaUndefined: Self = StObject.set(x, "hitArea", js.undefined)
      
      inline def setKey(value: String | js.Array[String]): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyVarargs(value: String*): Self = StObject.set(x, "key", js.Array(value*))
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxNull: Self = StObject.set(x, "max", null)
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setQuantity(value: Double): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
      
      inline def setQuantityNull: Self = StObject.set(x, "quantity", null)
      
      inline def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
      
      inline def setRandomFrame(value: Boolean): Self = StObject.set(x, "randomFrame", value.asInstanceOf[js.Any])
      
      inline def setRandomFrameNull: Self = StObject.set(x, "randomFrame", null)
      
      inline def setRandomFrameUndefined: Self = StObject.set(x, "randomFrame", js.undefined)
      
      inline def setRandomKey(value: Boolean): Self = StObject.set(x, "randomKey", value.asInstanceOf[js.Any])
      
      inline def setRandomKeyNull: Self = StObject.set(x, "randomKey", null)
      
      inline def setRandomKeyUndefined: Self = StObject.set(x, "randomKey", js.undefined)
      
      inline def setRepeat(value: Double): Self = StObject.set(x, "repeat", value.asInstanceOf[js.Any])
      
      inline def setRepeatNull: Self = StObject.set(x, "repeat", null)
      
      inline def setRepeatUndefined: Self = StObject.set(x, "repeat", js.undefined)
      
      inline def setSetAlpha(value: js.Object): Self = StObject.set(x, "setAlpha", value.asInstanceOf[js.Any])
      
      inline def setSetAlphaDotstep(value: Double): Self = StObject.set(x, "setAlpha.step", value.asInstanceOf[js.Any])
      
      inline def setSetAlphaDotstepNull: Self = StObject.set(x, "setAlpha.step", null)
      
      inline def setSetAlphaDotstepUndefined: Self = StObject.set(x, "setAlpha.step", js.undefined)
      
      inline def setSetAlphaDotvalue(value: Double): Self = StObject.set(x, "setAlpha.value", value.asInstanceOf[js.Any])
      
      inline def setSetAlphaDotvalueNull: Self = StObject.set(x, "setAlpha.value", null)
      
      inline def setSetAlphaDotvalueUndefined: Self = StObject.set(x, "setAlpha.value", js.undefined)
      
      inline def setSetAlphaNull: Self = StObject.set(x, "setAlpha", null)
      
      inline def setSetAlphaUndefined: Self = StObject.set(x, "setAlpha", js.undefined)
      
      inline def setSetDepth(value: js.Object): Self = StObject.set(x, "setDepth", value.asInstanceOf[js.Any])
      
      inline def setSetDepthDotstep(value: Double): Self = StObject.set(x, "setDepth.step", value.asInstanceOf[js.Any])
      
      inline def setSetDepthDotstepNull: Self = StObject.set(x, "setDepth.step", null)
      
      inline def setSetDepthDotstepUndefined: Self = StObject.set(x, "setDepth.step", js.undefined)
      
      inline def setSetDepthDotvalue(value: Double): Self = StObject.set(x, "setDepth.value", value.asInstanceOf[js.Any])
      
      inline def setSetDepthDotvalueNull: Self = StObject.set(x, "setDepth.value", null)
      
      inline def setSetDepthDotvalueUndefined: Self = StObject.set(x, "setDepth.value", js.undefined)
      
      inline def setSetDepthNull: Self = StObject.set(x, "setDepth", null)
      
      inline def setSetDepthUndefined: Self = StObject.set(x, "setDepth", js.undefined)
      
      inline def setSetOrigin(value: js.Object): Self = StObject.set(x, "setOrigin", value.asInstanceOf[js.Any])
      
      inline def setSetOriginDotstepX(value: Double): Self = StObject.set(x, "setOrigin.stepX", value.asInstanceOf[js.Any])
      
      inline def setSetOriginDotstepXNull: Self = StObject.set(x, "setOrigin.stepX", null)
      
      inline def setSetOriginDotstepXUndefined: Self = StObject.set(x, "setOrigin.stepX", js.undefined)
      
      inline def setSetOriginDotstepY(value: Double): Self = StObject.set(x, "setOrigin.stepY", value.asInstanceOf[js.Any])
      
      inline def setSetOriginDotstepYNull: Self = StObject.set(x, "setOrigin.stepY", null)
      
      inline def setSetOriginDotstepYUndefined: Self = StObject.set(x, "setOrigin.stepY", js.undefined)
      
      inline def setSetOriginDotx(value: Double): Self = StObject.set(x, "setOrigin.x", value.asInstanceOf[js.Any])
      
      inline def setSetOriginDotxNull: Self = StObject.set(x, "setOrigin.x", null)
      
      inline def setSetOriginDotxUndefined: Self = StObject.set(x, "setOrigin.x", js.undefined)
      
      inline def setSetOriginDoty(value: Double): Self = StObject.set(x, "setOrigin.y", value.asInstanceOf[js.Any])
      
      inline def setSetOriginDotyNull: Self = StObject.set(x, "setOrigin.y", null)
      
      inline def setSetOriginDotyUndefined: Self = StObject.set(x, "setOrigin.y", js.undefined)
      
      inline def setSetOriginNull: Self = StObject.set(x, "setOrigin", null)
      
      inline def setSetOriginUndefined: Self = StObject.set(x, "setOrigin", js.undefined)
      
      inline def setSetRotation(value: js.Object): Self = StObject.set(x, "setRotation", value.asInstanceOf[js.Any])
      
      inline def setSetRotationDotstep(value: Double): Self = StObject.set(x, "setRotation.step", value.asInstanceOf[js.Any])
      
      inline def setSetRotationDotstepNull: Self = StObject.set(x, "setRotation.step", null)
      
      inline def setSetRotationDotstepUndefined: Self = StObject.set(x, "setRotation.step", js.undefined)
      
      inline def setSetRotationDotvalue(value: Double): Self = StObject.set(x, "setRotation.value", value.asInstanceOf[js.Any])
      
      inline def setSetRotationDotvalueNull: Self = StObject.set(x, "setRotation.value", null)
      
      inline def setSetRotationDotvalueUndefined: Self = StObject.set(x, "setRotation.value", js.undefined)
      
      inline def setSetRotationNull: Self = StObject.set(x, "setRotation", null)
      
      inline def setSetRotationUndefined: Self = StObject.set(x, "setRotation", js.undefined)
      
      inline def setSetScale(value: js.Object): Self = StObject.set(x, "setScale", value.asInstanceOf[js.Any])
      
      inline def setSetScaleDotstepX(value: Double): Self = StObject.set(x, "setScale.stepX", value.asInstanceOf[js.Any])
      
      inline def setSetScaleDotstepXNull: Self = StObject.set(x, "setScale.stepX", null)
      
      inline def setSetScaleDotstepXUndefined: Self = StObject.set(x, "setScale.stepX", js.undefined)
      
      inline def setSetScaleDotstepY(value: Double): Self = StObject.set(x, "setScale.stepY", value.asInstanceOf[js.Any])
      
      inline def setSetScaleDotstepYNull: Self = StObject.set(x, "setScale.stepY", null)
      
      inline def setSetScaleDotstepYUndefined: Self = StObject.set(x, "setScale.stepY", js.undefined)
      
      inline def setSetScaleDotx(value: Double): Self = StObject.set(x, "setScale.x", value.asInstanceOf[js.Any])
      
      inline def setSetScaleDotxNull: Self = StObject.set(x, "setScale.x", null)
      
      inline def setSetScaleDotxUndefined: Self = StObject.set(x, "setScale.x", js.undefined)
      
      inline def setSetScaleDoty(value: Double): Self = StObject.set(x, "setScale.y", value.asInstanceOf[js.Any])
      
      inline def setSetScaleDotyNull: Self = StObject.set(x, "setScale.y", null)
      
      inline def setSetScaleDotyUndefined: Self = StObject.set(x, "setScale.y", js.undefined)
      
      inline def setSetScaleNull: Self = StObject.set(x, "setScale", null)
      
      inline def setSetScaleUndefined: Self = StObject.set(x, "setScale", js.undefined)
      
      inline def setSetScrollFactor(value: js.Object): Self = StObject.set(x, "setScrollFactor", value.asInstanceOf[js.Any])
      
      inline def setSetScrollFactorDotstepX(value: Double): Self = StObject.set(x, "setScrollFactor.stepX", value.asInstanceOf[js.Any])
      
      inline def setSetScrollFactorDotstepXNull: Self = StObject.set(x, "setScrollFactor.stepX", null)
      
      inline def setSetScrollFactorDotstepXUndefined: Self = StObject.set(x, "setScrollFactor.stepX", js.undefined)
      
      inline def setSetScrollFactorDotstepY(value: Double): Self = StObject.set(x, "setScrollFactor.stepY", value.asInstanceOf[js.Any])
      
      inline def setSetScrollFactorDotstepYNull: Self = StObject.set(x, "setScrollFactor.stepY", null)
      
      inline def setSetScrollFactorDotstepYUndefined: Self = StObject.set(x, "setScrollFactor.stepY", js.undefined)
      
      inline def setSetScrollFactorDotx(value: Double): Self = StObject.set(x, "setScrollFactor.x", value.asInstanceOf[js.Any])
      
      inline def setSetScrollFactorDotxNull: Self = StObject.set(x, "setScrollFactor.x", null)
      
      inline def setSetScrollFactorDotxUndefined: Self = StObject.set(x, "setScrollFactor.x", js.undefined)
      
      inline def setSetScrollFactorDoty(value: Double): Self = StObject.set(x, "setScrollFactor.y", value.asInstanceOf[js.Any])
      
      inline def setSetScrollFactorDotyNull: Self = StObject.set(x, "setScrollFactor.y", null)
      
      inline def setSetScrollFactorDotyUndefined: Self = StObject.set(x, "setScrollFactor.y", js.undefined)
      
      inline def setSetScrollFactorNull: Self = StObject.set(x, "setScrollFactor", null)
      
      inline def setSetScrollFactorUndefined: Self = StObject.set(x, "setScrollFactor", js.undefined)
      
      inline def setSetXY(value: js.Object): Self = StObject.set(x, "setXY", value.asInstanceOf[js.Any])
      
      inline def setSetXYDotstepX(value: Double): Self = StObject.set(x, "setXY.stepX", value.asInstanceOf[js.Any])
      
      inline def setSetXYDotstepXNull: Self = StObject.set(x, "setXY.stepX", null)
      
      inline def setSetXYDotstepXUndefined: Self = StObject.set(x, "setXY.stepX", js.undefined)
      
      inline def setSetXYDotstepY(value: Double): Self = StObject.set(x, "setXY.stepY", value.asInstanceOf[js.Any])
      
      inline def setSetXYDotstepYNull: Self = StObject.set(x, "setXY.stepY", null)
      
      inline def setSetXYDotstepYUndefined: Self = StObject.set(x, "setXY.stepY", js.undefined)
      
      inline def setSetXYDotx(value: Double): Self = StObject.set(x, "setXY.x", value.asInstanceOf[js.Any])
      
      inline def setSetXYDotxNull: Self = StObject.set(x, "setXY.x", null)
      
      inline def setSetXYDotxUndefined: Self = StObject.set(x, "setXY.x", js.undefined)
      
      inline def setSetXYDoty(value: Double): Self = StObject.set(x, "setXY.y", value.asInstanceOf[js.Any])
      
      inline def setSetXYDotyNull: Self = StObject.set(x, "setXY.y", null)
      
      inline def setSetXYDotyUndefined: Self = StObject.set(x, "setXY.y", js.undefined)
      
      inline def setSetXYNull: Self = StObject.set(x, "setXY", null)
      
      inline def setSetXYUndefined: Self = StObject.set(x, "setXY", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleNull: Self = StObject.set(x, "visible", null)
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      inline def setYoyo(value: Boolean): Self = StObject.set(x, "yoyo", value.asInstanceOf[js.Any])
      
      inline def setYoyoNull: Self = StObject.set(x, "yoyo", null)
      
      inline def setYoyoUndefined: Self = StObject.set(x, "yoyo", js.undefined)
    }
  }
  
  type GroupMultipleCreateCallback = js.Function1[/* items */ js.Array[GameObject], Unit]
}
