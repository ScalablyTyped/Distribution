package typings.playcanvas.mod

import typings.playcanvas.anon.BakedLights
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @typedef {import('../framework/entity.js').Entity} Entity */
/** @typedef {import('../graphics/graphics-device.js').GraphicsDevice} GraphicsDevice */
/** @typedef {import('../graphics/texture.js').Texture} Texture */
/** @typedef {import('./composition/layer-composition.js').LayerComposition} LayerComposition */
/** @typedef {import('./layer.js').Layer} Layer */
/**
  * A scene is graphical representation of an environment. It manages the scene hierarchy, all
  * graphical objects, lights, and scene-wide properties.
  *
  * @augments EventHandler
  */
@JSImport("playcanvas", "Scene")
@js.native
open class Scene_ protected () extends EventHandler {
  /**
    * Create a new Scene instance.
    *
    * @param {GraphicsDevice} graphicsDevice - The graphics device used to manage this scene.
    * @hideconstructor
    */
  def this(graphicsDevice: GraphicsDevice) = this()
  
  var _ambientBakeNumSamples: Double = js.native
  
  var _ambientBakeSpherePart: Double = js.native
  
  var _clusteredLightingEnabled: Boolean = js.native
  
  /**
    * Environment lighting atlas
    *
    * @type {Texture}
    * @private
    */
  /* private */ var _envAtlas: Any = js.native
  
  var _fog: String = js.native
  
  var _gammaCorrection: Double = js.native
  
  def _getSkyboxTex(): Texture = js.native
  
  var _gravity: Vec3 = js.native
  
  var _internalEnvAtlas: Any = js.native
  
  /**
    * @type {LayerComposition}
    * @private
    */
  /* private */ var _layers: Any = js.native
  
  var _lightingParams: LightingParams = js.native
  
  var _lightmapFilterRange: Double = js.native
  
  var _lightmapFilterSmoothness: Double = js.native
  
  /**
    * Array of 6 prefiltered lighting data cubemaps.
    *
    * @type {Texture[]}
    * @private
    */
  /* private */ var _prefilteredCubemaps: Any = js.native
  
  def _resetSky(): Unit = js.native
  
  var _shaderVersion: Double = js.native
  
  /**
    * The skybox cubemap as set by user (gets used when skyboxMip === 0)
    *
    * @type {Texture}
    * @private
    */
  /* private */ var _skyboxCubeMap: Any = js.native
  
  var _skyboxIntensity: Double = js.native
  
  var _skyboxMip: Double = js.native
  
  var _skyboxRotation: Quat = js.native
  
  var _skyboxRotationMat3: Any = js.native
  
  var _skyboxRotationMat4: Any = js.native
  
  var _stats: BakedLights = js.native
  
  var _statsUpdated: Boolean = js.native
  
  var _toneMapping: Double = js.native
  
  def _updateSky(device: Any): Unit = js.native
  
  /**
    * If enabled, the ambient lighting will be baked into lightmaps. This will be either the
    * {@link Scene#skybox} if set up, otherwise {@link Scene#ambientLight}. Defaults to false.
    *
    * @type {boolean}
    */
  var ambientBake: Boolean = js.native
  
  def ambientBakeNumSamples: Double = js.native
  /**
    * If {@link Scene#ambientBake} is true, this specifies the number of samples used to bake the
    * ambient light into the lightmap. Defaults to 1. Maximum value is 255.
    *
    * @type {number}
    */
  def ambientBakeNumSamples_=(arg: Double): Unit = js.native
  
  /**
    * If {@link Scene#ambientBake} is true, this specifies the brightness of ambient occlusion.
    * Typical range is -1 to 1. Defaults to 0, representing no change to brightness.
    *
    * @type {number}
    */
  var ambientBakeOcclusionBrightness: Double = js.native
  
  /**
    * If {@link Scene#ambientBake} is true, this specifies the contrast of ambient occlusion.
    * Typical range is -1 to 1. Defaults to 0, representing no change to contrast.
    *
    * @type {number}
    */
  var ambientBakeOcclusionContrast: Double = js.native
  
