package typings.playcanvas.pc

import typings.playcanvas.pc.callbacks.UpdateShader
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @constructor
  * @name pc.StandardMaterial
  * @extends pc.Material
  * @classdesc A Standard material is the main, general purpose material that is most often used for rendering.
  * It can approximate a wide variety of surface types and can simulate dynamic reflected light.
  * Most maps can use 3 types of input values in any combination: constant (color or number), mesh vertex colors and a texture. All enabled inputs are multiplied together.
  *
  * @property {pc.Color} ambient The ambient color of the material. This color value is 3-component (RGB),
  * where each component is between 0 and 1.
  *
  * @property {pc.Color} diffuse The diffuse color of the material. This color value is 3-component (RGB),
  * where each component is between 0 and 1.
  * Defines basic surface color (aka albedo).
  * @property {Boolean} diffuseTint Multiply diffuse map and/or diffuse vertex color by the constant diffuse value.
  * @property {pc.Texture|Null} diffuseMap The diffuse map of the material (default is null).
  * @property {Number} diffuseMapUv Diffuse map UV channel
  * @property {pc.Vec2} diffuseMapTiling Controls the 2D tiling of the diffuse map.
  * @property {pc.Vec2} diffuseMapOffset Controls the 2D offset of the diffuse map. Each component is between 0 and 1.
  * @property {String} diffuseMapChannel Color channels of the diffuse map to use. Can be "r", "g", "b", "a", "rgb" or any swizzled combination.
  * @property {Boolean} diffuseVertexColor Use mesh vertex colors for diffuse. If diffuseMap or are diffuseTint are set, they'll be multiplied by vertex colors.
  * @property {String} diffuseVertexColorChannel Vertex color channels to use for diffuse. Can be "r", "g", "b", "a", "rgb" or any swizzled combination.
  *
  * @property {pc.Color} specular The specular color of the material. This color value is 3-component (RGB),
  * where each component is between 0 and 1.
  * Defines surface reflection/specular color. Affects specular intensity and tint.
  * @property {Boolean} specularTint Multiply specular map and/or specular vertex color by the constant specular value.
  * @property {pc.Texture|Null} specularMap The specular map of the material (default is null).
  * @property {Number} specularMapUv Specular map UV channel
  * @property {pc.Vec2} specularMapTiling Controls the 2D tiling of the specular map.
  * @property {pc.Vec2} specularMapOffset Controls the 2D offset of the specular map. Each component is between 0 and 1.
  * @property {String} specularMapChannel Color channels of the specular map to use. Can be "r", "g", "b", "a", "rgb" or any swizzled combination.
  * @property {Boolean} specularVertexColor Use mesh vertex colors for specular. If specularMap or are specularTint are set, they'll be multiplied by vertex colors.
  * @property {String} specularVertexColorChannel Vertex color channels to use for specular. Can be "r", "g", "b", "a", "rgb" or any swizzled combination.
  *
  * @property {Boolean} useMetalness Use metalness properties instead of specular.
  * When enabled, diffuse colors also affect specular instead of the dedicated specular map.
  * This can be used as alternative to specular color to save space.
  * With metaless == 0, the pixel is assumed to be dielectric, and diffuse color is used as normal.
  * With metaless == 1, the pixel is fully metallic, and diffuse color is used as specular color instead.
  * @property {Number} metalness Defines how much the surface is metallic. From 0 (dielectric) to 1 (metal).
  * @property {pc.Texture|Null} metalnessMap Monochrome metalness map (default is null).
  * @property {Number} metalnessMapUv Metalness map UV channel
  * @property {pc.Vec2} metalnessMapTiling Controls the 2D tiling of the metalness map.
  * @property {pc.Vec2} metalnessMapOffset Controls the 2D offset of the metalness map. Each component is between 0 and 1.
  * @property {String} metalnessMapChannel Color channel of the metalness map to use. Can be "r", "g", "b" or "a".
  * @property {Boolean} metalnessVertexColor Use mesh vertex colors for metalness. If metalnessMap is set, it'll be multiplied by vertex colors.
  * @property {String} metalnessVertexColorChannel Vertex color channel to use for metalness. Can be "r", "g", "b" or "a".
  *
  * @property {Number} shininess Defines glossiness of the material from 0 (rough) to 100 (shiny mirror).
  * A higher shininess value results in a more focused specular highlight.
  * Glossiness map/vertex colors are always multiplied by this value (normalized to 0 - 1 range), or it is used directly as constant output.
  * @property {pc.Texture|Null} glossMap Glossiness map (default is null). If specified, will be multiplied by normalized 'shininess' value and/or vertex colors.
  * @property {Number} glossMapUv Gloss map UV channel
  * @property {String} glossMapChannel Color channel of the gloss map to use. Can be "r", "g", "b" or "a".
  * @property {pc.Vec2} glossMapTiling Controls the 2D tiling of the gloss map.
  * @property {pc.Vec2} glossMapOffset Controls the 2D offset of the gloss map. Each component is between 0 and 1.
  * @property {Boolean} glossVertexColor Use mesh vertex colors for glossiness. If glossMap is set, it'll be multiplied by vertex colors.
  * @property {String} glossVertexColorChannel Vertex color channel to use for glossiness. Can be "r", "g", "b" or "a".
  *
  * @property {Number} refraction Defines the visibility of refraction. Material can refract the same cube map as used for reflections.
  * @property {Number} refractionIndex Defines the index of refraction, i.e. the amount of distortion.
  * The value is calculated as (outerIor / surfaceIor), where inputs are measured indices of refraction, the one around the object and the one of it's own surface.
  * In most situations outer medium is air, so outerIor will be approximately 1. Then you only need to do (1.0 / surfaceIor).
  *
  * @property {pc.Color} emissive The emissive color of the material. This color value is 3-component (RGB),
  * where each component is between 0 and 1.
  * @property {Boolean} emissiveTint Multiply emissive map and/or emissive vertex color by the constant emissive value.
  * @property {pc.Texture|Null} emissiveMap The emissive map of the material (default is null). Can be HDR.
  * @property {Number} emissiveIntensity Emissive color multiplier.
  * @property {Number} emissiveMapUv Emissive map UV channel.
  * @property {pc.Vec2} emissiveMapTiling Controls the 2D tiling of the emissive map.
  * @property {pc.Vec2} emissiveMapOffset Controls the 2D offset of the emissive map. Each component is between 0 and 1.
  * @property {String} emissiveMapChannel Color channels of the emissive map to use. Can be "r", "g", "b", "a", "rgb" or any swizzled combination.
  * @property {Boolean} emissiveVertexColor Use mesh vertex colors for emission. If emissiveMap or emissiveTint are set, they'll be multiplied by vertex colors.
  * @property {String} emissiveVertexColorChannel Vertex color channels to use for emission. Can be "r", "g", "b", "a", "rgb" or any swizzled combination.
  *
  * @property {Number} opacity The opacity of the material. This value can be between 0 and 1, where 0 is fully
  * transparent and 1 is fully opaque. If you want the material to be semi-transparent you also need to
  * set the {@link pc.Material#blendType} to pc.BLEND_NORMAL, pc.BLEND_ADDITIVE or any other mode.
  * Also note that for most semi-transparent objects you want {@link pc.Material#depthWrite} to be false, otherwise they can fully occlude objects behind them.
  * @property {pc.Texture|Null} opacityMap The opacity map of the material (default is null).
  * @property {Number} opacityMapUv Opacity map UV channel
  * @property {String} opacityMapChannel Color channel of the opacity map to use. Can be "r", "g", "b" or "a".
  * @property {pc.Vec2} opacityMapTiling Controls the 2D tiling of the opacity map.
  * @property {pc.Vec2} opacityMapOffset Controls the 2D offset of the opacity map. Each component is between 0 and 1.
  * @property {Boolean} opacityVertexColor Use mesh vertex colors for opacity. If opacityMap is set, it'll be multiplied by vertex colors.
  * @property {String} opacityVertexColorChannel Vertex color channels to use for opacity. Can be "r", "g", "b" or "a".
  *
  * @property {pc.Texture|Null} normalMap The normal map of the material (default is null).
  * The texture must contains normalized, tangent space normals.
  * @property {Number} normalMapUv Normal map UV channel
  * @property {pc.Vec2} normalMapTiling Controls the 2D tiling of the normal map.
  * @property {pc.Vec2} normalMapOffset Controls the 2D offset of the normal map. Each component is between 0 and 1.
  * @property {Number} bumpiness The bumpiness of the material. This value scales the assigned normal map.
  * It should be normally between 0 (no bump mapping) and 1 (full bump mapping), but can be set to e.g. 2 to give even more pronounced bump effect.
  *
  * @property {pc.Texture|Null} heightMap The height map of the material (default is null). Used for a view-dependent parallax effect.
  * The texture must represent the height of the surface where darker pixels are lower and lighter pixels are higher.
  * It is recommended to use it together with a normal map.
  * @property {Number} heightMapUv Height map UV channel
  * @property {String} heightMapChannel Color channel of the height map to use. Can be "r", "g", "b" or "a".
  * @property {pc.Vec2} heightMapTiling Controls the 2D tiling of the height map.
  * @property {pc.Vec2} heightMapOffset Controls the 2D offset of the height map. Each component is between 0 and 1.
  * @property {Number} heightMapFactor Height map multiplier. Affects the strength of the parallax effect.
  *
  * @property {pc.Texture|Null} sphereMap The spherical environment map of the material (default is null). Affects reflections.
  * @property {pc.Texture|Null} cubeMap The cubic environment map of the material (default is null). Overrides sphereMap. Affects reflections. If cubemap is prefiltered, will also affect ambient color.
  * @property {Number} cubeMapProjection The type of projection applied to the cubeMap property:
  * <ul>
  *     <li>{@link pc.CUBEPROJ_NONE}: The cube map is treated as if it is infinitely far away.</li>
  *     <li>{@link pc.CUBEPROJ_BOX}: Box-projection based on a world space axis-aligned bounding box.</li>
  * </ul>
  * Defaults to pc.CUBEPROJ_NONE.
  * @property {pc.BoundingBox} cubeMapProjectionBox The world space axis-aligned bounding box defining the
  * box-projection used for the cubeMap property. Only used when cubeMapProjection is set to pc.CUBEPROJ_BOX.
  * @property {Number} reflectivity Environment map intensity.
  *
  * @property {pc.Texture|Null} lightMap A custom lightmap of the material (default is null). Lightmaps are textures that contain pre-rendered lighting. Can be HDR.
  * @property {Number} lightMapUv Lightmap UV channel
  * @property {String} lightMapChannel Color channels of the lightmap to use. Can be "r", "g", "b", "a", "rgb" or any swizzled combination.
  * @property {pc.Vec2} lightMapTiling Controls the 2D tiling of the lightmap.
  * @property {pc.Vec2} lightMapOffset Controls the 2D offset of the lightmap. Each component is between 0 and 1.
  * @property {Boolean} lightVertexColor Use baked vertex lighting. If lightMap is set, it'll be multiplied by vertex colors.
  * @property {String} lightVertexColorChannel Vertex color channels to use for baked lighting. Can be "r", "g", "b", "a", "rgb" or any swizzled combination.
  *
  * @property {Boolean} ambientTint Enables scene ambient multiplication by material ambient color.
  * @property {pc.Texture|Null} aoMap Baked ambient occlusion (AO) map (default is null). Modulates ambient color.
  * @property {Number} aoMapUv AO map UV channel
  * @property {String} aoMapChannel Color channel of the AO map to use. Can be "r", "g", "b" or "a".
  * @property {pc.Vec2} aoMapTiling Controls the 2D tiling of the AO map.
  * @property {pc.Vec2} aoMapOffset Controls the 2D offset of the AO map. Each component is between 0 and 1.
  * @property {Boolean} aoVertexColor Use mesh vertex colors for AO. If aoMap is set, it'll be multiplied by vertex colors.
  * @property {String} aoVertexColorChannel Vertex color channels to use for AO. Can be "r", "g", "b" or "a".
  * @property {Number} occludeSpecular Uses ambient occlusion to darken specular/reflection. It's a hack, because real specular occlusion is view-dependent. However, it can be better than nothing.
  * <ul>
  *     <li>{@link pc.SPECOCC_NONE}: No specular occlusion</li>
  *     <li>{@link pc.SPECOCC_AO}: Use AO directly to occlude specular.</li>
  *     <li>{@link pc.SPECOCC_GLOSSDEPENDENT}: Modify AO based on material glossiness/view angle to occlude specular.</li>
  * </ul>
  * @property {Number} occludeSpecularIntensity Controls visibility of specular occlusion.
  * @property {Number} occludeDirect Tells if AO should darken directional lighting.
  *
  * @property {Boolean} specularAntialias Enables Toksvig AA for mipmapped normal maps with specular.
  * @property {Boolean} conserveEnergy Defines how diffuse and specular components are combined when Fresnel is on.
  * It is recommended that you leave this option enabled, although you may want to disable it in case when all reflection comes only from a few light sources, and you don't use an environment map, therefore having mostly black reflection.
  * @property {Number} shadingModel Defines the shading model.
  * <ul>
  *     <li>{@link pc.SPECULAR_PHONG}: Phong without energy conservation. You should only use it as a backwards compatibility with older projects.</li>
  *     <li>{@link pc.SPECULAR_BLINN}: Energy-conserving Blinn-Phong.</li>
  * </ul>
  * @property {Number} fresnelModel Defines the formula used for Fresnel effect.
  * As a side-effect, enabling any Fresnel model changes the way diffuse and reflection components are combined.
  * When Fresnel is off, legacy non energy-conserving combining is used. When it is on, combining behaviour is defined by conserveEnergy parameter.
  * <ul>
  *     <li>{@link pc.FRESNEL_NONE}: No Fresnel.</li>
  *     <li>{@link pc.FRESNEL_SCHLICK}: Schlick's approximation of Fresnel (recommended). Parameterized by specular color.</li>
  * </ul>
  * @property {Boolean} useFog Apply fogging (as configured in scene settings)
  * @property {Boolean} useLighting Apply lighting
  * @property {Boolean} useSkybox Apply scene skybox as prefiltered environment map
  * @property {Boolean} useGammaTonemap Apply gamma correction and tonemapping (as configured in scene settings)
  * @property {Boolean} pixelSnap Align vertices to pixel co-ordinates when rendering. Useful for pixel perfect 2D graphics
  * @property {Boolean} twoSidedLighting Calculate proper normals (and therefore lighting) on backfaces
  * @property {Object} chunks Object containing custom shader chunks that will replace default ones.
  *
  * @property {pc.callbacks.UpdateShader} onUpdateShader A custom function that will be called after all shader generator properties are collected and before shader code is generated.
  * This function will receive an object with shader generator settings (based on current material and scene properties), that you can change and then return.
  * Returned value will be used instead. This is mostly useful when rendering the same set of objects, but with different shader variations based on the same material.
  * For example, you may wish to render a depth or normal pass using textures assigned to the material, a reflection pass with simpler shaders and so on.
  * Properties of the object passed into this function are:
  * <ul>
  *     <li>pass: value of {@link pc.Layer#shaderPass} of the Layer being rendered.</li>
  *     <li>chunks: Object containing custom shader chunks that will replace default ones.</li>
  *     <li>customFragmentShader: Completely replace fragment shader with this code.</li>
  *     <li>forceUv1: if UV1 (second set of texture coordinates) is required in the shader. Will be declared as "vUv1" and passed to the fragment shader.</li>
  *     <li>fog: the type of fog being applied in the shader. See {@link pc.Scene#fog} for the list of possible values.</li>
  *     <li>gamma: the type of gamma correction being applied in the shader. See {@link pc.Scene#gammaCorrection} for the list of possible values.</li>
  *     <li>toneMap: the type of tone mapping being applied in the shader. See {@link pc.Scene#toneMapping} for the list of possible values.</li>
  *     <li>ambientTint: the value of {@link pc.StandardMaterial#ambientTint}.</li>
  *     <li>specularAntialias: the value of {@link pc.StandardMaterial#specularAntialias}.</li>
  *     <li>conserveEnergy: the value of {@link pc.StandardMaterial#conserveEnergy}.</li>
  *     <li>occludeSpecular: the value of {@link pc.StandardMaterial#occludeSpecular}.</li>
  *     <li>occludeDirect: the value of {@link pc.StandardMaterial#occludeDirect}.</li>
  *     <li>shadingModel: the value of {@link pc.StandardMaterial#shadingModel}.</li>
  *     <li>fresnelModel: the value of {@link pc.StandardMaterial#fresnelModel}.</li>
  *     <li>cubeMapProjection: the value of {@link pc.StandardMaterial#cubeMapProjection}.</li>
  *     <li>useMetalness: the value of {@link pc.StandardMaterial#useMetalness}.</li>
  *     <li>blendType: the value of {@link pc.Material#blendType}.</li>
  *     <li>twoSidedLighting: the value of {@link pc.Material#twoSidedLighting}.</li>
  *     <li>diffuseTint: defines if {@link pc.StandardMaterial#diffuse} constant should affect diffuse color.</li>
  *     <li>specularTint: defines if {@link pc.StandardMaterial#specular} constant should affect specular color.</li>
  *     <li>metalnessTint: defines if {@link pc.StandardMaterial#metalness} constant should affect metalness value.</li>
  *     <li>glossTint: defines if {@link pc.StandardMaterial#shininess} constant should affect glossiness value.</li>
  *     <li>emissiveTint: defines if {@link pc.StandardMaterial#emissive} constant should affect emission value.</li>
  *     <li>opacityTint: defines if {@link pc.StandardMaterial#opacity} constant should affect opacity value.</li>
  *     <li>occludeSpecularFloat: defines if {@link pc.StandardMaterial#occludeSpecularIntensity} constant should affect specular occlusion.</li>
  *     <li>alphaTest: enable alpha testing. See {@link pc.Material#alphaTest}.</li>
  *     <li>alphaToCoverage: enable alpha to coverage. See {@link pc.Material#alphaToCoverage}.</li>
  *     <li>sphereMap: if {@link pc.StandardMaterial#sphereMap} is used.</li>
  *     <li>cubeMap: if {@link pc.StandardMaterial#cubeMap} is used.</li>
  *     <li>dpAtlas: if dual-paraboloid reflection is used. Dual paraboloid reflections replace prefiltered cubemaps on certain platform (mostly Android) for performance reasons.</li>
  *     <li>ambientSH: if ambient spherical harmonics are used. Ambient SH replace prefiltered cubemap ambient on certain platform (mostly Android) for performance reasons.</li>
  *     <li>useSpecular: if any specular or reflections are needed at all.</li>
  *     <li>rgbmAmbient: if ambient cubemap or spherical harmonics are RGBM-encoded.</li>
  *     <li>hdrAmbient: if ambient cubemap or spherical harmonics are plain float HDR data.</li>
  *     <li>rgbmReflection: if reflection cubemap or dual paraboloid are RGBM-encoded.</li>
  *     <li>hdrReflection: if reflection cubemap or dual paraboloid are plain float HDR data.</li>
  *     <li>fixSeams: if cubemaps require seam fixing (see {@link pc.Texture#options.fixCubemapSeams}).</li>
  *     <li>prefilteredCubemap: if prefiltered cubemaps are used.</li>
  *     <li>emissiveFormat: how emissiveMap must be sampled. This value is based on {@link pc.Texture#options.rgbm} and {@link pc.Texture#options.format}. Possible values are:</li>
  *     <ul>
  *          <li>0: sRGB texture</li>
  *          <li>1: RGBM-encoded HDR texture</li>
  *          <li>2: Simple read (no conversion from sRGB)</li>
  *     </ul>
  *     <li>lightMapFormat: how lightMap must be sampled. This value is based on {@link pc.Texture#options.rgbm} and {@link pc.Texture#options.format}. Possible values are:</li>
  *     <ul>
  *          <li>0: sRGB texture</li>
  *          <li>1: RGBM-encoded HDR texture</li>
  *          <li>2: Simple read (no conversion from sRGB)</li>
  *     </ul>
  *     <li>useRgbm: if decodeRGBM() function is needed in the shader at all.</li>
  *     <li>packedNormal: if normal map contains X in RGB, Y in Alpha, and Z must be reconstructed.</li>
  *     <li>forceFragmentPrecision: Override fragment shader numeric precision. Can be "lowp", "mediump", "highp" or null to use default.</li>
  *     <li>fastTbn: Use slightly cheaper normal mapping code (skip tangent space normalization). Can look buggy sometimes.</li>
  *     <li>refraction: if refraction is used.</li>
  *     <li>skyboxIntensity: if reflected skybox intensity should be modulated.</li>
  *     <li>useTexCubeLod: if textureCubeLodEXT function should be used to read prefiltered cubemaps. Usually true of iOS, false on other devices due to quality/performance balance.</li>
  * </ul>
  *
  * @example
  * // Create a new Standard material
  * var material = new pc.StandardMaterial();
  *
  * // Update the material's diffuse and specular properties
  * material.diffuse.set(1, 0, 0);
  * material.specular.set(1, 1, 1);
  *
  * // Notify the material that it has been modified
  * material.update();
  */
@JSGlobal("pc.StandardMaterial")
@js.native
class StandardMaterial () extends Material {
  /**
    * The ambient color of the material. This color value is 3-component (RGB),
    * where each component is between 0 and 1.
    */
  var ambient: Color = js.native
  /**
    * Enables scene ambient multiplication by material ambient color.
    */
  var ambientTint: Boolean = js.native
  /**
    * Baked ambient occlusion (AO) map (default is null). Modulates ambient color.
    */
  var aoMap: Texture | Null = js.native
  /**
    * Color channel of the AO map to use. Can be "r", "g", "b" or "a".
    */
  var aoMapChannel: String = js.native
  /**
    * Controls the 2D offset of the AO map. Each component is between 0 and 1.
    */
  var aoMapOffset: Vec2 = js.native
  /**
    * Controls the 2D tiling of the AO map.
    */
  var aoMapTiling: Vec2 = js.native
  /**
    * AO map UV channel
    */
  var aoMapUv: Double = js.native
  /**
    * Use mesh vertex colors for AO. If aoMap is set, it'll be multiplied by vertex colors.
    */
  var aoVertexColor: Boolean = js.native
  /**
    * Vertex color channels to use for AO. Can be "r", "g", "b" or "a".
    */
  var aoVertexColorChannel: String = js.native
  /**
    * The bumpiness of the material. This value scales the assigned normal map.
    * It should be normally between 0 (no bump mapping) and 1 (full bump mapping), but can be set to e.g. 2 to give even more pronounced bump effect.
    */
  var bumpiness: Double = js.native
  /**
    * Object containing custom shader chunks that will replace default ones.
    */
  var chunks: js.Any = js.native
  /**
    * Defines how diffuse and specular components are combined when Fresnel is on.
    * It is recommended that you leave this option enabled, although you may want to disable it in case when all reflection comes only from a few light sources, and you don't use an environment map, therefore having mostly black reflection.
    */
  var conserveEnergy: Boolean = js.native
  /**
    * The cubic environment map of the material (default is null). Overrides sphereMap. Affects reflections. If cubemap is prefiltered, will also affect ambient color.
    */
  var cubeMap: Texture | Null = js.native
  /**
    * The type of projection applied to the cubeMap property:
    * <ul>
    * <li>{@link pc.CUBEPROJ_NONE}: The cube map is treated as if it is infinitely far away.</li>
    * <li>{@link pc.CUBEPROJ_BOX}: Box-projection based on a world space axis-aligned bounding box.</li>
    * </ul>
    * Defaults to pc.CUBEPROJ_NONE.
    */
  var cubeMapProjection: Double = js.native
  /**
    * The world space axis-aligned bounding box defining the
    * box-projection used for the cubeMap property. Only used when cubeMapProjection is set to pc.CUBEPROJ_BOX.
    */
  var cubeMapProjectionBox: BoundingBox = js.native
  /**
    * The diffuse color of the material. This color value is 3-component (RGB),
    * where each component is between 0 and 1.
    * Defines basic surface color (aka albedo).
    */
  var diffuse: Color = js.native
  /**
    * The diffuse map of the material (default is null).
    */
  var diffuseMap: Texture | Null = js.native
  /**
    * Color channels of the diffuse map to use. Can be "r", "g", "b", "a", "rgb" or any swizzled combination.
    */
  var diffuseMapChannel: String = js.native
  /**
    * Controls the 2D offset of the diffuse map. Each component is between 0 and 1.
    */
  var diffuseMapOffset: Vec2 = js.native
  /**
    * Controls the 2D tiling of the diffuse map.
    */
  var diffuseMapTiling: Vec2 = js.native
  /**
    * Diffuse map UV channel
    */
  var diffuseMapUv: Double = js.native
  /**
    * Multiply diffuse map and/or diffuse vertex color by the constant diffuse value.
    */
  var diffuseTint: Boolean = js.native
  /**
    * Use mesh vertex colors for diffuse. If diffuseMap or are diffuseTint are set, they'll be multiplied by vertex colors.
    */
  var diffuseVertexColor: Boolean = js.native
  /**
    * Vertex color channels to use for diffuse. Can be "r", "g", "b", "a", "rgb" or any swizzled combination.
    */
  var diffuseVertexColorChannel: String = js.native
  /**
    * The emissive color of the material. This color value is 3-component (RGB),
    * where each component is between 0 and 1.
    */
  var emissive: Color = js.native
  /**
    * Emissive color multiplier.
    */
  var emissiveIntensity: Double = js.native
  /**
    * The emissive map of the material (default is null). Can be HDR.
    */
  var emissiveMap: Texture | Null = js.native
  /**
    * Color channels of the emissive map to use. Can be "r", "g", "b", "a", "rgb" or any swizzled combination.
    */
  var emissiveMapChannel: String = js.native
  /**
    * Controls the 2D offset of the emissive map. Each component is between 0 and 1.
    */
  var emissiveMapOffset: Vec2 = js.native
  /**
    * Controls the 2D tiling of the emissive map.
    */
  var emissiveMapTiling: Vec2 = js.native
  /**
    * Emissive map UV channel.
    */
  var emissiveMapUv: Double = js.native
  /**
    * Multiply emissive map and/or emissive vertex color by the constant emissive value.
    */
  var emissiveTint: Boolean = js.native
  /**
    * Use mesh vertex colors for emission. If emissiveMap or emissiveTint are set, they'll be multiplied by vertex colors.
    */
  var emissiveVertexColor: Boolean = js.native
  /**
    * Vertex color channels to use for emission. Can be "r", "g", "b", "a", "rgb" or any swizzled combination.
    */
  var emissiveVertexColorChannel: String = js.native
  /**
    * Defines the formula used for Fresnel effect.
    * As a side-effect, enabling any Fresnel model changes the way diffuse and reflection components are combined.
    * When Fresnel is off, legacy non energy-conserving combining is used. When it is on, combining behaviour is defined by conserveEnergy parameter.
    * <ul>
    * <li>{@link pc.FRESNEL_NONE}: No Fresnel.</li>
    * <li>{@link pc.FRESNEL_SCHLICK}: Schlick's approximation of Fresnel (recommended). Parameterized by specular color.</li>
    * </ul>
    */
  var fresnelModel: Double = js.native
  /**
    * Glossiness map (default is null). If specified, will be multiplied by normalized 'shininess' value and/or vertex colors.
    */
  var glossMap: Texture | Null = js.native
  /**
    * Color channel of the gloss map to use. Can be "r", "g", "b" or "a".
    */
  var glossMapChannel: String = js.native
  /**
    * Controls the 2D offset of the gloss map. Each component is between 0 and 1.
    */
  var glossMapOffset: Vec2 = js.native
  /**
    * Controls the 2D tiling of the gloss map.
    */
  var glossMapTiling: Vec2 = js.native
  /**
    * Gloss map UV channel
    */
  var glossMapUv: Double = js.native
  /**
    * Use mesh vertex colors for glossiness. If glossMap is set, it'll be multiplied by vertex colors.
    */
  var glossVertexColor: Boolean = js.native
  /**
    * Vertex color channel to use for glossiness. Can be "r", "g", "b" or "a".
    */
  var glossVertexColorChannel: String = js.native
  /**
    * The height map of the material (default is null). Used for a view-dependent parallax effect.
    * The texture must represent the height of the surface where darker pixels are lower and lighter pixels are higher.
    * It is recommended to use it together with a normal map.
    */
  var heightMap: Texture | Null = js.native
  /**
    * Color channel of the height map to use. Can be "r", "g", "b" or "a".
    */
  var heightMapChannel: String = js.native
  /**
    * Height map multiplier. Affects the strength of the parallax effect.
    */
  var heightMapFactor: Double = js.native
  /**
    * Controls the 2D offset of the height map. Each component is between 0 and 1.
    */
  var heightMapOffset: Vec2 = js.native
  /**
    * Controls the 2D tiling of the height map.
    */
  var heightMapTiling: Vec2 = js.native
  /**
    * Height map UV channel
    */
  var heightMapUv: Double = js.native
  /**
    * A custom lightmap of the material (default is null). Lightmaps are textures that contain pre-rendered lighting. Can be HDR.
    */
  var lightMap: Texture | Null = js.native
  /**
    * Color channels of the lightmap to use. Can be "r", "g", "b", "a", "rgb" or any swizzled combination.
    */
  var lightMapChannel: String = js.native
  /**
    * Controls the 2D offset of the lightmap. Each component is between 0 and 1.
    */
  var lightMapOffset: Vec2 = js.native
  /**
    * Controls the 2D tiling of the lightmap.
    */
  var lightMapTiling: Vec2 = js.native
  /**
    * Lightmap UV channel
    */
  var lightMapUv: Double = js.native
  /**
    * Use baked vertex lighting. If lightMap is set, it'll be multiplied by vertex colors.
    */
  var lightVertexColor: Boolean = js.native
  /**
    * Vertex color channels to use for baked lighting. Can be "r", "g", "b", "a", "rgb" or any swizzled combination.
    */
  var lightVertexColorChannel: String = js.native
  /**
    * Defines how much the surface is metallic. From 0 (dielectric) to 1 (metal).
    */
  var metalness: Double = js.native
  /**
    * Monochrome metalness map (default is null).
    */
  var metalnessMap: Texture | Null = js.native
  /**
    * Color channel of the metalness map to use. Can be "r", "g", "b" or "a".
    */
  var metalnessMapChannel: String = js.native
  /**
    * Controls the 2D offset of the metalness map. Each component is between 0 and 1.
    */
  var metalnessMapOffset: Vec2 = js.native
  /**
    * Controls the 2D tiling of the metalness map.
    */
  var metalnessMapTiling: Vec2 = js.native
  /**
    * Metalness map UV channel
    */
  var metalnessMapUv: Double = js.native
  /**
    * Use mesh vertex colors for metalness. If metalnessMap is set, it'll be multiplied by vertex colors.
    */
  var metalnessVertexColor: Boolean = js.native
  /**
    * Vertex color channel to use for metalness. Can be "r", "g", "b" or "a".
    */
  var metalnessVertexColorChannel: String = js.native
  /**
    * The normal map of the material (default is null).
    * The texture must contains normalized, tangent space normals.
    */
  var normalMap: Texture | Null = js.native
  /**
    * Controls the 2D offset of the normal map. Each component is between 0 and 1.
    */
  var normalMapOffset: Vec2 = js.native
  /**
    * Controls the 2D tiling of the normal map.
    */
  var normalMapTiling: Vec2 = js.native
  /**
    * Normal map UV channel
    */
  var normalMapUv: Double = js.native
  /**
    * Tells if AO should darken directional lighting.
    */
  var occludeDirect: Double = js.native
  /**
    * Uses ambient occlusion to darken specular/reflection. It's a hack, because real specular occlusion is view-dependent. However, it can be better than nothing.
    * <ul>
    * <li>{@link pc.SPECOCC_NONE}: No specular occlusion</li>
    * <li>{@link pc.SPECOCC_AO}: Use AO directly to occlude specular.</li>
    * <li>{@link pc.SPECOCC_GLOSSDEPENDENT}: Modify AO based on material glossiness/view angle to occlude specular.</li>
    * </ul>
    */
  var occludeSpecular: Double = js.native
  /**
    * Controls visibility of specular occlusion.
    */
  var occludeSpecularIntensity: Double = js.native
  /**
    * A custom function that will be called after all shader generator properties are collected and before shader code is generated.
    * This function will receive an object with shader generator settings (based on current material and scene properties), that you can change and then return.
    * Returned value will be used instead. This is mostly useful when rendering the same set of objects, but with different shader variations based on the same material.
    * For example, you may wish to render a depth or normal pass using textures assigned to the material, a reflection pass with simpler shaders and so on.
    * Properties of the object passed into this function are:
    * <ul>
    * <li>pass: value of {@link pc.Layer#shaderPass} of the Layer being rendered.</li>
    * <li>chunks: Object containing custom shader chunks that will replace default ones.</li>
    * <li>customFragmentShader: Completely replace fragment shader with this code.</li>
    * <li>forceUv1: if UV1 (second set of texture coordinates) is required in the shader. Will be declared as "vUv1" and passed to the fragment shader.</li>
    * <li>fog: the type of fog being applied in the shader. See {@link pc.Scene#fog} for the list of possible values.</li>
    * <li>gamma: the type of gamma correction being applied in the shader. See {@link pc.Scene#gammaCorrection} for the list of possible values.</li>
    * <li>toneMap: the type of tone mapping being applied in the shader. See {@link pc.Scene#toneMapping} for the list of possible values.</li>
    * <li>ambientTint: the value of {@link pc.StandardMaterial#ambientTint}.</li>
    * <li>specularAntialias: the value of {@link pc.StandardMaterial#specularAntialias}.</li>
    * <li>conserveEnergy: the value of {@link pc.StandardMaterial#conserveEnergy}.</li>
    * <li>occludeSpecular: the value of {@link pc.StandardMaterial#occludeSpecular}.</li>
    * <li>occludeDirect: the value of {@link pc.StandardMaterial#occludeDirect}.</li>
    * <li>shadingModel: the value of {@link pc.StandardMaterial#shadingModel}.</li>
    * <li>fresnelModel: the value of {@link pc.StandardMaterial#fresnelModel}.</li>
    * <li>cubeMapProjection: the value of {@link pc.StandardMaterial#cubeMapProjection}.</li>
    * <li>useMetalness: the value of {@link pc.StandardMaterial#useMetalness}.</li>
    * <li>blendType: the value of {@link pc.Material#blendType}.</li>
    * <li>twoSidedLighting: the value of {@link pc.Material#twoSidedLighting}.</li>
    * <li>diffuseTint: defines if {@link pc.StandardMaterial#diffuse} constant should affect diffuse color.</li>
    * <li>specularTint: defines if {@link pc.StandardMaterial#specular} constant should affect specular color.</li>
    * <li>metalnessTint: defines if {@link pc.StandardMaterial#metalness} constant should affect metalness value.</li>
    * <li>glossTint: defines if {@link pc.StandardMaterial#shininess} constant should affect glossiness value.</li>
    * <li>emissiveTint: defines if {@link pc.StandardMaterial#emissive} constant should affect emission value.</li>
    * <li>opacityTint: defines if {@link pc.StandardMaterial#opacity} constant should affect opacity value.</li>
    * <li>occludeSpecularFloat: defines if {@link pc.StandardMaterial#occludeSpecularIntensity} constant should affect specular occlusion.</li>
    * <li>alphaTest: enable alpha testing. See {@link pc.Material#alphaTest}.</li>
    * <li>alphaToCoverage: enable alpha to coverage. See {@link pc.Material#alphaToCoverage}.</li>
    * <li>sphereMap: if {@link pc.StandardMaterial#sphereMap} is used.</li>
    * <li>cubeMap: if {@link pc.StandardMaterial#cubeMap} is used.</li>
    * <li>dpAtlas: if dual-paraboloid reflection is used. Dual paraboloid reflections replace prefiltered cubemaps on certain platform (mostly Android) for performance reasons.</li>
    * <li>ambientSH: if ambient spherical harmonics are used. Ambient SH replace prefiltered cubemap ambient on certain platform (mostly Android) for performance reasons.</li>
    * <li>useSpecular: if any specular or reflections are needed at all.</li>
    * <li>rgbmAmbient: if ambient cubemap or spherical harmonics are RGBM-encoded.</li>
    * <li>hdrAmbient: if ambient cubemap or spherical harmonics are plain float HDR data.</li>
    * <li>rgbmReflection: if reflection cubemap or dual paraboloid are RGBM-encoded.</li>
    * <li>hdrReflection: if reflection cubemap or dual paraboloid are plain float HDR data.</li>
    * <li>fixSeams: if cubemaps require seam fixing (see {@link pc.Texture#options.fixCubemapSeams}).</li>
    * <li>prefilteredCubemap: if prefiltered cubemaps are used.</li>
    * <li>emissiveFormat: how emissiveMap must be sampled. This value is based on {@link pc.Texture#options.rgbm} and {@link pc.Texture#options.format}. Possible values are:</li>
    * <ul>
    * <li>0: sRGB texture</li>
    * <li>1: RGBM-encoded HDR texture</li>
    * <li>2: Simple read (no conversion from sRGB)</li>
    * </ul>
    * <li>lightMapFormat: how lightMap must be sampled. This value is based on {@link pc.Texture#options.rgbm} and {@link pc.Texture#options.format}. Possible values are:</li>
    * <ul>
    * <li>0: sRGB texture</li>
    * <li>1: RGBM-encoded HDR texture</li>
    * <li>2: Simple read (no conversion from sRGB)</li>
    * </ul>
    * <li>useRgbm: if decodeRGBM() function is needed in the shader at all.</li>
    * <li>packedNormal: if normal map contains X in RGB, Y in Alpha, and Z must be reconstructed.</li>
    * <li>forceFragmentPrecision: Override fragment shader numeric precision. Can be "lowp", "mediump", "highp" or null to use default.</li>
    * <li>fastTbn: Use slightly cheaper normal mapping code (skip tangent space normalization). Can look buggy sometimes.</li>
    * <li>refraction: if refraction is used.</li>
    * <li>skyboxIntensity: if reflected skybox intensity should be modulated.</li>
    * <li>useTexCubeLod: if textureCubeLodEXT function should be used to read prefiltered cubemaps. Usually true of iOS, false on other devices due to quality/performance balance.</li>
    * </ul>
    */
  @JSName("onUpdateShader")
  var onUpdateShader_Original: UpdateShader = js.native
  /**
    * The opacity of the material. This value can be between 0 and 1, where 0 is fully
    * transparent and 1 is fully opaque. If you want the material to be semi-transparent you also need to
    * set the {@link pc.Material#blendType} to pc.BLEND_NORMAL, pc.BLEND_ADDITIVE or any other mode.
    * Also note that for most semi-transparent objects you want {@link pc.Material#depthWrite} to be false, otherwise they can fully occlude objects behind them.
    */
  var opacity: Double = js.native
  /**
    * The opacity map of the material (default is null).
    */
  var opacityMap: Texture | Null = js.native
  /**
    * Color channel of the opacity map to use. Can be "r", "g", "b" or "a".
    */
  var opacityMapChannel: String = js.native
  /**
    * Controls the 2D offset of the opacity map. Each component is between 0 and 1.
    */
  var opacityMapOffset: Vec2 = js.native
  /**
    * Controls the 2D tiling of the opacity map.
    */
  var opacityMapTiling: Vec2 = js.native
  /**
    * Opacity map UV channel
    */
  var opacityMapUv: Double = js.native
  /**
    * Use mesh vertex colors for opacity. If opacityMap is set, it'll be multiplied by vertex colors.
    */
  var opacityVertexColor: Boolean = js.native
  /**
    * Vertex color channels to use for opacity. Can be "r", "g", "b" or "a".
    */
  var opacityVertexColorChannel: String = js.native
  /**
    * Align vertices to pixel co-ordinates when rendering. Useful for pixel perfect 2D graphics
    */
  var pixelSnap: Boolean = js.native
  /**
    * Environment map intensity.
    */
  var reflectivity: Double = js.native
  /**
    * Defines the visibility of refraction. Material can refract the same cube map as used for reflections.
    */
  var refraction: Double = js.native
  /**
    * Defines the index of refraction, i.e. the amount of distortion.
    * The value is calculated as (outerIor / surfaceIor), where inputs are measured indices of refraction, the one around the object and the one of it's own surface.
    * In most situations outer medium is air, so outerIor will be approximately 1. Then you only need to do (1.0 / surfaceIor).
    */
  var refractionIndex: Double = js.native
  /**
    * Defines the shading model.
    * <ul>
    * <li>{@link pc.SPECULAR_PHONG}: Phong without energy conservation. You should only use it as a backwards compatibility with older projects.</li>
    * <li>{@link pc.SPECULAR_BLINN}: Energy-conserving Blinn-Phong.</li>
    * </ul>
    */
  var shadingModel: Double = js.native
  /**
    * Defines glossiness of the material from 0 (rough) to 100 (shiny mirror).
    * A higher shininess value results in a more focused specular highlight.
    * Glossiness map/vertex colors are always multiplied by this value (normalized to 0 - 1 range), or it is used directly as constant output.
    */
  var shininess: Double = js.native
  /**
    * The specular color of the material. This color value is 3-component (RGB),
    * where each component is between 0 and 1.
    * Defines surface reflection/specular color. Affects specular intensity and tint.
    */
  var specular: Color = js.native
  /**
    * Enables Toksvig AA for mipmapped normal maps with specular.
    */
  var specularAntialias: Boolean = js.native
  /**
    * The specular map of the material (default is null).
    */
  var specularMap: Texture | Null = js.native
  /**
    * Color channels of the specular map to use. Can be "r", "g", "b", "a", "rgb" or any swizzled combination.
    */
  var specularMapChannel: String = js.native
  /**
    * Controls the 2D offset of the specular map. Each component is between 0 and 1.
    */
  var specularMapOffset: Vec2 = js.native
  /**
    * Controls the 2D tiling of the specular map.
    */
  var specularMapTiling: Vec2 = js.native
  /**
    * Specular map UV channel
    */
  var specularMapUv: Double = js.native
  /**
    * Multiply specular map and/or specular vertex color by the constant specular value.
    */
  var specularTint: Boolean = js.native
  /**
    * Use mesh vertex colors for specular. If specularMap or are specularTint are set, they'll be multiplied by vertex colors.
    */
  var specularVertexColor: Boolean = js.native
  /**
    * Vertex color channels to use for specular. Can be "r", "g", "b", "a", "rgb" or any swizzled combination.
    */
  var specularVertexColorChannel: String = js.native
  /**
    * The spherical environment map of the material (default is null). Affects reflections.
    */
  var sphereMap: Texture | Null = js.native
  /**
    * Calculate proper normals (and therefore lighting) on backfaces
    */
  var twoSidedLighting: Boolean = js.native
  /**
    * Apply fogging (as configured in scene settings)
    */
  var useFog: Boolean = js.native
  /**
    * Apply gamma correction and tonemapping (as configured in scene settings)
    */
  var useGammaTonemap: Boolean = js.native
  /**
    * Apply lighting
    */
  var useLighting: Boolean = js.native
  /**
    * Use metalness properties instead of specular.
    * When enabled, diffuse colors also affect specular instead of the dedicated specular map.
    * This can be used as alternative to specular color to save space.
    * With metaless == 0, the pixel is assumed to be dielectric, and diffuse color is used as normal.
    * With metaless == 1, the pixel is fully metallic, and diffuse color is used as specular color instead.
    */
  var useMetalness: Boolean = js.native
  /**
    * Apply scene skybox as prefiltered environment map
    */
  var useSkybox: Boolean = js.native
  /**
    * A custom function that will be called after all shader generator properties are collected and before shader code is generated.
    * This function will receive an object with shader generator settings (based on current material and scene properties), that you can change and then return.
    * Returned value will be used instead. This is mostly useful when rendering the same set of objects, but with different shader variations based on the same material.
    * For example, you may wish to render a depth or normal pass using textures assigned to the material, a reflection pass with simpler shaders and so on.
    * Properties of the object passed into this function are:
    * <ul>
    * <li>pass: value of {@link pc.Layer#shaderPass} of the Layer being rendered.</li>
    * <li>chunks: Object containing custom shader chunks that will replace default ones.</li>
    * <li>customFragmentShader: Completely replace fragment shader with this code.</li>
    * <li>forceUv1: if UV1 (second set of texture coordinates) is required in the shader. Will be declared as "vUv1" and passed to the fragment shader.</li>
    * <li>fog: the type of fog being applied in the shader. See {@link pc.Scene#fog} for the list of possible values.</li>
    * <li>gamma: the type of gamma correction being applied in the shader. See {@link pc.Scene#gammaCorrection} for the list of possible values.</li>
    * <li>toneMap: the type of tone mapping being applied in the shader. See {@link pc.Scene#toneMapping} for the list of possible values.</li>
    * <li>ambientTint: the value of {@link pc.StandardMaterial#ambientTint}.</li>
    * <li>specularAntialias: the value of {@link pc.StandardMaterial#specularAntialias}.</li>
    * <li>conserveEnergy: the value of {@link pc.StandardMaterial#conserveEnergy}.</li>
    * <li>occludeSpecular: the value of {@link pc.StandardMaterial#occludeSpecular}.</li>
    * <li>occludeDirect: the value of {@link pc.StandardMaterial#occludeDirect}.</li>
    * <li>shadingModel: the value of {@link pc.StandardMaterial#shadingModel}.</li>
    * <li>fresnelModel: the value of {@link pc.StandardMaterial#fresnelModel}.</li>
    * <li>cubeMapProjection: the value of {@link pc.StandardMaterial#cubeMapProjection}.</li>
    * <li>useMetalness: the value of {@link pc.StandardMaterial#useMetalness}.</li>
    * <li>blendType: the value of {@link pc.Material#blendType}.</li>
    * <li>twoSidedLighting: the value of {@link pc.Material#twoSidedLighting}.</li>
    * <li>diffuseTint: defines if {@link pc.StandardMaterial#diffuse} constant should affect diffuse color.</li>
    * <li>specularTint: defines if {@link pc.StandardMaterial#specular} constant should affect specular color.</li>
    * <li>metalnessTint: defines if {@link pc.StandardMaterial#metalness} constant should affect metalness value.</li>
    * <li>glossTint: defines if {@link pc.StandardMaterial#shininess} constant should affect glossiness value.</li>
    * <li>emissiveTint: defines if {@link pc.StandardMaterial#emissive} constant should affect emission value.</li>
    * <li>opacityTint: defines if {@link pc.StandardMaterial#opacity} constant should affect opacity value.</li>
    * <li>occludeSpecularFloat: defines if {@link pc.StandardMaterial#occludeSpecularIntensity} constant should affect specular occlusion.</li>
    * <li>alphaTest: enable alpha testing. See {@link pc.Material#alphaTest}.</li>
    * <li>alphaToCoverage: enable alpha to coverage. See {@link pc.Material#alphaToCoverage}.</li>
    * <li>sphereMap: if {@link pc.StandardMaterial#sphereMap} is used.</li>
    * <li>cubeMap: if {@link pc.StandardMaterial#cubeMap} is used.</li>
    * <li>dpAtlas: if dual-paraboloid reflection is used. Dual paraboloid reflections replace prefiltered cubemaps on certain platform (mostly Android) for performance reasons.</li>
    * <li>ambientSH: if ambient spherical harmonics are used. Ambient SH replace prefiltered cubemap ambient on certain platform (mostly Android) for performance reasons.</li>
    * <li>useSpecular: if any specular or reflections are needed at all.</li>
    * <li>rgbmAmbient: if ambient cubemap or spherical harmonics are RGBM-encoded.</li>
    * <li>hdrAmbient: if ambient cubemap or spherical harmonics are plain float HDR data.</li>
    * <li>rgbmReflection: if reflection cubemap or dual paraboloid are RGBM-encoded.</li>
    * <li>hdrReflection: if reflection cubemap or dual paraboloid are plain float HDR data.</li>
    * <li>fixSeams: if cubemaps require seam fixing (see {@link pc.Texture#options.fixCubemapSeams}).</li>
    * <li>prefilteredCubemap: if prefiltered cubemaps are used.</li>
    * <li>emissiveFormat: how emissiveMap must be sampled. This value is based on {@link pc.Texture#options.rgbm} and {@link pc.Texture#options.format}. Possible values are:</li>
    * <ul>
    * <li>0: sRGB texture</li>
    * <li>1: RGBM-encoded HDR texture</li>
    * <li>2: Simple read (no conversion from sRGB)</li>
    * </ul>
    * <li>lightMapFormat: how lightMap must be sampled. This value is based on {@link pc.Texture#options.rgbm} and {@link pc.Texture#options.format}. Possible values are:</li>
    * <ul>
    * <li>0: sRGB texture</li>
    * <li>1: RGBM-encoded HDR texture</li>
    * <li>2: Simple read (no conversion from sRGB)</li>
    * </ul>
    * <li>useRgbm: if decodeRGBM() function is needed in the shader at all.</li>
    * <li>packedNormal: if normal map contains X in RGB, Y in Alpha, and Z must be reconstructed.</li>
    * <li>forceFragmentPrecision: Override fragment shader numeric precision. Can be "lowp", "mediump", "highp" or null to use default.</li>
    * <li>fastTbn: Use slightly cheaper normal mapping code (skip tangent space normalization). Can look buggy sometimes.</li>
    * <li>refraction: if refraction is used.</li>
    * <li>skyboxIntensity: if reflected skybox intensity should be modulated.</li>
    * <li>useTexCubeLod: if textureCubeLodEXT function should be used to read prefiltered cubemaps. Usually true of iOS, false on other devices due to quality/performance balance.</li>
    * </ul>
    */
  def onUpdateShader(options: js.Any): js.Any = js.native
}

