package typings.phaser.Phaser

import typings.phaser.Phaser.Cameras.Scene2D.Camera
import typings.phaser.Phaser.GameObjects.GameObject
import typings.phaser.Phaser.GameObjects.Graphics
import typings.phaser.Phaser.Renderer.Canvas.CanvasRenderer
import typings.phaser.Phaser.Renderer.WebGL.WebGLRenderer
import typings.phaser.Phaser.Types.Display.ColorObject
import typings.phaser.Phaser.Types.Display.HSVColorObject
import typings.phaser.Phaser.Types.Display.InputColorObject
import typings.phaser.integer
import typings.std.CanvasRenderingContext2D
import typings.std.HTMLCanvasElement
import typings.std.WebGLFramebuffer
import typings.std.WebGLRenderingContext
import typings.std.WebGLTexture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Phaser.Display")
@js.native
object Display extends js.Object {
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
  @js.native
  class BaseShader protected () extends js.Object {
    /**
      * 
      * @param key The key of this shader. Must be unique within the shader cache.
      * @param fragmentSrc The fragment source for the shader.
      * @param vertexSrc The vertex source for the shader.
      * @param uniforms Optional object defining the uniforms the shader uses.
      */
    def this(key: String) = this()
    def this(key: String, fragmentSrc: String) = this()
    def this(key: String, fragmentSrc: String, vertexSrc: String) = this()
    def this(key: String, fragmentSrc: String, vertexSrc: String, uniforms: js.Any) = this()
    /**
      * The source code, as a string, of the fragment shader being used.
      */
    var fragmentSrc: String = js.native
    /**
      * The key of this shader, unique within the shader cache of this Phaser game instance.
      */
    var key: String = js.native
    /**
      * The default uniforms for this shader.
      */
    var uniforms: js.Any = js.native
    /**
      * The source code, as a string, of the vertex shader being used.
      */
    var vertexSrc: String = js.native
  }
  
  /**
    * The Color class holds a single color value and allows for easy modification and reading of it.
    */
  @js.native
  /**
    * 
    * @param red The red color value. A number between 0 and 255. Default 0.
    * @param green The green color value. A number between 0 and 255. Default 0.
    * @param blue The blue color value. A number between 0 and 255. Default 0.
    * @param alpha The alpha value. A number between 0 and 255. Default 255.
    */
  class Color () extends js.Object {
    def this(red: integer) = this()
    def this(red: integer, green: integer) = this()
    def this(red: integer, green: integer, blue: integer) = this()
    def this(red: integer, green: integer, blue: integer, alpha: integer) = this()
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
      * The color of this Color component, not including the alpha channel.
      */
    val color: Double = js.native
    /**
      * The color of this Color component, including the alpha channel.
      */
    val color32: Double = js.native
    /**
      * An array containing the calculated color values for WebGL use.
      */
    var gl: js.Array[Double] = js.native
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
      * The lightness color value. A number between 0 and 1.
      * This controls how dark the color is. Where 1 is as bright as possible and 0 is black.
      */
    var v: Double = js.native
    /**
      * Brighten this Color by the percentage amount given.
      * @param amount The percentage amount to change this color by. A value between 0 and 100.
      */
    def brighten(amount: integer): Color = js.native
    /**
      * Decrease the lightness of this Color by the percentage amount given.
      * @param amount The percentage amount to change this color by. A value between 0 and 100.
      */
    def darken(amount: integer): Color = js.native
    /**
      * Decrease the saturation of this Color by the percentage amount given.
      * The saturation is the amount of the base color in the hue.
      * @param amount The percentage amount to change this color by. A value between 0 and 100.
      */
    def desaturate(amount: integer): Color = js.native
    /**
      * Sets this Color object to be grayscaled based on the shade value given.
      * @param shade A value between 0 and 255.
      */
    def gray(shade: integer): Color = js.native
    /**
      * Increase the lightness of this Color by the percentage amount given.
      * @param amount The percentage amount to change this color by. A value between 0 and 100.
      */
    def lighten(amount: integer): Color = js.native
    /**
      * Sets this Color object to be a random color between the `min` and `max` values given.
      * @param min The minimum random color value. Between 0 and 255. Default 0.
      * @param max The maximum random color value. Between 0 and 255. Default 255.
      */
    def random(): Color = js.native
    def random(min: integer): Color = js.native
    def random(min: integer, max: integer): Color = js.native
    /**
      * Sets this Color object to be a random grayscale color between the `min` and `max` values given.
      * @param min The minimum random color value. Between 0 and 255. Default 0.
      * @param max The maximum random color value. Between 0 and 255. Default 255.
      */
    def randomGray(): Color = js.native
    def randomGray(min: integer): Color = js.native
    def randomGray(min: integer, max: integer): Color = js.native
    /**
      * Increase the saturation of this Color by the percentage amount given.
      * The saturation is the amount of the base color in the hue.
      * @param amount The percentage amount to change this color by. A value between 0 and 100.
      */
    def saturate(amount: integer): Color = js.native
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
    def setTo(red: integer, green: integer, blue: integer): Color = js.native
    def setTo(red: integer, green: integer, blue: integer, alpha: integer): Color = js.native
    def setTo(red: integer, green: integer, blue: integer, alpha: integer, updateHSV: Boolean): Color = js.native
    /**
      * Sets this color to be transparent. Sets all values to zero.
      */
    def transparent(): Color = js.native
  }
  
