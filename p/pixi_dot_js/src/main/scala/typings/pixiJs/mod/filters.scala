package typings.pixiJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
@JSImport("pixi.js", "filters")
@js.native
object filters extends js.Object {
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
  class AlphaFilter ()
    extends typings.pixiJs.PIXI.filters.AlphaFilter {
    def this(alpha: Double) = this()
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
  class BlurFilter ()
    extends typings.pixiJs.PIXI.filters.BlurFilter {
    def this(strength: Double) = this()
    def this(strength: js.UndefOr[scala.Nothing], quality: Double) = this()
    def this(strength: Double, quality: Double) = this()
    def this(strength: js.UndefOr[scala.Nothing], quality: js.UndefOr[scala.Nothing], resolution: Double) = this()
    def this(strength: js.UndefOr[scala.Nothing], quality: Double, resolution: Double) = this()
    def this(strength: Double, quality: js.UndefOr[scala.Nothing], resolution: Double) = this()
    def this(strength: Double, quality: Double, resolution: Double) = this()
    def this(
      strength: js.UndefOr[scala.Nothing],
      quality: js.UndefOr[scala.Nothing],
      resolution: js.UndefOr[scala.Nothing],
      kernelSize: Double
    ) = this()
    def this(
      strength: js.UndefOr[scala.Nothing],
      quality: js.UndefOr[scala.Nothing],
      resolution: Double,
      kernelSize: Double
    ) = this()
    def this(
      strength: js.UndefOr[scala.Nothing],
      quality: Double,
      resolution: js.UndefOr[scala.Nothing],
      kernelSize: Double
    ) = this()
    def this(strength: js.UndefOr[scala.Nothing], quality: Double, resolution: Double, kernelSize: Double) = this()
    def this(
      strength: Double,
      quality: js.UndefOr[scala.Nothing],
      resolution: js.UndefOr[scala.Nothing],
      kernelSize: Double
    ) = this()
    def this(strength: Double, quality: js.UndefOr[scala.Nothing], resolution: Double, kernelSize: Double) = this()
    def this(strength: Double, quality: Double, resolution: js.UndefOr[scala.Nothing], kernelSize: Double) = this()
    def this(strength: Double, quality: Double, resolution: Double, kernelSize: Double) = this()
  }
  
  /**
    * The BlurFilterPass applies a horizontal or vertical Gaussian blur to an object.
    *
    * @class
    * @extends PIXI.Filter
    * @memberof PIXI.filters
    */
  @js.native
  class BlurFilterPass protected ()
    extends typings.pixiJs.PIXI.filters.BlurFilterPass {
    def this(horizontal: Boolean) = this()
    def this(horizontal: Boolean, strength: Double) = this()
    def this(horizontal: Boolean, strength: js.UndefOr[scala.Nothing], quality: Double) = this()
    def this(horizontal: Boolean, strength: Double, quality: Double) = this()
    def this(
      horizontal: Boolean,
      strength: js.UndefOr[scala.Nothing],
      quality: js.UndefOr[scala.Nothing],
      resolution: Double
    ) = this()
    def this(horizontal: Boolean, strength: js.UndefOr[scala.Nothing], quality: Double, resolution: Double) = this()
    def this(horizontal: Boolean, strength: Double, quality: js.UndefOr[scala.Nothing], resolution: Double) = this()
    def this(horizontal: Boolean, strength: Double, quality: Double, resolution: Double) = this()
    def this(
      horizontal: Boolean,
      strength: js.UndefOr[scala.Nothing],
      quality: js.UndefOr[scala.Nothing],
      resolution: js.UndefOr[scala.Nothing],
      kernelSize: Double
    ) = this()
    def this(
      horizontal: Boolean,
      strength: js.UndefOr[scala.Nothing],
      quality: js.UndefOr[scala.Nothing],
      resolution: Double,
      kernelSize: Double
    ) = this()
    def this(
      horizontal: Boolean,
      strength: js.UndefOr[scala.Nothing],
      quality: Double,
      resolution: js.UndefOr[scala.Nothing],
      kernelSize: Double
    ) = this()
    def this(
      horizontal: Boolean,
      strength: js.UndefOr[scala.Nothing],
      quality: Double,
      resolution: Double,
      kernelSize: Double
    ) = this()
    def this(
      horizontal: Boolean,
      strength: Double,
      quality: js.UndefOr[scala.Nothing],
      resolution: js.UndefOr[scala.Nothing],
      kernelSize: Double
    ) = this()
    def this(
      horizontal: Boolean,
      strength: Double,
      quality: js.UndefOr[scala.Nothing],
      resolution: Double,
      kernelSize: Double
    ) = this()
    def this(
      horizontal: Boolean,
      strength: Double,
      quality: Double,
      resolution: js.UndefOr[scala.Nothing],
      kernelSize: Double
    ) = this()
    def this(horizontal: Boolean, strength: Double, quality: Double, resolution: Double, kernelSize: Double) = this()
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
  class ColorMatrixFilter ()
    extends typings.pixiJs.PIXI.filters.ColorMatrixFilter
  
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
  class DisplacementFilter protected ()
    extends typings.pixiJs.PIXI.filters.DisplacementFilter {
    def this(sprite: typings.pixiJs.PIXI.Sprite) = this()
    def this(sprite: typings.pixiJs.PIXI.Sprite, scale: Double) = this()
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
  class FXAAFilter ()
    extends typings.pixiJs.PIXI.filters.FXAAFilter
  
  /**
    * A Noise effect filter.
    *
    * @class
    * @extends PIXI.Filter
    * @memberof PIXI.filters
    */
  @js.native
  class NoiseFilter ()
    extends typings.pixiJs.PIXI.filters.NoiseFilter {
    def this(noise: Double) = this()
    def this(noise: js.UndefOr[scala.Nothing], seed: Double) = this()
    def this(noise: Double, seed: Double) = this()
  }
  
}

