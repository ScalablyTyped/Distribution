package typings.playcanvas.global.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Callback used by {@link StandardMaterial#onUpdateShader}.
  *
  * @callback UpdateShaderCallback
  * @param {*} options - An object with shader generator settings (based on current material and
  * scene properties), that you can change and then return. Properties of the object passed into
  * this function are documented in {@link StandardMaterial#onUpdateShader}.
  * @returns {*} Returned settings will be used by the shader.
  */
/**
  * A Standard material is the main, general purpose material that is most often used for rendering.
  * It can approximate a wide variety of surface types and can simulate dynamic reflected light.
  * Most maps can use 3 types of input values in any combination: constant (color or number), mesh
  * vertex colors and a texture. All enabled inputs are multiplied together.
  *
  * @property {Color} ambient The ambient color of the material. This color value is 3-component
  * (RGB), where each component is between 0 and 1.
  * @property {Color} diffuse The diffuse color of the material. This color value is 3-component
  * (RGB), where each component is between 0 and 1. Defines basic surface color (aka albedo).
  * @property {boolean} diffuseTint Multiply main (primary) diffuse map and/or diffuse vertex color
  * by the constant diffuse value.
  * @property {Texture|null} diffuseMap The main (primary) diffuse map of the material (default is
  * null).
  * @property {number} diffuseMapUv Main (primary) diffuse map UV channel.
  * @property {Vec2} diffuseMapTiling Controls the 2D tiling of the main (primary) diffuse map.
  * @property {Vec2} diffuseMapOffset Controls the 2D offset of the main (primary) diffuse map. Each
  * component is between 0 and 1.
  * @property {number} diffuseMapRotation Controls the 2D rotation (in degrees) of the main
  * (primary) diffuse map.
  * @property {string} diffuseMapChannel Color channels of the main (primary) diffuse map to use.
  * Can be "r", "g", "b", "a", "rgb" or any swizzled combination.
  * @property {boolean} diffuseVertexColor Use mesh vertex colors for diffuse. If diffuseMap or are
  * diffuseTint are set, they'll be multiplied by vertex colors.
  * @property {string} diffuseVertexColorChannel Vertex color channels to use for diffuse. Can be
  * "r", "g", "b", "a", "rgb" or any swizzled combination.
  * @property {Texture|null} diffuseDetailMap The detail (secondary) diffuse map of the material
  * (default is null). Will only be used if main (primary) diffuse map is non-null.
  * @property {number} diffuseDetailMapUv Detail (secondary) diffuse map UV channel.
  * @property {Vec2} diffuseDetailMapTiling Controls the 2D tiling of the detail (secondary) diffuse
  * map.
  * @property {Vec2} diffuseDetailMapOffset Controls the 2D offset of the detail (secondary) diffuse
  * map. Each component is between 0 and 1.
  * @property {number} diffuseDetailMapRotation Controls the 2D rotation (in degrees) of the main
  * (secondary) diffuse map.
  * @property {string} diffuseDetailMapChannel Color channels of the detail (secondary) diffuse map
  * to use. Can be "r", "g", "b", "a", "rgb" or any swizzled combination.
  * @property {string} diffuseDetailMode Determines how the main (primary) and detail (secondary)
  * diffuse maps are blended together. Can be:
  *
  * - {@link DETAILMODE_MUL}: Multiply together the primary and secondary colors.
  * - {@link DETAILMODE_ADD}: Add together the primary and secondary colors.
  * - {@link DETAILMODE_SCREEN}: Softer version of {@link DETAILMODE_ADD}.
  * - {@link DETAILMODE_OVERLAY}: Multiplies or screens the colors, depending on the primary color.
  * - {@link DETAILMODE_MIN}: Select whichever of the primary and secondary colors is darker,
  * component-wise.
  * - {@link DETAILMODE_MAX}: Select whichever of the primary and secondary colors is lighter,
  * component-wise.
  *
  * Defaults to {@link DETAILMODE_MUL}.
  * @property {Color} specular The specular color of the material. This color value is 3-component
  * (RGB), where each component is between 0 and 1. Defines surface reflection/specular color.
  * Affects specular intensity and tint.
  * @property {boolean} specularTint Multiply specular map and/or specular vertex color by the
  * constant specular value.
  * @property {Texture|null} specularMap The specular map of the material (default is null).
  * @property {number} specularMapUv Specular map UV channel.
  * @property {Vec2} specularMapTiling Controls the 2D tiling of the specular map.
  * @property {Vec2} specularMapOffset Controls the 2D offset of the specular map. Each component is
  * between 0 and 1.
  * @property {number} specularMapRotation Controls the 2D rotation (in degrees) of the specular map.
  * @property {string} specularMapChannel Color channels of the specular map to use. Can be "r", "g",
  * "b", "a", "rgb" or any swizzled combination.
  * @property {boolean} specularVertexColor Use mesh vertex colors for specular. If specularMap or
  * are specularTint are set, they'll be multiplied by vertex colors.
  * @property {string} specularVertexColorChannel Vertex color channels to use for specular. Can be
  * @property {boolean} specularityFactorTint Multiply specularity factor map and/or specular vertex color by the
  * constant specular value.
  * "r", "g", "b", "a", "rgb" or any swizzled combination.
  * @property {number} specularityFactor The factor of specular intensity, used to weight the fresnel and specularity. Default is 1.0.
  * @property {Texture|null} specularityFactorMap The factor of specularity as a texture (default is null).
  * @property {number} specularityFactorMapUv Specularity factor map UV channel.
  * @property {Vec2} specularityFactorMapTiling Controls the 2D tiling of the specularity factor map.
  * @property {Vec2} specularityFactorMapOffset Controls the 2D offset of the specularity factor map. Each component is
  * between 0 and 1.
  * @property {number} specularityFactorMapRotation Controls the 2D rotation (in degrees) of the specularity factor map.
  * @property {string} specularityFactorMapChannel The channel used by the specularity factor texture to sample from (default is 'a').
  * @property {boolean} specularityFactorVertexColor Use mesh vertex colors for specularity factor. If specularityFactorMap or
  * are specularityFactorTint are set, they'll be multiplied by vertex colors.
  * @property {string} specularityFactorVertexColorChannel Vertex color channels to use for specularity factor. Can be
  * "r", "g", "b", "a", "rgb" or any swizzled combination.
  * @property {boolean} enableGGXSpecular Enables GGX specular. Also enables
  * {@link StandardMaterial#anisotropy}  parameter to set material anisotropy.
  * @property {number} anisotropy Defines amount of anisotropy. Requires
  * {@link StandardMaterial#enableGGXSpecular} is set to true.
  *
  * - When anisotropy == 0, specular is isotropic.
  * - When anisotropy < 0, anisotropy direction aligns with the tangent, and specular anisotropy
  * increases as the anisotropy value decreases to minimum of -1.
  * - When anisotropy > 0, anisotropy direction aligns with the bi-normal, and specular anisotropy
  * increases as anisotropy value increases to maximum of 1.
  *
  * @property {number} clearCoat Defines intensity of clear coat layer from 0 to 1. Clear coat layer
  * is disabled when clearCoat == 0. Default value is 0 (disabled).
  * @property {Texture|null} clearCoatMap Monochrome clear coat intensity map (default is null). If
  * specified, will be multiplied by normalized 'clearCoat' value and/or vertex colors.
  * @property {number} clearCoatMapUv Clear coat intensity map UV channel.
  * @property {Vec2} clearCoatMapTiling Controls the 2D tiling of the clear coat intensity map.
  * @property {Vec2} clearCoatMapOffset Controls the 2D offset of the clear coat intensity map. Each
  * component is between 0 and 1.
  * @property {number} clearCoatMapRotation Controls the 2D rotation (in degrees) of the clear coat
  * intensity map.
  * @property {string} clearCoatMapChannel Color channel of the clear coat intensity map to use. Can
  * be "r", "g", "b" or "a".
  * @property {boolean} clearCoatVertexColor Use mesh vertex colors for clear coat intensity. If
  * clearCoatMap is set, it'll be multiplied by vertex colors.
  * @property {string} clearCoatVertexColorChannel Vertex color channel to use for clear coat
  * intensity. Can be "r", "g", "b" or "a".
  * @property {number} clearCoatGlossiness Defines the clear coat glossiness of the clear coat layer
  * from 0 (rough) to 1 (mirror).
  * @property {Texture|null} clearCoatGlossMap Monochrome clear coat glossiness map (default is
  * null). If specified, will be multiplied by normalized 'clearCoatGlossiness' value and/or vertex
  * colors.
  * @property {number} clearCoatGlossMapUv Clear coat gloss map UV channel.
  * @property {Vec2} clearCoatGlossMapTiling Controls the 2D tiling of the clear coat gloss map.
  * @property {Vec2} clearCoatGlossMapOffset Controls the 2D offset of the clear coat gloss map.
  * Each component is between 0 and 1.
  * @property {number} clearCoatGlossMapRotation Controls the 2D rotation (in degrees) of the clear
  * coat gloss map.
  * @property {string} clearCoatGlossMapChannel Color channel of the clear coat gloss map to use.
  * Can be "r", "g", "b" or "a".
  * @property {boolean} clearCoatGlossVertexColor Use mesh vertex colors for clear coat glossiness.
  * If clearCoatGlossMap is set, it'll be multiplied by vertex colors.
  * @property {string} clearCoatGlossVertexColorChannel Vertex color channel to use for clear coat
  * glossiness. Can be "r", "g", "b" or "a".
  * @property {Texture|null} clearCoatNormalMap The clear coat normal map of the material (default
  * is null). The texture must contains normalized, tangent space normals.
  * @property {number} clearCoatNormalMapUv Clear coat normal map UV channel.
  * @property {Vec2} clearCoatNormalMapTiling Controls the 2D tiling of the main clear coat normal
  * map.
  * @property {Vec2} clearCoatNormalMapOffset Controls the 2D offset of the main clear coat normal
  * map. Each component is between 0 and 1.
  * @property {number} clearCoatNormalMapRotation Controls the 2D rotation (in degrees) of the main
  * clear coat map.
  * @property {number} clearCoatBumpiness The bumpiness of the clear coat layer. This value scales
  * the assigned main clear coat normal map. It should be normally between 0 (no bump mapping) and 1
  * (full bump mapping), but can be set to e.g. 2 to give even more pronounced bump effect.
  * @property {boolean} useMetalness Use metalness properties instead of specular. When enabled,
  * diffuse colors also affect specular instead of the dedicated specular map. This can be used as
  * alternative to specular color to save space. With metaless == 0, the pixel is assumed to be
  * dielectric, and diffuse color is used as normal. With metaless == 1, the pixel is fully
  * metallic, and diffuse color is used as specular color instead.
  * @property {boolean} useMetalnessSpecularColor When metalness is enabled, use the specular map to apply color tint to specular reflections
  * at direct angles.
  * @property {number} metalness Defines how much the surface is metallic. From 0 (dielectric) to 1
  * (metal).
  * @property {Texture|null} metalnessMap Monochrome metalness map (default is null).
  * @property {number} metalnessMapUv Metalness map UV channel.
  * @property {Vec2} metalnessMapTiling Controls the 2D tiling of the metalness map.
  * @property {Vec2} metalnessMapOffset Controls the 2D offset of the metalness map. Each component
  * is between 0 and 1.
  * @property {number} metalnessMapRotation Controls the 2D rotation (in degrees) of the metalness
  * map.
  * @property {string} metalnessMapChannel Color channel of the metalness map to use. Can be "r",
  * "g", "b" or "a".
  * @property {boolean} metalnessVertexColor Use mesh vertex colors for metalness. If metalnessMap
  * is set, it'll be multiplied by vertex colors.
  * @property {string} metalnessVertexColorChannel Vertex color channel to use for metalness. Can be
  * "r", "g", "b" or "a".
  * @property {number} shininess Defines glossiness of the material from 0 (rough) to 100 (shiny
  * mirror). A higher shininess value results in a more focused specular highlight. Glossiness map/
  * vertex colors are always multiplied by this value (normalized to 0 - 1 range), or it is used
  * directly as constant output.
  * @property {Texture|null} glossMap Glossiness map (default is null). If specified, will be
  * multiplied by normalized 'shininess' value and/or vertex colors.
  * @property {number} glossMapUv Gloss map UV channel.
  * @property {string} glossMapChannel Color channel of the gloss map to use. Can be "r", "g", "b"
  * or "a".
  * @property {Vec2} glossMapTiling Controls the 2D tiling of the gloss map.
  * @property {Vec2} glossMapOffset Controls the 2D offset of the gloss map. Each component is
  * between 0 and 1.
  * @property {number} glossMapRotation Controls the 2D rotation (in degrees) of the gloss map.
  * @property {boolean} glossVertexColor Use mesh vertex colors for glossiness. If glossMap is set,
  * it'll be multiplied by vertex colors.
  * @property {string} glossVertexColorChannel Vertex color channel to use for glossiness. Can be
  * "r", "g", "b" or "a".
  * @property {number} refraction Defines the visibility of refraction. Material can refract the
  * same cube map as used for reflections.
  * @property {Texture|null} refractionMap The map of the refraction visibility.
  * @property {number} refractionMapUv Refraction map UV channel.
  * @property {Vec2} refractionMapTiling Controls the 2D tiling of the refraction map.
  * @property {Vec2} refractionMapOffset Controls the 2D offset of the refraction map. Each component is
  * between 0 and 1.
  * @property {number} refractionMapRotation Controls the 2D rotation (in degrees) of the emissive
  * map.
  * @property {string} refractionMapChannel Color channels of the refraction map to use. Can be "r",
  * "g", "b", "a", "rgb" or any swizzled combination.
  * @property {number} refractionIndex Defines the index of refraction, i.e. The amount of
  * distortion. The value is calculated as (outerIor / surfaceIor), where inputs are measured
  * indices of refraction, the one around the object and the one of its own surface. In most
  * situations outer medium is air, so outerIor will be approximately 1. Then you only need to do
  * (1.0 / surfaceIor).
  * @property {boolean} useDynamicRefraction Enables higher quality refractions using the grab pass
  * instead of pre-computed cube maps for refractions.
  * @property {Color} emissive The emissive color of the material. This color value is 3-component
  * (RGB), where each component is between 0 and 1.
  * @property {boolean} emissiveTint Multiply emissive map and/or emissive vertex color by the
  * constant emissive value.
  * @property {Texture|null} emissiveMap The emissive map of the material (default is null). Can be
  * HDR.
  * @property {number} emissiveIntensity Emissive color multiplier.
  * @property {number} emissiveMapUv Emissive map UV channel.
  * @property {Vec2} emissiveMapTiling Controls the 2D tiling of the emissive map.
  * @property {Vec2} emissiveMapOffset Controls the 2D offset of the emissive map. Each component is
  * between 0 and 1.
  * @property {number} emissiveMapRotation Controls the 2D rotation (in degrees) of the emissive
  * map.
  * @property {string} emissiveMapChannel Color channels of the emissive map to use. Can be "r",
  * "g", "b", "a", "rgb" or any swizzled combination.
  * @property {boolean} emissiveVertexColor Use mesh vertex colors for emission. If emissiveMap or
  * emissiveTint are set, they'll be multiplied by vertex colors.
  * @property {string} emissiveVertexColorChannel Vertex color channels to use for emission. Can be
  * "r", "g", "b", "a", "rgb" or any swizzled combination.
  * @property {boolean} useSheen Toggle sheen specular effect on/off.
  * @property {Color} sheen The specular color of the sheen (fabric) microfiber structure. This color value is 3-component
  * (RGB), where each component is between 0 and 1.
  * @property {boolean} sheenTint Multiply sheen map and/or sheen vertex color by the constant sheen value.
  * @property {Texture|null} sheenMap The sheen microstructure color map of the material (default is null).
  * @property {number} sheenMapUv Sheen map UV channel.
  * @property {Vec2} sheenMapTiling Controls the 2D tiling of the sheen map.
  * @property {Vec2} sheenMapOffset Controls the 2D offset of the sheen map. Each component is
  * between 0 and 1.
  * @property {number} sheenMapRotation Controls the 2D rotation (in degrees) of the sheen
  * map.
  * @property {string} sheenMapChannel Color channels of the sheen map to use. Can be "r",
  * "g", "b", "a", "rgb" or any swizzled combination.
  * @property {number} sheenGlossiness The glossiness of the sheen (fabric) microfiber structure. This color value is 3-component
  * (RGB), where each component is between 0 and 1.
  * @property {boolean} sheenGlossinessTint Multiply sheen glossiness map and/or sheen glossiness vertex value by the scalar sheen glossiness value.
  * @property {Texture|null} sheenGlossinessMap The sheen glossiness microstructure color map of the material (default is null).
  * @property {number} sheenGlossinessMapUv Sheen map UV channel.
  * @property {Vec2} sheenGlossinessMapTiling Controls the 2D tiling of the sheen glossiness map.
  * @property {Vec2} sheenGlossinessMapOffset Controls the 2D offset of the sheen glossiness map. Each component is
  * between 0 and 1.
  * @property {number} sheenGlossinessMapRotation Controls the 2D rotation (in degrees) of the sheen glossiness
  * map.
  * @property {string} sheenGlossinessMapChannel Color channels of the sheen glossiness map to use. Can be "r",
  * "g", "b", "a", "rgb" or any swizzled combination.
  * @property {number} opacity The opacity of the material. This value can be between 0 and 1, where
  * 0 is fully transparent and 1 is fully opaque. If you want the material to be semi-transparent
  * you also need to set the {@link Material#blendType} to {@link BLEND_NORMAL},
  * {@link BLEND_ADDITIVE} or any other mode. Also note that for most semi-transparent objects you
  * want {@link Material#depthWrite} to be false, otherwise they can fully occlude objects behind
  * them.
  * @property {Texture|null} opacityMap The opacity map of the material (default is null).
  * @property {number} opacityMapUv Opacity map UV channel.
  * @property {string} opacityMapChannel Color channel of the opacity map to use. Can be "r", "g",
  * "b" or "a".
  * @property {Vec2} opacityMapTiling Controls the 2D tiling of the opacity map.
  * @property {Vec2} opacityMapOffset Controls the 2D offset of the opacity map. Each component is
  * between 0 and 1.
  * @property {number} opacityMapRotation Controls the 2D rotation (in degrees) of the opacity map.
  * @property {boolean} opacityVertexColor Use mesh vertex colors for opacity. If opacityMap is set,
  * it'll be multiplied by vertex colors.
  * @property {string} opacityVertexColorChannel Vertex color channels to use for opacity. Can be
  * "r", "g", "b" or "a".
  * @property {boolean} opacityFadesSpecular used to specify whether specular and reflections are
  * faded out using {@link StandardMaterial#opacity}. Default is true. When set to false use
  * {@link Material#alphaFade} to fade out materials.
  * @property {number} alphaFade used to fade out materials when
  * {@link StandardMaterial#opacityFadesSpecular} is set to false.
  * @property {Texture|null} normalMap The main (primary) normal map of the material (default is
  * null). The texture must contains normalized, tangent space normals.
  * @property {number} normalMapUv Main (primary) normal map UV channel.
  * @property {Vec2} normalMapTiling Controls the 2D tiling of the main (primary) normal map.
  * @property {Vec2} normalMapOffset Controls the 2D offset of the main (primary) normal map. Each
  * component is between 0 and 1.
  * @property {number} normalMapRotation Controls the 2D rotation (in degrees) of the main (primary)
  * normal map.
  * @property {number} bumpiness The bumpiness of the material. This value scales the assigned main
  * (primary) normal map. It should be normally between 0 (no bump mapping) and 1 (full bump
  * mapping), but can be set to e.g. 2 to give even more pronounced bump effect.
  * @property {Texture|null} normalDetailMap The detail (secondary) normal map of the material
  * (default is null). Will only be used if main (primary) normal map is non-null.
  * @property {number} normalDetailMapUv Detail (secondary) normal map UV channel.
  * @property {Vec2} normalDetailMapTiling Controls the 2D tiling of the detail (secondary) normal
  * map.
  * @property {Vec2} normalDetailMapOffset Controls the 2D offset of the detail (secondary) normal
  * map. Each component is between 0 and 1.
  * @property {number} normalDetailMapRotation Controls the 2D rotation (in degrees) of the detail
  * (secondary) normal map.
  * @property {number} normalDetailMapBumpiness The bumpiness of the material. This value scales the
  * assigned detail (secondary) normal map. It should be normally between 0 (no bump mapping) and 1
  * (full bump mapping), but can be set to e.g. 2 to give even more pronounced bump effect.
  * @property {Texture|null} heightMap The height map of the material (default is null). Used for a
  * view-dependent parallax effect. The texture must represent the height of the surface where
  * darker pixels are lower and lighter pixels are higher. It is recommended to use it together with
  * a normal map.
  * @property {number} heightMapUv Height map UV channel.
  * @property {string} heightMapChannel Color channel of the height map to use. Can be "r", "g", "b"
  * or "a".
  * @property {Vec2} heightMapTiling Controls the 2D tiling of the height map.
  * @property {Vec2} heightMapOffset Controls the 2D offset of the height map. Each component is
  * between 0 and 1.
  * @property {number} heightMapRotation Controls the 2D rotation (in degrees) of the height map.
  * @property {number} heightMapFactor Height map multiplier. Affects the strength of the parallax
  * effect.
  * @property {Texture|null} envAtlas The prefiltered environment lighting atlas (default is null).
  * This setting overrides cubeMap and sphereMap and will replace the scene lighting environment.
  * @property {Texture|null} cubeMap The cubic environment map of the material (default is null).
  * This setting overrides sphereMap and will replace the scene lighting environment.
  * @property {Texture|null} sphereMap The spherical environment map of the material (default is
  * null). This will replace the scene lighting environment.
  * @property {number} cubeMapProjection The type of projection applied to the cubeMap property:
  * - {@link CUBEPROJ_NONE}: The cube map is treated as if it is infinitely far away.
  * - {@link CUBEPROJ_BOX}: Box-projection based on a world space axis-aligned bounding box.
  * Defaults to {@link CUBEPROJ_NONE}.
  * @property {BoundingBox} cubeMapProjectionBox The world space axis-aligned bounding box defining
  * the box-projection used for the cubeMap property. Only used when cubeMapProjection is set to
  * {@link CUBEPROJ_BOX}.
  * @property {number} reflectivity Environment map intensity.
  * @property {Texture|null} lightMap A custom lightmap of the material (default is null). Lightmaps
  * are textures that contain pre-rendered lighting. Can be HDR.
  * @property {number} lightMapUv Lightmap UV channel
  * @property {string} lightMapChannel Color channels of the lightmap to use. Can be "r", "g", "b",
  * "a", "rgb" or any swizzled combination.
  * @property {Vec2} lightMapTiling Controls the 2D tiling of the lightmap.
  * @property {Vec2} lightMapOffset Controls the 2D offset of the lightmap. Each component is
  * between 0 and 1.
  * @property {number} lightMapRotation Controls the 2D rotation (in degrees) of the lightmap.
  * @property {boolean} lightVertexColor Use baked vertex lighting. If lightMap is set, it'll be
  * multiplied by vertex colors.
  * @property {string} lightVertexColorChannel Vertex color channels to use for baked lighting. Can
  * be "r", "g", "b", "a", "rgb" or any swizzled combination.
  * @property {boolean} ambientTint Enables scene ambient multiplication by material ambient color.
  * @property {Texture|null} aoMap Baked ambient occlusion (AO) map (default is null). Modulates
  * ambient color.
  * @property {number} aoMapUv AO map UV channel
  * @property {string} aoMapChannel Color channel of the AO map to use. Can be "r", "g", "b" or "a".
  * @property {Vec2} aoMapTiling Controls the 2D tiling of the AO map.
  * @property {Vec2} aoMapOffset Controls the 2D offset of the AO map. Each component is between 0
  * and 1.
  * @property {number} aoMapRotation Controls the 2D rotation (in degrees) of the AO map.
  * @property {boolean} aoVertexColor Use mesh vertex colors for AO. If aoMap is set, it'll be
  * multiplied by vertex colors.
  * @property {string} aoVertexColorChannel Vertex color channels to use for AO. Can be "r", "g",
  * "b" or "a".
  * @property {number} occludeSpecular Uses ambient occlusion to darken specular/reflection. It's a
  * hack, because real specular occlusion is view-dependent. However, it can be better than nothing.
  *
  * - {@link SPECOCC_NONE}: No specular occlusion
  * - {@link SPECOCC_AO}: Use AO directly to occlude specular.
  * - {@link SPECOCC_GLOSSDEPENDENT}: Modify AO based on material glossiness/view angle to occlude
  * specular.
  *
  * @property {number} occludeSpecularIntensity Controls visibility of specular occlusion.
  * @property {boolean} occludeDirect Tells if AO should darken directional lighting. Defaults to
  * false.
  * @property {boolean} conserveEnergy Defines how diffuse and specular components are combined when
  * Fresnel is on. It is recommended that you leave this option enabled, although you may want to
  * disable it in case when all reflection comes only from a few light sources, and you don't use an
  * environment map, therefore having mostly black reflection.
  * @property {number} shadingModel Defines the shading model.
  * - {@link SPECULAR_PHONG}: Phong without energy conservation. You should only use it as a
  * backwards compatibility with older projects.
  * - {@link SPECULAR_BLINN}: Energy-conserving Blinn-Phong.
  * @property {number} fresnelModel Defines the formula used for Fresnel effect.
  * As a side-effect, enabling any Fresnel model changes the way diffuse and reflection components
  * are combined. When Fresnel is off, legacy non energy-conserving combining is used. When it is
  * on, combining behavior is defined by conserveEnergy parameter.
  *
  * - {@link FRESNEL_NONE}: No Fresnel.
  * - {@link FRESNEL_SCHLICK}: Schlick's approximation of Fresnel (recommended). Parameterized by
  * specular color.
  *
  * @property {boolean} useFog Apply fogging (as configured in scene settings)
  * @property {boolean} useLighting Apply lighting
  * @property {boolean} useSkybox Apply scene skybox as prefiltered environment map
  * @property {boolean} useGammaTonemap Apply gamma correction and tonemapping (as configured in
  * scene settings).
  * @property {boolean} pixelSnap Align vertices to pixel coordinates when rendering. Useful for
  * pixel perfect 2D graphics.
  * @property {boolean} twoSidedLighting Calculate proper normals (and therefore lighting) on
  * backfaces.
  * @property {UpdateShaderCallback} onUpdateShader A custom function that will be called after all
  * shader generator properties are collected and before shader code is generated. This function
  * will receive an object with shader generator settings (based on current material and scene
  * properties), that you can change and then return. Returned value will be used instead. This is
  * mostly useful when rendering the same set of objects, but with different shader variations based
  * on the same material. For example, you may wish to render a depth or normal pass using textures
  * assigned to the material, a reflection pass with simpler shaders and so on. Properties of the
  * object passed into this function are:
  *
  * - pass: value of {@link Layer#shaderPass} of the Layer being rendered.
  * - chunks: Object containing custom shader chunks that will replace default ones.
  * - customFragmentShader: Completely replace fragment shader with this code.
  * - forceUv1: if UV1 (second set of texture coordinates) is required in the shader. Will be
  * declared as "vUv1" and passed to the fragment shader.
  * - fog: the type of fog being applied in the shader. See {@link Scene#fog} for the list of
  * possible values.
  * - gamma: the type of gamma correction being applied in the shader. See
  * {@link Scene#gammaCorrection} for the list of possible values.
  * - toneMap: the type of tone mapping being applied in the shader. See {@link Scene#toneMapping}
  * for the list of possible values.
  * - ambientTint: the value of {@link StandardMaterial#ambientTint}.
  * - conserveEnergy: the value of {@link StandardMaterial#conserveEnergy}.
  * - occludeSpecular: the value of {@link StandardMaterial#occludeSpecular}.
  * - occludeDirect: the value of {@link StandardMaterial#occludeDirect}.
  * - shadingModel: the value of {@link StandardMaterial#shadingModel}.
  * - fresnelModel: the value of {@link StandardMaterial#fresnelModel}.
  * - cubeMapProjection: the value of {@link StandardMaterial#cubeMapProjection}.
  * - useMetalness: the value of {@link StandardMaterial#useMetalness}.
  * - blendType: the value of {@link Material#blendType}.
  * - twoSidedLighting: the value of {@link Material#twoSidedLighting}.
  * - diffuseTint: defines if {@link StandardMaterial#diffuse} constant should affect diffuse color.
  * - specularTint: defines if {@link StandardMaterial#specular} constant should affect specular
  * color.
  * - metalnessTint: defines if {@link StandardMaterial#metalness} constant should affect metalness
  * value.
  * - glossTint: defines if {@link StandardMaterial#shininess} constant should affect glossiness
  * value.
  * - emissiveTint: defines if {@link StandardMaterial#emissive} constant should affect emission
  * value.
  * - opacityTint: defines if {@link StandardMaterial#opacity} constant should affect opacity value.
  * - occludeSpecularFloat: defines if {@link StandardMaterial#occludeSpecularIntensity} constant
  * should affect specular occlusion.
  * - alphaTest: enable alpha testing. See {@link Material#alphaTest}.
  * - alphaToCoverage: enable alpha to coverage. See {@link Material#alphaToCoverage}.
  * - opacityFadesSpecular: enable specular fade. See {@link Material#opacityFadesSpecular}.
  * - alphaFade: fade value. See {@link Material#alphaFade}.
  * - sphereMap: if {@link StandardMaterial#sphereMap} is used.
  * - cubeMap: if {@link StandardMaterial#cubeMap} is used.
  * - ambientSH: if ambient spherical harmonics are used. Ambient SH replace prefiltered cubemap
  * ambient on certain platform (mostly Android) for performance reasons.
  * - useSpecular: if any specular or reflections are needed at all.
  * - fixSeams: if cubemaps require seam fixing (see {@link Texture#options.fixCubemapSeams}).
  * - emissiveEncoding: how emissiveMap is encoded. This value is based on Texture#encoding.
  * - lightMapEncoding: how lightMap is encoded. This value is based on on Texture#encoding.
  * - packedNormal: if normal map contains X in RGB, Y in Alpha, and Z must be reconstructed.
  * - forceFragmentPrecision: Override fragment shader numeric precision. Can be "lowp", "mediump",
  * "highp" or null to use default.
  * - fastTbn: Use slightly cheaper normal mapping code (skip tangent space normalization). Can look
  * buggy sometimes.
  * - refraction: if refraction is used.
  * - skyboxIntensity: if reflected skybox intensity should be modulated.
  * - useCubeMapRotation: if cube map rotation is enabled.
  * - useInstancing: if hardware instancing compatible shader should be generated. Transform is read
  * from per-instance {@link VertexBuffer} instead of shader's uniforms.
  * - useMorphPosition: if morphing code should be generated to morph positions.
  * - useMorphNormal: if morphing code should be generated to morph normals.
  * - reflectionSource: one of "envAtlasHQ", "envAtlas", "cubeMap", "sphereMap"
  * - reflectionEncoding: one of null, "rgbm", "rgbe", "linear", "srgb"
  * - ambientSource: one of "ambientSH", "envAtlas", "constant"
  * - ambientEncoding: one of null, "rgbm", "rgbe", "linear", "srgb"
  * @augments Material
  */
@JSGlobal("pc.StandardMaterial")
@js.native
open class StandardMaterial ()
  extends typings.playcanvas.mod.StandardMaterial
object StandardMaterial {
  
  @JSGlobal("pc.StandardMaterial")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("pc.StandardMaterial.CUBEMAP_PARAMETERS")
  @js.native
  def CUBEMAP_PARAMETERS: js.Array[Any] = js.native
  inline def CUBEMAP_PARAMETERS_=(x: js.Array[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CUBEMAP_PARAMETERS")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("pc.StandardMaterial.TEXTURE_PARAMETERS")
  @js.native
  def TEXTURE_PARAMETERS: js.Array[Any] = js.native
  inline def TEXTURE_PARAMETERS_=(x: js.Array[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TEXTURE_PARAMETERS")(x.asInstanceOf[js.Any])
}
