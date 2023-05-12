package typings.playcanvas.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The lit options determines how the lit-shader gets generated. It specifies a set of
  * parameters which triggers different fragment and vertex shader generation in the backend.
  */
@JSImport("playcanvas", "LitOptions")
@js.native
open class LitOptions () extends StObject {
  
  var _isForwardPass: Boolean = js.native
  
  var _pass: Double = js.native
  
  /**
    * Enable alpha testing. See {@link Material#alphaTest}.
    *
    * @type {boolean}
    */
  var alphaTest: Boolean = js.native
  
  /**
    * Enable alpha to coverage. See {@link Material#alphaToCoverage}.
    *
    * @type {boolean}
    */
  var alphaToCoverage: Boolean = js.native
  
  var ambientEncoding: Any = js.native
  
  /**
    * If ambient spherical harmonics are used. Ambient SH replace prefiltered cubemap ambient on
    * certain platforms (mostly Android) for performance reasons.
    *
    * @type {boolean}
    */
  var ambientSH: Boolean = js.native
  
  /**
    * One of "ambientSH", "envAtlas", "constant".
    *
    * @type {string}
    */
  var ambientSource: String = js.native
  
  var aoMapEnabled: Boolean = js.native
  
  /**
    * The value of {@link Material#blendType}.
    *
    * @type {number}
    */
  var blendType: Double = js.native
  
  /**
    * Object containing custom shader chunks that will replace default ones.
    *
    * @type {Object<string, string>}
    */
  var chunks: StringDictionary[String] = js.native
  
  var clearCoatNormalMapEnabled: Boolean = js.native
  
  var clusteredLightingAreaLightsEnabled: Boolean = js.native
  
  var clusteredLightingCookiesEnabled: Boolean = js.native
  
  var clusteredLightingEnabled: Boolean = js.native
  
  var clusteredLightingShadowType: Double = js.native
  
  var clusteredLightingShadowsEnabled: Boolean = js.native
  
  /**
    * The value of {@link StandardMaterial#conserveEnergy}.
    *
    * @type {boolean}
    */
  var conserveEnergy: Boolean = js.native
  
  /**
    * The value of {@link StandardMaterial#cubeMapProjection}.
    *
    * @type {number}
    */
  var cubeMapProjection: Double = js.native
  
  /**
    * Replaced the whole fragment shader with this string.
    *
    * @type {string}
    */
  var customFragmentShader: String = js.native
  
  var detailModes: Double = js.native
  
  var diffuseMapEnabled: Boolean = js.native
  
  var dirLightMapEnabled: Boolean = js.native
  
  var enableGGXSpecular: Boolean = js.native
  
  /**
    * Use slightly cheaper normal mapping code (skip tangent space normalization). Can look buggy
    * sometimes.
    *
    * @type {boolean}
    */
  var fastTbn: Boolean = js.native
  
  /**
    * If cubemaps require seam fixing (see {@link Texture#options.fixCubemapSeams}).
    *
    * @type {boolean}
    */
  var fixSeams: Boolean = js.native
  
  /**
    * The type of fog being applied in the shader. See {@link Scene#fog} for the list of possible
    * values.
    *
    * @type {string}
    */
  var fog: String = js.native
  
  /**
    * Override fragment shader numeric precision. Can be "lowp", "mediump", "highp" or null to use
    * default.
    *
    * @type {string}
    */
  var forceFragmentPrecision: String = js.native
  
  /**
    * The value of {@link StandardMaterial#fresnelModel}.
    *
    * @type {number}
    */
  var fresnelModel: Double = js.native
  
  /**
    * The type of gamma correction being applied in the shader. See {@link Scene#gammaCorrection}
    * for the list of possible values.
    *
    * @type {number}
    */
  var gamma: Double = js.native
  
  var hasTangents: Boolean = js.native
  
  var heightMapEnabled: Boolean = js.native
  
  def isForwardPass: Boolean = js.native
  def isForwardPass_=(arg: Boolean): Unit = js.native
  
  var lightMapEnabled: Boolean = js.native
  
  var lightMapWithoutAmbient: Boolean = js.native
  
