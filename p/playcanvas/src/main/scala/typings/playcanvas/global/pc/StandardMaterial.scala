package typings.playcanvas.global.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Standard material is the main, general purpose material that is most often used for rendering.
  * It can approximate a wide variety of surface types and can simulate dynamic reflected light.
  * Most maps can use 3 types of input values in any combination: constant (color or number), mesh vertex colors and a texture. All enabled inputs are multiplied together.
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
  * @property ambient - The ambient color of the material. This color value is 3-component (RGB),
  * where each component is between 0 and 1.
  * @property diffuse - The diffuse color of the material. This color value is 3-component (RGB),
  * where each component is between 0 and 1.
  * Defines basic surface color (aka albedo).
  * @property diffuseTint - Multiply main (primary) diffuse map and/or diffuse vertex color by the constant diffuse value.
  * @property diffuseMap - The main (primary) diffuse map of the material (default is null).
  * @property diffuseMapUv - Main (primary) diffuse map UV channel.
  * @property diffuseMapTiling - Controls the 2D tiling of the main (primary) diffuse map.
  * @property diffuseMapOffset - Controls the 2D offset of the main (primary) diffuse map. Each component is between 0 and 1.
  * @property diffuseMapChannel - Color channels of the main (primary) diffuse map to use. Can be "r", "g", "b", "a", "rgb" or any swizzled combination.
  * @property diffuseVertexColor - Use mesh vertex colors for diffuse. If diffuseMap or are diffuseTint are set, they'll be multiplied by vertex colors.
  * @property diffuseVertexColorChannel - Vertex color channels to use for diffuse. Can be "r", "g", "b", "a", "rgb" or any swizzled combination.
  * @property diffuseDetailMap - The detail (secondary) diffuse map of the material (default is null). Will only be used if main (primary) diffuse map is non-null.
  * @property diffuseDetailMapUv - Detail (secondary) diffuse map UV channel.
  * @property diffuseDetailMapTiling - Controls the 2D tiling of the detail (secondary) diffuse map.
  * @property diffuseDetailMapOffset - Controls the 2D offset of the detail (secondary) diffuse map. Each component is between 0 and 1.
  * @property diffuseDetailMapChannel - Color channels of the detail (secondary) diffuse map to use. Can be "r", "g", "b", "a", "rgb" or any swizzled combination.
  * @property diffuseDetailMode - Determines how the main (primary) and detail (secondary) diffuse maps are blended together. Can be:
  * * {@link pc.DETAILMODE_MUL}: Multiply together the primary and secondary colors.
  * * {@link pc.DETAILMODE_ADD}: Add together the primary and secondary colors.
  * * {@link pc.DETAILMODE_SCREEN}: Softer version of {@link pc.DETAILMODE_ADD}.
  * * {@link pc.DETAILMODE_OVERLAY}: Multiplies or screens the colors, depending on the primary color.
  * * {@link pc.DETAILMODE_MIN}: Select whichever of the primary and secondary colors is darker, component-wise.
  * * {@link pc.DETAILMODE_MAX}: Select whichever of the primary and secondary colors is lighter, component-wise.
  * Defaults to {@link pc.DETAILMODE_MUL}.
  * @property specular - The specular color of the material. This color value is 3-component (RGB),
  * where each component is between 0 and 1.
  * Defines surface reflection/specular color. Affects specular intensity and tint.
  * @property specularTint - Multiply specular map and/or specular vertex color by the constant specular value.
  * @property specularMap - The specular map of the material (default is null).
  * @property specularMapUv - Specular map UV channel.
  * @property specularMapTiling - Controls the 2D tiling of the specular map.
  * @property specularMapOffset - Controls the 2D offset of the specular map. Each component is between 0 and 1.
  * @property specularMapChannel - Color channels of the specular map to use. Can be "r", "g", "b", "a", "rgb" or any swizzled combination.
  * @property specularVertexColor - Use mesh vertex colors for specular. If specularMap or are specularTint are set, they'll be multiplied by vertex colors.
  * @property specularVertexColorChannel - Vertex color channels to use for specular. Can be "r", "g", "b", "a", "rgb" or any swizzled combination.
  * @property enableGGXSpecular - Enables GGX specular. Also enables anisotropy parameter to set material anisotropy.
  * @property anisotropy - Defines amount of anisotropy. Requires enableGGXSpecular is set to true.
  * * When anisotropy == 0, specular is isotropic.
  * * When anisotropy < 0, anistropy direction aligns with the tangent, and specular anisotropy increases as the anisotropy value decreases to minimum of -1.
  * * When anisotropy > 0, anistropy direction aligns with the bi-normal, and specular anisotropy increases as anisotropy value increases to maximum of 1.
  * @property clearCoat - Defines intensity of clear coat layer from 0 to 1. Clear coat layer is disabled when clearCoat == 0. Default value is 0 (disabled).
  * @property clearCoatMap - Monochrome clear coat intensity map (default is null). If specified, will be multiplied by normalized 'clearCoat' value and/or vertex colors.
  * @property clearCoatMapUv - Clear coat intensity map UV channel.
  * @property clearCoatMapTiling - Controls the 2D tiling of the clear coat intensity map.
  * @property clearCoatMapOffset - Controls the 2D offset of the clear coat intensity map. Each component is between 0 and 1.
  * @property clearCoatMapChannel - Color channel of the clear coat intensity map to use. Can be "r", "g", "b" or "a".
  * @property clearCoatVertexColor - Use mesh vertex colors for clear coat intensity. If clearCoatMap is set, it'll be multiplied by vertex colors.
  * @property clearCoatVertexColorChannel - Vertex color channel to use for clear coat intensity. Can be "r", "g", "b" or "a".
  * @property clearCoatGlossiness - Defines the clear coat glossiness of the clear coat layer from 0 (rough) to 1 (mirror).
  * @property clearCoatGlossMap - Monochrome clear coat glossiness map (default is null). If specified, will be multiplied by normalized 'clearCoatGlossiness' value and/or vertex colors.
  * @property clearCoatGlossMapUv - Clear coat gloss map UV channel.
  * @property clearCoatGlossMapTiling - Controls the 2D tiling of the clear coat gloss map.
  * @property clearCoatGlossMapOffset - Controls the 2D offset of the clear coat gloss map. Each component is between 0 and 1.
  * @property clearCoatGlossMapChannel - Color channel of the clear coat gloss map to use. Can be "r", "g", "b" or "a".
  * @property clearCoatGlossVertexColor - Use mesh vertex colors for clear coat glossiness. If clearCoatGlossMap is set, it'll be multiplied by vertex colors.
  * @property clearCoatGlossVertexColorChannel - Vertex color channel to use for clear coat glossiness. Can be "r", "g", "b" or "a".
  * @property clearCoatNormalMap - The clear coat normal map of the material (default is null). The texture must contains normalized, tangent space normals.
  * @property clearCoatNormalMapUv - Clear coat normal map UV channel.
  * @property clearCoatNormalMapTiling - Controls the 2D tiling of the main clear coat normal map.
  * @property clearCoatNormalMapOffset - Controls the 2D offset of the main clear coat normal map. Each component is between 0 and 1.
  * @property clearCoatBumpiness - The bumpiness of the clear coat layer. This value scales the assigned main clear coat normal map.
  * It should be normally between 0 (no bump mapping) and 1 (full bump mapping), but can be set to e.g. 2 to give even more pronounced bump effect.
  * @property useMetalness - Use metalness properties instead of specular.
  * When enabled, diffuse colors also affect specular instead of the dedicated specular map.
  * This can be used as alternative to specular color to save space.
  * With metaless == 0, the pixel is assumed to be dielectric, and diffuse color is used as normal.
  * With metaless == 1, the pixel is fully metallic, and diffuse color is used as specular color instead.
  * @property metalness - Defines how much the surface is metallic. From 0 (dielectric) to 1 (metal).
  * @property metalnessMap - Monochrome metalness map (default is null).
  * @property metalnessMapUv - Metalness map UV channel.
  * @property metalnessMapTiling - Controls the 2D tiling of the metalness map.
  * @property metalnessMapOffset - Controls the 2D offset of the metalness map. Each component is between 0 and 1.
  * @property metalnessMapChannel - Color channel of the metalness map to use. Can be "r", "g", "b" or "a".
  * @property metalnessVertexColor - Use mesh vertex colors for metalness. If metalnessMap is set, it'll be multiplied by vertex colors.
  * @property metalnessVertexColorChannel - Vertex color channel to use for metalness. Can be "r", "g", "b" or "a".
  * @property shininess - Defines glossiness of the material from 0 (rough) to 100 (shiny mirror).
  * A higher shininess value results in a more focused specular highlight.
  * Glossiness map/vertex colors are always multiplied by this value (normalized to 0 - 1 range), or it is used directly as constant output.
  * @property glossMap - Glossiness map (default is null). If specified, will be multiplied by normalized 'shininess' value and/or vertex colors.
  * @property glossMapUv - Gloss map UV channel.
  * @property glossMapChannel - Color channel of the gloss map to use. Can be "r", "g", "b" or "a".
  * @property glossMapTiling - Controls the 2D tiling of the gloss map.
  * @property glossMapOffset - Controls the 2D offset of the gloss map. Each component is between 0 and 1.
  * @property glossVertexColor - Use mesh vertex colors for glossiness. If glossMap is set, it'll be multiplied by vertex colors.
  * @property glossVertexColorChannel - Vertex color channel to use for glossiness. Can be "r", "g", "b" or "a".
  * @property refraction - Defines the visibility of refraction. Material can refract the same cube map as used for reflections.
  * @property refractionIndex - Defines the index of refraction, i.e. The amount of distortion.
  * The value is calculated as (outerIor / surfaceIor), where inputs are measured indices of refraction, the one around the object and the one of it's own surface.
  * In most situations outer medium is air, so outerIor will be approximately 1. Then you only need to do (1.0 / surfaceIor).
  * @property emissive - The emissive color of the material. This color value is 3-component (RGB),
  * where each component is between 0 and 1.
  * @property emissiveTint - Multiply emissive map and/or emissive vertex color by the constant emissive value.
  * @property emissiveMap - The emissive map of the material (default is null). Can be HDR.
  * @property emissiveIntensity - Emissive color multiplier.
  * @property emissiveMapUv - Emissive map UV channel.
  * @property emissiveMapTiling - Controls the 2D tiling of the emissive map.
  * @property emissiveMapOffset - Controls the 2D offset of the emissive map. Each component is between 0 and 1.
  * @property emissiveMapChannel - Color channels of the emissive map to use. Can be "r", "g", "b", "a", "rgb" or any swizzled combination.
  * @property emissiveVertexColor - Use mesh vertex colors for emission. If emissiveMap or emissiveTint are set, they'll be multiplied by vertex colors.
  * @property emissiveVertexColorChannel - Vertex color channels to use for emission. Can be "r", "g", "b", "a", "rgb" or any swizzled combination.
  * @property opacity - The opacity of the material. This value can be between 0 and 1, where 0 is fully
  * transparent and 1 is fully opaque. If you want the material to be semi-transparent you also need to
  * set the {@link pc.Material#blendType} to pc.BLEND_NORMAL, pc.BLEND_ADDITIVE or any other mode.
  * Also note that for most semi-transparent objects you want {@link pc.Material#depthWrite} to be false, otherwise they can fully occlude objects behind them.
  * @property opacityMap - The opacity map of the material (default is null).
  * @property opacityMapUv - Opacity map UV channel.
  * @property opacityMapChannel - Color channel of the opacity map to use. Can be "r", "g", "b" or "a".
  * @property opacityMapTiling - Controls the 2D tiling of the opacity map.
  * @property opacityMapOffset - Controls the 2D offset of the opacity map. Each component is between 0 and 1.
  * @property opacityVertexColor - Use mesh vertex colors for opacity. If opacityMap is set, it'll be multiplied by vertex colors.
  * @property opacityVertexColorChannel - Vertex color channels to use for opacity. Can be "r", "g", "b" or "a".
  * @property opacityFadesSpecular - used to specify whether specular and reflections are faded out using {@link pc.Material#opacity}. Default is true. When set to false use {@link pc.Material#alphaFade} to fade out materials.
  * @property alphaFade - used to fade out materials when {@link pc.Material#opacityFadesSpecular} is set to false.
  * @property normalMap - The main (primary) normal map of the material (default is null).
  * The texture must contains normalized, tangent space normals.
  * @property normalMapUv - Main (primary) normal map UV channel.
  * @property normalMapTiling - Controls the 2D tiling of the main (primary) normal map.
  * @property normalMapOffset - Controls the 2D offset of the main (primary) normal map. Each component is between 0 and 1.
  * @property bumpiness - The bumpiness of the material. This value scales the assigned main (primary) normal map.
  * It should be normally between 0 (no bump mapping) and 1 (full bump mapping), but can be set to e.g. 2 to give even more pronounced bump effect.
  * @property normalDetailMap - The detail (secondary) normal map of the material (default is null). Will only be used if main (primary) normal map is non-null.
  * @property normalDetailMapUv - Detail (secondary) normal map UV channel.
  * @property normalDetailMapTiling - Controls the 2D tiling of the detail (secondary) normal map.
  * @property normalDetailMapOffset - Controls the 2D offset of the detail (secondary) normal map. Each component is between 0 and 1.
  * @property normalDetailMapBumpiness - The bumpiness of the material. This value scales the assigned detail (secondary) normal map.
  * It should be normally between 0 (no bump mapping) and 1 (full bump mapping), but can be set to e.g. 2 to give even more pronounced bump effect.
  * @property heightMap - The height map of the material (default is null). Used for a view-dependent parallax effect.
  * The texture must represent the height of the surface where darker pixels are lower and lighter pixels are higher.
  * It is recommended to use it together with a normal map.
  * @property heightMapUv - Height map UV channel.
  * @property heightMapChannel - Color channel of the height map to use. Can be "r", "g", "b" or "a".
  * @property heightMapTiling - Controls the 2D tiling of the height map.
  * @property heightMapOffset - Controls the 2D offset of the height map. Each component is between 0 and 1.
  * @property heightMapFactor - Height map multiplier. Affects the strength of the parallax effect.
  * @property sphereMap - The spherical environment map of the material (default is null). Affects reflections.
  * @property cubeMap - The cubic environment map of the material (default is null). Overrides sphereMap. Affects reflections. If cubemap is prefiltered, will also affect ambient color.
  * @property cubeMapProjection - The type of projection applied to the cubeMap property:
  * * {@link pc.CUBEPROJ_NONE}: The cube map is treated as if it is infinitely far away.
  * * {@link pc.CUBEPROJ_BOX}: Box-projection based on a world space axis-aligned bounding box.
  * Defaults to pc.CUBEPROJ_NONE.
  * @property cubeMapProjectionBox - The world space axis-aligned bounding box defining the
  * box-projection used for the cubeMap property. Only used when cubeMapProjection is set to pc.CUBEPROJ_BOX.
  * @property reflectivity - Environment map intensity.
  * @property lightMap - A custom lightmap of the material (default is null). Lightmaps are textures that contain pre-rendered lighting. Can be HDR.
  * @property lightMapUv - Lightmap UV channel
  * @property lightMapChannel - Color channels of the lightmap to use. Can be "r", "g", "b", "a", "rgb" or any swizzled combination.
  * @property lightMapTiling - Controls the 2D tiling of the lightmap.
  * @property lightMapOffset - Controls the 2D offset of the lightmap. Each component is between 0 and 1.
  * @property lightVertexColor - Use baked vertex lighting. If lightMap is set, it'll be multiplied by vertex colors.
  * @property lightVertexColorChannel - Vertex color channels to use for baked lighting. Can be "r", "g", "b", "a", "rgb" or any swizzled combination.
  * @property ambientTint - Enables scene ambient multiplication by material ambient color.
  * @property aoMap - Baked ambient occlusion (AO) map (default is null). Modulates ambient color.
  * @property aoMapUv - AO map UV channel
  * @property aoMapChannel - Color channel of the AO map to use. Can be "r", "g", "b" or "a".
  * @property aoMapTiling - Controls the 2D tiling of the AO map.
  * @property aoMapOffset - Controls the 2D offset of the AO map. Each component is between 0 and 1.
  * @property aoVertexColor - Use mesh vertex colors for AO. If aoMap is set, it'll be multiplied by vertex colors.
  * @property aoVertexColorChannel - Vertex color channels to use for AO. Can be "r", "g", "b" or "a".
  * @property occludeSpecular - Uses ambient occlusion to darken specular/reflection. It's a hack, because real specular occlusion is view-dependent. However, it can be better than nothing.
  * * {@link pc.SPECOCC_NONE}: No specular occlusion
  * * {@link pc.SPECOCC_AO}: Use AO directly to occlude specular.
  * * {@link pc.SPECOCC_GLOSSDEPENDENT}: Modify AO based on material glossiness/view angle to occlude specular.
  * @property occludeSpecularIntensity - Controls visibility of specular occlusion.
  * @property occludeDirect - Tells if AO should darken directional lighting.
  * @property specularAntialias - Enables Toksvig AA for mipmapped normal maps with specular.
  * @property conserveEnergy - Defines how diffuse and specular components are combined when Fresnel is on.
  * It is recommended that you leave this option enabled, although you may want to disable it in case when all reflection comes only from a few light sources, and you don't use an environment map, therefore having mostly black reflection.
  * @property shadingModel - Defines the shading model.
  * * {@link pc.SPECULAR_PHONG}: Phong without energy conservation. You should only use it as a backwards compatibility with older projects.
  * * {@link pc.SPECULAR_BLINN}: Energy-conserving Blinn-Phong.
  * @property fresnelModel - Defines the formula used for Fresnel effect.
  * As a side-effect, enabling any Fresnel model changes the way diffuse and reflection components are combined.
  * When Fresnel is off, legacy non energy-conserving combining is used. When it is on, combining behavior is defined by conserveEnergy parameter.
  * * {@link pc.FRESNEL_NONE}: No Fresnel.
  * * {@link pc.FRESNEL_SCHLICK}: Schlick's approximation of Fresnel (recommended). Parameterized by specular color.
  * @property useFog - Apply fogging (as configured in scene settings)
  * @property useLighting - Apply lighting
  * @property useSkybox - Apply scene skybox as prefiltered environment map
  * @property useGammaTonemap - Apply gamma correction and tonemapping (as configured in scene settings)
  * @property pixelSnap - Align vertices to pixel co-ordinates when rendering. Useful for pixel perfect 2D graphics
  * @property twoSidedLighting - Calculate proper normals (and therefore lighting) on backfaces
  * @property chunks - Object containing custom shader chunks that will replace default ones.
  * @property onUpdateShader - A custom function that will be called after all shader generator properties are collected and before shader code is generated.
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
  * * opacityFadesSpecular: enable specular fade. See {@link pc.Material#opacityFadesSpecular}.
  * * alphaFade: fade value. See {@link pc.Material#alphaFade}.
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
  *   * 0: sRGB texture
  *   * 1: RGBM-encoded HDR texture
  *   * 2: Simple read (no conversion from sRGB)
  * * lightMapFormat: how lightMap must be sampled. This value is based on {@link pc.Texture#options.rgbm} and {@link pc.Texture#options.format}. Possible values are:
  *   * 0: sRGB texture
  *   * 1: RGBM-encoded HDR texture
  *   * 2: Simple read (no conversion from sRGB)
  * * useRgbm: if decodeRGBM() function is needed in the shader at all.
  * * packedNormal: if normal map contains X in RGB, Y in Alpha, and Z must be reconstructed.
  * * forceFragmentPrecision: Override fragment shader numeric precision. Can be "lowp", "mediump", "highp" or null to use default.
  * * fastTbn: Use slightly cheaper normal mapping code (skip tangent space normalization). Can look buggy sometimes.
  * * refraction: if refraction is used.
  * * skyboxIntensity: if reflected skybox intensity should be modulated.
  * * useCubeMapRotation: if cube map rotation is enabled.
  * * useRightHandedCubeMap: if the cube map uses a right-handed coordinate system. The convention for pre-generated cubemaps is left-handed.
  * * useTexCubeLod: if textureCubeLodEXT function should be used to read prefiltered cubemaps. Usually true of iOS, false on other devices due to quality/performance balance.
  * * useInstancing: if hardware instancing compatible shader should be generated. Transform is read from per-instance {@link pc.VertexBuffer} instead of shader's uniforms.
  * * useMorphPosition: if morphing code should be generated to morph positions.
  * * useMorphNormal: if morphing code should be generated to morph normals.
  */
@JSGlobal("pc.StandardMaterial")
@js.native
class StandardMaterial ()
  extends typings.playcanvas.pc.StandardMaterial
