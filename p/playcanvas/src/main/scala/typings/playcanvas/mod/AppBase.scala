package typings.playcanvas.mod

import org.scalablytyped.runtime.StringDictionary
import typings.playcanvas.anon.Physics
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An Application represents and manages your PlayCanvas application. If you are developing using
  * the PlayCanvas Editor, the Application is created for you. You can access your Application
  * instance in your scripts. Below is a skeleton script which shows how you can access the
  * application 'app' property inside the initialize and update functions:
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
  * If you are using the Engine without the Editor, you have to create the application instance
  * manually.
  *
  * @augments EventHandler
  */
@js.native
trait AppBase extends EventHandler {
  
  var _allowResize: Boolean = js.native
  
  /**
    * The application's batch manager.
    *
    * @type {BatchManager}
    */
  var _batcher: BatchManager = js.native
  
  /** @private */
  /* private */ var _destroyRequested: Any = js.native
  
  /**
    * Stores all entities that have been created for this app by guid.
    *
    * @type {Object<string, Entity>}
    * @ignore
    */
  var _entityIndex: StringDictionary[Entity] = js.native
  
  /** @private */
  /* private */ var _fillFrameStats: Any = js.native
  
  /**
    * @param {number} now - The timestamp passed to the requestAnimationFrame callback.
    * @param {number} dt - The time delta in seconds since the last frame. This is subject to the
    * application's time scale and max delta values.
    * @param {number} ms - The time in milliseconds since the last frame.
    * @private
    */
  /* private */ var _fillFrameStatsBasic: Any = js.native
  
  var _fillMode: String = js.native
  
  /** @private */
  /* private */ var _firstBake: Any = js.native
  
  /** @private */
  /* private */ var _firstBatch: Any = js.native
  
  /**
    * @param {Scene} scene - The scene.
    * @returns {Array} - The list of scripts that are referenced by the scene.
    * @private
    */
  /* private */ var _getScriptReferences: Any = js.native
  
  var _height: Any = js.native
  
  var _hiddenAttr: String = js.native
  
  /** @private */
  /* private */ var _inFrameUpdate: Any = js.native
  
  /**
    * @type {boolean}
    * @ignore
    */
  var _inTools: Boolean = js.native
  
  /** @private */
  /* private */ var _initDefaultMaterial: Any = js.native
  
  /** @private */
  /* private */ var _initProgramLibrary: Any = js.native
  
  var _librariesLoaded: Boolean = js.native
  
  /**
    * @param {string[]} urls - List of URLs to load.
    * @param {Function} callback - Callback function.
    * @private
    */
  /* private */ var _loadLibraries: Any = js.native
  
  def _parseApplicationProperties(props: Any, callback: Any): Unit = js.native
  
  /**
    * Insert assets into registry.
    *
    * @param {*} assets - Assets to insert.
    * @private
    */
  /* private */ var _parseAssets: Any = js.native
  
  /**
    * Insert scene name/urls into the registry.
    *
    * @param {*} scenes - Scenes to add to the scene registry.
    * @private
    */
  /* private */ var _parseScenes: Any = js.native
  
  def _preloadScripts(sceneData: Any, callback: Any): Unit = js.native
  
  /**
    * Provide an opportunity to modify the timestamp supplied by requestAnimationFrame.
    *
    * @param {number} [timestamp] - The timestamp supplied by requestAnimationFrame.
    * @returns {number|undefined} The modified timestamp.
    * @ignore
    */
  def _processTimestamp(): js.UndefOr[Double] = js.native
  def _processTimestamp(timestamp: Double): js.UndefOr[Double] = js.native
  
  /**
    * @param {Scene} scene - The scene.
    * @private
    */
  /* private */ var _registerSceneImmediate: Any = js.native
  
  var _resolutionMode: String = js.native
  
  /**
    * @type {string}
    * @ignore
    */
  var _scriptPrefix: String = js.native
  
  /**
    * @type {Asset|null}
    * @private
    */
  /* private */ var _skyboxAsset: Any = js.native
  
  /**
    * @type {SoundManager}
    * @private
    */
  /* private */ var _soundManager: Any = js.native
  
  /** @private */
  /* private */ var _time: Any = js.native
  
  /** @private */
  /* private */ var _visibilityChangeHandler: Any = js.native
  
  var _width: Any = js.native
  