  @js.native
  object Align extends js.Object {
    /**
      * A constant representing a bottom-center alignment or position.
      */
    val BOTTOM_CENTER: integer = js.native
    /**
      * A constant representing a bottom-left alignment or position.
      */
    val BOTTOM_LEFT: integer = js.native
    /**
      * A constant representing a bottom-right alignment or position.
      */
    val BOTTOM_RIGHT: integer = js.native
    /**
      * A constant representing a center alignment or position.
      */
    val CENTER: integer = js.native
    /**
      * A constant representing a left-bottom alignment or position.
      */
    val LEFT_BOTTOM: integer = js.native
    /**
      * A constant representing a left-center alignment or position.
      */
    val LEFT_CENTER: integer = js.native
    /**
      * A constant representing a left-top alignment or position.
      */
    val LEFT_TOP: integer = js.native
    /**
      * A constant representing a right-bottom alignment or position.
      */
    val RIGHT_BOTTOM: integer = js.native
    /**
      * A constant representing a right-center alignment or position.
      */
    val RIGHT_CENTER: integer = js.native
    /**
      * A constant representing a right-top alignment or position.
      */
    val RIGHT_TOP: integer = js.native
    /**
      * A constant representing a top-center alignment or position.
      */
    val TOP_CENTER: integer = js.native
    /**
      * A constant representing a top-left alignment or position.
      */
    val TOP_LEFT: integer = js.native
    /**
      * A constant representing a top-right alignment or position.
      */
    val TOP_RIGHT: integer = js.native
    @js.native
    object In extends js.Object {
      /**
        * Takes given Game Object and aligns it so that it is positioned in the bottom center of the other.
        * @param gameObject The Game Object that will be positioned.
        * @param alignIn The Game Object to base the alignment position on.
        * @param offsetX Optional horizontal offset from the position. Default 0.
        * @param offsetY Optional vertical offset from the position. Default 0.
        */
      def BottomCenter[G /* <: GameObject */](gameObject: G, alignIn: GameObject): G = js.native
      def BottomCenter[G /* <: GameObject */](gameObject: G, alignIn: GameObject, offsetX: Double): G = js.native
      def BottomCenter[G /* <: GameObject */](gameObject: G, alignIn: GameObject, offsetX: Double, offsetY: Double): G = js.native
      /**
        * Takes given Game Object and aligns it so that it is positioned in the bottom left of the other.
        * @param gameObject The Game Object that will be positioned.
        * @param alignIn The Game Object to base the alignment position on.
        * @param offsetX Optional horizontal offset from the position. Default 0.
        * @param offsetY Optional vertical offset from the position. Default 0.
        */
      def BottomLeft[G /* <: GameObject */](gameObject: G, alignIn: GameObject): G = js.native
      def BottomLeft[G /* <: GameObject */](gameObject: G, alignIn: GameObject, offsetX: Double): G = js.native
      def BottomLeft[G /* <: GameObject */](gameObject: G, alignIn: GameObject, offsetX: Double, offsetY: Double): G = js.native
      /**
        * Takes given Game Object and aligns it so that it is positioned in the bottom right of the other.
        * @param gameObject The Game Object that will be positioned.
        * @param alignIn The Game Object to base the alignment position on.
        * @param offsetX Optional horizontal offset from the position. Default 0.
        * @param offsetY Optional vertical offset from the position. Default 0.
        */
      def BottomRight[G /* <: GameObject */](gameObject: G, alignIn: GameObject): G = js.native
      def BottomRight[G /* <: GameObject */](gameObject: G, alignIn: GameObject, offsetX: Double): G = js.native
      def BottomRight[G /* <: GameObject */](gameObject: G, alignIn: GameObject, offsetX: Double, offsetY: Double): G = js.native
      /**
        * Takes given Game Object and aligns it so that it is positioned in the center of the other.
        * @param gameObject The Game Object that will be positioned.
        * @param alignIn The Game Object to base the alignment position on.
        * @param offsetX Optional horizontal offset from the position. Default 0.
        * @param offsetY Optional vertical offset from the position. Default 0.
        */
      def Center[G /* <: GameObject */](gameObject: G, alignIn: GameObject): G = js.native
      def Center[G /* <: GameObject */](gameObject: G, alignIn: GameObject, offsetX: Double): G = js.native
      def Center[G /* <: GameObject */](gameObject: G, alignIn: GameObject, offsetX: Double, offsetY: Double): G = js.native
      /**
        * Takes given Game Object and aligns it so that it is positioned in the left center of the other.
        * @param gameObject The Game Object that will be positioned.
        * @param alignIn The Game Object to base the alignment position on.
        * @param offsetX Optional horizontal offset from the position. Default 0.
        * @param offsetY Optional vertical offset from the position. Default 0.
        */
      def LeftCenter[G /* <: GameObject */](gameObject: G, alignIn: GameObject): G = js.native
      def LeftCenter[G /* <: GameObject */](gameObject: G, alignIn: GameObject, offsetX: Double): G = js.native
      def LeftCenter[G /* <: GameObject */](gameObject: G, alignIn: GameObject, offsetX: Double, offsetY: Double): G = js.native
      /**
        * Takes given Game Object and aligns it so that it is positioned relative to the other.
        * The alignment used is based on the `position` argument, which is an `ALIGN_CONST` value, such as `LEFT_CENTER` or `TOP_RIGHT`.
        * @param child The Game Object that will be positioned.
        * @param alignIn The Game Object to base the alignment position on.
        * @param position The position to align the Game Object with. This is an align constant, such as `ALIGN_CONST.LEFT_CENTER`.
        * @param offsetX Optional horizontal offset from the position. Default 0.
        * @param offsetY Optional vertical offset from the position. Default 0.
        */
      def QuickSet[G /* <: GameObject */](child: G, alignIn: GameObject, position: integer): G = js.native
      def QuickSet[G /* <: GameObject */](child: G, alignIn: GameObject, position: integer, offsetX: Double): G = js.native
      def QuickSet[G /* <: GameObject */](child: G, alignIn: GameObject, position: integer, offsetX: Double, offsetY: Double): G = js.native
      /**
        * Takes given Game Object and aligns it so that it is positioned in the right center of the other.
        * @param gameObject The Game Object that will be positioned.
        * @param alignIn The Game Object to base the alignment position on.
        * @param offsetX Optional horizontal offset from the position. Default 0.
        * @param offsetY Optional vertical offset from the position. Default 0.
        */
      def RightCenter[G /* <: GameObject */](gameObject: G, alignIn: GameObject): G = js.native
      def RightCenter[G /* <: GameObject */](gameObject: G, alignIn: GameObject, offsetX: Double): G = js.native
      def RightCenter[G /* <: GameObject */](gameObject: G, alignIn: GameObject, offsetX: Double, offsetY: Double): G = js.native
      /**
        * Takes given Game Object and aligns it so that it is positioned in the top center of the other.
        * @param gameObject The Game Object that will be positioned.
        * @param alignIn The Game Object to base the alignment position on.
        * @param offsetX Optional horizontal offset from the position. Default 0.
        * @param offsetY Optional vertical offset from the position. Default 0.
        */
      def TopCenter[G /* <: GameObject */](gameObject: G, alignIn: GameObject): G = js.native
      def TopCenter[G /* <: GameObject */](gameObject: G, alignIn: GameObject, offsetX: Double): G = js.native
      def TopCenter[G /* <: GameObject */](gameObject: G, alignIn: GameObject, offsetX: Double, offsetY: Double): G = js.native
      /**
        * Takes given Game Object and aligns it so that it is positioned in the top left of the other.
        * @param gameObject The Game Object that will be positioned.
        * @param alignIn The Game Object to base the alignment position on.
        * @param offsetX Optional horizontal offset from the position. Default 0.
        * @param offsetY Optional vertical offset from the position. Default 0.
        */
      def TopLeft[G /* <: GameObject */](gameObject: G, alignIn: GameObject): G = js.native
      def TopLeft[G /* <: GameObject */](gameObject: G, alignIn: GameObject, offsetX: Double): G = js.native
      def TopLeft[G /* <: GameObject */](gameObject: G, alignIn: GameObject, offsetX: Double, offsetY: Double): G = js.native
      /**
        * Takes given Game Object and aligns it so that it is positioned in the top right of the other.
        * @param gameObject The Game Object that will be positioned.
        * @param alignIn The Game Object to base the alignment position on.
        * @param offsetX Optional horizontal offset from the position. Default 0.
        * @param offsetY Optional vertical offset from the position. Default 0.
        */
      def TopRight[G /* <: GameObject */](gameObject: G, alignIn: GameObject): G = js.native
      def TopRight[G /* <: GameObject */](gameObject: G, alignIn: GameObject, offsetX: Double): G = js.native
      def TopRight[G /* <: GameObject */](gameObject: G, alignIn: GameObject, offsetX: Double, offsetY: Double): G = js.native
    }
    
