package typings.phaser.PhaserNs.RendererNs.CanvasNs

import typings.phaser.PhaserNs.CamerasNs.Scene2DNs.Camera
import typings.phaser.PhaserNs.Game
import typings.phaser.PhaserNs.GameObjectsNs.ComponentsNs.TransformMatrix
import typings.phaser.PhaserNs.GameObjectsNs.DisplayList
import typings.phaser.PhaserNs.GameObjectsNs.GameObject
import typings.phaser.PhaserNs.Scene
import typings.phaser.PhaserNs.StructsNs.Size
import typings.phaser.PhaserNs.TexturesNs.Frame
import typings.phaser.PhaserNs.TypesNs.RendererNs.SnapshotNs.SnapshotCallback
import typings.phaser.PhaserNs.TypesNs.RendererNs.SnapshotNs.SnapshotState
import typings.phaser.integer
import typings.std.CanvasRenderingContext2D
import typings.std.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Canvas Renderer is responsible for managing 2D canvas rendering contexts, including the one used by the Game's canvas. It tracks the internal state of a given context and can renderer textured Game Objects to it, taking into account alpha, blending, and scaling.
  */
@JSGlobal("Phaser.Renderer.Canvas.CanvasRenderer")
@js.native
class CanvasRenderer protected () extends js.Object {
  /**
    * 
    * @param game The Phaser Game instance that owns this renderer.
    */
  def this(game: Game) = this()
  /**
    * The blend modes supported by the Canvas Renderer.
    * 
    * This object maps the {@link Phaser.BlendModes} to canvas compositing operations.
    */
  var blendModes: js.Array[_] = js.native
  /**
    * The local configuration settings of the CanvasRenderer.
    */
  var config: js.Object = js.native
  /**
    * The canvas context currently used by the CanvasRenderer for all rendering operations.
    */
  var currentContext: CanvasRenderingContext2D = js.native
  /**
    * The scale mode currently in use by the Canvas Renderer.
    */
  var currentScaleMode: Double = js.native
  /**
    * The total number of Game Objects which were rendered in a frame.
    */
  var drawCount: Double = js.native
  /**
    * The Phaser Game instance that owns this renderer.
    */
  var game: Game = js.native
  /**
    * The canvas element which the Game uses.
    */
  var gameCanvas: HTMLCanvasElement = js.native
  /**
    * The canvas context used to render all Cameras in all Scenes during the game loop.
    */
  var gameContext: CanvasRenderingContext2D = js.native
  /**
    * The height of the canvas being rendered to.
    */
  var height: integer = js.native
  /**
    * The scale mode which should be used by the CanvasRenderer.
    */
  var scaleMode: integer = js.native
  /**
    * Details about the currently scheduled snapshot.
    * 
    * If a non-null `callback` is set in this object, a snapshot of the canvas will be taken after the current frame is fully rendered.
    */
  var snapshotState: SnapshotState = js.native
  /**
    * A constant which allows the renderer to be easily identified as a Canvas Renderer.
    */
  var `type`: integer = js.native
  /**
    * The width of the canvas being rendered to.
    */
  var width: integer = js.native
  /**
    * Takes a Sprite Game Object, or any object that extends it, and draws it to the current context.
    * @param sprite The texture based Game Object to draw.
    * @param frame The frame to draw, doesn't have to be that owned by the Game Object.
    * @param camera The Camera to use for the rendering transform.
    * @param parentTransformMatrix The transform matrix of the parent container, if set.
    */
  def batchSprite(sprite: GameObject, frame: Frame, camera: Camera): Unit = js.native
  def batchSprite(sprite: GameObject, frame: Frame, camera: Camera, parentTransformMatrix: TransformMatrix): Unit = js.native
  /**
    * Destroys all object references in the Canvas Renderer.
    */
  def destroy(): Unit = js.native
  /**
    * Prepares the game canvas for rendering.
    */
  def init(): Unit = js.native
  /**
    * The event handler that manages the `resize` event dispatched by the Scale Manager.
    * @param gameSize The default Game Size object. This is the un-modified game dimensions.
    * @param baseSize The base Size object. The game dimensions multiplied by the resolution. The canvas width / height values match this.
    * @param displaySize The display Size object. The size of the canvas style width / height attributes.
    * @param resolution The Scale Manager resolution setting.
    */
  def onResize(gameSize: Size, baseSize: Size, displaySize: Size): Unit = js.native
  def onResize(gameSize: Size, baseSize: Size, displaySize: Size, resolution: Double): Unit = js.native
  /**
    * Restores the game context's global settings and takes a snapshot if one is scheduled.
    * 
    * The post-render step happens after all Cameras in all Scenes have been rendered.
    */
  def postRender(): Unit = js.native
  /**
    * Called at the start of the render loop.
    */
  def preRender(): Unit = js.native
  /**
    * Renders the Scene to the given Camera.
    * @param scene The Scene to render.
    * @param children The Game Objects within the Scene to be rendered.
    * @param interpolationPercentage The interpolation percentage to apply. Currently unused.
    * @param camera The Scene Camera to render with.
    */
  def render(scene: Scene, children: DisplayList, interpolationPercentage: Double, camera: Camera): Unit = js.native
  /**
    * Resets the transformation matrix of the current context to the identity matrix, thus resetting any transformation.
    */
  def resetTransform(): Unit = js.native
  /**
    * Resize the main game canvas.
    * @param width The new width of the renderer.
    * @param height The new height of the renderer.
    */
  def resize(): Unit = js.native
  def resize(width: Double): Unit = js.native
  def resize(width: Double, height: Double): Unit = js.native
  /**
    * Sets the global alpha of the current context.
    * @param alpha The new alpha to use, where 0 is fully transparent and 1 is fully opaque.
    */
  def setAlpha(alpha: Double): this.type = js.native
  /**
    * Sets the blend mode (compositing operation) of the current context.
    * @param blendMode The new blend mode which should be used.
    */
  def setBlendMode(blendMode: String): this.type = js.native
  /**
    * Changes the Canvas Rendering Context that all draw operations are performed against.
    * @param ctx The new Canvas Rendering Context to draw everything to. Leave empty to reset to the Game Canvas.
    */
  def setContext(): this.type = js.native
  def setContext(ctx: CanvasRenderingContext2D): this.type = js.native
  /**
    * Schedules a snapshot of the entire game viewport to be taken after the current frame is rendered.
    * 
    * To capture a specific area see the `snapshotArea` method. To capture a specific pixel, see `snapshotPixel`.
    * 
    * Only one snapshot can be active _per frame_. If you have already called `snapshotPixel`, for example, then
    * calling this method will override it.
    * 
    * Snapshots work by creating an Image object from the canvas data, this is a blocking process, which gets
    * more expensive the larger the canvas size gets, so please be careful how you employ this in your game.
    * @param callback The Function to invoke after the snapshot image is created.
    * @param type The format of the image to create, usually `image/png` or `image/jpeg`. Default 'image/png'.
    * @param encoderOptions The image quality, between 0 and 1. Used for image formats with lossy compression, such as `image/jpeg`. Default 0.92.
    */
  def snapshot(callback: SnapshotCallback): this.type = js.native
  def snapshot(callback: SnapshotCallback, `type`: String): this.type = js.native
  def snapshot(callback: SnapshotCallback, `type`: String, encoderOptions: Double): this.type = js.native
  /**
    * Schedules a snapshot of the given area of the game viewport to be taken after the current frame is rendered.
    * 
    * To capture the whole game viewport see the `snapshot` method. To capture a specific pixel, see `snapshotPixel`.
    * 
    * Only one snapshot can be active _per frame_. If you have already called `snapshotPixel`, for example, then
    * calling this method will override it.
    * 
    * Snapshots work by creating an Image object from the canvas data, this is a blocking process, which gets
    * more expensive the larger the canvas size gets, so please be careful how you employ this in your game.
    * @param x The x coordinate to grab from.
    * @param y The y coordinate to grab from.
    * @param width The width of the area to grab.
    * @param height The height of the area to grab.
    * @param callback The Function to invoke after the snapshot image is created.
    * @param type The format of the image to create, usually `image/png` or `image/jpeg`. Default 'image/png'.
    * @param encoderOptions The image quality, between 0 and 1. Used for image formats with lossy compression, such as `image/jpeg`. Default 0.92.
    */
  def snapshotArea(x: integer, y: integer, width: integer, height: integer, callback: SnapshotCallback): this.type = js.native
  def snapshotArea(
    x: integer,
    y: integer,
    width: integer,
    height: integer,
    callback: SnapshotCallback,
    `type`: String
  ): this.type = js.native
  def snapshotArea(
    x: integer,
    y: integer,
    width: integer,
    height: integer,
    callback: SnapshotCallback,
    `type`: String,
    encoderOptions: Double
  ): this.type = js.native
  /**
    * Takes a snapshot of the given area of the given canvas.
    * 
    * Unlike the other snapshot methods, this one is processed immediately and doesn't wait for the next render.
    * 
    * Snapshots work by creating an Image object from the canvas data, this is a blocking process, which gets
    * more expensive the larger the canvas size gets, so please be careful how you employ this in your game.
    * @param canvas The canvas to grab from.
    * @param callback The Function to invoke after the snapshot image is created.
    * @param getPixel Grab a single pixel as a Color object, or an area as an Image object? Default false.
    * @param x The x coordinate to grab from. Default 0.
    * @param y The y coordinate to grab from. Default 0.
    * @param width The width of the area to grab. Default canvas.width.
    * @param height The height of the area to grab. Default canvas.height.
    * @param type The format of the image to create, usually `image/png` or `image/jpeg`. Default 'image/png'.
    * @param encoderOptions The image quality, between 0 and 1. Used for image formats with lossy compression, such as `image/jpeg`. Default 0.92.
    */
  def snapshotCanvas(
    canvas: HTMLCanvasElement,
    callback: SnapshotCallback,
    getPixel: js.UndefOr[Boolean],
    x: js.UndefOr[integer],
    y: js.UndefOr[integer],
    width: js.UndefOr[integer],
    height: js.UndefOr[integer],
    `type`: js.UndefOr[String],
    encoderOptions: js.UndefOr[Double]
  ): this.type = js.native
  /**
    * Schedules a snapshot of the given pixel from the game viewport to be taken after the current frame is rendered.
    * 
    * To capture the whole game viewport see the `snapshot` method. To capture a specific area, see `snapshotArea`.
    * 
    * Only one snapshot can be active _per frame_. If you have already called `snapshotArea`, for example, then
    * calling this method will override it.
    * 
    * Unlike the other two snapshot methods, this one will return a `Color` object containing the color data for
    * the requested pixel. It doesn't need to create an internal Canvas or Image object, so is a lot faster to execute,
    * using less memory.
    * @param x The x coordinate of the pixel to get.
    * @param y The y coordinate of the pixel to get.
    * @param callback The Function to invoke after the snapshot pixel data is extracted.
    */
  def snapshotPixel(x: integer, y: integer, callback: SnapshotCallback): this.type = js.native
}