  /**
    * Apply scene settings to the current scene. Useful when your scene settings are parsed or
    * generated from a non-URL source.
    *
    * @param {object} settings - The scene settings to be applied.
    * @param {object} settings.physics - The physics settings to be applied.
    * @param {number[]} settings.physics.gravity - The world space vector representing global
    * gravity in the physics simulation. Must be a fixed size array with three number elements,
    * corresponding to each axis [ X, Y, Z ].
    * @param {object} settings.render - The rendering settings to be applied.
    * @param {number[]} settings.render.global_ambient - The color of the scene's ambient light.
    * Must be a fixed size array with three number elements, corresponding to each color channel
    * [ R, G, B ].
    * @param {string} settings.render.fog - The type of fog used by the scene. Can be:
    *
    * - {@link FOG_NONE}
    * - {@link FOG_LINEAR}
    * - {@link FOG_EXP}
    * - {@link FOG_EXP2}
    *
    * @param {number[]} settings.render.fog_color - The color of the fog (if enabled). Must be a
    * fixed size array with three number elements, corresponding to each color channel [ R, G, B ].
    * @param {number} settings.render.fog_density - The density of the fog (if enabled). This
    * property is only valid if the fog property is set to {@link FOG_EXP} or {@link FOG_EXP2}.
    * @param {number} settings.render.fog_start - The distance from the viewpoint where linear fog
    * begins. This property is only valid if the fog property is set to {@link FOG_LINEAR}.
    * @param {number} settings.render.fog_end - The distance from the viewpoint where linear fog
    * reaches its maximum. This property is only valid if the fog property is set to {@link FOG_LINEAR}.
    * @param {number} settings.render.gamma_correction - The gamma correction to apply when
    * rendering the scene. Can be:
    *
    * - {@link GAMMA_NONE}
    * - {@link GAMMA_SRGB}
    *
    * @param {number} settings.render.tonemapping - The tonemapping transform to apply when
    * writing fragments to the frame buffer. Can be:
    *
    * - {@link TONEMAP_LINEAR}
    * - {@link TONEMAP_FILMIC}
    * - {@link TONEMAP_HEJL}
    * - {@link TONEMAP_ACES}
    *
    * @param {number} settings.render.exposure - The exposure value tweaks the overall brightness
    * of the scene.
    * @param {number|null} [settings.render.skybox] - The asset ID of the cube map texture to be
    * used as the scene's skybox. Defaults to null.
    * @param {number} settings.render.skyboxIntensity - Multiplier for skybox intensity.
    * @param {number} settings.render.skyboxLuminance - Lux (lm/m^2) value for skybox intensity when physical light units are enabled.
    * @param {number} settings.render.skyboxMip - The mip level of the skybox to be displayed.
    * Only valid for prefiltered cubemap skyboxes.
    * @param {number[]} settings.render.skyboxRotation - Rotation of skybox.
    * @param {number} settings.render.lightmapSizeMultiplier - The lightmap resolution multiplier.
    * @param {number} settings.render.lightmapMaxResolution - The maximum lightmap resolution.
    * @param {number} settings.render.lightmapMode - The lightmap baking mode. Can be:
    *
    * - {@link BAKE_COLOR}: single color lightmap
    * - {@link BAKE_COLORDIR}: single color lightmap + dominant light direction (used for bump/specular)
    *
    * @param {boolean} settings.render.ambientBake - Enable baking ambient light into lightmaps.
    * @param {number} settings.render.ambientBakeNumSamples - Number of samples to use when baking ambient light.
    * @param {number} settings.render.ambientBakeSpherePart - How much of the sphere to include when baking ambient light.
    * @param {number} settings.render.ambientBakeOcclusionBrightness - Brighness of the baked ambient occlusion.
    * @param {number} settings.render.ambientBakeOcclusionContrast - Contrast of the baked ambient occlusion.
    * @param {number} settings.render.ambientLuminance - Lux (lm/m^2) value for ambient light intensity.
    *
    * @param {boolean} settings.render.clusteredLightingEnabled - Enable clustered lighting.
    * @param {boolean} settings.render.lightingShadowsEnabled - If set to true, the clustered lighting will support shadows.
    * @param {boolean} settings.render.lightingCookiesEnabled - If set to true, the clustered lighting will support cookie textures.
    * @param {boolean} settings.render.lightingAreaLightsEnabled - If set to true, the clustered lighting will support area lights.
    * @param {number} settings.render.lightingShadowAtlasResolution - Resolution of the atlas texture storing all non-directional shadow textures.
    * @param {number} settings.render.lightingCookieAtlasResolution - Resolution of the atlas texture storing all non-directional cookie textures.
    * @param {number} settings.render.lightingMaxLightsPerCell - Maximum number of lights a cell can store.
    * @param {number} settings.render.lightingShadowType - The type of shadow filtering used by all shadows. Can be:
    *
    * - {@link SHADOW_PCF1}: PCF 1x1 sampling.
    * - {@link SHADOW_PCF3}: PCF 3x3 sampling.
    * - {@link SHADOW_PCF5}: PCF 5x5 sampling. Falls back to {@link SHADOW_PCF3} on WebGL 1.0.
    *
    * @param {Vec3} settings.render.lightingCells - Number of cells along each world-space axis the space containing lights
    * is subdivided into.
    *
    * Only lights with bakeDir=true will be used for generating the dominant light direction.
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
    *         skyboxRotation: [0, 0, 0],
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
  def applySceneSettings(settings: Physics): Unit = js.native
  
  /**
    * The asset registry managed by the application.
    *
    * @type {AssetRegistry}
    * @example
    * // Search the asset registry for all assets with the tag 'vehicle'
    * var vehicleAssets = this.app.assets.findByTag('vehicle');
    */
  var assets: AssetRegistry = js.native
  