    @js.native
    object To extends js.Object {
      /**
        * Takes given Game Object and aligns it so that it is positioned next to the bottom center position of the other.
        * @param gameObject The Game Object that will be positioned.
        * @param alignTo The Game Object to base the alignment position on.
        * @param offsetX Optional horizontal offset from the position. Default 0.
        * @param offsetY Optional vertical offset from the position. Default 0.
        */
      def BottomCenter[G /* <: GameObject */](gameObject: G, alignTo: GameObject): G = js.native
      def BottomCenter[G /* <: GameObject */](gameObject: G, alignTo: GameObject, offsetX: Double): G = js.native
      def BottomCenter[G /* <: GameObject */](gameObject: G, alignTo: GameObject, offsetX: Double, offsetY: Double): G = js.native
      /**
        * Takes given Game Object and aligns it so that it is positioned next to the bottom left position of the other.
        * @param gameObject The Game Object that will be positioned.
        * @param alignTo The Game Object to base the alignment position on.
        * @param offsetX Optional horizontal offset from the position. Default 0.
        * @param offsetY Optional vertical offset from the position. Default 0.
        */
      def BottomLeft[G /* <: GameObject */](gameObject: G, alignTo: GameObject): G = js.native
      def BottomLeft[G /* <: GameObject */](gameObject: G, alignTo: GameObject, offsetX: Double): G = js.native
      def BottomLeft[G /* <: GameObject */](gameObject: G, alignTo: GameObject, offsetX: Double, offsetY: Double): G = js.native
      /**
        * Takes given Game Object and aligns it so that it is positioned next to the bottom right position of the other.
        * @param gameObject The Game Object that will be positioned.
        * @param alignTo The Game Object to base the alignment position on.
        * @param offsetX Optional horizontal offset from the position. Default 0.
        * @param offsetY Optional vertical offset from the position. Default 0.
        */
      def BottomRight[G /* <: GameObject */](gameObject: G, alignTo: GameObject): G = js.native
      def BottomRight[G /* <: GameObject */](gameObject: G, alignTo: GameObject, offsetX: Double): G = js.native
      def BottomRight[G /* <: GameObject */](gameObject: G, alignTo: GameObject, offsetX: Double, offsetY: Double): G = js.native
      /**
        * Takes given Game Object and aligns it so that it is positioned next to the left bottom position of the other.
        * @param gameObject The Game Object that will be positioned.
        * @param alignTo The Game Object to base the alignment position on.
        * @param offsetX Optional horizontal offset from the position. Default 0.
        * @param offsetY Optional vertical offset from the position. Default 0.
        */
      def LeftBottom[G /* <: GameObject */](gameObject: G, alignTo: GameObject): G = js.native
      def LeftBottom[G /* <: GameObject */](gameObject: G, alignTo: GameObject, offsetX: Double): G = js.native
      def LeftBottom[G /* <: GameObject */](gameObject: G, alignTo: GameObject, offsetX: Double, offsetY: Double): G = js.native
      /**
        * Takes given Game Object and aligns it so that it is positioned next to the left center position of the other.
        * @param gameObject The Game Object that will be positioned.
        * @param alignTo The Game Object to base the alignment position on.
        * @param offsetX Optional horizontal offset from the position. Default 0.
        * @param offsetY Optional vertical offset from the position. Default 0.
        */
      def LeftCenter[G /* <: GameObject */](gameObject: G, alignTo: GameObject): G = js.native
      def LeftCenter[G /* <: GameObject */](gameObject: G, alignTo: GameObject, offsetX: Double): G = js.native
      def LeftCenter[G /* <: GameObject */](gameObject: G, alignTo: GameObject, offsetX: Double, offsetY: Double): G = js.native
      /**
        * Takes given Game Object and aligns it so that it is positioned next to the left top position of the other.
        * @param gameObject The Game Object that will be positioned.
        * @param alignTo The Game Object to base the alignment position on.
        * @param offsetX Optional horizontal offset from the position. Default 0.
        * @param offsetY Optional vertical offset from the position. Default 0.
        */
      def LeftTop[G /* <: GameObject */](gameObject: G, alignTo: GameObject): G = js.native
      def LeftTop[G /* <: GameObject */](gameObject: G, alignTo: GameObject, offsetX: Double): G = js.native
      def LeftTop[G /* <: GameObject */](gameObject: G, alignTo: GameObject, offsetX: Double, offsetY: Double): G = js.native
      /**
        * Takes given Game Object and aligns it so that it is positioned next to the right bottom position of the other.
        * @param gameObject The Game Object that will be positioned.
        * @param alignTo The Game Object to base the alignment position on.
        * @param offsetX Optional horizontal offset from the position. Default 0.
        * @param offsetY Optional vertical offset from the position. Default 0.
        */
      def RightBottom[G /* <: GameObject */](gameObject: G, alignTo: GameObject): G = js.native
      def RightBottom[G /* <: GameObject */](gameObject: G, alignTo: GameObject, offsetX: Double): G = js.native
      def RightBottom[G /* <: GameObject */](gameObject: G, alignTo: GameObject, offsetX: Double, offsetY: Double): G = js.native
      /**
        * Takes given Game Object and aligns it so that it is positioned next to the right center position of the other.
        * @param gameObject The Game Object that will be positioned.
        * @param alignTo The Game Object to base the alignment position on.
        * @param offsetX Optional horizontal offset from the position. Default 0.
        * @param offsetY Optional vertical offset from the position. Default 0.
        */
      def RightCenter[G /* <: GameObject */](gameObject: G, alignTo: GameObject): G = js.native
      def RightCenter[G /* <: GameObject */](gameObject: G, alignTo: GameObject, offsetX: Double): G = js.native
      def RightCenter[G /* <: GameObject */](gameObject: G, alignTo: GameObject, offsetX: Double, offsetY: Double): G = js.native
      /**
        * Takes given Game Object and aligns it so that it is positioned next to the right top position of the other.
        * @param gameObject The Game Object that will be positioned.
        * @param alignTo The Game Object to base the alignment position on.
        * @param offsetX Optional horizontal offset from the position. Default 0.
        * @param offsetY Optional vertical offset from the position. Default 0.
        */
      def RightTop[G /* <: GameObject */](gameObject: G, alignTo: GameObject): G = js.native
      def RightTop[G /* <: GameObject */](gameObject: G, alignTo: GameObject, offsetX: Double): G = js.native
      def RightTop[G /* <: GameObject */](gameObject: G, alignTo: GameObject, offsetX: Double, offsetY: Double): G = js.native
      /**
        * Takes given Game Object and aligns it so that it is positioned next to the top center position of the other.
        * @param gameObject The Game Object that will be positioned.
        * @param alignTo The Game Object to base the alignment position on.
        * @param offsetX Optional horizontal offset from the position. Default 0.
        * @param offsetY Optional vertical offset from the position. Default 0.
        */
      def TopCenter[G /* <: GameObject */](gameObject: G, alignTo: GameObject): G = js.native
      def TopCenter[G /* <: GameObject */](gameObject: G, alignTo: GameObject, offsetX: Double): G = js.native
      def TopCenter[G /* <: GameObject */](gameObject: G, alignTo: GameObject, offsetX: Double, offsetY: Double): G = js.native
      /**
        * Takes given Game Object and aligns it so that it is positioned next to the top left position of the other.
        * @param gameObject The Game Object that will be positioned.
        * @param alignTo The Game Object to base the alignment position on.
        * @param offsetX Optional horizontal offset from the position. Default 0.
        * @param offsetY Optional vertical offset from the position. Default 0.
        */
      def TopLeft[G /* <: GameObject */](gameObject: G, alignTo: GameObject): G = js.native
      def TopLeft[G /* <: GameObject */](gameObject: G, alignTo: GameObject, offsetX: Double): G = js.native
      def TopLeft[G /* <: GameObject */](gameObject: G, alignTo: GameObject, offsetX: Double, offsetY: Double): G = js.native
      /**
        * Takes given Game Object and aligns it so that it is positioned next to the top right position of the other.
        * @param gameObject The Game Object that will be positioned.
        * @param alignTo The Game Object to base the alignment position on.
        * @param offsetX Optional horizontal offset from the position. Default 0.
        * @param offsetY Optional vertical offset from the position. Default 0.
        */
      def TopRight[G /* <: GameObject */](gameObject: G, alignTo: GameObject): G = js.native
      def TopRight[G /* <: GameObject */](gameObject: G, alignTo: GameObject, offsetX: Double): G = js.native
      def TopRight[G /* <: GameObject */](gameObject: G, alignTo: GameObject, offsetX: Double, offsetY: Double): G = js.native
    }
    
  }
  