  def ambientBakeSpherePart: Double = js.native
  /**
    * If {@link Scene#ambientBake} is true, this specifies a part of the sphere which represents
    * the source of ambient light. The valid range is 0..1, representing a part of the sphere from
    * top to the bottom. A value of 0.5 represents the upper hemisphere. A value of 1 represents a
    * full sphere. Defaults to 0.4, which is a smaller upper hemisphere as this requires fewer
    * samples to bake.
    *
    * @type {number}
    */
  def ambientBakeSpherePart_=(arg: Double): Unit = js.native
  
  /**
    * The color of the scene's ambient light. Defaults to black (0, 0, 0).
    *
    * @type {Color}
    */
  var ambientLight: Color = js.native
  
  def applySettings(settings: Any): Unit = js.native
  
  def clusteredLightingEnabled: Boolean = js.native
  /**
    * True if the clustered lighting is enabled. Set to false before the first frame is rendered
    * to use non-clustered lighting. Defaults to true.
    *
    * @type {boolean}
    */
  def clusteredLightingEnabled_=(arg: Boolean): Unit = js.native
  
  /**
    * Fired when the skybox is set.
    *
    * @event Scene#set:skybox
    * @param {Texture} usedTex - Previously used cubemap texture. New is in the {@link Scene#skybox}.
    */
  /**
    * Fired when the layer composition is set. Use this event to add callbacks or advanced
    * properties to your layers.
    *
    * @event Scene#set:layers
    * @param {LayerComposition} oldComp - Previously used {@link LayerComposition}.
    * @param {LayerComposition} newComp - Newly set {@link LayerComposition}.
    * @example
    * this.app.scene.on('set:layers', function (oldComp, newComp) {
    *     var list = newComp.layerList;
    *     var layer;
    *     for (var i = 0; i < list.length; i++) {
    *         layer = list[i];
    *         switch (layer.name) {
    *             case 'MyLayer':
    *                 layer.onEnable = myOnEnableFunction;
    *                 layer.onDisable = myOnDisableFunction;
    *                 break;
    *             case 'MyOtherLayer':
    *                 layer.shaderPass = myShaderPass;
    *                 break;
    *         }
    *     }
    * });
    */
  /**
    * Returns the default layer used by the immediate drawing functions.
    *
    * @type {Layer}
    * @private
    */
  /* private */ def defaultDrawLayer: Any = js.native
  
  def destroy(): Unit = js.native
  
  var device: Any = js.native
  
  /* private */ def drawCalls: Any = js.native
  /**
    * List of all active composition mesh instances. Only for backwards compatibility.
    * TODO: BatchManager is using it - perhaps that could be refactored
    *
    * @type {MeshInstance[]}
    * @private
    */
  /* private */ def drawCalls_=(arg: Any): Unit = js.native
  
  def drawLine(start: Any, end: Any): Unit = js.native
  def drawLine(start: Any, end: Any, color: Unit, depthTest: Boolean): Unit = js.native
  def drawLine(start: Any, end: Any, color: Unit, depthTest: Boolean, layer: Layer): Unit = js.native
  def drawLine(start: Any, end: Any, color: Unit, depthTest: Unit, layer: Layer): Unit = js.native
  def drawLine(start: Any, end: Any, color: Color): Unit = js.native
  def drawLine(start: Any, end: Any, color: Color, depthTest: Boolean): Unit = js.native
  def drawLine(start: Any, end: Any, color: Color, depthTest: Boolean, layer: Layer): Unit = js.native
  def drawLine(start: Any, end: Any, color: Color, depthTest: Unit, layer: Layer): Unit = js.native
  
  def drawLineArrays(positions: Any, colors: Any): Unit = js.native
  def drawLineArrays(positions: Any, colors: Any, depthTest: Boolean): Unit = js.native
  def drawLineArrays(positions: Any, colors: Any, depthTest: Boolean, layer: Layer): Unit = js.native
  def drawLineArrays(positions: Any, colors: Any, depthTest: Unit, layer: Layer): Unit = js.native
  
