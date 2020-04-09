package typings.playcanvas.pc

import typings.playcanvas.AnonAssetPrefix
import typings.playcanvas.AnonLayer
import typings.playcanvas.AnonPhysics
import typings.playcanvas.pc.callbacks.ConfigureApp
import typings.playcanvas.pc.callbacks.LoadHierarchy
import typings.playcanvas.pc.callbacks.LoadScene
import typings.playcanvas.pc.callbacks.LoadSettings
import typings.playcanvas.pc.callbacks.PreloadApp
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  * @name pc.Application
  * @augments pc.EventHandler
  * @classdesc A pc.Application represents and manages your PlayCanvas application.
  * If you are developing using the PlayCanvas Editor, the pc.Application is created
  * for you. You can access your pc.Application instance in your scripts. Below is a
  * skeleton script which shows how you can access the application 'app' property inside
  * the initialize and update functions:
  *
  * ```javascript
  * // Editor example: accessing the pc.Application from a script
  * var MyScript = pc.createScript('myScript');
  *
  * MyScript.prototype.initialize = function() {
  *     // Every script instance has a property 'this.app' accessible in the initialize...
  *     var app = this.app;
  * };
  *
  * MyScript.prototype.update = function(dt) {
  *     // ...and update functions.
  *     var app = this.app;
  * };
  * ```
  *
  * If you are using the Engine without the Editor, you have to create the application
  * instance manually.
  * @description Create a new Application.
  * @param {Element} canvas - The canvas element.
  * @param {object} options
  * @param {pc.ElementInput} [options.elementInput] - Input handler for {@link pc.ElementComponent}s.
  * @param {pc.Keyboard} [options.keyboard] - Keyboard handler for input.
  * @param {pc.Mouse} [options.mouse] - Mouse handler for input.
  * @param {pc.TouchDevice} [options.touch] - TouchDevice handler for input.
  * @param {pc.GamePads} [options.gamepads] - Gamepad handler for input.
  * @param {string} [options.scriptPrefix] - Prefix to apply to script urls before loading.
  * @param {string} [options.assetPrefix] - Prefix to apply to asset urls before loading.
  * @param {object} [options.graphicsDeviceOptions] - Options object that is passed into the {@link pc.GraphicsDevice} constructor.
  * @param {string[]} [options.scriptsOrder] - Scripts in order of loading first.
  * @example
  * // Engine-only example: create the application manually
  * var app = new pc.Application(canvas, options);
  *
  * // Start the application's main loop
  * app.start();
  */
