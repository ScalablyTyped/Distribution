package typings.phaser.Phaser

import typings.phaser.Phaser.Cameras.Scene2D.Camera
import typings.phaser.Phaser.GameObjects.GameObject
import typings.phaser.Phaser.GameObjects.Graphics
import typings.phaser.Phaser.Renderer.Canvas.CanvasRenderer
import typings.phaser.Phaser.Renderer.WebGL.WebGLRenderer
import typings.phaser.Phaser.Types.Display.InputColorObject
import typings.std.WebGLFramebuffer
import typings.std.WebGLTexture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Display {
  
  /**
    * A BaseShader is a small resource class that contains the data required for a WebGL Shader to be created.
    * 
    * It contains the raw source code to the fragment and vertex shader, as well as an object that defines
    * the uniforms the shader requires, if any.
    * 
    * BaseShaders are stored in the Shader Cache, available in a Scene via `this.cache.shaders` and are referenced
    * by a unique key-based string. Retrieve them via `this.cache.shaders.get(key)`.
    * 
    * BaseShaders are created automatically by the GLSL File Loader when loading an external shader resource.
    * They can also be created at runtime, allowing you to use dynamically generated shader source code.
    * 
    * Default fragment and vertex source is used if not provided in the constructor, setting-up a basic shader,
    * suitable for debug rendering.
    */
  trait BaseShader extends StObject {
    
    /**
      * The source code, as a string, of the fragment shader being used.
      */
    var fragmentSrc: String
    
    /**
      * The key of this shader, unique within the shader cache of this Phaser game instance.
      */
    var key: String
    
    /**
      * The default uniforms for this shader.
      */
    var uniforms: Any
    
    /**
      * The source code, as a string, of the vertex shader being used.
      */
    var vertexSrc: String
  }
  object BaseShader {
    
    inline def apply(fragmentSrc: String, key: String, uniforms: Any, vertexSrc: String): BaseShader = {
      val __obj = js.Dynamic.literal(fragmentSrc = fragmentSrc.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], uniforms = uniforms.asInstanceOf[js.Any], vertexSrc = vertexSrc.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseShader]
    }
    
    extension [Self <: BaseShader](x: Self) {
      
      inline def setFragmentSrc(value: String): Self = StObject.set(x, "fragmentSrc", value.asInstanceOf[js.Any])
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setUniforms(value: Any): Self = StObject.set(x, "uniforms", value.asInstanceOf[js.Any])
      
      inline def setVertexSrc(value: String): Self = StObject.set(x, "vertexSrc", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * The Color class holds a single color value and allows for easy modification and reading of it.
    */
  @js.native
  trait Color extends StObject {
    
    /**
      * The alpha color value, normalized to the range 0 to 255.
      */
    var alpha: Double = js.native
    
    /**
      * The alpha color value, normalized to the range 0 to 1.
      */
    var alphaGL: Double = js.native
    
    /**
      * The blue color value, normalized to the range 0 to 255.
      */
    var blue: Double = js.native
    
    /**
      * The blue color value, normalized to the range 0 to 1.
      */
    var blueGL: Double = js.native
    
    /**
      * Brighten this Color by the percentage amount given.
      * @param amount The percentage amount to change this color by. A value between 0 and 100.
      */
    def brighten(amount: Double): Color = js.native
    
    /**
      * The color of this Color component, not including the alpha channel.
      */
    val color: Double = js.native
    
    /**
      * The color of this Color component, including the alpha channel.
      */
    val color32: Double = js.native
    
    /**
      * Decrease the lightness of this Color by the percentage amount given.
      * @param amount The percentage amount to change this color by. A value between 0 and 100.
      */
    def darken(amount: Double): Color = js.native
    
    /**
      * Decrease the saturation of this Color by the percentage amount given.
      * The saturation is the amount of the base color in the hue.
      * @param amount The percentage amount to change this color by. A value between 0 and 100.
      */
    def desaturate(amount: Double): Color = js.native
    
    /**
      * An array containing the calculated color values for WebGL use.
      */
    var gl: js.Array[Double] = js.native
    
    /**
      * Sets this Color object to be grayscaled based on the shade value given.
      * @param shade A value between 0 and 255.
      */
    def gray(shade: Double): Color = js.native
    
    /**
      * The green color value, normalized to the range 0 to 255.
      */
    var green: Double = js.native
    
    /**
      * The green color value, normalized to the range 0 to 1.
      */
    var greenGL: Double = js.native
    
    /**
      * The hue color value. A number between 0 and 1.
      * This is the base color.
      */
    var h: Double = js.native
    
    /**
      * Increase the lightness of this Color by the percentage amount given.
      * @param amount The percentage amount to change this color by. A value between 0 and 100.
      */
    def lighten(amount: Double): Color = js.native
    
    /**
      * Sets this Color object to be a random color between the `min` and `max` values given.
      * @param min The minimum random color value. Between 0 and 255. Default 0.
      * @param max The maximum random color value. Between 0 and 255. Default 255.
      */
    def random(): Color = js.native
    def random(min: Double): Color = js.native
    def random(min: Double, max: Double): Color = js.native
    def random(min: Unit, max: Double): Color = js.native
    
    /**
      * Sets this Color object to be a random grayscale color between the `min` and `max` values given.
      * @param min The minimum random color value. Between 0 and 255. Default 0.
      * @param max The maximum random color value. Between 0 and 255. Default 255.
      */
    def randomGray(): Color = js.native
    def randomGray(min: Double): Color = js.native
    def randomGray(min: Double, max: Double): Color = js.native
    def randomGray(min: Unit, max: Double): Color = js.native
    
    /**
      * The red color value, normalized to the range 0 to 255.
      */
    var red: Double = js.native
    
    /**
      * The red color value, normalized to the range 0 to 1.
      */
    var redGL: Double = js.native
    
    /**
      * The color of this Color component as a string which can be used in CSS color values.
      */
    val rgba: String = js.native
    
    /**
      * The saturation color value. A number between 0 and 1.
      * This controls how much of the hue will be in the final color, where 1 is fully saturated and 0 will give you white.
      */
    var s: Double = js.native
    
    /**
      * Increase the saturation of this Color by the percentage amount given.
      * The saturation is the amount of the base color in the hue.
      * @param amount The percentage amount to change this color by. A value between 0 and 100.
      */
    def saturate(amount: Double): Color = js.native
    
    /**
      * Sets the color based on the hue, saturation and lightness values given.
      * @param h The hue, in the range 0 - 1. This is the base color.
      * @param s The saturation, in the range 0 - 1. This controls how much of the hue will be in the final color, where 1 is fully saturated and 0 will give you white.
      * @param v The value, in the range 0 - 1. This controls how dark the color is. Where 1 is as bright as possible and 0 is black.
      */
    def setFromHSV(h: Double, s: Double, v: Double): Color = js.native
    
    /**
      * Sets the color based on the color object given.
      * @param color An object containing `r`, `g`, `b` and optionally `a` values in the range 0 to 255.
      */
    def setFromRGB(color: InputColorObject): Color = js.native
    
    /**
      * Sets the red, green, blue and alpha GL values of this Color component.
      * @param red The red color value. A number between 0 and 1.
      * @param green The green color value. A number between 0 and 1.
      * @param blue The blue color value. A number between 0 and 1.
      * @param alpha The alpha value. A number between 0 and 1. Default 1.
      */
    def setGLTo(red: Double, green: Double, blue: Double): Color = js.native
    def setGLTo(red: Double, green: Double, blue: Double, alpha: Double): Color = js.native
    
    /**
      * Sets the color of this Color component.
      * @param red The red color value. A number between 0 and 255.
      * @param green The green color value. A number between 0 and 255.
      * @param blue The blue color value. A number between 0 and 255.
      * @param alpha The alpha value. A number between 0 and 255. Default 255.
      * @param updateHSV Update the HSV values after setting the RGB values? Default true.
      */
    def setTo(red: Double, green: Double, blue: Double): Color = js.native
    def setTo(red: Double, green: Double, blue: Double, alpha: Double): Color = js.native
    def setTo(red: Double, green: Double, blue: Double, alpha: Double, updateHSV: Boolean): Color = js.native
    def setTo(red: Double, green: Double, blue: Double, alpha: Unit, updateHSV: Boolean): Color = js.native
    
    /**
      * Sets this color to be transparent. Sets all values to zero.
      */
    def transparent(): Color = js.native
    
    /**
      * The lightness color value. A number between 0 and 1.
      * This controls how dark the color is. Where 1 is as bright as possible and 0 is black.
      */
    var v: Double = js.native
  }
  
  /**
    * The ColorMatrix class creates a 5x4 matrix that can be used in shaders and graphics
    * operations. It provides methods required to modify the color values, such as adjusting
    * the brightness, setting a sepia tone, hue rotation and more.
    * 
    * Use the method `getData` to return a Float32Array containing the current color values.
    */
  @js.native
  trait ColorMatrix extends StObject {
    
    /**
      * The value that determines how much of the original color is used
      * when mixing the colors. A value between 0 (all original) and 1 (all final)
      */
    var alpha: Double = js.native
    
    /**
      * Sets this ColorMatrix to be black and white.
      * @param multiply Multiply the resulting ColorMatrix (`true`), or set it (`false`) ? Default false.
      */
    def blackWhite(): this.type = js.native
    def blackWhite(multiply: Boolean): this.type = js.native
    
    /**
      * Changes the brightness of this ColorMatrix by the given amount.
      * @param value The amount of brightness to apply to this ColorMatrix. Between 0 (black) and 1. Default 0.
      * @param multiply Multiply the resulting ColorMatrix (`true`), or set it (`false`) ? Default false.
      */
    def brightness(): this.type = js.native
    def brightness(value: Double): this.type = js.native
    def brightness(value: Double, multiply: Boolean): this.type = js.native
    def brightness(value: Unit, multiply: Boolean): this.type = js.native
    
    /**
      * Applies a brown tone to this ColorMatrix.
      * @param multiply Multiply the resulting ColorMatrix (`true`), or set it (`false`) ? Default false.
      */
    def brown(): this.type = js.native
    def brown(multiply: Boolean): this.type = js.native
    
    /**
      * Change the contrast of this ColorMatrix by the amount given.
      * @param value The amount of contrast to apply to this ColorMatrix. Default 0.
      * @param multiply Multiply the resulting ColorMatrix (`true`), or set it (`false`) ? Default false.
      */
    def contrast(): this.type = js.native
    def contrast(value: Double): this.type = js.native
    def contrast(value: Double, multiply: Boolean): this.type = js.native
    def contrast(value: Unit, multiply: Boolean): this.type = js.native
    
    /**
      * Apply a desaturated luminance to this ColorMatrix.
      * @param multiply Multiply the resulting ColorMatrix (`true`), or set it (`false`) ? Default false.
      */
    def desaturateLuminance(): this.type = js.native
    def desaturateLuminance(multiply: Boolean): this.type = js.native
    
    /**
      * Gets the ColorMatrix as a Float32Array.
      * 
      * Can be used directly as a 1fv shader uniform value.
      */
    def getData(): js.typedarray.Float32Array = js.native
    
    /**
      * Sets this ColorMatrix to be grayscale.
      * @param value The grayscale scale (0 is black). Default 1.
      * @param multiply Multiply the resulting ColorMatrix (`true`), or set it (`false`) ? Default false.
      */
    def grayscale(): this.type = js.native
    def grayscale(value: Double): this.type = js.native
    def grayscale(value: Double, multiply: Boolean): this.type = js.native
    def grayscale(value: Unit, multiply: Boolean): this.type = js.native
    
    /**
      * Rotates the hues of this ColorMatrix by the value given.
      * @param rotation The amount of hue rotation to apply to this ColorMatrix, in degrees. Default 0.
      * @param multiply Multiply the resulting ColorMatrix (`true`), or set it (`false`) ? Default false.
      */
    def hue(): this.type = js.native
    def hue(rotation: Double): this.type = js.native
    def hue(rotation: Double, multiply: Boolean): this.type = js.native
    def hue(rotation: Unit, multiply: Boolean): this.type = js.native
    
    /**
      * Applies a kodachrome color effect to this ColorMatrix.
      * @param multiply Multiply the resulting ColorMatrix (`true`), or set it (`false`) ? Default false.
      */
    def kodachrome(): this.type = js.native
    def kodachrome(multiply: Boolean): this.type = js.native
    
    /**
      * Applies a trippy color tone to this ColorMatrix.
      * @param multiply Multiply the resulting ColorMatrix (`true`), or set it (`false`) ? Default false.
      */
    def lsd(): this.type = js.native
    def lsd(multiply: Boolean): this.type = js.native
    
    /**
      * Multiplies the two given matrices.
      * @param a The 5x4 array to multiply with ColorMatrix._matrix.
      */
    def multiply(a: js.Array[Double]): this.type = js.native
    
    /**
      * Converts this ColorMatrix to have negative values.
      * @param multiply Multiply the resulting ColorMatrix (`true`), or set it (`false`) ? Default false.
      */
    def negative(): this.type = js.native
    def negative(multiply: Boolean): this.type = js.native
    
    /**
      * Applies a night vision tone to this ColorMatrix.
      * @param intensity The intensity of this effect. Default 0.1.
      * @param multiply Multiply the resulting ColorMatrix (`true`), or set it (`false`) ? Default false.
      */
    def night(): this.type = js.native
    def night(intensity: Double): this.type = js.native
    def night(intensity: Double, multiply: Boolean): this.type = js.native
    def night(intensity: Unit, multiply: Boolean): this.type = js.native
    
    /**
      * Applies a polaroid color effect to this ColorMatrix.
      * @param multiply Multiply the resulting ColorMatrix (`true`), or set it (`false`) ? Default false.
      */
    def polaroid(): this.type = js.native
    def polaroid(multiply: Boolean): this.type = js.native
    
    /**
      * Resets the ColorMatrix.
      */
    def reset(): this.type = js.native
    
    /**
      * Changes the saturation of this ColorMatrix by the given amount.
      * @param value The amount of saturation to apply to this ColorMatrix. Default 0.
      * @param multiply Multiply the resulting ColorMatrix (`true`), or set it (`false`) ? Default false.
      */
    def saturate(): this.type = js.native
    def saturate(value: Double): this.type = js.native
    def saturate(value: Double, multiply: Boolean): this.type = js.native
    def saturate(value: Unit, multiply: Boolean): this.type = js.native
    
    /**
      * Desaturates this ColorMatrix (removes color from it).
      * @param multiply Multiply the resulting ColorMatrix (`true`), or set it (`false`) ? Default false.
      */
    def saturation(): this.type = js.native
    def saturation(multiply: Boolean): this.type = js.native
    
    /**
      * Applies a sepia tone to this ColorMatrix.
      * @param multiply Multiply the resulting ColorMatrix (`true`), or set it (`false`) ? Default false.
      */
    def sepia(): this.type = js.native
    def sepia(multiply: Boolean): this.type = js.native
    
    /**
      * Sets this ColorMatrix from the given array of color values.
      * @param value The ColorMatrix values to set.
      */
    def set(value: js.Array[Double]): this.type = js.native
    
    /**
      * Shifts the values of this ColorMatrix into BGR order.
      * @param multiply Multiply the resulting ColorMatrix (`true`), or set it (`false`) ? Default false.
      */
    def shiftToBGR(): this.type = js.native
    def shiftToBGR(multiply: Boolean): this.type = js.native
    
    /**
      * Applies a technicolor color effect to this ColorMatrix.
      * @param multiply Multiply the resulting ColorMatrix (`true`), or set it (`false`) ? Default false.
      */
    def technicolor(): this.type = js.native
    def technicolor(multiply: Boolean): this.type = js.native
    
    /**
      * Applies a vintage pinhole color effect to this ColorMatrix.
      * @param multiply Multiply the resulting ColorMatrix (`true`), or set it (`false`) ? Default false.
      */
    def vintagePinhole(): this.type = js.native
    def vintagePinhole(multiply: Boolean): this.type = js.native
  }
  
  object Masks {
    
    /**
      * A Bitmap Mask combines the alpha (opacity) of a masked pixel with the alpha of another pixel.
      * Unlike the Geometry Mask, which is a clipping path, a Bitmap Mask behaves like an alpha mask,
      * not a clipping path. It is only available when using the WebGL Renderer.
      * 
      * A Bitmap Mask can use any Game Object to determine the alpha of each pixel of the masked Game Object(s).
      * For any given point of a masked Game Object's texture, the pixel's alpha will be multiplied by the alpha
      * of the pixel at the same position in the Bitmap Mask's Game Object. The color of the pixel from the
      * Bitmap Mask doesn't matter.
      * 
      * For example, if a pure blue pixel with an alpha of 0.95 is masked with a pure red pixel with an
      * alpha of 0.5, the resulting pixel will be pure blue with an alpha of 0.475. Naturally, this means
      * that a pixel in the mask with an alpha of 0 will hide the corresponding pixel in all masked Game Objects
      *  A pixel with an alpha of 1 in the masked Game Object will receive the same alpha as the
      * corresponding pixel in the mask.
      * 
      * Note: You cannot combine Bitmap Masks and Blend Modes on the same Game Object. You can, however,
      * combine Geometry Masks and Blend Modes together.
      * 
      * The Bitmap Mask's location matches the location of its Game Object, not the location of the
      * masked objects. Moving or transforming the underlying Game Object will change the mask
      * (and affect the visibility of any masked objects), whereas moving or transforming a masked object
      * will not affect the mask.
      * 
      * The Bitmap Mask will not render its Game Object by itself. If the Game Object is not in a
      * Scene's display list, it will only be used for the mask and its full texture will not be directly
      * visible. Adding the underlying Game Object to a Scene will not cause any problems - it will
      * render as a normal Game Object and will also serve as a mask.
      */
    @js.native
    trait BitmapMask extends StObject {
      
      /**
        * A renderable Game Object that uses a texture, such as a Sprite.
        */
      var bitmapMask: GameObject = js.native
      
      /**
        * Deletes the `mainTexture` and `maskTexture` WebGL Textures and deletes
        * the `mainFramebuffer` and `maskFramebuffer` too, nulling all references.
        * 
        * This is called when this mask is destroyed, or if you try to creat a new
        * mask from this object when one is already set.
        */
      def clearMask(): Unit = js.native
      
      /**
        * Creates the WebGL Texture2D objects and Framebuffers required for this
        * mask. If this mask has already been created, then `clearMask` is called first.
        */
      def createMask(): Unit = js.native
      
      /**
        * Destroys this BitmapMask and nulls any references it holds.
        * 
        * Note that if a Game Object is currently using this mask it will _not_ automatically detect you have destroyed it,
        * so be sure to call `clearMask` on any Game Object using it, before destroying it.
        */
      def destroy(): Unit = js.native
      
      /**
        * Whether the Bitmap Mask is dirty and needs to be updated.
        */
      var dirty: Boolean = js.native
      
      /**
        * Whether to invert the masks alpha.
        * 
        * If `true`, the alpha of the masking pixel will be inverted before it's multiplied with the masked pixel.
        * Essentially, this means that a masked area will be visible only if the corresponding area in the mask is invisible.
        */
      var invertAlpha: Boolean = js.native
      
      /**
        * Is this mask a stencil mask?
        */
      val isStencil: Boolean = js.native
      
      /**
        * The framebuffer to which a masked Game Object is rendered.
        */
      var mainFramebuffer: WebGLFramebuffer = js.native
      
      /**
        * The texture used for the main framebuffer.
        */
      var mainTexture: WebGLTexture = js.native
      
      /**
        * The framebuffer to which the Bitmap Mask's masking Game Object is rendered.
        */
      var maskFramebuffer: WebGLFramebuffer = js.native
      
      /**
        * The texture used for the masks framebuffer.
        */
      var maskTexture: WebGLTexture = js.native
      
      /**
        * This is a NOOP method. Bitmap Masks are not supported by the Canvas Renderer.
        * @param renderer The Canvas Renderer which would be rendered to.
        */
      def postRenderCanvas(renderer: CanvasRenderer): Unit = js.native
      def postRenderCanvas(renderer: WebGLRenderer): Unit = js.native
      
      /**
        * Finalizes rendering of a masked Game Object.
        * 
        * This resets the previously bound framebuffer and switches the WebGL Renderer to the Bitmap Mask Pipeline, which uses a special fragment shader to apply the masking effect.
        * @param renderer The WebGL Renderer to clean up.
        */
      def postRenderWebGL(renderer: CanvasRenderer): Unit = js.native
      def postRenderWebGL(renderer: WebGLRenderer): Unit = js.native
      
      /**
        * This is a NOOP method. Bitmap Masks are not supported by the Canvas Renderer.
        * @param renderer The Canvas Renderer which would be rendered to.
        * @param mask The masked Game Object which would be rendered.
        * @param camera The Camera to render to.
        */
      def preRenderCanvas(renderer: CanvasRenderer, mask: GameObject, camera: Camera): Unit = js.native
      def preRenderCanvas(renderer: WebGLRenderer, mask: GameObject, camera: Camera): Unit = js.native
      
      /**
        * Prepares the WebGL Renderer to render a Game Object with this mask applied.
        * 
        * This renders the masking Game Object to the mask framebuffer and switches to the main framebuffer so that the masked Game Object will be rendered to it instead of being rendered directly to the frame.
        * @param renderer The WebGL Renderer to prepare.
        * @param maskedObject The masked Game Object which will be drawn.
        * @param camera The Camera to render to.
        */
      def preRenderWebGL(renderer: CanvasRenderer, maskedObject: GameObject, camera: Camera): Unit = js.native
      def preRenderWebGL(renderer: WebGLRenderer, maskedObject: GameObject, camera: Camera): Unit = js.native
      
      /**
        * A reference to either the Canvas or WebGL Renderer that this Mask is using.
        */
      var renderer: CanvasRenderer | WebGLRenderer = js.native
      
      /**
        * Sets a new masking Game Object for the Bitmap Mask.
        * @param renderable A renderable Game Object that uses a texture, such as a Sprite.
        */
      def setBitmap(renderable: GameObject): Unit = js.native
    }
    
    /**
      * A Geometry Mask can be applied to a Game Object to hide any pixels of it which don't intersect
      * a visible pixel from the geometry mask. The mask is essentially a clipping path which can only
      * make a masked pixel fully visible or fully invisible without changing its alpha (opacity).
      * 
      * A Geometry Mask uses a Graphics Game Object to determine which pixels of the masked Game Object(s)
      * should be clipped. For any given point of a masked Game Object's texture, the pixel will only be displayed
      * if the Graphics Game Object of the Geometry Mask has a visible pixel at the same position. The color and
      * alpha of the pixel from the Geometry Mask do not matter.
      * 
      * The Geometry Mask's location matches the location of its Graphics object, not the location of the masked objects.
      * Moving or transforming the underlying Graphics object will change the mask (and affect the visibility
      * of any masked objects), whereas moving or transforming a masked object will not affect the mask.
      * You can think of the Geometry Mask (or rather, of its Graphics object) as an invisible curtain placed
      * in front of all masked objects which has its own visual properties and, naturally, respects the camera's
      * visual properties, but isn't affected by and doesn't follow the masked objects by itself.
      */
    @js.native
    trait GeometryMask extends StObject {
      
      /**
        * Applies the current stencil mask to the renderer.
        * @param renderer The WebGL Renderer instance to draw to.
        * @param camera The camera the Game Object is being rendered through.
        * @param inc Is this an INCR stencil or a DECR stencil?
        */
      def applyStencil(renderer: WebGLRenderer, camera: Camera, inc: Boolean): Unit = js.native
      
      /**
        * Destroys this GeometryMask and nulls any references it holds.
        * 
        * Note that if a Game Object is currently using this mask it will _not_ automatically detect you have destroyed it,
        * so be sure to call `clearMask` on any Game Object using it, before destroying it.
        */
      def destroy(): Unit = js.native
      
      /**
        * The Graphics object which describes the Geometry Mask.
        */
      var geometryMask: Graphics = js.native
      
      /**
        * Similar to the BitmapMasks invertAlpha setting this to true will then hide all pixels
        * drawn to the Geometry Mask.
        * 
        * This is a WebGL only feature.
        */
      var invertAlpha: Boolean = js.native
      
      /**
        * Is this mask a stencil mask?
        */
      val isStencil: Boolean = js.native
      
      /**
        * Restore the canvas context's previous clipping path, thus turning off the mask for it.
        * @param renderer The Canvas Renderer instance being restored.
        */
      def postRenderCanvas(renderer: CanvasRenderer): Unit = js.native
      
      /**
        * Flushes all rendered pixels and disables the stencil test of a WebGL context, thus disabling the mask for it.
        * @param renderer The WebGL Renderer instance to draw flush.
        */
      def postRenderWebGL(renderer: WebGLRenderer): Unit = js.native
      
      /**
        * Sets the clipping path of a 2D canvas context to the Geometry Mask's underlying Graphics object.
        * @param renderer The Canvas Renderer instance to set the clipping path on.
        * @param mask The Game Object being rendered.
        * @param camera The camera the Game Object is being rendered through.
        */
      def preRenderCanvas(renderer: CanvasRenderer, mask: GameObject, camera: Camera): Unit = js.native
      
      /**
        * Renders the Geometry Mask's underlying Graphics object to the OpenGL stencil buffer and enables the stencil test, which clips rendered pixels according to the mask.
        * @param renderer The WebGL Renderer instance to draw to.
        * @param child The Game Object being rendered.
        * @param camera The camera the Game Object is being rendered through.
        */
      def preRenderWebGL(renderer: WebGLRenderer, child: GameObject, camera: Camera): Unit = js.native
      
      /**
        * Sets the `invertAlpha` property of this Geometry Mask.
        * 
        * Inverting the alpha essentially flips the way the mask works.
        * 
        * This is a WebGL only feature.
        * @param value Invert the alpha of this mask? Default true.
        */
      def setInvertAlpha(): this.type = js.native
      def setInvertAlpha(value: Boolean): this.type = js.native
      
      /**
        * Sets a new Graphics object for the Geometry Mask.
        * @param graphicsGeometry The Graphics object which will be used for the Geometry Mask.
        */
      def setShape(graphicsGeometry: Graphics): this.type = js.native
    }
  }
  
  /**
    * The RGB class holds a single color value and allows for easy modification and reading of it,
    * with optional on-change callback notification and a dirty flag.
    */
  @js.native
  trait RGB extends StObject {
    
    /**
      * The blue color value. Between 0 and 1.
      * 
      * Changing this property will flag this RGB object as being dirty
      * and invoke the `onChangeCallback` , if set.
      */
    var b: Double = js.native
    
    /**
      * Nulls any external references this object contains.
      */
    def destroy(): Unit = js.native
    
    /**
      * Is this color dirty?
      */
    var dirty: Boolean = js.native
    
    /**
      * Compares the given rgb parameters with those in this object and returns
      * a boolean `true` value if they are equal, otherwise it returns `false`.
      * @param red The red value to compare with this object.
      * @param green The green value to compare with this object.
      * @param blue The blue value to compare with this object.
      */
    def equals(red: Double, green: Double, blue: Double): Boolean = js.native
    
    /**
      * The green color value. Between 0 and 1.
      * 
      * Changing this property will flag this RGB object as being dirty
      * and invoke the `onChangeCallback` , if set.
      */
    var g: Double = js.native
    
    /**
      * Internal on change handler. Sets this object as being dirty and
      * then invokes the `onChangeCallback`, if set, passing in the
      * new RGB values.
      */
    def onChange(): Unit = js.native
    
    /**
      * This callback will be invoked each time one of the RGB color values change.
      * 
      * The callback is sent the new color values as the parameters.
      */
    var onChangeCallback: js.Function = js.native
    
    /**
      * The red color value. Between 0 and 1.
      * 
      * Changing this property will flag this RGB object as being dirty
      * and invoke the `onChangeCallback` , if set.
      */
    var r: Double = js.native
    
    /**
      * Sets the red, green and blue values of this RGB object, flags it as being
      * dirty and then invokes the `onChangeCallback`, if set.
      * @param red The red color value. A number between 0 and 1. Default 0.
      * @param green The green color value. A number between 0 and 1. Default 0.
      * @param blue The blue color value. A number between 0 and 1. Default 0.
      */
    def set(): this.type = js.native
    def set(red: Double): this.type = js.native
    def set(red: Double, green: Double): this.type = js.native
    def set(red: Double, green: Double, blue: Double): this.type = js.native
    def set(red: Double, green: Unit, blue: Double): this.type = js.native
    def set(red: Unit, green: Double): this.type = js.native
    def set(red: Unit, green: Double, blue: Double): this.type = js.native
    def set(red: Unit, green: Unit, blue: Double): this.type = js.native
  }
}
