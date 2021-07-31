package typings.pixiJs.PIXI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This namespace contains WebGL-only display filters that can be applied
  * to DisplayObjects using the {@link PIXI.DisplayObject#filters filters} property.
  *
  * Since PixiJS only had a handful of built-in filters, additional filters
  * can be downloaded {@link https://github.com/pixijs/pixi-filters here} from the
  * PixiJS Filters repository.
  *
  * All filters must extend {@link PIXI.Filter}.
  *
  * @example
  * // Create a new application
  * const app = new PIXI.Application();
  *
  * // Draw a green rectangle
  * const rect = new PIXI.Graphics()
  *     .beginFill(0x00ff00)
  *     .drawRect(40, 40, 200, 200);
  *
  * // Add a blur filter
  * rect.filters = [new PIXI.filters.BlurFilter()];
  *
  * // Display rectangle
  * app.stage.addChild(rect);
  * document.body.appendChild(app.view);
  * @namespace PIXI.filters
  */
object filters {
  
  /**
    * Simplest filter - applies alpha.
    *
    * Use this instead of Container's alpha property to avoid visual layering of individual elements.
    * AlphaFilter applies alpha evenly across the entire display object and any opaque elements it contains.
    * If elements are not opaque, they will blend with each other anyway.
    *
    * Very handy if you want to use common features of all filters:
    *
    * 1. Assign a blendMode to this filter, blend all elements inside display object with background.
    *
    * 2. To use clipping in display coordinates, assign a filterArea to the same container that has this filter.
    *
    * @class
    * @extends PIXI.Filter
    * @memberof PIXI.filters
    */
  @js.native
  trait AlphaFilter
    extends StObject
       with Filter {
    
    /**
      * Coefficient for alpha multiplication
      *
      * @member {number}
      * @default 1
      */
    var alpha: Double = js.native
  }
  
  /**
    * The BlurFilter applies a Gaussian blur to an object.
    *
    * The strength of the blur can be set for the x-axis and y-axis separately.
    *
    * @class
    * @extends PIXI.Filter
    * @memberof PIXI.filters
    */
  @js.native
  trait BlurFilter
    extends StObject
       with Filter {
    
    /**
      * Sets the strength of both the blurX and blurY properties simultaneously
      *
      * @member {number}
      * @default 2
      */
    var blur: Double = js.native
    
    /**
      * Sets the strength of the blurX property
      *
      * @member {number}
      * @default 2
      */
    var blurX: Double = js.native
    
    /**
      * Sets the strength of the blurY property
      *
      * @member {number}
      * @default 2
      */
    var blurY: Double = js.native
    
    /**
      * Sets the number of passes for blur. More passes means higher quaility bluring.
      *
      * @member {number}
      * @default 1
      */
    var quality: Double = js.native
    
    /**
      * If set to true the edge of the target will be clamped
      *
      * @member {boolean}
      * @default false
      */
    var repeatEdgePixels: Boolean = js.native
  }
  
  /**
    * The BlurFilterPass applies a horizontal or vertical Gaussian blur to an object.
    *
    * @class
    * @extends PIXI.Filter
    * @memberof PIXI.filters
    */
  @js.native
  trait BlurFilterPass
    extends StObject
       with Filter {
    
    /**
      * Sets the strength of both the blur.
      *
      * @member {number}
      * @default 16
      */
    var blur: Double = js.native
    
    /**
      * Sets the quality of the blur by modifying the number of passes. More passes means higher
      * quaility bluring but the lower the performance.
      *
      * @member {number}
      * @default 4
      */
    var quality: Double = js.native
  }
  
  /**
    * The ColorMatrixFilter class lets you apply a 5x4 matrix transformation on the RGBA
    * color and alpha values of every pixel on your displayObject to produce a result
    * with a new set of RGBA color and alpha values. It's pretty powerful!
    *
    * ```js
    *  let colorMatrix = new PIXI.filters.ColorMatrixFilter();
    *  container.filters = [colorMatrix];
    *  colorMatrix.contrast(2);
    * ```
    * @author Clément Chenebault <clement@goodboydigital.com>
    * @class
    * @extends PIXI.Filter
    * @memberof PIXI.filters
    */
  @js.native
  trait ColorMatrixFilter
    extends StObject
       with Filter {
    
    /**
      * Transforms current matrix and set the new one
      *
      * @param {number[]} matrix - 5x4 matrix
      * @param {boolean} multiply - if true, current matrix and matrix are multiplied. If false,
      *  just set the current matrix with @param matrix
      */
    def _loadMatrix(matrix: js.Array[Double], multiply: Boolean): Unit = js.native
    
    /**
      * The opacity value to use when mixing the original and resultant colors.
      *
      * When the value is 0, the original color is used without modification.
      * When the value is 1, the result color is used.
      * When in the range (0, 1) the color is interpolated between the original and result by this amount.
      *
      * @member {number}
      * @default 1
      */
    var alpha: Double = js.native
    
    /**
      * Set the black and white matrice.
      *
      * @param {boolean} multiply - if true, current matrix and matrix are multiplied. If false,
      *  just set the current matrix with @param matrix
      */
    def blackAndWhite(multiply: Boolean): Unit = js.native
    
    /**
      * Adjusts brightness
      *
      * @param {number} b - value of the brigthness (0-1, where 0 is black)
      * @param {boolean} multiply - if true, current matrix and matrix are multiplied. If false,
      *  just set the current matrix with @param matrix
      */
    def brightness(b: Double, multiply: Boolean): Unit = js.native
    
    /**
      * Brown delicious browni filter (thanks Dominic Szablewski)
      *
      * @param {boolean} multiply - if true, current matrix and matrix are multiplied. If false,
      *  just set the current matrix with @param matrix
      */
    def browni(multiply: Boolean): Unit = js.native
    
    /**
      * We don't know exactly what it does, kind of gradient map, but funny to play with!
      *
      * @param {number} desaturation - Tone values.
      * @param {number} toned - Tone values.
      * @param {number} lightColor - Tone values, example: `0xFFE580`
      * @param {number} darkColor - Tone values, example: `0xFFE580`
      * @param {boolean} multiply - if true, current matrix and matrix are multiplied. If false,
      *  just set the current matrix with @param matrix
      */
    def colorTone(desaturation: Double, toned: Double, lightColor: Double, darkColor: Double, multiply: Boolean): Unit = js.native
    
    /**
      * Set the contrast matrix, increase the separation between dark and bright
      * Increase contrast : shadows darker and highlights brighter
      * Decrease contrast : bring the shadows up and the highlights down
      *
      * @param {number} amount - value of the contrast (0-1)
      * @param {boolean} multiply - if true, current matrix and matrix are multiplied. If false,
      *  just set the current matrix with @param matrix
      */
    def contrast(amount: Double, multiply: Boolean): Unit = js.native
    
    /**
      * Desaturate image (remove color)
      *
      * Call the saturate function
      *
      */
    def desaturate(): Unit = js.native
    
    /**
      * Set the matrices in grey scales
      *
      * @param {number} scale - value of the grey (0-1, where 0 is black)
      * @param {boolean} multiply - if true, current matrix and matrix are multiplied. If false,
      *  just set the current matrix with @param matrix
      */
    def greyscale(scale: Double, multiply: Boolean): Unit = js.native
    
    /**
      * Set the hue property of the color
      *
      * @param {number} rotation - in degrees
      * @param {boolean} multiply - if true, current matrix and matrix are multiplied. If false,
      *  just set the current matrix with @param matrix
      */
    def hue(rotation: Double, multiply: Boolean): Unit = js.native
    
    /**
      * Color reversal film introduced by Eastman Kodak in 1935. (thanks Dominic Szablewski)
      *
      * @param {boolean} multiply - if true, current matrix and matrix are multiplied. If false,
      *  just set the current matrix with @param matrix
      */
    def kodachrome(multiply: Boolean): Unit = js.native
    
    /**
      * LSD effect
      *
      * Multiply the current matrix
      *
      * @param {boolean} multiply - if true, current matrix and matrix are multiplied. If false,
      *  just set the current matrix with @param matrix
      */
    def lsd(multiply: Boolean): Unit = js.native
    
    /**
      * The matrix of the color matrix filter
      *
      * @member {number[]}
      * @default [1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0]
      */
    var matrix: js.Array[Double] = js.native
    
    /**
      * Negative image (inverse of classic rgb matrix)
      *
      * @param {boolean} multiply - if true, current matrix and matrix are multiplied. If false,
      *  just set the current matrix with @param matrix
      */
    def negative(multiply: Boolean): Unit = js.native
    
    /**
      * Night effect
      *
      * @param {number} intensity - The intensity of the night effect.
      * @param {boolean} multiply - if true, current matrix and matrix are multiplied. If false,
      *  just set the current matrix with @param matrix
      */
    def night(intensity: Double, multiply: Boolean): Unit = js.native
    
    /**
      * Polaroid filter
      *
      * @param {boolean} multiply - if true, current matrix and matrix are multiplied. If false,
      *  just set the current matrix with @param matrix
      */
    def polaroid(multiply: Boolean): Unit = js.native
    
    /**
      * Predator effect
      *
      * Erase the current matrix by setting a new indepent one
      *
      * @param {number} amount - how much the predator feels his future victim
      * @param {boolean} multiply - if true, current matrix and matrix are multiplied. If false,
      *  just set the current matrix with @param matrix
      */
    def predator(amount: Double, multiply: Boolean): Unit = js.native
    
    /**
      * Erase the current matrix by setting the default one
      *
      */
    def reset(): Unit = js.native
    
    /**
      * Set the saturation matrix, increase the separation between colors
      * Increase saturation : increase contrast, brightness, and sharpness
      *
      * @param {number} amount - The saturation amount (0-1)
      * @param {boolean} [multiply] - if true, current matrix and matrix are multiplied. If false,
      *  just set the current matrix with @param matrix
      */
    def saturate(amount: Double): Unit = js.native
    def saturate(amount: Double, multiply: Boolean): Unit = js.native
    
    /**
      * Sepia image
      *
      * @param {boolean} multiply - if true, current matrix and matrix are multiplied. If false,
      *  just set the current matrix with @param matrix
      */
    def sepia(multiply: Boolean): Unit = js.native
    
    /**
      * Color motion picture process invented in 1916 (thanks Dominic Szablewski)
      *
      * @param {boolean} multiply - if true, current matrix and matrix are multiplied. If false,
      *  just set the current matrix with @param matrix
      */
    def technicolor(multiply: Boolean): Unit = js.native
    
    /**
      * Filter who transforms : Red -> Blue and Blue -> Red
      *
      * @param {boolean} multiply - if true, current matrix and matrix are multiplied. If false,
      *  just set the current matrix with @param matrix
      */
    def toBGR(multiply: Boolean): Unit = js.native
    
    /**
      * Vintage filter (thanks Dominic Szablewski)
      *
      * @param {boolean} multiply - if true, current matrix and matrix are multiplied. If false,
      *  just set the current matrix with @param matrix
      */
    def vintage(multiply: Boolean): Unit = js.native
  }
  
  /**
    * The DisplacementFilter class uses the pixel values from the specified texture
    * (called the displacement map) to perform a displacement of an object.
    *
    * You can use this filter to apply all manor of crazy warping effects.
    * Currently the `r` property of the texture is used to offset the `x`
    * and the `g` property of the texture is used to offset the `y`.
    *
    * The way it works is it uses the values of the displacement map to look up the
    * correct pixels to output. This means it's not technically moving the original.
    * Instead, it's starting at the output and asking "which pixel from the original goes here".
    * For example, if a displacement map pixel has `red = 1` and the filter scale is `20`,
    * this filter will output the pixel approximately 20 pixels to the right of the original.
    *
    * @class
    * @extends PIXI.Filter
    * @memberof PIXI.filters
    */
  @js.native
  trait DisplacementFilter
    extends StObject
       with Filter {
    
    /**
      * The texture used for the displacement map. Must be power of 2 sized texture.
      *
      * @member {PIXI.Texture}
      */
    var map: Texture = js.native
    
    /**
      * scaleX, scaleY for displacements
      * @member {PIXI.Point} PIXI.filters.DisplacementFilter#scale
      */
    var scale: Point = js.native
  }
  
  /**
    * Basic FXAA (Fast Approximate Anti-Aliasing) implementation based on the code on geeks3d.com
    * with the modification that the texture2DLod stuff was removed since it is unsupported by WebGL.
    *
    * @see https://github.com/mitsuhiko/webgl-meincraft
    *
    * @class
    * @extends PIXI.Filter
    * @memberof PIXI.filters
    *
    */
  @js.native
  trait FXAAFilter
    extends StObject
       with Filter
  
  /**
    * A Noise effect filter.
    *
    * @class
    * @extends PIXI.Filter
    * @memberof PIXI.filters
    */
  @js.native
  trait NoiseFilter
    extends StObject
       with Filter {
    
    /**
      * The amount of noise to apply, this value should be in the range (0, 1].
      *
      * @member {number}
      * @default 0.5
      */
    var noise: Double = js.native
    
    /**
      * A seed value to apply to the random noise generation. `Math.random()` is a good value to use.
      *
      * @member {number}
      */
    var seed: Double = js.native
  }
}