  /**
    * When true, the application's render function is called every frame. Setting autoRender
    * to false is useful to applications where the rendered image may often be unchanged over
    * time. This can heavily reduce the application's load on the CPU and GPU. Defaults to
    * true.
    *
    * @type {boolean}
    * @example
    * // Disable rendering every frame and only render on a keydown event
    * this.app.autoRender = false;
    * this.app.keyboard.on('keydown', function (event) {
    *     this.app.renderNextFrame = true;
    * }, this);
    */
  var autoRender: Boolean = js.native
  
  /**
    * The application's batch manager. The batch manager is used to merge mesh instances in
    * the scene, which reduces the overall number of draw calls, thereby boosting performance.
    *
    * @type {BatchManager}
    */
  def batcher: BatchManager = js.native
  
  /**
    * @type {BundleRegistry}
    * @ignore
    */
  var bundles: BundleRegistry = js.native
  
  /**
    * Load the application configuration file and apply application properties and fill the asset
    * registry.
    *
    * @param {string} url - The URL of the configuration file to load.
    * @param {ConfigureAppCallback} callback - The Function called when the configuration file is
    * loaded and parsed (or an error occurs).
    */
  def configure(url: String, callback: ConfigureAppCallback): Unit = js.native
  
  /**
    * For backwards compatibility with scripts 1.0.
    *
    * @type {AppBase}
    * @deprecated
    * @ignore
    */
  var context: AppBase = js.native
  
  var controller: Any = js.native
  
  var defaultLayerDepth: Layer = js.native
  
  var defaultLayerImmediate: Layer = js.native
  
  var defaultLayerSkybox: Layer = js.native
  
  var defaultLayerUi: Layer = js.native
  
  var defaultLayerWorld: Layer = js.native
  
  /**
    * Destroys application and removes all event listeners at the end of the current engine frame
    * update. However, if called outside of the engine frame update, calling destroy() will
    * destroy the application immediately.
    *
    * @example
    * app.destroy();
    */
  def destroy(): Unit = js.native
  
  /**
    * Draws a depth texture at [x, y] position on screen, with size [width, height]. The origin of
    * the screen is top-left [0, 0]. Coordinates and sizes are in projected space (-1 .. 1).
    *
    * @param {number} x - The x coordinate on the screen of the top left corner of the texture.
    * Should be in the range [-1, 1].
    * @param {number} y - The y coordinate on the screen of the top left corner of the texture.
    * Should be in the range [-1, 1].
    * @param {number} width - The width of the rectangle of the rendered texture. Should be in the
    * range [0, 2].
    * @param {number} height - The height of the rectangle of the rendered texture. Should be in
    * the range [0, 2].
    * @param {Layer} [layer] - The layer to render the texture into. Defaults to {@link LAYERID_IMMEDIATE}.
    * @ignore
    */
  def drawDepthTexture(x: Double, y: Double, width: Double, height: Double): Unit = js.native
  def drawDepthTexture(x: Double, y: Double, width: Double, height: Double, layer: Layer): Unit = js.native
  
  /**
    * Draws a single line. Line start and end coordinates are specified in world-space. The line
    * will be flat-shaded with the specified color.
    *
    * @param {Vec3} start - The start world-space coordinate of the line.
    * @param {Vec3} end - The end world-space coordinate of the line.
    * @param {Color} [color] - The color of the line. It defaults to white if not specified.
    * @param {boolean} [depthTest] - Specifies if the line is depth tested against the depth
    * buffer. Defaults to true.
    * @param {Layer} [layer] - The layer to render the line into. Defaults to {@link LAYERID_IMMEDIATE}.
    * @example
    * // Render a 1-unit long white line
    * var start = new pc.Vec3(0, 0, 0);
    * var end = new pc.Vec3(1, 0, 0);
    * app.drawLine(start, end);
    * @example
    * // Render a 1-unit long red line which is not depth tested and renders on top of other geometry
    * var start = new pc.Vec3(0, 0, 0);
    * var end = new pc.Vec3(1, 0, 0);
    * app.drawLine(start, end, pc.Color.RED, false);
    * @example
    * // Render a 1-unit long white line into the world layer
    * var start = new pc.Vec3(0, 0, 0);
    * var end = new pc.Vec3(1, 0, 0);
    * var worldLayer = app.scene.layers.getLayerById(pc.LAYERID_WORLD);
    * app.drawLine(start, end, pc.Color.WHITE, true, worldLayer);
    */
  def drawLine(start: Vec3, end: Vec3): Unit = js.native
  def drawLine(start: Vec3, end: Vec3, color: Unit, depthTest: Boolean): Unit = js.native
  def drawLine(start: Vec3, end: Vec3, color: Unit, depthTest: Boolean, layer: Layer): Unit = js.native
  def drawLine(start: Vec3, end: Vec3, color: Unit, depthTest: Unit, layer: Layer): Unit = js.native
  def drawLine(start: Vec3, end: Vec3, color: Color): Unit = js.native
  def drawLine(start: Vec3, end: Vec3, color: Color, depthTest: Boolean): Unit = js.native
  def drawLine(start: Vec3, end: Vec3, color: Color, depthTest: Boolean, layer: Layer): Unit = js.native
  def drawLine(start: Vec3, end: Vec3, color: Color, depthTest: Unit, layer: Layer): Unit = js.native
  
