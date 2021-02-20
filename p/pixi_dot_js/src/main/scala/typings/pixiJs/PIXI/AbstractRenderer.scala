package typings.pixiJs.PIXI

import typings.pixiJs.PIXI.utils.EventEmitter
import typings.std.HTMLCanvasElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The AbstractRenderer is the base for a PixiJS Renderer. It is extended by the {@link PIXI.CanvasRenderer}
  * and {@link PIXI.Renderer} which can be used for rendering a PixiJS scene.
  *
  * @abstract
  * @class
  * @extends PIXI.utils.EventEmitter
  * @memberof PIXI
  */
@js.native
trait AbstractRenderer extends EventEmitter {
  
  /**
    * The background color as a number.
    *
    * @member {number} PIXI.AbstractRenderer#_backgroundColor
    * @protected
    */
  var _backgroundColor: Double = js.native
  
  /**
    * The background color as an [R, G, B] array.
    *
    * @member {number[]} PIXI.AbstractRenderer#_backgroundColorRgba
    * @protected
    */
  var _backgroundColorRgba: js.Array[Double] = js.native
  
  /**
    * The background color as a string.
    *
    * @member {string} PIXI.AbstractRenderer#_backgroundColorString
    * @protected
    */
  var _backgroundColorString: String = js.native
  
  /**
    * The last root object that the renderer tried to render.
    *
    * @member {PIXI.DisplayObject} PIXI.AbstractRenderer#_lastObjectRendered
    * @protected
    */
  var _lastObjectRendered: DisplayObject = js.native
  
  /**
    * Whether CSS dimensions of canvas view should be resized to screen dimensions automatically.
    *
    * @member {boolean} PIXI.AbstractRenderer#autoDensity
    */
  var autoDensity: Boolean = js.native
  
  /**
    * The background color to fill if not transparent
    *
    * @member {number}
    */
  var backgroundColor: Double = js.native
  
  /**
    * This sets if the CanvasRenderer will clear the canvas or not before the new render pass.
    * If the scene is NOT transparent PixiJS will use a canvas sized fillRect operation every
    * frame to set the canvas background color. If the scene is transparent PixiJS will use clearRect
    * to clear the canvas every frame. Disable this by setting this to false. For example, if
    * your game has a canvas filling background image you often don't need this set.
    *
    * @member {boolean} PIXI.AbstractRenderer#clearBeforeRender
    * @default
    */
  var clearBeforeRender: Boolean = js.native
  
  /**
    * Removes everything from the renderer and optionally removes the Canvas DOM element.
    *
    * @param {boolean} [removeView=false] - Removes the Canvas element from the DOM.
    */
  def destroy(): Unit = js.native
  def destroy(removeView: Boolean): Unit = js.native
  
  /**
    * Useful function that returns a texture of the display object that can then be used to create sprites
    * This can be quite useful if your displayObject is complicated and needs to be reused multiple times.
    *
    * @param {PIXI.DisplayObject} displayObject - The displayObject the object will be generated from.
    * @param {PIXI.SCALE_MODES} scaleMode - The scale mode of the texture.
    * @param {number} resolution - The resolution / device pixel ratio of the texture being generated.
    * @param {PIXI.Rectangle} [region] - The region of the displayObject, that shall be rendered,
    *        if no region is specified, defaults to the local bounds of the displayObject.
    * @return {PIXI.RenderTexture} A texture of the graphics object.
    */
  def generateTexture(displayObject: DisplayObject, scaleMode: SCALE_MODES, resolution: Double): RenderTexture = js.native
  def generateTexture(displayObject: DisplayObject, scaleMode: SCALE_MODES, resolution: Double, region: Rectangle): RenderTexture = js.native
  
  /**
    * Same as view.height, actual number of pixels in the canvas by vertical.
    *
    * @member {number}
    * @readonly
    * @default 600
    */
  val height: Double = js.native
  
  /**
    * Initialize the plugins.
    *
    * @protected
    * @param {object} staticMap - The dictionary of statically saved plugins.
    */
  /* protected */ def initPlugins(staticMap: js.Any): Unit = js.native
  
  /**
    * The supplied constructor options.
    *
    * @member {Object} PIXI.AbstractRenderer#options
    * @readOnly
    */
  val options: js.Any = js.native
  
  /**
    * Collection of plugins.
    * @readonly
    * @member {object} PIXI.AbstractRenderer#plugins
    */
  val plugins: js.Any = js.native
  
  /**
    * The value of the preserveDrawingBuffer flag affects whether or not the contents of
    * the stencil buffer is retained after rendering.
    *
    * @member {boolean} PIXI.AbstractRenderer#preserveDrawingBuffer
    */
  var preserveDrawingBuffer: Boolean = js.native
  
  /**
    * Resizes the screen and canvas to the specified width and height.
    * Canvas dimensions are multiplied by resolution.
    *
    * @param {number} screenWidth - The new width of the screen.
    * @param {number} screenHeight - The new height of the screen.
    */
  def resize(screenWidth: Double, screenHeight: Double): Unit = js.native
  
  /**
    * The resolution / device pixel ratio of the renderer.
    *
    * @member {number} PIXI.AbstractRenderer#resolution
    * @default 1
    */
  var resolution: Double = js.native
  
  /**
    * Measurements of the screen. (0, 0, screenWidth, screenHeight).
    *
    * Its safe to use as filterArea or hitArea for the whole stage.
    *
    * @member {PIXI.Rectangle} PIXI.AbstractRenderer#screen
    */
  var screen: Rectangle = js.native
  
  /**
    * Whether the render view is transparent.
    *
    * @member {boolean} PIXI.AbstractRenderer#transparent
    */
  var transparent: Boolean = js.native
  
  /**
    * The type of the renderer.
    *
    * @member {number} PIXI.AbstractRenderer#type
    * @default PIXI.RENDERER_TYPE.UNKNOWN
    * @see PIXI.RENDERER_TYPE
    */
  var `type`: Double = js.native
  
  /**
    * The canvas element that everything is drawn to.
    *
    * @member {HTMLCanvasElement} PIXI.AbstractRenderer#view
    */
  var view: HTMLCanvasElement = js.native
  
  /**
    * Same as view.width, actual number of pixels in the canvas by horizontal.
    *
    * @member {number}
    * @readonly
    * @default 800
    */
  val width: Double = js.native
}
