package typings.phaser.typesMatterMod

import typings.std.CanvasRenderingContext2D
import typings.std.HTMLCanvasElement
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("phaser/types/matter", "Render")
@js.native
class Render () extends js.Object {
  /**
    * A `Bounds` object that specifies the drawing view region.
    * Rendering will be automatically transformed and scaled to fit within the canvas size (`render.options.width` and `render.options.height`).
    * This allows for creating views that can pan or zoom around the scene.
    * You must also set `render.options.hasBounds` to `true` to enable bounded rendering.
    *
    * @property bounds
    * @type bounds
    */
  var bounds: Bounds = js.native
  /**
    * The canvas element to render to. If not specified, one will be created if `render.element` has been specified.
    *
    * @property canvas
    * @type HTMLCanvasElement
    * @default null
    */
  var canvas: HTMLCanvasElement = js.native
  /**
    * The 2d rendering context from the `render.canvas` element.
    *
    * @property context
    * @type CanvasRenderingContext2D
    */
  var context: CanvasRenderingContext2D = js.native
  /**
    * A back-reference to the `Matter.Render` module.
    *
    * @property controller
    * @type render
    */
  var controller: js.Any = js.native
  /**
    * A reference to the element where the canvas is to be inserted (if `render.canvas` has not been specified)
    *
    * @property element
    * @type HTMLElement
    * @default null
    */
  var element: HTMLElement = js.native
  /**
    * The configuration options of the renderer.
    *
    * @property options
    * @type {}
    */
  var options: IRendererOptions = js.native
  /**
    * The sprite texture cache.
    *
    * @property textures
    * @type {}
    */
  var textures: js.Any = js.native
}

/* static members */
@JSImport("phaser/types/matter", "Render")
@js.native
object Render extends js.Object {
  /**
    * Creates a new renderer. The options parameter is an object that specifies any properties you wish to override the defaults.
    * All properties have default values, and many are pre-calculated automatically based on other properties.
    * See the properties section below for detailed information on what you can pass via the `options` object.
    * @method create
    * @param {object} [options]
    * @return {render} A new renderer
    */
  def create(options: IRenderDefinition): Render = js.native
  /**
    * Continuously updates the render canvas on the `requestAnimationFrame` event.
    * @method run
    * @param {render} render
    */
  def run(render: Render): Unit = js.native
  /**
    * Sets the pixel ratio of the renderer and updates the canvas.
    * To automatically detect the correct ratio, pass the string `'auto'` for `pixelRatio`.
    * @method setPixelRatio
    * @param {render} render
    * @param {number} pixelRatio
    */
  def setPixelRatio(render: Render, pixelRatio: Double): Unit = js.native
  /**
    * Ends execution of `Render.run` on the given `render`, by canceling the animation frame request event loop.
    * @method stop
    * @param {render} render
    */
  def stop(render: Render): Unit = js.native
  /**
    * Renders the given `engine`'s `Matter.World` object.
    * This is the entry point for all rendering and should be called every time the scene changes.
    * @method world
    * @param {engine} engine
    */
  def world(render: Render): Unit = js.native
}