  /**
    * Renders an arbitrary number of discrete line segments. The lines are not connected by each
    * subsequent point in the array. Instead, they are individual segments specified by two
    * points.
    *
    * @param {number[]} positions - An array of points to draw lines between. Each point is
    * represented by 3 numbers - x, y and z coordinate.
    * @param {number[]} colors - An array of colors to color the lines. This must be the same
    * length as the position array. The length of the array must also be a multiple of 2.
    * @param {boolean} [depthTest] - Specifies if the lines are depth tested against the depth
    * buffer. Defaults to true.
    * @param {Layer} [layer] - The layer to render the lines into. Defaults to {@link LAYERID_IMMEDIATE}.
    * @example
    * // Render 2 discrete line segments
    * var points = [
    *     // Line 1
    *     0, 0, 0,
    *     1, 0, 0,
    *     // Line 2
    *     1, 1, 0,
    *     1, 1, 1
    * ];
    * var colors = [
    *     // Line 1
    *     1, 0, 0, 1,  // red
    *     0, 1, 0, 1,  // green
    *     // Line 2
    *     0, 0, 1, 1,  // blue
    *     1, 1, 1, 1   // white
    * ];
    * app.drawLineArrays(points, colors);
    */
  def drawLineArrays(positions: js.Array[Double], colors: js.Array[Double]): Unit = js.native
  def drawLineArrays(positions: js.Array[Double], colors: js.Array[Double], depthTest: Boolean): Unit = js.native
  def drawLineArrays(positions: js.Array[Double], colors: js.Array[Double], depthTest: Boolean, layer: Layer): Unit = js.native
  def drawLineArrays(positions: js.Array[Double], colors: js.Array[Double], depthTest: Unit, layer: Layer): Unit = js.native
  
  /**
    * Renders an arbitrary number of discrete line segments. The lines are not connected by each
    * subsequent point in the array. Instead, they are individual segments specified by two
    * points. Therefore, the lengths of the supplied position and color arrays must be the same
    * and also must be a multiple of 2. The colors of the ends of each line segment will be
    * interpolated along the length of each line.
    *
    * @param {Vec3[]} positions - An array of points to draw lines between. The length of the
    * array must be a multiple of 2.
    * @param {Color[]} colors - An array of colors to color the lines. This must be the same
    * length as the position array. The length of the array must also be a multiple of 2.
    * @param {boolean} [depthTest] - Specifies if the lines are depth tested against the depth
    * buffer. Defaults to true.
    * @param {Layer} [layer] - The layer to render the lines into. Defaults to {@link LAYERID_IMMEDIATE}.
    * @example
    * // Render a single line, with unique colors for each point
    * var start = new pc.Vec3(0, 0, 0);
    * var end = new pc.Vec3(1, 0, 0);
    * app.drawLines([start, end], [pc.Color.RED, pc.Color.WHITE]);
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
    * app.drawLines(points, colors);
    */
  def drawLines(positions: js.Array[Vec3], colors: js.Array[Color]): Unit = js.native
  def drawLines(positions: js.Array[Vec3], colors: js.Array[Color], depthTest: Boolean): Unit = js.native
  def drawLines(positions: js.Array[Vec3], colors: js.Array[Color], depthTest: Boolean, layer: Layer): Unit = js.native
  def drawLines(positions: js.Array[Vec3], colors: js.Array[Color], depthTest: Unit, layer: Layer): Unit = js.native
  
  /**
    * Draw mesh at this frame.
    *
    * @param {Mesh} mesh - The mesh to draw.
    * @param {Material} material - The material to use to render the mesh.
    * @param {Mat4} matrix - The matrix to use to render the mesh.
    * @param {Layer} [layer] - The layer to render the mesh into. Defaults to {@link LAYERID_IMMEDIATE}.
    * @ignore
    */
  def drawMesh(mesh: Mesh, material: Material, matrix: Mat4): Unit = js.native
  def drawMesh(mesh: Mesh, material: Material, matrix: Mat4, layer: Layer): Unit = js.native
  
  /**
    * Draw meshInstance at this frame
    *
    * @param {MeshInstance} meshInstance - The mesh instance to draw.
    * @param {Layer} [layer] - The layer to render the mesh instance into. Defaults to
    * {@link LAYERID_IMMEDIATE}.
    * @ignore
    */
  def drawMeshInstance(meshInstance: MeshInstance): Unit = js.native
  def drawMeshInstance(meshInstance: MeshInstance, layer: Layer): Unit = js.native
  
  /**
    * Draw quad of size [-0.5, 0.5] at this frame.
    *
    * @param {Mat4} matrix - The matrix to use to render the quad.
    * @param {Material} material - The material to use to render the quad.
    * @param {Layer} [layer] - The layer to render the quad into. Defaults to {@link LAYERID_IMMEDIATE}.
    * @ignore
    */
  def drawQuad(matrix: Mat4, material: Material): Unit = js.native
  def drawQuad(matrix: Mat4, material: Material, layer: Layer): Unit = js.native
  
