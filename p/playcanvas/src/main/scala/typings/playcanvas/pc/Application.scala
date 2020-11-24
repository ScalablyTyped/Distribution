package typings.playcanvas.pc

import typings.playcanvas.anon.Physics
import typings.playcanvas.pc.callbacks.ConfigureApp
import typings.playcanvas.pc.callbacks.PreloadApp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Create a new Application.
  * @example
  * // Engine-only example: create the application manually
  * var app = new pc.Application(canvas, options);
  *
  * // Start the application's main loop
  * app.start();
  * @param canvas - The canvas element.
  * @param [options.elementInput] - Input handler for {@link pc.ElementComponent}s.
  * @param [options.keyboard] - Keyboard handler for input.
  * @param [options.mouse] - Mouse handler for input.
  * @param [options.touch] - TouchDevice handler for input.
  * @param [options.gamepads] - Gamepad handler for input.
  * @param [options.scriptPrefix] - Prefix to apply to script urls before loading.
  * @param [options.assetPrefix] - Prefix to apply to asset urls before loading.
  * @param [options.graphicsDeviceOptions] - Options object that is passed into the {@link pc.GraphicsDevice} constructor.
  * @param [options.scriptsOrder] - Scripts in order of loading first.
  */
@js.native
trait Application extends EventHandler {
  
  /**
    * Apply scene settings to the current scene. Useful when your scene settings are parsed or generated from a non-URL source.
    * @example
    * var settings = {
    *     physics: {
    *         gravity: [0, -9.8, 0]
    *     },
    *     render: {
    *         fog_end: 1000,
    *         tonemapping: 0,
    *         skybox: null,
    *         fog_density: 0.01,
    *         gamma_correction: 1,
    *         exposure: 1,
    *         fog_start: 1,
    *         global_ambient: [0, 0, 0],
    *         skyboxIntensity: 1,
    *         skyboxRotation: [0, 0, 0, 1],
    *         fog_color: [0, 0, 0],
    *         lightmapMode: 1,
    *         fog: 'none',
    *         lightmapMaxResolution: 2048,
    *         skyboxMip: 2,
    *         lightmapSizeMultiplier: 16
    *     }
    * };
    * app.applySceneSettings(settings);
    * @param settings - The scene settings to be applied.
    * @param settings.physics - The physics settings to be applied.
    * @param settings.physics.gravity - The world space vector representing global gravity in the physics simulation. Must be a fixed size array with three number elements, corresponding to each axis [ X, Y, Z ].
    * @param settings.render - The rendering settings to be applied.
    * @param settings.render.global_ambient - The color of the scene's ambient light. Must be a fixed size array with three number elements, corresponding to each color channel [ R, G, B ].
    * @param settings.render.fog - The type of fog used by the scene. Can be:
    *
    * * {@link pc.FOG_NONE}
    * * {@link pc.FOG_LINEAR}
    * * {@link pc.FOG_EXP}
    * * {@link pc.FOG_EXP2}
    * @param settings.render.fog_color - The color of the fog (if enabled). Must be a fixed size array with three number elements, corresponding to each color channel [ R, G, B ].
    * @param settings.render.fog_density - The density of the fog (if enabled). This property is only valid if the fog property is set to pc.FOG_EXP or pc.FOG_EXP2.
    * @param settings.render.fog_start - The distance from the viewpoint where linear fog begins. This property is only valid if the fog property is set to pc.FOG_LINEAR.
    * @param settings.render.fog_end - The distance from the viewpoint where linear fog reaches its maximum. This property is only valid if the fog property is set to pc.FOG_LINEAR.
    * @param settings.render.gamma_correction - The gamma correction to apply when rendering the scene. Can be:
    *
    * * {@link pc.GAMMA_NONE}
    * * {@link pc.GAMMA_SRGB}
    * @param settings.render.tonemapping - The tonemapping transform to apply when writing fragments to the
    * frame buffer. Can be:
    *
    * * {@link pc.TONEMAP_LINEAR}
    * * {@link pc.TONEMAP_FILMIC}
    * * {@link pc.TONEMAP_HEJL}
    * * {@link pc.TONEMAP_ACES}
    * @param settings.render.exposure - The exposure value tweaks the overall brightness of the scene.
    * @param [settings.render.skybox] - The asset ID of the cube map texture to be used as the scene's skybox. Defaults to null.
    * @param settings.render.skyboxIntensity - Multiplier for skybox intensity.
    * @param settings.render.skyboxMip - The mip level of the skybox to be displayed. Only valid for prefiltered cubemap skyboxes.
    * @param settings.render.skyboxRotation - Rotation of skybox.
    * @param settings.render.lightmapSizeMultiplier - The lightmap resolution multiplier.
    * @param settings.render.lightmapMaxResolution - The maximum lightmap resolution.
    * @param settings.render.lightmapMode - The lightmap baking mode. Can be:
    *
    * * {@link pc.BAKE_COLOR}: single color lightmap
    * * {@link pc.BAKE_COLORDIR}: single color lightmap + dominant light direction (used for bump/specular)
    *
    * Only lights with bakeDir=true will be used for generating the dominant light direction. Defaults to.
    */
  def applySceneSettings(settings: Physics): Unit = js.native
  
