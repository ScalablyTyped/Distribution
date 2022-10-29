package typings.pixiFilterColorMatrix

import typings.pixiCore.mod.Filter
import typings.pixiFilterColorMatrix.pixiFilterColorMatrixInts.`20`
import typings.pixiUtils.libTypesMod.ArrayFixed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libColorMatrixFilterMod {
  
  @JSImport("@pixi/filter-color-matrix/lib/ColorMatrixFilter", "ColorMatrixFilter")
  @js.native
  open class ColorMatrixFilter () extends Filter {
    
    /**
      * Create a Float32 Array and normalize the offset component to 0-1
      * @param {number[]} matrix - 5x4 matrix
      * @returns {number[]} 5x4 matrix with all values between 0-1
      */
    /* private */ var _colorMatrix: Any = js.native
    
    /**
      * Transforms current matrix and set the new one
      * @param {number[]} matrix - 5x4 matrix
      * @param multiply - if true, current matrix and matrix are multiplied. If false,
      *  just set the current matrix with @param matrix
      */
    /* private */ var _loadMatrix: Any = js.native
    
    /**
      * Multiplies two mat5's
      * @private
      * @param out - 5x4 matrix the receiving matrix
      * @param a - 5x4 matrix the first operand
      * @param b - 5x4 matrix the second operand
      * @returns {number[]} 5x4 matrix
      */
    /* private */ var _multiply: Any = js.native
    
    /**
      * The opacity value to use when mixing the original and resultant colors.
      *
      * When the value is 0, the original color is used without modification.
      * When the value is 1, the result color is used.
      * When in the range (0, 1) the color is interpolated between the original and result by this amount.
      * @default 1
      */
    def alpha: Double = js.native
    def alpha_=(value: Double): Unit = js.native
    
    /**
      * Set the black and white matrice.
      * @param multiply - if true, current matrix and matrix are multiplied. If false,
      *  just set the current matrix with @param matrix
      */
    def blackAndWhite(multiply: Boolean): Unit = js.native
    
    /**
      * Adjusts brightness
      * @param b - value of the brigthness (0-1, where 0 is black)
      * @param multiply - if true, current matrix and matrix are multiplied. If false,
      *  just set the current matrix with @param matrix
      */
    def brightness(b: Double, multiply: Boolean): Unit = js.native
    
    /**
      * Brown delicious browni filter (thanks Dominic Szablewski)
      * @param multiply - if true, current matrix and matrix are multiplied. If false,
      *  just set the current matrix with @param matrix
      */
    def browni(multiply: Boolean): Unit = js.native
    
    /**
      * We don't know exactly what it does, kind of gradient map, but funny to play with!
      * @param desaturation - Tone values.
      * @param toned - Tone values.
      * @param lightColor - Tone values, example: `0xFFE580`
      * @param darkColor - Tone values, example: `0xFFE580`
      * @param multiply - if true, current matrix and matrix are multiplied. If false,
      *  just set the current matrix with @param matrix
      */
    def colorTone(desaturation: Double, toned: Double, lightColor: Double, darkColor: Double, multiply: Boolean): Unit = js.native
    
    /**
      * Set the contrast matrix, increase the separation between dark and bright
      * Increase contrast : shadows darker and highlights brighter
      * Decrease contrast : bring the shadows up and the highlights down
      * @param amount - value of the contrast (0-1)
      * @param multiply - if true, current matrix and matrix are multiplied. If false,
      *  just set the current matrix with @param matrix
      */
    def contrast(amount: Double, multiply: Boolean): Unit = js.native
    
    /** Desaturate image (remove color) Call the saturate function */
    def desaturate(): Unit = js.native
    
    def grayscale(scale: Double, multiply: Boolean): Unit = js.native
    
    /**
      * Set the matrices in grey scales
      * @param scale - value of the grey (0-1, where 0 is black)
      * @param multiply - if true, current matrix and matrix are multiplied. If false,
      *  just set the current matrix with @param matrix
      */
    def greyscale(scale: Double, multiply: Boolean): Unit = js.native
    
    /**
      * Set the hue property of the color
      * @param rotation - in degrees
      * @param multiply - if true, current matrix and matrix are multiplied. If false,
      *  just set the current matrix with @param matrix
      */
    def hue(rotation: Double, multiply: Boolean): Unit = js.native
    
    /**
      * Color reversal film introduced by Eastman Kodak in 1935. (thanks Dominic Szablewski)
      * @param multiply - if true, current matrix and matrix are multiplied. If false,
      *  just set the current matrix with @param matrix
      */
    def kodachrome(multiply: Boolean): Unit = js.native
    
    /**
      * LSD effect
      *
      * Multiply the current matrix
      * @param multiply - if true, current matrix and matrix are multiplied. If false,
      *  just set the current matrix with @param matrix
      */
    def lsd(multiply: Boolean): Unit = js.native
    
    /**
      * The matrix of the color matrix filter
      * @member {number[]}
      * @default [1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0]
      */
    def matrix: ColorMatrix = js.native
    def matrix_=(value: ColorMatrix): Unit = js.native
    
    /**
      * Negative image (inverse of classic rgb matrix)
      * @param multiply - if true, current matrix and matrix are multiplied. If false,
      *  just set the current matrix with @param matrix
      */
    def negative(multiply: Boolean): Unit = js.native
    
    /**
      * Night effect
      * @param intensity - The intensity of the night effect.
      * @param multiply - if true, current matrix and matrix are multiplied. If false,
      *  just set the current matrix with @param matrix
      */
    def night(intensity: Double, multiply: Boolean): Unit = js.native
    
    /**
      * Polaroid filter
      * @param multiply - if true, current matrix and matrix are multiplied. If false,
      *  just set the current matrix with @param matrix
      */
    def polaroid(multiply: Boolean): Unit = js.native
    
    /**
      * Predator effect
      *
      * Erase the current matrix by setting a new indepent one
      * @param amount - how much the predator feels his future victim
      * @param multiply - if true, current matrix and matrix are multiplied. If false,
      *  just set the current matrix with @param matrix
      */
    def predator(amount: Double, multiply: Boolean): Unit = js.native
    
    /** Erase the current matrix by setting the default one. */
    def reset(): Unit = js.native
    
    /**
      * Set the saturation matrix, increase the separation between colors
      * Increase saturation : increase contrast, brightness, and sharpness
      * @param amount - The saturation amount (0-1)
      * @param multiply - if true, current matrix and matrix are multiplied. If false,
      *  just set the current matrix with @param matrix
      */
    def saturate(): Unit = js.native
    def saturate(amount: Double): Unit = js.native
    def saturate(amount: Double, multiply: Boolean): Unit = js.native
    def saturate(amount: Unit, multiply: Boolean): Unit = js.native
    
    /**
      * Sepia image
      * @param multiply - if true, current matrix and matrix are multiplied. If false,
      *  just set the current matrix with @param matrix
      */
    def sepia(multiply: Boolean): Unit = js.native
    
    /**
      * Color motion picture process invented in 1916 (thanks Dominic Szablewski)
      * @param multiply - if true, current matrix and matrix are multiplied. If false,
      *  just set the current matrix with @param matrix
      */
    def technicolor(multiply: Boolean): Unit = js.native
    
    /**
      * Sets each channel on the diagonal of the color matrix.
      * This can be used to achieve a tinting effect on Containers similar to the tint field of some
      * display objects like Sprite, Text, Graphics, and Mesh.
      * @param color - Color of the tint. This is a hex value.
      * @param multiply - if true, current matrix and matrix are multiplied. If false,
      *  just set the current matrix with @param matrix
      */
    def tint(color: Double): Unit = js.native
    def tint(color: Double, multiply: Boolean): Unit = js.native
    
    /**
      * Filter who transforms : Red -> Blue and Blue -> Red
      * @param multiply - if true, current matrix and matrix are multiplied. If false,
      *  just set the current matrix with @param matrix
      */
    def toBGR(multiply: Boolean): Unit = js.native
    
    /**
      * Vintage filter (thanks Dominic Szablewski)
      * @param multiply - if true, current matrix and matrix are multiplied. If false,
      *  just set the current matrix with @param matrix
      */
    def vintage(multiply: Boolean): Unit = js.native
  }
  
  type ColorMatrix = ArrayFixed[Double, `20`]
}
