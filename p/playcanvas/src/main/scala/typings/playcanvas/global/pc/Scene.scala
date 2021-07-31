package typings.playcanvas.global.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Creates a new Scene.
  * @property ambientLight - The color of the scene's ambient light. Defaults
  * to black (0, 0, 0).
  * @property fog - The type of fog used by the scene. Can be:
  *
  * * {@link pc.FOG_NONE}
  * * {@link pc.FOG_LINEAR}
  * * {@link pc.FOG_EXP}
  * * {@link pc.FOG_EXP2}
  *
  * Defaults to pc.FOG_NONE.
  * @property fogColor - The color of the fog (if enabled). Defaults to black
  * (0, 0, 0).
  * @property fogDensity - The density of the fog (if enabled). This property
  * is only valid if the fog property is set to pc.FOG_EXP or pc.FOG_EXP2. Defaults to 0.
  * @property fogEnd - The distance from the viewpoint where linear fog reaches
  * its maximum. This property is only valid if the fog property is set to pc.FOG_LINEAR.
  * Defaults to 1000.
  * @property fogStart - The distance from the viewpoint where linear fog begins.
  * This property is only valid if the fog property is set to pc.FOG_LINEAR. Defaults to 1.
  * @property gammaCorrection - The gamma correction to apply when rendering the
  * scene. Can be:
  *
  * * {@link pc.GAMMA_NONE}
  * * {@link pc.GAMMA_SRGB}
  *
  * Defaults to pc.GAMMA_NONE.
  * @property toneMapping - The tonemapping transform to apply when writing
  * fragments to the frame buffer. Can be:
  *
  * * {@link pc.TONEMAP_LINEAR}
  * * {@link pc.TONEMAP_FILMIC}
  * * {@link pc.TONEMAP_HEJL}
  * * {@link pc.TONEMAP_ACES}
  *
  * Defaults to pc.TONEMAP_LINEAR.
  * @property exposure - The exposure value tweaks the overall brightness of
  * the scene. Defaults to 1.
  * @property skybox - The base cubemap texture used as the scene's skybox, if mip level is 0. Defaults to null.
  * @property skyboxPrefiltered128 - The prefiltered cubemap texture (size 128x128) used as the scene's skybox, if mip level 1. Defaults to null.
  * @property skyboxPrefiltered64 - The prefiltered cubemap texture (size 64x64) used as the scene's skybox, if mip level 2. Defaults to null.
  * @property skyboxPrefiltered32 - The prefiltered cubemap texture (size 32x32) used as the scene's skybox, if mip level 3. Defaults to null.
  * @property skyboxPrefiltered16 - The prefiltered cubemap texture (size 16x16) used as the scene's skybox, if mip level 4. Defaults to null.
  * @property skyboxPrefiltered8 - The prefiltered cubemap texture (size 8x8) used as the scene's skybox, if mip level 5. Defaults to null.
  * @property skyboxPrefiltered4 - The prefiltered cubemap texture (size 4x4) used as the scene's skybox, if mip level 6. Defaults to null.
  * @property skyboxIntensity - Multiplier for skybox intensity. Defaults to 1.
  * @property skyboxRotation - The rotation of the skybox to be displayed. Defaults to {@link pc.Quat.IDENTITY}.
  * @property skyboxMip - The mip level of the skybox to be displayed. Only valid
  * for prefiltered cubemap skyboxes. Defaults to 0 (base level).
  * @property lightmapSizeMultiplier - The lightmap resolution multiplier.
  * Defaults to 1.
  * @property lightmapMaxResolution - The maximum lightmap resolution. Defaults to
  * 2048.
  * @property lightmapMode - The lightmap baking mode. Can be:
  *
  * * {@link pc.BAKE_COLOR}: single color lightmap
  * * {@link pc.BAKE_COLORDIR}: single color lightmap + dominant light direction (used for
  * bump/specular). Only lights with bakeDir=true will be used for generating the dominant
  * light direction.
  *
  * Defaults to pc.BAKE_COLORDIR.
  * @property layers - A {@link pc.LayerComposition} that defines
  * rendering order of this scene.
  * @property defaultMaterial - The default material used in case no
  * other material is available.
  * @property root - The root entity of the scene, which is usually the only
  * child to the Application root entity.
  */
@JSGlobal("pc.Scene")
@js.native
class Scene ()
  extends StObject
     with typings.playcanvas.pc.Scene
