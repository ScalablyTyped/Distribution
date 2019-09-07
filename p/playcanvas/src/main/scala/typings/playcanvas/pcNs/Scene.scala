package typings.playcanvas.pcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @constructor
  * @name pc.Scene
  * @classdesc A scene is graphical representation of an environment. It manages the scene hierarchy, all
  * graphical objects, lights, and scene-wide properties.
  * @description Creates a new Scene.
  * @property {pc.Color} ambientLight The color of the scene's ambient light. Defaults to black (0, 0, 0).
  * @property {String} fog The type of fog used by the scene. Can be:
  * <ul>
  *     <li>pc.FOG_NONE</li>
  *     <li>pc.FOG_LINEAR</li>
  *     <li>pc.FOG_EXP</li>
  *     <li>pc.FOG_EXP2</li>
  * </ul>
  * Defaults to pc.FOG_NONE.
  * @property {pc.Color} fogColor The color of the fog (if enabled). Defaults to black (0, 0, 0).
  * @property {Number} fogDensity The density of the fog (if enabled). This property is only valid if the
  * fog property is set to pc.FOG_EXP or pc.FOG_EXP2. Defaults to 0.
  * @property {Number} fogEnd The distance from the viewpoint where linear fog reaches its maximum. This
  * property is only valid if the fog property is set to pc.FOG_LINEAR. Defaults to 1000.
  * @property {Number} fogStart The distance from the viewpoint where linear fog begins. This property is
  * only valid if the fog property is set to pc.FOG_LINEAR. Defaults to 1.
  * @property {Number} gammaCorrection The gamma correction to apply when rendering the scene. Can be:
  * <ul>
  *     <li>pc.GAMMA_NONE</li>
  *     <li>pc.GAMMA_SRGB</li>
  * </ul>
  * Defaults to pc.GAMMA_NONE.
  * @property {Number} toneMapping The tonemapping transform to apply when writing fragments to the
  * frame buffer. Can be:
  * <ul>
  *     <li>pc.TONEMAP_LINEAR</li>
  *     <li>pc.TONEMAP_FILMIC</li>
  *     <li>pc.TONEMAP_HEJL</li>
  *     <li>pc.TONEMAP_ACES</li>
  * </ul>
  * Defaults to pc.TONEMAP_LINEAR.
  * @property {pc.Texture} skybox A cube map texture used as the scene's skybox. Defaults to null.
  * @property {Number} skyboxIntensity Multiplier for skybox intensity. Defaults to 1.
  * @property {Number} skyboxMip The mip level of the skybox to be displayed. Only valid for prefiltered
  * cubemap skyboxes. Defaults to 0 (base level).
  * @property {Number} lightmapSizeMultiplier The lightmap resolution multiplier. Defaults to 1.
  * @property {Number} lightmapMaxResolution The maximum lightmap resolution. Defaults to 2048.
  * @property {Number} lightmapMode The lightmap baking mode. Can be:
  * <ul>
  *     <li>pc.BAKE_COLOR: single color lightmap
  *     <li>pc.BAKE_COLORDIR: single color lightmap + dominant light direction (used for bump/specular)
  * </ul>
  * Only lights with bakeDir=true will be used for generating the dominant light direction. Defaults to
  * pc.BAKE_COLORDIR.
  * @property {pc.LayerComposition} layers A {@link pc.LayerComposition} that defines rendering order of this scene.
  * @property {pc.StandardMaterial} defaultMaterial The default material used in case no other material is available.
  */
@JSGlobal("pc.Scene")
@js.native
class Scene () extends js.Object {
  /**
    * The color of the scene's ambient light. Defaults to black (0, 0, 0).
    */
  var ambientLight: Color = js.native
  /**
    * The default material used in case no other material is available.
    */
  var defaultMaterial: StandardMaterial = js.native
  /**
    * The type of fog used by the scene. Can be:
    * <ul>
    * <li>pc.FOG_NONE</li>
    * <li>pc.FOG_LINEAR</li>
    * <li>pc.FOG_EXP</li>
    * <li>pc.FOG_EXP2</li>
    * </ul>
    * Defaults to pc.FOG_NONE.
    */
  var fog: String = js.native
  /**
    * The color of the fog (if enabled). Defaults to black (0, 0, 0).
    */
  var fogColor: Color = js.native
  /**
    * The density of the fog (if enabled). This property is only valid if the
    * fog property is set to pc.FOG_EXP or pc.FOG_EXP2. Defaults to 0.
    */
  var fogDensity: Double = js.native
  /**
    * The distance from the viewpoint where linear fog reaches its maximum. This
    * property is only valid if the fog property is set to pc.FOG_LINEAR. Defaults to 1000.
    */
  var fogEnd: Double = js.native
  /**
    * The distance from the viewpoint where linear fog begins. This property is
    * only valid if the fog property is set to pc.FOG_LINEAR. Defaults to 1.
    */
  var fogStart: Double = js.native
  /**
    * The gamma correction to apply when rendering the scene. Can be:
    * <ul>
    * <li>pc.GAMMA_NONE</li>
    * <li>pc.GAMMA_SRGB</li>
    * </ul>
    * Defaults to pc.GAMMA_NONE.
    */
  var gammaCorrection: Double = js.native
  /**
    * A {@link pc.LayerComposition} that defines rendering order of this scene.
    */
  var layers: LayerComposition = js.native
  /**
    * The maximum lightmap resolution. Defaults to 2048.
    */
  var lightmapMaxResolution: Double = js.native
  /**
    * The lightmap baking mode. Can be:
    * <ul>
    * <li>pc.BAKE_COLOR: single color lightmap
    * <li>pc.BAKE_COLORDIR: single color lightmap + dominant light direction (used for bump/specular)
    * </ul>
    * Only lights with bakeDir=true will be used for generating the dominant light direction. Defaults to
    * pc.BAKE_COLORDIR.
    */
  var lightmapMode: Double = js.native
  /**
    * The lightmap resolution multiplier. Defaults to 1.
    */
  var lightmapSizeMultiplier: Double = js.native
  /**
    * A cube map texture used as the scene's skybox. Defaults to null.
    */
  var skybox: Texture = js.native
  /**
    * Multiplier for skybox intensity. Defaults to 1.
    */
  var skyboxIntensity: Double = js.native
  /**
    * The mip level of the skybox to be displayed. Only valid for prefiltered
    * cubemap skyboxes. Defaults to 0 (base level).
    */
  var skyboxMip: Double = js.native
  /**
    * The tonemapping transform to apply when writing fragments to the
    * frame buffer. Can be:
    * <ul>
    * <li>pc.TONEMAP_LINEAR</li>
    * <li>pc.TONEMAP_FILMIC</li>
    * <li>pc.TONEMAP_HEJL</li>
    * <li>pc.TONEMAP_ACES</li>
    * </ul>
    * Defaults to pc.TONEMAP_LINEAR.
    */
  var toneMapping: Double = js.native
}

