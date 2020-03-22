package typings.pixiJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Class controls cache for UV mapping from Texture normal space to BaseTexture normal space.
  *
  * @class
  * @memberof PIXI
  */
@JSImport("pixi.js", "MeshBatchUvs")
@js.native
class MeshBatchUvs protected ()
  extends typings.pixiJs.PIXI.MeshBatchUvs {
  def this(uvBuffer: typings.pixiJs.PIXI.Buffer, uvMatrix: typings.pixiJs.PIXI.TextureMatrix) = this()
}