  var lightMaskDynamic: Double = js.native
  
  var lights: js.Array[Any] = js.native
  
  var msdfTextAttribute: Double = js.native
  
  var nineSlicedMode: Double = js.native
  
  var noShadow: Boolean = js.native
  
  var normalMapEnabled: Boolean = js.native
  
  /**
    * The value of {@link StandardMaterial#occludeDirect}.
    *
    * @type {boolean}
    */
  var occludeDirect: Boolean = js.native
  
  /**
    * The value of {@link StandardMaterial#occludeSpecular}.
    *
    * @type {number}
    */
  var occludeSpecular: Double = js.native
  
  /**
    * Defines if {@link StandardMaterial#occludeSpecularIntensity} constant should affect specular
    * occlusion.
    *
    * @type {boolean}
    */
  var occludeSpecularFloat: Boolean = js.native
  
  /**
    * Enable specular fade. See {@link Material#opacityFadesSpecular}.
    *
    * @type {boolean}
    */
  var opacityFadesSpecular: Boolean = js.native
  
  def pass: Double = js.native
  def pass_=(arg: Double): Unit = js.native
  
  var pixelSnap: Boolean = js.native
  
  var reflectionEncoding: Any = js.native
  
  /**
    * One of "envAtlasHQ", "envAtlas", "cubeMap", "sphereMap".
    *
    * @type {string}
    */
  var reflectionSource: String = js.native
  
  var screenSpace: Boolean = js.native
  
  var separateAmbient: Boolean = js.native
  
  /**
    * The value of {@link StandardMaterial#shadingModel}.
    *
    * @type {number}
    */
  var shadingModel: Double = js.native
  
  var skin: Boolean = js.native
  
  /**
    * Skybox intensity factor.
    *
    * @type {number}
    */
  var skyboxIntensity: Double = js.native
  
  /**
    * The type of tone mapping being applied in the shader. See {@link Scene#toneMapping} for the
    * list of possible values.
    *
    * @type {number}
    */
  var toneMap: Double = js.native
  
  /**
    * The value of {@link Material#twoSidedLighting}.
    *
    * @type {boolean}
    */
  var twoSidedLighting: Boolean = js.native
  
  var useAmbientTint: Boolean = js.native
  
  var useAoMap: Boolean = js.native
  
  var useAoVertexColors: Boolean = js.native
  
  var useClearCoat: Boolean = js.native
  
  var useClearCoatNormalMap: Boolean = js.native
  
  /**
    * If cube map rotation is enabled.
    *
    * @type {boolean}
    */
  var useCubeMapRotation: Boolean = js.native
  
  var useDiffuseMap: Boolean = js.native
  
  var useDynamicRefraction: Boolean = js.native
  
  /**
    * If hardware instancing compatible shader should be generated. Transform is read from
    * per-instance {@link VertexBuffer} instead of shader's uniforms.
    *
    * @type {boolean}
    */
  var useInstancing: Boolean = js.native
  
  var useIridescence: Boolean = js.native
  
  var useLightMapVertexColors: Boolean = js.native
  
  /**
    * The value of {@link StandardMaterial#useMetalness}.
    *
    * @type {boolean}
    */
  var useMetalness: Boolean = js.native
  
  /**
    * If morphing code should be generated to morph normals.
    *
    * @type {boolean}
    */
  var useMorphNormal: Boolean = js.native
  
  /**
    * If morphing code should be generated to morph positions.
    *
    * @type {boolean}
    */
  var useMorphPosition: Boolean = js.native
  
  var useMorphTextureBased: Boolean = js.native
  
  var useMsdf: Boolean = js.native
  
  /**
    * If refraction is used.
    *
    * @type {boolean}
    */
  var useRefraction: Boolean = js.native
  
  var useSheen: Boolean = js.native
  
  /**
    * If any specular or reflections are needed at all.
    *
    * @type {boolean}
    */
  var useSpecular: Boolean = js.native
  
  var useSpecularColor: Boolean = js.native
  
  var useSpecularityFactor: Boolean = js.native
  
  var vertexColors: Boolean = js.native
}
