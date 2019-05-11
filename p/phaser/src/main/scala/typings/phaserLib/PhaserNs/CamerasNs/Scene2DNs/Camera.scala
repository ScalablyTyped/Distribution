package typings
package phaserLib.PhaserNs.CamerasNs.Scene2DNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Camera.
  * 
  * The Camera is the way in which all games are rendered in Phaser. They provide a view into your game world,
  * and can be positioned, rotated, zoomed and scrolled accordingly.
  * 
  * A Camera consists of two elements: The viewport and the scroll values.
  * 
  * The viewport is the physical position and size of the Camera within your game. Cameras, by default, are
  * created the same size as your game, but their position and size can be set to anything. This means if you
  * wanted to create a camera that was 320x200 in size, positioned in the bottom-right corner of your game,
  * you'd adjust the viewport to do that (using methods like `setViewport` and `setSize`).
  * 
  * If you wish to change where the Camera is looking in your game, then you scroll it. You can do this
  * via the properties `scrollX` and `scrollY` or the method `setScroll`. Scrolling has no impact on the
  * viewport, and changing the viewport has no impact on the scrolling.
  * 
  * By default a Camera will render all Game Objects it can see. You can change this using the `ignore` method,
  * allowing you to filter Game Objects out on a per-Camera basis.
  * 
  * A Camera also has built-in special effects including Fade, Flash and Camera Shake.
  */