@JSGlobal("pc.Application")
@js.native
class Application protected () extends EventHandler {
  def this(canvas: Element, options: AnonAssetPrefix) = this()
  /**
    * @name pc.Application#assets
    * @type {pc.AssetRegistry}
    * @description The asset registry managed by the application.
    * @example
    * // Search the asset registry for all assets with the tag 'vehicle'
    * var vehicleAssets = this.app.assets.findByTag('vehicle');
    */
  var assets: AssetRegistry = js.native
  /**
    * @name pc.Application#autoRender
    * @type {boolean}
    * @description When true, the application's render function is called every frame.
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
    * @name pc.Application#batcher
    * @type {pc.BatchManager}
    * @description The application's batch manager. The batch manager is used to
    * merge mesh instances in the scene, which reduces the overall number of draw
    * calls, thereby boosting performance.
    */
  var batcher: BatchManager = js.native
  /**
    * @name pc.Application#elementInput
    * @type {pc.ElementInput}
    * @description Used to handle input for {@link pc.ElementComponent}s.
    */
  var elementInput: ElementInput = js.native
  /**
    * @readonly
    * @name pc.Application#fillMode
    * @type {string}
    * @description The current fill mode of the canvas. Can be:
    *
    * * {@link pc.FILLMODE_NONE}: the canvas will always match the size provided.
    * * {@link pc.FILLMODE_FILL_WINDOW}: the canvas will simply fill the window, changing aspect ratio.
    * * {@link pc.FILLMODE_KEEP_ASPECT}: the canvas will grow to fill the window as best it can while maintaining the aspect ratio.
    */
  val fillMode: String = js.native
  /**
    * @name pc.Application#gamepads
    * @type {pc.GamePads}
    * @description Used to access GamePad input.
    */
  var gamepads: GamePads = js.native
  /**
    * @name pc.Application#graphicsDevice
    * @type {pc.GraphicsDevice}
    * @description The graphics device used by the application.
    */
  var graphicsDevice: GraphicsDevice = js.native
  /**
    * @name pc.Application#i18n
    * @type {pc.I18n}
    * @description Handles localization.
    */
  var i18n: I18n = js.native
  /**
    * @name pc.Application#keyboard
    * @type {pc.Keyboard}
    * @description The keyboard device.
    */
  var keyboard: Keyboard = js.native
  /**
    * @name pc.Application#loader
    * @type {pc.ResourceLoader}
    * @description The resource loader.
    */
  var loader: ResourceLoader = js.native
  /**
    * @name pc.Application#maxDeltaTime
    * @type {number}
    * @description Clamps per-frame delta time to an upper bound. Useful since returning from a tab
    * deactivation can generate huge values for dt, which can adversely affect game state. Defaults
    * to 0.1 (seconds).
    * @example
    * // Don't clamp inter-frame times of 200ms or less
    * this.app.maxDeltaTime = 0.2;
    */
  var maxDeltaTime: Double = js.native
  /**
    * @name pc.Application#mouse
    * @type {pc.Mouse}
    * @description The mouse device.
    */
  var mouse: Mouse = js.native
  /**
    * @name pc.Application#renderNextFrame
    * @type {boolean}
    * @description Set to true to render the scene on the next iteration of the main loop.
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
    * @readonly
    * @name pc.Application#resolutionMode
    * @type {string}
    * @description The current resolution mode of the canvas, Can be:
    *
    * * {@link pc.RESOLUTION_AUTO}: if width and height are not provided, canvas will be resized to match canvas client size.
    * * {@link pc.RESOLUTION_FIXED}: resolution of canvas will be fixed.
    */
  val resolutionMode: String = js.native
  /**
    * @name pc.Application#root
    * @type {pc.Entity}
    * @description The root entity of the application.
    * @example
    * // Return the first entity called 'Camera' in a depth-first search of the scene hierarchy
    * var camera = this.app.root.findByName('Camera');
    */
  var root: Entity = js.native
  /**
    * @name pc.Application#scene
    * @type {pc.Scene}
    * @description The scene managed by the application.
    * @example
    * // Set the tone mapping property of the application's scene
    * this.app.scene.toneMapping = pc.TONEMAP_FILMIC;
    */
  var scene: Scene = js.native
  /**
    * @name pc.Application#scripts
    * @type {pc.ScriptRegistry}
    * @description The application's script registry.
    */
  var scripts: ScriptRegistry = js.native
  /**
    * @name pc.Application#systems
    * @type {pc.ComponentSystemRegistry}
    * @description The application's component system registry. The pc.Application
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
    * @name pc.Application#timeScale
    * @type {number}
    * @description Scales the global time delta. Defaults to 1.
    * @example
    * // Set the app to run at half speed
    * this.app.timeScale = 0.5;
    */
  var timeScale: Double = js.native
  /**
    * @name pc.Application#touch
    * @type {pc.TouchDevice}
    * @description Used to get touch events input.
    */
  var touch: TouchDevice = js.native
  /**
    * @name pc.Application#xr
    * @type {pc.XrManager}
    * @description The XR Manager that provides ability to start VR/AR sessions.
    * @example
    * // check if VR is available
    * if (app.xr.isAvailable(pc.XRTYPE_VR)) {
    *     // VR is available
    * }
    */
  var xr: XrManager = js.native
  /**
    * @function
    * @name pc.Application#applySceneSettings
    * @description Apply scene settings to the current scene. Useful when your scene settings are parsed or generated from a non-URL source.
    * @param {object} settings - The scene settings to be applied.
    * @param {object} settings.physics - The physics settings to be applied.
    * @param {number[]} settings.physics.gravity - The world space vector representing global gravity in the physics simulation. Must be a fixed size array with three number elements, corresponding to each axis [ X, Y, Z ].
    * @param {object} settings.render - The rendering settings to be applied.
    * @param {number[]} settings.render.global_ambient - The color of the scene's ambient light. Must be a fixed size array with three number elements, corresponding to each color channel [ R, G, B ].
    * @param {string} settings.render.fog - The type of fog used by the scene. Can be:
    *
    * * {@link pc.FOG_NONE}
    * * {@link pc.FOG_LINEAR}
    * * {@link pc.FOG_EXP}
    * * {@link pc.FOG_EXP2}
    * @param {number[]} settings.render.fog_color - The color of the fog (if enabled). Must be a fixed size array with three number elements, corresponding to each color channel [ R, G, B ].
    * @param {number} settings.render.fog_density - The density of the fog (if enabled). This property is only valid if the fog property is set to pc.FOG_EXP or pc.FOG_EXP2.
    * @param {number} settings.render.fog_start - The distance from the viewpoint where linear fog begins. This property is only valid if the fog property is set to pc.FOG_LINEAR.
    * @param {number} settings.render.fog_end - The distance from the viewpoint where linear fog reaches its maximum. This property is only valid if the fog property is set to pc.FOG_LINEAR.
    * @param {number} settings.render.gamma_correction - The gamma correction to apply when rendering the scene. Can be:
    *
    * * {@link pc.GAMMA_NONE}
    * * {@link pc.GAMMA_SRGB}
    * @param {number} settings.render.tonemapping - The tonemapping transform to apply when writing fragments to the
    * frame buffer. Can be:
    *
    * * {@link pc.TONEMAP_LINEAR}
    * * {@link pc.TONEMAP_FILMIC}
    * * {@link pc.TONEMAP_HEJL}
    * * {@link pc.TONEMAP_ACES}
    * @param {number} settings.render.exposure - The exposure value tweaks the overall brightness of the scene.
    * @param {number|null} [settings.render.skybox] - The asset ID of the cube map texture to be used as the scene's skybox. Defaults to null.
    * @param {number} settings.render.skyboxIntensity - Multiplier for skybox intensity.
    * @param {number} settings.render.skyboxMip - The mip level of the skybox to be displayed. Only valid for prefiltered cubemap skyboxes.
    * @param {number} settings.render.lightmapSizeMultiplier - The lightmap resolution multiplier.
    * @param {number} settings.render.lightmapMaxResolution - The maximum lightmap resolution.
    * @param {number} settings.render.lightmapMode - The lightmap baking mode. Can be:
    *
    * * {@link pc.BAKE_COLOR}: single color lightmap
    * * {@link pc.BAKE_COLORDIR}: single color lightmap + dominant light direction (used for bump/specular)
    *
    * Only lights with bakeDir=true will be used for generating the dominant light direction. Defaults to.
    * @example
    *
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
    *         fog_color: [0, 0, 0],
    *         lightmapMode: 1,
    *         fog: 'none',
    *         lightmapMaxResolution: 2048,
    *         skyboxMip: 2,
    *         lightmapSizeMultiplier: 16
    *     }
    * };
    * app.applySceneSettings(settings);
    */
  def applySceneSettings(settings: AnonPhysics): Unit = js.native
  /**
    * @function
    * @name pc.Application#configure
    * @description Load the application configuration file and apply application properties and fill the asset registry.
    * @param {string} url - The URL of the configuration file to load.
    * @param {pc.callbacks.ConfigureApp} callback - The Function called when the configuration file is loaded and parsed (or an error occurs).
    */
  def configure(url: String, callback: ConfigureApp): Unit = js.native
  /**
    * @function
    * @name pc.Application#destroy
    * @description Destroys application and removes all event listeners.
    * @example
    * this.app.destroy();
    */
  def destroy(): Unit = js.native
  /**
    * @function
    * @name pc.Application#getSceneUrl
    * @description Look up the URL of the scene hierarchy file via the name given to the scene in the editor. Use this to in {@link pc.Application#loadSceneHierarchy}.
    * @param {string} name - The name of the scene file given in the Editor.
    * @returns {string} The URL of the scene file.
    */
  def getSceneUrl(name: String): String = js.native
  /**
    * @function
    * @name pc.Application#isHidden
    * @description Queries the visibility of the window or tab in which the application is running.
    * @returns {boolean} True if the application is not visible and false otherwise.
    */
  def isHidden(): Boolean = js.native
  /**
    * @function
    * @name pc.Application#loadScene
    * @description Load a scene file.
    * @param {string} url - The URL of the scene file. Usually this will be "scene_id.json".
    * @param {pc.callbacks.LoadScene} callback - The function to call after loading, passed (err, entity) where err is null if no errors occurred.
    * @example
    *
    * app.loadScene("1000.json", function (err, entity) {
    *     if (!err) {
    *         var e = app.root.find("My New Entity");
    *     } else {
    *         // error
    *     }
    * });
    */
  def loadScene(url: String, callback: LoadScene): Unit = js.native
  /**
    * @function
    * @name pc.Application#loadSceneHierarchy
    * @description Load a scene file, create and initialize the Entity hierarchy
    * and add the hierarchy to the application root Entity.
    * @param {string} url - The URL of the scene file. Usually this will be "scene_id.json".
    * @param {pc.callbacks.LoadHierarchy} callback - The function to call after loading, passed (err, entity) where err is null if no errors occurred.
    * @example
    *
    * app.loadSceneHierarchy("1000.json", function (err, entity) {
    *     if (!err) {
    *         var e = app.root.find("My New Entity");
    *     } else {
    *         // error
    *     }
    * });
    */
  def loadSceneHierarchy(url: String, callback: LoadHierarchy): Unit = js.native
  /**
    * @function
    * @name pc.Application#loadSceneSettings
    * @description Load a scene file and automatically apply the scene settings to the current scene.
    * @param {string} url - The URL of the scene file. Usually this will be "scene_id.json".
    * @param {pc.callbacks.LoadSettings} callback - The function called after the settings are applied. Passed (err) where err is null if no error occurred.
    * @example
    * app.loadSceneSettings("1000.json", function (err) {
    *     if (!err) {
    *       // success
    *     } else {
    *       // error
    *     }
    * });
    */
  def loadSceneSettings(url: String, callback: LoadSettings): Unit = js.native
  /**
    * @function
    * @name pc.Application#preload
    * @description Load all assets in the asset registry that are marked as 'preload'.
    * @param {pc.callbacks.PreloadApp} callback - Function called when all assets are loaded.
    */
  def preload(callback: PreloadApp): Unit = js.native
  /**
    * @function
    * @name pc.Application#render
    * @description Render the application's scene. More specifically, the scene's
    * {@link pc.LayerComposition} is rendered by the application's {@link pc.ForwardRenderer}.
    * This function is called internally in the application's main loop and
    * does not need to be called explicitly.
    */
  def render(): Unit = js.native
  /**
    * @function
    * @name pc.Application#renderLine
    * @description Renders a line. Line start and end coordinates are specified in
    * world-space. If a single color is supplied, the line will be flat-shaded with
    * that color. If two colors are supplied, the line will be smooth shaded between
    * those colors. It is also possible to control which scene layer the line is
    * rendered into. By default, lines are rendered into the immediate layer
    * {@link pc.LAYERID_IMMEDIATE}.
    * @param {pc.Vec3} start - The start world-space coordinate of the line.
    * @param {pc.Vec3} end - The end world-space coordinate of the line.
    * @param {pc.Color} color - The start color of the line.
    * @param {pc.Color} [endColor] - The end color of the line.
    * @param {object} [options] - Options to set rendering properties.
    * @param {pc.Layer} [options.layer] - The layer to render the line into. Defaults
    * to {@link pc.LAYERID_IMMEDIATE}.
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
    */
  def renderLine(start: Vec3, end: Vec3, color: Color): Unit = js.native
  def renderLine(start: Vec3, end: Vec3, color: Color, endColor: Color): Unit = js.native
  def renderLine(start: Vec3, end: Vec3, color: Color, endColor: Color, options: AnonLayer): Unit = js.native
  /**
    * @function
    * @name pc.Application#renderLines
    * @description Draw an array of lines.
    * @param {pc.Vec3[]} position - An array of points to draw lines between.
    * @param {pc.Color[]} color - An array of colors to color the lines. This must be the same size as the position array.
    * @param {object} [options] - Options to set rendering properties.
    * @param {pc.Layer} [options.layer] - The layer to render the line into.
    * @example
    * var points = [new pc.Vec3(0, 0, 0), new pc.Vec3(1, 0, 0), new pc.Vec3(1, 1, 0), new pc.Vec3(1, 1, 1)];
    * var colors = [new pc.Color(1, 0, 0), new pc.Color(1, 1, 0), new pc.Color(0, 1, 1), new pc.Color(0, 0, 1)];
    * app.renderLines(points, colors);
    */
  def renderLines(position: js.Array[Vec3], color: js.Array[Color]): Unit = js.native
  def renderLines(position: js.Array[Vec3], color: js.Array[Color], options: AnonLayer): Unit = js.native
  /**
    * @function
    * @name pc.Application#resizeCanvas
    * @description Resize the application's canvas element in line with the current fill mode.
    * In {@link pc.FILLMODE_KEEP_ASPECT} mode, the canvas will grow to fill the window as best it can while maintaining the aspect ratio.
    * In {@link pc.FILLMODE_FILL_WINDOW} mode, the canvas will simply fill the window, changing aspect ratio.
    * In {@link pc.FILLMODE_NONE} mode, the canvas will always match the size provided.
    * @param {number} [width] - The width of the canvas. Only used if current fill mode is {@link pc.FILLMODE_NONE}.
    * @param {number} [height] - The height of the canvas. Only used if current fill mode is {@link pc.FILLMODE_NONE}.
    * @returns {object} A object containing the values calculated to use as width and height.
    */
  def resizeCanvas(): js.Any = js.native
  def resizeCanvas(width: Double): js.Any = js.native
  def resizeCanvas(width: Double, height: Double): js.Any = js.native
  /**
    * @function
    * @name pc.Application#setCanvasFillMode
    * @description Controls how the canvas fills the window and resizes when the window changes.
    * @param {string} mode - The mode to use when setting the size of the canvas. Can be:
    *
    * * {@link pc.FILLMODE_NONE}: the canvas will always match the size provided.
    * * {@link pc.FILLMODE_FILL_WINDOW}: the canvas will simply fill the window, changing aspect ratio.
    * * {@link pc.FILLMODE_KEEP_ASPECT}: the canvas will grow to fill the window as best it can while maintaining the aspect ratio.
    * @param {number} [width] - The width of the canvas (only used when mode is pc.FILLMODE_NONE).
    * @param {number} [height] - The height of the canvas (only used when mode is pc.FILLMODE_NONE).
    */
  def setCanvasFillMode(mode: String): Unit = js.native
  def setCanvasFillMode(mode: String, width: Double): Unit = js.native
  def setCanvasFillMode(mode: String, width: Double, height: Double): Unit = js.native
  /**
    * @function
    * @name pc.Application#setCanvasResolution
    * @description Change the resolution of the canvas, and set the way it behaves when the window is resized.
    * @param {string} mode - The mode to use when setting the resolution. Can be:
    *
    * * {@link pc.RESOLUTION_AUTO}: if width and height are not provided, canvas will be resized to match canvas client size.
    * * {@link pc.RESOLUTION_FIXED}: resolution of canvas will be fixed.
    * @param {number} [width] - The horizontal resolution, optional in AUTO mode, if not provided canvas clientWidth is used.
    * @param {number} [height] - The vertical resolution, optional in AUTO mode, if not provided canvas clientHeight is used.
    */
  def setCanvasResolution(mode: String): Unit = js.native
  def setCanvasResolution(mode: String, width: Double): Unit = js.native
  def setCanvasResolution(mode: String, width: Double, height: Double): Unit = js.native
  /**
    * @function
    * @name pc.Application#setSkybox
    * @description Sets the skybox asset to current scene, and subscribes to asset load/change events.
    * @param {pc.Asset} asset - Asset of type `skybox` to be set to, or null to remove skybox.
    */
  def setSkybox(asset: Asset): Unit = js.native
  /**
    * @function
    * @name pc.Application#start
    * @description Start the application. This function does the following:
    * 1. Fires an event on the application named 'start'
    * 2. Calls initialize for all components on entities in the hierachy
    * 3. Fires an event on the application named 'initialize'
    * 4. Calls postInitialize for all components on entities in the hierachy
    * 5. Fires an event on the application named 'postinitialize'
    * 6. Starts executing the main loop of the application
    * This function is called internally by PlayCanvas applications made in the Editor
    * but you will need to call start yourself if you are using the engine stand-alone.
    * @example
    * app.start();
    */
  def start(): Unit = js.native
  /**
    * @function
    * @name pc.Application#update
    * @description Update the application. This function will call the update
    * functions and then the postUpdate functions of all enabled components. It
    * will then update the current state of all connected input devices.
    * This function is called internally in the application's main loop and
    * does not need to be called explicitly.
    * @param {number} dt - The time delta since the last frame.
    */
  def update(dt: Double): Unit = js.native
}

/* static members */
@JSGlobal("pc.Application")
@js.native
object Application extends js.Object {
  /**
    * @static
    * @function
    * @name pc.Application.getApplication
    * @description Get the current application. In the case where there are multiple running
    * applications, the function can get an application based on a supplied canvas id. This
    * function is particularly useful when the current pc.Application is not readily available.
    * For example, in the JavaScript console of the browser's developer tools.
    * @param {string} [id] - If defined, the returned application should use the canvas which has this id. Otherwise current application will be returned.
    * @returns {pc.Application|undefined} The running application, if any.
    * @example
    * var app = pc.Application.getApplication();
    */
  def getApplication(): js.UndefOr[Application] = js.native
  def getApplication(id: String): js.UndefOr[Application] = js.native
}