  /**
    * The asset registry managed by the application.
    * @example
    * // Search the asset registry for all assets with the tag 'vehicle'
    * var vehicleAssets = this.app.assets.findByTag('vehicle');
    */
  var assets: AssetRegistry = js.native
  
  /**
    * When true, the application's render function is called every frame.
    * Setting autoRender to false is useful to applications where the rendered image
    * may often be unchanged over time. This can heavily reduce the application's
    * load on the CPU and GPU. Defaults to true.
    * @example
    * // Disable rendering every frame and only render on a keydown event
    * this.app.autoRender = false;
    * this.app.keyboard.on('keydown', function (event) {
    *     this.app.renderNextFrame = true;
    * }, this);
    */
  var autoRender: Boolean = js.native
  
  /**
    * The application's batch manager. The batch manager is used to
    * merge mesh instances in the scene, which reduces the overall number of draw
    * calls, thereby boosting performance.
    */
  var batcher: BatchManager = js.native
  
  /**
    * Load the application configuration file and apply application properties and fill the asset registry.
    * @param url - The URL of the configuration file to load.
    * @param callback - The Function called when the configuration file is loaded and parsed (or an error occurs).
    */
  def configure(url: String, callback: ConfigureApp): Unit = js.native
  
  /**
    * Destroys application and removes all event listeners.
    * @example
    * this.app.destroy();
    */
  def destroy(): Unit = js.native
  
  /**
    * Used to handle input for {@link pc.ElementComponent}s.
    */
  var elementInput: ElementInput = js.native
  
  /**
    * The current fill mode of the canvas. Can be:
    *
    * * {@link pc.FILLMODE_NONE}: the canvas will always match the size provided.
    * * {@link pc.FILLMODE_FILL_WINDOW}: the canvas will simply fill the window, changing aspect ratio.
    * * {@link pc.FILLMODE_KEEP_ASPECT}: the canvas will grow to fill the window as best it can while maintaining the aspect ratio.
    */
  val fillMode: String = js.native
  
  /**
    * Used to access GamePad input.
    */
  var gamepads: GamePads = js.native
  
  /**
    * The graphics device used by the application.
    */
  var graphicsDevice: GraphicsDevice = js.native
  
  /**
    * Handles localization.
    */
  var i18n: I18n = js.native
  
  /**
    * Queries the visibility of the window or tab in which the application is running.
    * @returns True if the application is not visible and false otherwise.
    */
  def isHidden(): Boolean = js.native
  
  /**
    * The keyboard device.
    */
  var keyboard: Keyboard = js.native
  
  /**
    * The run-time lightmapper.
    */
  var lightmapper: Lightmapper = js.native
  
  /**
    * The resource loader.
    */
  var loader: ResourceLoader = js.native
  
  /**
    * Clamps per-frame delta time to an upper bound. Useful since returning from a tab
    * deactivation can generate huge values for dt, which can adversely affect game state. Defaults
    * to 0.1 (seconds).
    * @example
    * // Don't clamp inter-frame times of 200ms or less
    * this.app.maxDeltaTime = 0.2;
    */
  var maxDeltaTime: Double = js.native
  
  /**
    * The mouse device.
    */
  var mouse: Mouse = js.native
  