  /**
    * Draws a texture at [x, y] position on screen, with size [width, height]. The origin of the
    * screen is top-left [0, 0]. Coordinates and sizes are in projected space (-1 .. 1).
    *
    * @param {number} x - The x coordinate on the screen of the top left corner of the texture.
    * Should be in the range [-1, 1].
    * @param {number} y - The y coordinate on the screen of the top left corner of the texture.
    * Should be in the range [-1, 1].
    * @param {number} width - The width of the rectangle of the rendered texture. Should be in the
    * range [0, 2].
    * @param {number} height - The height of the rectangle of the rendered texture. Should be in
    * the range [0, 2].
    * @param {Texture} texture - The texture to render.
    * @param {Material} material - The material used when rendering the texture.
    * @param {Layer} [layer] - The layer to render the texture into. Defaults to {@link LAYERID_IMMEDIATE}.
    * @ignore
    */
  def drawTexture(x: Double, y: Double, width: Double, height: Double, texture: Texture, material: Material): Unit = js.native
  def drawTexture(
    x: Double,
    y: Double,
    width: Double,
    height: Double,
    texture: Texture,
    material: Material,
    layer: Layer
  ): Unit = js.native
  
  /**
    * Draws a wireframe axis aligned box specified by min and max points and color.
    *
    * @param {Vec3} minPoint - The min corner point of the box.
    * @param {Vec3} maxPoint - The max corner point of the box.
    * @param {Color} [color] - The color of the sphere. It defaults to white if not specified.
    * @param {boolean} [depthTest] - Specifies if the sphere lines are depth tested against the
    * depth buffer. Defaults to true.
    * @param {Layer} [layer] - The layer to render the sphere into. Defaults to {@link LAYERID_IMMEDIATE}.
    * @example
    * // Render a red wire aligned box
    * var min = new pc.Vec3(-1, -1, -1);
    * var max = new pc.Vec3(1, 1, 1);
    * app.drawWireAlignedBox(min, max, pc.Color.RED);
    * @ignore
    */
  def drawWireAlignedBox(minPoint: Vec3, maxPoint: Vec3): Unit = js.native
  def drawWireAlignedBox(minPoint: Vec3, maxPoint: Vec3, color: Unit, depthTest: Boolean): Unit = js.native
  def drawWireAlignedBox(minPoint: Vec3, maxPoint: Vec3, color: Unit, depthTest: Boolean, layer: Layer): Unit = js.native
  def drawWireAlignedBox(minPoint: Vec3, maxPoint: Vec3, color: Unit, depthTest: Unit, layer: Layer): Unit = js.native
  def drawWireAlignedBox(minPoint: Vec3, maxPoint: Vec3, color: Color): Unit = js.native
  def drawWireAlignedBox(minPoint: Vec3, maxPoint: Vec3, color: Color, depthTest: Boolean): Unit = js.native
  def drawWireAlignedBox(minPoint: Vec3, maxPoint: Vec3, color: Color, depthTest: Boolean, layer: Layer): Unit = js.native
  def drawWireAlignedBox(minPoint: Vec3, maxPoint: Vec3, color: Color, depthTest: Unit, layer: Layer): Unit = js.native
  
  /**
    * Draws a wireframe sphere with center, radius and color.
    *
    * @param {Vec3} center - The center of the sphere.
    * @param {number} radius - The radius of the sphere.
    * @param {Color} [color] - The color of the sphere. It defaults to white if not specified.
    * @param {number} [segments] - Number of line segments used to render the circles forming the
    * sphere. Defaults to 20.
    * @param {boolean} [depthTest] - Specifies if the sphere lines are depth tested against the
    * depth buffer. Defaults to true.
    * @param {Layer} [layer] - The layer to render the sphere into. Defaults to {@link LAYERID_IMMEDIATE}.
    * @example
    * // Render a red wire sphere with radius of 1
    * var center = new pc.Vec3(0, 0, 0);
    * app.drawWireSphere(center, 1.0, pc.Color.RED);
    * @ignore
    */
  def drawWireSphere(center: Vec3, radius: Double): Unit = js.native
  def drawWireSphere(center: Vec3, radius: Double, color: Unit, segments: Double): Unit = js.native
  def drawWireSphere(center: Vec3, radius: Double, color: Unit, segments: Double, depthTest: Boolean): Unit = js.native
  def drawWireSphere(center: Vec3, radius: Double, color: Unit, segments: Double, depthTest: Boolean, layer: Layer): Unit = js.native
  def drawWireSphere(center: Vec3, radius: Double, color: Unit, segments: Double, depthTest: Unit, layer: Layer): Unit = js.native
  def drawWireSphere(center: Vec3, radius: Double, color: Unit, segments: Unit, depthTest: Boolean): Unit = js.native
  def drawWireSphere(center: Vec3, radius: Double, color: Unit, segments: Unit, depthTest: Boolean, layer: Layer): Unit = js.native
  def drawWireSphere(center: Vec3, radius: Double, color: Unit, segments: Unit, depthTest: Unit, layer: Layer): Unit = js.native
  def drawWireSphere(center: Vec3, radius: Double, color: Color): Unit = js.native
  def drawWireSphere(center: Vec3, radius: Double, color: Color, segments: Double): Unit = js.native
  def drawWireSphere(center: Vec3, radius: Double, color: Color, segments: Double, depthTest: Boolean): Unit = js.native
  def drawWireSphere(center: Vec3, radius: Double, color: Color, segments: Double, depthTest: Boolean, layer: Layer): Unit = js.native
  def drawWireSphere(center: Vec3, radius: Double, color: Color, segments: Double, depthTest: Unit, layer: Layer): Unit = js.native
  def drawWireSphere(center: Vec3, radius: Double, color: Color, segments: Unit, depthTest: Boolean): Unit = js.native
  def drawWireSphere(center: Vec3, radius: Double, color: Color, segments: Unit, depthTest: Boolean, layer: Layer): Unit = js.native
  def drawWireSphere(center: Vec3, radius: Double, color: Color, segments: Unit, depthTest: Unit, layer: Layer): Unit = js.native
  