  def drawLines(positions: Any, colors: Any): Unit = js.native
  def drawLines(positions: Any, colors: Any, depthTest: Boolean): Unit = js.native
  def drawLines(positions: Any, colors: Any, depthTest: Boolean, layer: Layer): Unit = js.native
  def drawLines(positions: Any, colors: Any, depthTest: Unit, layer: Layer): Unit = js.native
  
  def envAtlas: Texture = js.native
  /**
    * The environment lighting atlas.
    *
    * @type {Texture}
    */
  def envAtlas_=(arg: Texture): Unit = js.native
  
  /**
    * The exposure value tweaks the overall brightness of the scene. Defaults to 1.
    *
    * @type {number}
    */
  var exposure: Double = js.native
  
  def fog: String = js.native
  
  /**
    * The color of the fog (if enabled). Defaults to black (0, 0, 0).
    *
    * @type {Color}
    */
  var fogColor: Color = js.native
  
  /**
    * The density of the fog (if enabled). This property is only valid if the fog property is set
    * to {@link FOG_EXP} or {@link FOG_EXP2}. Defaults to 0.
    *
    * @type {number}
    */
  var fogDensity: Double = js.native
  
  /**
    * The distance from the viewpoint where linear fog reaches its maximum. This property is only
    * valid if the fog property is set to {@link FOG_LINEAR}. Defaults to 1000.
    *
    * @type {number}
    */
  var fogEnd: Double = js.native
  
  /**
    * The distance from the viewpoint where linear fog begins. This property is only valid if the
    * fog property is set to {@link FOG_LINEAR}. Defaults to 1.
    *
    * @type {number}
    */
  var fogStart: Double = js.native
  
  /**
    * The type of fog used by the scene. Can be:
    *
    * - {@link FOG_NONE}
    * - {@link FOG_LINEAR}
    * - {@link FOG_EXP}
    * - {@link FOG_EXP2}
    *
    * Defaults to {@link FOG_NONE}.
    *
    * @type {string}
    */
  def fog_=(arg: String): Unit = js.native
  
  def gammaCorrection: Double = js.native
  /**
    * The gamma correction to apply when rendering the scene. Can be:
    *
    * - {@link GAMMA_NONE}
    * - {@link GAMMA_SRGB}
    *
    * Defaults to {@link GAMMA_SRGB}.
    *
    * @type {number}
    */
  def gammaCorrection_=(arg: Double): Unit = js.native
  
  var immediate: Immediate = js.native
  
  def layers: LayerComposition = js.native
  /**
    * A {@link LayerComposition} that defines rendering order of this scene.
    *
    * @type {LayerComposition}
    */
  def layers_=(arg: LayerComposition): Unit = js.native
  
  /**
    * A {@link LightingParams} that defines lighting parameters.
    *
    * @type {LightingParams}
    */
  def lighting: LightingParams = js.native
  
  /**
    * Enables bilateral filter on runtime baked color lightmaps, which removes the noise and
    * banding while preserving the edges. Defaults to false. Note that the filtering takes place
    * in the image space of the lightmap, and it does not filter across lightmap UV space seams,
    * often making the seams more visible. It's important to balance the strength of the filter
    * with number of samples used for lightmap baking to limit the visible artifacts.
    *
    * @type {boolean}
    */
  var lightmapFilterEnabled: Boolean = js.native
  
  def lightmapFilterRange: Double = js.native
  /**
    * A range parameter of the bilateral filter. It's used when {@link Scene#lightmapFilterEnabled}
    * is enabled. Larger value applies more widespread blur. This needs to be a positive non-zero
    * value. Defaults to 10.
    *
    * @type {number}
    */
  def lightmapFilterRange_=(arg: Double): Unit = js.native
  