  /**
    * Load all assets in the asset registry that are marked as 'preload'.
    * @param callback - Function called when all assets are loaded.
    */
  def preload(callback: PreloadApp): Unit = js.native
  
  /**
    * Render the application's scene. More specifically, the scene's
    * {@link pc.LayerComposition} is rendered by the application's {@link pc.ForwardRenderer}.
    * This function is called internally in the application's main loop and
    * does not need to be called explicitly.
    */
  def render(): Unit = js.native
  
  /**
    * Renders a line. Line start and end coordinates are specified in
    * world-space. If a single color is supplied, the line will be flat-shaded with
    * that color. If two colors are supplied, the line will be smooth shaded between
    * those colors. It is also possible to control which scene layer the line is
    * rendered into. By default, lines are rendered into the immediate layer
    * {@link pc.LAYERID_IMMEDIATE}.
    * @example
    * // Render a 1-unit long white line
    * var start = new pc.Vec3(0, 0, 0);
    * var end = new pc.Vec3(1, 0, 0);
    * var color = new pc.Color(1, 1, 1);
    * app.renderLine(start, end, color);
    * @example
    * // Render a 1-unit long line that is smooth-shaded from white to red
    * var start = new pc.Vec3(0, 0, 0);
    * var end = new pc.Vec3(1, 0, 0);
    * var startColor = new pc.Color(1, 1, 1);
    * var endColor = new pc.Color(1, 0, 0);
    * app.renderLine(start, end, startColor, endColor);
    * @example
    * // Render a 1-unit long white line into the world layer
    * var start = new pc.Vec3(0, 0, 0);
    * var end = new pc.Vec3(1, 0, 0);
    * var color = new pc.Color(1, 1, 1);
    * var worldLayer = app.scene.layers.getLayerById(pc.LAYERID_WORLD);
    * app.renderLine(start, end, color, {
    *     layer: worldLayer
    * });
    * @example
    * // Render a 1-unit long line that is smooth-shaded from white to red into the world layer
    * var start = new pc.Vec3(0, 0, 0);
    * var end = new pc.Vec3(1, 0, 0);
    * var startColor = new pc.Color(1, 1, 1);
    * var endColor = new pc.Color(1, 0, 0);
    * var worldLayer = app.scene.layers.getLayerById(pc.LAYERID_WORLD);
    * app.renderLine(start, end, color, {
    *     layer: worldLayer
    * });
    * @param start - The start world-space coordinate of the line.
    * @param end - The end world-space coordinate of the line.
    * @param color - The start color of the line.
    * @param [endColor] - The end color of the line.
    * @param [options] - Options to set rendering properties.
    * @param [options.layer] - The layer to render the line into. Defaults
    * to {@link pc.LAYERID_IMMEDIATE}.
    */
  def renderLine(start: Vec3, end: Vec3, color: Color): Unit = js.native
  def renderLine(
    start: Vec3,
    end: Vec3,
    color: Color,
    endColor: js.UndefOr[scala.Nothing],
    options: typings.playcanvas.anon.Layer
  ): Unit = js.native
  def renderLine(start: Vec3, end: Vec3, color: Color, endColor: Color): Unit = js.native
  def renderLine(start: Vec3, end: Vec3, color: Color, endColor: Color, options: typings.playcanvas.anon.Layer): Unit = js.native
  
  /**
    * Renders an arbitrary number of discrete line segments. The lines
    * are not connected by each subsequent point in the array. Instead, they are
    * individual segments specified by two points. Therefore, the lengths of the
    * supplied position and color arrays must be the same and also must be a multiple
    * of 2. The colors of the ends of each line segment will be interpolated along
    * the length of each line.
    * @example
    * // Render 2 discrete line segments
    * var points = [
    *     // Line 1
    *     new pc.Vec3(0, 0, 0),
    *     new pc.Vec3(1, 0, 0),
    *     // Line 2
    *     new pc.Vec3(1, 1, 0),
    *     new pc.Vec3(1, 1, 1)
    * ];
    * var colors = [
    *     // Line 1
    *     pc.Color.RED,
    *     pc.Color.YELLOW,
    *     // Line 2
    *     pc.Color.CYAN,
    *     pc.Color.BLUE
    * ];
    * app.renderLines(points, colors);
    * @param position - An array of points to draw lines between. The
    * length of the array must be a multiple of 2.
    * @param color - An array of colors to color the lines. This
    * must be the same length as the position array. The length of the array must
    * also be a multiple of 2.
    * @param [options] - Options to set rendering properties.
    * @param [options.layer] - The layer to render the lines into.
    */
  def renderLines(position: js.Array[Vec3], color: js.Array[Color]): Unit = js.native
  def renderLines(position: js.Array[Vec3], color: js.Array[Color], options: typings.playcanvas.anon.Layer): Unit = js.native
  
