package typings.pixiJs.mod

import typings.pixiMesh.mod.IMeshMaterialOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pixi.js", "MeshMaterial")
@js.native
open class MeshMaterial protected ()
  extends typings.pixiMesh.mod.MeshMaterial {
  /**
    * @param uSampler - Texture that material uses to render.
    * @param options - Additional options
    * @param {number} [options.alpha=1] - Default alpha.
    * @param {number} [options.tint=0xFFFFFF] - Default tint.
    * @param {string} [options.pluginName='batch'] - Renderer plugin for batching.
    * @param {PIXI.Program} [options.program=0xFFFFFF] - Custom program.
    * @param {object} [options.uniforms] - Custom uniforms.
    */
  def this(uSampler: typings.pixiCore.mod.Texture[typings.pixiCore.mod.Resource]) = this()
  def this(
    uSampler: typings.pixiCore.mod.Texture[typings.pixiCore.mod.Resource],
    options: IMeshMaterialOptions
  ) = this()
}