  /**
    * Used to handle input for {@link ElementComponent}s.
    *
    * @type {ElementInput}
    */
  var elementInput: ElementInput = js.native
  
  /**
    * Set this to false if you want to run without using bundles. We set it to true only if
    * TextDecoder is available because we currently rely on it for untarring.
    *
    * @type {boolean}
    * @ignore
    */
  var enableBundles: Boolean = js.native
  
  /**
    * The current fill mode of the canvas. Can be:
    *
    * - {@link FILLMODE_NONE}: the canvas will always match the size provided.
    * - {@link FILLMODE_FILL_WINDOW}: the canvas will simply fill the window, changing aspect ratio.
    * - {@link FILLMODE_KEEP_ASPECT}: the canvas will grow to fill the window as best it can while
    * maintaining the aspect ratio.
    *
    * @type {string}
    */
  def fillMode: String = js.native
  
  /**
    * The total number of frames the application has updated since start() was called.
    *
    * @type {number}
    * @ignore
    */
  var frame: Double = js.native
  
  /**
    * The frame graph.
    *
    * @type {FrameGraph}
    * @ignore
    */
  var frameGraph: FrameGraph = js.native
  
  /**
    * Used to access GamePad input.
    *
    * @type {GamePads}
    */
  var gamepads: GamePads = js.native
  
  /**
    * Get entity from the index by guid.
    *
    * @param {string} guid - The GUID to search for.
    * @returns {Entity} The Entity with the GUID or null.
    * @ignore
    */
  def getEntityFromIndex(guid: String): Entity = js.native
  
  /**
    * The graphics device used by the application.
    *
    * @type {GraphicsDevice}
    */
  var graphicsDevice: GraphicsDevice = js.native
  
  /**
    * Handles localization.
    *
    * @type {I18n}
    */
  var i18n: I18n = js.native
  
  /**
    * Initialize the app.
    *
    * @param {AppOptions} appOptions - Options specifying the init parameters for the app.
    */
  def init(appOptions: AppOptions): Unit = js.native
  
  /**
    * Update all input devices managed by the application.
    *
    * @param {number} dt - The time in seconds since the last update.
    * @private
    */
  /* private */ var inputUpdate: Any = js.native
  
  /**
    * Queries the visibility of the window or tab in which the application is running.
    *
    * @returns {boolean} True if the application is not visible and false otherwise.
    */
  def isHidden(): Boolean = js.native
  
  /**
    * The keyboard device.
    *
    * @type {Keyboard}
    */
  var keyboard: Keyboard = js.native
  
  /**
    * The run-time lightmapper.
    *
    * @type {Lightmapper}
    */
  var lightmapper: Lightmapper = js.native
  
  /**
    * The resource loader.
    *
    * @type {ResourceLoader}
    */
  var loader: ResourceLoader = js.native
  
  /**
    * Clamps per-frame delta time to an upper bound. Useful since returning from a tab
    * deactivation can generate huge values for dt, which can adversely affect game state.
    * Defaults to 0.1 (seconds).
    *
    * @type {number}
    * @example
    * // Don't clamp inter-frame times of 200ms or less
    * this.app.maxDeltaTime = 0.2;
    */
  var maxDeltaTime: Double = js.native
  
  /**
    * The mouse device.
    *
    * @type {Mouse}
    */
  var mouse: Mouse = js.native
  
  /**
    * Event handler called when all code libraries have been loaded. Code libraries are passed
    * into the constructor of the Application and the application won't start running or load
    * packs until all libraries have been loaded.
    *
    * @private
    */
  /* private */ var onLibrariesLoaded: Any = js.native
  
  /**
    * Called when the visibility state of the current tab/window changes.
    *
    * @private
    */
  /* private */ var onVisibilityChange: Any = js.native
  
