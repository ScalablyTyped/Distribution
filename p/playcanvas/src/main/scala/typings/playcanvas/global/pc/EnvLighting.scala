package typings.playcanvas.global.pc

import typings.playcanvas.anon.LegacyAmbient
import typings.playcanvas.anon.NumAmbientSamples
import typings.playcanvas.anon.Size
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Helper functions to support prefiltering lighting data.
  *
  * @ignore
  */
@JSGlobal("pc.EnvLighting")
@js.native
open class EnvLighting ()
  extends typings.playcanvas.mod.EnvLighting
object EnvLighting {
  
  @JSGlobal("pc.EnvLighting")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Generate the environment lighting atlas containing prefiltered reflections and ambient.
    *
    * @param {Texture} source - The source lighting texture, generated by generateLightingSource.
    * @param {object} [options] - Specify prefilter options.
    * @param {Texture} [options.target] - The target texture. If one is not provided then a
    * new texture will be created and returned.
    * @param {number} [options.size] - Size of the target texture to create. Only used if
    * target isn't specified. Defaults to 512.
    * @param {number} [options.numReflectionSamples] - Number of samples to use when generating
    * rough reflections. Defaults to 1024.
    * @param {number} [options.numAmbientSamples] - Number of samples to use when generating ambient
    * lighting. Defaults to 2048.
    * @returns {Texture} The resulting atlas
    */
  /* static member */
  inline def generateAtlas(source: typings.playcanvas.mod.Texture): typings.playcanvas.mod.Texture = ^.asInstanceOf[js.Dynamic].applyDynamic("generateAtlas")(source.asInstanceOf[js.Any]).asInstanceOf[typings.playcanvas.mod.Texture]
  inline def generateAtlas(source: typings.playcanvas.mod.Texture, options: NumAmbientSamples): typings.playcanvas.mod.Texture = (^.asInstanceOf[js.Dynamic].applyDynamic("generateAtlas")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.playcanvas.mod.Texture]
  
  /**
    * Create a texture in the format needed to precalculate lighting data.
    *
    * @param {Texture} source - The source texture. This is either a 2d texture in equirect format
    * or a cubemap.
    * @param {object} [options] - Specify generation options.
    * @param {Texture} [options.target] - The target texture. If one is not provided then a
    * new texture will be created and returned.
    * @param {number} [options.size] - Size of the lighting source cubemap texture. Only used
    * if target isn't specified. Defaults to 128.
    * @returns {Texture} The resulting cubemap.
    */
  /* static member */
  inline def generateLightingSource(source: typings.playcanvas.mod.Texture): typings.playcanvas.mod.Texture = ^.asInstanceOf[js.Dynamic].applyDynamic("generateLightingSource")(source.asInstanceOf[js.Any]).asInstanceOf[typings.playcanvas.mod.Texture]
  inline def generateLightingSource(source: typings.playcanvas.mod.Texture, options: Size): typings.playcanvas.mod.Texture = (^.asInstanceOf[js.Dynamic].applyDynamic("generateLightingSource")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.playcanvas.mod.Texture]
  
  /**
    * Generate the environment lighting atlas from prefiltered cubemap data.
    *
    * @param {Texture[]} sources - Array of 6 prefiltered textures.
    * @param {object} [options] - The options object
    * @param {Texture} [options.target] - The target texture. If one is not provided then a
    * new texture will be created and returned.
    * @param {number} [options.size] - Size of the target texture to create. Only used if
    * target isn't specified. Defaults to 512.
    * @param {boolean} [options.legacyAmbient] - Enable generating legacy ambient lighting.
    * Default is false.
    * @param {number} [options.numSamples] - Number of samples to use when generating ambient
    * lighting. Default is 2048.
    * @returns {Texture} The resulting atlas texture.
    */
  /* static member */
  inline def generatePrefilteredAtlas(sources: js.Array[typings.playcanvas.mod.Texture]): typings.playcanvas.mod.Texture = ^.asInstanceOf[js.Dynamic].applyDynamic("generatePrefilteredAtlas")(sources.asInstanceOf[js.Any]).asInstanceOf[typings.playcanvas.mod.Texture]
  inline def generatePrefilteredAtlas(sources: js.Array[typings.playcanvas.mod.Texture], options: LegacyAmbient): typings.playcanvas.mod.Texture = (^.asInstanceOf[js.Dynamic].applyDynamic("generatePrefilteredAtlas")(sources.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.playcanvas.mod.Texture]
  
  /**
    * Generate a skybox cubemap in the correct pixel format from the source texture.
    *
    * @param {Texture} source - The source texture. This is either a 2d texture in equirect format
    * or a cubemap.
    * @param {number} [size] - Size of the resulting texture. Otherwise use automatic sizing.
    * @returns {Texture} The resulting cubemap.
    */
  /* static member */
  inline def generateSkyboxCubemap(source: typings.playcanvas.mod.Texture): typings.playcanvas.mod.Texture = ^.asInstanceOf[js.Dynamic].applyDynamic("generateSkyboxCubemap")(source.asInstanceOf[js.Any]).asInstanceOf[typings.playcanvas.mod.Texture]
  inline def generateSkyboxCubemap(source: typings.playcanvas.mod.Texture, size: Double): typings.playcanvas.mod.Texture = (^.asInstanceOf[js.Dynamic].applyDynamic("generateSkyboxCubemap")(source.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[typings.playcanvas.mod.Texture]
}