  @js.native
  object Bounds extends js.Object {
    /**
      * Positions the Game Object so that it is centered on the given coordinates.
      * @param gameObject The Game Object that will be re-positioned.
      * @param x The horizontal coordinate to position the Game Object on.
      * @param y The vertical coordinate to position the Game Object on.
      */
    def CenterOn[G /* <: GameObject */](gameObject: G, x: Double, y: Double): G = js.native
    /**
      * Returns the bottom coordinate from the bounds of the Game Object.
      * @param gameObject The Game Object to get the bounds value from.
      */
    def GetBottom(gameObject: GameObject): Double = js.native
    /**
      * Returns the center x coordinate from the bounds of the Game Object.
      * @param gameObject The Game Object to get the bounds value from.
      */
    def GetCenterX(gameObject: GameObject): Double = js.native
    /**
      * Returns the center y coordinate from the bounds of the Game Object.
      * @param gameObject The Game Object to get the bounds value from.
      */
    def GetCenterY(gameObject: GameObject): Double = js.native
    /**
      * Returns the left coordinate from the bounds of the Game Object.
      * @param gameObject The Game Object to get the bounds value from.
      */
    def GetLeft(gameObject: GameObject): Double = js.native
    /**
      * Returns the amount the Game Object is visually offset from its x coordinate.
      * This is the same as `width * origin.x`.
      * This value will only be > 0 if `origin.x` is not equal to zero.
      * @param gameObject The Game Object to get the bounds value from.
      */
    def GetOffsetX(gameObject: GameObject): Double = js.native
    /**
      * Returns the amount the Game Object is visually offset from its y coordinate.
      * This is the same as `width * origin.y`.
      * This value will only be > 0 if `origin.y` is not equal to zero.
      * @param gameObject The Game Object to get the bounds value from.
      */
    def GetOffsetY(gameObject: GameObject): Double = js.native
    /**
      * Returns the right coordinate from the bounds of the Game Object.
      * @param gameObject The Game Object to get the bounds value from.
      */
    def GetRight(gameObject: GameObject): Double = js.native
    /**
      * Returns the top coordinate from the bounds of the Game Object.
      * @param gameObject The Game Object to get the bounds value from.
      */
    def GetTop(gameObject: GameObject): Double = js.native
    /**
      * Positions the Game Object so that the bottom of its bounds aligns with the given coordinate.
      * @param gameObject The Game Object that will be re-positioned.
      * @param value The coordinate to position the Game Object bounds on.
      */
    def SetBottom[G /* <: GameObject */](gameObject: G, value: Double): G = js.native
    /**
      * Positions the Game Object so that the center top of its bounds aligns with the given coordinate.
      * @param gameObject The Game Object that will be re-positioned.
      * @param x The coordinate to position the Game Object bounds on.
      */
    def SetCenterX[G /* <: GameObject */](gameObject: G, x: Double): G = js.native
    /**
      * Positions the Game Object so that the center top of its bounds aligns with the given coordinate.
      * @param gameObject The Game Object that will be re-positioned.
      * @param y The coordinate to position the Game Object bounds on.
      */
    def SetCenterY[G /* <: GameObject */](gameObject: G, y: Double): G = js.native
    /**
      * Positions the Game Object so that the left of its bounds aligns with the given coordinate.
      * @param gameObject The Game Object that will be re-positioned.
      * @param value The coordinate to position the Game Object bounds on.
      */
    def SetLeft[G /* <: GameObject */](gameObject: G, value: Double): G = js.native
    /**
      * Positions the Game Object so that the left of its bounds aligns with the given coordinate.
      * @param gameObject The Game Object that will be re-positioned.
      * @param value The coordinate to position the Game Object bounds on.
      */
    def SetRight[G /* <: GameObject */](gameObject: G, value: Double): G = js.native
    /**
      * Positions the Game Object so that the top of its bounds aligns with the given coordinate.
      * @param gameObject The Game Object that will be re-positioned.
      * @param value The coordinate to position the Game Object bounds on.
      */
    def SetTop[G /* <: GameObject */](gameObject: G, value: Double): G = js.native
  }
  