  /**
    * Load all assets in the asset registry that are marked as 'preload'.
    *
    * @param {PreloadAppCallback} callback - Function called when all assets are loaded.
    */
  def preload(callback: PreloadAppCallback): Unit = js.native
  
  /**
    * Render the application's scene. More specifically, the scene's {@link LayerComposition} is
    * rendered. This function is called internally in the application's main loop and does not
    * need to be called explicitly.
    */
  def render(): Unit = js.native
  
  def renderComposition(layerComposition: Any): Unit = js.native
  
  /**
    * Set to true to render the scene on the next iteration of the main loop. This only has an
    * effect if {@link AppBase#autoRender} is set to false. The value of renderNextFrame
    * is set back to false again as soon as the scene has been rendered.
    *
    * @type {boolean}
    * @example
    * // Render the scene only while space key is pressed
    * if (this.app.keyboard.isPressed(pc.KEY_SPACE)) {
    *     this.app.renderNextFrame = true;
    * }
    */
  var renderNextFrame: Boolean = js.native
  
  /**
    * The forward renderer.
    *
    * @type {ForwardRenderer}
    * @ignore
    */
  var renderer: ForwardRenderer = js.native
  
  /**
    * Resize the application's canvas element in line with the current fill mode.
    *
    * - In {@link FILLMODE_KEEP_ASPECT} mode, the canvas will grow to fill the window as best it
    * can while maintaining the aspect ratio.
    * - In {@link FILLMODE_FILL_WINDOW} mode, the canvas will simply fill the window, changing
    * aspect ratio.
    * - In {@link FILLMODE_NONE} mode, the canvas will always match the size provided.
    *
    * @param {number} [width] - The width of the canvas. Only used if current fill mode is {@link FILLMODE_NONE}.
    * @param {number} [height] - The height of the canvas. Only used if current fill mode is {@link FILLMODE_NONE}.
    * @returns {object} A object containing the values calculated to use as width and height.
    */
  def resizeCanvas(): js.Object = js.native
  def resizeCanvas(width: Double): js.Object = js.native
  def resizeCanvas(width: Double, height: Double): js.Object = js.native
  def resizeCanvas(width: Unit, height: Double): js.Object = js.native
  
  /**
    * The current resolution mode of the canvas, Can be:
    *
    * - {@link RESOLUTION_AUTO}: if width and height are not provided, canvas will be resized to
    * match canvas client size.
    * - {@link RESOLUTION_FIXED}: resolution of canvas will be fixed.
    *
    * @type {string}
    */
  def resolutionMode: String = js.native
  
  /**
    * The root entity of the application.
    *
    * @type {Entity}
    * @example
    * // Return the first entity called 'Camera' in a depth-first search of the scene hierarchy
    * var camera = this.app.root.findByName('Camera');
    */
  var root: Entity = js.native
  
  /**
    * The scene managed by the application.
    *
    * @type {Scene}
    * @example
    * // Set the tone mapping property of the application's scene
    * this.app.scene.toneMapping = pc.TONEMAP_FILMIC;
    */
  var scene: Scene_ = js.native
  
  var sceneGrab: SceneGrab = js.native
  
  /**
    * The scene registry managed by the application.
    *
    * @type {SceneRegistry}
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
    *
    * @type {ScriptRegistry}
    */
  var scripts: ScriptRegistry = js.native
  
  var scriptsOrder: js.Array[String] = js.native
  
  /**
    * Sets the area light LUT tables for this app.
    *
    * @param {number[]} ltcMat1 - LUT table of type `array` to be set.
    * @param {number[]} ltcMat2 - LUT table of type `array` to be set.
    */
  def setAreaLightLuts(ltcMat1: js.Array[Double], ltcMat2: js.Array[Double]): Unit = js.native
  
  /**
    * Controls how the canvas fills the window and resizes when the window changes.
    *
    * @param {string} mode - The mode to use when setting the size of the canvas. Can be:
    *
    * - {@link FILLMODE_NONE}: the canvas will always match the size provided.
    * - {@link FILLMODE_FILL_WINDOW}: the canvas will simply fill the window, changing aspect ratio.
    * - {@link FILLMODE_KEEP_ASPECT}: the canvas will grow to fill the window as best it can while
    * maintaining the aspect ratio.
    *
    * @param {number} [width] - The width of the canvas (only used when mode is {@link FILLMODE_NONE}).
    * @param {number} [height] - The height of the canvas (only used when mode is {@link FILLMODE_NONE}).
    */
  def setCanvasFillMode(mode: String): Unit = js.native
  def setCanvasFillMode(mode: String, width: Double): Unit = js.native
  def setCanvasFillMode(mode: String, width: Double, height: Double): Unit = js.native
  def setCanvasFillMode(mode: String, width: Unit, height: Double): Unit = js.native
  
