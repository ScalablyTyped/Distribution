package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Lighting parameters, allow configuration of the global lighting parameters.
  * For details see [Clustered Lighting](https://developer.playcanvas.com/en/user-manual/graphics/lighting/clustered-lighting/)
  *
  * @property {number} debugLayer Layer ID of a layer to contain the debug rendering
  * of clustered lighting. Defaults to undefined, which disables the debug rendering.
  * Debug rendering is only included in the debug version of the engine.
  *
  * @property {Array<number>|null} atlasSplit Atlas textures split description, which applies
  * to both the shadow and cookie texture atlas. Defaults to null, which enables to automatic
  * split mode. For details see [Configuring Atlas Split](https://developer.playcanvas.com/en/user-manual/graphics/lighting/clustered-lighting/#configuring-atlas)
  *
  * @hideconstructor
  */
@JSImport("playcanvas", "LightingParams")
@js.native
open class LightingParams protected () extends StObject {
  def this(supportsAreaLights: Any, maxTextureSize: Any, dirtyLightsFnc: Any) = this()
  
  var _areaLightsEnabled: Boolean = js.native
  
  var _cells: Vec3 = js.native
  
  var _cookieAtlasResolution: Double = js.native
  
  var _cookiesEnabled: Boolean = js.native
  
  var _dirtyLightsFnc: Any = js.native
  
  var _maxLightsPerCell: Double = js.native
  
  var _maxTextureSize: Any = js.native
  
  var _shadowAtlasResolution: Double = js.native
  
  var _shadowType: Double = js.native
  
  var _shadowsEnabled: Boolean = js.native
  
  var _supportsAreaLights: Any = js.native
  
  def applySettings(render: Any): Unit = js.native
  
  def areaLightsEnabled: Boolean = js.native
  /**
    * If set to true, the clustered lighting will support area lights.
    * Defaults to false.
    *
    * @type {boolean}
    */
  def areaLightsEnabled_=(arg: Boolean): Unit = js.native
  
  var atlasSplit: Any = js.native
  
  var cell: Vec3 = js.native
  
  def cells: Vec3 = js.native
  /**
    * Number of cells along each world-space axis the space containing lights
    * is subdivided into. Defaults to Vec(10, 3, 10).
    *
    * @type {Vec3}
    */
  def cells_=(arg: Vec3): Unit = js.native
  
  def cookieAtlasResolution: Double = js.native
  /**
    * Resolution of the atlas texture storing all non-directional cookie textures.
    * Defaults to 2048.
    *
    * @type {number}
    */
  def cookieAtlasResolution_=(arg: Double): Unit = js.native
  
  def cookiesEnabled: Boolean = js.native
  /**
    * If set to true, the clustered lighting will support cookie textures.
    * Defaults to false.
    *
    * @type {boolean}
    */
  def cookiesEnabled_=(arg: Boolean): Unit = js.native
  
  var debugLayer: Any = js.native
  
  def maxLightsPerCell: Double = js.native
  /**
    * Maximum number of lights a cell can store. Defaults to 255.
    *
    * @type {number}
    */
  def maxLightsPerCell_=(arg: Double): Unit = js.native
  
  def shadowAtlasResolution: Double = js.native
  /**
    * Resolution of the atlas texture storing all non-directional shadow textures.
    * Defaults to 2048.
    *
    * @type {number}
    */
  def shadowAtlasResolution_=(arg: Double): Unit = js.native
  
  def shadowType: Double = js.native
  /**
    * The type of shadow filtering used by all shadows. Can be:
    *
    * - {@link SHADOW_PCF1}: PCF 1x1 sampling.
    * - {@link SHADOW_PCF3}: PCF 3x3 sampling.
    * - {@link SHADOW_PCF5}: PCF 5x5 sampling. Falls back to {@link SHADOW_PCF3} on WebGL 1.0.
    *
    * Defaults to {@link SHADOW_PCF3}
    *
    * @type {number}
    */
  def shadowType_=(arg: Double): Unit = js.native
  
  def shadowsEnabled: Boolean = js.native
  /**
    * If set to true, the clustered lighting will support shadows.
    * Defaults to true.
    *
    * @type {boolean}
    */
  def shadowsEnabled_=(arg: Boolean): Unit = js.native
}
