package typings.phaser.Phaser.Cameras.Scene2D

import typings.phaser.CameraRotateCallback
import typings.phaser.Phaser.Cameras.Scene2D.Effects.Fade
import typings.phaser.Phaser.Cameras.Scene2D.Effects.Flash
import typings.phaser.Phaser.Cameras.Scene2D.Effects.Pan
import typings.phaser.Phaser.Cameras.Scene2D.Effects.RotateTo
import typings.phaser.Phaser.Cameras.Scene2D.Effects.Shake
import typings.phaser.Phaser.Cameras.Scene2D.Effects.Zoom
import typings.phaser.Phaser.GameObjects.Components.Flip
import typings.phaser.Phaser.GameObjects.Components.Tint
import typings.phaser.Phaser.GameObjects.GameObject
import typings.phaser.Phaser.Geom.Rectangle
import typings.phaser.Phaser.Math.Vector2
import typings.phaser.Phaser.Renderer.WebGL.WebGLPipeline
import typings.phaser.Phaser.Types.Cameras.Scene2D.CameraPanCallback
import typings.phaser.integer
import typings.std.CanvasRenderingContext2D
import typings.std.HTMLCanvasElement
import typings.std.WebGLFramebuffer
import typings.std.WebGLTexture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
@js.native
trait Camera
  extends BaseCamera
     with Flip
     with Tint {
  
  /**
    * If this Camera has been set to render to a texture then this holds a reference
    * to the HTML Canvas Element that the Camera is drawing to.
    * 
    * Enable texture rendering using the method `setRenderToTexture`.
    * 
    * This is only populated if Phaser is running with the Canvas Renderer.
    */
  var canvas: HTMLCanvasElement = js.native
  
  /**
    * If this Camera was set to render to a texture, this will clear the resources it was using and
    * redirect it to render back to the primary Canvas again.
    * 
    * If you only wish to temporarily disable rendering to a texture then you can toggle the
    * property `renderToTexture` instead.
    */
  def clearRenderToTexture(): this.type = js.native
  
  /**
    * If this Camera has been set to render to a texture then this holds a reference
    * to the Rendering Context belonging to the Canvas element the Camera is drawing to.
    * 
    * Enable texture rendering using the method `setRenderToTexture`.
    * 
    * This is only populated if Phaser is running with the Canvas Renderer.
    */
  var context: CanvasRenderingContext2D = js.native
  
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
  var deadzone: Rectangle = js.native
  
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
    duration: js.UndefOr[integer],
    red: js.UndefOr[integer],
    green: js.UndefOr[integer],
    blue: js.UndefOr[integer],
    force: js.UndefOr[Boolean],
    callback: js.UndefOr[js.Function],
    context: js.UndefOr[js.Any]
  ): this.type = js.native
  
  /**
    * The Camera Fade effect handler.
    * To fade this camera see the `Camera.fade` methods.
    */
  var fadeEffect: Fade = js.native
  
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
    duration: js.UndefOr[integer],
    red: js.UndefOr[integer],
    green: js.UndefOr[integer],
    blue: js.UndefOr[integer],
    force: js.UndefOr[Boolean],
    callback: js.UndefOr[js.Function],
    context: js.UndefOr[js.Any]
  ): this.type = js.native
  
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
    duration: js.UndefOr[integer],
    red: js.UndefOr[integer],
    green: js.UndefOr[integer],
    blue: js.UndefOr[integer],
    callback: js.UndefOr[js.Function],
    context: js.UndefOr[js.Any]
  ): this.type = js.native
  
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
    duration: js.UndefOr[integer],
    red: js.UndefOr[integer],
    green: js.UndefOr[integer],
    blue: js.UndefOr[integer],
    callback: js.UndefOr[js.Function],
    context: js.UndefOr[js.Any]
  ): this.type = js.native
  
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
    duration: js.UndefOr[integer],
    red: js.UndefOr[integer],
    green: js.UndefOr[integer],
    blue: js.UndefOr[integer],
    force: js.UndefOr[Boolean],
    callback: js.UndefOr[js.Function],
    context: js.UndefOr[js.Any]
  ): this.type = js.native
  
  /**
    * The Camera Flash effect handler.
    * To flash this camera see the `Camera.flash` method.
    */
  var flashEffect: Flash = js.native
  
  /**
    * The values stored in this property are subtracted from the Camera targets position, allowing you to
    * offset the camera from the actual target x/y coordinates by this amount.
    * Can also be set via `setFollowOffset` or as part of the `startFollow` call.
    */
  var followOffset: Vector2 = js.native
  
  /**
    * If this Camera has been set to render to a texture then this holds a reference
    * to the GL Frame Buffer belonging the Camera is drawing to.
    * 
    * Enable texture rendering using the method `setRenderToTexture`.
    * 
    * This is only set if Phaser is running with the WebGL Renderer.
    */
  var framebuffer: WebGLFramebuffer = js.native
  
  /**
    * If this Camera has been set to render to a texture then this holds a reference
    * to the GL Texture belonging the Camera is drawing to.
    * 
    * Enable texture rendering using the method `setRenderToTexture`.
    * 
    * This is only set if Phaser is running with the WebGL Renderer.
    */
  var glTexture: WebGLTexture = js.native
  
  /**
    * Does this Camera allow the Game Objects it renders to receive input events?
    */
  var inputEnabled: Boolean = js.native
  
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
  var lerp: Vector2 = js.native
  
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
  def pan(x: Double, y: Double): this.type = js.native
  def pan(
    x: Double,
    y: Double,
    duration: js.UndefOr[scala.Nothing],
    ease: js.UndefOr[scala.Nothing],
    force: js.UndefOr[scala.Nothing],
    callback: js.UndefOr[scala.Nothing],
    context: js.Any
  ): this.type = js.native
  def pan(
    x: Double,
    y: Double,
    duration: js.UndefOr[scala.Nothing],
    ease: js.UndefOr[scala.Nothing],
    force: js.UndefOr[scala.Nothing],
    callback: CameraPanCallback
  ): this.type = js.native
  def pan(
    x: Double,
    y: Double,
    duration: js.UndefOr[scala.Nothing],
    ease: js.UndefOr[scala.Nothing],
    force: js.UndefOr[scala.Nothing],
    callback: CameraPanCallback,
    context: js.Any
  ): this.type = js.native
  def pan(
    x: Double,
    y: Double,
    duration: js.UndefOr[scala.Nothing],
    ease: js.UndefOr[scala.Nothing],
    force: Boolean
  ): this.type = js.native
  def pan(
    x: Double,
    y: Double,
    duration: js.UndefOr[scala.Nothing],
    ease: js.UndefOr[scala.Nothing],
    force: Boolean,
    callback: js.UndefOr[scala.Nothing],
    context: js.Any
  ): this.type = js.native
  def pan(
    x: Double,
    y: Double,
    duration: js.UndefOr[scala.Nothing],
    ease: js.UndefOr[scala.Nothing],
    force: Boolean,
    callback: CameraPanCallback
  ): this.type = js.native
  def pan(
    x: Double,
    y: Double,
    duration: js.UndefOr[scala.Nothing],
    ease: js.UndefOr[scala.Nothing],
    force: Boolean,
    callback: CameraPanCallback,
    context: js.Any
  ): this.type = js.native
  def pan(x: Double, y: Double, duration: js.UndefOr[scala.Nothing], ease: String): this.type = js.native
  def pan(
    x: Double,
    y: Double,
    duration: js.UndefOr[scala.Nothing],
    ease: String,
    force: js.UndefOr[scala.Nothing],
    callback: js.UndefOr[scala.Nothing],
    context: js.Any
  ): this.type = js.native
  def pan(
    x: Double,
    y: Double,
    duration: js.UndefOr[scala.Nothing],
    ease: String,
    force: js.UndefOr[scala.Nothing],
    callback: CameraPanCallback
  ): this.type = js.native
  def pan(
    x: Double,
    y: Double,
    duration: js.UndefOr[scala.Nothing],
    ease: String,
    force: js.UndefOr[scala.Nothing],
    callback: CameraPanCallback,
    context: js.Any
  ): this.type = js.native
  def pan(x: Double, y: Double, duration: js.UndefOr[scala.Nothing], ease: String, force: Boolean): this.type = js.native
  def pan(
    x: Double,
    y: Double,
    duration: js.UndefOr[scala.Nothing],
    ease: String,
    force: Boolean,
    callback: js.UndefOr[scala.Nothing],
    context: js.Any
  ): this.type = js.native
  def pan(
    x: Double,
    y: Double,
    duration: js.UndefOr[scala.Nothing],
    ease: String,
    force: Boolean,
    callback: CameraPanCallback
  ): this.type = js.native
  def pan(
    x: Double,
    y: Double,
    duration: js.UndefOr[scala.Nothing],
    ease: String,
    force: Boolean,
    callback: CameraPanCallback,
    context: js.Any
  ): this.type = js.native
  def pan(x: Double, y: Double, duration: js.UndefOr[scala.Nothing], ease: js.Function): this.type = js.native
  def pan(
    x: Double,
    y: Double,
    duration: js.UndefOr[scala.Nothing],
    ease: js.Function,
    force: js.UndefOr[scala.Nothing],
    callback: js.UndefOr[scala.Nothing],
    context: js.Any
  ): this.type = js.native
  def pan(
    x: Double,
    y: Double,
    duration: js.UndefOr[scala.Nothing],
    ease: js.Function,
    force: js.UndefOr[scala.Nothing],
    callback: CameraPanCallback
  ): this.type = js.native
  def pan(
    x: Double,
    y: Double,
    duration: js.UndefOr[scala.Nothing],
    ease: js.Function,
    force: js.UndefOr[scala.Nothing],
    callback: CameraPanCallback,
    context: js.Any
  ): this.type = js.native
  def pan(x: Double, y: Double, duration: js.UndefOr[scala.Nothing], ease: js.Function, force: Boolean): this.type = js.native
  def pan(
    x: Double,
    y: Double,
    duration: js.UndefOr[scala.Nothing],
    ease: js.Function,
    force: Boolean,
    callback: js.UndefOr[scala.Nothing],
    context: js.Any
  ): this.type = js.native
  def pan(
    x: Double,
    y: Double,
    duration: js.UndefOr[scala.Nothing],
    ease: js.Function,
    force: Boolean,
    callback: CameraPanCallback
  ): this.type = js.native
  def pan(
    x: Double,
    y: Double,
    duration: js.UndefOr[scala.Nothing],
    ease: js.Function,
    force: Boolean,
    callback: CameraPanCallback,
    context: js.Any
  ): this.type = js.native
  def pan(x: Double, y: Double, duration: integer): this.type = js.native
  def pan(
    x: Double,
    y: Double,
    duration: integer,
    ease: js.UndefOr[scala.Nothing],
    force: js.UndefOr[scala.Nothing],
    callback: js.UndefOr[scala.Nothing],
    context: js.Any
  ): this.type = js.native
  def pan(
    x: Double,
    y: Double,
    duration: integer,
    ease: js.UndefOr[scala.Nothing],
    force: js.UndefOr[scala.Nothing],
    callback: CameraPanCallback
  ): this.type = js.native
  def pan(
    x: Double,
    y: Double,
    duration: integer,
    ease: js.UndefOr[scala.Nothing],
    force: js.UndefOr[scala.Nothing],
    callback: CameraPanCallback,
    context: js.Any
  ): this.type = js.native
  def pan(x: Double, y: Double, duration: integer, ease: js.UndefOr[scala.Nothing], force: Boolean): this.type = js.native
  def pan(
    x: Double,
    y: Double,
    duration: integer,
    ease: js.UndefOr[scala.Nothing],
    force: Boolean,
    callback: js.UndefOr[scala.Nothing],
    context: js.Any
  ): this.type = js.native
  def pan(
    x: Double,
    y: Double,
    duration: integer,
    ease: js.UndefOr[scala.Nothing],
    force: Boolean,
    callback: CameraPanCallback
  ): this.type = js.native
  def pan(
    x: Double,
    y: Double,
    duration: integer,
    ease: js.UndefOr[scala.Nothing],
    force: Boolean,
    callback: CameraPanCallback,
    context: js.Any
  ): this.type = js.native
  def pan(x: Double, y: Double, duration: integer, ease: String): this.type = js.native
  def pan(
    x: Double,
    y: Double,
    duration: integer,
    ease: String,
    force: js.UndefOr[scala.Nothing],
    callback: js.UndefOr[scala.Nothing],
    context: js.Any
  ): this.type = js.native
  def pan(
    x: Double,
    y: Double,
    duration: integer,
    ease: String,
    force: js.UndefOr[scala.Nothing],
    callback: CameraPanCallback
  ): this.type = js.native
  def pan(
    x: Double,
    y: Double,
    duration: integer,
    ease: String,
    force: js.UndefOr[scala.Nothing],
    callback: CameraPanCallback,
    context: js.Any
  ): this.type = js.native
  def pan(x: Double, y: Double, duration: integer, ease: String, force: Boolean): this.type = js.native
  def pan(
    x: Double,
    y: Double,
    duration: integer,
    ease: String,
    force: Boolean,
    callback: js.UndefOr[scala.Nothing],
    context: js.Any
  ): this.type = js.native
  def pan(x: Double, y: Double, duration: integer, ease: String, force: Boolean, callback: CameraPanCallback): this.type = js.native
  def pan(
    x: Double,
    y: Double,
    duration: integer,
    ease: String,
    force: Boolean,
    callback: CameraPanCallback,
    context: js.Any
  ): this.type = js.native
  def pan(x: Double, y: Double, duration: integer, ease: js.Function): this.type = js.native
  def pan(
    x: Double,
    y: Double,
    duration: integer,
    ease: js.Function,
    force: js.UndefOr[scala.Nothing],
    callback: js.UndefOr[scala.Nothing],
    context: js.Any
  ): this.type = js.native
  def pan(
    x: Double,
    y: Double,
    duration: integer,
    ease: js.Function,
    force: js.UndefOr[scala.Nothing],
    callback: CameraPanCallback
  ): this.type = js.native
  def pan(
    x: Double,
    y: Double,
    duration: integer,
    ease: js.Function,
    force: js.UndefOr[scala.Nothing],
    callback: CameraPanCallback,
    context: js.Any
  ): this.type = js.native
  def pan(x: Double, y: Double, duration: integer, ease: js.Function, force: Boolean): this.type = js.native
  def pan(
    x: Double,
    y: Double,
    duration: integer,
    ease: js.Function,
    force: Boolean,
    callback: js.UndefOr[scala.Nothing],
    context: js.Any
  ): this.type = js.native
  def pan(
    x: Double,
    y: Double,
    duration: integer,
    ease: js.Function,
    force: Boolean,
    callback: CameraPanCallback
  ): this.type = js.native
  def pan(
    x: Double,
    y: Double,
    duration: integer,
    ease: js.Function,
    force: Boolean,
    callback: CameraPanCallback,
    context: js.Any
  ): this.type = js.native
  
  /**
    * The Camera Pan effect handler.
    * To pan this camera see the `Camera.pan` method.
    */
  var panEffect: Pan = js.native
  
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
    * If this Camera is rendering to a texture (via `setRenderToTexture`) then you
    * have the option to control if it should also render to the Game canvas as well.
    * 
    * By default, a Camera will render both to its texture and to the Game canvas.
    * 
    * However, if you set ths property to `false` it will only render to the texture
    * and skip rendering to the Game canvas.
    * 
    * Setting this property if the Camera isn't rendering to a texture has no effect.
    */
  var renderToGame: Boolean = js.native
  
  /**
    * Is this Camera rendering directly to the canvas or to a texture?
    * 
    * Enable rendering to texture with the method `setRenderToTexture` (just enabling this boolean won't be enough)
    * 
    * Once enabled you can toggle it by switching this property.
    * 
    * To properly remove a render texture you should call the `clearRenderToTexture()` method.
    */
  var renderToTexture: Boolean = js.native
  
  /**
    * Resets any active FX, such as a fade, flash or shake. Useful to call after a fade in order to
    * remove the fade.
    */
  def resetFX(): this.type = js.native
  
  /**
    * This effect will rotate the Camera so that the viewport finishes at the given angle in radians,
    * over the duration and with the ease specified.
    * @param radians The destination angle in radians to rotate the Camera viewport to. If the angle is positive then the rotation is clockwise else anticlockwise
    * @param shortestPath If shortest path is set to true the camera will rotate in the quickest direction clockwise or anti-clockwise. Default false.
    * @param duration The duration of the effect in milliseconds. Default 1000.
    * @param ease The ease to use for the rotation. Can be any of the Phaser Easing constants or a custom function. Default 'Linear'.
    * @param force Force the rotation effect to start immediately, even if already running. Default false.
    * @param callback This callback will be invoked every frame for the duration of the effect.
    * It is sent four arguments: A reference to the camera, a progress amount between 0 and 1 indicating how complete the effect is,
    * the current camera rotation angle in radians.
    * @param context The context in which the callback is invoked. Defaults to the Scene to which the Camera belongs.
    */
  def rotateTo(
    radians: Double,
    shortestPath: js.UndefOr[Boolean],
    duration: js.UndefOr[integer],
    ease: js.UndefOr[String | js.Function],
    force: js.UndefOr[Boolean],
    callback: js.UndefOr[CameraRotateCallback],
    context: js.UndefOr[js.Any]
  ): Camera = js.native
  
  /**
    * The Camera Rotate To effect handler.
    * To rotate this camera see the `Camera.rotateTo` method.
    */
  var rotateToEffect: RotateTo = js.native
  
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
  def setDeadzone(): this.type = js.native
  def setDeadzone(width: js.UndefOr[scala.Nothing], height: Double): this.type = js.native
  def setDeadzone(width: Double): this.type = js.native
  def setDeadzone(width: Double, height: Double): this.type = js.native
  
  /**
    * Sets the horizontal and vertical offset of the camera from its follow target.
    * The values are subtracted from the targets position during the Cameras update step.
    * @param x The horizontal offset from the camera follow target.x position. Default 0.
    * @param y The vertical offset from the camera follow target.y position. Default 0.
    */
  def setFollowOffset(): this.type = js.native
  def setFollowOffset(x: js.UndefOr[scala.Nothing], y: Double): this.type = js.native
  def setFollowOffset(x: Double): this.type = js.native
  def setFollowOffset(x: Double, y: Double): this.type = js.native
  
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
  def setLerp(x: js.UndefOr[scala.Nothing], y: Double): this.type = js.native
  def setLerp(x: Double): this.type = js.native
  def setLerp(x: Double, y: Double): this.type = js.native
  
  /**
    * Sets the WebGL pipeline this Camera is using when rendering to a texture.
    * 
    * You can pass either the string-based name of the pipeline, or a reference to the pipeline itself.
    * 
    * Call this method with no arguments to clear any previously set pipeline.
    * @param pipeline The WebGL Pipeline to render with, can be either a string which is the name of the pipeline, or a pipeline reference. Or if left empty it will clear the pipeline.
    */
  def setPipeline(): this.type = js.native
  def setPipeline(pipeline: String): this.type = js.native
  def setPipeline(pipeline: WebGLPipeline): this.type = js.native
  
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
    * If you only require the Camera to render to a texture, and not also to the Game,
    * them set the `renderToGame` parameter to `false`.
    * 
    * To temporarily disable rendering to a texture, toggle the `renderToTexture` boolean.
    * 
    * If you no longer require the Camera to render to a texture, call the `clearRenderToTexture` method,
    * which will delete the respective textures and free-up resources.
    * @param pipeline An optional WebGL Pipeline to render with, can be either a string which is the name of the pipeline, or a pipeline reference.
    * @param renderToGame If you do not need the Camera to still render to the Game, set this parameter to `false`. Default true.
    */
  def setRenderToTexture(): this.type = js.native
  def setRenderToTexture(pipeline: js.UndefOr[scala.Nothing], renderToGame: Boolean): this.type = js.native
  def setRenderToTexture(pipeline: String): this.type = js.native
  def setRenderToTexture(pipeline: String, renderToGame: Boolean): this.type = js.native
  def setRenderToTexture(pipeline: WebGLPipeline): this.type = js.native
  def setRenderToTexture(pipeline: WebGLPipeline, renderToGame: Boolean): this.type = js.native
  
  /**
    * Shakes the Camera by the given intensity over the duration specified.
    * @param duration The duration of the effect in milliseconds. Default 100.
    * @param intensity The intensity of the shake. Default 0.05.
    * @param force Force the shake effect to start immediately, even if already running. Default false.
    * @param callback This callback will be invoked every frame for the duration of the effect.
    * It is sent two arguments: A reference to the camera and a progress amount between 0 and 1 indicating how complete the effect is.
    * @param context The context in which the callback is invoked. Defaults to the Scene to which the Camera belongs.
    */
  def shake(): this.type = js.native
  def shake(
    duration: js.UndefOr[scala.Nothing],
    intensity: js.UndefOr[scala.Nothing],
    force: js.UndefOr[scala.Nothing],
    callback: js.UndefOr[scala.Nothing],
    context: js.Any
  ): this.type = js.native
  def shake(
    duration: js.UndefOr[scala.Nothing],
    intensity: js.UndefOr[scala.Nothing],
    force: js.UndefOr[scala.Nothing],
    callback: js.Function
  ): this.type = js.native
  def shake(
    duration: js.UndefOr[scala.Nothing],
    intensity: js.UndefOr[scala.Nothing],
    force: js.UndefOr[scala.Nothing],
    callback: js.Function,
    context: js.Any
  ): this.type = js.native
  def shake(duration: js.UndefOr[scala.Nothing], intensity: js.UndefOr[scala.Nothing], force: Boolean): this.type = js.native
  def shake(
    duration: js.UndefOr[scala.Nothing],
    intensity: js.UndefOr[scala.Nothing],
    force: Boolean,
    callback: js.UndefOr[scala.Nothing],
    context: js.Any
  ): this.type = js.native
  def shake(
    duration: js.UndefOr[scala.Nothing],
    intensity: js.UndefOr[scala.Nothing],
    force: Boolean,
    callback: js.Function
  ): this.type = js.native
  def shake(
    duration: js.UndefOr[scala.Nothing],
    intensity: js.UndefOr[scala.Nothing],
    force: Boolean,
    callback: js.Function,
    context: js.Any
  ): this.type = js.native
  def shake(duration: js.UndefOr[scala.Nothing], intensity: Double): this.type = js.native
  def shake(
    duration: js.UndefOr[scala.Nothing],
    intensity: Double,
    force: js.UndefOr[scala.Nothing],
    callback: js.UndefOr[scala.Nothing],
    context: js.Any
  ): this.type = js.native
  def shake(
    duration: js.UndefOr[scala.Nothing],
    intensity: Double,
    force: js.UndefOr[scala.Nothing],
    callback: js.Function
  ): this.type = js.native
  def shake(
    duration: js.UndefOr[scala.Nothing],
    intensity: Double,
    force: js.UndefOr[scala.Nothing],
    callback: js.Function,
    context: js.Any
  ): this.type = js.native
  def shake(duration: js.UndefOr[scala.Nothing], intensity: Double, force: Boolean): this.type = js.native
  def shake(
    duration: js.UndefOr[scala.Nothing],
    intensity: Double,
    force: Boolean,
    callback: js.UndefOr[scala.Nothing],
    context: js.Any
  ): this.type = js.native
  def shake(duration: js.UndefOr[scala.Nothing], intensity: Double, force: Boolean, callback: js.Function): this.type = js.native
  def shake(
    duration: js.UndefOr[scala.Nothing],
    intensity: Double,
    force: Boolean,
    callback: js.Function,
    context: js.Any
  ): this.type = js.native
  def shake(duration: js.UndefOr[scala.Nothing], intensity: Vector2): this.type = js.native
  def shake(
    duration: js.UndefOr[scala.Nothing],
    intensity: Vector2,
    force: js.UndefOr[scala.Nothing],
    callback: js.UndefOr[scala.Nothing],
    context: js.Any
  ): this.type = js.native
  def shake(
    duration: js.UndefOr[scala.Nothing],
    intensity: Vector2,
    force: js.UndefOr[scala.Nothing],
    callback: js.Function
  ): this.type = js.native
  def shake(
    duration: js.UndefOr[scala.Nothing],
    intensity: Vector2,
    force: js.UndefOr[scala.Nothing],
    callback: js.Function,
    context: js.Any
  ): this.type = js.native
  def shake(duration: js.UndefOr[scala.Nothing], intensity: Vector2, force: Boolean): this.type = js.native
  def shake(
    duration: js.UndefOr[scala.Nothing],
    intensity: Vector2,
    force: Boolean,
    callback: js.UndefOr[scala.Nothing],
    context: js.Any
  ): this.type = js.native
  def shake(duration: js.UndefOr[scala.Nothing], intensity: Vector2, force: Boolean, callback: js.Function): this.type = js.native
  def shake(
    duration: js.UndefOr[scala.Nothing],
    intensity: Vector2,
    force: Boolean,
    callback: js.Function,
    context: js.Any
  ): this.type = js.native
  def shake(duration: integer): this.type = js.native
  def shake(
    duration: integer,
    intensity: js.UndefOr[scala.Nothing],
    force: js.UndefOr[scala.Nothing],
    callback: js.UndefOr[scala.Nothing],
    context: js.Any
  ): this.type = js.native
  def shake(
    duration: integer,
    intensity: js.UndefOr[scala.Nothing],
    force: js.UndefOr[scala.Nothing],
    callback: js.Function
  ): this.type = js.native
  def shake(
    duration: integer,
    intensity: js.UndefOr[scala.Nothing],
    force: js.UndefOr[scala.Nothing],
    callback: js.Function,
    context: js.Any
  ): this.type = js.native
  def shake(duration: integer, intensity: js.UndefOr[scala.Nothing], force: Boolean): this.type = js.native
  def shake(
    duration: integer,
    intensity: js.UndefOr[scala.Nothing],
    force: Boolean,
    callback: js.UndefOr[scala.Nothing],
    context: js.Any
  ): this.type = js.native
  def shake(duration: integer, intensity: js.UndefOr[scala.Nothing], force: Boolean, callback: js.Function): this.type = js.native
  def shake(
    duration: integer,
    intensity: js.UndefOr[scala.Nothing],
    force: Boolean,
    callback: js.Function,
    context: js.Any
  ): this.type = js.native
  def shake(duration: integer, intensity: Double): this.type = js.native
  def shake(
    duration: integer,
    intensity: Double,
    force: js.UndefOr[scala.Nothing],
    callback: js.UndefOr[scala.Nothing],
    context: js.Any
  ): this.type = js.native
  def shake(duration: integer, intensity: Double, force: js.UndefOr[scala.Nothing], callback: js.Function): this.type = js.native
  def shake(
    duration: integer,
    intensity: Double,
    force: js.UndefOr[scala.Nothing],
    callback: js.Function,
    context: js.Any
  ): this.type = js.native
  def shake(duration: integer, intensity: Double, force: Boolean): this.type = js.native
  def shake(
    duration: integer,
    intensity: Double,
    force: Boolean,
    callback: js.UndefOr[scala.Nothing],
    context: js.Any
  ): this.type = js.native
  def shake(duration: integer, intensity: Double, force: Boolean, callback: js.Function): this.type = js.native
  def shake(duration: integer, intensity: Double, force: Boolean, callback: js.Function, context: js.Any): this.type = js.native
  def shake(duration: integer, intensity: Vector2): this.type = js.native
  def shake(
    duration: integer,
    intensity: Vector2,
    force: js.UndefOr[scala.Nothing],
    callback: js.UndefOr[scala.Nothing],
    context: js.Any
  ): this.type = js.native
  def shake(duration: integer, intensity: Vector2, force: js.UndefOr[scala.Nothing], callback: js.Function): this.type = js.native
  def shake(
    duration: integer,
    intensity: Vector2,
    force: js.UndefOr[scala.Nothing],
    callback: js.Function,
    context: js.Any
  ): this.type = js.native
  def shake(duration: integer, intensity: Vector2, force: Boolean): this.type = js.native
  def shake(
    duration: integer,
    intensity: Vector2,
    force: Boolean,
    callback: js.UndefOr[scala.Nothing],
    context: js.Any
  ): this.type = js.native
  def shake(duration: integer, intensity: Vector2, force: Boolean, callback: js.Function): this.type = js.native
  def shake(duration: integer, intensity: Vector2, force: Boolean, callback: js.Function, context: js.Any): this.type = js.native
  
  /**
    * The Camera Shake effect handler.
    * To shake this camera see the `Camera.shake` method.
    */
  var shakeEffect: Shake = js.native
  
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
  def startFollow(
    target: GameObject | js.Object,
    roundPixels: js.UndefOr[Boolean],
    lerpX: js.UndefOr[Double],
    lerpY: js.UndefOr[Double],
    offsetX: js.UndefOr[Double],
    offsetY: js.UndefOr[Double]
  ): this.type = js.native
  
  /**
    * Stops a Camera from following a Game Object, if previously set via `Camera.startFollow`.
    */
  def stopFollow(): this.type = js.native
  
  /**
    * The Camera Zoom effect handler.
    * To zoom this camera see the `Camera.zoom` method.
    */
  var zoomEffect: Zoom = js.native
  
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
  def zoomTo(zoom: Double): this.type = js.native
  def zoomTo(
    zoom: Double,
    duration: js.UndefOr[scala.Nothing],
    ease: js.UndefOr[scala.Nothing],
    force: js.UndefOr[scala.Nothing],
    callback: js.UndefOr[scala.Nothing],
    context: js.Any
  ): this.type = js.native
  def zoomTo(
    zoom: Double,
    duration: js.UndefOr[scala.Nothing],
    ease: js.UndefOr[scala.Nothing],
    force: js.UndefOr[scala.Nothing],
    callback: CameraPanCallback
  ): this.type = js.native
  def zoomTo(
    zoom: Double,
    duration: js.UndefOr[scala.Nothing],
    ease: js.UndefOr[scala.Nothing],
    force: js.UndefOr[scala.Nothing],
    callback: CameraPanCallback,
    context: js.Any
  ): this.type = js.native
  def zoomTo(zoom: Double, duration: js.UndefOr[scala.Nothing], ease: js.UndefOr[scala.Nothing], force: Boolean): this.type = js.native
  def zoomTo(
    zoom: Double,
    duration: js.UndefOr[scala.Nothing],
    ease: js.UndefOr[scala.Nothing],
    force: Boolean,
    callback: js.UndefOr[scala.Nothing],
    context: js.Any
  ): this.type = js.native
  def zoomTo(
    zoom: Double,
    duration: js.UndefOr[scala.Nothing],
    ease: js.UndefOr[scala.Nothing],
    force: Boolean,
    callback: CameraPanCallback
  ): this.type = js.native
  def zoomTo(
    zoom: Double,
    duration: js.UndefOr[scala.Nothing],
    ease: js.UndefOr[scala.Nothing],
    force: Boolean,
    callback: CameraPanCallback,
    context: js.Any
  ): this.type = js.native
  def zoomTo(zoom: Double, duration: js.UndefOr[scala.Nothing], ease: String): this.type = js.native
  def zoomTo(
    zoom: Double,
    duration: js.UndefOr[scala.Nothing],
    ease: String,
    force: js.UndefOr[scala.Nothing],
    callback: js.UndefOr[scala.Nothing],
    context: js.Any
  ): this.type = js.native
  def zoomTo(
    zoom: Double,
    duration: js.UndefOr[scala.Nothing],
    ease: String,
    force: js.UndefOr[scala.Nothing],
    callback: CameraPanCallback
  ): this.type = js.native
  def zoomTo(
    zoom: Double,
    duration: js.UndefOr[scala.Nothing],
    ease: String,
    force: js.UndefOr[scala.Nothing],
    callback: CameraPanCallback,
    context: js.Any
  ): this.type = js.native
  def zoomTo(zoom: Double, duration: js.UndefOr[scala.Nothing], ease: String, force: Boolean): this.type = js.native
  def zoomTo(
    zoom: Double,
    duration: js.UndefOr[scala.Nothing],
    ease: String,
    force: Boolean,
    callback: js.UndefOr[scala.Nothing],
    context: js.Any
  ): this.type = js.native
  def zoomTo(
    zoom: Double,
    duration: js.UndefOr[scala.Nothing],
    ease: String,
    force: Boolean,
    callback: CameraPanCallback
  ): this.type = js.native
  def zoomTo(
    zoom: Double,
    duration: js.UndefOr[scala.Nothing],
    ease: String,
    force: Boolean,
    callback: CameraPanCallback,
    context: js.Any
  ): this.type = js.native
  def zoomTo(zoom: Double, duration: js.UndefOr[scala.Nothing], ease: js.Function): this.type = js.native
  def zoomTo(
    zoom: Double,
    duration: js.UndefOr[scala.Nothing],
    ease: js.Function,
    force: js.UndefOr[scala.Nothing],
    callback: js.UndefOr[scala.Nothing],
    context: js.Any
  ): this.type = js.native
  def zoomTo(
    zoom: Double,
    duration: js.UndefOr[scala.Nothing],
    ease: js.Function,
    force: js.UndefOr[scala.Nothing],
    callback: CameraPanCallback
  ): this.type = js.native
  def zoomTo(
    zoom: Double,
    duration: js.UndefOr[scala.Nothing],
    ease: js.Function,
    force: js.UndefOr[scala.Nothing],
    callback: CameraPanCallback,
    context: js.Any
  ): this.type = js.native
  def zoomTo(zoom: Double, duration: js.UndefOr[scala.Nothing], ease: js.Function, force: Boolean): this.type = js.native
  def zoomTo(
    zoom: Double,
    duration: js.UndefOr[scala.Nothing],
    ease: js.Function,
    force: Boolean,
    callback: js.UndefOr[scala.Nothing],
    context: js.Any
  ): this.type = js.native
  def zoomTo(
    zoom: Double,
    duration: js.UndefOr[scala.Nothing],
    ease: js.Function,
    force: Boolean,
    callback: CameraPanCallback
  ): this.type = js.native
  def zoomTo(
    zoom: Double,
    duration: js.UndefOr[scala.Nothing],
    ease: js.Function,
    force: Boolean,
    callback: CameraPanCallback,
    context: js.Any
  ): this.type = js.native
  def zoomTo(zoom: Double, duration: integer): this.type = js.native
  def zoomTo(
    zoom: Double,
    duration: integer,
    ease: js.UndefOr[scala.Nothing],
    force: js.UndefOr[scala.Nothing],
    callback: js.UndefOr[scala.Nothing],
    context: js.Any
  ): this.type = js.native
  def zoomTo(
    zoom: Double,
    duration: integer,
    ease: js.UndefOr[scala.Nothing],
    force: js.UndefOr[scala.Nothing],
    callback: CameraPanCallback
  ): this.type = js.native
  def zoomTo(
    zoom: Double,
    duration: integer,
    ease: js.UndefOr[scala.Nothing],
    force: js.UndefOr[scala.Nothing],
    callback: CameraPanCallback,
    context: js.Any
  ): this.type = js.native
  def zoomTo(zoom: Double, duration: integer, ease: js.UndefOr[scala.Nothing], force: Boolean): this.type = js.native
  def zoomTo(
    zoom: Double,
    duration: integer,
    ease: js.UndefOr[scala.Nothing],
    force: Boolean,
    callback: js.UndefOr[scala.Nothing],
    context: js.Any
  ): this.type = js.native
  def zoomTo(
    zoom: Double,
    duration: integer,
    ease: js.UndefOr[scala.Nothing],
    force: Boolean,
    callback: CameraPanCallback
  ): this.type = js.native
  def zoomTo(
    zoom: Double,
    duration: integer,
    ease: js.UndefOr[scala.Nothing],
    force: Boolean,
    callback: CameraPanCallback,
    context: js.Any
  ): this.type = js.native
  def zoomTo(zoom: Double, duration: integer, ease: String): this.type = js.native
  def zoomTo(
    zoom: Double,
    duration: integer,
    ease: String,
    force: js.UndefOr[scala.Nothing],
    callback: js.UndefOr[scala.Nothing],
    context: js.Any
  ): this.type = js.native
  def zoomTo(
    zoom: Double,
    duration: integer,
    ease: String,
    force: js.UndefOr[scala.Nothing],
    callback: CameraPanCallback
  ): this.type = js.native
  def zoomTo(
    zoom: Double,
    duration: integer,
    ease: String,
    force: js.UndefOr[scala.Nothing],
    callback: CameraPanCallback,
    context: js.Any
  ): this.type = js.native
  def zoomTo(zoom: Double, duration: integer, ease: String, force: Boolean): this.type = js.native
  def zoomTo(
    zoom: Double,
    duration: integer,
    ease: String,
    force: Boolean,
    callback: js.UndefOr[scala.Nothing],
    context: js.Any
  ): this.type = js.native
  def zoomTo(zoom: Double, duration: integer, ease: String, force: Boolean, callback: CameraPanCallback): this.type = js.native
  def zoomTo(
    zoom: Double,
    duration: integer,
    ease: String,
    force: Boolean,
    callback: CameraPanCallback,
    context: js.Any
  ): this.type = js.native
  def zoomTo(zoom: Double, duration: integer, ease: js.Function): this.type = js.native
  def zoomTo(
    zoom: Double,
    duration: integer,
    ease: js.Function,
    force: js.UndefOr[scala.Nothing],
    callback: js.UndefOr[scala.Nothing],
    context: js.Any
  ): this.type = js.native
  def zoomTo(
    zoom: Double,
    duration: integer,
    ease: js.Function,
    force: js.UndefOr[scala.Nothing],
    callback: CameraPanCallback
  ): this.type = js.native
  def zoomTo(
    zoom: Double,
    duration: integer,
    ease: js.Function,
    force: js.UndefOr[scala.Nothing],
    callback: CameraPanCallback,
    context: js.Any
  ): this.type = js.native
  def zoomTo(zoom: Double, duration: integer, ease: js.Function, force: Boolean): this.type = js.native
  def zoomTo(
    zoom: Double,
    duration: integer,
    ease: js.Function,
    force: Boolean,
    callback: js.UndefOr[scala.Nothing],
    context: js.Any
  ): this.type = js.native
  def zoomTo(zoom: Double, duration: integer, ease: js.Function, force: Boolean, callback: CameraPanCallback): this.type = js.native
  def zoomTo(
    zoom: Double,
    duration: integer,
    ease: js.Function,
    force: Boolean,
    callback: CameraPanCallback,
    context: js.Any
  ): this.type = js.native
}