  @js.native
  object Canvas extends js.Object {
    /**
      * Sets the touch-action property on the canvas style. Can be used to disable default browser touch actions.
      * @param canvas The canvas element to have the style applied to.
      * @param value The touch action value to set on the canvas. Set to `none` to disable touch actions. Default 'none'.
      */
    def TouchAction(canvas: HTMLCanvasElement): HTMLCanvasElement = js.native
    def TouchAction(canvas: HTMLCanvasElement, value: String): HTMLCanvasElement = js.native
    /**
      * Sets the user-select property on the canvas style. Can be used to disable default browser selection actions.
      * @param canvas The canvas element to have the style applied to.
      * @param value The touch callout value to set on the canvas. Set to `none` to disable touch callouts. Default 'none'.
      */
    def UserSelect(canvas: HTMLCanvasElement): HTMLCanvasElement = js.native
    def UserSelect(canvas: HTMLCanvasElement, value: String): HTMLCanvasElement = js.native
    @js.native
    object CanvasInterpolation extends js.Object {
      /**
        * Sets the CSS image-rendering property on the given canvas to be 'bicubic' (aka 'auto').
        * @param canvas The canvas object to have the style set on.
        */
      def setBicubic(canvas: HTMLCanvasElement): HTMLCanvasElement = js.native
      /**
        * Sets the CSS image-rendering property on the given canvas to be 'crisp' (aka 'optimize contrast' on webkit).
        * @param canvas The canvas object to have the style set on.
        */
      def setCrisp(canvas: HTMLCanvasElement): HTMLCanvasElement = js.native
    }
    
