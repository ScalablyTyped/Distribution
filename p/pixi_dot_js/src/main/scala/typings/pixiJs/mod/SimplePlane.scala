package typings.pixiJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pixi.js", "SimplePlane")
@js.native
open class SimplePlane protected ()
  extends typings.pixiMeshExtras.mod.SimplePlane {
  /**
    * @param texture - The texture to use on the SimplePlane.
    * @param verticesX - The number of vertices in the x-axis
    * @param verticesY - The number of vertices in the y-axis
    */
  def this(texture: typings.pixiCore.mod.Texture[typings.pixiCore.libTexturesResourcesResourceMod.Resource]) = this()
  def this(
    texture: typings.pixiCore.mod.Texture[typings.pixiCore.libTexturesResourcesResourceMod.Resource],
    verticesX: Double
  ) = this()
  def this(
    texture: typings.pixiCore.mod.Texture[typings.pixiCore.libTexturesResourcesResourceMod.Resource],
    verticesX: Double,
    verticesY: Double
  ) = this()
  def this(
    texture: typings.pixiCore.mod.Texture[typings.pixiCore.libTexturesResourcesResourceMod.Resource],
    verticesX: Unit,
    verticesY: Double
  ) = this()
}