  /**
    * Change the resolution of the canvas, and set the way it behaves when the window is resized.
    *
    * @param {string} mode - The mode to use when setting the resolution. Can be:
    *
    * - {@link RESOLUTION_AUTO}: if width and height are not provided, canvas will be resized to
    * match canvas client size.
    * - {@link RESOLUTION_FIXED}: resolution of canvas will be fixed.
    *
    * @param {number} [width] - The horizontal resolution, optional in AUTO mode, if not provided
    * canvas clientWidth is used.
    * @param {number} [height] - The vertical resolution, optional in AUTO mode, if not provided
    * canvas clientHeight is used.
    */
  def setCanvasResolution(mode: String): Unit = js.native
  def setCanvasResolution(mode: String, width: Double): Unit = js.native
  def setCanvasResolution(mode: String, width: Double, height: Double): Unit = js.native
  def setCanvasResolution(mode: String, width: Unit, height: Double): Unit = js.native
  
  /**
    * Sets the skybox asset to current scene, and subscribes to asset load/change events.
    *
    * @param {Asset} asset - Asset of type `skybox` to be set to, or null to remove skybox.
    */
  def setSkybox(asset: Asset_): Unit = js.native
  
  /**
    * @type {SoundManager}
    * @ignore
    */
  def soundManager: SoundManager = js.native
  
  /**
    * Start the application. This function does the following:
    *
    * 1. Fires an event on the application named 'start'
    * 2. Calls initialize for all components on entities in the hierarchy
    * 3. Fires an event on the application named 'initialize'
    * 4. Calls postInitialize for all components on entities in the hierarchy
    * 5. Fires an event on the application named 'postinitialize'
    * 6. Starts executing the main loop of the application
    *
    * This function is called internally by PlayCanvas applications made in the Editor but you
    * will need to call start yourself if you are using the engine stand-alone.
    *
    * @example
    * app.start();
    */
  def start(): Unit = js.native
  
  var stats: ApplicationStats = js.native
  
  /**
    * The application's component system registry. The Application constructor adds the
    * following component systems to its component system registry:
    *
    * - anim ({@link AnimComponentSystem})
    * - animation ({@link AnimationComponentSystem})
    * - audiolistener ({@link AudioListenerComponentSystem})
    * - button ({@link ButtonComponentSystem})
    * - camera ({@link CameraComponentSystem})
    * - collision ({@link CollisionComponentSystem})
    * - element ({@link ElementComponentSystem})
    * - layoutchild ({@link LayoutChildComponentSystem})
    * - layoutgroup ({@link LayoutGroupComponentSystem})
    * - light ({@link LightComponentSystem})
    * - model ({@link ModelComponentSystem})
    * - particlesystem ({@link ParticleSystemComponentSystem})
    * - rigidbody ({@link RigidBodyComponentSystem})
    * - render ({@link RenderComponentSystem})
    * - screen ({@link ScreenComponentSystem})
    * - script ({@link ScriptComponentSystem})
    * - scrollbar ({@link ScrollbarComponentSystem})
    * - scrollview ({@link ScrollViewComponentSystem})
    * - sound ({@link SoundComponentSystem})
    * - sprite ({@link SpriteComponentSystem})
    *
    * @type {ComponentSystemRegistry}
    * @example
    * // Set global gravity to zero
    * this.app.systems.rigidbody.gravity.set(0, 0, 0);
    * @example
    * // Set the global sound volume to 50%
    * this.app.systems.sound.volume = 0.5;
    */
  var systems: ComponentSystemRegistry = js.native
  
  def tick(): Any = js.native
  def tick(timestamp: Double): Any = js.native
  def tick(timestamp: Double, frame: Any): Any = js.native
  def tick(timestamp: Unit, frame: Any): Any = js.native
  @JSName("tick")
  var tick_Original: MakeTickCallback = js.native
  
  /**
    * Scales the global time delta. Defaults to 1.
    *
    * @type {number}
    * @example
    * // Set the app to run at half speed
    * this.app.timeScale = 0.5;
    */
  var timeScale: Double = js.native
  
  /**
    * Used to get touch events input.
    *
    * @type {TouchDevice}
    */
  var touch: TouchDevice = js.native
  
  /**
    * Update the application. This function will call the update functions and then the postUpdate
    * functions of all enabled components. It will then update the current state of all connected
    * input devices. This function is called internally in the application's main loop and does
    * not need to be called explicitly.
    *
    * @param {number} dt - The time delta in seconds since the last frame.
    */
  def update(dt: Double): Unit = js.native
  
  /**
    * Updates the {@link GraphicsDevice} canvas size to match the canvas size on the document
    * page. It is recommended to call this function when the canvas size changes (e.g on window
    * resize and orientation change events) so that the canvas resolution is immediately updated.
    */
  def updateCanvasSize(): Unit = js.native
  
  /**
    * Enable if you want entity type script attributes to not be re-mapped when an entity is
    * cloned.
    *
    * @type {boolean}
    * @ignore
    */
  var useLegacyScriptAttributeCloning: Boolean = js.native
  
  /**
    * The XR Manager that provides ability to start VR/AR sessions.
    *
    * @type {XrManager}
    * @example
    * // check if VR is available
    * if (app.xr.isAvailable(pc.XRTYPE_VR)) {
    *     // VR is available
    * }
    */
  var xr: XrManager = js.native
}