    /**
      * The CanvasPool is a global static object, that allows Phaser to recycle and pool 2D Context Canvas DOM elements.
      * It does not pool WebGL Contexts, because once the context options are set they cannot be modified again, 
      * which is useless for some of the Phaser pipelines / renderer.
      * 
      * This singleton is instantiated as soon as Phaser loads, before a Phaser.Game instance has even been created.
      * Which means all instances of Phaser Games on the same page can share the one single pool.
      */
    @js.native
    object CanvasPool extends js.Object {
      /**
        * Creates a new Canvas DOM element, or pulls one from the pool if free.
        * @param parent The parent of the Canvas object.
        * @param width The width of the Canvas. Default 1.
        * @param height The height of the Canvas. Default 1.
        * @param canvasType The type of the Canvas. Either `Phaser.CANVAS` or `Phaser.WEBGL`. Default Phaser.CANVAS.
        * @param selfParent Use the generated Canvas element as the parent? Default false.
        */
      def create(parent: js.Any): HTMLCanvasElement = js.native
      def create(parent: js.Any, width: integer): HTMLCanvasElement = js.native
      def create(parent: js.Any, width: integer, height: integer): HTMLCanvasElement = js.native
      def create(parent: js.Any, width: integer, height: integer, canvasType: integer): HTMLCanvasElement = js.native
      def create(parent: js.Any, width: integer, height: integer, canvasType: integer, selfParent: Boolean): HTMLCanvasElement = js.native
      /**
        * Creates a new Canvas DOM element, or pulls one from the pool if free.
        * @param parent The parent of the Canvas object.
        * @param width The width of the Canvas. Default 1.
        * @param height The height of the Canvas. Default 1.
        */
      def create2D(parent: js.Any): HTMLCanvasElement = js.native
      def create2D(parent: js.Any, width: integer): HTMLCanvasElement = js.native
      def create2D(parent: js.Any, width: integer, height: integer): HTMLCanvasElement = js.native
      /**
        * Creates a new Canvas DOM element, or pulls one from the pool if free.
        * @param parent The parent of the Canvas object.
        * @param width The width of the Canvas. Default 1.
        * @param height The height of the Canvas. Default 1.
        */
      def createWebGL(parent: js.Any): HTMLCanvasElement = js.native
      def createWebGL(parent: js.Any, width: integer): HTMLCanvasElement = js.native
      def createWebGL(parent: js.Any, width: integer, height: integer): HTMLCanvasElement = js.native
      /**
        * Disable context smoothing on any new Canvas element created.
        */
      def disableSmoothing(): Unit = js.native
      /**
        * Enable context smoothing on any new Canvas element created.
        */
      def enableSmoothing(): Unit = js.native
      /**
        * Gets the first free canvas index from the pool.
        * @param canvasType The type of the Canvas. Either `Phaser.CANVAS` or `Phaser.WEBGL`. Default Phaser.CANVAS.
        */
      def first(): HTMLCanvasElement = js.native
      def first(canvasType: integer): HTMLCanvasElement = js.native
      /**
        * Gets the total number of free canvas elements in the pool.
        */
      def free(): integer = js.native
      /**
        * Looks up a canvas based on its parent, and if found puts it back in the pool, freeing it up for re-use.
        * The canvas has its width and height set to 1, and its parent attribute nulled.
        * @param parent The canvas or the parent of the canvas to free.
        */
      def remove(parent: js.Any): Unit = js.native
      /**
        * Gets the total number of used canvas elements in the pool.
        */
      def total(): integer = js.native
    }
    
    @js.native
    object Smoothing extends js.Object {
      /**
        * Sets the Image Smoothing property on the given context. Set to false to disable image smoothing.
        * By default browsers have image smoothing enabled, which isn't always what you visually want, especially
        * when using pixel art in a game. Note that this sets the property on the context itself, so that any image
        * drawn to the context will be affected. This sets the property across all current browsers but support is
        * patchy on earlier browsers, especially on mobile.
        * @param context The context on which to disable smoothing.
        */
      def disable(context: CanvasRenderingContext2D): CanvasRenderingContext2D | WebGLRenderingContext = js.native
      def disable(context: WebGLRenderingContext): CanvasRenderingContext2D | WebGLRenderingContext = js.native
      /**
        * Sets the Image Smoothing property on the given context. Set to false to disable image smoothing.
        * By default browsers have image smoothing enabled, which isn't always what you visually want, especially
        * when using pixel art in a game. Note that this sets the property on the context itself, so that any image
        * drawn to the context will be affected. This sets the property across all current browsers but support is
        * patchy on earlier browsers, especially on mobile.
        * @param context The context on which to enable smoothing.
        */
      def enable(context: CanvasRenderingContext2D): CanvasRenderingContext2D | WebGLRenderingContext = js.native
      def enable(context: WebGLRenderingContext): CanvasRenderingContext2D | WebGLRenderingContext = js.native
      /**
        * Gets the Smoothing Enabled vendor prefix being used on the given context, or null if not set.
        * @param context The canvas context to check.
        */
      def getPrefix(context: CanvasRenderingContext2D): String = js.native
      def getPrefix(context: WebGLRenderingContext): String = js.native
      /**
        * Returns `true` if the given context has image smoothing enabled, otherwise returns `false`.
        * Returns null if no smoothing prefix is available.
        * @param context The context to check.
        */
      def isEnabled(context: CanvasRenderingContext2D): Boolean = js.native
      def isEnabled(context: WebGLRenderingContext): Boolean = js.native
    }
    
  }
  
