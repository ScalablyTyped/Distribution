package typings.phaser.typesMatterMod

import typings.std.CanvasRenderingContext2D
import typings.std.HTMLCanvasElement
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRenderDefinition extends js.Object {
  /**
    * A `Bounds` object that specifies the drawing view region.
    * Rendering will be automatically transformed and scaled to fit within the canvas size (`render.options.width` and `render.options.height`).
    * This allows for creating views that can pan or zoom around the scene.
    * You must also set `render.options.hasBounds` to `true` to enable bounded rendering.
    *
    * @property bounds
    * @type bounds
    */
  var bounds: js.UndefOr[Bounds] = js.undefined
  /**
    * The canvas element to render to. If not specified, one will be created if `render.element` has been specified.
    *
    * @property canvas
    * @type HTMLCanvasElement
    * @default null
    */
  var canvas: js.UndefOr[HTMLCanvasElement] = js.undefined
  /**
    * The 2d rendering context from the `render.canvas` element.
    *
    * @property context
    * @type CanvasRenderingContext2D
    */
  var context: js.UndefOr[CanvasRenderingContext2D] = js.undefined
  /**
    * A back-reference to the `Matter.Render` module.
    *
    * @property controller
    * @type render
    */
  var controller: js.UndefOr[js.Any] = js.undefined
  /**
    * A reference to the element where the canvas is to be inserted (if `render.canvas` has not been specified)
    *
    * @property element
    * @type HTMLElement
    * @default null
    * @deprecated
    */
  var element: js.UndefOr[HTMLElement] = js.undefined
  /**
    * A reference to the `Matter.Engine` instance to be used.
    *
    * @property engine
    * @type engine
    */
  var engine: Engine
  /**
    * The configuration options of the renderer.
    *
    * @property options
    * @type {}
    */
  var options: js.UndefOr[IRendererOptions] = js.undefined
  /**
    * The sprite texture cache.
    *
    * @property textures
    * @type {}
    */
  var textures: js.UndefOr[js.Any] = js.undefined
}

object IRenderDefinition {
  @scala.inline
  def apply(
    engine: Engine,
    bounds: Bounds = null,
    canvas: HTMLCanvasElement = null,
    context: CanvasRenderingContext2D = null,
    controller: js.Any = null,
    element: HTMLElement = null,
    options: IRendererOptions = null,
    textures: js.Any = null
  ): IRenderDefinition = {
    val __obj = js.Dynamic.literal(engine = engine.asInstanceOf[js.Any])
    if (bounds != null) __obj.updateDynamic("bounds")(bounds.asInstanceOf[js.Any])
    if (canvas != null) __obj.updateDynamic("canvas")(canvas.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (controller != null) __obj.updateDynamic("controller")(controller.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (textures != null) __obj.updateDynamic("textures")(textures.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRenderDefinition]
  }
}

