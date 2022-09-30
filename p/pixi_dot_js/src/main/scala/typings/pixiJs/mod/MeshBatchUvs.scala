package typings.pixiJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pixi.js", "MeshBatchUvs")
@js.native
open class MeshBatchUvs protected ()
  extends typings.pixiMesh.mod.MeshBatchUvs {
  /**
    * @param uvBuffer - Buffer with normalized uv's
    * @param uvMatrix - Material UV matrix
    */
  def this(uvBuffer: typings.pixiCore.mod.Buffer, uvMatrix: typings.pixiCore.mod.TextureMatrix) = this()
}