  /* static members */
  @js.native
  object Color extends js.Object {
    /**
      * Converts the given color value into an Object containing r,g,b and a properties.
      * @param color A color value, optionally including the alpha value.
      */
    def ColorToRGBA(color: Double): ColorObject = js.native
    /**
      * Returns a string containing a hex representation of the given color component.
      * @param color The color channel to get the hex value for, must be a value between 0 and 255.
      */
    def ComponentToHex(color: integer): String = js.native
    /**
      * Given 3 separate color values this will return an integer representation of it.
      * @param red The red color value. A number between 0 and 255.
      * @param green The green color value. A number between 0 and 255.
      * @param blue The blue color value. A number between 0 and 255.
      */
    def GetColor(red: integer, green: integer, blue: integer): Double = js.native
    /**
      * Given an alpha and 3 color values this will return an integer representation of it.
      * @param red The red color value. A number between 0 and 255.
      * @param green The green color value. A number between 0 and 255.
      * @param blue The blue color value. A number between 0 and 255.
      * @param alpha The alpha color value. A number between 0 and 255.
      */
    def GetColor32(red: integer, green: integer, blue: integer, alpha: integer): Double = js.native
    /**
      * Converts HSL (hue, saturation and lightness) values to a Phaser Color object.
      * @param h The hue value in the range 0 to 1.
      * @param s The saturation value in the range 0 to 1.
      * @param l The lightness value in the range 0 to 1.
      */
    def HSLToColor(h: Double, s: Double, l: Double): Color = js.native
    /**
      * Get HSV color wheel values in an array which will be 360 elements in size.
      * @param s The saturation, in the range 0 - 1. Default 1.
      * @param v The value, in the range 0 - 1. Default 1.
      */
    def HSVColorWheel(): js.Array[ColorObject] = js.native
    def HSVColorWheel(s: Double): js.Array[ColorObject] = js.native
    def HSVColorWheel(s: Double, v: Double): js.Array[ColorObject] = js.native
    /**
      * Converts an HSV (hue, saturation and value) color value to RGB.
      * Conversion formula from http://en.wikipedia.org/wiki/HSL_color_space.
      * Assumes HSV values are contained in the set [0, 1].
      * Based on code by Michael Jackson (https://github.com/mjijackson)
      * @param h The hue, in the range 0 - 1. This is the base color.
      * @param s The saturation, in the range 0 - 1. This controls how much of the hue will be in the final color, where 1 is fully saturated and 0 will give you white.
      * @param v The value, in the range 0 - 1. This controls how dark the color is. Where 1 is as bright as possible and 0 is black.
      * @param out A Color object to store the results in. If not given a new ColorObject will be created.
      */
    def HSVToRGB(h: Double, s: Double, v: Double): ColorObject | Color = js.native
    def HSVToRGB(h: Double, s: Double, v: Double, out: Color): ColorObject | Color = js.native
    def HSVToRGB(h: Double, s: Double, v: Double, out: ColorObject): ColorObject | Color = js.native
    /**
      * Converts a hex string into a Phaser Color object.
      * 
      * The hex string can supplied as `'#0033ff'` or the short-hand format of `'#03f'`; it can begin with an optional "#" or "0x", or be unprefixed.
      * 
      * An alpha channel is _not_ supported.
      * @param hex The hex color value to convert, such as `#0033ff` or the short-hand format: `#03f`.
      */
    def HexStringToColor(hex: String): Color = js.native
    /**
      * Converts a hue to an RGB color.
      * Based on code by Michael Jackson (https://github.com/mjijackson)
      */
    def HueToComponent(p: Double, q: Double, t: Double): Double = js.native
    /**
      * Converts the given color value into an instance of a Color object.
      * @param input The color value to convert into a Color object.
      */
    def IntegerToColor(input: integer): Color = js.native
    /**
      * Return the component parts of a color as an Object with the properties alpha, red, green, blue.
      * 
      * Alpha will only be set if it exists in the given color (0xAARRGGBB)
      * @param input The color value to convert into a Color object.
      */
    def IntegerToRGB(input: integer): ColorObject = js.native
    /**
      * Converts an object containing `r`, `g`, `b` and `a` properties into a Color class instance.
      * @param input An object containing `r`, `g`, `b` and `a` properties in the range 0 to 255.
      */
    def ObjectToColor(input: InputColorObject): Color = js.native
    /**
      * Converts a CSS 'web' string into a Phaser Color object.
      * 
      * The web string can be in the format `'rgb(r,g,b)'` or `'rgba(r,g,b,a)'` where r/g/b are in the range [0..255] and a is in the range [0..1].
      * @param rgb The CSS format color string, using the `rgb` or `rgba` format.
      */
    def RGBStringToColor(rgb: String): Color = js.native
    /**
      * Converts an RGB color value to HSV (hue, saturation and value).
      * Conversion formula from http://en.wikipedia.org/wiki/HSL_color_space.
      * Assumes RGB values are contained in the set [0, 255] and returns h, s and v in the set [0, 1].
      * Based on code by Michael Jackson (https://github.com/mjijackson)
      * @param r The red color value. A number between 0 and 255.
      * @param g The green color value. A number between 0 and 255.
      * @param b The blue color value. A number between 0 and 255.
      * @param out An object to store the color values in. If not given an HSV Color Object will be created.
      */
    def RGBToHSV(r: integer, g: integer, b: integer): HSVColorObject | Color = js.native
    def RGBToHSV(r: integer, g: integer, b: integer, out: Color): HSVColorObject | Color = js.native
    def RGBToHSV(r: integer, g: integer, b: integer, out: HSVColorObject): HSVColorObject | Color = js.native
    /**
      * Converts the color values into an HTML compatible color string, prefixed with either `#` or `0x`.
      * @param r The red color value. A number between 0 and 255.
      * @param g The green color value. A number between 0 and 255.
      * @param b The blue color value. A number between 0 and 255.
      * @param a The alpha value. A number between 0 and 255. Default 255.
      * @param prefix The prefix of the string. Either `#` or `0x`. Default #.
      */
    def RGBToString(r: integer, g: integer, b: integer): String = js.native
    def RGBToString(r: integer, g: integer, b: integer, a: integer): String = js.native
    def RGBToString(r: integer, g: integer, b: integer, a: integer, prefix: String): String = js.native
    /**
      * Creates a new Color object where the r, g, and b values have been set to random values
      * based on the given min max values.
      * @param min The minimum value to set the random range from (between 0 and 255) Default 0.
      * @param max The maximum value to set the random range from (between 0 and 255) Default 255.
      */
    def RandomRGB(): Color = js.native
    def RandomRGB(min: integer): Color = js.native
    def RandomRGB(min: integer, max: integer): Color = js.native
    /**
      * Converts the given source color value into an instance of a Color class.
      * The value can be either a string, prefixed with `rgb` or a hex string, a number or an Object.
      * @param input The source color value to convert.
      */
    def ValueToColor(input: String): Color = js.native
    def ValueToColor(input: Double): Color = js.native
    def ValueToColor(input: InputColorObject): Color = js.native
    @js.native
    object Interpolate extends js.Object {
      /**
        * Interpolates between the two given color objects over the length supplied.
        * @param color1 The first Color object.
        * @param color2 The second Color object.
        * @param length Distance to interpolate over. Default 100.
        * @param index Index to start from. Default 0.
        */
      def ColorWithColor(color1: Color, color2: Color): ColorObject = js.native
      def ColorWithColor(color1: Color, color2: Color, length: Double): ColorObject = js.native
      def ColorWithColor(color1: Color, color2: Color, length: Double, index: Double): ColorObject = js.native
      /**
        * Interpolates between the Color object and color values over the length supplied.
        * @param color1 The first Color object.
        * @param r Red value.
        * @param g Blue value.
        * @param b Green value.
        * @param length Distance to interpolate over. Default 100.
        * @param index Index to start from. Default 0.
        */
      def ColorWithRGB(color1: Color, r: Double, g: Double, b: Double): ColorObject = js.native
      def ColorWithRGB(color1: Color, r: Double, g: Double, b: Double, length: Double): ColorObject = js.native
      def ColorWithRGB(color1: Color, r: Double, g: Double, b: Double, length: Double, index: Double): ColorObject = js.native
      /**
        * Interpolates between the two given color ranges over the length supplied.
        * @param r1 Red value.
        * @param g1 Blue value.
        * @param b1 Green value.
        * @param r2 Red value.
        * @param g2 Blue value.
        * @param b2 Green value.
        * @param length Distance to interpolate over. Default 100.
        * @param index Index to start from. Default 0.
        */
      def RGBWithRGB(r1: Double, g1: Double, b1: Double, r2: Double, g2: Double, b2: Double): ColorObject = js.native
      def RGBWithRGB(r1: Double, g1: Double, b1: Double, r2: Double, g2: Double, b2: Double, length: Double): ColorObject = js.native
      def RGBWithRGB(
        r1: Double,
        g1: Double,
        b1: Double,
        r2: Double,
        g2: Double,
        b2: Double,
        length: Double,
        index: Double
      ): ColorObject = js.native
    }
    
  }
  