  def lightmapFilterSmoothness: Double = js.native
  /**
    * A spatial parameter of the bilateral filter. It's used when {@link Scene#lightmapFilterEnabled}
    * is enabled. Larger value blurs less similar colors. This needs to be a positive non-zero
    * value. Defaults to 0.2.
    *
    * @type {number}
    */
  def lightmapFilterSmoothness_=(arg: Double): Unit = js.native
  
  /**
    * The maximum lightmap resolution. Defaults to 2048.
    *
    * @type {number}
    */
  var lightmapMaxResolution: Double = js.native
  
  /**
    * The lightmap baking mode. Can be:
    *
    * - {@link BAKE_COLOR}: single color lightmap
    * - {@link BAKE_COLORDIR}: single color lightmap + dominant light direction (used for bump or
    * specular). Only lights with bakeDir=true will be used for generating the dominant light
    * direction.
    *
    * Defaults to {@link BAKE_COLORDIR}.
    *
    * @type {number}
    */
  var lightmapMode: Double = js.native
  
  /**
    * The lightmap resolution multiplier. Defaults to 1.
    *
    * @type {number}
    */
  var lightmapSizeMultiplier: Double = js.native
  
  def prefilteredCubemaps: js.Array[Texture] = js.native
  /**
    * Set of 6 prefiltered cubemaps.
    *
    * @type {Texture[]}
    */
  def prefilteredCubemaps_=(arg: js.Array[Texture]): Unit = js.native
  
  /**
    * The root entity of the scene, which is usually the only child to the {@link Application}
    * root entity.
    *
    * @type {Entity}
    */
  var root: Entity = js.native
  
  /**
    * Sets the cubemap for the scene skybox.
    *
    * @param {Texture[]} [cubemaps] - An array of cubemaps corresponding to the skybox at
    * different mip levels. If undefined, scene will remove skybox. Cubemap array should be of
    * size 7, with the first element (index 0) corresponding to the base cubemap (mip level 0)
    * with original resolution. Each remaining element (index 1-6) corresponds to a fixed
    * prefiltered resolution (128x128, 64x64, 32x32, 16x16, 8x8, 4x4).
    */
  def setSkybox(): Unit = js.native
  def setSkybox(cubemaps: js.Array[Texture]): Unit = js.native
  
  /**
    * The sky of the scene.
    *
    * @type {Sky}
    * @ignore
    */
  var sky: Sky = js.native
  
  def skybox: Texture = js.native
  
  def skyboxIntensity: Double = js.native
  /**
    * Multiplier for skybox intensity. Defaults to 1.
    *
    * @type {number}
    */
  def skyboxIntensity_=(arg: Double): Unit = js.native
  
  def skyboxMip: Double = js.native
  /**
    * The mip level of the skybox to be displayed. Only valid for prefiltered cubemap skyboxes.
    * Defaults to 0 (base level).
    *
    * @type {number}
    */
  def skyboxMip_=(arg: Double): Unit = js.native
  
  def skyboxRotation: Quat = js.native
  /**
    * The rotation of the skybox to be displayed. Defaults to {@link Quat.IDENTITY}.
    *
    * @type {Quat}
    */
  def skyboxRotation_=(arg: Quat): Unit = js.native
  
  /**
    * The base cubemap texture used as the scene's skybox, if mip level is 0. Defaults to null.
    *
    * @type {Texture}
    */
  def skybox_=(arg: Texture): Unit = js.native
  
  def toneMapping: Double = js.native
  /**
    * The tonemapping transform to apply when writing fragments to the frame buffer. Can be:
    *
    * - {@link TONEMAP_LINEAR}
    * - {@link TONEMAP_FILMIC}
    * - {@link TONEMAP_HEJL}
    * - {@link TONEMAP_ACES}
    *
    * Defaults to {@link TONEMAP_LINEAR}.
    *
    * @type {number}
    */
  def toneMapping_=(arg: Double): Unit = js.native
  
  /**
    * This flag indicates changes were made to the scene which may require recompilation of
    * shaders that reference global settings.
    *
    * @type {boolean}
    * @ignore
    */
  var updateShaders: Boolean = js.native
}
