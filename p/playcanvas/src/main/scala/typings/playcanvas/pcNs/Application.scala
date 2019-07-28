package typings.playcanvas.pcNs

import typings.playcanvas.Anon_Height
import typings.std.Element
import typings.std.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @name pc.Application
  * @class Default application which performs general setup code and initiates the main game loop.
  * @description Create a new Application.
  * @param {Element} canvas The canvas element
  * @param {Object} options
  * @param {pc.Keyboard} [options.keyboard] Keyboard handler for input
  * @param {pc.Mouse} [options.mouse] Mouse handler for input
  * @param {pc.TouchDevice} [options.touch] TouchDevice handler for input
  * @param {pc.GamePads} [options.gamepads] Gamepad handler for input
  * @param {String} [options.scriptPrefix] Prefix to apply to script urls before loading
  * @param {String} [options.assetPrefix] Prefix to apply to asset urls before loading
  * @param {Object} [options.graphicsDeviceOptions] Options object that is passed into the {@link pc.GraphicsDevice} constructor
  *
  * @example
  * // Create application
  * var app = new pc.Application(canvas, options);
  * // Start game loop
  * app.start()
  */
@JSGlobal("pc.Application")
@js.native
class Application protected () extends js.Object {
  def this(canvas: HTMLCanvasElement) = this()
  def this(canvas: HTMLCanvasElement, options: ApplicationOptions) = this()
  /**
    * @name pc.Application#assets
    * @type {pc.AssetRegistry}
    * @description The assets available to the application.
    */
  var assets: AssetRegistry = js.native
  /**
    * @name pc.Application#autoRender
    * @type Boolean
    * @description When true (the default) the application's render function is called every frame.
    */
  var autoRender: Boolean = js.native
  /**
    * @name pc.Application#batcher
    * @type pc.BatchManager
    * @description The Batch Manager of the Application
    */
  var batcher: BatchManager = js.native
  /**
    * @name pc.Application#elementInput
    * @type {pc.ElementInput}
    * @description Used to handle input for {@link pc.ElementComponent}s.
    */
  var elementInput: ElementInput = js.native
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
    * @name pc.Application#mouse
    * @type {pc.Mouse}
    * @description The mouse device.
    */
  var mouse: Mouse = js.native
  /**
    * @name pc.Application#renderNextFrame
    * @type Boolean
    * @description If {@link pc.Application#autoRender} is false, set `app.renderNextFrame` true to force application to render the scene once next frame.
    * @example
    * // render the scene only while space key is pressed
    * if (this.app.keyboard.isPressed(pc.KEY_SPACE)) {
    *    this.app.renderNextFrame = true;
    * }
    */
  var renderNextFrame: Boolean = js.native
  /**
    * @name pc.Application#root
    * @type {pc.Entity}
    * @description The root {@link pc.Entity} of the application.
    */
  var root: Entity = js.native
  // PROPERTIES
  /**
    * @name pc.Application#scene
    * @type {pc.Scene}
    * @description The current {@link pc.Scene}
    */
  var scene: Scene = js.native
  /**
    * @name pc.Application#scripts
    * @type pc.ScriptRegistry
    * @description The Script Registry of the Application
    */
  var scripts: ScriptRegistry = js.native
  /**
    * @name pc.Application#systems
    * @type {pc.ComponentSystemRegistry}
    * @description The component systems.
    */
  var systems: ComponentSystemRegistry = js.native
  /**
    * @name pc.Application#timeScale
    * @type {Number}
    * @description Scales the global time delta.
    */
  var timeScale: Double = js.native
  /**
    * @name pc.Application#touch
    * @type {pc.TouchDevice}
    * @description Used to get touch events input.
    */
  var touch: TouchDevice = js.native
  /**
    * @function
    * @name pc.Application#configure
    * @description Load the application configuration file and apply application properties and fill the asset registry
    * @param {String} url The URL of the configuration file to load
    * @param {Function} callback The Function called when the configuration file is loaded and parsed
    */
  def configure(url: String, callback: js.Function1[/* repeated */ js.Any, js.Object]): Unit = js.native
  /**
    * @function
    * @name pc.Application#destroy
    * @description Destroys application and removes all event listeners.
    */
  def destroy(): Unit = js.native
  /**
    * @function
    * @name pc.Application#disableFullscreen
    * @description If application is currently displaying an element as fullscreen, then stop and return to normal.
    * @param {Function} [success] Function called when transition to normal mode is finished
    */
  def disableFullscreen(success: js.Function1[/* repeated */ js.Any, js.Object]): Unit = js.native
  /**
    * @function
    * @name pc.Application#enableFullscreen
    * @description Request that the browser enters fullscreen mode. This is not available on all browsers.
    * Note: Switching to fullscreen can only be initiated by a user action, e.g. in the event hander for a mouse or keyboard input
    * @param {Element} [element] The element to display in fullscreen, if element is not provided the application canvas is used
    * @param {Function} [success] Function called if the request for fullscreen was successful
    * @param {Function} [error] Function called if the request for fullscreen was unsuccessful
    * @example
    * var button = document.getElementById('my-button');
    * button.addEventListener('click', function () {
    *     app.enableFullscreen(canvas, function () {
    *         console.log('Now fullscreen');
    *     }, function () {
    *         console.log('Something went wrong!');
    *     });
    * }, false);
    */
  def enableFullscreen(): Unit = js.native
  def enableFullscreen(element: Element): Unit = js.native
  def enableFullscreen(element: Element, success: js.Function1[/* repeated */ js.Any, js.Object]): Unit = js.native
  def enableFullscreen(
    element: Element,
    success: js.Function1[/* repeated */ js.Any, js.Object],
    error: js.Function0[js.Object]
  ): Unit = js.native
  /**
    * @function
    * @name pc.Application#fire
    * @description Fire an event, all additional arguments are passed on to the event listener
    * @param {Object} name Name of event to fire
    * @param {*} [...] Arguments that are passed to the event handler
    * @example
    * obj.fire('test', 'This is the message');
    */
  def fire(
    name: String,
    arg1: js.UndefOr[js.Any],
    arg2: js.UndefOr[js.Any],
    arg3: js.UndefOr[js.Any],
    arg4: js.UndefOr[js.Any],
    arg5: js.UndefOr[js.Any],
    arg6: js.UndefOr[js.Any],
    arg7: js.UndefOr[js.Any],
    arg8: js.UndefOr[js.Any]
  ): js.Any = js.native
  /**
    * @function
    * @name pc.Application#hasEvent
    * @description Test if there are any handlers bound to an event name
    * @param {String} name The name of the event to test
    * @example
    * obj.on('test', function () { }); // bind an event to 'test'
    * obj.hasEvent('test'); // returns true
    */
  def hasEvent(name: String): Boolean = js.native
  /**
    * @function
    * @name pc.Application#isFullscreen
    * @description Returns true if the application is currently running fullscreen
    * @returns {Boolean} True if the application is running fullscreen
    */
  def isFullscreen(): Boolean = js.native
  /**
    * @function
    * @name pc.Application#isHidden
    * @description Queries the visibility of the window or tab in which the application is running.
    * @returns {Boolean} True if the application is not visible and false otherwise.
    */
  def isHidden(): Boolean = js.native
  /**
    * @function
    * @name pc.Application#loadScene
    * @description Load a scene file.
    * @param {String} url The URL of the scene file. Usually this will be "scene_id.json"
    * @param {Function} callback The function to call after loading, passed (err, entity) where err is null if no errors occurred.
    * @example
    *
    * app.loadScene("1000.json", function (err, entity) {
    *     if (!err) {
    *       var e = app.root.find("My New Entity");
    *     } else {
    *       // error
    *     }
    *   }
    * });
    */
  def loadScene(url: String, callback: js.Function1[/* repeated */ js.Any, js.Object]): Unit = js.native
  /**
    * @function
    * @name pc.Application#loadSceneHierarchy
    * @description Load a scene file, create and initialize the Entity hierarchy
    * and add the hierarchy to the application root Entity.
    * @param {String} url The URL of the scene file. Usually this will be "scene_id.json"
    * @param {Function} callback The function to call after loading, passed (err, entity) where err is null if no errors occurred.
    * @example
    *
    * app.loadSceneHierarchy("1000.json", function (err, entity) {
    *     if (!err) {
    *       var e = app.root.find("My New Entity");
    *     } else {
    *       // error
    *     }
    *   }
    * });
    */
  def loadSceneHierarchy(url: String, callback: js.Function1[/* repeated */ js.Any, js.Object]): Unit = js.native
  /**
    * @function
    * @name pc.Application#loadSceneSettings
    * @description Load a scene file and apply the scene settings to the current scene
    * @param {String} url The URL of the scene file. Usually this will be "scene_id.json"
    * @param {Function} callback The function called after the settings are applied. Passed (err) where err is null if no error occurred.
    * @example
    * app.loadSceneSettings("1000.json", function (err) {
    *     if (!err) {
    *       // success
    *     } else {
    *       // error
    *     }
    *   }
    * });
    */
  def loadSceneSettings(url: String, callback: js.Function1[/* repeated */ js.Any, js.Object]): Unit = js.native
  /**
    * @function
    * @name pc.Application#off
    * @description Detach an event handler from an event. If callback is not provided then all callbacks are unbound from the event,
    * if scope is not provided then all events with the callback will be unbound.
    * @param {String} [name] Name of the event to unbind
    * @param {Function} [callback] Function to be unbound
    * @param {Object} [scope] Scope that was used as the this when the event is fired
    * @example
    * var handler = function () {
    * };
    * obj.on('test', handler);
    *
    * obj.off(); // Removes all events
    * obj.off('test'); // Removes all events called 'test'
    * obj.off('test', handler); // Removes all handler functions, called 'test'
    * obj.off('test', handler, this); // Removes all hander functions, called 'test' with scope this
    */
  def off(): js.Any = js.native
  def off(name: String): js.Any = js.native
  def off(name: String, callback: js.Function1[/* repeated */ js.Any, Unit]): js.Any = js.native
  def off(name: String, callback: js.Function1[/* repeated */ js.Any, Unit], scope: js.Any): js.Any = js.native
  // Events
  /**
    * @function
    * @name pc.Application#on
    * @description Attach an event handler to an event
    * @param {String} name Name of the event to bind the callback to
    * @param {Function} callback Function that is called when event is fired. Note the callback is limited to 8 arguments.
    * @param {Object} [scope] Object to use as 'this' when the event is fired, defaults to current this
    * @example
    * obj.on('test', function (a, b) {
    *     console.log(a + b);
    * });
    * obj.fire('test', 1, 2); // prints 3 to the console
    */
  def on(name: String, callback: js.Function1[/* repeated */ js.Any, Unit]): js.Any = js.native
  def on(name: String, callback: js.Function1[/* repeated */ js.Any, Unit], scope: js.Any): js.Any = js.native
  /**
    * @private
    * @name pc.Application#onLibrariesLoaded
    * @description Event handler called when all code libraries have been loaded
    * Code libraries are passed into the constructor of the Application and the application won't start running or load packs until all libraries have
    * been loaded
    */
  /* private */ def onLibrariesLoaded(): Unit = js.native
  /**
    * @private
    * @function
    * @name pc.Application#onVisibilityChange
    * @description Called when the visibility state of the current tab/window changes
    */
  /* private */ def onVisibilityChange(e: js.Any): Unit = js.native
  /**
    * @function
    * @name pc.Application#once
    * @description Attach an event handler to an event. This handler will be removed after being fired once.
    * @param {String} name Name of the event to bind the callback to
    * @param {Function} callback Function that is called when event is fired. Note the callback is limited to 8 arguments.
    * @param {Object} [scope] Object to use as 'this' when the event is fired, defaults to current this
    * @example
    * obj.once('test', function (a, b) {
    *     console.log(a + b);
    * });
    * obj.fire('test', 1, 2); // prints 3 to the console
    * obj.fire('test', 1, 2); // not going to get handled
    */
  def once(name: String, callback: js.Function1[/* repeated */ js.Any, Unit]): js.Any = js.native
  def once(name: String, callback: js.Function1[/* repeated */ js.Any, Unit], scope: js.Any): js.Any = js.native
  /**
    * @function
    * @name pc.Application#preload
    * @description Load all assets in the asset registry that are marked as 'preload'
    * @param {Function} callback Function called when all assets are loaded
    */
  def preload(callback: js.Function1[/* repeated */ js.Any, js.Object]): Unit = js.native
  /**
    * @function
    * @name pc.Application#render
    * @description Application specific render method. Override this if you have a custom Application
    */
  def render(): Unit = js.native
  /**
    * @function
    * @name pc.Application#renderLine
    * @description Draw a line in one color
    * @param {pc.Vec3} start The start of the line
    * @param {pc.Vec3} end The end of the line
    * @param {pc.Color} color The color of the line
    * @example
    * var start = new pc.Vec3(0,0,0);
    * var end = new pc.Vec3(1,0,0);
    * var color = new pc.Color(1,1,1);
    * app.renderLine(start, end, color);
    */
  def renderLine(start: Vec3, end: Vec3, color: Color): Unit = js.native
  /**
    * @function
    * @name pc.Application#renderLine^3
    * @description Draw a line of one color with specified line type
    * @param {pc.Vec3} start The start of the line
    * @param {pc.Vec3} end The end of the line
    * @param {pc.Color} color The color of the line
    * @param {Number} lineType The type of rendering to use: pc.LINEBATCH_WORLD, pc.LINEBATCH_OVERLAY, pc.LINEBATCH_GIZMO. Default is pc.LINEBATCH_WORLD
    * @example
    * var start = new pc.Vec3(0,0,0);
    * var end = new pc.Vec3(1,0,0);
    * var color = new pc.Color(1,1,1);
    * app.renderLine(start, end, color, pc.LINEBATCH_OVERLAY);
    */
  def renderLine(start: Vec3, end: Vec3, color: Color, lineType: Double): Unit = js.native
  /**
    * @function
    * @name pc.Application#renderLine^5
    * @description Draw a line which blends between two colors with specified line type
    * @param {pc.Vec3} start The start of the line
    * @param {pc.Vec3} end The end of the line
    * @param {pc.Color} color The start color of the line
    * @param {Object} options
    * @param {Number} [options.layer] lineType The type of rendering to use: pc.LINEBATCH_WORLD, pc.LINEBATCH_OVERLAY, pc.LINEBATCH_GIZMO. Default is pc.LAYERID_IMMEDIATE
    * @example
    * var start = new pc.Vec3(0,0,0);
    * var end = new pc.Vec3(1,0,0);
    * var startColor = new pc.Color(1,1,1);
    * const options = {
    *    layer: pc.LINEBATCH_OVERLAY,
    * };
    *
    * app.renderLine(start, end, color, options);
    */
  def renderLine(start: Vec3, end: Vec3, color: Color, options: js.Object): Unit = js.native
  /**
    * @function
    * @name pc.Application#renderLine^2
    * @description Draw a line which blends between two colors
    * @param {pc.Vec3} start The start of the line
    * @param {pc.Vec3} end The end of the line
    * @param {pc.Color} startColor The start color of the line
    * @param {pc.Color} endColor The end color of the line
    * @example
    * var start = new pc.Vec3(0,0,0);
    * var end = new pc.Vec3(1,0,0);
    * var startColor = new pc.Color(1,1,1);
    * var endColor = new pc.Color(1,0,0);
    * app.renderLine(start, end, startColor, endColor);
    */
  def renderLine(start: Vec3, end: Vec3, startColor: Color, endColor: Color): Unit = js.native
  /**
    * @function
    * @name pc.Application#renderLine^4
    * @description Draw a line which blends between two colors with specified line type
    * @param {pc.Vec3} start The start of the line
    * @param {pc.Vec3} end The end of the line
    * @param {pc.Color} startColor The start color of the line
    * @param {pc.Color} endColor The end color of the line
    * @param {Number} lineType The type of rendering to use: pc.LINEBATCH_WORLD, pc.LINEBATCH_OVERLAY, pc.LINEBATCH_GIZMO. Default is pc.LINEBATCH_WORLD
    * @example
    * var start = new pc.Vec3(0,0,0);
    * var end = new pc.Vec3(1,0,0);
    * var startColor = new pc.Color(1,1,1);
    * var endColor = new pc.Color(1,0,0);
    * app.renderLine(start, end, startColor, endColor, pc.LINEBATCH_OVERLAY);
    */
  def renderLine(start: Vec3, end: Vec3, startColor: Color, endColor: Color, lineType: Double): Unit = js.native
  /**
    * @function
    * @name pc.Application#renderLines
    * @description Draw an array of lines.
    * @param {pc.Vec3[]} position An array of points to draw lines between
    * @param {pc.Color[]} color An array of colors to color the lines. This must be the same size as the position array
    * @param {Number} [lineType] The type of rendering to use: pc.LINEBATCH_WORLD, pc.LINEBATCH_OVERLAY, pc.LINEBATCH_GIZMO. Default is pc.LINEBATCH_WORLD
    * @example
    * var points = [new pc.Vec3(0,0,0), new pc.Vec3(1,0,0), new pc.Vec3(1,1,0), new pc.Vec3(1,1,1)];
    * var colors = [new pc.Color(1,0,0), new pc.Color(1,1,0), new pc.Color(0,1,1), new pc.Color(0,0,1)];
    * app.renderLines(points, colors);
    */
  def renderLines(position: js.Array[Vec3], color: js.Array[Color]): Unit = js.native
  def renderLines(position: js.Array[Vec3], color: js.Array[Color], lineType: Double): Unit = js.native
  /**
    * @function
    * @name pc.Application#resizeCanvas
    * @description Resize the canvas in line with the current FillMode
    * In KEEP_ASPECT mode, the canvas will grow to fill the window as best it can while maintaining the aspect ratio
    * In FILL_WINDOW mode, the canvas will simply fill the window, changing aspect ratio
    * In NONE mode, the canvas will always match the size provided
    * @param {Number} [width] The width of the canvas, only used in NONE mode
    * @param {Number} [height] The height of the canvas, only used in NONE mode
    * @returns {Object} A object containing the values calculated to use as width and height
    */
  def resizeCanvas(): Anon_Height = js.native
  def resizeCanvas(width: Double): Anon_Height = js.native
  def resizeCanvas(width: Double, height: Double): Anon_Height = js.native
  /**
    * @function
    * @name pc.Application#setCanvasFillMode
    * @description Controls how the canvas fills the window and resizes when the window changes.
    * @param {String} mode The mode to use when setting the size of the canvas. Can be:
    * <ul>
    *     <li>pc.FILLMODE_NONE: the canvas will always match the size provided.</li>
    *     <li>pc.FILLMODE_FILL_WINDOW: the canvas will simply fill the window, changing aspect ratio.</li>
    *     <li>pc.FILLMODE_KEEP_ASPECT: the canvas will grow to fill the window as best it can while maintaining the aspect ratio.</li>
    * </ul>
    * @param {Number} [width] The width of the canvas (only used when mode is pc.FILLMODE_NONE).
    * @param {Number} [height] The height of the canvas (only used when mode is pc.FILLMODE_NONE).
    */
  def setCanvasFillMode(mode: String): Unit = js.native
  def setCanvasFillMode(mode: String, width: Double): Unit = js.native
  def setCanvasFillMode(mode: String, width: Double, height: Double): Unit = js.native
  /**
    * @function
    * @name pc.Application#setCanvasResolution
    * @description Change the resolution of the canvas, and set the way it behaves when the window is resized
    * @param {string} mode The mode to use when setting the resolution. Can be:
    * <ul>
    *     <li>pc.RESOLUTION_AUTO: if width and height are not provided, canvas will be resized to match canvas client size.</li>
    *     <li>pc.RESOLUTION_FIXED: resolution of canvas will be fixed.</li>
    * </ul>
    * @param {Number} [width] The horizontal resolution, optional in AUTO mode, if not provided canvas clientWidth is used
    * @param {Number} [height] The vertical resolution, optional in AUTO mode, if not provided canvas clientHeight is used
    */
  def setCanvasResolution(mode: String): Unit = js.native
  def setCanvasResolution(mode: String, width: Double): Unit = js.native
  def setCanvasResolution(mode: String, width: Double, height: Double): Unit = js.native
  /**
    * @function
    * @name pc.Application#setSkybox
    * @description Sets the skybox asset to current scene, and subscribes to asset load/change events
    * @param {pc.Asset} asset Asset of type `skybox` to be set to, or null to remove skybox
    */
  def setSkybox(asset: Asset): Unit = js.native
  /**
    * @function
    * @name pc.Application#start
    * @description Start the Application updating
    */
  def start(): Unit = js.native
  /**
    * @function
    * @name pc.Application#update
    * @description Application specific update method. Override this if you have a custom Application
    * @param {Number} dt The time delta since the last frame.
    */
  def update(dt: Double): Unit = js.native
}

/* static members */
@JSGlobal("pc.Application")
@js.native
object Application extends js.Object {
  def getApplication(): Application = js.native
  def getApplication(id: String): Application = js.native
}

