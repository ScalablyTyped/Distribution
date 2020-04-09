package typings.playcanvas.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  * @name pc.StandardMaterial
  * @augments pc.Material
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
  * @property {boolean} diffuseTint Multiply diffuse map and/or diffuse vertex color by the constant diffuse value.
  * @property {pc.Texture|null} diffuseMap The diffuse map of the material (default is null).
  * @property {number} diffuseMapUv Diffuse map UV channel.
  * @property {pc.Vec2} diffuseMapTiling Controls the 2D tiling of the diffuse map.
  * @property {pc.Vec2} diffuseMapOffset Controls the 2D offset of the diffuse map. Each component is between 0 and 1.
  * @property {string} diffuseMapChannel Color channels of the diffuse map to use. Can be "r", "g", "b", "a", "rgb" or any swizzled combination.
  * @property {boolean} diffuseVertexColor Use mesh vertex colors for diffuse. If diffuseMap or are diffuseTint are set, they'll be multiplied by vertex colors.
  * @property {string} diffuseVertexColorChannel Vertex color channels to use for diffuse. Can be "r", "g", "b", "a", "rgb" or any swizzled combination.
  *
  * @property {pc.Color} specular The specular color of the material. This color value is 3-component (RGB),
  * where each component is between 0 and 1.
  * Defines surface reflection/specular color. Affects specular intensity and tint.
  * @property {boolean} specularTint Multiply specular map and/or specular vertex color by the constant specular value.
  * @property {pc.Texture|null} specularMap The specular map of the material (default is null).
  * @property {number} specularMapUv Specular map UV channel.
  * @property {pc.Vec2} specularMapTiling Controls the 2D tiling of the specular map.
  * @property {pc.Vec2} specularMapOffset Controls the 2D offset of the specular map. Each component is between 0 and 1.
  * @property {string} specularMapChannel Color channels of the specular map to use. Can be "r", "g", "b", "a", "rgb" or any swizzled combination.
  * @property {boolean} specularVertexColor Use mesh vertex colors for specular. If specularMap or are specularTint are set, they'll be multiplied by vertex colors.
  * @property {string} specularVertexColorChannel Vertex color channels to use for specular. Can be "r", "g", "b", "a", "rgb" or any swizzled combination.
  *
  * @property {boolean} enableGGXSpecular Enables GGX specular. Also enables anisotropy parameter to set material anisotropy.
  * @property {number} anisotropy Defines amount of anisotropy. Requires enableGGXSpecular is set to true.
  * * When anisotropy == 0, specular is isotropic.
  * * When anisotropy < 0, anistropy direction aligns with the tangent, and specular anisotropy increases as the anisotropy value decreases to minimum of -1.
  * * When anisotropy > 0, anistropy direction aligns with the bi-normal, and specular anisotropy increases as anisotropy value increases to maximum of 1.
  *
  * @property {boolean} useMetalness Use metalness properties instead of specular.
  * When enabled, diffuse colors also affect specular instead of the dedicated specular map.
  * This can be used as alternative to specular color to save space.
  * With metaless == 0, the pixel is assumed to be dielectric, and diffuse color is used as normal.
  * With metaless == 1, the pixel is fully metallic, and diffuse color is used as specular color instead.
  * @property {number} metalness Defines how much the surface is metallic. From 0 (dielectric) to 1 (metal).
  * @property {pc.Texture|null} metalnessMap Monochrome metalness map (default is null).
  * @property {number} metalnessMapUv Metalness map UV channel.
  * @property {pc.Vec2} metalnessMapTiling Controls the 2D tiling of the metalness map.
  * @property {pc.Vec2} metalnessMapOffset Controls the 2D offset of the metalness map. Each component is between 0 and 1.
  * @property {string} metalnessMapChannel Color channel of the metalness map to use. Can be "r", "g", "b" or "a".
  * @property {boolean} metalnessVertexColor Use mesh vertex colors for metalness. If metalnessMap is set, it'll be multiplied by vertex colors.
  * @property {string} metalnessVertexColorChannel Vertex color channel to use for metalness. Can be "r", "g", "b" or "a".
  *
  * @property {number} shininess Defines glossiness of the material from 0 (rough) to 100 (shiny mirror).
  * A higher shininess value results in a more focused specular highlight.
  * Glossiness map/vertex colors are always multiplied by this value (normalized to 0 - 1 range), or it is used directly as constant output.
  * @property {pc.Texture|null} glossMap Glossiness map (default is null). If specified, will be multiplied by normalized 'shininess' value and/or vertex colors.
  * @property {number} glossMapUv Gloss map UV channel.
  * @property {string} glossMapChannel Color channel of the gloss map to use. Can be "r", "g", "b" or "a".
  * @property {pc.Vec2} glossMapTiling Controls the 2D tiling of the gloss map.
  * @property {pc.Vec2} glossMapOffset Controls the 2D offset of the gloss map. Each component is between 0 and 1.
  * @property {boolean} glossVertexColor Use mesh vertex colors for glossiness. If glossMap is set, it'll be multiplied by vertex colors.
  * @property {string} glossVertexColorChannel Vertex color channel to use for glossiness. Can be "r", "g", "b" or "a".
  *
  * @property {number} refraction Defines the visibility of refraction. Material can refract the same cube map as used for reflections.
  * @property {number} refractionIndex Defines the index of refraction, i.e. The amount of distortion.
  * The value is calculated as (outerIor / surfaceIor), where inputs are measured indices of refraction, the one around the object and the one of it's own surface.
  * In most situations outer medium is air, so outerIor will be approximately 1. Then you only need to do (1.0 / surfaceIor).
  *
  * @property {pc.Color} emissive The emissive color of the material. This color value is 3-component (RGB),
  * where each component is between 0 and 1.
  * @property {boolean} emissiveTint Multiply emissive map and/or emissive vertex color by the constant emissive value.
  * @property {pc.Texture|null} emissiveMap The emissive map of the material (default is null). Can be HDR.
  * @property {number} emissiveIntensity Emissive color multiplier.
  * @property {number} emissiveMapUv Emissive map UV channel.
  * @property {pc.Vec2} emissiveMapTiling Controls the 2D tiling of the emissive map.
  * @property {pc.Vec2} emissiveMapOffset Controls the 2D offset of the emissive map. Each component is between 0 and 1.
  * @property {string} emissiveMapChannel Color channels of the emissive map to use. Can be "r", "g", "b", "a", "rgb" or any swizzled combination.
  * @property {boolean} emissiveVertexColor Use mesh vertex colors for emission. If emissiveMap or emissiveTint are set, they'll be multiplied by vertex colors.
  * @property {string} emissiveVertexColorChannel Vertex color channels to use for emission. Can be "r", "g", "b", "a", "rgb" or any swizzled combination.
  *
  * @property {number} opacity The opacity of the material. This value can be between 0 and 1, where 0 is fully
  * transparent and 1 is fully opaque. If you want the material to be semi-transparent you also need to
  * set the {@link pc.Material#blendType} to pc.BLEND_NORMAL, pc.BLEND_ADDITIVE or any other mode.
  * Also note that for most semi-transparent objects you want {@link pc.Material#depthWrite} to be false, otherwise they can fully occlude objects behind them.
  * @property {pc.Texture|null} opacityMap The opacity map of the material (default is null).
  * @property {number} opacityMapUv Opacity map UV channel.
  * @property {string} opacityMapChannel Color channel of the opacity map to use. Can be "r", "g", "b" or "a".
  * @property {pc.Vec2} opacityMapTiling Controls the 2D tiling of the opacity map.
  * @property {pc.Vec2} opacityMapOffset Controls the 2D offset of the opacity map. Each component is between 0 and 1.
  * @property {boolean} opacityVertexColor Use mesh vertex colors for opacity. If opacityMap is set, it'll be multiplied by vertex colors.
  * @property {string} opacityVertexColorChannel Vertex color channels to use for opacity. Can be "r", "g", "b" or "a".
  *
  * @property {pc.Texture|null} normalMap The normal map of the material (default is null).
  * The texture must contains normalized, tangent space normals.
  * @property {number} normalMapUv Normal map UV channel.
  * @property {pc.Vec2} normalMapTiling Controls the 2D tiling of the normal map.
  * @property {pc.Vec2} normalMapOffset Controls the 2D offset of the normal map. Each component is between 0 and 1.
  * @property {number} bumpiness The bumpiness of the material. This value scales the assigned normal map.
  * It should be normally between 0 (no bump mapping) and 1 (full bump mapping), but can be set to e.g. 2 to give even more pronounced bump effect.
  *
  * @property {pc.Texture|null} heightMap The height map of the material (default is null). Used for a view-dependent parallax effect.
  * The texture must represent the height of the surface where darker pixels are lower and lighter pixels are higher.
  * It is recommended to use it together with a normal map.
  * @property {number} heightMapUv Height map UV channel.
  * @property {string} heightMapChannel Color channel of the height map to use. Can be "r", "g", "b" or "a".
  * @property {pc.Vec2} heightMapTiling Controls the 2D tiling of the height map.
  * @property {pc.Vec2} heightMapOffset Controls the 2D offset of the height map. Each component is between 0 and 1.
  * @property {number} heightMapFactor Height map multiplier. Affects the strength of the parallax effect.
  *
  * @property {pc.Texture|null} sphereMap The spherical environment map of the material (default is null). Affects reflections.
  * @property {pc.Texture|null} cubeMap The cubic environment map of the material (default is null). Overrides sphereMap. Affects reflections. If cubemap is prefiltered, will also affect ambient color.
  * @property {number} cubeMapProjection The type of projection applied to the cubeMap property:
  * * {@link pc.CUBEPROJ_NONE}: The cube map is treated as if it is infinitely far away.
  * * {@link pc.CUBEPROJ_BOX}: Box-projection based on a world space axis-aligned bounding box.
  * Defaults to pc.CUBEPROJ_NONE.
  * @property {pc.BoundingBox} cubeMapProjectionBox The world space axis-aligned bounding box defining the
  * box-projection used for the cubeMap property. Only used when cubeMapProjection is set to pc.CUBEPROJ_BOX.
  * @property {number} reflectivity Environment map intensity.
  *
  * @property {pc.Texture|null} lightMap A custom lightmap of the material (default is null). Lightmaps are textures that contain pre-rendered lighting. Can be HDR.
  * @property {number} lightMapUv Lightmap UV channel
  * @property {string} lightMapChannel Color channels of the lightmap to use. Can be "r", "g", "b", "a", "rgb" or any swizzled combination.
  * @property {pc.Vec2} lightMapTiling Controls the 2D tiling of the lightmap.
  * @property {pc.Vec2} lightMapOffset Controls the 2D offset of the lightmap. Each component is between 0 and 1.
  * @property {boolean} lightVertexColor Use baked vertex lighting. If lightMap is set, it'll be multiplied by vertex colors.
  * @property {string} lightVertexColorChannel Vertex color channels to use for baked lighting. Can be "r", "g", "b", "a", "rgb" or any swizzled combination.
  *
  * @property {boolean} ambientTint Enables scene ambient multiplication by material ambient color.
  * @property {pc.Texture|null} aoMap Baked ambient occlusion (AO) map (default is null). Modulates ambient color.
  * @property {number} aoMapUv AO map UV channel
  * @property {string} aoMapChannel Color channel of the AO map to use. Can be "r", "g", "b" or "a".
  * @property {pc.Vec2} aoMapTiling Controls the 2D tiling of the AO map.
  * @property {pc.Vec2} aoMapOffset Controls the 2D offset of the AO map. Each component is between 0 and 1.
  * @property {boolean} aoVertexColor Use mesh vertex colors for AO. If aoMap is set, it'll be multiplied by vertex colors.
  * @property {string} aoVertexColorChannel Vertex color channels to use for AO. Can be "r", "g", "b" or "a".
  * @property {number} occludeSpecular Uses ambient occlusion to darken specular/reflection. It's a hack, because real specular occlusion is view-dependent. However, it can be better than nothing.
  * * {@link pc.SPECOCC_NONE}: No specular occlusion
  * * {@link pc.SPECOCC_AO}: Use AO directly to occlude specular.
  * * {@link pc.SPECOCC_GLOSSDEPENDENT}: Modify AO based on material glossiness/view angle to occlude specular.
  * @property {number} occludeSpecularIntensity Controls visibility of specular occlusion.
  * @property {number} occludeDirect Tells if AO should darken directional lighting.
  *
  * @property {boolean} specularAntialias Enables Toksvig AA for mipmapped normal maps with specular.
  * @property {boolean} conserveEnergy Defines how diffuse and specular components are combined when Fresnel is on.
  * It is recommended that you leave this option enabled, although you may want to disable it in case when all reflection comes only from a few light sources, and you don't use an environment map, therefore having mostly black reflection.
  * @property {number} shadingModel Defines the shading model.
  * * {@link pc.SPECULAR_PHONG}: Phong without energy conservation. You should only use it as a backwards compatibility with older projects.
  * * {@link pc.SPECULAR_BLINN}: Energy-conserving Blinn-Phong.
  * @property {number} fresnelModel Defines the formula used for Fresnel effect.
  * As a side-effect, enabling any Fresnel model changes the way diffuse and reflection components are combined.
  * When Fresnel is off, legacy non energy-conserving combining is used. When it is on, combining behaviour is defined by conserveEnergy parameter.
  * * {@link pc.FRESNEL_NONE}: No Fresnel.
  * * {@link pc.FRESNEL_SCHLICK}: Schlick's approximation of Fresnel (recommended). Parameterized by specular color.
  * @property {boolean} useFog Apply fogging (as configured in scene settings)
  * @property {boolean} useLighting Apply lighting
  * @property {boolean} useSkybox Apply scene skybox as prefiltered environment map
  * @property {boolean} useGammaTonemap Apply gamma correction and tonemapping (as configured in scene settings)
  * @property {boolean} pixelSnap Align vertices to pixel co-ordinates when rendering. Useful for pixel perfect 2D graphics
  * @property {boolean} twoSidedLighting Calculate proper normals (and therefore lighting) on backfaces
  * @property {object} chunks Object containing custom shader chunks that will replace default ones.
  *
  * @property {pc.callbacks.UpdateShader} onUpdateShader A custom function that will be called after all shader generator properties are collected and before shader code is generated.
  * This function will receive an object with shader generator settings (based on current material and scene properties), that you can change and then return.
  * Returned value will be used instead. This is mostly useful when rendering the same set of objects, but with different shader variations based on the same material.
  * For example, you may wish to render a depth or normal pass using textures assigned to the material, a reflection pass with simpler shaders and so on.
  * Properties of the object passed into this function are:
  * * pass: value of {@link pc.Layer#shaderPass} of the Layer being rendered.
  * * chunks: Object containing custom shader chunks that will replace default ones.
  * * customFragmentShader: Completely replace fragment shader with this code.
  * * forceUv1: if UV1 (second set of texture coordinates) is required in the shader. Will be declared as "vUv1" and passed to the fragment shader.
  * * fog: the type of fog being applied in the shader. See {@link pc.Scene#fog} for the list of possible values.
  * * gamma: the type of gamma correction being applied in the shader. See {@link pc.Scene#gammaCorrection} for the list of possible values.
  * * toneMap: the type of tone mapping being applied in the shader. See {@link pc.Scene#toneMapping} for the list of possible values.
  * * ambientTint: the value of {@link pc.StandardMaterial#ambientTint}.
  * * specularAntialias: the value of {@link pc.StandardMaterial#specularAntialias}.
  * * conserveEnergy: the value of {@link pc.StandardMaterial#conserveEnergy}.
  * * occludeSpecular: the value of {@link pc.StandardMaterial#occludeSpecular}.
  * * occludeDirect: the value of {@link pc.StandardMaterial#occludeDirect}.
  * * shadingModel: the value of {@link pc.StandardMaterial#shadingModel}.
  * * fresnelModel: the value of {@link pc.StandardMaterial#fresnelModel}.
  * * cubeMapProjection: the value of {@link pc.StandardMaterial#cubeMapProjection}.
  * * useMetalness: the value of {@link pc.StandardMaterial#useMetalness}.
  * * blendType: the value of {@link pc.Material#blendType}.
  * * twoSidedLighting: the value of {@link pc.Material#twoSidedLighting}.
  * * diffuseTint: defines if {@link pc.StandardMaterial#diffuse} constant should affect diffuse color.
  * * specularTint: defines if {@link pc.StandardMaterial#specular} constant should affect specular color.
  * * metalnessTint: defines if {@link pc.StandardMaterial#metalness} constant should affect metalness value.
  * * glossTint: defines if {@link pc.StandardMaterial#shininess} constant should affect glossiness value.
  * * emissiveTint: defines if {@link pc.StandardMaterial#emissive} constant should affect emission value.
  * * opacityTint: defines if {@link pc.StandardMaterial#opacity} constant should affect opacity value.
  * * occludeSpecularFloat: defines if {@link pc.StandardMaterial#occludeSpecularIntensity} constant should affect specular occlusion.
  * * alphaTest: enable alpha testing. See {@link pc.Material#alphaTest}.
  * * alphaToCoverage: enable alpha to coverage. See {@link pc.Material#alphaToCoverage}.
  * * sphereMap: if {@link pc.StandardMaterial#sphereMap} is used.
  * * cubeMap: if {@link pc.StandardMaterial#cubeMap} is used.
  * * dpAtlas: if dual-paraboloid reflection is used. Dual paraboloid reflections replace prefiltered cubemaps on certain platform (mostly Android) for performance reasons.
  * * ambientSH: if ambient spherical harmonics are used. Ambient SH replace prefiltered cubemap ambient on certain platform (mostly Android) for performance reasons.
  * * useSpecular: if any specular or reflections are needed at all.
  * * rgbmAmbient: if ambient cubemap or spherical harmonics are RGBM-encoded.
  * * hdrAmbient: if ambient cubemap or spherical harmonics are plain float HDR data.
  * * rgbmReflection: if reflection cubemap or dual paraboloid are RGBM-encoded.
  * * hdrReflection: if reflection cubemap or dual paraboloid are plain float HDR data.
  * * fixSeams: if cubemaps require seam fixing (see {@link pc.Texture#options.fixCubemapSeams}).
  * * prefilteredCubemap: if prefiltered cubemaps are used.
  * * emissiveFormat: how emissiveMap must be sampled. This value is based on {@link pc.Texture#options.rgbm} and {@link pc.Texture#options.format}. Possible values are:
  * * 0: sRGB texture
  * * 1: RGBM-encoded HDR texture
  * * 2: Simple read (no conversion from sRGB)
  * * lightMapFormat: how lightMap must be sampled. This value is based on {@link pc.Texture#options.rgbm} and {@link pc.Texture#options.format}. Possible values are:
  * * 0: sRGB texture
  * * 1: RGBM-encoded HDR texture
  * * 2: Simple read (no conversion from sRGB)
  * * useRgbm: if decodeRGBM() function is needed in the shader at all.
  * * packedNormal: if normal map contains X in RGB, Y in Alpha, and Z must be reconstructed.
  * * forceFragmentPrecision: Override fragment shader numeric precision. Can be "lowp", "mediump", "highp" or null to use default.
  * * fastTbn: Use slightly cheaper normal mapping code (skip tangent space normalization). Can look buggy sometimes.
  * * refraction: if refraction is used.
  * * skyboxIntensity: if reflected skybox intensity should be modulated.
  * * useTexCubeLod: if textureCubeLodEXT function should be used to read prefiltered cubemaps. Usually true of iOS, false on other devices due to quality/performance balance.
  * * useInstancing: if hardware instancing compatible shader should be generated. Transform is read from per-instance {@link pc.VertexBuffer} instead of shader's uniforms.
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
@JSImport("playcanvas", "StandardMaterial")
@js.native
class StandardMaterial ()
  extends typings.playcanvas.pc.StandardMaterial

