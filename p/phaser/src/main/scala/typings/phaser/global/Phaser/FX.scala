package typings.phaser.global.Phaser

import typings.phaser.Phaser.GameObjects.GameObject
import typings.std.WebGLTexture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FX {
  
  /**
    * The Barrel FX.
    */
  @JSGlobal("Phaser.FX.BARREL")
  @js.native
  val BARREL_ : Double = js.native
  
  /**
    * The Bloom FX.
    */
  @JSGlobal("Phaser.FX.BLOOM")
  @js.native
  val BLOOM_ : Double = js.native
  
  /**
    * The Blur FX.
    */
  @JSGlobal("Phaser.FX.BLUR")
  @js.native
  val BLUR_ : Double = js.native
  
  /**
    * The Bokeh and Tilt Shift FX.
    */
  @JSGlobal("Phaser.FX.BOKEH")
  @js.native
  val BOKEH_ : Double = js.native
  
  /**
    * The Barrel FX Controller.
    * 
    * This FX controller manages the barrel distortion effect for a Game Object.
    * 
    * A barrel effect allows you to apply either a 'pinch' or 'expand' distortion to
    * a Game Object. The amount of the effect can be modified in real-time.
    * 
    * A Barrel effect is added to a Game Object via the FX component:
    * 
    * ```js
    * const sprite = this.add.sprite();
    * 
    * sprite.preFX.addBarrel();
    * sprite.postFX.addBarrel();
    * ```
    */
  @JSGlobal("Phaser.FX.Barrel")
  @js.native
  open class Barrel protected ()
    extends StObject
       with typings.phaser.Phaser.FX.Barrel {
    /**
      * 
      * @param gameObject A reference to the Game Object that has this fx.
      * @param amount The amount of distortion applied to the barrel effect. A value of 1 is no distortion. Typically keep this within +- 1. Default 1.
      */
    def this(gameObject: GameObject) = this()
    def this(gameObject: GameObject, amount: Double) = this()
    
    /**
      * Toggle this boolean to enable or disable this effect,
      * without removing and adding it from the Game Object.
      * 
      * Only works for Pre FX.
      * 
      * Post FX are always active.
      */
    /* CompleteClass */
    var active: Boolean = js.native
    
    /**
      * The amount of distortion applied to the barrel effect.
      * 
      * Typically keep this within the range 1 (no distortion) to +- 1.
      */
    /* CompleteClass */
    var amount: Double = js.native
    
    /**
      * Destroys this FX Controller.
      */
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /**
      * A reference to the Game Object that owns this effect.
      */
    /* CompleteClass */
    var gameObject: GameObject = js.native
    
    /**
      * Sets the active state of this FX Controller.
      * 
      * A disabled FX Controller will not be updated.
      * @param value `true` to enable this FX Controller, or `false` to disable it.
      */
    /* CompleteClass */
    override def setActive(value: Boolean): this.type = js.native
    
    /**
      * The FX_CONST type of this effect.
      */
    /* CompleteClass */
    var `type`: Double = js.native
  }
  
  /**
    * The Bloom FX Controller.
    * 
    * This FX controller manages the bloom effect for a Game Object.
    * 
    * Bloom is an effect used to reproduce an imaging artifact of real-world cameras.
    * The effect produces fringes of light extending from the borders of bright areas in an image,
    * contributing to the illusion of an extremely bright light overwhelming the
    * camera or eye capturing the scene.
    * 
    * A Bloom effect is added to a Game Object via the FX component:
    * 
    * ```js
    * const sprite = this.add.sprite();
    * 
    * sprite.preFX.addBloom();
    * sprite.postFX.addBloom();
    * ```
    */
  @JSGlobal("Phaser.FX.Bloom")
  @js.native
  open class Bloom protected ()
    extends StObject
       with typings.phaser.Phaser.FX.Bloom {
    /**
      * 
      * @param gameObject A reference to the Game Object that has this fx.
      * @param color The color of the Bloom, as a hex value. Default 0xffffff.
      * @param offsetX The horizontal offset of the bloom effect. Default 1.
      * @param offsetY The vertical offset of the bloom effect. Default 1.
      * @param blurStrength The strength of the blur process of the bloom effect. Default 1.
      * @param strength The strength of the blend process of the bloom effect. Default 1.
      * @param steps The number of steps to run the Bloom effect for. This value should always be an integer. Default 4.
      */
    def this(
      gameObject: GameObject,
      color: js.UndefOr[Double],
      offsetX: js.UndefOr[Double],
      offsetY: js.UndefOr[Double],
      blurStrength: js.UndefOr[Double],
      strength: js.UndefOr[Double],
      steps: js.UndefOr[Double]
    ) = this()
    
    /**
      * Toggle this boolean to enable or disable this effect,
      * without removing and adding it from the Game Object.
      * 
      * Only works for Pre FX.
      * 
      * Post FX are always active.
      */
    /* CompleteClass */
    var active: Boolean = js.native
    
    /**
      * The strength of the blur process of the bloom effect.
      */
    /* CompleteClass */
    var blurStrength: Double = js.native
    
    /**
      * The color of the bloom as a number value.
      */
    /* CompleteClass */
    var color: Double = js.native
    
    /**
      * Destroys this FX Controller.
      */
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /**
      * A reference to the Game Object that owns this effect.
      */
    /* CompleteClass */
    var gameObject: GameObject = js.native
    
    /**
      * The internal gl color array.
      */
    /* CompleteClass */
    var glcolor: js.Array[Double] = js.native
    
    /**
      * The horizontal offset of the bloom effect.
      */
    /* CompleteClass */
    var offsetX: Double = js.native
    
    /**
      * The vertical offset of the bloom effect.
      */
    /* CompleteClass */
    var offsetY: Double = js.native
    
    /**
      * Sets the active state of this FX Controller.
      * 
      * A disabled FX Controller will not be updated.
      * @param value `true` to enable this FX Controller, or `false` to disable it.
      */
    /* CompleteClass */
    override def setActive(value: Boolean): this.type = js.native
    
    /**
      * The number of steps to run the Bloom effect for.
      * 
      * This value should always be an integer.
      * 
      * It defaults to 4. The higher the value, the smoother the Bloom,
      * but at the cost of exponentially more gl operations.
      * 
      * Keep this to the lowest possible number you can have it, while
      * still looking correct for your game.
      */
    /* CompleteClass */
    var steps: Double = js.native
    
    /**
      * The strength of the blend process of the bloom effect.
      */
    /* CompleteClass */
    var strength: Double = js.native
    
    /**
      * The FX_CONST type of this effect.
      */
    /* CompleteClass */
    var `type`: Double = js.native
  }
  
  /**
    * The Blur FX Controller.
    * 
    * This FX controller manages the blur effect for a Game Object.
    * 
    * A Gaussian blur is the result of blurring an image by a Gaussian function. It is a widely used effect,
    * typically to reduce image noise and reduce detail. The visual effect of this blurring technique is a
    * smooth blur resembling that of viewing the image through a translucent screen, distinctly different
    * from the bokeh effect produced by an out-of-focus lens or the shadow of an object under usual illumination.
    * 
    * A Blur effect is added to a Game Object via the FX component:
    * 
    * ```js
    * const sprite = this.add.sprite();
    * 
    * sprite.preFX.addBlur();
    * sprite.postFX.addBlur();
    * ```
    */
  @JSGlobal("Phaser.FX.Blur")
  @js.native
  open class Blur protected ()
    extends StObject
       with typings.phaser.Phaser.FX.Blur {
    /**
      * 
      * @param gameObject A reference to the Game Object that has this fx.
      * @param quality The quality of the blur effect. Can be either 0 for Low Quality, 1 for Medium Quality or 2 for High Quality. Default 0.
      * @param x The horizontal offset of the blur effect. Default 2.
      * @param y The vertical offset of the blur effect. Default 2.
      * @param strength The strength of the blur effect. Default 1.
      * @param color The color of the blur, as a hex value. Default 0xffffff.
      * @param steps The number of steps to run the blur effect for. This value should always be an integer. Default 4.
      */
    def this(
      gameObject: GameObject,
      quality: js.UndefOr[Double],
      x: js.UndefOr[Double],
      y: js.UndefOr[Double],
      strength: js.UndefOr[Double],
      color: js.UndefOr[Double],
      steps: js.UndefOr[Double]
    ) = this()
    
    /**
      * Toggle this boolean to enable or disable this effect,
      * without removing and adding it from the Game Object.
      * 
      * Only works for Pre FX.
      * 
      * Post FX are always active.
      */
    /* CompleteClass */
    var active: Boolean = js.native
    
    /**
      * The color of the blur as a number value.
      */
    /* CompleteClass */
    var color: Double = js.native
    
    /**
      * Destroys this FX Controller.
      */
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /**
      * A reference to the Game Object that owns this effect.
      */
    /* CompleteClass */
    var gameObject: GameObject = js.native
    
    /**
      * The internal gl color array.
      */
    /* CompleteClass */
    var glcolor: js.Array[Double] = js.native
    
    /**
      * The quality of the blur effect.
      * 
      * This can be:
      * 
      * 0 for Low Quality
      * 1 for Medium Quality
      * 2 for High Quality
      * 
      * The higher the quality, the more complex shader is used
      * and the more processing time is spent on the GPU calculating
      * the final blur. This value is used in conjunction with the
      * `steps` value, as one has a direct impact on the other.
      * 
      * Keep this value as low as you can, while still achieving the
      * desired effect you need for your game.
      */
    /* CompleteClass */
    var quality: Double = js.native
    
    /**
      * Sets the active state of this FX Controller.
      * 
      * A disabled FX Controller will not be updated.
      * @param value `true` to enable this FX Controller, or `false` to disable it.
      */
    /* CompleteClass */
    override def setActive(value: Boolean): this.type = js.native
    
    /**
      * The number of steps to run the Blur effect for.
      * 
      * This value should always be an integer.
      * 
      * It defaults to 4. The higher the value, the smoother the blur,
      * but at the cost of exponentially more gl operations.
      * 
      * Keep this to the lowest possible number you can have it, while
      * still looking correct for your game.
      */
    /* CompleteClass */
    var steps: Double = js.native
    
    /**
      * The strength of the blur effect.
      */
    /* CompleteClass */
    var strength: Double = js.native
    
    /**
      * The FX_CONST type of this effect.
      */
    /* CompleteClass */
    var `type`: Double = js.native
    
    /**
      * The horizontal offset of the blur effect.
      */
    /* CompleteClass */
    var x: Double = js.native
    
    /**
      * The vertical offset of the blur effect.
      */
    /* CompleteClass */
    var y: Double = js.native
  }
  
  /**
    * The Bokeh FX Controller.
    * 
    * This FX controller manages the bokeh effect for a Game Object.
    * 
    * Bokeh refers to a visual effect that mimics the photographic technique of creating a shallow depth of field.
    * This effect is used to emphasize the game's main subject or action, by blurring the background or foreground
    * elements, resulting in a more immersive and visually appealing experience. It is achieved through rendering
    * techniques that simulate the out-of-focus areas, giving a sense of depth and realism to the game's graphics.
    * 
    * This effect can also be used to generate a Tilt Shift effect, which is a technique used to create a miniature
    * effect by blurring everything except a small area of the image. This effect is achieved by blurring the
    * top and bottom elements, while keeping the center area in focus.
    * 
    * A Bokeh effect is added to a Game Object via the FX component:
    * 
    * ```js
    * const sprite = this.add.sprite();
    * 
    * sprite.preFX.addBokeh();
    * sprite.postFX.addBokeh();
    * ```
    */
  @JSGlobal("Phaser.FX.Bokeh")
  @js.native
  open class Bokeh protected ()
    extends StObject
       with typings.phaser.Phaser.FX.Bokeh {
    /**
      * 
      * @param gameObject A reference to the Game Object that has this fx.
      * @param radius The radius of the bokeh effect. Default 0.5.
      * @param amount The amount of the bokeh effect. Default 1.
      * @param contrast The color contrast of the bokeh effect. Default 0.2.
      * @param isTiltShift Is this a bokeh or Tile Shift effect? Default false.
      * @param blurX If Tilt Shift, the amount of horizontal blur. Default 1.
      * @param blurY If Tilt Shift, the amount of vertical blur. Default 1.
      * @param strength If Tilt Shift, the strength of the blur. Default 1.
      */
    def this(
      gameObject: GameObject,
      radius: js.UndefOr[Double],
      amount: js.UndefOr[Double],
      contrast: js.UndefOr[Double],
      isTiltShift: js.UndefOr[Boolean],
      blurX: js.UndefOr[Double],
      blurY: js.UndefOr[Double],
      strength: js.UndefOr[Double]
    ) = this()
    
    /**
      * Toggle this boolean to enable or disable this effect,
      * without removing and adding it from the Game Object.
      * 
      * Only works for Pre FX.
      * 
      * Post FX are always active.
      */
    /* CompleteClass */
    var active: Boolean = js.native
    
    /**
      * The amount, or strength, of the bokeh effect. Defaults to 1.
      */
    /* CompleteClass */
    var amount: Double = js.native
    
    /**
      * If a Tilt Shift effect this controls the amount of horizontal blur.
      * 
      * Setting this value on a non-Tilt Shift effect will have no effect.
      */
    /* CompleteClass */
    var blurX: Double = js.native
    
    /**
      * If a Tilt Shift effect this controls the amount of vertical blur.
      * 
      * Setting this value on a non-Tilt Shift effect will have no effect.
      */
    /* CompleteClass */
    var blurY: Double = js.native
    
    /**
      * The color contrast, or brightness, of the bokeh effect. Defaults to 0.2.
      */
    /* CompleteClass */
    var contrast: Double = js.native
    
    /**
      * Destroys this FX Controller.
      */
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /**
      * A reference to the Game Object that owns this effect.
      */
    /* CompleteClass */
    var gameObject: GameObject = js.native
    
    /**
      * Is this a Tilt Shift effect or a standard bokeh effect?
      */
    /* CompleteClass */
    var isTiltShift: Boolean = js.native
    
    /**
      * The radius of the bokeh effect.
      * 
      * This is a float value, where a radius of 0 will result in no effect being applied,
      * and a radius of 1 will result in a strong bokeh. However, you can exceed this value
      * for even stronger effects.
      */
    /* CompleteClass */
    var radius: Double = js.native
    
    /**
      * Sets the active state of this FX Controller.
      * 
      * A disabled FX Controller will not be updated.
      * @param value `true` to enable this FX Controller, or `false` to disable it.
      */
    /* CompleteClass */
    override def setActive(value: Boolean): this.type = js.native
    
    /**
      * If a Tilt Shift effect this controls the strength of the blur.
      * 
      * Setting this value on a non-Tilt Shift effect will have no effect.
      */
    /* CompleteClass */
    var strength: Double = js.native
    
    /**
      * The FX_CONST type of this effect.
      */
    /* CompleteClass */
    var `type`: Double = js.native
  }
  
  /**
    * The Circle FX.
    */
  @JSGlobal("Phaser.FX.CIRCLE")
  @js.native
  val CIRCLE_ : Double = js.native
  
  /**
    * The Color Matrix FX.
    */
  @JSGlobal("Phaser.FX.COLOR_MATRIX")
  @js.native
  val COLOR_MATRIX: Double = js.native
  
  /**
    * The Circle FX Controller.
    * 
    * This FX controller manages the circle effect for a Game Object.
    * 
    * This effect will draw a circle around the texture of the Game Object, effectively masking off
    * any area outside of the circle without the need for an actual mask. You can control the thickness
    * of the circle, the color of the circle and the color of the background, should the texture be
    * transparent. You can also control the feathering applied to the circle, allowing for a harsh or soft edge.
    * 
    * Please note that adding this effect to a Game Object will not change the input area or physics body of
    * the Game Object, should it have one.
    * 
    * A Circle effect is added to a Game Object via the FX component:
    * 
    * ```js
    * const sprite = this.add.sprite();
    * 
    * sprite.preFX.addCircle();
    * sprite.postFX.addCircle();
    * ```
    */
  @JSGlobal("Phaser.FX.Circle")
  @js.native
  open class Circle protected ()
    extends StObject
       with typings.phaser.Phaser.FX.Circle {
    /**
      * 
      * @param gameObject A reference to the Game Object that has this fx.
      * @param thickness The width of the circle around the texture, in pixels. Default 8.
      * @param color The color of the circular ring, given as a number value. Default 0xfeedb6.
      * @param backgroundColor The color of the background, behind the texture, given as a number value. Default 0xff0000.
      * @param scale The scale of the circle. The default scale is 1, which is a circle the full size of the underlying texture. Default 1.
      * @param feather The amount of feathering to apply to the circle from the ring. Default 0.005.
      */
    def this(gameObject: GameObject) = this()
    def this(gameObject: GameObject, thickness: Double) = this()
    def this(gameObject: GameObject, thickness: Double, color: Double) = this()
    def this(gameObject: GameObject, thickness: Unit, color: Double) = this()
    def this(gameObject: GameObject, thickness: Double, color: Double, backgroundColor: Double) = this()
    def this(gameObject: GameObject, thickness: Double, color: Unit, backgroundColor: Double) = this()
    def this(gameObject: GameObject, thickness: Unit, color: Double, backgroundColor: Double) = this()
    def this(gameObject: GameObject, thickness: Unit, color: Unit, backgroundColor: Double) = this()
    def this(gameObject: GameObject, thickness: Double, color: Double, backgroundColor: Double, scale: Double) = this()
    def this(gameObject: GameObject, thickness: Double, color: Double, backgroundColor: Unit, scale: Double) = this()
    def this(gameObject: GameObject, thickness: Double, color: Unit, backgroundColor: Double, scale: Double) = this()
    def this(gameObject: GameObject, thickness: Double, color: Unit, backgroundColor: Unit, scale: Double) = this()
    def this(gameObject: GameObject, thickness: Unit, color: Double, backgroundColor: Double, scale: Double) = this()
    def this(gameObject: GameObject, thickness: Unit, color: Double, backgroundColor: Unit, scale: Double) = this()
    def this(gameObject: GameObject, thickness: Unit, color: Unit, backgroundColor: Double, scale: Double) = this()
    def this(gameObject: GameObject, thickness: Unit, color: Unit, backgroundColor: Unit, scale: Double) = this()
    def this(
      gameObject: GameObject,
      thickness: Double,
      color: Double,
      backgroundColor: Double,
      scale: Double,
      feather: Double
    ) = this()
    def this(
      gameObject: GameObject,
      thickness: Double,
      color: Double,
      backgroundColor: Double,
      scale: Unit,
      feather: Double
    ) = this()
    def this(
      gameObject: GameObject,
      thickness: Double,
      color: Double,
      backgroundColor: Unit,
      scale: Double,
      feather: Double
    ) = this()
    def this(
      gameObject: GameObject,
      thickness: Double,
      color: Double,
      backgroundColor: Unit,
      scale: Unit,
      feather: Double
    ) = this()
    def this(
      gameObject: GameObject,
      thickness: Double,
      color: Unit,
      backgroundColor: Double,
      scale: Double,
      feather: Double
    ) = this()
    def this(
      gameObject: GameObject,
      thickness: Double,
      color: Unit,
      backgroundColor: Double,
      scale: Unit,
      feather: Double
    ) = this()
    def this(
      gameObject: GameObject,
      thickness: Double,
      color: Unit,
      backgroundColor: Unit,
      scale: Double,
      feather: Double
    ) = this()
    def this(
      gameObject: GameObject,
      thickness: Double,
      color: Unit,
      backgroundColor: Unit,
      scale: Unit,
      feather: Double
    ) = this()
    def this(
      gameObject: GameObject,
      thickness: Unit,
      color: Double,
      backgroundColor: Double,
      scale: Double,
      feather: Double
    ) = this()
    def this(
      gameObject: GameObject,
      thickness: Unit,
      color: Double,
      backgroundColor: Double,
      scale: Unit,
      feather: Double
    ) = this()
    def this(
      gameObject: GameObject,
      thickness: Unit,
      color: Double,
      backgroundColor: Unit,
      scale: Double,
      feather: Double
    ) = this()
    def this(
      gameObject: GameObject,
      thickness: Unit,
      color: Double,
      backgroundColor: Unit,
      scale: Unit,
      feather: Double
    ) = this()
    def this(
      gameObject: GameObject,
      thickness: Unit,
      color: Unit,
      backgroundColor: Double,
      scale: Double,
      feather: Double
    ) = this()
    def this(
      gameObject: GameObject,
      thickness: Unit,
      color: Unit,
      backgroundColor: Double,
      scale: Unit,
      feather: Double
    ) = this()
    def this(
      gameObject: GameObject,
      thickness: Unit,
      color: Unit,
      backgroundColor: Unit,
      scale: Double,
      feather: Double
    ) = this()
    def this(
      gameObject: GameObject,
      thickness: Unit,
      color: Unit,
      backgroundColor: Unit,
      scale: Unit,
      feather: Double
    ) = this()
    
    /**
      * Toggle this boolean to enable or disable this effect,
      * without removing and adding it from the Game Object.
      * 
      * Only works for Pre FX.
      * 
      * Post FX are always active.
      */
    /* CompleteClass */
    var active: Boolean = js.native
    
    /**
      * The color of the background, behind the texture, given as a number value.
      */
    /* CompleteClass */
    var backgroundColor: Double = js.native
    
    /**
      * The color of the circular ring, given as a number value.
      */
    /* CompleteClass */
    var color: Double = js.native
    
    /**
      * Destroys this FX Controller.
      */
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /**
      * The amount of feathering to apply to the circle from the ring,
      * extending into the middle of the circle. The default is 0.005,
      * which is a very low amount of feathering just making sure the ring
      * has a smooth edge. Increase this amount to a value such as 0.5
      * or 0.025 for larger amounts of feathering.
      */
    /* CompleteClass */
    var feather: Double = js.native
    
    /**
      * A reference to the Game Object that owns this effect.
      */
    /* CompleteClass */
    var gameObject: GameObject = js.native
    
    /**
      * The internal gl color array for the ring color.
      */
    /* CompleteClass */
    var glcolor: js.Array[Double] = js.native
    
    /**
      * The internal gl color array for the background color.
      */
    /* CompleteClass */
    var glcolor2: js.Array[Double] = js.native
    
    /**
      * The scale of the circle. The default scale is 1, which is a circle
      * the full size of the underlying texture. Reduce this value to create
      * a smaller circle, or increase it to create a circle that extends off
      * the edges of the texture.
      */
    /* CompleteClass */
    var scale: Double = js.native
    
    /**
      * Sets the active state of this FX Controller.
      * 
      * A disabled FX Controller will not be updated.
      * @param value `true` to enable this FX Controller, or `false` to disable it.
      */
    /* CompleteClass */
    override def setActive(value: Boolean): this.type = js.native
    
    /**
      * The width of the circle around the texture, in pixels. This value
      * doesn't factor in the feather, which can extend the thickness
      * internally depending on its value.
      */
    /* CompleteClass */
    var thickness: Double = js.native
    
    /**
      * The FX_CONST type of this effect.
      */
    /* CompleteClass */
    var `type`: Double = js.native
  }
  
  /**
    * The ColorMatrix FX Controller.
    * 
    * This FX controller manages the color matrix effect for a Game Object.
    * 
    * The color matrix effect is a visual technique that involves manipulating the colors of an image
    * or scene using a mathematical matrix. This process can adjust hue, saturation, brightness, and contrast,
    * allowing developers to create various stylistic appearances or mood settings within the game.
    * Common applications include simulating different lighting conditions, applying color filters,
    * or achieving a specific visual style.
    * 
    * A ColorMatrix effect is added to a Game Object via the FX component:
    * 
    * ```js
    * const sprite = this.add.sprite();
    * 
    * sprite.preFX.addColorMatrix();
    * sprite.postFX.addColorMatrix();
    * ```
    */
  @JSGlobal("Phaser.FX.ColorMatrix")
  @js.native
  open class ColorMatrix protected ()
    extends StObject
       with typings.phaser.Phaser.FX.ColorMatrix {
    /**
      * 
      * @param gameObject A reference to the Game Object that has this fx.
      */
    def this(gameObject: GameObject) = this()
  }
  
  /**
    * FX Controller is the base class that all built-in FX use.
    * 
    * You should not normally create an instance of this class directly, but instead use one of the built-in FX that extend it.
    */
  @JSGlobal("Phaser.FX.Controller")
  @js.native
  open class Controller protected ()
    extends StObject
       with typings.phaser.Phaser.FX.Controller {
    /**
      * 
      * @param type The FX Type constant.
      * @param gameObject A reference to the Game Object that has this fx.
      */
    def this(`type`: Double, gameObject: GameObject) = this()
    
    /**
      * Toggle this boolean to enable or disable this effect,
      * without removing and adding it from the Game Object.
      * 
      * Only works for Pre FX.
      * 
      * Post FX are always active.
      */
    /* CompleteClass */
    var active: Boolean = js.native
    
    /**
      * Destroys this FX Controller.
      */
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /**
      * A reference to the Game Object that owns this effect.
      */
    /* CompleteClass */
    var gameObject: GameObject = js.native
    
    /**
      * Sets the active state of this FX Controller.
      * 
      * A disabled FX Controller will not be updated.
      * @param value `true` to enable this FX Controller, or `false` to disable it.
      */
    /* CompleteClass */
    override def setActive(value: Boolean): this.type = js.native
    
    /**
      * The FX_CONST type of this effect.
      */
    /* CompleteClass */
    var `type`: Double = js.native
  }
  
  /**
    * The Displacement FX.
    */
  @JSGlobal("Phaser.FX.DISPLACEMENT")
  @js.native
  val DISPLACEMENT_ : Double = js.native
  
  /**
    * The Displacement FX Controller.
    * 
    * This FX controller manages the displacement effect for a Game Object.
    * 
    * The displacement effect is a visual technique that alters the position of pixels in an image
    * or texture based on the values of a displacement map. This effect is used to create the illusion
    * of depth, surface irregularities, or distortion in otherwise flat elements. It can be applied to
    * characters, objects, or backgrounds to enhance realism, convey movement, or achieve various
    * stylistic appearances.
    * 
    * A Displacement effect is added to a Game Object via the FX component:
    * 
    * ```js
    * const sprite = this.add.sprite();
    * 
    * sprite.preFX.addDisplacement();
    * sprite.postFX.addDisplacement();
    * ```
    */
  @JSGlobal("Phaser.FX.Displacement")
  @js.native
  open class Displacement protected ()
    extends StObject
       with typings.phaser.Phaser.FX.Displacement {
    /**
      * 
      * @param gameObject A reference to the Game Object that has this fx.
      * @param texture The unique string-based key of the texture to use for displacement, which must exist in the Texture Manager. Default '__WHITE'.
      * @param x The amount of horizontal displacement to apply. A very small float number, such as 0.005. Default 0.005.
      * @param y The amount of vertical displacement to apply. A very small float number, such as 0.005. Default 0.005.
      */
    def this(gameObject: GameObject) = this()
    def this(gameObject: GameObject, texture: String) = this()
    def this(gameObject: GameObject, texture: String, x: Double) = this()
    def this(gameObject: GameObject, texture: Unit, x: Double) = this()
    def this(gameObject: GameObject, texture: String, x: Double, y: Double) = this()
    def this(gameObject: GameObject, texture: String, x: Unit, y: Double) = this()
    def this(gameObject: GameObject, texture: Unit, x: Double, y: Double) = this()
    def this(gameObject: GameObject, texture: Unit, x: Unit, y: Double) = this()
    
    /**
      * Toggle this boolean to enable or disable this effect,
      * without removing and adding it from the Game Object.
      * 
      * Only works for Pre FX.
      * 
      * Post FX are always active.
      */
    /* CompleteClass */
    var active: Boolean = js.native
    
    /**
      * Destroys this FX Controller.
      */
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /**
      * A reference to the Game Object that owns this effect.
      */
    /* CompleteClass */
    var gameObject: GameObject = js.native
    
    /**
      * The underlying WebGLTexture used for displacement.
      */
    /* CompleteClass */
    var glTexture: WebGLTexture = js.native
    
    /**
      * Sets the active state of this FX Controller.
      * 
      * A disabled FX Controller will not be updated.
      * @param value `true` to enable this FX Controller, or `false` to disable it.
      */
    /* CompleteClass */
    override def setActive(value: Boolean): this.type = js.native
    
    /**
      * The FX_CONST type of this effect.
      */
    /* CompleteClass */
    var `type`: Double = js.native
    
    /**
      * The amount of horizontal displacement to apply.
      */
    /* CompleteClass */
    var x: Double = js.native
    
    /**
      * The amount of vertical displacement to apply.
      */
    /* CompleteClass */
    var y: Double = js.native
  }
  
  /**
    * The Glow FX.
    */
  @JSGlobal("Phaser.FX.GLOW")
  @js.native
  val GLOW_ : Double = js.native
  
  /**
    * The Gradient FX.
    */
  @JSGlobal("Phaser.FX.GRADIENT")
  @js.native
  val GRADIENT_ : Double = js.native
  
  /**
    * The Glow FX Controller.
    * 
    * This FX controller manages the glow effect for a Game Object.
    * 
    * The glow effect is a visual technique that creates a soft, luminous halo around game objects,
    * characters, or UI elements. This effect is used to emphasize importance, enhance visual appeal,
    * or convey a sense of energy, magic, or otherworldly presence. The effect can also be set on
    * the inside of the Game Object. The color and strength of the glow can be modified.
    * 
    * A Glow effect is added to a Game Object via the FX component:
    * 
    * ```js
    * const sprite = this.add.sprite();
    * 
    * sprite.preFX.addGlow();
    * sprite.postFX.addGlow();
    * ```
    */
  @JSGlobal("Phaser.FX.Glow")
  @js.native
  open class Glow protected ()
    extends StObject
       with typings.phaser.Phaser.FX.Glow {
    /**
      * 
      * @param gameObject A reference to the Game Object that has this fx.
      * @param color The color of the glow effect as a number value. Default 0xffffff.
      * @param outerStrength The strength of the glow outward from the edge of the Sprite. Default 4.
      * @param innerStrength The strength of the glow inward from the edge of the Sprite. Default 0.
      * @param knockout If `true` only the glow is drawn, not the texture itself. Default false.
      */
    def this(gameObject: GameObject) = this()
    def this(gameObject: GameObject, color: Double) = this()
    def this(gameObject: GameObject, color: Double, outerStrength: Double) = this()
    def this(gameObject: GameObject, color: Unit, outerStrength: Double) = this()
    def this(gameObject: GameObject, color: Double, outerStrength: Double, innerStrength: Double) = this()
    def this(gameObject: GameObject, color: Double, outerStrength: Unit, innerStrength: Double) = this()
    def this(gameObject: GameObject, color: Unit, outerStrength: Double, innerStrength: Double) = this()
    def this(gameObject: GameObject, color: Unit, outerStrength: Unit, innerStrength: Double) = this()
    def this(
      gameObject: GameObject,
      color: Double,
      outerStrength: Double,
      innerStrength: Double,
      knockout: Boolean
    ) = this()
    def this(
      gameObject: GameObject,
      color: Double,
      outerStrength: Double,
      innerStrength: Unit,
      knockout: Boolean
    ) = this()
    def this(
      gameObject: GameObject,
      color: Double,
      outerStrength: Unit,
      innerStrength: Double,
      knockout: Boolean
    ) = this()
    def this(gameObject: GameObject, color: Double, outerStrength: Unit, innerStrength: Unit, knockout: Boolean) = this()
    def this(
      gameObject: GameObject,
      color: Unit,
      outerStrength: Double,
      innerStrength: Double,
      knockout: Boolean
    ) = this()
    def this(gameObject: GameObject, color: Unit, outerStrength: Double, innerStrength: Unit, knockout: Boolean) = this()
    def this(gameObject: GameObject, color: Unit, outerStrength: Unit, innerStrength: Double, knockout: Boolean) = this()
    def this(gameObject: GameObject, color: Unit, outerStrength: Unit, innerStrength: Unit, knockout: Boolean) = this()
    
    /**
      * Toggle this boolean to enable or disable this effect,
      * without removing and adding it from the Game Object.
      * 
      * Only works for Pre FX.
      * 
      * Post FX are always active.
      */
    /* CompleteClass */
    var active: Boolean = js.native
    
    /**
      * The color of the glow as a number value.
      */
    /* CompleteClass */
    var color: Double = js.native
    
    /**
      * Destroys this FX Controller.
      */
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /**
      * A reference to the Game Object that owns this effect.
      */
    /* CompleteClass */
    var gameObject: GameObject = js.native
    
    /**
      * A 4 element array of gl color values.
      */
    /* CompleteClass */
    var glcolor: js.Array[Double] = js.native
    
    /**
      * The strength of the glow inward from the edge of the Sprite.
      */
    /* CompleteClass */
    var innerStrength: Double = js.native
    
    /**
      * If `true` only the glow is drawn, not the texture itself.
      */
    /* CompleteClass */
    var knockout: Double = js.native
    
    /**
      * The strength of the glow outward from the edge of the Sprite.
      */
    /* CompleteClass */
    var outerStrength: Double = js.native
    
    /**
      * Sets the active state of this FX Controller.
      * 
      * A disabled FX Controller will not be updated.
      * @param value `true` to enable this FX Controller, or `false` to disable it.
      */
    /* CompleteClass */
    override def setActive(value: Boolean): this.type = js.native
    
    /**
      * The FX_CONST type of this effect.
      */
    /* CompleteClass */
    var `type`: Double = js.native
  }
  
  /**
    * The Gradient FX Controller.
    * 
    * This FX controller manages the gradient effect for a Game Object.
    * 
    * The gradient overlay effect is a visual technique where a smooth color transition is applied over Game Objects,
    * such as sprites or UI components. This effect is used to enhance visual appeal, emphasize depth, or create
    * stylistic and atmospheric variations. It can also be utilized to convey information, such as representing
    * progress or health status through color changes.
    * 
    * A Gradient effect is added to a Game Object via the FX component:
    * 
    * ```js
    * const sprite = this.add.sprite();
    * 
    * sprite.preFX.addGradient();
    * sprite.postFX.addGradient();
    * ```
    */
  @JSGlobal("Phaser.FX.Gradient")
  @js.native
  open class Gradient protected ()
    extends StObject
       with typings.phaser.Phaser.FX.Gradient {
    /**
      * 
      * @param gameObject A reference to the Game Object that has this fx.
      * @param color1 The first gradient color, given as a number value. Default 0xff0000.
      * @param color2 The second gradient color, given as a number value. Default 0x00ff00.
      * @param alpha The alpha value of the gradient effect. Default 0.2.
      * @param fromX The horizontal position the gradient will start from. This value is noralized, between 0 and 1 and is not in pixels. Default 0.
      * @param fromY The vertical position the gradient will start from. This value is noralized, between 0 and 1 and is not in pixels. Default 0.
      * @param toX The horizontal position the gradient will end at. This value is noralized, between 0 and 1 and is not in pixels. Default 0.
      * @param toY The vertical position the gradient will end at. This value is noralized, between 0 and 1 and is not in pixels. Default 1.
      * @param size How many 'chunks' the gradient is divided in to, as spread over the entire height of the texture. Leave this at zero for a smooth gradient, or set higher for a more retro chunky effect. Default 0.
      */
    def this(
      gameObject: GameObject,
      color1: js.UndefOr[Double],
      color2: js.UndefOr[Double],
      alpha: js.UndefOr[Double],
      fromX: js.UndefOr[Double],
      fromY: js.UndefOr[Double],
      toX: js.UndefOr[Double],
      toY: js.UndefOr[Double],
      size: js.UndefOr[Double]
    ) = this()
    
    /**
      * Toggle this boolean to enable or disable this effect,
      * without removing and adding it from the Game Object.
      * 
      * Only works for Pre FX.
      * 
      * Post FX are always active.
      */
    /* CompleteClass */
    var active: Boolean = js.native
    
    /**
      * The alpha value of the gradient effect.
      */
    /* CompleteClass */
    var alpha: Double = js.native
    
    /**
      * The first gradient color, given as a number value.
      */
    /* CompleteClass */
    var color1: Double = js.native
    
    /**
      * The second gradient color, given as a number value.
      */
    /* CompleteClass */
    var color2: Double = js.native
    
    /**
      * Destroys this FX Controller.
      */
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /**
      * The horizontal position the gradient will start from. This value is noralized, between 0 and 1 and is not in pixels.
      */
    /* CompleteClass */
    var fromX: Double = js.native
    
    /**
      * The vertical position the gradient will start from. This value is noralized, between 0 and 1 and is not in pixels.
      */
    /* CompleteClass */
    var fromY: Double = js.native
    
    /**
      * A reference to the Game Object that owns this effect.
      */
    /* CompleteClass */
    var gameObject: GameObject = js.native
    
    /**
      * The internal gl color array for the starting color.
      */
    /* CompleteClass */
    var glcolor1: js.Array[Double] = js.native
    
    /**
      * The internal gl color array for the ending color.
      */
    /* CompleteClass */
    var glcolor2: js.Array[Double] = js.native
    
    /**
      * Sets the active state of this FX Controller.
      * 
      * A disabled FX Controller will not be updated.
      * @param value `true` to enable this FX Controller, or `false` to disable it.
      */
    /* CompleteClass */
    override def setActive(value: Boolean): this.type = js.native
    
    /**
      * Sets how many 'chunks' the gradient is divided in to, as spread over the
      * entire height of the texture. Leave this at zero for a smooth gradient,
      * or set to a higher number to split the gradient into that many sections, giving
      * a more banded 'retro' effect.
      */
    /* CompleteClass */
    var size: Double = js.native
    
    /**
      * The horizontal position the gradient will end. This value is noralized, between 0 and 1 and is not in pixels.
      */
    /* CompleteClass */
    var toX: Double = js.native
    
    /**
      * The vertical position the gradient will end. This value is noralized, between 0 and 1 and is not in pixels.
      */
    /* CompleteClass */
    var toY: Double = js.native
    
    /**
      * The FX_CONST type of this effect.
      */
    /* CompleteClass */
    var `type`: Double = js.native
  }
  
  /**
    * The Pixelate FX.
    */
  @JSGlobal("Phaser.FX.PIXELATE")
  @js.native
  val PIXELATE_ : Double = js.native
  
  /**
    * The Pixelate FX Controller.
    * 
    * This FX controller manages the pixelate effect for a Game Object.
    * 
    * The pixelate effect is a visual technique that deliberately reduces the resolution or detail of an image,
    * creating a blocky or mosaic appearance composed of large, visible pixels. This effect can be used for stylistic
    * purposes, as a homage to retro gaming, or as a means to obscure certain elements within the game, such as
    * during a transition or to censor specific content.
    * 
    * A Pixelate effect is added to a Game Object via the FX component:
    * 
    * ```js
    * const sprite = this.add.sprite();
    * 
    * sprite.preFX.addPixelate();
    * sprite.postFX.addPixelate();
    * ```
    */
  @JSGlobal("Phaser.FX.Pixelate")
  @js.native
  open class Pixelate protected ()
    extends StObject
       with typings.phaser.Phaser.FX.Pixelate {
    /**
      * 
      * @param gameObject A reference to the Game Object that has this fx.
      * @param amount The amount of pixelation to apply. Default 1.
      */
    def this(gameObject: GameObject) = this()
    def this(gameObject: GameObject, amount: Double) = this()
    
    /**
      * Toggle this boolean to enable or disable this effect,
      * without removing and adding it from the Game Object.
      * 
      * Only works for Pre FX.
      * 
      * Post FX are always active.
      */
    /* CompleteClass */
    var active: Boolean = js.native
    
    /**
      * The amount of pixelation to apply.
      */
    /* CompleteClass */
    var amount: Double = js.native
    
    /**
      * Destroys this FX Controller.
      */
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /**
      * A reference to the Game Object that owns this effect.
      */
    /* CompleteClass */
    var gameObject: GameObject = js.native
    
    /**
      * Sets the active state of this FX Controller.
      * 
      * A disabled FX Controller will not be updated.
      * @param value `true` to enable this FX Controller, or `false` to disable it.
      */
    /* CompleteClass */
    override def setActive(value: Boolean): this.type = js.native
    
    /**
      * The FX_CONST type of this effect.
      */
    /* CompleteClass */
    var `type`: Double = js.native
  }
  
  /**
    * The Shadow FX.
    */
  @JSGlobal("Phaser.FX.SHADOW")
  @js.native
  val SHADOW_ : Double = js.native
  
  /**
    * The Shine FX.
    */
  @JSGlobal("Phaser.FX.SHINE")
  @js.native
  val SHINE_ : Double = js.native
  
  /**
    * The Shadow FX Controller.
    * 
    * This FX controller manages the shadow effect for a Game Object.
    * 
    * The shadow effect is a visual technique used to create the illusion of depth and realism by adding darker,
    * offset silhouettes or shapes beneath game objects, characters, or environments. These simulated shadows
    * help to enhance the visual appeal and immersion, making the 2D game world appear more dynamic and three-dimensional.
    * 
    * A Shadow effect is added to a Game Object via the FX component:
    * 
    * ```js
    * const sprite = this.add.sprite();
    * 
    * sprite.preFX.addShadow();
    * sprite.postFX.addShadow();
    * ```
    */
  @JSGlobal("Phaser.FX.Shadow")
  @js.native
  open class Shadow protected ()
    extends StObject
       with typings.phaser.Phaser.FX.Shadow {
    /**
      * 
      * @param gameObject A reference to the Game Object that has this fx.
      * @param x The horizontal offset of the shadow effect. Default 0.
      * @param y The vertical offset of the shadow effect. Default 0.
      * @param decay The amount of decay for shadow effect. Default 0.1.
      * @param power The power of the shadow effect. Default 1.
      * @param color The color of the shadow. Default 0x000000.
      * @param samples The number of samples that the shadow effect will run for. An integer between 1 and 12. Default 6.
      * @param intensity The intensity of the shadow effect. Default 1.
      */
    def this(
      gameObject: GameObject,
      x: js.UndefOr[Double],
      y: js.UndefOr[Double],
      decay: js.UndefOr[Double],
      power: js.UndefOr[Double],
      color: js.UndefOr[Double],
      samples: js.UndefOr[Double],
      intensity: js.UndefOr[Double]
    ) = this()
    
    /**
      * Toggle this boolean to enable or disable this effect,
      * without removing and adding it from the Game Object.
      * 
      * Only works for Pre FX.
      * 
      * Post FX are always active.
      */
    /* CompleteClass */
    var active: Boolean = js.native
    
    /**
      * The color of the shadow.
      */
    /* CompleteClass */
    var color: Double = js.native
    
    /**
      * The amount of decay for the shadow effect.
      */
    /* CompleteClass */
    var decay: Double = js.native
    
    /**
      * Destroys this FX Controller.
      */
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /**
      * A reference to the Game Object that owns this effect.
      */
    /* CompleteClass */
    var gameObject: GameObject = js.native
    
    /**
      * The internal gl color array.
      */
    /* CompleteClass */
    var glcolor: js.Array[Double] = js.native
    
    /**
      * The intensity of the shadow effect.
      */
    /* CompleteClass */
    var intensity: Double = js.native
    
    /**
      * The power of the shadow effect.
      */
    /* CompleteClass */
    var power: Double = js.native
    
    /**
      * The number of samples that the shadow effect will run for.
      * 
      * This should be an integer with a minimum value of 1 and a maximum of 12.
      */
    /* CompleteClass */
    var samples: Double = js.native
    
    /**
      * Sets the active state of this FX Controller.
      * 
      * A disabled FX Controller will not be updated.
      * @param value `true` to enable this FX Controller, or `false` to disable it.
      */
    /* CompleteClass */
    override def setActive(value: Boolean): this.type = js.native
    
    /**
      * The FX_CONST type of this effect.
      */
    /* CompleteClass */
    var `type`: Double = js.native
    
    /**
      * The horizontal offset of the shadow effect.
      */
    /* CompleteClass */
    var x: Double = js.native
    
    /**
      * The vertical offset of the shadow effect.
      */
    /* CompleteClass */
    var y: Double = js.native
  }
  
  /**
    * The Shine FX Controller.
    * 
    * This FX controller manages the shift effect for a Game Object.
    * 
    * The shine effect is a visual technique that simulates the appearance of reflective
    * or glossy surfaces by passing a light beam across a Game Object. This effect is used to
    * enhance visual appeal, emphasize certain features, and create a sense of depth or
    * material properties.
    * 
    * A Shine effect is added to a Game Object via the FX component:
    * 
    * ```js
    * const sprite = this.add.sprite();
    * 
    * sprite.preFX.addShine();
    * sprite.postFX.addShine();
    * ```
    */
  @JSGlobal("Phaser.FX.Shine")
  @js.native
  open class Shine protected ()
    extends StObject
       with typings.phaser.Phaser.FX.Shine {
    /**
      * 
      * @param gameObject A reference to the Game Object that has this fx.
      * @param speed The speed of the Shine effect. Default 0.5.
      * @param lineWidth The line width of the Shine effect. Default 0.5.
      * @param gradient The gradient of the Shine effect. Default 3.
      * @param reveal Does this Shine effect reveal or get added to its target? Default false.
      */
    def this(gameObject: GameObject) = this()
    def this(gameObject: GameObject, speed: Double) = this()
    def this(gameObject: GameObject, speed: Double, lineWidth: Double) = this()
    def this(gameObject: GameObject, speed: Unit, lineWidth: Double) = this()
    def this(gameObject: GameObject, speed: Double, lineWidth: Double, gradient: Double) = this()
    def this(gameObject: GameObject, speed: Double, lineWidth: Unit, gradient: Double) = this()
    def this(gameObject: GameObject, speed: Unit, lineWidth: Double, gradient: Double) = this()
    def this(gameObject: GameObject, speed: Unit, lineWidth: Unit, gradient: Double) = this()
    def this(gameObject: GameObject, speed: Double, lineWidth: Double, gradient: Double, reveal: Boolean) = this()
    def this(gameObject: GameObject, speed: Double, lineWidth: Double, gradient: Unit, reveal: Boolean) = this()
    def this(gameObject: GameObject, speed: Double, lineWidth: Unit, gradient: Double, reveal: Boolean) = this()
    def this(gameObject: GameObject, speed: Double, lineWidth: Unit, gradient: Unit, reveal: Boolean) = this()
    def this(gameObject: GameObject, speed: Unit, lineWidth: Double, gradient: Double, reveal: Boolean) = this()
    def this(gameObject: GameObject, speed: Unit, lineWidth: Double, gradient: Unit, reveal: Boolean) = this()
    def this(gameObject: GameObject, speed: Unit, lineWidth: Unit, gradient: Double, reveal: Boolean) = this()
    def this(gameObject: GameObject, speed: Unit, lineWidth: Unit, gradient: Unit, reveal: Boolean) = this()
    
    /**
      * Toggle this boolean to enable or disable this effect,
      * without removing and adding it from the Game Object.
      * 
      * Only works for Pre FX.
      * 
      * Post FX are always active.
      */
    /* CompleteClass */
    var active: Boolean = js.native
    
    /**
      * Destroys this FX Controller.
      */
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /**
      * A reference to the Game Object that owns this effect.
      */
    /* CompleteClass */
    var gameObject: GameObject = js.native
    
    /**
      * The gradient of the Shine effect.
      */
    /* CompleteClass */
    var gradient: Double = js.native
    
    /**
      * The line width of the Shine effect.
      */
    /* CompleteClass */
    var lineWidth: Double = js.native
    
    /**
      * Does this Shine effect reveal or get added to its target?
      */
    /* CompleteClass */
    var reveal: Boolean = js.native
    
    /**
      * Sets the active state of this FX Controller.
      * 
      * A disabled FX Controller will not be updated.
      * @param value `true` to enable this FX Controller, or `false` to disable it.
      */
    /* CompleteClass */
    override def setActive(value: Boolean): this.type = js.native
    
    /**
      * The speed of the Shine effect.
      */
    /* CompleteClass */
    var speed: Double = js.native
    
    /**
      * The FX_CONST type of this effect.
      */
    /* CompleteClass */
    var `type`: Double = js.native
  }
  
  /**
    * The Vignette FX.
    */
  @JSGlobal("Phaser.FX.VIGNETTE")
  @js.native
  val VIGNETTE_ : Double = js.native
  
  /**
    * The Vignette FX Controller.
    * 
    * This FX controller manages the vignette effect for a Game Object.
    * 
    * The vignette effect is a visual technique where the edges of the screen, or a Game Object, gradually darken or blur,
    * creating a frame-like appearance. This effect is used to draw the player's focus towards the central action or subject,
    * enhance immersion, and provide a cinematic or artistic quality to the game's visuals.
    * 
    * A Vignette effect is added to a Game Object via the FX component:
    * 
    * ```js
    * const sprite = this.add.sprite();
    * 
    * sprite.preFX.addVignette();
    * sprite.postFX.addVignette();
    * ```
    */
  @JSGlobal("Phaser.FX.Vignette")
  @js.native
  open class Vignette protected ()
    extends StObject
       with typings.phaser.Phaser.FX.Vignette {
    /**
      * 
      * @param gameObject A reference to the Game Object that has this fx.
      * @param x The horizontal offset of the vignette effect. This value is normalized to the range 0 to 1. Default 0.5.
      * @param y The vertical offset of the vignette effect. This value is normalized to the range 0 to 1. Default 0.5.
      * @param radius The radius of the vignette effect. This value is normalized to the range 0 to 1. Default 0.5.
      * @param strength The strength of the vignette effect. Default 0.5.
      */
    def this(gameObject: GameObject) = this()
    def this(gameObject: GameObject, x: Double) = this()
    def this(gameObject: GameObject, x: Double, y: Double) = this()
    def this(gameObject: GameObject, x: Unit, y: Double) = this()
    def this(gameObject: GameObject, x: Double, y: Double, radius: Double) = this()
    def this(gameObject: GameObject, x: Double, y: Unit, radius: Double) = this()
    def this(gameObject: GameObject, x: Unit, y: Double, radius: Double) = this()
    def this(gameObject: GameObject, x: Unit, y: Unit, radius: Double) = this()
    def this(gameObject: GameObject, x: Double, y: Double, radius: Double, strength: Double) = this()
    def this(gameObject: GameObject, x: Double, y: Double, radius: Unit, strength: Double) = this()
    def this(gameObject: GameObject, x: Double, y: Unit, radius: Double, strength: Double) = this()
    def this(gameObject: GameObject, x: Double, y: Unit, radius: Unit, strength: Double) = this()
    def this(gameObject: GameObject, x: Unit, y: Double, radius: Double, strength: Double) = this()
    def this(gameObject: GameObject, x: Unit, y: Double, radius: Unit, strength: Double) = this()
    def this(gameObject: GameObject, x: Unit, y: Unit, radius: Double, strength: Double) = this()
    def this(gameObject: GameObject, x: Unit, y: Unit, radius: Unit, strength: Double) = this()
    
    /**
      * Toggle this boolean to enable or disable this effect,
      * without removing and adding it from the Game Object.
      * 
      * Only works for Pre FX.
      * 
      * Post FX are always active.
      */
    /* CompleteClass */
    var active: Boolean = js.native
    
    /**
      * Destroys this FX Controller.
      */
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /**
      * A reference to the Game Object that owns this effect.
      */
    /* CompleteClass */
    var gameObject: GameObject = js.native
    
    /**
      * The radius of the vignette effect. This value is normalized to the range 0 to 1.
      */
    /* CompleteClass */
    var radius: Double = js.native
    
    /**
      * Sets the active state of this FX Controller.
      * 
      * A disabled FX Controller will not be updated.
      * @param value `true` to enable this FX Controller, or `false` to disable it.
      */
    /* CompleteClass */
    override def setActive(value: Boolean): this.type = js.native
    
    /**
      * The strength of the vignette effect.
      */
    /* CompleteClass */
    var strength: Double = js.native
    
    /**
      * The FX_CONST type of this effect.
      */
    /* CompleteClass */
    var `type`: Double = js.native
    
    /**
      * The horizontal offset of the vignette effect. This value is normalized to the range 0 to 1.
      */
    /* CompleteClass */
    var x: Double = js.native
    
    /**
      * The vertical offset of the vignette effect. This value is normalized to the range 0 to 1.
      */
    /* CompleteClass */
    var y: Double = js.native
  }
  
  /**
    * The Wipe FX.
    */
  @JSGlobal("Phaser.FX.WIPE")
  @js.native
  val WIPE_ : Double = js.native
  
  /**
    * The Wipe FX Controller.
    * 
    * This FX controller manages the wipe effect for a Game Object.
    * 
    * The wipe or reveal effect is a visual technique that gradually uncovers or conceals elements
    * in the game, such as images, text, or scene transitions. This effect is often used to create
    * a sense of progression, reveal hidden content, or provide a smooth and visually appealing transition
    * between game states.
    * 
    * You can set both the direction and the axis of the wipe effect. The following combinations are possible:
    * 
    * * left to right: direction 0, axis 0
    * * right to left: direction 1, axis 0
    * * top to bottom: direction 1, axis 1
    * * bottom to top: direction 1, axis 0
    * 
    * It is up to you to set the `progress` value yourself, i.e. via a Tween, in order to transition the effect.
    * 
    * A Wipe effect is added to a Game Object via the FX component:
    * 
    * ```js
    * const sprite = this.add.sprite();
    * 
    * sprite.preFX.addWipe();
    * sprite.postFX.addWipe();
    * sprite.preFX.addReveal();
    * sprite.postFX.addReveal();
    * ```
    */
  @JSGlobal("Phaser.FX.Wipe")
  @js.native
  open class Wipe protected ()
    extends StObject
       with typings.phaser.Phaser.FX.Wipe {
    /**
      * 
      * @param gameObject A reference to the Game Object that has this fx.
      * @param wipeWidth The width of the wipe effect. This value is normalized in the range 0 to 1. Default 0.1.
      * @param direction The direction of the wipe effect. Either 0 or 1. Set in conjunction with the axis property. Default 0.
      * @param axis The axis of the wipe effect. Either 0 or 1. Set in conjunction with the direction property. Default 0.
      * @param reveal Is this a reveal (true) or a fade (false) effect? Default false.
      */
    def this(gameObject: GameObject) = this()
    def this(gameObject: GameObject, wipeWidth: Double) = this()
    def this(gameObject: GameObject, wipeWidth: Double, direction: Double) = this()
    def this(gameObject: GameObject, wipeWidth: Unit, direction: Double) = this()
    def this(gameObject: GameObject, wipeWidth: Double, direction: Double, axis: Double) = this()
    def this(gameObject: GameObject, wipeWidth: Double, direction: Unit, axis: Double) = this()
    def this(gameObject: GameObject, wipeWidth: Unit, direction: Double, axis: Double) = this()
    def this(gameObject: GameObject, wipeWidth: Unit, direction: Unit, axis: Double) = this()
    def this(gameObject: GameObject, wipeWidth: Double, direction: Double, axis: Double, reveal: Boolean) = this()
    def this(gameObject: GameObject, wipeWidth: Double, direction: Double, axis: Unit, reveal: Boolean) = this()
    def this(gameObject: GameObject, wipeWidth: Double, direction: Unit, axis: Double, reveal: Boolean) = this()
    def this(gameObject: GameObject, wipeWidth: Double, direction: Unit, axis: Unit, reveal: Boolean) = this()
    def this(gameObject: GameObject, wipeWidth: Unit, direction: Double, axis: Double, reveal: Boolean) = this()
    def this(gameObject: GameObject, wipeWidth: Unit, direction: Double, axis: Unit, reveal: Boolean) = this()
    def this(gameObject: GameObject, wipeWidth: Unit, direction: Unit, axis: Double, reveal: Boolean) = this()
    def this(gameObject: GameObject, wipeWidth: Unit, direction: Unit, axis: Unit, reveal: Boolean) = this()
    
    /**
      * Toggle this boolean to enable or disable this effect,
      * without removing and adding it from the Game Object.
      * 
      * Only works for Pre FX.
      * 
      * Post FX are always active.
      */
    /* CompleteClass */
    var active: Boolean = js.native
    
    /**
      * The axis of the wipe effect. Either 0 or 1. Set in conjunction with the direction property.
      */
    /* CompleteClass */
    var axis: Double = js.native
    
    /**
      * Destroys this FX Controller.
      */
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /**
      * The direction of the wipe effect. Either 0 or 1. Set in conjunction with the axis property.
      */
    /* CompleteClass */
    var direction: Double = js.native
    
    /**
      * A reference to the Game Object that owns this effect.
      */
    /* CompleteClass */
    var gameObject: GameObject = js.native
    
    /**
      * The progress of the Wipe effect. This value is normalized to the range 0 to 1.
      * 
      * Adjust this value to make the wipe transition (i.e. via a Tween)
      */
    /* CompleteClass */
    var progress: Double = js.native
    
    /**
      * Is this a reveal (true) or a fade (false) effect?
      */
    /* CompleteClass */
    var reveal: Boolean = js.native
    
    /**
      * Sets the active state of this FX Controller.
      * 
      * A disabled FX Controller will not be updated.
      * @param value `true` to enable this FX Controller, or `false` to disable it.
      */
    /* CompleteClass */
    override def setActive(value: Boolean): this.type = js.native
    
    /**
      * The FX_CONST type of this effect.
      */
    /* CompleteClass */
    var `type`: Double = js.native
    
    /**
      * The width of the wipe effect. This value is normalized in the range 0 to 1.
      */
    /* CompleteClass */
    var wipeWidth: Double = js.native
  }
}
