package typings.pixiJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Filter is a special type of WebGL shader that is applied to the screen.
  *
  * {@link http://pixijs.io/examples/#/filters/blur-filter.js Example} of the
  * {@link PIXI.filters.BlurFilter BlurFilter}.
  *
  * ### Usage
  * Filters can be applied to any DisplayObject or Container.
  * PixiJS' `FilterSystem` renders the container into temporary Framebuffer,
  * then filter renders it to the screen.
  * Multiple filters can be added to the `filters` array property and stacked on each other.
  *
  * ```
  * const filter = new PIXI.Filter(myShaderVert, myShaderFrag, { myUniform: 0.5 });
  * const container = new PIXI.Container();
  * container.filters = [filter];
  * ```
  *
  * ### Previous Version Differences
  *
  * In PixiJS **v3**, a filter was always applied to _whole screen_.
  *
  * In PixiJS **v4**, a filter can be applied _only part of the screen_.
  * Developers had to create a set of uniforms to deal with coordinates.
  *
  * In PixiJS **v5** combines _both approaches_.
  * Developers can use normal coordinates of v3 and then allow filter to use partial Framebuffers,
  * bringing those extra uniforms into account.
  *
  * Also be aware that we have changed default vertex shader, please consult
  * {@link https://github.com/pixijs/pixi.js/wiki/v5-Creating-filters Wiki}.
  *
  * ### Built-in Uniforms
  *
  * PixiJS viewport uses screen (CSS) coordinates, `(0, 0, renderer.screen.width, renderer.screen.height)`,
  * and `projectionMatrix` uniform maps it to the gl viewport.
  *
  * **uSampler**
  *
  * The most important uniform is the input texture that container was rendered into.
  * _Important note: as with all Framebuffers in PixiJS, both input and output are
  * premultiplied by alpha._
  *
  * By default, input normalized coordinates are passed to fragment shader with `vTextureCoord`.
  * Use it to sample the input.
  *
  * ```
  * const fragment = `
  * varying vec2 vTextureCoord;
  * uniform sampler2D uSampler;
  * void main(void)
  * {
  *    gl_FragColor = texture2D(uSampler, vTextureCoord);
  * }
  * `;
  *
  * const myFilter = new PIXI.Filter(null, fragment);
  * ```
  *
  * This filter is just one uniform less than {@link PIXI.filters.AlphaFilter AlphaFilter}.
  *
  * **outputFrame**
  *
  * The `outputFrame` holds the rectangle where filter is applied in screen (CSS) coordinates.
  * It's the same as `renderer.screen` for a fullscreen filter.
  * Only a part of  `outputFrame.zw` size of temporary Framebuffer is used,
  * `(0, 0, outputFrame.width, outputFrame.height)`,
  *
  * Filters uses this quad to normalized (0-1) space, its passed into `aVertexPosition` attribute.
  * To calculate vertex position in screen space using normalized (0-1) space:
  *
  * ```
  * vec4 filterVertexPosition( void )
  * {
  *     vec2 position = aVertexPosition * max(outputFrame.zw, vec2(0.)) + outputFrame.xy;
  *     return vec4((projectionMatrix * vec3(position, 1.0)).xy, 0.0, 1.0);
  * }
  * ```
  *
  * **inputSize**
  *
  * Temporary framebuffer is different, it can be either the size of screen, either power-of-two.
  * The `inputSize.xy` are size of temporary framebuffer that holds input.
  * The `inputSize.zw` is inverted, it's a shortcut to evade division inside the shader.
  *
  * Set `inputSize.xy = outputFrame.zw` for a fullscreen filter.
  *
  * To calculate input normalized coordinate, you have to map it to filter normalized space.
  * Multiply by `outputFrame.zw` to get input coordinate.
  * Divide by `inputSize.xy` to get input normalized coordinate.
  *
  * ```
  * vec2 filterTextureCoord( void )
  * {
  *     return aVertexPosition * (outputFrame.zw * inputSize.zw); // same as /inputSize.xy
  * }
  * ```
  * **resolution**
  *
  * The `resolution` is the ratio of screen (CSS) pixels to real pixels.
  *
  * **inputPixel**
  *
  * `inputPixel.xy` is the size of framebuffer in real pixels, same as `inputSize.xy * resolution`
  * `inputPixel.zw` is inverted `inputPixel.xy`.
  *
  * It's handy for filters that use neighbour pixels, like {@link PIXI.filters.FXAAFilter FXAAFilter}.
  *
  * **inputClamp**
  *
  * If you try to get info from outside of used part of Framebuffer - you'll get undefined behaviour.
  * For displacements, coordinates has to be clamped.
  *
  * The `inputClamp.xy` is left-top pixel center, you may ignore it, because we use left-top part of Framebuffer
  * `inputClamp.zw` is bottom-right pixel center.
  *
  * ```
  * vec4 color = texture2D(uSampler, clamp(modifigedTextureCoord, inputClamp.xy, inputClamp.zw))
  * ```
  * OR
  * ```
  * vec4 color = texture2D(uSampler, min(modifigedTextureCoord, inputClamp.zw))
  * ```
  *
  * ### Additional Information
  *
  * Complete documentation on Filter usage is located in the
  * {@link https://github.com/pixijs/pixi.js/wiki/v5-Creating-filters Wiki}.
  *
  * Since PixiJS only had a handful of built-in filters, additional filters can be downloaded
  * {@link https://github.com/pixijs/pixi-filters here} from the PixiJS Filters repository.
  *
  * @class
  * @memberof PIXI
  * @extends PIXI.Shader
  */
@JSImport("pixi.js", "Filter")
@js.native
class Filter ()
  extends typings.pixiJs.PIXI.Filter {
  def this(vertexSrc: String) = this()
  def this(vertexSrc: js.UndefOr[scala.Nothing], fragmentSrc: String) = this()
  def this(vertexSrc: String, fragmentSrc: String) = this()
  def this(vertexSrc: js.UndefOr[scala.Nothing], fragmentSrc: js.UndefOr[scala.Nothing], uniforms: js.Any) = this()
  def this(vertexSrc: js.UndefOr[scala.Nothing], fragmentSrc: String, uniforms: js.Any) = this()
  def this(vertexSrc: String, fragmentSrc: js.UndefOr[scala.Nothing], uniforms: js.Any) = this()
  def this(vertexSrc: String, fragmentSrc: String, uniforms: js.Any) = this()
}
/* static members */
@JSImport("pixi.js", "Filter")
@js.native
object Filter extends js.Object {
  
  /**
    * The default fragment shader source
    *
    * @static
    * @type {string}
    * @constant
    */
  val defaultFragmentSrc: String = js.native
  
  /**
    * The default vertex shader source
    *
    * @static
    * @type {string}
    * @constant
    */
  val defaultVertexSrc: String = js.native
}