  /**
    * Set to true to render the scene on the next iteration of the main loop.
    * This only has an effect if {@link pc.Application#autoRender} is set to false. The
    * value of renderNextFrame is set back to false again as soon as the scene has been
    * rendered.
    * @example
    * // Render the scene only while space key is pressed
    * if (this.app.keyboard.isPressed(pc.KEY_SPACE)) {
    *     this.app.renderNextFrame = true;
    * }
    */
  var renderNextFrame: Boolean = js.native
  
  /**
    * Resize the application's canvas element in line with the current fill mode.
    * In {@link pc.FILLMODE_KEEP_ASPECT} mode, the canvas will grow to fill the window as best it can while maintaining the aspect ratio.
    * In {@link pc.FILLMODE_FILL_WINDOW} mode, the canvas will simply fill the window, changing aspect ratio.
    * In {@link pc.FILLMODE_NONE} mode, the canvas will always match the size provided.
    * @param [width] - The width of the canvas. Only used if current fill mode is {@link pc.FILLMODE_NONE}.
    * @param [height] - The height of the canvas. Only used if current fill mode is {@link pc.FILLMODE_NONE}.
    * @returns A object containing the values calculated to use as width and height.
    */
  def resizeCanvas(): js.Any = js.native
  def resizeCanvas(width: js.UndefOr[scala.Nothing], height: Double): js.Any = js.native
  def resizeCanvas(width: Double): js.Any = js.native
  def resizeCanvas(width: Double, height: Double): js.Any = js.native
  
  /**
    * The current resolution mode of the canvas, Can be:
    *
    * * {@link pc.RESOLUTION_AUTO}: if width and height are not provided, canvas will be resized to match canvas client size.
    * * {@link pc.RESOLUTION_FIXED}: resolution of canvas will be fixed.
    */
  val resolutionMode: String = js.native
  
  /**
    * The root entity of the application.
    * @example
    * // Return the first entity called 'Camera' in a depth-first search of the scene hierarchy
    * var camera = this.app.root.findByName('Camera');
    */
  var root: Entity = js.native
  
  /**
    * The scene managed by the application.
    * @example
    * // Set the tone mapping property of the application's scene
    * this.app.scene.toneMapping = pc.TONEMAP_FILMIC;
    */
  var scene: Scene = js.native
  
  /**
    * The scene registry managed by the application.
    * @example
    * // Search the scene registry for a item with the name 'racetrack1'
    * var sceneItem = this.app.scenes.find('racetrack1');
    *
    * // Load the scene using the item's url
    * this.app.scenes.loadScene(sceneItem.url);
    */
  var scenes: SceneRegistry = js.native
  
  /**
    * The application's script registry.
    */
  var scripts: ScriptRegistry = js.native
  
  /**
    * Controls how the canvas fills the window and resizes when the window changes.
    * @param mode - The mode to use when setting the size of the canvas. Can be:
    *
    * * {@link pc.FILLMODE_NONE}: the canvas will always match the size provided.
    * * {@link pc.FILLMODE_FILL_WINDOW}: the canvas will simply fill the window, changing aspect ratio.
    * * {@link pc.FILLMODE_KEEP_ASPECT}: the canvas will grow to fill the window as best it can while maintaining the aspect ratio.
    * @param [width] - The width of the canvas (only used when mode is pc.FILLMODE_NONE).
    * @param [height] - The height of the canvas (only used when mode is pc.FILLMODE_NONE).
    */
  def setCanvasFillMode(mode: String): Unit = js.native
  def setCanvasFillMode(mode: String, width: js.UndefOr[scala.Nothing], height: Double): Unit = js.native
  def setCanvasFillMode(mode: String, width: Double): Unit = js.native
  def setCanvasFillMode(mode: String, width: Double, height: Double): Unit = js.native
  
