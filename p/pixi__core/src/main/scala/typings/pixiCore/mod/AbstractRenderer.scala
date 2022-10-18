package typings.pixiCore.mod

import typings.pixiConstants.mod.RENDERER_TYPE
import typings.pixiConstants.mod.SCALE_MODES
import typings.pixiCore.pixiCoreStrings.notMultiplied
import typings.pixiMath.mod.Rectangle
import typings.pixiUtils.mod.EventEmitter
import typings.std.HTMLCanvasElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("@pixi/core", "AbstractRenderer")
@js.native
/**
  * @param type - The renderer type.
  * @param [options] - The optional renderer parameters.
  * @param {number} [options.width=800] - The width of the screen.
  * @param {number} [options.height=600] - The height of the screen.
  * @param {HTMLCanvasElement} [options.view] - The canvas to use as a view, optional.
  * @param {boolean} [options.useContextAlpha=true] - Pass-through value for canvas' context `alpha` property.
  *   If you want to set transparency, please use `backgroundAlpha`. This option is for cases where the
  *   canvas needs to be opaque, possibly for performance reasons on some older devices.
  * @param {boolean} [options.autoDensity=false] - Resizes renderer view in CSS pixels to allow for
  *   resolutions other than 1.
  * @param {boolean} [options.antialias=false] - Sets antialias
  * @param {number} [options.resolution=PIXI.settings.RESOLUTION] - The resolution / device pixel ratio of the renderer.
  * @param {boolean} [options.preserveDrawingBuffer=false] - Enables drawing buffer preservation,
  *  enable this if you need to call toDataUrl on the WebGL context.
  * @param {boolean} [options.clearBeforeRender=true] - This sets if the renderer will clear the canvas or
  *      not before the new render pass.
  * @param {number} [options.backgroundColor=0x000000] - The background color of the rendered area
  *  (shown if not transparent).
  * @param {number} [options.backgroundAlpha=1] - Value from 0 (fully transparent) to 1 (fully opaque).
  */
open class AbstractRenderer ()
  extends EventEmitter[String | js.Symbol, Any] {
  def this(`type`: RENDERER_TYPE) = this()
  def this(`type`: Unit, options: IRendererOptions) = this()
  def this(`type`: RENDERER_TYPE, options: IRendererOptions) = this()
  
  /* protected */ var _backgroundColor: Double = js.native
  
  var _backgroundColorRgba: js.Array[Double] = js.native
  
  /* protected */ var _backgroundColorString: String = js.native
  
  var _lastObjectRendered: IRenderableObject = js.native
  
  /**
    * Adds a new system to the renderer.
    * @param ClassRef - Class reference
    * @param name - Property name for system
    * @returns Return instance of renderer
    */
  def addSystem(ClassRef: ISystemConstructor[Renderer], name: String): this.type = js.native
  
  val autoDensity: Boolean = js.native
  
  /**
    * The background color alpha. Setting this to 0 will make the canvas transparent.
    * @member {number}
    */
  def backgroundAlpha: Double = js.native
  def backgroundAlpha_=(value: Double): Unit = js.native
  
  /**
    * The background color to fill if not transparent
    * @member {number}
    */
  def backgroundColor: Double = js.native
  def backgroundColor_=(value: Double): Unit = js.native
  
  var clearBeforeRender: js.UndefOr[Boolean] = js.native
  
  /**
    * Removes everything from the renderer and optionally removes the Canvas DOM element.
    * @param [removeView=false] - Removes the Canvas element from the DOM.
    */
  def destroy(): Unit = js.native
  def destroy(removeView: Boolean): Unit = js.native
  
  /**
    * Useful function that returns a texture of the display object that can then be used to create sprites
    * This can be quite useful if your displayObject is complicated and needs to be reused multiple times.
    * @method PIXI.AbstractRenderer#generateTexture
    * @param displayObject - The displayObject the object will be generated from.
    * @param {object} options - Generate texture options.
    * @param {PIXI.SCALE_MODES} options.scaleMode - The scale mode of the texture.
    * @param {number} options.resolution - The resolution / device pixel ratio of the texture being generated.
    * @param {PIXI.Rectangle} options.region - The region of the displayObject, that shall be rendered,
    *        if no region is specified, defaults to the local bounds of the displayObject.
    * @param {PIXI.MSAA_QUALITY} options.multisample - The number of samples of the frame buffer.
    * @returns A texture of the graphics object.
    */
  def generateTexture(displayObject: IRenderableObject): RenderTexture = js.native
  def generateTexture(displayObject: IRenderableObject, options: IGenerateTextureOptions): RenderTexture = js.native
  def generateTexture(displayObject: IRenderableObject, scaleMode: Unit, resolution: Double): RenderTexture = js.native
  def generateTexture(displayObject: IRenderableObject, scaleMode: Unit, resolution: Double, region: Rectangle): RenderTexture = js.native
  def generateTexture(displayObject: IRenderableObject, scaleMode: Unit, resolution: Unit, region: Rectangle): RenderTexture = js.native
  def generateTexture(displayObject: IRenderableObject, scaleMode: SCALE_MODES): RenderTexture = js.native
  def generateTexture(displayObject: IRenderableObject, scaleMode: SCALE_MODES, resolution: Double): RenderTexture = js.native
  def generateTexture(displayObject: IRenderableObject, scaleMode: SCALE_MODES, resolution: Double, region: Rectangle): RenderTexture = js.native
  def generateTexture(displayObject: IRenderableObject, scaleMode: SCALE_MODES, resolution: Unit, region: Rectangle): RenderTexture = js.native
  
  /**
    * Same as view.height, actual number of pixels in the canvas by vertical.
    * @member {number}
    * @readonly
    * @default 600
    */
  def height: Double = js.native
  
  /**
    * Initialize the plugins.
    * @protected
    * @param {object} staticMap - The dictionary of statically saved plugins.
    */
  def initPlugins(staticMap: IRendererPlugins): Unit = js.native
  
  val options: IRendererOptions = js.native
  
  val plugins: IRendererPlugins = js.native
  
  val preserveDrawingBuffer: Boolean = js.native
  
  def render(displayObject: IRenderableObject): Unit = js.native
  def render(displayObject: IRenderableObject, options: IRendererRenderOptions): Unit = js.native
  
  /**
    * Resizes the screen and canvas as close as possible to the specified width and height.
    * Canvas dimensions are multiplied by resolution and rounded to the nearest integers.
    * The new canvas dimensions divided by the resolution become the new screen dimensions.
    * @param desiredScreenWidth - The desired width of the screen.
    * @param desiredScreenHeight - The desired height of the screen.
    */
  def resize(desiredScreenWidth: Double, desiredScreenHeight: Double): Unit = js.native
  
  var resolution: Double = js.native
  
  val screen: Rectangle = js.native
  
  val `type`: RENDERER_TYPE = js.native
  
  val useContextAlpha: Boolean | notMultiplied = js.native
  
  val view: HTMLCanvasElement = js.native
  
  /**
    * Same as view.width, actual number of pixels in the canvas by horizontal.
    * @member {number}
    * @readonly
    * @default 800
    */
  def width: Double = js.native
}
