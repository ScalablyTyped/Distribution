package typings.pixiJs.PIXI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Sprite object is the base for all textured objects that are rendered to the screen
  *
  * A sprite can be created directly from an image like this:
  *
  * ```js
  * let sprite = PIXI.Sprite.from('assets/image.png');
  * ```
  *
  * The more efficient way to create sprites is using a {@link PIXI.Spritesheet},
  * as swapping base textures when rendering to the screen is inefficient.
  *
  * ```js
  * PIXI.Loader.shared.add("assets/spritesheet.json").load(setup);
  *
  * function setup() {
  *   let sheet = PIXI.Loader.shared.resources["assets/spritesheet.json"].spritesheet;
  *   let sprite = new PIXI.Sprite(sheet.textures["image.png"]);
  *   ...
  * }
  * ```
  *
  * @class
  * @extends PIXI.Container
  * @memberof PIXI
  */
@js.native
trait Sprite extends Container {
  /**
    * Cached tint value so we can tell when the tint is changed.
    * Value is used for 2d CanvasRenderer.
    *
    * @protected
    * @member {number} PIXI.Sprite#_cachedTint
    * @default 0xFFFFFF
    */
  var _cachedTint: Double = js.native
  /**
    * The anchor sets the origin point of the text. The default value is taken from the {@link PIXI.Texture|Texture}
    * and passed to the constructor.
    *
    * The default is `(0,0)`, this means the text's origin is the top left.
    *
    * Setting the anchor to `(0.5,0.5)` means the text's origin is centered.
    *
    * Setting the anchor to `(1,1)` would mean the text's origin point will be the bottom right corner.
    *
    * If you pass only single parameter, it will set both x and y to the same value as shown in the example below.
    *
    * @example
    * const sprite = new PIXI.Sprite(texture);
    * sprite.anchor.set(0.5); // This will set the origin to center. (0.5) is same as (0.5, 0.5).
    *
    * @member {PIXI.ObservablePoint}
    */
  var anchor: ObservablePoint = js.native
  /**
    * The blend mode to be applied to the sprite. Apply a value of `PIXI.BLEND_MODES.NORMAL` to reset the blend mode.
    *
    * @member {number} PIXI.Sprite#blendMode
    * @default PIXI.BLEND_MODES.NORMAL
    * @see PIXI.BLEND_MODES
    */
  var blendMode: Double = js.native
  /**
    * Plugin that is responsible for rendering this element.
    * Allows to customize the rendering process without overriding '_render' & '_renderCanvas' methods.
    *
    * @member {string} PIXI.Sprite#pluginName
    * @default 'batch'
    */
  var pluginName: String = js.native
  /**
    * If true PixiJS will Math.floor() x/y values when rendering, stopping pixel interpolation.
    * Advantages can include sharper image quality (like text) and faster rendering on canvas.
    * The main disadvantage is movement of objects may appear less smooth.
    * To set the global default, change {@link PIXI.settings.ROUND_PIXELS}
    *
    * @member {boolean}
    * @default false
    */
  var roundPixels: Boolean = js.native
  /**
    * The shader that will be used to render the sprite. Set to null to remove a current shader.
    *
    * @member {PIXI.Filter|PIXI.Shader} PIXI.Sprite#shader
    */
  var shader: Filter | Shader = js.native
  /**
    * The texture that the sprite is using
    *
    * @member {PIXI.Texture}
    */
  var texture: Texture = js.native
  /**
    * The tint applied to the sprite. This is a hex value.
    * A value of 0xFFFFFF will remove any tint effect.
    *
    * @member {number}
    * @default 0xFFFFFF
    */
  var tint: Double = js.native
  /**
    * calculates worldTransform * vertices for a non texture with a trim. store it in vertexTrimmedData
    * This is used to ensure that the true width and height of a trimmed texture is respected
    */
  def calculateTrimmedVertices(): Unit = js.native
  /**
    * calculates worldTransform * vertices, store it in vertexData
    */
  def calculateVertices(): Unit = js.native
  /**
    * Tests if a point is inside this sprite
    *
    * @param {PIXI.Point} point - the point to test
    * @return {boolean} the result of the test
    */
  def containsPoint(point: Point): Boolean = js.native
}