  /**
    * Change the resolution of the canvas, and set the way it behaves when the window is resized.
    * @param mode - The mode to use when setting the resolution. Can be:
    *
    * * {@link pc.RESOLUTION_AUTO}: if width and height are not provided, canvas will be resized to match canvas client size.
    * * {@link pc.RESOLUTION_FIXED}: resolution of canvas will be fixed.
    * @param [width] - The horizontal resolution, optional in AUTO mode, if not provided canvas clientWidth is used.
    * @param [height] - The vertical resolution, optional in AUTO mode, if not provided canvas clientHeight is used.
    */
  def setCanvasResolution(mode: String): Unit = js.native
  def setCanvasResolution(mode: String, width: js.UndefOr[scala.Nothing], height: Double): Unit = js.native
  def setCanvasResolution(mode: String, width: Double): Unit = js.native
  def setCanvasResolution(mode: String, width: Double, height: Double): Unit = js.native
  
  /**
    * Sets the skybox asset to current scene, and subscribes to asset load/change events.
    * @param asset - Asset of type `skybox` to be set to, or null to remove skybox.
    */
  def setSkybox(asset: Asset): Unit = js.native
  
  /**
    * Start the application. This function does the following:
    * 1. Fires an event on the application named 'start'
    * 2. Calls initialize for all components on entities in the hierarchy
    * 3. Fires an event on the application named 'initialize'
    * 4. Calls postInitialize for all components on entities in the hierarchy
    * 5. Fires an event on the application named 'postinitialize'
    * 6. Starts executing the main loop of the application
    * This function is called internally by PlayCanvas applications made in the Editor
    * but you will need to call start yourself if you are using the engine stand-alone.
    * @example
    * app.start();
    */
  def start(): Unit = js.native
  
  /**
    * The application's component system registry. The pc.Application
    * constructor adds the following component systems to its component system registry:
    *
    * * animation ({@link pc.AnimationComponentSystem})
    * * audiolistener ({@link pc.AudioListenerComponentSystem})
    * * button ({@link pc.ButtonComponentSystem})
    * * camera ({@link pc.CameraComponentSystem})
    * * collision ({@link pc.CollisionComponentSystem})
    * * element ({@link pc.ElementComponentSystem})
    * * layoutchild ({@link pc.LayoutChildComponentSystem})
    * * layoutgroup ({@link pc.LayoutGroupComponentSystem})
    * * light ({@link pc.LightComponentSystem})
    * * model ({@link pc.ModelComponentSystem})
    * * particlesystem ({@link pc.ParticleSystemComponentSystem})
    * * rigidbody ({@link pc.RigidBodyComponentSystem})
    * * screen ({@link pc.ScreenComponentSystem})
    * * script ({@link pc.ScriptComponentSystem})
    * * scrollbar ({@link pc.ScrollbarComponentSystem})
    * * scrollview ({@link pc.ScrollViewComponentSystem})
    * * sound ({@link pc.SoundComponentSystem})
    * * sprite ({@link pc.SpriteComponentSystem})
    * @example
    * // Set global gravity to zero
    * this.app.systems.rigidbody.gravity.set(0, 0, 0);
    * @example
    * // Set the global sound volume to 50%
    * this.app.systems.sound.volume = 0.5;
    */
  var systems: ComponentSystemRegistry = js.native
  
  /**
    * Scales the global time delta. Defaults to 1.
    * @example
    * // Set the app to run at half speed
    * this.app.timeScale = 0.5;
    */
  var timeScale: Double = js.native
  
  /**
    * Used to get touch events input.
    */
  var touch: TouchDevice = js.native
  
  /**
    * Update the application. This function will call the update
    * functions and then the postUpdate functions of all enabled components. It
    * will then update the current state of all connected input devices.
    * This function is called internally in the application's main loop and
    * does not need to be called explicitly.
    * @param dt - The time delta since the last frame.
    */
  def update(dt: Double): Unit = js.native
  
  /**
    * The XR Manager that provides ability to start VR/AR sessions.
    * @example
    * // check if VR is available
    * if (app.xr.isAvailable(pc.XRTYPE_VR)) {
    *     // VR is available
    * }
    */
  var xr: XrManager = js.native
}