@JSGlobal("Phaser.Cameras.Scene2D.Camera")
@js.native
class Camera protected ()
  extends BaseCamera
     with phaserLib.PhaserNs.GameObjectsNs.ComponentsNs.Flip
     with phaserLib.PhaserNs.GameObjectsNs.ComponentsNs.Tint {
  /**
    * 
    * @param x The x position of the Camera, relative to the top-left of the game canvas.
    * @param y The y position of the Camera, relative to the top-left of the game canvas.
    * @param width The width of the Camera, in pixels.
    * @param height The height of the Camera, in pixels.
    */
  def this(x: scala.Double, y: scala.Double, width: scala.Double, height: scala.Double) = this()
  /**
    * If this Camera has been set to render to a texture then this holds a reference
    * to the HTML Canvas Element that the Camera is drawing to.
    * 
    * Enable texture rendering using the method `setRenderToTexture`.
    * 
    * This is only populated if Phaser is running with the Canvas Renderer.
    */
  var canvas: stdLib.HTMLCanvasElement = js.native
  /**
    * If this Camera has been set to render to a texture then this holds a reference
    * to the Rendering Context belonging to the Canvas element the Camera is drawing to.
    * 
    * Enable texture rendering using the method `setRenderToTexture`.
    * 
    * This is only populated if Phaser is running with the Canvas Renderer.
    */
  var context: stdLib.CanvasRenderingContext2D = js.native
  /**
    * The Camera dead zone.
    * 
    * The deadzone is only used when the camera is following a target.
    * 
    * It defines a rectangular region within which if the target is present, the camera will not scroll.
    * If the target moves outside of this area, the camera will begin scrolling in order to follow it.
    * 
    * The `lerp` values that you can set for a follower target also apply when using a deadzone.
    * 
    * You can directly set this property to be an instance of a Rectangle. Or, you can use the
    * `setDeadzone` method for a chainable approach.
    * 
    * The rectangle you provide can have its dimensions adjusted dynamically, however, please
    * note that its position is updated every frame, as it is constantly re-centered on the cameras mid point.
    * 
    * Calling `setDeadzone` with no arguments will reset an active deadzone, as will setting this property
    * to `null`.
    */
  var deadzone: phaserLib.PhaserNs.GeomNs.Rectangle = js.native
  /**
    * The Camera Fade effect handler.
    * To fade this camera see the `Camera.fade` methods.
    */
  var fadeEffect: phaserLib.PhaserNs.CamerasNs.Scene2DNs.EffectsNs.Fade = js.native
  /**
    * The Camera Flash effect handler.
    * To flash this camera see the `Camera.flash` method.
    */
  var flashEffect: phaserLib.PhaserNs.CamerasNs.Scene2DNs.EffectsNs.Flash = js.native
  /**
    * The horizontally flipped state of the Game Object.
    * A Game Object that is flipped horizontally will render inversed on the horizontal axis.
    * Flipping always takes place from the middle of the texture and does not impact the scale value.
    */
  /* CompleteClass */
  override var flipX: scala.Boolean = js.native
  /**
    * The vertically flipped state of the Game Object.
    * A Game Object that is flipped vertically will render inversed on the vertical axis (i.e. upside down)
    * Flipping always takes place from the middle of the texture and does not impact the scale value.
    */
  /* CompleteClass */
  override var flipY: scala.Boolean = js.native
  /**
    * The values stored in this property are subtracted from the Camera targets position, allowing you to
    * offset the camera from the actual target x/y coordinates by this amount.
    * Can also be set via `setFollowOffset` or as part of the `startFollow` call.
    */
  var followOffset: phaserLib.PhaserNs.MathNs.Vector2 = js.native
  /**
    * If this Camera has been set to render to a texture then this holds a reference
    * to the GL Frame Buffer belonging the Camera is drawing to.
    * 
    * Enable texture rendering using the method `setRenderToTexture`.
    * 
    * This is only set if Phaser is running with the WebGL Renderer.
    */
  var framebuffer: stdLib.WebGLFramebuffer = js.native
  /**
    * If this Camera has been set to render to a texture then this holds a reference
    * to the GL Texture belonging the Camera is drawing to.
    * 
    * Enable texture rendering using the method `setRenderToTexture`.
    * 
    * This is only set if Phaser is running with the WebGL Renderer.
    */
  var glTexture: stdLib.WebGLTexture = js.native
  /**
    * Does this Camera allow the Game Objects it renders to receive input events?
    */
  var inputEnabled: scala.Boolean = js.native
  /**
    * The linear interpolation value to use when following a target.
    * 
    * Can also be set via `setLerp` or as part of the `startFollow` call.
    * 
    * The default values of 1 means the camera will instantly snap to the target coordinates.
    * A lower value, such as 0.1 means the camera will more slowly track the target, giving
    * a smooth transition. You can set the horizontal and vertical values independently, and also
    * adjust this value in real-time during your game.
    * 
    * Be sure to keep the value between 0 and 1. A value of zero will disable tracking on that axis.
    */
  var lerp: phaserLib.PhaserNs.MathNs.Vector2 = js.native
  /**
    * The Camera Pan effect handler.
    * To pan this camera see the `Camera.pan` method.
    */
  var panEffect: phaserLib.PhaserNs.CamerasNs.Scene2DNs.EffectsNs.Pan = js.native
  /**
    * If this Camera has been set to render to a texture and to use a custom pipeline,
    * then this holds a reference to the pipeline the Camera is drawing with.
    * 
    * Enable texture rendering using the method `setRenderToTexture`.
    * 
    * This is only set if Phaser is running with the WebGL Renderer.
    */
  var pipeline: js.Any = js.native
  /**
    * Is this Camera rendering directly to the canvas or to a texture?
    * 
    * Enable rendering to texture with the method `setRenderToTexture` (just enabling this boolean won't be enough)
    * 
    * Once enabled you can toggle it by switching this property.
    * 
    * To properly remove a render texture you should call the `clearRenderToTexture()` method.
    */
  var renderToTexture: scala.Boolean = js.native
  /**
    * The Camera Shake effect handler.
    * To shake this camera see the `Camera.shake` method.
    */
  var shakeEffect: phaserLib.PhaserNs.CamerasNs.Scene2DNs.EffectsNs.Shake = js.native
  /**
    * The Camera Zoom effect handler.
    * To zoom this camera see the `Camera.zoom` method.
    */
  var zoomEffect: phaserLib.PhaserNs.CamerasNs.Scene2DNs.EffectsNs.Zoom = js.native
  /**
    * If this Camera was set to render to a texture, this will clear the resources it was using and
    * redirect it to render back to the primary Canvas again.
    * 
    * If you only wish to temporarily disable rendering to a texture then you can toggle the
    * property `renderToTexture` instead.
    */
  def clearRenderToTexture(): Camera = js.native
  /**
    * Fades the Camera from transparent to the given color over the duration specified.
    * @param duration The duration of the effect in milliseconds. Default 1000.
    * @param red The amount to fade the red channel towards. A value between 0 and 255. Default 0.
    * @param green The amount to fade the green channel towards. A value between 0 and 255. Default 0.
    * @param blue The amount to fade the blue channel towards. A value between 0 and 255. Default 0.
    * @param force Force the effect to start immediately, even if already running. Default false.
    * @param callback This callback will be invoked every frame for the duration of the effect.
    * It is sent two arguments: A reference to the camera and a progress amount between 0 and 1 indicating how complete the effect is.
    * @param context The context in which the callback is invoked. Defaults to the Scene to which the Camera belongs.
    */
  def fade(
    duration: js.UndefOr[phaserLib.integer],
    red: js.UndefOr[phaserLib.integer],
    green: js.UndefOr[phaserLib.integer],
    blue: js.UndefOr[phaserLib.integer],
    force: js.UndefOr[scala.Boolean],
    callback: js.UndefOr[js.Function],
    context: js.UndefOr[js.Any]
  ): Camera = js.native
  /**
    * Fades the Camera from the given color to transparent over the duration specified.
    * @param duration The duration of the effect in milliseconds. Default 1000.
    * @param red The amount to fade the red channel towards. A value between 0 and 255. Default 0.
    * @param green The amount to fade the green channel towards. A value between 0 and 255. Default 0.
    * @param blue The amount to fade the blue channel towards. A value between 0 and 255. Default 0.
    * @param force Force the effect to start immediately, even if already running. Default false.
    * @param callback This callback will be invoked every frame for the duration of the effect.
    * It is sent two arguments: A reference to the camera and a progress amount between 0 and 1 indicating how complete the effect is.
    * @param context The context in which the callback is invoked. Defaults to the Scene to which the Camera belongs.
    */
  def fadeFrom(
    duration: js.UndefOr[phaserLib.integer],
    red: js.UndefOr[phaserLib.integer],
    green: js.UndefOr[phaserLib.integer],
    blue: js.UndefOr[phaserLib.integer],
    force: js.UndefOr[scala.Boolean],
    callback: js.UndefOr[js.Function],
    context: js.UndefOr[js.Any]
  ): Camera = js.native
  /**
    * Fades the Camera in from the given color over the duration specified.
    * @param duration The duration of the effect in milliseconds. Default 1000.
    * @param red The amount to fade the red channel towards. A value between 0 and 255. Default 0.
    * @param green The amount to fade the green channel towards. A value between 0 and 255. Default 0.
    * @param blue The amount to fade the blue channel towards. A value between 0 and 255. Default 0.
    * @param callback This callback will be invoked every frame for the duration of the effect.
    * It is sent two arguments: A reference to the camera and a progress amount between 0 and 1 indicating how complete the effect is.
    * @param context The context in which the callback is invoked. Defaults to the Scene to which the Camera belongs.
    */
  def fadeIn(
    duration: js.UndefOr[phaserLib.integer],
    red: js.UndefOr[phaserLib.integer],
    green: js.UndefOr[phaserLib.integer],
    blue: js.UndefOr[phaserLib.integer],
    callback: js.UndefOr[js.Function],
    context: js.UndefOr[js.Any]
  ): Camera = js.native
  /**
    * Fades the Camera out to the given color over the duration specified.
    * This is an alias for Camera.fade that forces the fade to start, regardless of existing fades.
    * @param duration The duration of the effect in milliseconds. Default 1000.
    * @param red The amount to fade the red channel towards. A value between 0 and 255. Default 0.
    * @param green The amount to fade the green channel towards. A value between 0 and 255. Default 0.
    * @param blue The amount to fade the blue channel towards. A value between 0 and 255. Default 0.
    * @param callback This callback will be invoked every frame for the duration of the effect.
    * It is sent two arguments: A reference to the camera and a progress amount between 0 and 1 indicating how complete the effect is.
    * @param context The context in which the callback is invoked. Defaults to the Scene to which the Camera belongs.
    */
  def fadeOut(
    duration: js.UndefOr[phaserLib.integer],
    red: js.UndefOr[phaserLib.integer],
    green: js.UndefOr[phaserLib.integer],
    blue: js.UndefOr[phaserLib.integer],
    callback: js.UndefOr[js.Function],
    context: js.UndefOr[js.Any]
  ): Camera = js.native
  /**
    * Flashes the Camera by setting it to the given color immediately and then fading it away again quickly over the duration specified.
    * @param duration The duration of the effect in milliseconds. Default 250.
    * @param red The amount to fade the red channel towards. A value between 0 and 255. Default 255.
    * @param green The amount to fade the green channel towards. A value between 0 and 255. Default 255.
    * @param blue The amount to fade the blue channel towards. A value between 0 and 255. Default 255.
    * @param force Force the effect to start immediately, even if already running. Default false.
    * @param callback This callback will be invoked every frame for the duration of the effect.
    * It is sent two arguments: A reference to the camera and a progress amount between 0 and 1 indicating how complete the effect is.
    * @param context The context in which the callback is invoked. Defaults to the Scene to which the Camera belongs.
    */
  def flash(
    duration: js.UndefOr[phaserLib.integer],
    red: js.UndefOr[phaserLib.integer],
    green: js.UndefOr[phaserLib.integer],
    blue: js.UndefOr[phaserLib.integer],
    force: js.UndefOr[scala.Boolean],
    callback: js.UndefOr[js.Function],
    context: js.UndefOr[js.Any]
  ): Camera = js.native
  /**
    * This effect will scroll the Camera so that the center of its viewport finishes at the given destination,
    * over the duration and with the ease specified.
    * @param x The destination x coordinate to scroll the center of the Camera viewport to.
    * @param y The destination y coordinate to scroll the center of the Camera viewport to.
    * @param duration The duration of the effect in milliseconds. Default 1000.
    * @param ease The ease to use for the pan. Can be any of the Phaser Easing constants or a custom function. Default 'Linear'.
    * @param force Force the pan effect to start immediately, even if already running. Default false.
    * @param callback This callback will be invoked every frame for the duration of the effect.
    * It is sent four arguments: A reference to the camera, a progress amount between 0 and 1 indicating how complete the effect is,
    * the current camera scroll x coordinate and the current camera scroll y coordinate.
    * @param context The context in which the callback is invoked. Defaults to the Scene to which the Camera belongs.
    */
  def pan(x: scala.Double, y: scala.Double): Camera = js.native
  def pan(x: scala.Double, y: scala.Double, duration: phaserLib.integer): Camera = js.native
  def pan(x: scala.Double, y: scala.Double, duration: phaserLib.integer, ease: java.lang.String): Camera = js.native
  def pan(
    x: scala.Double,
    y: scala.Double,
    duration: phaserLib.integer,
    ease: java.lang.String,
    force: scala.Boolean
  ): Camera = js.native
  def pan(
    x: scala.Double,
    y: scala.Double,
    duration: phaserLib.integer,
    ease: java.lang.String,
    force: scala.Boolean,
    callback: phaserLib.PhaserNs.TypesNs.CamerasNs.Scene2DNs.CameraPanCallback
  ): Camera = js.native
  def pan(
    x: scala.Double,
    y: scala.Double,
    duration: phaserLib.integer,
    ease: java.lang.String,
    force: scala.Boolean,
    callback: phaserLib.PhaserNs.TypesNs.CamerasNs.Scene2DNs.CameraPanCallback,
    context: js.Any
  ): Camera = js.native
  def pan(x: scala.Double, y: scala.Double, duration: phaserLib.integer, ease: js.Function): Camera = js.native
  def pan(
    x: scala.Double,
    y: scala.Double,
    duration: phaserLib.integer,
    ease: js.Function,
    force: scala.Boolean
  ): Camera = js.native
  def pan(
    x: scala.Double,
    y: scala.Double,
    duration: phaserLib.integer,
    ease: js.Function,
    force: scala.Boolean,
    callback: phaserLib.PhaserNs.TypesNs.CamerasNs.Scene2DNs.CameraPanCallback
  ): Camera = js.native
  def pan(
    x: scala.Double,
    y: scala.Double,
    duration: phaserLib.integer,
    ease: js.Function,
    force: scala.Boolean,
    callback: phaserLib.PhaserNs.TypesNs.CamerasNs.Scene2DNs.CameraPanCallback,
    context: js.Any
  ): Camera = js.native
  /**
    * Resets any active FX, such as a fade, flash or shake. Useful to call after a fade in order to
    * remove the fade.
    */
  def resetFX(): Camera = js.native
  /**
    * Resets the horizontal and vertical flipped state of this Game Object back to their default un-flipped state.
    */
  /* CompleteClass */
  override def resetFlip(): this.type = js.native
  /**
    * Sets the Camera dead zone.
    * 
    * The deadzone is only used when the camera is following a target.
    * 
    * It defines a rectangular region within which if the target is present, the camera will not scroll.
    * If the target moves outside of this area, the camera will begin scrolling in order to follow it.
    * 
    * The deadzone rectangle is re-positioned every frame so that it is centered on the mid-point
    * of the camera. This allows you to use the object for additional game related checks, such as
    * testing if an object is within it or not via a Rectangle.contains call.
    * 
    * The `lerp` values that you can set for a follower target also apply when using a deadzone.
    * 
    * Calling this method with no arguments will reset an active deadzone.
    * @param width The width of the deadzone rectangle in pixels. If not specified the deadzone is removed.
    * @param height The height of the deadzone rectangle in pixels.
    */
  def setDeadzone(): Camera = js.native
  def setDeadzone(width: scala.Double): Camera = js.native
  def setDeadzone(width: scala.Double, height: scala.Double): Camera = js.native
  /**
    * Sets the horizontal and vertical flipped state of this Game Object.
    * @param x The horizontal flipped state. `false` for no flip, or `true` to be flipped.
    * @param y The horizontal flipped state. `false` for no flip, or `true` to be flipped.
    */
  /* CompleteClass */
  override def setFlip(x: scala.Boolean, y: scala.Boolean): this.type = js.native
  /**
    * Sets the horizontal flipped state of this Game Object.
    * @param value The flipped state. `false` for no flip, or `true` to be flipped.
    */
  /* CompleteClass */
  override def setFlipX(value: scala.Boolean): this.type = js.native
  /**
    * Sets the vertical flipped state of this Game Object.
    * @param value The flipped state. `false` for no flip, or `true` to be flipped.
    */
  /* CompleteClass */
  override def setFlipY(value: scala.Boolean): this.type = js.native
  /**
    * Sets the horizontal and vertical offset of the camera from its follow target.
    * The values are subtracted from the targets position during the Cameras update step.
    * @param x The horizontal offset from the camera follow target.x position. Default 0.
    * @param y The vertical offset from the camera follow target.y position. Default 0.
    */
  def setFollowOffset(): this.type = js.native
  def setFollowOffset(x: scala.Double): this.type = js.native
  def setFollowOffset(x: scala.Double, y: scala.Double): this.type = js.native
  /**
    * Sets the linear interpolation value to use when following a target.
    * 
    * The default values of 1 means the camera will instantly snap to the target coordinates.
    * A lower value, such as 0.1 means the camera will more slowly track the target, giving
    * a smooth transition. You can set the horizontal and vertical values independently, and also
    * adjust this value in real-time during your game.
    * 
    * Be sure to keep the value between 0 and 1. A value of zero will disable tracking on that axis.
    * @param x The amount added to the horizontal linear interpolation of the follow target. Default 1.
    * @param y The amount added to the vertical linear interpolation of the follow target. Default 1.
    */
  def setLerp(): this.type = js.native
  def setLerp(x: scala.Double): this.type = js.native
  def setLerp(x: scala.Double, y: scala.Double): this.type = js.native
  /**
    * Sets the WebGL pipeline this Camera is using when rendering to a texture.
    * 
    * You can pass either the string-based name of the pipeline, or a reference to the pipeline itself.
    * 
    * Call this method with no arguments to clear any previously set pipeline.
    * @param pipeline The WebGL Pipeline to render with, can be either a string which is the name of the pipeline, or a pipeline reference. Or if left empty it will clear the pipeline.
    */
  def setPipeline(): Camera = js.native
  def setPipeline(pipeline: java.lang.String): Camera = js.native
  def setPipeline(pipeline: phaserLib.PhaserNs.RendererNs.WebGLNs.WebGLPipeline): Camera = js.native
  /**
    * Sets the Camera to render to a texture instead of to the main canvas.
    * 
    * The Camera will redirect all Game Objects it's asked to render to this texture.
    * 
    * During the render sequence, the texture itself will then be rendered to the main canvas.
    * 
    * Doing this gives you the ability to modify the texture before this happens,
    * allowing for special effects such as Camera specific shaders, or post-processing
    * on the texture.
    * 
    * If running under Canvas the Camera will render to its `canvas` property.
    * 
    * If running under WebGL the Camera will create a frame buffer, which is stored in its `framebuffer` and `glTexture` properties.
    * 
    * If you set a camera to render to a texture then it will emit 2 events during the render loop:
    * 
    * First, it will emit the event `prerender`. This happens right before any Game Object's are drawn to the Camera texture.
    * 
    * Then, it will emit the event `postrender`. This happens after all Game Object's have been drawn, but right before the
    * Camera texture is rendered to the main game canvas. It's the final point at which you can manipulate the texture before
    * it appears in-game.
    * 
    * You should not enable this unless you plan on actually using the texture it creates
    * somehow, otherwise you're just doubling the work required to render your game.
    * 
    * To temporarily disable rendering to a texture, toggle the `renderToTexture` boolean.
    * 
    * If you no longer require the Camera to render to a texture, call the `clearRenderToTexture` method,
    * which will delete the respective textures and free-up resources.
    * @param pipeline An optional WebGL Pipeline to render with, can be either a string which is the name of the pipeline, or a pipeline reference.
    */
  def setRenderToTexture(): Camera = js.native
  def setRenderToTexture(pipeline: java.lang.String): Camera = js.native
  def setRenderToTexture(pipeline: phaserLib.PhaserNs.RendererNs.WebGLNs.WebGLPipeline): Camera = js.native
  /**
    * Shakes the Camera by the given intensity over the duration specified.
    * @param duration The duration of the effect in milliseconds. Default 100.
    * @param intensity The intensity of the shake. Default 0.05.
    * @param force Force the shake effect to start immediately, even if already running. Default false.
    * @param callback This callback will be invoked every frame for the duration of the effect.
    * It is sent two arguments: A reference to the camera and a progress amount between 0 and 1 indicating how complete the effect is.
    * @param context The context in which the callback is invoked. Defaults to the Scene to which the Camera belongs.
    */
  def shake(): Camera = js.native
  def shake(duration: phaserLib.integer): Camera = js.native
  def shake(duration: phaserLib.integer, intensity: scala.Double): Camera = js.native
  def shake(duration: phaserLib.integer, intensity: scala.Double, force: scala.Boolean): Camera = js.native
  def shake(duration: phaserLib.integer, intensity: scala.Double, force: scala.Boolean, callback: js.Function): Camera = js.native
  def shake(
    duration: phaserLib.integer,
    intensity: scala.Double,
    force: scala.Boolean,
    callback: js.Function,
    context: js.Any
  ): Camera = js.native
  def startFollow(target: js.Object): this.type = js.native
  def startFollow(target: js.Object, roundPixels: scala.Boolean): this.type = js.native
  def startFollow(target: js.Object, roundPixels: scala.Boolean, lerpX: scala.Double): this.type = js.native
  def startFollow(target: js.Object, roundPixels: scala.Boolean, lerpX: scala.Double, lerpY: scala.Double): this.type = js.native
  def startFollow(
    target: js.Object,
    roundPixels: scala.Boolean,
    lerpX: scala.Double,
    lerpY: scala.Double,
    offsetX: scala.Double
  ): this.type = js.native
  def startFollow(
    target: js.Object,
    roundPixels: scala.Boolean,
    lerpX: scala.Double,
    lerpY: scala.Double,
    offsetX: scala.Double,
    offsetY: scala.Double
  ): this.type = js.native
  /**
    * Sets the Camera to follow a Game Object.
    * 
    * When enabled the Camera will automatically adjust its scroll position to keep the target Game Object
    * in its center.
    * 
    * You can set the linear interpolation value used in the follow code.
    * Use low lerp values (such as 0.1) to automatically smooth the camera motion.
    * 
    * If you find you're getting a slight "jitter" effect when following an object it's probably to do with sub-pixel
    * rendering of the targets position. This can be rounded by setting the `roundPixels` argument to `true` to
    * force full pixel rounding rendering. Note that this can still be broken if you have specified a non-integer zoom
    * value on the camera. So be sure to keep the camera zoom to integers.
    * @param target The target for the Camera to follow.
    * @param roundPixels Round the camera position to whole integers to avoid sub-pixel rendering? Default false.
    * @param lerpX A value between 0 and 1. This value specifies the amount of linear interpolation to use when horizontally tracking the target. The closer the value to 1, the faster the camera will track. Default 1.
    * @param lerpY A value between 0 and 1. This value specifies the amount of linear interpolation to use when vertically tracking the target. The closer the value to 1, the faster the camera will track. Default 1.
    * @param offsetX The horizontal offset from the camera follow target.x position. Default 0.
    * @param offsetY The vertical offset from the camera follow target.y position. Default 0.
    */
  def startFollow(target: phaserLib.PhaserNs.GameObjectsNs.GameObject): this.type = js.native
  def startFollow(target: phaserLib.PhaserNs.GameObjectsNs.GameObject, roundPixels: scala.Boolean): this.type = js.native
  def startFollow(
    target: phaserLib.PhaserNs.GameObjectsNs.GameObject,
    roundPixels: scala.Boolean,
    lerpX: scala.Double
  ): this.type = js.native
  def startFollow(
    target: phaserLib.PhaserNs.GameObjectsNs.GameObject,
    roundPixels: scala.Boolean,
    lerpX: scala.Double,
    lerpY: scala.Double
  ): this.type = js.native
  def startFollow(
    target: phaserLib.PhaserNs.GameObjectsNs.GameObject,
    roundPixels: scala.Boolean,
    lerpX: scala.Double,
    lerpY: scala.Double,
    offsetX: scala.Double
  ): this.type = js.native
  def startFollow(
    target: phaserLib.PhaserNs.GameObjectsNs.GameObject,
    roundPixels: scala.Boolean,
    lerpX: scala.Double,
    lerpY: scala.Double,
    offsetX: scala.Double,
    offsetY: scala.Double
  ): this.type = js.native
  /**
    * Stops a Camera from following a Game Object, if previously set via `Camera.startFollow`.
    */
  def stopFollow(): Camera = js.native
  /**
    * Toggles the horizontal flipped state of this Game Object.
    */
  /* CompleteClass */
  override def toggleFlipX(): this.type = js.native
  /**
    * Toggles the vertical flipped state of this Game Object.
    */
  /* CompleteClass */
  override def toggleFlipY(): this.type = js.native
  /**
    * This effect will zoom the Camera to the given scale, over the duration and with the ease specified.
    * @param zoom The target Camera zoom value.
    * @param duration The duration of the effect in milliseconds. Default 1000.
    * @param ease The ease to use for the pan. Can be any of the Phaser Easing constants or a custom function. Default 'Linear'.
    * @param force Force the pan effect to start immediately, even if already running. Default false.
    * @param callback This callback will be invoked every frame for the duration of the effect.
    * It is sent four arguments: A reference to the camera, a progress amount between 0 and 1 indicating how complete the effect is,
    * the current camera scroll x coordinate and the current camera scroll y coordinate.
    * @param context The context in which the callback is invoked. Defaults to the Scene to which the Camera belongs.
    */
  def zoomTo(zoom: scala.Double): Camera = js.native
  def zoomTo(zoom: scala.Double, duration: phaserLib.integer): Camera = js.native
  def zoomTo(zoom: scala.Double, duration: phaserLib.integer, ease: java.lang.String): Camera = js.native
  def zoomTo(zoom: scala.Double, duration: phaserLib.integer, ease: java.lang.String, force: scala.Boolean): Camera = js.native
  def zoomTo(
    zoom: scala.Double,
    duration: phaserLib.integer,
    ease: java.lang.String,
    force: scala.Boolean,
    callback: phaserLib.PhaserNs.TypesNs.CamerasNs.Scene2DNs.CameraPanCallback
  ): Camera = js.native
  def zoomTo(
    zoom: scala.Double,
    duration: phaserLib.integer,
    ease: java.lang.String,
    force: scala.Boolean,
    callback: phaserLib.PhaserNs.TypesNs.CamerasNs.Scene2DNs.CameraPanCallback,
    context: js.Any
  ): Camera = js.native
  def zoomTo(zoom: scala.Double, duration: phaserLib.integer, ease: js.Function): Camera = js.native
  def zoomTo(zoom: scala.Double, duration: phaserLib.integer, ease: js.Function, force: scala.Boolean): Camera = js.native
  def zoomTo(
    zoom: scala.Double,
    duration: phaserLib.integer,
    ease: js.Function,
    force: scala.Boolean,
    callback: phaserLib.PhaserNs.TypesNs.CamerasNs.Scene2DNs.CameraPanCallback
  ): Camera = js.native
  def zoomTo(
    zoom: scala.Double,
    duration: phaserLib.integer,
    ease: js.Function,
    force: scala.Boolean,
    callback: phaserLib.PhaserNs.TypesNs.CamerasNs.Scene2DNs.CameraPanCallback,
    context: js.Any
  ): Camera = js.native
}