  @js.native
  object Masks extends js.Object {
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
    class BitmapMask protected () extends js.Object {
      /**
        * 
        * @param scene The Scene which this Bitmap Mask will be used in.
        * @param renderable A renderable Game Object that uses a texture, such as a Sprite.
        */
      def this(scene: Scene, renderable: GameObject) = this()
      /**
        * A renderable Game Object that uses a texture, such as a Sprite.
        */
      var bitmapMask: GameObject = js.native
      /**
        * Whether the Bitmap Mask is dirty and needs to be updated.
        */
      var dirty: Boolean = js.native
      /**
        * Whether to invert the masks alpha.
        * 
        * If `true`, the alpha of the masking pixel will be inverted before it's multiplied with the masked pixel. Essentially, this means that a masked area will be visible only if the corresponding area in the mask is invisible.
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
        * The texture used for the mask's framebuffer.
        */
      var maskTexture: WebGLTexture = js.native
      /**
        * The previous framebuffer set in the renderer before this one was enabled.
        */
      var prevFramebuffer: WebGLFramebuffer = js.native
      /**
        * A reference to either the Canvas or WebGL Renderer that this Mask is using.
        */
      var renderer: CanvasRenderer | WebGLRenderer = js.native
      /**
        * Destroys this BitmapMask and nulls any references it holds.
        * 
        * Note that if a Game Object is currently using this mask it will _not_ automatically detect you have destroyed it,
        * so be sure to call `clearMask` on any Game Object using it, before destroying it.
        */
      def destroy(): Unit = js.native
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
    class GeometryMask protected () extends js.Object {
      /**
        * 
        * @param scene This parameter is not used.
        * @param graphicsGeometry The Graphics Game Object to use for the Geometry Mask. Doesn't have to be in the Display List.
        */
      def this(scene: Scene, graphicsGeometry: Graphics) = this()
      /**
        * The Graphics object which describes the Geometry Mask.
        */
      var geometryMask: Graphics = js.native
      /**
        * Similar to the BitmapMasks invertAlpha setting this to true will then hide all pixels
        * drawn to the Geometry Mask.
        */
      var invertAlpha: Boolean = js.native
      /**
        * Is this mask a stencil mask?
        */
      val isStencil: Boolean = js.native
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
        * Inverting the alpha essentially flips the way the mask works.
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
  
}

